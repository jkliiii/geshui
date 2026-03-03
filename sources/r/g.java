package r;

import r.f;

/* compiled from: DimensionDependency.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g extends f {

    /* renamed from: ˑ, reason: contains not printable characters */
    public int f10717;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f10700 = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f10700 = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // r.f
    /* renamed from: ʾ */
    public void mo11587(int i5) {
        if (this.f10705) {
            return;
        }
        this.f10705 = true;
        this.f10702 = i5;
        for (d dVar : this.f10706) {
            dVar.mo11565(dVar);
        }
    }
}
