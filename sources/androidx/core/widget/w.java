package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class w {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Method f3144;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f3145;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Field f3146;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static boolean f3147;

    /* compiled from: PopupWindowCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3665(PopupWindow popupWindow, View view, int i5, int i6, int i7) {
            popupWindow.showAsDropDown(view, i5, i6, i7);
        }
    }

    /* compiled from: PopupWindowCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m3666(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3667(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3668(PopupWindow popupWindow, boolean z5) {
            popupWindow.setOverlapAnchor(z5);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3669(PopupWindow popupWindow, int i5) {
            popupWindow.setWindowLayoutType(i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m3662(PopupWindow popupWindow, boolean z5) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            b.m3668(popupWindow, z5);
            return;
        }
        if (i5 >= 21) {
            if (!f3147) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f3146 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e5) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e5);
                }
                f3147 = true;
            }
            Field field = f3146;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z5));
                } catch (IllegalAccessException e6) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e6);
                }
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m3663(PopupWindow popupWindow, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m3669(popupWindow, i5);
            return;
        }
        if (!f3145) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f3144 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3145 = true;
        }
        Method method = f3144;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i5));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m3664(PopupWindow popupWindow, View view, int i5, int i6, int i7) {
        a.m3665(popupWindow, view, i5, i6, i7);
    }
}
