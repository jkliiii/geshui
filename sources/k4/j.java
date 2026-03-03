package k4;

import f4.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import w3.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sequences.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends i {
    /* renamed from: ʿ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m9550(b<? extends T> bVar, C c6) {
        k.m8623(bVar, "<this>");
        k.m8623(c6, "destination");
        Iterator<? extends T> it = bVar.iterator();
        while (it.hasNext()) {
            c6.add(it.next());
        }
        return c6;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static <T> List<T> m9551(b<? extends T> bVar) {
        k.m8623(bVar, "<this>");
        return n.m12565(m9552(bVar));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final <T> List<T> m9552(b<? extends T> bVar) {
        k.m8623(bVar, "<this>");
        return (List) m9550(bVar, new ArrayList());
    }
}
