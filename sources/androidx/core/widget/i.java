package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* compiled from: CompoundButtonCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Field f3141;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f3142;

    /* compiled from: CompoundButtonCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static ColorStateList m3619(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static PorterDuff.Mode m3620(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3621(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3622(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* compiled from: CompoundButtonCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Drawable m3623(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Drawable m3614(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m3623(compoundButton);
        }
        if (!f3142) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3141 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e5);
            }
            f3142 = true;
        }
        Field field = f3141;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e6) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e6);
                f3141 = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    public static ColorStateList m3615(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m3619(compoundButton);
        }
        if (compoundButton instanceof q0) {
            return ((q0) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static PorterDuff.Mode m3616(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m3620(compoundButton);
        }
        if (compoundButton instanceof q0) {
            return ((q0) compoundButton).getSupportButtonTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m3617(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.m3621(compoundButton, colorStateList);
        } else if (compoundButton instanceof q0) {
            ((q0) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m3618(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.m3622(compoundButton, mode);
        } else if (compoundButton instanceof q0) {
            ((q0) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
