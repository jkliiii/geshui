package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final i f2736 = m2418(new Locale[0]);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final m f2737;

    /* compiled from: LocaleListCompat.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final Locale[] f2738 = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: ʻ, reason: contains not printable characters */
        static Locale m2427(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private static boolean m2428(Locale locale) {
            for (Locale locale2 : f2738) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static boolean m2429(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m2428(locale) || m2428(locale2)) {
                return false;
            }
            String m2543 = androidx.core.text.g.m2543(locale);
            if (!m2543.isEmpty()) {
                return m2543.equals(androidx.core.text.g.m2543(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* compiled from: LocaleListCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static LocaleList m2430(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static LocaleList m2431() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static LocaleList m2432() {
            return LocaleList.getDefault();
        }
    }

    private i(m mVar) {
        this.f2737 = mVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static i m2418(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m2422(b.m2430(localeArr)) : new i(new l(localeArr));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static Locale m2419(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static i m2420(String str) {
        if (str == null || str.isEmpty()) {
            return m2421();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i5 = 0; i5 < length; i5++) {
            localeArr[i5] = Build.VERSION.SDK_INT >= 21 ? a.m2427(split[i5]) : m2419(split[i5]);
        }
        return m2418(localeArr);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static i m2421() {
        return f2736;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static i m2422(LocaleList localeList) {
        return new i(new s(localeList));
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f2737.equals(((i) obj).f2737);
    }

    public int hashCode() {
        return this.f2737.hashCode();
    }

    public String toString() {
        return this.f2737.toString();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public Locale m2423(int i5) {
        return this.f2737.get(i5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m2424() {
        return this.f2737.isEmpty();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m2425() {
        return this.f2737.size();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public String m2426() {
        return this.f2737.mo2436();
    }
}
