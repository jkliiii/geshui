package v0;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* compiled from: ApiHelperForQ.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v {
    @Deprecated
    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m12275(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static WebViewRenderProcess m12276(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static WebViewRenderProcessClient m12277(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m12278(WebSettings webSettings, int i5) {
        webSettings.setForceDark(i5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m12279(WebView webView, Executor executor, u0.f fVar) {
        webView.setWebViewRenderProcessClient(executor, null);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12280(WebView webView, u0.f fVar) {
        webView.setWebViewRenderProcessClient(null);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static boolean m12281(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
