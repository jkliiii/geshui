package w3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends i {
    /* renamed from: ˆ, reason: contains not printable characters */
    public static final <T> boolean m12541(T[] tArr, T t5) {
        f4.k.m8623(tArr, "<this>");
        return m12545(tArr, t5) >= 0;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static <T> List<T> m12542(T[] tArr) {
        f4.k.m8623(tArr, "<this>");
        return (List) m12543(tArr, new ArrayList());
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final <C extends Collection<? super T>, T> C m12543(T[] tArr, C c6) {
        f4.k.m8623(tArr, "<this>");
        f4.k.m8623(c6, "destination");
        for (T t5 : tArr) {
            if (t5 != null) {
                c6.add(t5);
            }
        }
        return c6;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final <T> int m12544(T[] tArr) {
        f4.k.m8623(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final <T> int m12545(T[] tArr, T t5) {
        f4.k.m8623(tArr, "<this>");
        int i5 = 0;
        if (t5 == null) {
            int length = tArr.length;
            while (i5 < length) {
                if (tArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i5 < length2) {
            if (f4.k.m8619(t5, tArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static char m12546(char[] cArr) {
        f4.k.m8623(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static <T> T m12547(T[] tArr) {
        f4.k.m8623(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static <T> List<T> m12548(T[] tArr) {
        f4.k.m8623(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m12549(tArr) : m.m12560(tArr[0]) : n.m12562();
    }

    /* renamed from: י, reason: contains not printable characters */
    public static final <T> List<T> m12549(T[] tArr) {
        f4.k.m8623(tArr, "<this>");
        return new ArrayList(n.m12561(tArr));
    }
}
