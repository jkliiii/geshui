package x3;

import e4.p;
import f4.k;
import x3.e;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a implements e.a {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final e.b<?> f12386;

    public a(e.b<?> bVar) {
        k.m8623(bVar, "key");
        this.f12386 = bVar;
    }

    @Override // x3.e.a
    public e.b<?> getKey() {
        return this.f12386;
    }

    @Override // x3.e
    /* renamed from: ˆ */
    public <E extends e.a> E mo10126(e.b<E> bVar) {
        return (E) e.a.C0176a.m12821(this, bVar);
    }

    @Override // x3.e
    /* renamed from: ˎ */
    public <R> R mo10127(R r5, p<? super R, ? super e.a, ? extends R> pVar) {
        return (R) e.a.C0176a.m12820(this, r5, pVar);
    }
}
