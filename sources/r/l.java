package r;

import q.d;
import q.e;
import r.f;
import r.p;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l extends p {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static int[] f10721 = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10722;

        static {
            int[] iArr = new int[p.b.values().length];
            f10722 = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10722[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10722[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(q.e eVar) {
        super(eVar);
        this.f10756.f10700 = f.a.LEFT;
        this.f10757.f10700 = f.a.RIGHT;
        this.f10754 = 0;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m11603(int[] iArr, int i5, int i6, int i7, int i8, float f5, int i9) {
        int i10 = i6 - i5;
        int i11 = i8 - i7;
        if (i9 != -1) {
            if (i9 == 0) {
                iArr[0] = (int) ((i11 * f5) + 0.5f);
                iArr[1] = i11;
                return;
            } else {
                if (i9 != 1) {
                    return;
                }
                iArr[0] = i10;
                iArr[1] = (int) ((i10 * f5) + 0.5f);
                return;
            }
        }
        int i12 = (int) ((i11 * f5) + 0.5f);
        int i13 = (int) ((i10 / f5) + 0.5f);
        if (i12 <= i10) {
            iArr[0] = i12;
            iArr[1] = i11;
        } else if (i13 <= i11) {
            iArr[0] = i10;
            iArr[1] = i13;
        }
    }

    public String toString() {
        return "HorizontalRun " + this.f10750.m11316();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02e2  */
    @Override // r.p, r.d
    /* renamed from: ʻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11565(r.d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.l.mo11565(r.d):void");
    }

    @Override // r.p
    /* renamed from: ʾ */
    void mo11566() {
        q.e m11294;
        q.e m112942;
        q.e eVar = this.f10750;
        if (eVar.f10416) {
            this.f10753.mo11587(eVar.m11309());
        }
        if (this.f10753.f10705) {
            e.b bVar = this.f10752;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (m11294 = this.f10750.m11294()) != null && (m11294.m11311() == e.b.FIXED || m11294.m11311() == bVar2)) {
                m11621(this.f10756, m11294.f10462.f10756, this.f10750.f10475.m11197());
                m11621(this.f10757, m11294.f10462.f10757, -this.f10750.f10493.m11197());
                return;
            }
        } else {
            e.b m11311 = this.f10750.m11311();
            this.f10752 = m11311;
            if (m11311 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (m11311 == bVar3 && (m112942 = this.f10750.m11294()) != null && (m112942.m11311() == e.b.FIXED || m112942.m11311() == bVar3)) {
                    int m11309 = (m112942.m11309() - this.f10750.f10475.m11197()) - this.f10750.f10493.m11197();
                    m11621(this.f10756, m112942.f10462.f10756, this.f10750.f10475.m11197());
                    m11621(this.f10757, m112942.f10462.f10757, -this.f10750.f10493.m11197());
                    this.f10753.mo11587(m11309);
                    return;
                }
                if (this.f10752 == e.b.FIXED) {
                    this.f10753.mo11587(this.f10750.m11309());
                }
            }
        }
        g gVar = this.f10753;
        if (gVar.f10705) {
            q.e eVar2 = this.f10750;
            if (eVar2.f10416) {
                q.d[] dVarArr = eVar2.f10485;
                q.d dVar = dVarArr[0];
                q.d dVar2 = dVar.f10400;
                if (dVar2 != null && dVarArr[1].f10400 != null) {
                    if (eVar2.m11231()) {
                        this.f10756.f10701 = this.f10750.f10485[0].m11197();
                        this.f10757.f10701 = -this.f10750.f10485[1].m11197();
                        return;
                    }
                    f m11624 = m11624(this.f10750.f10485[0]);
                    if (m11624 != null) {
                        m11621(this.f10756, m11624, this.f10750.f10485[0].m11197());
                    }
                    f m116242 = m11624(this.f10750.f10485[1]);
                    if (m116242 != null) {
                        m11621(this.f10757, m116242, -this.f10750.f10485[1].m11197());
                    }
                    this.f10756.f10697 = true;
                    this.f10757.f10697 = true;
                    return;
                }
                if (dVar2 != null) {
                    f m116243 = m11624(dVar);
                    if (m116243 != null) {
                        m11621(this.f10756, m116243, this.f10750.f10485[0].m11197());
                        m11621(this.f10757, this.f10756, this.f10753.f10702);
                        return;
                    }
                    return;
                }
                q.d dVar3 = dVarArr[1];
                if (dVar3.f10400 != null) {
                    f m116244 = m11624(dVar3);
                    if (m116244 != null) {
                        m11621(this.f10757, m116244, -this.f10750.f10485[1].m11197());
                        m11621(this.f10756, this.f10757, -this.f10753.f10702);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof q.i) || eVar2.m11294() == null || this.f10750.mo11306(d.b.CENTER).f10400 != null) {
                    return;
                }
                m11621(this.f10756, this.f10750.m11294().f10462.f10756, this.f10750.m11324());
                m11621(this.f10757, this.f10756, this.f10753.f10702);
                return;
            }
        }
        if (this.f10752 == e.b.MATCH_CONSTRAINT) {
            q.e eVar3 = this.f10750;
            int i5 = eVar3.f10498;
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
            } else if (i5 == 3) {
                if (eVar3.f10500 == 3) {
                    this.f10756.f10696 = this;
                    this.f10757.f10696 = this;
                    n nVar = eVar3.f10464;
                    nVar.f10756.f10696 = this;
                    nVar.f10757.f10696 = this;
                    gVar.f10696 = this;
                    if (eVar3.m11233()) {
                        this.f10753.f10707.add(this.f10750.f10464.f10753);
                        this.f10750.f10464.f10753.f10706.add(this.f10753);
                        n nVar2 = this.f10750.f10464;
                        nVar2.f10753.f10696 = this;
                        this.f10753.f10707.add(nVar2.f10756);
                        this.f10753.f10707.add(this.f10750.f10464.f10757);
                        this.f10750.f10464.f10756.f10706.add(this.f10753);
                        this.f10750.f10464.f10757.f10706.add(this.f10753);
                    } else if (this.f10750.m11231()) {
                        this.f10750.f10464.f10753.f10707.add(this.f10753);
                        this.f10753.f10706.add(this.f10750.f10464.f10753);
                    } else {
                        this.f10750.f10464.f10753.f10707.add(this.f10753);
                    }
                } else {
                    g gVar4 = eVar3.f10464.f10753;
                    gVar.f10707.add(gVar4);
                    gVar4.f10706.add(this.f10753);
                    this.f10750.f10464.f10756.f10706.add(this.f10753);
                    this.f10750.f10464.f10757.f10706.add(this.f10753);
                    g gVar5 = this.f10753;
                    gVar5.f10697 = true;
                    gVar5.f10706.add(this.f10756);
                    this.f10753.f10706.add(this.f10757);
                    this.f10756.f10707.add(this.f10753);
                    this.f10757.f10707.add(this.f10753);
                }
            }
        }
        q.e eVar4 = this.f10750;
        q.d[] dVarArr2 = eVar4.f10485;
        q.d dVar4 = dVarArr2[0];
        q.d dVar5 = dVar4.f10400;
        if (dVar5 != null && dVarArr2[1].f10400 != null) {
            if (eVar4.m11231()) {
                this.f10756.f10701 = this.f10750.f10485[0].m11197();
                this.f10757.f10701 = -this.f10750.f10485[1].m11197();
                return;
            }
            f m116245 = m11624(this.f10750.f10485[0]);
            f m116246 = m11624(this.f10750.f10485[1]);
            if (m116245 != null) {
                m116245.m11585(this);
            }
            if (m116246 != null) {
                m116246.m11585(this);
            }
            this.f10758 = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f m116247 = m11624(dVar4);
            if (m116247 != null) {
                m11621(this.f10756, m116247, this.f10750.f10485[0].m11197());
                m11622(this.f10757, this.f10756, 1, this.f10753);
                return;
            }
            return;
        }
        q.d dVar6 = dVarArr2[1];
        if (dVar6.f10400 != null) {
            f m116248 = m11624(dVar6);
            if (m116248 != null) {
                m11621(this.f10757, m116248, -this.f10750.f10485[1].m11197());
                m11622(this.f10756, this.f10757, -1, this.f10753);
                return;
            }
            return;
        }
        if ((eVar4 instanceof q.i) || eVar4.m11294() == null) {
            return;
        }
        m11621(this.f10756, this.f10750.m11294().f10462.f10756, this.f10750.m11324());
        m11622(this.f10757, this.f10756, 1, this.f10753);
    }

    @Override // r.p
    /* renamed from: ʿ */
    public void mo11567() {
        f fVar = this.f10756;
        if (fVar.f10705) {
            this.f10750.m11284(fVar.f10702);
        }
    }

    @Override // r.p
    /* renamed from: ˆ */
    void mo11568() {
        this.f10751 = null;
        this.f10756.m11586();
        this.f10757.m11586();
        this.f10753.m11586();
        this.f10755 = false;
    }

    @Override // r.p
    /* renamed from: ˑ */
    boolean mo11570() {
        return this.f10752 != e.b.MATCH_CONSTRAINT || this.f10750.f10498 == 0;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m11604() {
        this.f10755 = false;
        this.f10756.m11586();
        this.f10756.f10705 = false;
        this.f10757.m11586();
        this.f10757.f10705 = false;
        this.f10753.f10705 = false;
    }
}
