package v0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: WebViewGlueCommunicator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c0 {

    /* compiled from: WebViewGlueCommunicator.java */
    private static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final g0 f11661 = new g0(c0.m12241().getWebkitToCompatConverter());
    }

    /* compiled from: WebViewGlueCommunicator.java */
    private static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final e0 f11662 = c0.m12238();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static e0 m12238() {
        if (Build.VERSION.SDK_INT < 21) {
            return new x();
        }
        try {
            return new f0((WebViewProviderFactoryBoundaryInterface) d5.a.m8257(WebViewProviderFactoryBoundaryInterface.class, m12239()));
        } catch (ClassNotFoundException unused) {
            return new x();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static InvocationHandler m12239() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m12242()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static g0 m12240() {
        return a.f11661;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static e0 m12241() {
        return b.f11662;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static ClassLoader m12242() {
        return Build.VERSION.SDK_INT >= 28 ? n.m12262() : m12243().getClass().getClassLoader();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static Object m12243() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }
}
