package i2;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: WVJBWebViewClient.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l extends WebViewClient {

    /* renamed from: ʻ, reason: contains not printable characters */
    private a f8584;

    public l(a aVar) {
        this.f8584 = aVar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("wvjbscheme")) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        if (str.indexOf("__BRIDGE_LOADED__") > 0) {
            this.f8584.mo9218();
            return true;
        }
        if (str.indexOf("__WVJB_QUEUE_MESSAGE__") > 0) {
            this.f8584.mo9217();
            return true;
        }
        c.m9219("UnkownMessage:" + str);
        return true;
    }
}
