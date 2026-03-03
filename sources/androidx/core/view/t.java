package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* compiled from: LayoutInflaterCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Field f3019;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f3020;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m3317(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f3020) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f3019 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e5);
            }
            f3020 = true;
        }
        Field field = f3019;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e6) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e6);
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m3318(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m3317(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m3317(layoutInflater, factory2);
            }
        }
    }
}
