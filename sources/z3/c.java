package z3;

import f4.k;
import x3.e;

/* compiled from: ContinuationImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c extends a {

    /* renamed from: ʿ, reason: contains not printable characters */
    private final x3.e f12796;

    /* renamed from: ˆ, reason: contains not printable characters */
    private transient x3.c<Object> f12797;

    public c(x3.c<Object> cVar, x3.e eVar) {
        super(cVar);
        this.f12796 = eVar;
    }

    @Override // x3.c
    public x3.e getContext() {
        x3.e eVar = this.f12796;
        k.m8620(eVar);
        return eVar;
    }

    @Override // z3.a
    /* renamed from: ˎ */
    protected void mo13186() {
        x3.c<?> cVar = this.f12797;
        if (cVar != null && cVar != this) {
            e.a mo10126 = getContext().mo10126(x3.d.f12389);
            k.m8620(mo10126);
            ((x3.d) mo10126).mo10266(cVar);
        }
        this.f12797 = b.f12795;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final x3.c<Object> m13187() {
        x3.c<Object> cVar = this.f12797;
        if (cVar == null) {
            x3.d dVar = (x3.d) getContext().mo10126(x3.d.f12389);
            if (dVar == null || (cVar = dVar.mo10268(this)) == null) {
                cVar = this;
            }
            this.f12797 = cVar;
        }
        return cVar;
    }
}
