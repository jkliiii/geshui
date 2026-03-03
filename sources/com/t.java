package com;

import android.content.Context;
import android.os.Build;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import j2.h;
import java.lang.reflect.Constructor;

/* compiled from: Unitiy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean f6818 = false;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Constructor f6819 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    static int f6820 = -1;

    /* compiled from: Unitiy.java */
    class a extends WebViewClient {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f6821;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ WebView f6822;

        a(String str, WebView webView) {
            this.f6821 = str;
            this.f6822 = webView;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Log.i("YM", "page finished loading " + str);
            t.m8146(this.f6821, this.f6822);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static j2.f m8142(Context context, boolean z5) {
        if (z5 && f6818) {
            if (f6819 == null) {
                try {
                    f6819 = Class.forName("com.TWebView").getDeclaredConstructor(Context.class);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            Constructor constructor = f6819;
            if (constructor != null) {
                try {
                    return (j2.f) constructor.newInstance(context);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }
        return new k(context);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static synchronized boolean m8143(Context context) {
        synchronized (t.class) {
            if (f6820 != -1) {
                if (context != null) {
                    return context.getSharedPreferences("LT-APP", 0).getBoolean("agree", false);
                }
                return true;
            }
            try {
                Class.forName("com.lt.plugin.agreement.Agreement");
                f6820 = 1;
            } catch (Exception unused) {
                f6820 = 0;
            }
            if (context != null && f6820 != 0) {
                return context.getSharedPreferences("LT-APP", 0).getBoolean("agree", false);
            }
            return true;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static synchronized boolean m8144(Context context, h.a aVar) {
        synchronized (t.class) {
            if (f6818) {
                return false;
            }
            try {
                Class.forName("com.TWebView").getMethod("initX5Environment", Context.class, h.a.class).invoke(null, context, aVar);
                f6818 = true;
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m8145(Context context, String str, String str2) {
        k kVar = new k(context);
        kVar.setWebViewClient(new a(str, kVar));
        kVar.loadDataWithBaseURL(null, str2, "text/html", "UTF-8", null);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m8146(String str, WebView webView) {
        Context context = webView.getContext();
        PrintManager printManager = (PrintManager) context.getSystemService("print");
        if (printManager == null) {
            Toast.makeText(context, "设备没有打印服务", 1).show();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "Print " + System.currentTimeMillis();
        }
        printManager.print(str, Build.VERSION.SDK_INT >= 21 ? webView.createPrintDocumentAdapter(str) : webView.createPrintDocumentAdapter(), new PrintAttributes.Builder().build());
    }
}
