package com.lt.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lt.app.App;
import com.lt.app.a;
import g3.a0;
import h3.f;
import h3.s1;
import h3.u2;
import h3.v2;
import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import l3.g;
import l3.q;
import l3.r;
import l3.s;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.a1;
import n3.a2;
import n3.d0;
import n3.q0;
import n3.r;
import n3.z1;
import org.json.JSONObject;

/* loaded from: E:\78999\cookie_5123796.dex */
public class App extends l0.b implements a.InterfaceC0094a {

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static App f6650;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f6653;

    /* renamed from: ˈ, reason: contains not printable characters */
    private String f6654;

    /* renamed from: ˉ, reason: contains not printable characters */
    private String f6655;

    /* renamed from: ˊ, reason: contains not printable characters */
    private long f6656;

    /* renamed from: ˋ, reason: contains not printable characters */
    private long f6657;

    /* renamed from: ˎ, reason: contains not printable characters */
    private long f6658;

    /* renamed from: ˏ, reason: contains not printable characters */
    private long f6659;

    /* renamed from: ˑ, reason: contains not printable characters */
    private long f6660;

    /* renamed from: י, reason: contains not printable characters */
    private long f6661;

    /* renamed from: ٴ, reason: contains not printable characters */
    private ConnectivityManager f6663;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final com.lt.app.a f6651 = new com.lt.app.a();

    /* renamed from: ʿ, reason: contains not printable characters */
    private String f6652 = " LT-APP/48";

