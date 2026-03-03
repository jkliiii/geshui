package w3;

import java.lang.reflect.Array;

/* compiled from: ArraysJVM.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
class g {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final <T> T[] m12536(T[] tArr, int i5) {
        f4.k.m8623(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i5);
        f4.k.m8621(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }
}
