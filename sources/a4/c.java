package a4;

/* compiled from: progressionUtil.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {
    /* renamed from: ʻ, reason: contains not printable characters */
    private static final int m201(int i5, int i6, int i7) {
        return m203(m203(i5, i7) - m203(i6, i7), i7);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final int m202(int i5, int i6, int i7) {
        if (i7 > 0) {
            return i5 >= i6 ? i6 : i6 - m201(i6, i5, i7);
        }
        if (i7 < 0) {
            return i5 <= i6 ? i6 : i6 + m201(i5, i6, -i7);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final int m203(int i5, int i6) {
        int i7 = i5 % i6;
        return i7 >= 0 ? i7 : i7 + i6;
    }
}
