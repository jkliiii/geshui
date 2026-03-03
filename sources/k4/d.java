package k4;

import java.util.Iterator;
import v3.p;

/* compiled from: SequenceBuilder.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class d<T> {
    /* renamed from: ʻ */
    public abstract Object mo9538(T t5, x3.c<? super p> cVar);

    /* renamed from: ʼ */
    public abstract Object mo9539(Iterator<? extends T> it, x3.c<? super p> cVar);

    /* renamed from: ʽ, reason: contains not printable characters */
    public final Object m9542(b<? extends T> bVar, x3.c<? super p> cVar) {
        Object mo9539 = mo9539(bVar.iterator(), cVar);
        return mo9539 == y3.d.m12938() ? mo9539 : p.f11735;
    }
}
