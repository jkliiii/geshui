package k2;

import k2.v;

/* compiled from: FilteredDataEmitter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x extends t implements l2.d, v {

    /* renamed from: ʾ, reason: contains not printable characters */
    private s f8857;

    /* renamed from: ʿ, reason: contains not printable characters */
    private v.a f8858;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f8859;

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f8860;

    /* compiled from: FilteredDataEmitter.java */
    class a implements l2.a {
        a() {
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            x.this.mo9511(exc);
        }
    }

    @Override // k2.s
    public void close() {
        this.f8860 = true;
        s sVar = this.f8857;
        if (sVar != null) {
            sVar.close();
        }
    }

    @Override // k2.s, k2.u
    /* renamed from: ʻ */
    public k mo9358() {
        return this.f8857.mo9358();
    }

    @Override // k2.s
    /* renamed from: ʽ */
    public void mo9359() {
        this.f8857.mo9359();
    }

    @Override // k2.v
    /* renamed from: ˈ */
    public void mo9512(s sVar) {
        s sVar2 = this.f8857;
        if (sVar2 != null) {
            sVar2.mo9362(null);
        }
        this.f8857 = sVar;
        sVar.mo9362(this);
        this.f8857.mo9366(new a());
    }

    @Override // k2.s
    /* renamed from: ـ */
    public void mo9365() {
        this.f8857.mo9365();
    }

    @Override // k2.v
    /* renamed from: ᐧᐧ */
    public void mo9513(v.a aVar) {
        this.f8858 = aVar;
    }

    @Override // k2.s
    /* renamed from: ᵔ */
    public boolean mo9370() {
        return this.f8857.mo9370();
    }

    @Override // l2.d
    /* renamed from: ᵢ */
    public void mo9377(s sVar, q qVar) {
        if (this.f8860) {
            qVar.m9507();
            return;
        }
        if (qVar != null) {
            this.f8859 += qVar.m9500();
        }
        f0.m9422(this, qVar);
        if (qVar != null) {
            this.f8859 -= qVar.m9500();
        }
        v.a aVar = this.f8858;
        if (aVar == null || qVar == null) {
            return;
        }
        aVar.mo9514(this.f8859);
    }

    @Override // k2.t, k2.s
    /* renamed from: ⁱ */
    public String mo9372() {
        s sVar = this.f8857;
        if (sVar == null) {
            return null;
        }
        return sVar.mo9372();
    }
}
