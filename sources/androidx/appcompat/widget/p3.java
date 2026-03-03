package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p3 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Method f1396;

    /* renamed from: ʼ, reason: contains not printable characters */
    static final boolean f1397;

    static {
        f1397 = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1396 = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1396.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m1476(View view, Rect rect, Rect rect2) {
        Method method = f1396;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e5) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e5);
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m1477(View view) {
        return androidx.core.view.f1.m2834(view) == 1;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m1478(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        }
    }
}
