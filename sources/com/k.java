package com;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import i2.k;
import j2.f;
import j2.g;
import java.util.HashSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: SWebView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k extends i2.k {

    /* renamed from: ˎ, reason: contains not printable characters */
    private j2.e f6629;

    /* renamed from: ˏ, reason: contains not printable characters */
    private String f6630;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f6631;

    /* renamed from: י, reason: contains not printable characters */
    private GestureDetector f6632;

    /* renamed from: ـ, reason: contains not printable characters */
    f.d f6633;

    /* compiled from: SWebView.java */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            k kVar;
            f.d dVar;
            if (motionEvent.getAction() != 1 || (dVar = (kVar = k.this).f6633) == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            dVar.mo7988(kVar);
            return true;
        }
    }

    /* compiled from: SWebView.java */
    static class c extends WebChromeClient {

        /* renamed from: ʻ, reason: contains not printable characters */
        final j2.e f6642;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Context f6643;

        /* compiled from: SWebView.java */
        class a implements GeolocationPermissions.Callback {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ GeolocationPermissions.Callback f6644;

            a(GeolocationPermissions.Callback callback) {
                this.f6644 = callback;
            }

            @Override // android.webkit.GeolocationPermissions.Callback
            public void invoke(String str, boolean z5, boolean z6) {
                this.f6644.invoke(str, z5, false);
            }
        }

        /* compiled from: SWebView.java */
        class b implements j2.c {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ JsResult f6646;

            b(JsResult jsResult) {
                this.f6646 = jsResult;
            }

            @Override // j2.c
            public void cancel() {
                this.f6646.cancel();
            }

            @Override // j2.c
            /* renamed from: ʻ, reason: contains not printable characters */
            public void mo7801() {
                this.f6646.confirm();
            }
        }

        /* compiled from: SWebView.java */
        /* renamed from: com.k$c$c, reason: collision with other inner class name */
        class C0092c implements j2.c {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ JsResult f6648;

            C0092c(JsResult jsResult) {
                this.f6648 = jsResult;
            }

            @Override // j2.c
            public void cancel() {
                this.f6648.cancel();
            }

            @Override // j2.c
            /* renamed from: ʻ */
            public void mo7801() {
                this.f6648.confirm();
            }
        }

        c(j2.e eVar, Context context) {
            this.f6642 = eVar;
            this.f6643 = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            if (webView != 0) {
                webView.getSettings().setSavePassword(false);
            }
            this.f6642.mo9305((j2.f) webView);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage != null) {
                Log.d("YM console", "[" + consoleMessage.messageLevel() + "] " + consoleMessage.message() + "(" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")");
            }
            return super.onConsoleMessage(consoleMessage);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z5, boolean z6, Message message) {
            if (webView != 0) {
                webView.getSettings().setSavePassword(false);
            }
            return this.f6642.mo9296((j2.f) webView, z5, z6, message);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            if (t.m8143(this.f6643)) {
                this.f6642.mo9300();
            } else {
                super.onGeolocationPermissionsHidePrompt();
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (!t.m8143(this.f6643)) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            } else if (callback == null) {
                this.f6642.mo9301(str, null);
            } else {
                this.f6642.mo9301(str, new a(callback));
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.f6642.mo9297();
            super.onHideCustomView();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (webView != 0) {
                webView.getSettings().setSavePassword(false);
            }
            return this.f6642.mo9306((j2.f) webView, str, str2, jsResult == null ? null : new b(jsResult));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (webView != 0) {
                webView.getSettings().setSavePassword(false);
            }
            return this.f6642.mo9298((j2.f) webView, str, str2, jsResult == null ? null : new C0092c(jsResult));
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f6642.mo9299(permissionRequest);
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
            super.onPermissionRequestCanceled(permissionRequest);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i5) {
            if (webView != 0) {
                webView.getSettings().setSavePassword(false);
            }
            this.f6642.mo9307((j2.f) webView, i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (webView != 0) {
                webView.getSettings().setSavePassword(false);
            }
            this.f6642.mo9303((j2.f) webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.f6642.mo9302(view, customViewCallback);
            super.onShowCustomView(view, customViewCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (webView != 0) {
                webView.getSettings().setSavePassword(false);
            }
            return this.f6642.mo9295((j2.f) webView, valueCallback, fileChooserParams);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
        }

        public void openFileChooser(ValueCallback valueCallback, String str) {
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            this.f6642.mo9304(valueCallback, str, str2);
        }
    }

    public k(Context context) {
        super(context);
        this.f6631 = false;
        this.f6632 = null;
        this.f6633 = null;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private void m7780() {
        if (this.f6633 == null || this.f6632 != null) {
            return;
        }
        this.f6632 = new GestureDetector(getContext(), new a());
        setOnTouchListener(new View.OnTouchListener() { // from class: com.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f5244.m7782(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎˎ, reason: contains not printable characters */
    public /* synthetic */ boolean m7782(View view, MotionEvent motionEvent) {
        performClick();
        return this.f6632.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏˏ, reason: contains not printable characters */
    public static /* synthetic */ void m7783(Boolean bool) {
        Log.d("YM", "clearCookie " + bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static /* synthetic */ void m7784(f.a aVar, Bitmap bitmap, int i5) {
        if (i5 != 0) {
            bitmap = null;
        }
        aVar.mo8781(bitmap);
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m7786(boolean z5, final f.a<Bitmap> aVar) {
        final Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        try {
            Window window = ((Activity) getContext()).getWindow();
            if (Build.VERSION.SDK_INT >= 26) {
                int i5 = iArr[0];
                PixelCopy.request(window, new Rect(i5, iArr[1], getWidth() + i5, iArr[1] + getHeight()), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.j
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i6) {
                        k.m7784(aVar, createBitmap, i6);
                    }
                }, new Handler());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            aVar.mo8781(null);
        }
    }

    @Override // android.webkit.WebView, j2.f
    public void evaluateJavascript(String str, final ValueCallback<String> valueCallback) {
        m9244(str, valueCallback == null ? null : new k.c() { // from class: com.i
            @Override // i2.k.c
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo7775(String str2) {
                valueCallback.onReceiveValue(str2);
            }
        });
    }

    @Override // i2.k, j2.f
    public f.c getLTHitTestResult() {
        WebView.HitTestResult hitTestResult = super.getHitTestResult();
        f.c cVar = new f.c();
        cVar.m9310(hitTestResult == null ? null : hitTestResult.getExtra());
        cVar.m9311(hitTestResult == null ? 0 : hitTestResult.getType());
        return cVar;
    }

    @Override // i2.k
    public String getUserAgent() {
        return getSettings().getUserAgentString();
    }

    @Override // i2.k
    public j2.e getWebChromeClientEx() {
        return this.f6629;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i5, int i6, int i7, int i8) {
        super.onScrollChanged(i5, i6, i7, i8);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6631 && motionEvent.getAction() == 0) {
            this.f6631 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // i2.k, j2.f
    public void setDownloadListener(final j2.a aVar) {
        super.setDownloadListener(aVar == null ? null : new DownloadListener() { // from class: com.f
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
                aVar.onDownloadStart(str, str2, str3, str4, j5);
            }
        });
    }

    @Override // i2.k, j2.f
    public void setErrorUrl(String str) {
        this.f6630 = str;
    }

    @Override // i2.k, j2.f
    public void setForceDark(Boolean bool) {
        WebSettings settings = getSettings();
        if (u0.e.m12096("FORCE_DARK")) {
            if (bool == null) {
                u0.c.m12087(settings, 1);
                return;
            }
            if (!bool.booleanValue()) {
                u0.c.m12087(settings, 0);
                return;
            }
            u0.c.m12087(settings, 2);
            if (u0.e.m12096("FORCE_DARK_STRATEGY")) {
                u0.c.m12088(settings, 1);
            }
        }
    }

    @Override // i2.k, j2.f
    public void setGeolocationEnabled(boolean z5) {
        WebSettings settings = getSettings();
        settings.setDatabaseEnabled(true);
        settings.setGeolocationDatabasePath(getContext().getApplicationContext().getDir("database", 0).getPath());
        settings.setGeolocationEnabled(z5);
    }

    @Override // i2.k, j2.f
    public void setOnDoubleClickListener(f.d dVar) {
        this.f6633 = dVar;
        m7780();
    }

    @Override // i2.k, j2.f
    public void setTransportWebView(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof WebView.WebViewTransport) {
                ((WebView.WebViewTransport) obj).setWebView(this);
                message.sendToTarget();
            }
        }
    }

    @Override // i2.k, j2.f
    public void setWebChromeClient(j2.e eVar) {
        this.f6629 = eVar;
        if (eVar == null) {
            super.setWebChromeClient((WebChromeClient) null);
        } else {
            super.setWebChromeClient(new c(eVar, getContext()));
        }
    }

    @Override // i2.k, j2.f
    public void setWebViewClient(j2.g gVar) {
        if (gVar == null) {
            super.setWebViewClient((WebViewClient) null);
        } else {
            super.setWebViewClient(new b(gVar));
        }
    }

    @Override // j2.f
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo7788(String str) {
        m9244(str, null);
    }

    @Override // j2.f
    /* renamed from: ʽ, reason: contains not printable characters */
    public String mo7789(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            t.m8146(str, this);
            return null;
        }
        t.m8145(getContext(), str, str2);
        return null;
    }

    @Override // j2.f
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo7790(boolean z5, f.a<Bitmap> aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            m7786(z5, aVar);
            return;
        }
        if (!z5) {
            destroyDrawingCache();
            buildDrawingCache();
            aVar.mo8781(getDrawingCache());
            return;
        }
        int contentHeight = (int) (getContentHeight() * getScale());
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        Bitmap createBitmap = Bitmap.createBitmap(width, contentHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        while (contentHeight > 0) {
            contentHeight = contentHeight < height ? 0 : contentHeight - height;
            canvas.save();
            canvas.clipRect(0, contentHeight, width, contentHeight + height);
            scrollTo(0, contentHeight);
            draw(canvas);
            canvas.restore();
        }
        scrollTo(0, scrollY);
        aVar.mo8781(createBitmap);
    }

    @Override // j2.f
    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean mo7791(String str) {
        if (TextUtils.isEmpty(str) || !u0.e.m12096("DOCUMENT_START_SCRIPT")) {
            return false;
        }
        u0.d.m12089(this, str, new HashSet());
        return true;
    }

    @Override // j2.f
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo7792() {
        CookieManager cookieManager = CookieManager.getInstance();
        if (cookieManager != null) {
            Log.d("YM", "clearCookie");
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.removeAllCookies(new ValueCallback() { // from class: com.h
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        k.m7783((Boolean) obj);
                    }
                });
            } else {
                cookieManager.removeAllCookie();
                Log.d("YM", "clearCookie true");
            }
        }
    }

    @Override // j2.f
    /* renamed from: ˉ, reason: contains not printable characters */
    public String mo7793(String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        return cookieManager != null ? cookieManager.getCookie(str) : BuildConfig.FLAVOR;
    }

    @Override // j2.f
    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo7794(String str, String str2, String str3) {
        WebSettings settings = getSettings();
        if (TextUtils.isEmpty(str2)) {
            str2 = settings.getUserAgentString();
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = str2 + " " + str3;
        }
        Context context = getContext();
        if (context != null) {
            String string = context.getString(h2.a.f8133);
            if (!TextUtils.isEmpty(string)) {
                str2 = str2 + " LT/" + string;
            }
        }
        settings.setUserAgentString(str2 + str);
    }

    @Override // i2.k
    /* renamed from: ﹳ, reason: contains not printable characters */
    public void mo7795() {
        super.mo7795();
        CookieSyncManager.createInstance(getContext().getApplicationContext());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            CookieManager.getInstance().acceptThirdPartyCookies(this);
        }
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setOverScrollMode(2);
        WebSettings settings = getSettings();
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDefaultTextEncodingName("UTF-8");
        settings.setDomStorageEnabled(true);
        settings.setTextZoom(100);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        if (i5 >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        setForceDark(null);
    }

    /* compiled from: SWebView.java */
    class b extends WebViewClient {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ j2.g f6635;

        /* compiled from: SWebView.java */
        class a implements j2.b {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ HttpAuthHandler f6637;

            a(HttpAuthHandler httpAuthHandler) {
                this.f6637 = httpAuthHandler;
            }

            @Override // j2.b
            public void cancel() {
                this.f6637.cancel();
            }

            @Override // j2.b
            /* renamed from: ʻ, reason: contains not printable characters */
            public void mo7797(String str, String str2) {
                this.f6637.proceed(str, str2);
            }
        }

        /* compiled from: SWebView.java */
        /* renamed from: com.k$b$b, reason: collision with other inner class name */
        class C0091b implements g.a {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ SslError f6639;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ SslErrorHandler f6640;

            C0091b(SslError sslError, SslErrorHandler sslErrorHandler) {
                this.f6639 = sslError;
                this.f6640 = sslErrorHandler;
            }

            @Override // j2.g.a
            public void cancel() {
                this.f6640.cancel();
            }

            @Override // j2.g.a
            /* renamed from: ʻ, reason: contains not printable characters */
            public void mo7798() {
                this.f6640.proceed();
            }

            @Override // j2.g.a
            /* renamed from: ʼ, reason: contains not printable characters */
            public String mo7799() {
                try {
                    return Uri.parse(m7800()).getHost();
                } catch (Exception unused) {
                    return BuildConfig.FLAVOR;
                }
            }

            /* renamed from: ʽ, reason: contains not printable characters */
            public String m7800() {
                return this.f6639.getUrl();
            }
        }

        b(j2.g gVar) {
            this.f6635 = gVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m7796() {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().flush();
            } else {
                CookieSyncManager.getInstance().sync();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z5) {
            m7796();
            this.f6635.mo9314((j2.f) webView, str, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            this.f6635.mo9319((j2.f) webView, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            m7796();
            this.f6635.mo9312((j2.f) webView, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f6635.mo9313((j2.f) webView, str, bitmap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i5, String str, String str2) {
            j2.i iVar = new j2.i();
            iVar.f8639 = str2;
            iVar.f8640 = true;
            iVar.f8641 = false;
            iVar.f8643 = k.this.f6631;
            iVar.f8644 = i5;
            if (this.f6635.mo9315((j2.f) webView, iVar)) {
                return;
            }
            super.onReceivedError(webView, i5, str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.f6635.mo9316((j2.f) webView, httpAuthHandler != null ? new a(httpAuthHandler) : null, str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            j2.i iVar = new j2.i();
            iVar.f8639 = webResourceRequest.getUrl().toString();
            iVar.f8640 = webResourceRequest.isForMainFrame();
            if (Build.VERSION.SDK_INT >= 24) {
                iVar.f8641 = webResourceRequest.isRedirect();
            } else {
                iVar.f8641 = false;
            }
            iVar.f8643 = webResourceRequest.hasGesture();
            iVar.f8644 = webResourceResponse.getStatusCode();
            if (this.f6635.mo9315((j2.f) webView, iVar)) {
                return;
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.f6635.mo9317((j2.f) webView, new C0091b(sslError, sslErrorHandler));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            WebResourceResponse mo9320;
            return (Build.VERSION.SDK_INT < 21 || (url = webResourceRequest.getUrl()) == null || (mo9320 = this.f6635.mo9320((j2.f) webView, url.toString())) == null) ? super.shouldInterceptRequest(webView, webResourceRequest) : mo9320;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            j2.i iVar = new j2.i();
            iVar.f8639 = str;
            iVar.f8640 = true;
            iVar.f8641 = false;
            iVar.f8643 = k.this.f6631;
            iVar.f8642 = k.this.f6630 != null && k.this.f6630.equals(iVar.f8639);
            boolean mo9318 = this.f6635.mo9318((j2.f) webView, iVar);
            k.this.f6631 = false;
            return mo9318;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse mo9320 = this.f6635.mo9320((j2.f) webView, str);
            return mo9320 != null ? mo9320 : super.shouldInterceptRequest(webView, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            j2.i iVar = new j2.i();
            iVar.f8639 = webResourceRequest.getUrl().toString();
            iVar.f8640 = webResourceRequest.isForMainFrame();
            int i5 = Build.VERSION.SDK_INT;
            int i6 = 0;
            if (i5 >= 24) {
                iVar.f8641 = webResourceRequest.isRedirect();
            } else {
                iVar.f8641 = false;
            }
            iVar.f8643 = webResourceRequest.hasGesture();
            if (i5 >= 23 && webResourceError != null) {
                i6 = webResourceError.getErrorCode();
            }
            iVar.f8644 = i6;
            if (this.f6635.mo9315((j2.f) webView, iVar)) {
                return;
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            j2.i iVar = new j2.i();
            iVar.f8639 = webResourceRequest.getUrl().toString();
            iVar.f8640 = webResourceRequest.isForMainFrame();
            if (Build.VERSION.SDK_INT >= 24) {
                iVar.f8641 = webResourceRequest.isRedirect();
            }
            iVar.f8643 = webResourceRequest.hasGesture();
            iVar.f8642 = k.this.f6630 != null && k.this.f6630.equals(iVar.f8639);
            return this.f6635.mo9318((j2.f) webView, iVar);
        }
    }

    @Override // i2.k, j2.f
    public void setTransportWebView(Object obj) {
        if (obj instanceof WebView.WebViewTransport) {
            ((WebView.WebViewTransport) obj).setWebView(this);
        }
    }

    @Override // i2.k
    public void setVScrollListener(j2.d dVar) {
    }

    @Override // i2.k, j2.f
    public View getViewEx() {
        return this;
    }

    @Override // j2.f
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo7787() {
    }
}
