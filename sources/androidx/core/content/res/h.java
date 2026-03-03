package androidx.core.content.res;

import java.lang.reflect.Array;

/* compiled from: GrowingArrayUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class h {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static int[] m2103(int[] iArr, int i5, int i6) {
        if (i5 + 1 > iArr.length) {
            int[] iArr2 = new int[m2105(i5)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            iArr = iArr2;
        }
        iArr[i5] = i6;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: ʼ, reason: contains not printable characters */
    public static <T> T[] m2104(T[] tArr, int i5, T t5) {
        if (i5 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m2105(i5));
            System.arraycopy(tArr, 0, r02, 0, i5);
            tArr = r02;
        }
        tArr[i5] = t5;
        return tArr;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m2105(int i5) {
        if (i5 <= 4) {
            return 8;
        }
        return i5 * 2;
    }
}
