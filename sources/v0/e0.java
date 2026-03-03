package v0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebViewProviderFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface e0 {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    StaticsBoundaryInterface getStatics();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();

    /* renamed from: ʻ, reason: contains not printable characters */
    String[] mo12247();
}
