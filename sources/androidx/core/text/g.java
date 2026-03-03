package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Method f2841;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Method f2842;

    /* compiled from: ICUCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static String m2544(Locale locale) {
            return locale.getScript();
        }
    }

    /* compiled from: ICUCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static ULocale m2545(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static ULocale m2546(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static String m2547(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            if (i5 < 24) {
                try {
                    f2842 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e5) {
                    throw new IllegalStateException(e5);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f2841 = cls.getMethod("getScript", String.class);
            f2842 = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e6) {
            f2841 = null;
            f2842 = null;
            Log.w("ICUCompat", e6);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m2541(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f2842;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e5) {
            Log.w("ICUCompat", e5);
        } catch (InvocationTargetException e6) {
            Log.w("ICUCompat", e6);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m2542(String str) {
        try {
            Method method = f2841;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e5) {
            Log.w("ICUCompat", e5);
        } catch (InvocationTargetException e6) {
            Log.w("ICUCompat", e6);
        }
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m2543(Locale locale) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            return b.m2547(b.m2545(b.m2546(locale)));
        }
        if (i5 < 21) {
            String m2541 = m2541(locale);
            if (m2541 != null) {
                return m2542(m2541);
            }
            return null;
        }
        try {
            return a.m2544((Locale) f2842.invoke(null, locale));
        } catch (IllegalAccessException e5) {
            Log.w("ICUCompat", e5);
            return a.m2544(locale);
        } catch (InvocationTargetException e6) {
            Log.w("ICUCompat", e6);
            return a.m2544(locale);
        }
    }
}
