package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Method f2680;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f2681;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Method f2682;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static boolean f2683;

    /* compiled from: DrawableCompat.java */
    /* renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    static class C0027a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2214(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static Drawable m2215(DrawableContainer.DrawableContainerState drawableContainerState, int i5) {
            return drawableContainerState.getChild(i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static Drawable m2216(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static boolean m2217(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m2218(Drawable drawable, boolean z5) {
            drawable.setAutoMirrored(z5);
        }
    }

    /* compiled from: DrawableCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m2219(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2220(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static ColorFilter m2221(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m2222(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m2223(Drawable drawable, float f5, float f6) {
            drawable.setHotspot(f5, f6);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static void m2224(Drawable drawable, int i5, int i6, int i7, int i8) {
            drawable.setHotspotBounds(i5, i6, i7, i8);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static void m2225(Drawable drawable, int i5) {
            drawable.setTint(i5);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static void m2226(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static void m2227(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2228(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2229(Drawable drawable, int i5) {
            return drawable.setLayoutDirection(i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m2196(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2219(drawable, theme);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m2197(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.m2220(drawable);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m2198(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            drawable.clearColorFilter();
            return;
        }
        if (i5 < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m2198(C0027a.m2216((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof z) {
            m2198(((z) drawable).mo2234());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            Drawable m2215 = C0027a.m2215(drawableContainerState, i6);
            if (m2215 != null) {
                m2198(m2215);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static int m2199(Drawable drawable) {
        return C0027a.m2214(drawable);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static ColorFilter m2200(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.m2221(drawable);
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static int m2201(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m2228(drawable);
        }
        if (!f2683) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2682 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e5) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e5);
            }
            f2683 = true;
        }
        Method method = f2682;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e6) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e6);
                f2682 = null;
            }
        }
        return 0;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m2202(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2222(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static boolean m2203(Drawable drawable) {
        return C0027a.m2217(drawable);
    }

    @Deprecated
    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m2204(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m2205(Drawable drawable, boolean z5) {
        C0027a.m2218(drawable, z5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m2206(Drawable drawable, float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2223(drawable, f5, f6);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m2207(Drawable drawable, int i5, int i6, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2224(drawable, i5, i6, i7, i8);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static boolean m2208(Drawable drawable, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m2229(drawable, i5);
        }
        if (!f2681) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2680 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e5) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e5);
            }
            f2681 = true;
        }
        Method method = f2680;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i5));
                return true;
            } catch (Exception e6) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e6);
                f2680 = null;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: י, reason: contains not printable characters */
    public static void m2209(Drawable drawable, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2225(drawable, i5);
        } else if (drawable instanceof y) {
            ((y) drawable).setTint(i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ـ, reason: contains not printable characters */
    public static void m2210(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2226(drawable, colorStateList);
        } else if (drawable instanceof y) {
            ((y) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴ, reason: contains not printable characters */
    public static void m2211(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2227(drawable, mode);
        } else if (drawable instanceof y) {
            ((y) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᐧ, reason: contains not printable characters */
    public static <T extends Drawable> T m2212(Drawable drawable) {
        return drawable instanceof z ? (T) ((z) drawable).mo2234() : drawable;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static Drawable m2213(Drawable drawable) {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 23 ? drawable : i5 >= 21 ? !(drawable instanceof y) ? new c0(drawable) : drawable : !(drawable instanceof y) ? new a0(drawable) : drawable;
    }
}
