package v0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebViewProviderFactoryAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f0 implements e0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    final WebViewProviderFactoryBoundaryInterface f11664;

    public f0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f11664 = webViewProviderFactoryBoundaryInterface;
    }

    @Override // v0.e0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) d5.a.m8257(WebViewProviderBoundaryInterface.class, this.f11664.createWebView(webView));
    }

    @Override // v0.e0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) d5.a.m8257(StaticsBoundaryInterface.class, this.f11664.getStatics());
    }

    @Override // v0.e0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) d5.a.m8257(WebkitToCompatConverterBoundaryInterface.class, this.f11664.getWebkitToCompatConverter());
    }

    @Override // v0.e0
    /* renamed from: ʻ */
    public String[] mo12247() {
        return this.f11664.getSupportedFeatures();
    }
}
