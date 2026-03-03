package x3;

import e4.l;
import f4.k;
import x3.e;
import x3.e.a;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b<B extends e.a, E extends B> implements e.b<E> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final l<e.a, E> f12387;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final e.b<?> f12388;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [x3.e$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [e4.l<? super x3.e$a, ? extends E extends B>, e4.l<x3.e$a, E extends B>, java.lang.Object] */
    public b(e.b<B> bVar, l<? super e.a, ? extends E> lVar) {
        k.m8623(bVar, "baseKey");
        k.m8623(lVar, "safeCast");
        this.f12387 = lVar;
        this.f12388 = bVar instanceof b ? (e.b<B>) ((b) bVar).f12388 : bVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final boolean m12817(e.b<?> bVar) {
        k.m8623(bVar, "key");
        return bVar == this || this.f12388 == bVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lx3/e$a;)TE; */
    /* renamed from: ʼ, reason: contains not printable characters */
    public final e.a m12818(e.a aVar) {
        k.m8623(aVar, "element");
        return (e.a) this.f12387.mo430(aVar);
    }
}
