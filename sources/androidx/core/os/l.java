package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class l implements m {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Locale[] f2739 = new Locale[0];

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final Locale f2740 = new Locale("en", "XA");

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Locale f2741 = new Locale("ar", "XB");

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final Locale f2742 = i.m2419("en-Latn");

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Locale[] f2743;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f2744;

    l(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2743 = f2739;
            this.f2744 = BuildConfig.FLAVOR;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < localeArr.length; i5++) {
            Locale locale = localeArr[i5];
            if (locale == null) {
                throw new NullPointerException("list[" + i5 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                m2435(sb, locale2);
                if (i5 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f2743 = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f2744 = sb.toString();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m2435(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        Locale[] localeArr = ((l) obj).f2743;
        if (this.f2743.length != localeArr.length) {
            return false;
        }
        int i5 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2743;
            if (i5 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i5].equals(localeArr[i5])) {
                return false;
            }
            i5++;
        }
    }

    @Override // androidx.core.os.m
    public Locale get(int i5) {
        if (i5 >= 0) {
            Locale[] localeArr = this.f2743;
            if (i5 < localeArr.length) {
                return localeArr[i5];
            }
        }
        return null;
    }

    public int hashCode() {
        int i5 = 1;
        for (Locale locale : this.f2743) {
            i5 = (i5 * 31) + locale.hashCode();
        }
        return i5;
    }

    @Override // androidx.core.os.m
    public boolean isEmpty() {
        return this.f2743.length == 0;
    }

    @Override // androidx.core.os.m
    public int size() {
        return this.f2743.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i5 = 0;
        while (true) {
            Locale[] localeArr = this.f2743;
            if (i5 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i5]);
            if (i5 < this.f2743.length - 1) {
                sb.append(',');
            }
            i5++;
        }
    }

    @Override // androidx.core.os.m
    /* renamed from: ʻ, reason: contains not printable characters */
    public String mo2436() {
        return this.f2744;
    }

    @Override // androidx.core.os.m
    /* renamed from: ʼ, reason: contains not printable characters */
    public Object mo2437() {
        return null;
    }
}
