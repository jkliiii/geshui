package r;

import q.d;
import q.e;
import r.f;
import r.p;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n extends p {

    /* renamed from: ˎ, reason: contains not printable characters */
    public f f10731;

    /* renamed from: ˏ, reason: contains not printable characters */
    g f10732;

    /* compiled from: VerticalWidgetRun.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10733;

        static {
            int[] iArr = new int[p.b.values().length];
            f10733 = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10733[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10733[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(q.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f10731 = fVar;
        this.f10732 = null;
        this.f10756.f10700 = f.a.TOP;
        this.f10757.f10700 = f.a.BOTTOM;
        fVar.f10700 = f.a.BASELINE;
        this.f10754 = 1;
    }

    public String toString() {
        return "VerticalRun " + this.f10750.m11316();
    }

    @Override // r.p, r.d
    /* renamed from: ʻ */
    public void mo11565(d dVar) {
        float f5;
        float m11319;
        float f6;
        int i5;
        int i6 = a.f10733[this.f10758.ordinal()];
        if (i6 == 1) {
            m11629(dVar);
        } else if (i6 == 2) {
            m11628(dVar);
        } else if (i6 == 3) {
            q.e eVar = this.f10750;
            m11627(dVar, eVar.f10479, eVar.f10481, 1);
            return;
        }
        g gVar = this.f10753;
        if (gVar.f10698 && !gVar.f10705 && this.f10752 == e.b.MATCH_CONSTRAINT) {
            q.e eVar2 = this.f10750;
            int i7 = eVar2.f10500;
            if (i7 == 2) {
                q.e m11294 = eVar2.m11294();
                if (m11294 != null) {
                    if (m11294.f10464.f10753.f10705) {
                        this.f10753.mo11587((int) ((r7.f10702 * this.f10750.f10444) + 0.5f));
                    }
                }
            } else if (i7 == 3 && eVar2.f10462.f10753.f10705) {
                int m11321 = eVar2.m11321();
                if (m11321 == -1) {
                    q.e eVar3 = this.f10750;
                    f5 = eVar3.f10462.f10753.f10702;
                    m11319 = eVar3.m11319();
                } else if (m11321 == 0) {
                    f6 = r7.f10462.f10753.f10702 * this.f10750.m11319();
                    i5 = (int) (f6 + 0.5f);
                    this.f10753.mo11587(i5);
                } else if (m11321 != 1) {
                    i5 = 0;
                    this.f10753.mo11587(i5);
                } else {
                    q.e eVar4 = this.f10750;
                    f5 = eVar4.f10462.f10753.f10702;
                    m11319 = eVar4.m11319();
                }
                f6 = f5 / m11319;
                i5 = (int) (f6 + 0.5f);
                this.f10753.mo11587(i5);
            }
        }
        f fVar = this.f10756;
        if (fVar.f10698) {
            f fVar2 = this.f10757;
            if (fVar2.f10698) {
                if (fVar.f10705 && fVar2.f10705 && this.f10753.f10705) {
                    return;
                }
                if (!this.f10753.f10705 && this.f10752 == e.b.MATCH_CONSTRAINT) {
                    q.e eVar5 = this.f10750;
                    if (eVar5.f10498 == 0 && !eVar5.m11233()) {
                        f fVar3 = this.f10756.f10707.get(0);
                        f fVar4 = this.f10757.f10707.get(0);
                        int i8 = fVar3.f10702;
                        f fVar5 = this.f10756;
                        int i9 = i8 + fVar5.f10701;
                        int i10 = fVar4.f10702 + this.f10757.f10701;
                        fVar5.mo11587(i9);
                        this.f10757.mo11587(i10);
                        this.f10753.mo11587(i10 - i9);
                        return;
                    }
                }
                if (!this.f10753.f10705 && this.f10752 == e.b.MATCH_CONSTRAINT && this.f10749 == 1 && this.f10756.f10707.size() > 0 && this.f10757.f10707.size() > 0) {
                    f fVar6 = this.f10756.f10707.get(0);
                    int i11 = (this.f10757.f10707.get(0).f10702 + this.f10757.f10701) - (fVar6.f10702 + this.f10756.f10701);
                    g gVar2 = this.f10753;
                    int i12 = gVar2.f10717;
                    if (i11 < i12) {
                        gVar2.mo11587(i11);
                    } else {
                        gVar2.mo11587(i12);
                    }
                }
                if (this.f10753.f10705 && this.f10756.f10707.size() > 0 && this.f10757.f10707.size() > 0) {
                    f fVar7 = this.f10756.f10707.get(0);
                    f fVar8 = this.f10757.f10707.get(0);
                    int i13 = fVar7.f10702 + this.f10756.f10701;
                    int i14 = fVar8.f10702 + this.f10757.f10701;
                    float m11305 = this.f10750.m11305();
                    if (fVar7 == fVar8) {
                        i13 = fVar7.f10702;
                        i14 = fVar8.f10702;
                        m11305 = 0.5f;
                    }
                    this.f10756.mo11587((int) (i13 + 0.5f + (((i14 - i13) - this.f10753.f10702) * m11305)));
                    this.f10757.mo11587(this.f10756.f10702 + this.f10753.f10702);
                }
            }
        }
    }

    @Override // r.p
    /* renamed from: ʾ */
    void mo11566() {
        q.e m11294;
        q.e m112942;
        q.e eVar = this.f10750;
        if (eVar.f10416) {
            this.f10753.mo11587(eVar.m11323());
        }
        if (!this.f10753.f10705) {
            this.f10752 = this.f10750.m11318();
            if (this.f10750.m11223()) {
                this.f10732 = new r.a(this);
            }
            e.b bVar = this.f10752;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (m112942 = this.f10750.m11294()) != null && m112942.m11318() == e.b.FIXED) {
                    int m11323 = (m112942.m11323() - this.f10750.f10479.m11197()) - this.f10750.f10481.m11197();
                    m11621(this.f10756, m112942.f10464.f10756, this.f10750.f10479.m11197());
                    m11621(this.f10757, m112942.f10464.f10757, -this.f10750.f10481.m11197());
                    this.f10753.mo11587(m11323);
                    return;
                }
                if (this.f10752 == e.b.FIXED) {
                    this.f10753.mo11587(this.f10750.m11323());
                }
            }
        } else if (this.f10752 == e.b.MATCH_PARENT && (m11294 = this.f10750.m11294()) != null && m11294.m11318() == e.b.FIXED) {
            m11621(this.f10756, m11294.f10464.f10756, this.f10750.f10479.m11197());
            m11621(this.f10757, m11294.f10464.f10757, -this.f10750.f10481.m11197());
            return;
        }
        g gVar = this.f10753;
        boolean z5 = gVar.f10705;
        if (z5) {
            q.e eVar2 = this.f10750;
            if (eVar2.f10416) {
                q.d[] dVarArr = eVar2.f10485;
                q.d dVar = dVarArr[2];
                q.d dVar2 = dVar.f10400;
                if (dVar2 != null && dVarArr[3].f10400 != null) {
                    if (eVar2.m11233()) {
                        this.f10756.f10701 = this.f10750.f10485[2].m11197();
                        this.f10757.f10701 = -this.f10750.f10485[3].m11197();
                    } else {
                        f m11624 = m11624(this.f10750.f10485[2]);
                        if (m11624 != null) {
                            m11621(this.f10756, m11624, this.f10750.f10485[2].m11197());
                        }
                        f m116242 = m11624(this.f10750.f10485[3]);
                        if (m116242 != null) {
                            m11621(this.f10757, m116242, -this.f10750.f10485[3].m11197());
                        }
                        this.f10756.f10697 = true;
                        this.f10757.f10697 = true;
                    }
                    if (this.f10750.m11223()) {
                        m11621(this.f10731, this.f10756, this.f10750.m11308());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f m116243 = m11624(dVar);
                    if (m116243 != null) {
                        m11621(this.f10756, m116243, this.f10750.f10485[2].m11197());
                        m11621(this.f10757, this.f10756, this.f10753.f10702);
                        if (this.f10750.m11223()) {
                            m11621(this.f10731, this.f10756, this.f10750.m11308());
                            return;
                        }
                        return;
                    }
                    return;
                }
                q.d dVar3 = dVarArr[3];
                if (dVar3.f10400 != null) {
                    f m116244 = m11624(dVar3);
                    if (m116244 != null) {
                        m11621(this.f10757, m116244, -this.f10750.f10485[3].m11197());
                        m11621(this.f10756, this.f10757, -this.f10753.f10702);
                    }
                    if (this.f10750.m11223()) {
                        m11621(this.f10731, this.f10756, this.f10750.m11308());
                        return;
                    }
                    return;
                }
                q.d dVar4 = dVarArr[4];
                if (dVar4.f10400 != null) {
                    f m116245 = m11624(dVar4);
                    if (m116245 != null) {
                        m11621(this.f10731, m116245, 0);
                        m11621(this.f10756, this.f10731, -this.f10750.m11308());
                        m11621(this.f10757, this.f10756, this.f10753.f10702);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof q.i) || eVar2.m11294() == null || this.f10750.mo11306(d.b.CENTER).f10400 != null) {
                    return;
                }
                m11621(this.f10756, this.f10750.m11294().f10464.f10756, this.f10750.m11222());
                m11621(this.f10757, this.f10756, this.f10753.f10702);
                if (this.f10750.m11223()) {
                    m11621(this.f10731, this.f10756, this.f10750.m11308());
                    return;
                }
                return;
            }
        }
        if (z5 || this.f10752 != e.b.MATCH_CONSTRAINT) {
            gVar.m11585(this);
        } else {
            q.e eVar3 = this.f10750;
            int i5 = eVar3.f10500;
            if (i5 == 2) {
                q.e m112943 = eVar3.m11294();
                if (m112943 != null) {
                    g gVar2 = m112943.f10464.f10753;
                    this.f10753.f10707.add(gVar2);
                    gVar2.f10706.add(this.f10753);
                    g gVar3 = this.f10753;
                    gVar3.f10697 = true;
                    gVar3.f10706.add(this.f10756);
                    this.f10753.f10706.add(this.f10757);
                }
            } else if (i5 == 3 && !eVar3.m11233()) {
                q.e eVar4 = this.f10750;
                if (eVar4.f10498 != 3) {
                    g gVar4 = eVar4.f10462.f10753;
                    this.f10753.f10707.add(gVar4);
                    gVar4.f10706.add(this.f10753);
                    g gVar5 = this.f10753;
                    gVar5.f10697 = true;
                    gVar5.f10706.add(this.f10756);
                    this.f10753.f10706.add(this.f10757);
                }
            }
        }
        q.e eVar5 = this.f10750;
        q.d[] dVarArr2 = eVar5.f10485;
        q.d dVar5 = dVarArr2[2];
        q.d dVar6 = dVar5.f10400;
        if (dVar6 != null && dVarArr2[3].f10400 != null) {
            if (eVar5.m11233()) {
                this.f10756.f10701 = this.f10750.f10485[2].m11197();
                this.f10757.f10701 = -this.f10750.f10485[3].m11197();
            } else {
                f m116246 = m11624(this.f10750.f10485[2]);
                f m116247 = m11624(this.f10750.f10485[3]);
                if (m116246 != null) {
                    m116246.m11585(this);
                }
                if (m116247 != null) {
                    m116247.m11585(this);
                }
                this.f10758 = p.b.CENTER;
            }
            if (this.f10750.m11223()) {
                m11622(this.f10731, this.f10756, 1, this.f10732);
            }
        } else if (dVar6 != null) {
            f m116248 = m11624(dVar5);
            if (m116248 != null) {
                m11621(this.f10756, m116248, this.f10750.f10485[2].m11197());
                m11622(this.f10757, this.f10756, 1, this.f10753);
                if (this.f10750.m11223()) {
                    m11622(this.f10731, this.f10756, 1, this.f10732);
                }
                e.b bVar2 = this.f10752;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f10750.m11319() > 0.0f) {
                    l lVar = this.f10750.f10462;
                    if (lVar.f10752 == bVar3) {
                        lVar.f10753.f10706.add(this.f10753);
                        this.f10753.f10707.add(this.f10750.f10462.f10753);
                        this.f10753.f10696 = this;
                    }
                }
            }
        } else {
            q.d dVar7 = dVarArr2[3];
            if (dVar7.f10400 != null) {
                f m116249 = m11624(dVar7);
                if (m116249 != null) {
                    m11621(this.f10757, m116249, -this.f10750.f10485[3].m11197());
                    m11622(this.f10756, this.f10757, -1, this.f10753);
                    if (this.f10750.m11223()) {
                        m11622(this.f10731, this.f10756, 1, this.f10732);
                    }
                }
            } else {
                q.d dVar8 = dVarArr2[4];
                if (dVar8.f10400 != null) {
                    f m1162410 = m11624(dVar8);
                    if (m1162410 != null) {
                        m11621(this.f10731, m1162410, 0);
                        m11622(this.f10756, this.f10731, -1, this.f10732);
                        m11622(this.f10757, this.f10756, 1, this.f10753);
                    }
                } else if (!(eVar5 instanceof q.i) && eVar5.m11294() != null) {
                    m11621(this.f10756, this.f10750.m11294().f10464.f10756, this.f10750.m11222());
                    m11622(this.f10757, this.f10756, 1, this.f10753);
                    if (this.f10750.m11223()) {
                        m11622(this.f10731, this.f10756, 1, this.f10732);
                    }
                    e.b bVar4 = this.f10752;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f10750.m11319() > 0.0f) {
                        l lVar2 = this.f10750.f10462;
                        if (lVar2.f10752 == bVar5) {
                            lVar2.f10753.f10706.add(this.f10753);
                            this.f10753.f10707.add(this.f10750.f10462.f10753);
                            this.f10753.f10696 = this;
                        }
                    }
                }
            }
        }
        if (this.f10753.f10707.size() == 0) {
            this.f10753.f10698 = true;
        }
    }

    @Override // r.p
    /* renamed from: ʿ */
    public void mo11567() {
        f fVar = this.f10756;
        if (fVar.f10705) {
            this.f10750.m11285(fVar.f10702);
        }
    }

    @Override // r.p
    /* renamed from: ˆ */
    void mo11568() {
        this.f10751 = null;
        this.f10756.m11586();
        this.f10757.m11586();
        this.f10731.m11586();
        this.f10753.m11586();
        this.f10755 = false;
    }

    @Override // r.p
    /* renamed from: ˑ */
    boolean mo11570() {
        return this.f10752 != e.b.MATCH_CONSTRAINT || this.f10750.f10500 == 0;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m11609() {
        this.f10755 = false;
        this.f10756.m11586();
        this.f10756.f10705 = false;
        this.f10757.m11586();
        this.f10757.f10705 = false;
        this.f10731.m11586();
        this.f10731.f10705 = false;
        this.f10753.f10705 = false;
    }
}
