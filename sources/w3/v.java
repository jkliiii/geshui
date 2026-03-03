package w3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Collections.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v extends u {
    /* renamed from: ˋ, reason: contains not printable characters */
    public static <T, R> List<v3.i<T, R>> m12568(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        f4.k.m8623(iterable, "<this>");
        f4.k.m8623(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(o.m12567(iterable, 10), o.m12567(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(v3.m.m12385(it.next(), it2.next()));
        }
        return arrayList;
    }
}
