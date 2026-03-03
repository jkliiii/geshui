package q4;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final /* synthetic */ class r {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final int m11530(String str, int i5, int i6, int i7) {
        return (int) p.m11523(str, i5, i6, i7);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final long m11531(String str, long j5, long j6, long j7) {
        String m11524 = p.m11524(str);
        if (m11524 == null) {
            return j5;
        }
        Long m9751 = l4.k.m9751(m11524);
        if (m9751 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m11524 + '\'').toString());
        }
        long longValue = m9751.longValue();
        boolean z5 = false;
        if (j6 <= longValue && longValue <= j7) {
            z5 = true;
        }
        if (z5) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j7 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final String m11532(String str, String str2) {
        String m11524 = p.m11524(str);
        return m11524 == null ? str2 : m11524;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static /* synthetic */ int m11533(String str, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i6 = 1;
        }
        if ((i8 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return p.m11522(str, i5, i6, i7);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static /* synthetic */ long m11534(String str, long j5, long j6, long j7, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            j6 = 1;
        }
        long j8 = j6;
        if ((i5 & 8) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return p.m11523(str, j5, j8, j7);
    }
}
