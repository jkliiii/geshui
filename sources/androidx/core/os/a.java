package androidx.core.os;

import android.os.Build;
import java.util.Locale;

/* compiled from: BuildCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {
    /* renamed from: ʻ, reason: contains not printable characters */
    protected static boolean m2402(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m2403() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m2404() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 33 || (i5 >= 32 && m2402("Tiramisu", Build.VERSION.CODENAME));
    }
}
