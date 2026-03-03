package w4;

import java.util.List;
import s4.a0;
import s4.l;
import s4.r;
import s4.s;

/* compiled from: HttpHeaders.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final c5.f f12062 = c5.f.m5920("\"\\");

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final c5.f f12063 = c5.f.m5920("\t ,=");

    /* renamed from: ʻ, reason: contains not printable characters */
    public static long m12595(r rVar) {
        return m12602(rVar.m11878("Content-Length"));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static long m12596(a0 a0Var) {
        return m12595(a0Var.m11736());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m12597(a0 a0Var) {
        if (a0Var.m11734().m12009().equals("HEAD")) {
            return false;
        }
        int m11738 = a0Var.m11738();
        return (((m11738 >= 100 && m11738 < 200) || m11738 == 204 || m11738 == 304) && m12596(a0Var) == -1 && !"chunked".equalsIgnoreCase(a0Var.m11740("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static int m12598(String str, int i5) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m12599(l lVar, s sVar, r rVar) {
        if (lVar == l.f11108) {
            return;
        }
        List<s4.k> m11828 = s4.k.m11828(sVar, rVar);
        if (m11828.isEmpty()) {
            return;
        }
        lVar.mo11836(sVar, m11828);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static int m12600(String str, int i5, String str2) {
        while (i5 < str.length() && str2.indexOf(str.charAt(i5)) == -1) {
            i5++;
        }
        return i5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static int m12601(String str, int i5) {
        char charAt;
        while (i5 < str.length() && ((charAt = str.charAt(i5)) == ' ' || charAt == '\t')) {
            i5++;
        }
        return i5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static long m12602(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
