package s4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: Cookie.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Pattern f11095 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Pattern f11096 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Pattern f11097 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final Pattern f11098 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String f11099;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f11100;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final long f11101;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f11102;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final String f11103;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final boolean f11104;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final boolean f11105;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final boolean f11106;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final boolean f11107;

    private k(String str, String str2, long j5, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f11099 = str;
        this.f11100 = str2;
        this.f11101 = j5;
        this.f11102 = str3;
        this.f11103 = str4;
        this.f11104 = z5;
        this.f11105 = z6;
        this.f11107 = z7;
        this.f11106 = z8;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int m11824(String str, int i5, int i6, boolean z5) {
        while (i5 < i6) {
            char charAt = str.charAt(i5);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z5)) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m11825(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !t4.c.m12060(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0 A[PHI: r0
  0x00c0: PHI (r0v15 long) = (r0v2 long), (r0v5 long) binds: [B:50:0x00be, B:83:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @javax.annotation.Nullable
    /* renamed from: ʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static s4.k m11826(long r23, s4.s r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.k.m11826(long, s4.s, java.lang.String):s4.k");
    }

    @Nullable
    /* renamed from: ʿ, reason: contains not printable characters */
    public static k m11827(s sVar, String str) {
        return m11826(System.currentTimeMillis(), sVar, str);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static List<k> m11828(s sVar, r rVar) {
        List<String> m11883 = rVar.m11883("Set-Cookie");
        int size = m11883.size();
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            k m11827 = m11827(sVar, m11883.get(i5));
            if (m11827 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m11827);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static String m11829(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String m12055 = t4.c.m12055(str);
        if (m12055 != null) {
            return m12055;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* renamed from: ˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m11830(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.k.m11830(java.lang.String, int, int):long");
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static long m11831(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e5) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e5;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f11099.equals(this.f11099) && kVar.f11100.equals(this.f11100) && kVar.f11102.equals(this.f11102) && kVar.f11103.equals(this.f11103) && kVar.f11101 == this.f11101 && kVar.f11104 == this.f11104 && kVar.f11105 == this.f11105 && kVar.f11106 == this.f11106 && kVar.f11107 == this.f11107;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f11099.hashCode()) * 31) + this.f11100.hashCode()) * 31) + this.f11102.hashCode()) * 31) + this.f11103.hashCode()) * 31;
        long j5 = this.f11101;
        return ((((((((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (!this.f11104 ? 1 : 0)) * 31) + (!this.f11105 ? 1 : 0)) * 31) + (!this.f11106 ? 1 : 0)) * 31) + (!this.f11107 ? 1 : 0);
    }

    public String toString() {
        return m11833(false);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public String m11832() {
        return this.f11099;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    String m11833(boolean z5) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11099);
        sb.append('=');
        sb.append(this.f11100);
        if (this.f11106) {
            if (this.f11101 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(w4.d.m12592(new Date(this.f11101)));
            }
        }
        if (!this.f11107) {
            sb.append("; domain=");
            if (z5) {
                sb.append(".");
            }
            sb.append(this.f11102);
        }
        sb.append("; path=");
        sb.append(this.f11103);
        if (this.f11104) {
            sb.append("; secure");
        }
        if (this.f11105) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public String m11834() {
        return this.f11100;
    }
}
