package w3;

import java.util.Arrays;
import java.util.List;

/* compiled from: _ArraysJvm.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
class i extends h {
    /* renamed from: ʼ, reason: contains not printable characters */
    public static final <T> List<T> m12537(T[] tArr) {
        f4.k.m8623(tArr, "<this>");
        List<T> m12550 = k.m12550(tArr);
        f4.k.m8622(m12550, "asList(this)");
        return m12550;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final <T> T[] m12538(T[] tArr, T[] tArr2, int i5, int i6, int i7) {
        f4.k.m8623(tArr, "<this>");
        f4.k.m8623(tArr2, "destination");
        System.arraycopy(tArr, i6, tArr2, i5, i7 - i6);
        return tArr2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static /* synthetic */ Object[] m12539(Object[] objArr, Object[] objArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = objArr.length;
        }
        return m12538(objArr, objArr2, i5, i6, i7);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final <T> void m12540(T[] tArr, T t5, int i5, int i6) {
        f4.k.m8623(tArr, "<this>");
        Arrays.fill(tArr, i5, i6, t5);
    }
}
