package m;

/* compiled from: ContainerHelpers.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final int[] f9045 = new int[0];

    /* renamed from: ʼ, reason: contains not printable characters */
    static final long[] f9046 = new long[0];

    /* renamed from: ʽ, reason: contains not printable characters */
    static final Object[] f9047 = new Object[0];

    /* renamed from: ʻ, reason: contains not printable characters */
    static int m9785(int[] iArr, int i5, int i6) {
        int i7 = i5 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int i10 = iArr[i9];
            if (i10 < i6) {
                i8 = i9 + 1;
            } else {
                if (i10 <= i6) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return i8 ^ (-1);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static int m9786(long[] jArr, int i5, long j5) {
        int i6 = i5 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            long j6 = jArr[i8];
            if (j6 < j5) {
                i7 = i8 + 1;
            } else {
                if (j6 <= j5) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return i7 ^ (-1);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m9787(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static int m9788(int i5) {
        for (int i6 = 4; i6 < 32; i6++) {
            int i7 = (1 << i6) - 12;
            if (i5 <= i7) {
                return i7;
            }
        }
        return i5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static int m9789(int i5) {
        return m9788(i5 * 4) / 4;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static int m9790(int i5) {
        return m9788(i5 * 8) / 8;
    }
}
