package u0;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import v0.b0;
import v0.c0;
import v0.d0;
import v0.e0;
import v0.g;

/* compiled from: WebViewCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Uri f11435 = Uri.parse("*");

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Uri f11436 = Uri.parse(BuildConfig.FLAVOR);

    /* renamed from: ʻ, reason: contains not printable characters */
    public static a m12089(WebView webView, String str, Set<String> set) {
        if (b0.f11655.mo12230()) {
            return m12094(webView).m12245(str, (String[]) set.toArray(new String[0]));
        }
        throw b0.m12234();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static WebViewProviderBoundaryInterface m12090(WebView webView) {
        return m12092().createWebView(webView);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static PackageInfo m12091() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21) {
            return null;
        }
        if (i5 >= 26) {
            return g.m12249();
        }
        try {
            return m12093();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static e0 m12092() {
        return c0.m12241();
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: ʿ, reason: contains not printable characters */
    private static PackageInfo m12093() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static d0 m12094(WebView webView) {
        return new d0(m12090(webView));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static boolean m12095() {
        if (b0.f11637.mo12230()) {
            return m12092().getStatics().isMultiProcessEnabled();
        }
        throw b0.m12234();
    }
}
