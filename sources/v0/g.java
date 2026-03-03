package v0;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: ApiHelperForO.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static PackageInfo m12249() {
        return WebView.getCurrentWebViewPackage();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m12250(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static WebChromeClient m12251(WebView webView) {
        return webView.getWebChromeClient();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static WebViewClient m12252(WebView webView) {
        return webView.getWebViewClient();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m12253(WebSettings webSettings, boolean z5) {
        webSettings.setSafeBrowsingEnabled(z5);
    }
}
