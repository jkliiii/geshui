package w3;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o extends n {
    /* renamed from: ˊ, reason: contains not printable characters */
    public static <T> int m12567(Iterable<? extends T> iterable, int i5) {
        f4.k.m8623(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i5;
    }
}
