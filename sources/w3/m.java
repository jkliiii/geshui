package w3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final <T> Object[] m12559(T[] tArr, boolean z5) {
        f4.k.m8623(tArr, "<this>");
        if (z5 && f4.k.m8619(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        f4.k.m8622(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static <T> List<T> m12560(T t5) {
        List<T> singletonList = Collections.singletonList(t5);
        f4.k.m8622(singletonList, "singletonList(element)");
        return singletonList;
    }
}
