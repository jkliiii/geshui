package v0;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: ApiHelperForP.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static TracingController m12261() {
        return TracingController.getInstance();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static ClassLoader m12262() {
        return WebView.getWebViewClassLoader();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Looper m12263(WebView webView) {
        return webView.getWebViewLooper();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m12264(TracingController tracingController) {
        return tracingController.isTracing();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m12265(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12266(TracingController tracingController, u0.b bVar) {
        new TracingConfig.Builder();
        throw null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static boolean m12267(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
