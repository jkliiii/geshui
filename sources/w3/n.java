package w3;

import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n extends m {
    /* renamed from: ʽ, reason: contains not printable characters */
    public static final <T> Collection<T> m12561(T[] tArr) {
        f4.k.m8623(tArr, "<this>");
        return new d(tArr, false);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static <T> List<T> m12562() {
        return x.f12053;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static <T> int m12563(List<? extends T> list) {
        f4.k.m8623(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static <T> List<T> m12564(T... tArr) {
        f4.k.m8623(tArr, "elements");
        return tArr.length > 0 ? i.m12537(tArr) : m12562();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˈ, reason: contains not printable characters */
    public static <T> List<T> m12565(List<? extends T> list) {
        f4.k.m8623(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : m.m12560(list.get(0)) : m12562();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m12566() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
