package com.lt.app.views;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.lt.app.c;

/* loaded from: E:\78999\cookie_5123796.dex */
public class LTTabView extends WebView {

    /* renamed from: ʾ, reason: contains not printable characters */
    private b f6738;

    /* renamed from: ʿ, reason: contains not printable characters */
    private long f6739;

    public interface b {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo8019(String str);
    }

    public LTTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6738 = null;
        this.f6739 = 0L;
        m8016();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m8016() {
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        WebSettings settings = getSettings();
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDefaultTextEncodingName("UTF-8");
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setSavePassword(false);
        setWebViewClient(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿ, reason: contains not printable characters */
    public void m8017(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("js:")) {
            str = "javascript:" + str.substring(3);
        }
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str) && !URLUtil.isJavaScriptUrl(str) && !str.startsWith("fs:")) {
            c.m7986(getContext(), str, true);
            return;
        }
        b bVar = this.f6738;
        if (bVar != null) {
            bVar.mo8019(str);
        }
    }

    public void setContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            loadUrl(str);
        } else {
            loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
        }
    }

    public void setLTTabViewListener(b bVar) {
        this.f6738 = bVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m8018(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!URLUtil.isJavaScriptUrl(str)) {
            str = "javascript:" + str;
        }
        this.f6739 = System.currentTimeMillis();
        evaluateJavascript(str, null);
    }

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (System.currentTimeMillis() - LTTabView.this.f6739 < 250) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 21) {
                return true;
            }
            LTTabView.this.m8017(webResourceRequest.getUrl().toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (System.currentTimeMillis() - LTTabView.this.f6739 < 250) {
                return false;
            }
            LTTabView.this.m8017(str);
            return true;
        }
    }
}
