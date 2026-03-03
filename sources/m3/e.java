package m3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import androidx.swiperefreshlayout.widget.c;
import com.lt.app.App;
import h3.p;
import h3.r1;
import h3.t1;
import h3.z;
import java.util.List;
import java.util.Objects;
import m3.e;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.a2;
import n3.k;
import org.json.JSONObject;

/* compiled from: ContentView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final a2.a f9179;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final View f9180;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final androidx.swiperefreshlayout.widget.c f9181;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final j2.f f9182;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f9183;

    /* renamed from: ˆ, reason: contains not printable characters */
    private k3.a f9184;

    /* renamed from: ˈ, reason: contains not printable characters */
    private d f9185;

    /* renamed from: ˉ, reason: contains not printable characters */
    private l3.a f9186;

    /* renamed from: ˊ, reason: contains not printable characters */
    private PopupWindow f9187;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f9188;

    /* compiled from: ContentView.java */
    class a extends g1 {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ProgressBar f9189;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ PopupWindow f9190;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ AlphaAnimation f9191;

        a(ProgressBar progressBar, PopupWindow popupWindow, AlphaAnimation alphaAnimation) {
            this.f9189 = progressBar;
            this.f9190 = popupWindow;
            this.f9191 = alphaAnimation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˉ, reason: contains not printable characters */
        public static /* synthetic */ void m9964(ValueCallback valueCallback, Uri[] uriArr) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
            }
        }

        @Override // m3.g1
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo9965(final ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr) {
            int i5;
            if (e.this.f9179.f9700 == null) {
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                    return;
                }
                return;
            }
            if (App.m7815(18, true)) {
                String type = intent != null ? intent.getType() : BuildConfig.FLAVOR;
                if (strArr != null && strArr.length > 0) {
                    type = type + m3.c.m9914(";", strArr);
                    if (intent != null) {
                        intent.setType(m3.c.m9914(",", strArr));
                    }
                }
                List<k.b> m10790 = n3.k.m10790(type);
                k.b bVar = k.b.Video;
                i5 = (((m10790.contains(bVar) || m10790.contains(k.b.Audio)) && !m10790.contains(k.b.Image)) || e.this.f9186.m9728(18)) ? 0 : 2;
                if (!e.this.f9186.m9729(1) && m10790.contains(bVar)) {
                    i5 |= 8;
                }
                if (!e.this.f9186.m9729(2) && m10790.contains(k.b.Audio)) {
                    i5 |= 4;
                }
            } else {
                i5 = 0;
            }
            if ((intent == null || !intent.getBooleanExtra("k_is_capture_enabled", false)) && !e.this.f9186.m9728(19)) {
                i5 |= 1;
            }
            h3.p.m8980(e.this.f9179.f9700, i5, intent, new p.a() { // from class: m3.d
                @Override // h3.p.a
                /* renamed from: ʻ */
                public final void mo8981(Uri[] uriArr) {
                    e.a.m9964(valueCallback, uriArr);
                }
            });
        }

        @Override // m3.g1
        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean mo9966(j2.f fVar, j2.i iVar) {
            if (e.this.f9179.f9706 != null && e.this.f9179.f9706.booleanValue()) {
                return false;
            }
            if (!TextUtils.isEmpty(iVar.f8639) && iVar.f8639.equals(fVar.getUrl())) {
                return false;
            }
            String m9051 = t1.m9051(iVar.f8639);
            if ("browser".equals(m9051) || e.this.f9186.page.m9737(iVar.f8639)) {
                com.lt.app.c.m7978(e.this.f9179.f9700, iVar.f8639, fVar.getUrl(), true);
                return true;
            }
            if (!App.m7835().m7846() && !e.this.f9186.m9729(18)) {
                com.lt.app.c.m7959(e.this.f9179.f9700, 2131820626);
            }
            if (!iVar.f8641 && iVar.f8643 && !iVar.f8642) {
                if ("blank".equals(m9051) || e.this.f9186.page.m9733(iVar.f8639)) {
                    com.lt.app.c.m7978(e.this.f9179.f9700, iVar.f8639, fVar.getUrl(), false);
                    return true;
                }
                if (!"self".equals(m9051) && !e.this.f9186.page.m9738(iVar.f8639) && e.this.f9186.m9728(2)) {
                    com.lt.app.c.m7978(e.this.f9179.f9700, iVar.f8639, fVar.getUrl(), false);
                    return true;
                }
            }
            return false;
        }

        @Override // m3.g1
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo9967(j2.f fVar, String str) {
            if (e.this.f9185 != null) {
                e.this.f9185.mo7863(e.this.f9182, str);
            }
            com.lt.app.d.m8001(e.this.f9182);
            ProgressBar progressBar = this.f9189;
            if (progressBar != null) {
                progressBar.startAnimation(this.f9191);
            } else {
                PopupWindow popupWindow = this.f9190;
                if (popupWindow != null && popupWindow.isShowing()) {
                    this.f9190.dismiss();
                }
            }
            e.this.f9182.mo7787();
        }

        @Override // m3.g1
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo9968(j2.f fVar, String str, Bitmap bitmap) {
            PopupWindow popupWindow;
            if (e.this.f9179.f9700.isFinishing()) {
                return;
            }
            if (e.this.f9185 != null) {
                e.this.f9185.mo7865(e.this.f9182, str);
            }
            if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
                return;
            }
            ProgressBar progressBar = this.f9189;
            if (progressBar != null) {
                progressBar.setProgress(8);
                this.f9189.clearAnimation();
                this.f9189.setVisibility(0);
            } else {
                if (e.this.f9179.f9700.isFinishing() || (popupWindow = this.f9190) == null || popupWindow.isShowing() || !com.lt.app.c.m7967(str) || e.this.f9182.getViewEx().getWidth() <= 0) {
                    return;
                }
                this.f9190.showAtLocation(e.this.f9182.getViewEx(), 17, 0, 0);
            }
        }

        @Override // m3.g1
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo9969(j2.f fVar, int i5) {
            com.lt.app.d.m8001(e.this.f9182);
            String url = fVar.getUrl();
            if (TextUtils.isEmpty(url) || !url.startsWith("http")) {
                return;
            }
            ProgressBar progressBar = this.f9189;
            if (progressBar != null) {
                progressBar.setProgress(Math.max(i5, 8));
                if (i5 == 100) {
                    this.f9189.startAnimation(this.f9191);
                    return;
                }
                return;
            }
            PopupWindow popupWindow = this.f9190;
            if (popupWindow == null || !popupWindow.isShowing() || i5 <= 80) {
                return;
            }
            this.f9190.dismiss();
        }

        @Override // m3.g1
        /* renamed from: ˆ, reason: contains not printable characters */
        public void mo9970(j2.f fVar, String str) {
            if (e.this.f9185 != null) {
                e.this.f9185.mo7867(fVar, str);
            }
            com.lt.app.d.m8001(e.this.f9182);
        }
    }

    /* compiled from: ContentView.java */
    class b extends x0 {

        /* renamed from: ˆ, reason: contains not printable characters */
        private WebChromeClient.CustomViewCallback f9193;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final int f9194;

        /* renamed from: ˉ, reason: contains not printable characters */
        private final int f9195;

        b(j2.f fVar, g1 g1Var) {
            super(fVar, g1Var);
            this.f9193 = null;
            this.f9194 = 1;
            this.f9195 = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʾʾ, reason: contains not printable characters */
        public static /* synthetic */ void m9974(n3.f fVar, String str) {
            int i5;
            JSONObject jSONObject;
            int optInt;
            int i6 = 0;
            if (TextUtils.isEmpty(str)) {
                optInt = 0;
            } else {
                try {
                    jSONObject = new JSONObject(str);
                    i5 = jSONObject.optInt("w");
                } catch (Exception unused) {
                    i5 = 0;
                }
                try {
                    i6 = i5;
                    optInt = jSONObject.optInt("h");
                } catch (Exception unused2) {
                    i6 = i5;
                    optInt = 0;
                    fVar.mo8742(new Size(i6, optInt));
                }
            }
            fVar.mo8742(new Size(i6, optInt));
        }

        /* renamed from: ʿʿ, reason: contains not printable characters */
        private void m9975(final n3.f<Size> fVar) {
            e.this.f9182.evaluateJavascript("javascript:(function() {\n    var res = {};\n    try {\n        var e = document.fullscreenElement;\n        if (e && e.tagName && 'VIDEO' == e.tagName.toUpperCase()) {\n            res = {\n                w: e.videoWidth,\n                h: e.videoHeight\n            };\n        }\n    } catch {}\n    return JSON.stringify(res);\n})()", new ValueCallback() { // from class: m3.i
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    e.b.m9974(fVar, (String) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˆˆ, reason: contains not printable characters */
        public /* synthetic */ void m9976(final View view, final WebChromeClient.CustomViewCallback customViewCallback) {
            m9975(new n3.f() { // from class: m3.h
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f9224.m9979(view, customViewCallback, (Size) obj);
                }
            });
        }

        /* renamed from: ˈˈ, reason: contains not printable characters */
        private void m9977(View view, boolean z5, WebChromeClient.CustomViewCallback customViewCallback) {
            if (e.this.f9179.f9700 != null) {
                e.this.f9184 = new k3.a();
                e.this.f9184.f8862 = z5;
                e.this.f9184.m9517(e.this.f9179.f9700.m4043(), view, new n3.f() { // from class: m3.g
                    @Override // n3.f
                    /* renamed from: ʻ */
                    public final void mo8742(Object obj) {
                        this.f9213.m9978((androidx.fragment.app.d) obj);
                    }
                });
                this.f9193 = customViewCallback;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˉˉ, reason: contains not printable characters */
        public /* synthetic */ void m9978(androidx.fragment.app.d dVar) {
            mo9297();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ــ, reason: contains not printable characters */
        public /* synthetic */ void m9979(View view, WebChromeClient.CustomViewCallback customViewCallback, Size size) {
            m9977(view, size.getHeight() > size.getWidth(), customViewCallback);
        }

        @Override // m3.x0, j2.e
        /* renamed from: ʽ */
        public void mo9297() {
            if (e.this.f9184 != null) {
                e.this.f9184.dismiss();
                e.this.f9184 = null;
            }
            WebChromeClient.CustomViewCallback customViewCallback = this.f9193;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
                this.f9193 = null;
            }
            super.mo9297();
        }

        @Override // j2.e
        /* renamed from: ˉ */
        public void mo9302(final View view, final WebChromeClient.CustomViewCallback customViewCallback) {
            if (view == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m3.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9200.m9976(view, customViewCallback);
                }
            }, 300L);
        }
    }

    /* compiled from: ContentView.java */
    class c extends f1 {
        c(i2.a aVar, g1 g1Var) {
            super(aVar, g1Var);
        }

        @Override // j2.g
        /* renamed from: ʽ */
        public void mo9314(j2.f fVar, String str, boolean z5) {
            e.this.m9948(str);
        }
    }

    /* compiled from: ContentView.java */
    public interface d {
        /* renamed from: ʻ */
        void mo7863(j2.f fVar, String str);

        /* renamed from: ʿ */
        void mo7865(j2.f fVar, String str);

        /* renamed from: ˋ */
        void mo7867(j2.f fVar, String str);
    }

    public e(a2.a aVar) {
        this.f9183 = true;
        this.f9187 = null;
        this.f9179 = aVar;
        j2.f m7962 = com.lt.app.c.m7962(aVar.f9700);
        this.f9182 = m7962;
        m7962.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View viewEx = m7962.getViewEx();
        if (aVar.f9700.getResources().getBoolean(2130968581)) {
            viewEx.setVerticalScrollBarEnabled(false);
        }
        if (aVar.f9700.getResources().getBoolean(2130968580)) {
            viewEx.setHorizontalScrollBarEnabled(false);
        }
        Boolean bool = aVar.f9703;
        if ((bool == null || !bool.booleanValue()) && !(aVar.f9703 == null && App.m7815(3, true))) {
            this.f9181 = null;
        } else {
            androidx.swiperefreshlayout.widget.c cVar = new androidx.swiperefreshlayout.widget.c(aVar.f9700);
            this.f9181 = cVar;
            cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            cVar.addView(viewEx);
            viewEx = cVar;
        }
        this.f9180 = viewEx;
        ViewGroup viewGroup = aVar.f9701;
        if (viewGroup != null) {
            viewGroup.addView(viewEx, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m9948(String str) {
        if (this.f9182.getContext() instanceof com.lt.app.b) {
            ((com.lt.app.b) this.f9182.getContext()).m7957().m8997(str);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m9949() {
        if (this.f9186.m9728(8)) {
            h3.d0.m8793(this.f9182);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m9950(t1 t1Var) {
        if (this.f9181 == null) {
            return;
        }
        this.f9181.setEnabled((t1Var == null || !t1Var.f8380) ? !this.f9186.m9728(3) : t1Var.f8381);
        this.f9181.setOnRefreshListener(new c.j() { // from class: m3.a
            @Override // androidx.swiperefreshlayout.widget.c.j
            /* renamed from: ʻ */
            public final void mo5311() {
                this.f9145.m9952();
            }
        });
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m9951() {
        Boolean bool = this.f9179.f9705;
        boolean z5 = bool == null || bool.booleanValue();
        int i5 = this.f9186.ls;
        r1 r1Var = null;
        ProgressBar progressBar = (i5 == 1 && z5) ? this.f9179.f9702 : null;
        if (i5 > 1 && z5) {
            r1Var = r1.m9034(this.f9179.f9700, i5);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(700L);
        alphaAnimation.setFillAfter(true);
        a aVar = new a(progressBar, r1Var, alphaAnimation);
        j2.f fVar = this.f9182;
        fVar.setWebChromeClient(new b(fVar, aVar));
        this.f9182.setWebViewClient(new c(this.f9182, aVar));
        Boolean bool2 = this.f9179.f9704;
        if (bool2 == null || bool2.booleanValue()) {
            c0.m9936(this.f9182, this.f9186);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public /* synthetic */ void m9952() {
        if (!com.lt.app.c.m7967(this.f9182.getUrl())) {
            this.f9181.setRefreshing(false);
            return;
        }
        if (this.f9188 && this.f9186.m9728(6) && this.f9186.url.equals(this.f9182.getUrl())) {
            final j2.f fVar = this.f9182;
            Objects.requireNonNull(fVar);
            h3.z.m9099(new z.c() { // from class: m3.b
                @Override // h3.z.c
                /* renamed from: ʻ */
                public final void mo8744() {
                    fVar.reload();
                }
            }, this.f9182);
        } else {
            this.f9182.reload();
        }
        this.f9181.setRefreshing(false);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m9953(l3.a aVar, boolean z5, t1 t1Var) {
        this.f9186 = aVar;
        this.f9188 = z5;
        String m7856 = App.m7835().m7856(z5);
        if (m7856 == null) {
            m7856 = BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder(256);
        int length = m7856.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = m7856.charAt(i5);
            if (charAt < 256) {
                sb.append(charAt);
            }
        }
        this.f9182.mo7794(sb.toString(), aVar.ua, aVar.uaExt);
        m9949();
        m9950(t1Var);
        m9951();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m9954(l3.l lVar) {
        androidx.swiperefreshlayout.widget.c cVar = this.f9181;
        if (cVar != null) {
            cVar.setEnabled(lVar.page.enablePullRefresh);
        }
        this.f9183 = lVar.multipleWindow;
        this.f9182.loadUrl(lVar.url, null);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m9955() {
        this.f9182.destroy();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public View m9956() {
        return this.f9180;
    }

    /* renamed from: י, reason: contains not printable characters */
    public j2.f m9957() {
        return this.f9182;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m9958() {
        k3.a aVar = this.f9184;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        this.f9184 = null;
        return true;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m9959(l3.p pVar) {
        if (pVar == null) {
            return;
        }
        if (!pVar.visible) {
            PopupWindow popupWindow = this.f9187;
            if (popupWindow != null) {
                if (popupWindow.isShowing()) {
                    this.f9187.dismiss();
                }
                this.f9187 = null;
                return;
            }
            return;
        }
        PopupWindow popupWindow2 = this.f9187;
        if (popupWindow2 == null || !popupWindow2.isShowing()) {
            r1 m9035 = r1.m9035(this.f9179.f9700, pVar.style, pVar.foregroundColor, pVar.backgroundColor);
            this.f9187 = m9035;
            m9035.showAtLocation(this.f9182.getViewEx(), 17, 0, 0);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m9960(d dVar) {
        this.f9185 = dVar;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public void m9961(boolean z5) {
        androidx.swiperefreshlayout.widget.c cVar = this.f9181;
        if (cVar != null) {
            cVar.setEnabled(z5);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public a2.b m9962() {
        return new a2.b(this.f9180, this.f9182);
    }

    public e(n3.d dVar, ViewGroup viewGroup) {
        this(new a2.a(dVar, viewGroup));
    }
}
