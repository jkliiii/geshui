package s4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Headers.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class r {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String[] f11129;

    /* compiled from: Headers.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final List<String> f11130 = new ArrayList(20);

        /* renamed from: ʻ, reason: contains not printable characters */
        public a m11884(String str, String str2) {
            r.m11875(str);
            r.m11876(str2, str);
            return m11886(str, str2);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        a m11885(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? m11886(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? m11886(BuildConfig.FLAVOR, str.substring(1)) : m11886(BuildConfig.FLAVOR, str);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        a m11886(String str, String str2) {
            this.f11130.add(str);
            this.f11130.add(str2.trim());
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public r m11887() {
            return new r(this);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public a m11888(String str) {
            int i5 = 0;
            while (i5 < this.f11130.size()) {
                if (str.equalsIgnoreCase(this.f11130.get(i5))) {
                    this.f11130.remove(i5);
                    this.f11130.remove(i5);
                    i5 -= 2;
                }
                i5 += 2;
            }
            return this;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public a m11889(String str, String str2) {
            r.m11875(str);
            r.m11876(str2, str);
            m11888(str);
            m11886(str, str2);
            return this;
        }
    }

    r(a aVar) {
        List<String> list = aVar.f11130;
        this.f11129 = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m11875(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(t4.c.m12072("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i5), str));
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m11876(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(t4.c.m12072("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i5), str2, str));
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static String m11877(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).f11129, this.f11129);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11129);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m11881 = m11881();
        for (int i5 = 0; i5 < m11881; i5++) {
            sb.append(m11879(i5));
            sb.append(": ");
            sb.append(m11882(i5));
            sb.append("\n");
        }
        return sb.toString();
    }

    @Nullable
    /* renamed from: ʽ, reason: contains not printable characters */
    public String m11878(String str) {
        return m11877(this.f11129, str);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public String m11879(int i5) {
        return this.f11129[i5 * 2];
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public a m11880() {
        a aVar = new a();
        Collections.addAll(aVar.f11130, this.f11129);
        return aVar;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m11881() {
        return this.f11129.length / 2;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public String m11882(int i5) {
        return this.f11129[(i5 * 2) + 1];
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public List<String> m11883(String str) {
        int m11881 = m11881();
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < m11881; i5++) {
            if (str.equalsIgnoreCase(m11879(i5))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m11882(i5));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }
}
