package r;

import java.util.Iterator;
import r.f;

/* compiled from: HelperReferences.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k extends p {
    public k(q.e eVar) {
        super(eVar);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m11602(f fVar) {
        this.f10756.f10706.add(fVar);
        fVar.f10707.add(this.f10756);
    }

    @Override // r.p, r.d
    /* renamed from: ʻ */
    public void mo11565(d dVar) {
        q.a aVar = (q.a) this.f10750;
        int m11178 = aVar.m11178();
        Iterator<f> it = this.f10756.f10707.iterator();
        int i5 = 0;
        int i6 = -1;
        while (it.hasNext()) {
            int i7 = it.next().f10702;
            if (i6 == -1 || i7 < i6) {
                i6 = i7;
            }
            if (i5 < i7) {
                i5 = i7;
            }
        }
        if (m11178 == 0 || m11178 == 2) {
            this.f10756.mo11587(i6 + aVar.m11179());
        } else {
            this.f10756.mo11587(i5 + aVar.m11179());
        }
    }

    @Override // r.p
    /* renamed from: ʾ */
    void mo11566() {
        q.e eVar = this.f10750;
        if (eVar instanceof q.a) {
            this.f10756.f10697 = true;
            q.a aVar = (q.a) eVar;
            int m11178 = aVar.m11178();
            boolean m11177 = aVar.m11177();
            int i5 = 0;
            if (m11178 == 0) {
                this.f10756.f10700 = f.a.LEFT;
                while (i5 < aVar.f10594) {
                    q.e eVar2 = aVar.f10593[i5];
                    if (m11177 || eVar2.m11322() != 8) {
                        f fVar = eVar2.f10462.f10756;
                        fVar.f10706.add(this.f10756);
                        this.f10756.f10707.add(fVar);
                    }
                    i5++;
                }
                m11602(this.f10750.f10462.f10756);
                m11602(this.f10750.f10462.f10757);
                return;
            }
            if (m11178 == 1) {
                this.f10756.f10700 = f.a.RIGHT;
                while (i5 < aVar.f10594) {
                    q.e eVar3 = aVar.f10593[i5];
                    if (m11177 || eVar3.m11322() != 8) {
                        f fVar2 = eVar3.f10462.f10757;
                        fVar2.f10706.add(this.f10756);
                        this.f10756.f10707.add(fVar2);
                    }
                    i5++;
                }
                m11602(this.f10750.f10462.f10756);
                m11602(this.f10750.f10462.f10757);
                return;
            }
            if (m11178 == 2) {
                this.f10756.f10700 = f.a.TOP;
                while (i5 < aVar.f10594) {
                    q.e eVar4 = aVar.f10593[i5];
                    if (m11177 || eVar4.m11322() != 8) {
                        f fVar3 = eVar4.f10464.f10756;
                        fVar3.f10706.add(this.f10756);
                        this.f10756.f10707.add(fVar3);
                    }
                    i5++;
                }
                m11602(this.f10750.f10464.f10756);
                m11602(this.f10750.f10464.f10757);
                return;
            }
            if (m11178 != 3) {
                return;
            }
            this.f10756.f10700 = f.a.BOTTOM;
            while (i5 < aVar.f10594) {
                q.e eVar5 = aVar.f10593[i5];
                if (m11177 || eVar5.m11322() != 8) {
                    f fVar4 = eVar5.f10464.f10757;
                    fVar4.f10706.add(this.f10756);
                    this.f10756.f10707.add(fVar4);
                }
                i5++;
            }
            m11602(this.f10750.f10464.f10756);
            m11602(this.f10750.f10464.f10757);
        }
    }

    @Override // r.p
    /* renamed from: ʿ */
    public void mo11567() {
        q.e eVar = this.f10750;
        if (eVar instanceof q.a) {
            int m11178 = ((q.a) eVar).m11178();
            if (m11178 == 0 || m11178 == 1) {
                this.f10750.m11284(this.f10756.f10702);
            } else {
                this.f10750.m11285(this.f10756.f10702);
            }
        }
    }

    @Override // r.p
    /* renamed from: ˆ */
    void mo11568() {
        this.f10751 = null;
        this.f10756.m11586();
    }

    @Override // r.p
    /* renamed from: ˑ */
    boolean mo11570() {
        return false;
    }
}