    /* renamed from: ـ, reason: contains not printable characters */
    private l3.a f6662 = null;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f6664 = true;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f6665 = false;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private String f6666 = null;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private String f6667 = null;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private String f6668 = null;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private String f6669 = null;

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            App.this.f6664 = true;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            App.this.f6664 = false;
        }
    }

    class b extends TypeToken<s<q>> {
        b() {
        }
    }

    class c extends TypeToken<s<r>> {
        c() {
        }
    }

    class d extends TypeToken<s<String>> {
        d() {
        }
    }

    public interface e {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo7860(l3.a aVar);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static l3.a m7803() {
        App app = f6650;
        if (app == null) {
            return null;
        }
        app.m7825();
        return f6650.f6662;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private String m7804(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b6 : bytes) {
            String hexString = Integer.toHexString((b6 ^ (-1)) & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private void m7805(final e eVar, final boolean z5, final boolean z6) {
        String str = null;
        if (z6) {
            int i5 = Calendar.getInstance().get(6);
            int i6 = m7841().getInt("k_out", 0);
            boolean z7 = true;
            if (i6 < 1) {
                i5++;
            } else if (Math.abs(i5 - i6) >= 3) {
                str = a1.m10603(this, "ga/");
            } else {
                i5 = i6;
                z7 = false;
            }
            if (z7) {
                m7841().edit().putInt("k_out", i5).apply();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = a1.m10604(this, "ga/");
        }
        if (TextUtils.isEmpty(str)) {
            if (eVar != null && !z5) {
                eVar.mo7860(this.f6662);
            }
            if (z6) {
                return;
            }
            m7806();
            return;
        }
        Point point = new Point(1080, 1920);
        WindowManager windowManager = (WindowManager) getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealSize(point);
        }
        String property = System.getProperty("http.agent");
        if (TextUtils.isEmpty(property)) {
            property = "Java " + System.getProperty("java.version");
        }
        String str2 = property + " LT-APP/Android " + Build.VERSION.SDK_INT + "/" + point.x + "x" + point.y;
        int indexOf = str.indexOf("?");
        n3.r.m10827(str.substring(0, indexOf), n3.r.m10817().m10839("q", m7804(str.substring(indexOf + 1))).m10839("d", m7843()).m10839("_a", "ga/")).m10834(str2).m10829(new r.c() { // from class: g3.i
            @Override // n3.r.c
            /* renamed from: ʻ */
            public final void mo8741(Object obj, Exception exc) {
                this.f7891.m7833(eVar, z5, z6, (byte[]) obj, exc);
            }
        });
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private void m7806() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: g3.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f7877.m7834();
            }
        }, 2000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ʻˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] m7807() {
        /*
            r4 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r4.getAssets()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1f
            java.lang.String r2 = "y.x"
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1f
            int r2 = r1.available()     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L2a
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L2a
            r1.read(r2)     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L2a
            r1.close()     // Catch: java.lang.Exception -> L17
        L17:
            return r2
        L18:
            r2 = move-exception
            goto L21
        L1a:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L2b
        L1f:
            r2 = move-exception
            r1 = r0
        L21:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L29
            r1.close()     // Catch: java.lang.Exception -> L29
        L29:
            return r0
        L2a:
            r0 = move-exception
        L2b:
            if (r1 == 0) goto L30
            r1.close()     // Catch: java.lang.Exception -> L30
        L30:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lt.app.App.m7807():byte[]");
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m7809(final e eVar) {
        boolean z5;
        l3.a aVar = this.f6662;
        if (aVar == null || !aVar.isOk) {
            z5 = false;
        } else {
            m7822(null, eVar, false);
            z5 = true;
        }
        if (z5) {
            a1.m10663(this, new Runnable() { // from class: g3.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7887.m7832(eVar);
                }
            });
        } else {
            m7805(eVar, false, false);
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static String m7812(int i5) {
        App app = f6650;
        return app != null ? app.getString(i5) : BuildConfig.FLAVOR;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static boolean m7815(int i5, boolean z5) {
        if (i5 < 64) {
            long j5 = 1 << i5;
            return (m7835().f6656 & j5) == j5;
        }
        if (i5 < 128) {
            long j6 = 1 << (i5 - 64);
            return (m7835().f6657 & j6) == j6;
        }
        if (i5 < 192) {
            long j7 = 1 << (i5 - 128);
            return (m7835().f6658 & j7) == j7;
        }
        if (i5 < 256) {
            long j8 = 1 << (i5 - 192);
            return (m7835().f6659 & j8) == j8;
        }
        if (i5 < 320) {
            long j9 = 1 << (i5 - 256);
            return (m7835().f6660 & j9) == j9;
        }
        long j10 = 1 << (i5 - 320);
        return (m7835().f6661 & j10) == j10;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m7817() {
        g gVar;
        l3.a aVar = this.f6662;
        if (aVar == null || (gVar = aVar.sp_skip) == null || gVar.re_ad < 0 || this.f6651.m7954() < this.f6662.sp_skip.re_ad) {
            return;
        }
        Activity m7953 = this.f6651.m7953();
        if (m7953 instanceof n3.d) {
            com.lt.app.d.m8012((n3.d) m7953, this.f6662, true);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m7820(boolean z5) {
        Intent intent = new Intent("ym_app_state_changed");
        intent.putExtra("ym_app_enter_bg", z5);
        z1.m10898(this, intent);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static boolean m7821() {
        l3.a aVar;
        App app = f6650;
        return app == null || (aVar = app.f6662) == null || aVar.pd < 1;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m7822(String str, e eVar, boolean z5) {
        l3.a aVar;
        if (!TextUtils.isEmpty(str)) {
            this.f6662 = (l3.a) new Gson().fromJson(str, l3.a.class);
        }
        if (this.f6662 != null) {
            if (!TextUtils.isEmpty(BuildConfig.FLAVOR)) {
                this.f6662.url = new String(a0.m8732(BuildConfig.FLAVOR));
            }
            this.f6662.m9727();
            l3.a aVar2 = this.f6662;
            this.f6656 = aVar2.f12859x;
            this.f6657 = aVar2.f12860x2;
            this.f6658 = aVar2.f12861x3;
            this.f6659 = aVar2.f12862x4;
            this.f6660 = aVar2.x5;
            this.f6661 = aVar2.x6;
            m7841().edit().putLong("k_x", this.f6662.f12859x).putLong("k_x2", this.f6662.f12860x2).putLong("k_x3", this.f6662.f12861x3).putLong("k_x4", this.f6662.f12862x4).putLong("k_x5", this.f6662.x5).putLong("k_x6", this.f6662.x6).apply();
        }
        s1.m9037();
        if (eVar != null) {
            if (z5 && ((aVar = this.f6662) == null || aVar.isOk)) {
                return;
            }
            eVar.mo7860(this.f6662);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m7823() {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return;
            }
            Certificate generateCertificate = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()));
            this.f6668 = a0.m8722(MessageDigest.getInstance("MD5").digest(generateCertificate.getEncoded()));
            this.f6669 = a0.m8722(MessageDigest.getInstance("SHA1").digest(generateCertificate.getEncoded()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m7824(Integer num) {
        return Boolean.valueOf(m7815(num.intValue(), true));
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m7825() {
        byte[] m7807;
        if (this.f6665) {
            return;
        }
        this.f6665 = true;
        String string = m7841().getInt("k_lt_ver", 0) == this.f6653 ? m7841().getString("k_lt", null) : null;
        if (TextUtils.isEmpty(string) && (m7807 = m7807()) != null && m7807.length > 0) {
            string = v2.m9081(m7807, this.f6655);
        }
        if (!TextUtils.isEmpty(string)) {
            l3.a aVar = (l3.a) z1.m10872(string, l3.a.class);
            this.f6662 = aVar;
            if (aVar != null) {
                aVar.m9727();
                l3.a aVar2 = this.f6662;
                this.f6656 = aVar2.f12859x;
                this.f6657 = aVar2.f12860x2;
                this.f6658 = aVar2.f12861x3;
                this.f6659 = aVar2.f12862x4;
                this.f6660 = aVar2.x5;
                this.f6661 = aVar2.x6;
            }
        }
        a1.m10669(new d0() { // from class: g3.d
            @Override // n3.d0
            /* renamed from: ʻ, reason: contains not printable characters */
            public final Object mo8739(Object obj) {
                return App.m7824((Integer) obj);
            }
        });
        a1.m10670(new d0() { // from class: g3.e
            @Override // n3.d0
            /* renamed from: ʻ */
            public final Object mo8739(Object obj) {
                return this.f7882.m7831((String) obj);
            }
        });
        a1.m10671(new a2(new d0() { // from class: g3.f
            @Override // n3.d0
            /* renamed from: ʻ */
            public final Object mo8739(Object obj) {
                return this.f7884.m7826((a2.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: יי, reason: contains not printable characters */
    public /* synthetic */ a2.b m7826(a2.a aVar) {
        m3.e eVar = new m3.e(aVar);
        eVar.m9953(this.f6662, false, null);
        return eVar.m9962();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static l3.a m7827() {
        App app = f6650;
        if (app == null) {
            return null;
        }
        return app.f6662;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static void m7828(e eVar) {
        f6650.m7809(eVar);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static boolean m7829(int i5) {
        App app = f6650;
        return app != null && app.getResources().getBoolean(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public /* synthetic */ void m7830(e eVar) {
        m7805(eVar, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public /* synthetic */ String m7831(String str) {
        Object obj;
        l3.a aVar = this.f6662;
        if (aVar == null || aVar.kv == null || TextUtils.isEmpty(str) || (obj = this.f6662.kv.get(str)) == null) {
            return null;
        }
        return z1.m10907(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public /* synthetic */ void m7832(final e eVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: g3.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f7897.m7830(eVar);
            }
        }, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public /* synthetic */ void m7833(e eVar, boolean z5, boolean z6, byte[] bArr, Exception exc) {
        String m9081 = (bArr == null || bArr.length <= 0) ? null : v2.m9081(bArr, this.f6655);
        if (!TextUtils.isEmpty(m9081)) {
            m7841().edit().putInt("k_lt_ver", this.f6653).putString("k_lt", m9081).apply();
            if (eVar != null) {
                m7822(m9081, eVar, z5);
            }
        } else if (eVar != null && !z5) {
            eVar.mo7860(this.f6662);
        }
        if (z6) {
            return;
        }
        m7806();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public /* synthetic */ void m7834() {
        m7805(null, true, true);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static App m7835() {
        return f6650;
    }

    @Override // l0.b, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f6650 = this;
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix("_ym");
        }
        com.lt.app.d.m7997(this, context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f6650 = this;
        this.f6651.m7955(this);
        registerActivityLifecycleCallbacks(this.f6651);
        registerComponentCallbacks(this.f6651);
        f.m8880().m8882();
        this.f6656 = m7841().getLong("k_x", 0L);
        this.f6657 = m7841().getLong("k_x2", 0L);
        this.f6658 = m7841().getLong("k_x3", 0L);
        this.f6659 = m7841().getLong("k_x4", 0L);
        this.f6660 = m7841().getLong("k_x5", 0L);
        this.f6661 = m7841().getLong("k_x6", 0L);
        try {
            this.f6655 = getPackageName();
            this.f6653 = 780;
            this.f6654 = "9.1.2";
            this.f6652 = " LT-APP/48/" + this.f6653;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        m7825();
        com.lt.app.d.m7999(this);
    }

    @Override // com.lt.app.a.InterfaceC0094a
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo7836() {
        m7820(true);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m7837(String str, final n3.e<String, Exception> eVar) {
        String m7842 = m7842("gate/wxlogin/");
        if (TextUtils.isEmpty(m7842)) {
            if (eVar != null) {
                eVar.mo8748(null, null);
            }
        } else {
            r.b m10817 = n3.r.m10817();
            l3.a aVar = this.f6662;
            n3.r m10827 = n3.r.m10827(m7842, m10817.m10839("id", aVar != null ? String.valueOf(aVar.ltid) : "0").m10839("code", str));
            Objects.requireNonNull(eVar);
            m10827.m10832(new r.c() { // from class: g3.k
                @Override // n3.r.c
                /* renamed from: ʻ */
                public final void mo8741(Object obj, Exception exc) {
                    eVar.mo8748((String) obj, exc);
                }
            });
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m7838(String str, String str2, BigDecimal bigDecimal, String str3, n3.e<s<l3.r>, Exception> eVar) {
        String m7842 = m7842("pay/wx/");
        if (TextUtils.isEmpty(m7842)) {
            if (eVar != null) {
                eVar.mo8748(null, new Exception(getString(2131820808)));
            }
        } else {
            r.b m10817 = n3.r.m10817();
            l3.a aVar = this.f6662;
            n3.r m10827 = n3.r.m10827(m7842, m10817.m10839("id", aVar != null ? String.valueOf(aVar.ltid) : "0").m10839("title", str).m10839("orderid", str2).m10839("amount", bigDecimal.toString()).m10839("attach", str3));
            c cVar = new c();
            Objects.requireNonNull(eVar);
            m10827.m10828(cVar, new g3.g(eVar));
        }
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    public boolean m7839() {
        l3.a aVar;
        App app;
        if (!a1.m10620(this)) {
            return false;
        }
        q0 m10702 = a1.m10702();
        return (m10702 == null || (app = f6650) == null || m10702.m10809(app) == -1) ? (!m7815(20, true) || (aVar = this.f6662) == null || aVar.m9728(4)) ? false : true : m10702.m10809(f6650) == 1;
    }

    @Override // com.lt.app.a.InterfaceC0094a
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo7840() {
        m7817();
        m7820(false);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public SharedPreferences m7841() {
        return f6650.getSharedPreferences("LT-APP", 0);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public String m7842(String str) {
        return a1.m10602(this, str);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public String m7843() {
        if (this.f6666 == null) {
            this.f6666 = a0.m8707("unknown");
        }
        return this.f6666;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public JSONObject m7844(Activity activity) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (this.f6662 == null) {
            return jSONObject;
        }
        if (activity != null) {
            Point point = new Point();
            activity.getWindowManager().getDefaultDisplay().getRealSize(point);
            str = point.x + "x" + point.y;
        } else {
            str = "0x0";
        }
        try {
            jSONObject.put("appId", this.f6662.ltid);
            jSONObject.put("appVer", m7851());
            jSONObject.put("appVerName", m7852());
            jSONObject.put("appName", m7849());
            jSONObject.put("url", this.f6662.url);
            jSONObject.put("packageName", this.f6662.key);
            jSONObject.put("platformVer", 48);
            jSONObject.put("deviceId", m7843());
            StringBuilder sb = new StringBuilder();
            sb.append(Build.BRAND);
            sb.append(" ");
            sb.append(Build.MODEL);
            sb.append(" Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append(" SDK ");
            int i5 = Build.VERSION.SDK_INT;
            sb.append(i5);
            jSONObject.put("deviceName", sb.toString());
            jSONObject.put("installId", m7859());
            jSONObject.put("certMD5", m7853());
            jSONObject.put("certSHA1", m7854());
            jSONObject.put("apiLevel", i5);
            jSONObject.put("resolution", str);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public JSONObject m7845() {
        return m7844(null);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public boolean m7846() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21) {
            return true;
        }
        if (this.f6663 == null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            this.f6663 = connectivityManager;
            if (connectivityManager != null) {
                a aVar = new a();
                if (i5 >= 24) {
                    this.f6663.registerDefaultNetworkCallback(aVar);
                } else {
                    this.f6663.registerNetworkCallback(new NetworkRequest.Builder().build(), aVar);
                }
                NetworkInfo activeNetworkInfo = this.f6663.getActiveNetworkInfo();
                this.f6664 = activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
            }
        }
        return this.f6664;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m7847() {
        s1.m9038();
        a1.m10593();
        this.f6662 = null;
        com.lt.app.d.m7998();
        u2.m9054();
        this.f6665 = false;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public String m7848(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        if (com.lt.app.c.m7967(str)) {
            return str;
        }
        try {
            return m7842("qr/?x=" + URLEncoder.encode(str, "UTF-8"));
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public String m7849() {
        return m7812(2131820594);
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public final void m7850(String str, String str2, BigDecimal bigDecimal, String str3, n3.e<s<q>, Exception> eVar) {
        String m7842 = m7842("pay/ali/");
        if (TextUtils.isEmpty(m7842)) {
            if (eVar != null) {
                eVar.mo8748(null, new Exception(getString(2131820808)));
            }
        } else {
            r.b m10817 = n3.r.m10817();
            l3.a aVar = this.f6662;
            n3.r m10827 = n3.r.m10827(m7842, m10817.m10839("id", aVar != null ? String.valueOf(aVar.ltid) : "0").m10839("title", str).m10839("orderid", str2).m10839("amount", bigDecimal.toString()).m10839("attach", str3));
            b bVar = new b();
            Objects.requireNonNull(eVar);
            m10827.m10828(bVar, new g3.g(eVar));
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public int m7851() {
        return f6650.f6653;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public String m7852() {
        return f6650.f6654;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public String m7853() {
        if (this.f6668 == null) {
            m7823();
        }
        return this.f6668;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public String m7854() {
        if (this.f6669 == null) {
            m7823();
        }
        return this.f6669;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public Activity m7855() {
        return this.f6651.m7953();
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public String m7856(boolean z5) {
        if (!z5) {
            return this.f6652;
        }
        return this.f6652 + "/YM-RT/";
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public Map<String, String> m7857(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("x-app", m7859());
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("Referer", str);
        }
        return hashMap;
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public final void m7858(String str, String str2, BigDecimal bigDecimal, String str3, n3.e<s<String>, Exception> eVar) {
        String m7842 = m7842("pay/upay/");
        if (TextUtils.isEmpty(m7842)) {
            if (eVar != null) {
                eVar.mo8748(null, new Exception(getString(2131820808)));
            }
        } else {
            r.b m10817 = n3.r.m10817();
            l3.a aVar = this.f6662;
            n3.r m10827 = n3.r.m10827(m7842, m10817.m10839("id", aVar != null ? String.valueOf(aVar.ltid) : "0").m10839("title", str).m10839("orderid", str2).m10839("amount", bigDecimal.toString()).m10839("attach", str3));
            d dVar = new d();
            Objects.requireNonNull(eVar);
            m10827.m10828(dVar, new g3.g(eVar));
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public String m7859() {
        if (this.f6667 == null) {
            String string = m7841().getString("k_xapp", null);
            this.f6667 = string;
            if (TextUtils.isEmpty(string)) {
                this.f6667 = UUID.randomUUID().toString();
                m7841().edit().putString("k_xapp", this.f6667).apply();
            }
        }
        return this.f6667;
    }
}
