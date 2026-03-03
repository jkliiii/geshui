package h3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.lt.app.App;
import java.util.ArrayList;
import java.util.Objects;
import n3.k;
import z0.a;

/* compiled from: Filer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p implements a.d {

    /* renamed from: ˈ, reason: contains not printable characters */
    private static p f8332;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final n3.d f8333;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f8334;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Intent f8335;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final a f8336;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final ArrayList<Integer> f8337 = new ArrayList<>(2);

    /* renamed from: ˆ, reason: contains not printable characters */
    private z0.a f8338;

    /* compiled from: Filer.java */
    public interface a {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo8981(Uri[] uriArr);
    }

    private p(n3.d dVar, int i5, Intent intent, a aVar) {
        this.f8333 = dVar;
        this.f8334 = i5;
        this.f8335 = intent;
        this.f8336 = aVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m8970() {
        if (!App.m7815(87, true)) {
            m8975(null);
            n3.z1.m10909(this.f8333, "没有选购录音插件");
        } else {
            a aVar = this.f8336;
            Objects.requireNonNull(aVar);
            new n3.k(new o(aVar)).m10791(this.f8333, k.b.Audio);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m8971() {
        a aVar = this.f8336;
        Objects.requireNonNull(aVar);
        new n3.k(new o(aVar)).m10791(this.f8333, k.b.Image);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m8972() {
        a aVar = this.f8336;
        Objects.requireNonNull(aVar);
        new n3.k(new o(aVar)).m10791(this.f8333, k.b.Video);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m8973() {
        boolean m10923 = n3.z1.m10923(this.f8333);
        if (n3.z1.m10927() || n3.z1.m10933() || m10923) {
            final SharedPreferences m7841 = App.m7835().m7841();
            final String str = "file_choose_agreed";
            if (!m7841.getBoolean("file_choose_agreed", false)) {
                if (m10923) {
                    this.f8333.m10766(new n3.e() { // from class: h3.m
                        @Override // n3.e
                        /* renamed from: ʻ */
                        public final void mo8748(Object obj, Object obj2) {
                            this.f8303.m8976(m7841, str, (Boolean) obj, (Boolean) obj2);
                        }
                    }, new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
                    return;
                } else {
                    this.f8333.m10769("android.permission.READ_EXTERNAL_STORAGE", new n3.f() { // from class: h3.n
                        @Override // n3.f
                        /* renamed from: ʻ */
                        public final void mo8742(Object obj) {
                            this.f8314.m8977(m7841, str, (Boolean) obj);
                        }
                    });
                    return;
                }
            }
        }
        m8974();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m8974() {
        a aVar = this.f8336;
        Objects.requireNonNull(aVar);
        n3.k kVar = new n3.k(new o(aVar));
        Intent intent = this.f8335;
        if (intent != null) {
            kVar.m10793(this.f8333, intent);
        } else {
            kVar.m10792(this.f8333, k.b.Image);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m8975(Uri[] uriArr) {
        a aVar = this.f8336;
        if (aVar != null) {
            aVar.mo8981(uriArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public /* synthetic */ void m8976(SharedPreferences sharedPreferences, String str, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            sharedPreferences.edit().putBoolean(str, true).apply();
            m8974();
        } else {
            m8975(null);
            n3.z1.m10909(this.f8333, "缺少相册权限");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public /* synthetic */ void m8977(SharedPreferences sharedPreferences, String str, Boolean bool) {
        if (!bool.booleanValue()) {
            m8975(null);
        } else {
            sharedPreferences.edit().putBoolean(str, true).apply();
            m8974();
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m8978(int i5) {
        f8332 = null;
        int intValue = this.f8337.get(i5).intValue();
        if (intValue == 1) {
            m8973();
            return;
        }
        if (intValue == 2) {
            m8971();
        } else if (intValue == 4) {
            m8970();
        } else {
            if (intValue != 8) {
                return;
            }
            m8972();
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m8979() {
        ArrayList arrayList = new ArrayList(2);
        this.f8337.clear();
        if ((this.f8334 & 2) == 2) {
            arrayList.add(2131820636);
            this.f8337.add(2);
        }
        if ((this.f8334 & 8) == 8) {
            arrayList.add(2131820638);
            this.f8337.add(8);
        }
        if ((this.f8334 & 4) == 4) {
            arrayList.add(2131820637);
            this.f8337.add(4);
        }
        if ((this.f8334 & 1) == 1 || arrayList.isEmpty()) {
            arrayList.add(2131820639);
            this.f8337.add(1);
        }
        if (this.f8337.size() == 1) {
            m8978(0);
            return;
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = this.f8333.getString(((Integer) arrayList.get(i5)).intValue());
        }
        n3.d dVar = this.f8333;
        this.f8338 = z0.a.m13112(dVar, dVar.m4043()).m13128(2131820604).m13132(strArr).m13130(true).m13131(this).m13133();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static synchronized void m8980(n3.d dVar, int i5, Intent intent, a aVar) {
        synchronized (p.class) {
            if (f8332 != null) {
                return;
            }
            p pVar = new p(dVar, i5, intent, aVar);
            f8332 = pVar;
            pVar.m8979();
        }
    }

    @Override // z0.a.d
    /* renamed from: ʻ */
    public void mo8945(z0.a aVar, boolean z5) {
        f8332 = null;
        if (z5) {
            m8975(null);
        }
    }

    @Override // z0.a.d
    /* renamed from: ʼ */
    public void mo8946(z0.a aVar, int i5) {
        m8978(i5);
    }
}
