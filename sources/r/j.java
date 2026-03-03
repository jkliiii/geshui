package r;

/* compiled from: GuidelineReference.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class j extends p {
    public j(q.e eVar) {
        super(eVar);
        eVar.f10462.mo11568();
        eVar.f10464.mo11568();
        this.f10754 = ((q.h) eVar).m11418();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m11601(f fVar) {
        this.f10756.f10706.add(fVar);
        fVar.f10707.add(this.f10756);
    }

    @Override // r.p, r.d
    /* renamed from: ʻ */
    public void mo11565(d dVar) {
        f fVar = this.f10756;
        if (fVar.f10698 && !fVar.f10705) {
            this.f10756.mo11587((int) ((fVar.f10707.get(0).f10702 * ((q.h) this.f10750).m11421()) + 0.5f));
        }
    }

    @Override // r.p
    /* renamed from: ʾ */
    void mo11566() {
        q.h hVar = (q.h) this.f10750;
        int m11419 = hVar.m11419();
        int m11420 = hVar.m11420();
        hVar.m11421();
        if (hVar.m11418() == 1) {
            if (m11419 != -1) {
                this.f10756.f10707.add(this.f10750.f10420.f10462.f10756);
                this.f10750.f10420.f10462.f10756.f10706.add(this.f10756);
                this.f10756.f10701 = m11419;
            } else if (m11420 != -1) {
                this.f10756.f10707.add(this.f10750.f10420.f10462.f10757);
                this.f10750.f10420.f10462.f10757.f10706.add(this.f10756);
                this.f10756.f10701 = -m11420;
            } else {
                f fVar = this.f10756;
                fVar.f10697 = true;
                fVar.f10707.add(this.f10750.f10420.f10462.f10757);
                this.f10750.f10420.f10462.f10757.f10706.add(this.f10756);
            }
            m11601(this.f10750.f10462.f10756);
            m11601(this.f10750.f10462.f10757);
            return;
        }
        if (m11419 != -1) {
            this.f10756.f10707.add(this.f10750.f10420.f10464.f10756);
            this.f10750.f10420.f10464.f10756.f10706.add(this.f10756);
            this.f10756.f10701 = m11419;
        } else if (m11420 != -1) {
            this.f10756.f10707.add(this.f10750.f10420.f10464.f10757);
            this.f10750.f10420.f10464.f10757.f10706.add(this.f10756);
            this.f10756.f10701 = -m11420;
        } else {
            f fVar2 = this.f10756;
            fVar2.f10697 = true;
            fVar2.f10707.add(this.f10750.f10420.f10464.f10757);
            this.f10750.f10420.f10464.f10757.f10706.add(this.f10756);
        }
        m11601(this.f10750.f10464.f10756);
        m11601(this.f10750.f10464.f10757);
    }

    @Override // r.p
    /* renamed from: ʿ */
    public void mo11567() {
        if (((q.h) this.f10750).m11418() == 1) {
            this.f10750.m11284(this.f10756.f10702);
        } else {
            this.f10750.m11285(this.f10756.f10702);
        }
    }

    @Override // r.p
    /* renamed from: ˆ */
    void mo11568() {
        this.f10756.m11586();
    }

    @Override // r.p
    /* renamed from: ˑ */
    boolean mo11570() {
        return false;
    }
}
