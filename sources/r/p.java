package r;

import q.d;
import q.e;

/* compiled from: WidgetRun.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class p implements d {

    /* renamed from: ʻ, reason: contains not printable characters */
    public int f10749;

    /* renamed from: ʼ, reason: contains not printable characters */
    q.e f10750;

    /* renamed from: ʽ, reason: contains not printable characters */
    m f10751;

    /* renamed from: ʾ, reason: contains not printable characters */
    protected e.b f10752;

    /* renamed from: ʿ, reason: contains not printable characters */
    g f10753 = new g(this);

    /* renamed from: ˆ, reason: contains not printable characters */
    public int f10754 = 0;

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f10755 = false;

    /* renamed from: ˉ, reason: contains not printable characters */
    public f f10756 = new f(this);

    /* renamed from: ˊ, reason: contains not printable characters */
    public f f10757 = new f(this);

    /* renamed from: ˋ, reason: contains not printable characters */
    protected b f10758 = b.NONE;

    /* compiled from: WidgetRun.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10759;

        static {
            int[] iArr = new int[d.b.values().length];
            f10759 = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10759[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10759[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10759[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10759[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(q.e eVar) {
        this.f10750 = eVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m11620(int i5, int i6) {
        int i7 = this.f10749;
        if (i7 == 0) {
            this.f10753.mo11587(m11623(i6, i5));
            return;
        }
        if (i7 == 1) {
            this.f10753.mo11587(Math.min(m11623(this.f10753.f10717, i5), i6));
            return;
        }
        if (i7 == 2) {
            q.e m11294 = this.f10750.m11294();
            if (m11294 != null) {
                if ((i5 == 0 ? m11294.f10462 : m11294.f10464).f10753.f10705) {
                    q.e eVar = this.f10750;
                    this.f10753.mo11587(m11623((int) ((r9.f10702 * (i5 == 0 ? eVar.f10489 : eVar.f10444)) + 0.5f), i5));
                    return;
                }
                return;
            }
            return;
        }
        if (i7 != 3) {
            return;
        }
        q.e eVar2 = this.f10750;
        p pVar = eVar2.f10462;
        e.b bVar = pVar.f10752;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f10749 == 3) {
            n nVar = eVar2.f10464;
            if (nVar.f10752 == bVar2 && nVar.f10749 == 3) {
                return;
            }
        }
        if (i5 == 0) {
            pVar = eVar2.f10464;
        }
        if (pVar.f10753.f10705) {
            float m11319 = eVar2.m11319();
            this.f10753.mo11587(i5 == 1 ? (int) ((pVar.f10753.f10702 / m11319) + 0.5f) : (int) ((m11319 * pVar.f10753.f10702) + 0.5f));
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m11621(f fVar, f fVar2, int i5) {
        fVar.f10707.add(fVar2);
        fVar.f10701 = i5;
        fVar2.f10706.add(fVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m11622(f fVar, f fVar2, int i5, g gVar) {
        fVar.f10707.add(fVar2);
        fVar.f10707.add(this.f10753);
        fVar.f10703 = i5;
        fVar.f10704 = gVar;
        fVar2.f10706.add(fVar);
        gVar.f10706.add(fVar);
    }

    /* renamed from: ʾ */
    abstract void mo11566();

    /* renamed from: ʿ */
    abstract void mo11567();

    /* renamed from: ˆ */
    abstract void mo11568();

    /* renamed from: ˈ, reason: contains not printable characters */
    protected final int m11623(int i5, int i6) {
        int max;
        if (i6 == 0) {
            q.e eVar = this.f10750;
            int i7 = eVar.f10487;
            max = Math.max(eVar.f10503, i5);
            if (i7 > 0) {
                max = Math.min(i7, i5);
            }
            if (max == i5) {
                return i5;
            }
        } else {
            q.e eVar2 = this.f10750;
            int i8 = eVar2.f10459;
            max = Math.max(eVar2.f10417, i5);
            if (i8 > 0) {
                max = Math.min(i8, i5);
            }
            if (max == i5) {
                return i5;
            }
        }
        return max;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    protected final f m11624(q.d dVar) {
        q.d dVar2 = dVar.f10400;
        if (dVar2 == null) {
            return null;
        }
        q.e eVar = dVar2.f10398;
        int i5 = a.f10759[dVar2.f10399.ordinal()];
        if (i5 == 1) {
            return eVar.f10462.f10756;
        }
        if (i5 == 2) {
            return eVar.f10462.f10757;
        }
        if (i5 == 3) {
            return eVar.f10464.f10756;
        }
        if (i5 == 4) {
            return eVar.f10464.f10731;
        }
        if (i5 != 5) {
            return null;
        }
        return eVar.f10464.f10757;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final f m11625(q.d dVar, int i5) {
        q.d dVar2 = dVar.f10400;
        if (dVar2 == null) {
            return null;
        }
        q.e eVar = dVar2.f10398;
        p pVar = i5 == 0 ? eVar.f10462 : eVar.f10464;
        int i6 = a.f10759[dVar2.f10399.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f10757;
        }
        return pVar.f10756;
    }

    /* renamed from: ˋ */
    public long mo11569() {
        if (this.f10753.f10705) {
            return r0.f10702;
        }
        return 0L;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m11626() {
        return this.f10755;
    }

    /* renamed from: ˑ */
    abstract boolean mo11570();

    /* renamed from: י, reason: contains not printable characters */
    protected void m11627(d dVar, q.d dVar2, q.d dVar3, int i5) {
        f m11624 = m11624(dVar2);
        f m116242 = m11624(dVar3);
        if (m11624.f10705 && m116242.f10705) {
            int m11197 = m11624.f10702 + dVar2.m11197();
            int m111972 = m116242.f10702 - dVar3.m11197();
            int i6 = m111972 - m11197;
            if (!this.f10753.f10705 && this.f10752 == e.b.MATCH_CONSTRAINT) {
                m11620(i5, i6);
            }
            g gVar = this.f10753;
            if (gVar.f10705) {
                if (gVar.f10702 == i6) {
                    this.f10756.mo11587(m11197);
                    this.f10757.mo11587(m111972);
                    return;
                }
                q.e eVar = this.f10750;
                float m11325 = i5 == 0 ? eVar.m11325() : eVar.m11305();
                if (m11624 == m116242) {
                    m11197 = m11624.f10702;
                    m111972 = m116242.f10702;
                    m11325 = 0.5f;
                }
                this.f10756.mo11587((int) (m11197 + 0.5f + (((m111972 - m11197) - this.f10753.f10702) * m11325)));
                this.f10757.mo11587(this.f10756.f10702 + this.f10753.f10702);
            }
        }
    }

    @Override // r.d
    /* renamed from: ʻ */
    public void mo11565(d dVar) {
    }

    /* renamed from: ـ, reason: contains not printable characters */
    protected void m11628(d dVar) {
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    protected void m11629(d dVar) {
    }
}
