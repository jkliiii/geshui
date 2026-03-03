package l4;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversions.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k extends j {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static Long m9751(String str) {
        f4.k.m8623(str, "<this>");
        return m9752(str, 10);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final Long m9752(String str, int i5) {
        boolean z5;
        f4.k.m8623(str, "<this>");
        a.m9745(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        long j5 = -9223372036854775807L;
        if (f4.k.m8624(charAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j5 = Long.MIN_VALUE;
                i6 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                i6 = 1;
                z5 = false;
            }
        } else {
            z5 = false;
        }
        long j6 = -256204778801521550L;
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i6 < length) {
            int m9746 = a.m9746(str.charAt(i6), i5);
            if (m9746 < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 == j6) {
                    j8 = j5 / i5;
                    if (j7 < j8) {
                    }
                }
                return null;
            }
            long j9 = j7 * i5;
            long j10 = m9746;
            if (j9 < j5 + j10) {
                return null;
            }
            j7 = j9 - j10;
            i6++;
            j6 = -256204778801521550L;
        }
        return z5 ? Long.valueOf(j7) : Long.valueOf(-j7);
    }
}
