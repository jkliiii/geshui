package k4;

import f4.k;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a<T> implements b<T> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final AtomicReference<b<T>> f8893;

    public a(b<? extends T> bVar) {
        k.m8623(bVar, "sequence");
        this.f8893 = new AtomicReference<>(bVar);
    }

    @Override // k4.b
    public Iterator<T> iterator() {
        b<T> andSet = this.f8893.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
