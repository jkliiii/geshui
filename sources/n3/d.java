package n3;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.lt.plugin.IGdtAction;
import java.util.Iterator;
import java.util.List;
import n3.x0;

/* compiled from: ActivityBase.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class d extends androidx.appcompat.app.c implements x0.a {

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private b f9720;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private a f9721;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private List<s<d>> f9722;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private c.b<c.a> f9723;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private List<h0> f9724;

    /* renamed from: ــ, reason: contains not printable characters */
    private e<Boolean, Boolean> f9727;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private k1 f9719 = null;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private final c.c<Intent> f9726 = m380(new d.c(), new c.b() { // from class: n3.a
        @Override // c.b
        /* renamed from: ʻ */
        public final void mo4257(Object obj) {
            this.f9691.m10760((c.a) obj);
        }
    });

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public boolean f9725 = true;

    /* compiled from: ActivityBase.java */
    public interface a {
        /* renamed from: ʻ */
        void mo7987(int i5, int i6, Intent intent);
    }

    /* compiled from: ActivityBase.java */
    public interface b {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo10771(boolean z5);
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private void m10759(boolean z5, boolean z6) {
        e<Boolean, Boolean> eVar = this.f9727;
        if (eVar != null) {
            this.f9727 = null;
            eVar.mo8748(Boolean.valueOf(z5), Boolean.valueOf(z6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻـ, reason: contains not printable characters */
    public /* synthetic */ void m10760(c.a aVar) {
        c.b<c.a> bVar = this.f9723;
        if (bVar != null) {
            bVar.mo4257(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻٴ, reason: contains not printable characters */
    public /* synthetic */ void m10761(String[] strArr, int i5, Boolean bool) {
        if (bool.booleanValue()) {
            m10764(strArr, i5);
        } else {
            m10759(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public static /* synthetic */ void m10762(b bVar, Boolean bool, Boolean bool2) {
        if (bVar != null) {
            bVar.mo10771(bool.booleanValue());
        }
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    private int m10763(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                str.hashCode();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        return h1.f9751;
                    case "android.permission.ACCESS_FINE_LOCATION":
                    case "android.permission.ACCESS_COARSE_LOCATION":
                        return h1.f9748;
                    case "android.permission.READ_EXTERNAL_STORAGE":
                    case "android.permission.READ_MEDIA_IMAGES":
                    case "android.permission.READ_MEDIA_AUDIO":
                    case "android.permission.READ_MEDIA_VIDEO":
                        return h1.f9753;
                    case "android.permission.READ_PHONE_STATE":
                        return h1.f9752;
                    case "android.permission.WRITE_CONTACTS":
                    case "android.permission.READ_CONTACTS":
                        return h1.f9747;
                    case "android.permission.CAMERA":
                        return h1.f9746;
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        return h1.f9754;
                    case "android.permission.RECORD_AUDIO":
                        return h1.f9750;
                    case "android.permission.ACCESS_BACKGROUND_LOCATION":
                        return h1.f9749;
                    default:
                }
            }
        }
        return h1.f9756;
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    private void m10764(String[] strArr, int i5) {
        x0.b bVar = new x0.b(this, 54322, strArr);
        bVar.f10012 = i5;
        x0.m10865(bVar);
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    private void m10765(Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("k_LaunchedBroadCast_Action");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        Intent intent2 = new Intent(stringExtra);
        String stringExtra2 = intent.getStringExtra("k_LaunchedBroadCast_Key");
        if (!TextUtils.isEmpty(stringExtra2)) {
            intent2.putExtra(stringExtra2, intent.getStringExtra("k_LaunchedBroadCast_Value"));
        }
        z1.m10898(this, intent2);
    }

    @Override // androidx.fragment.app.f, androidx.activity.h, android.app.Activity
    protected void onActivityResult(int i5, int i6, Intent intent) {
        a aVar = this.f9721;
        if (aVar != null) {
            aVar.mo7987(i5, i6, intent);
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10765(getIntent());
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        List<h0> list = this.f9724;
        if (list != null) {
            Iterator<h0> it = list.iterator();
            while (it.hasNext()) {
                it.next().m10776(this);
            }
            this.f9724.clear();
            this.f9724 = null;
        }
        List<s<d>> list2 = this.f9722;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<s<d>> it2 = this.f9722.iterator();
            while (it2.hasNext()) {
                it2.next().m10849(this);
            }
            this.f9722.clear();
            this.f9722 = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.f, androidx.activity.h, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m10765(intent);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        super.onPause();
        List<h0> list = this.f9724;
        if (list != null) {
            Iterator<h0> it = list.iterator();
            while (it.hasNext()) {
                it.next().m10777(this);
            }
        }
    }

    @Override // androidx.fragment.app.f, androidx.activity.h, android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i5, strArr, iArr);
        k1 k1Var = this.f9719;
        if (k1Var != null && k1Var.m10800()) {
            this.f9719.m10799();
        }
        this.f9719 = null;
        boolean z5 = false;
        switch (i5) {
            case 54321:
                if (this.f9720 != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= strArr.length) {
                            z5 = true;
                        } else if (iArr[i6] == 0) {
                            i6++;
                        }
                    }
                    this.f9720.mo10771(z5);
                    this.f9720 = null;
                    break;
                }
                break;
            case 54322:
                int length = strArr.length;
                boolean z6 = true;
                boolean z7 = false;
                for (int i7 = 0; i7 < length; i7++) {
                    String str = strArr[i7];
                    if ((!("android.permission.READ_EXTERNAL_STORAGE".equals(str) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) || Build.VERSION.SDK_INT <= 32 || getApplicationInfo().targetSdkVersion <= 32) && iArr[i7] == -1) {
                        if (androidx.core.app.b.m1933(this, str)) {
                            z6 = false;
                        } else {
                            z6 = false;
                            z7 = true;
                        }
                    }
                }
                m10759(z6, z7);
                break;
        }
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        IGdtAction m10601;
        super.onResume();
        List<h0> list = this.f9724;
        if (list != null) {
            Iterator<h0> it = list.iterator();
            while (it.hasNext()) {
                it.next().m10775(this);
            }
        }
        if (mo7864(120, true) && getClass().getName().endsWith(".MainActivity") && (m10601 = a1.m10601()) != null) {
            m10601.m8023();
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        List<h0> list = this.f9724;
        if (list != null) {
            Iterator<h0> it = list.iterator();
            while (it.hasNext()) {
                it.next().m10774(this);
            }
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        List<h0> list = this.f9724;
        if (list != null) {
            Iterator<h0> it = list.iterator();
            while (it.hasNext()) {
                it.next().m10778(this);
            }
        }
        super.onStop();
    }

    /* renamed from: ʻˎ */
    public WebView mo7924() {
        return null;
    }

    /* renamed from: ʻˏ */
    public View mo7925() {
        return null;
    }

    /* renamed from: ʻˑ */
    public ViewGroup mo7926() {
        return null;
    }

    /* renamed from: ʻי */
    public boolean mo7864(int i5, boolean z5) {
        return a1.m10624(i5);
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    public void m10766(e<Boolean, Boolean> eVar, final String[] strArr) {
        ViewGroup mo7926;
        if (strArr.length == 0) {
            if (eVar != null) {
                eVar.mo8748(Boolean.TRUE, Boolean.FALSE);
                return;
            }
            return;
        }
        final int i5 = 0;
        if ("android.permission.POST_NOTIFICATIONS".equals(strArr[0]) && (getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33)) {
            boolean m1983 = androidx.core.app.r.m1982(this).m1983();
            if (eVar != null) {
                eVar.mo8748(Boolean.valueOf(m1983), Boolean.TRUE);
                return;
            }
            return;
        }
        if (x0.m10861(this, strArr)) {
            if (eVar != null) {
                eVar.mo8748(Boolean.TRUE, Boolean.FALSE);
                return;
            }
            return;
        }
        this.f9727 = eVar;
        int m10763 = m10763(strArr);
        if (!z1.m10935() || m10763 == 0 || (mo7926 = mo7926()) == null) {
            i5 = m10763;
        } else {
            k1 k1Var = this.f9719;
            if (k1Var != null && k1Var.m10800()) {
                this.f9719.m10799();
            }
            String string = getString(h1.f9755);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string + "\n" + getString(m10763));
            valueOf.setSpan(new RelativeSizeSpan(1.2f), 0, string.length(), 33);
            valueOf.setSpan(new StyleSpan(1), 0, string.length(), 33);
            this.f9719 = k1.m10797(1, mo7926, valueOf, -2).m10803(5).m10802(-16777216).m10798(-1).m10801();
        }
        if (x0.m10866(this, strArr)) {
            m10764(strArr, i5);
        } else {
            x0.m10867(this, i5, new f() { // from class: n3.b
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f9709.m10761(strArr, i5, (Boolean) obj);
                }
            });
        }
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    public void m10767(final b bVar, int i5, String... strArr) {
        m10766(new e() { // from class: n3.c
            @Override // n3.e
            /* renamed from: ʻ */
            public final void mo8748(Object obj, Object obj2) {
                d.m10762(bVar, (Boolean) obj, (Boolean) obj2);
            }
        }, strArr);
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public void m10768(a aVar) {
        this.f9721 = aVar;
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public void m10769(String str, f<Boolean> fVar) {
        x0.m10867(this, m10763(new String[]{str}), fVar);
    }

    @Override // n3.x0.a
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo10770(int i5) {
        m10759(false, false);
    }
}
