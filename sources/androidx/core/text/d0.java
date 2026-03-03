package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: TextUtilsCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Locale f2840 = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* compiled from: TextUtilsCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2535(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m2534(Locale locale) {
        return a.m2535(locale);
    }
}
