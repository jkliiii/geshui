package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class p {

    /* renamed from: ʻ, reason: contains not printable characters */
    final m.g<RecyclerView.f0, a> f4338 = new m.g<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    final m.d<RecyclerView.f0> f4339 = new m.d<>();

    /* compiled from: ViewInfoStore.java */
    static class a {

        /* renamed from: ʾ, reason: contains not printable characters */
        static androidx.core.util.e<a> f4340 = new androidx.core.util.f(20);

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4341;

        /* renamed from: ʼ, reason: contains not printable characters */
        RecyclerView.m.c f4342;

        /* renamed from: ʽ, reason: contains not printable characters */
        RecyclerView.m.c f4343;

        private a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static void m5237() {
            while (f4340.mo2575() != null) {
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static a m5238() {
            a mo2575 = f4340.mo2575();
            return mo2575 == null ? new a() : mo2575;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m5239(a aVar) {
            aVar.f4341 = 0;
            aVar.f4342 = null;
            aVar.f4343 = null;
            f4340.mo2574(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    interface b {
        /* renamed from: ʻ */
        void mo4773(RecyclerView.f0 f0Var);

        /* renamed from: ʼ */
        void mo4774(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        /* renamed from: ʽ */
        void mo4775(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        /* renamed from: ʾ */
        void mo4776(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    p() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private RecyclerView.m.c m5220(RecyclerView.f0 f0Var, int i5) {
        a m9834;
        RecyclerView.m.c cVar;
        int m9827 = this.f4338.m9827(f0Var);
        if (m9827 >= 0 && (m9834 = this.f4338.m9834(m9827)) != null) {
            int i6 = m9834.f4341;
            if ((i6 & i5) != 0) {
                int i7 = (i5 ^ (-1)) & i6;
                m9834.f4341 = i7;
                if (i5 == 4) {
                    cVar = m9834.f4342;
                } else {
                    if (i5 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = m9834.f4343;
                }
                if ((i7 & 12) == 0) {
                    this.f4338.mo9832(m9827);
                    a.m5239(m9834);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m5221(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVar = this.f4338.get(f0Var);
        if (aVar == null) {
            aVar = a.m5238();
            this.f4338.put(f0Var, aVar);
        }
        aVar.f4341 |= 2;
        aVar.f4342 = cVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m5222(RecyclerView.f0 f0Var) {
        a aVar = this.f4338.get(f0Var);
        if (aVar == null) {
            aVar = a.m5238();
            this.f4338.put(f0Var, aVar);
        }
        aVar.f4341 |= 1;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m5223(long j5, RecyclerView.f0 f0Var) {
        this.f4339.m9799(j5, f0Var);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m5224(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVar = this.f4338.get(f0Var);
        if (aVar == null) {
            aVar = a.m5238();
            this.f4338.put(f0Var, aVar);
        }
        aVar.f4343 = cVar;
        aVar.f4341 |= 8;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m5225(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVar = this.f4338.get(f0Var);
        if (aVar == null) {
            aVar = a.m5238();
            this.f4338.put(f0Var, aVar);
        }
        aVar.f4342 = cVar;
        aVar.f4341 |= 4;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m5226() {
        this.f4338.clear();
        this.f4339.m9793();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    RecyclerView.f0 m5227(long j5) {
        return this.f4339.m9795(j5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean m5228(RecyclerView.f0 f0Var) {
        a aVar = this.f4338.get(f0Var);
        return (aVar == null || (aVar.f4341 & 1) == 0) ? false : true;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    boolean m5229(RecyclerView.f0 f0Var) {
        a aVar = this.f4338.get(f0Var);
        return (aVar == null || (aVar.f4341 & 4) == 0) ? false : true;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m5230() {
        a.m5237();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m5231(RecyclerView.f0 f0Var) {
        m5235(f0Var);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    RecyclerView.m.c m5232(RecyclerView.f0 f0Var) {
        return m5220(f0Var, 8);
    }

    /* renamed from: י, reason: contains not printable characters */
    RecyclerView.m.c m5233(RecyclerView.f0 f0Var) {
        return m5220(f0Var, 4);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m5234(b bVar) {
        for (int size = this.f4338.size() - 1; size >= 0; size--) {
            RecyclerView.f0 m9830 = this.f4338.m9830(size);
            a mo9832 = this.f4338.mo9832(size);
            int i5 = mo9832.f4341;
            if ((i5 & 3) == 3) {
                bVar.mo4773(m9830);
            } else if ((i5 & 1) != 0) {
                RecyclerView.m.c cVar = mo9832.f4342;
                if (cVar == null) {
                    bVar.mo4773(m9830);
                } else {
                    bVar.mo4775(m9830, cVar, mo9832.f4343);
                }
            } else if ((i5 & 14) == 14) {
                bVar.mo4774(m9830, mo9832.f4342, mo9832.f4343);
            } else if ((i5 & 12) == 12) {
                bVar.mo4776(m9830, mo9832.f4342, mo9832.f4343);
            } else if ((i5 & 4) != 0) {
                bVar.mo4775(m9830, mo9832.f4342, null);
            } else if ((i5 & 8) != 0) {
                bVar.mo4774(m9830, mo9832.f4342, mo9832.f4343);
            }
            a.m5239(mo9832);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m5235(RecyclerView.f0 f0Var) {
        a aVar = this.f4338.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f4341 &= -2;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m5236(RecyclerView.f0 f0Var) {
        int m9802 = this.f4339.m9802() - 1;
        while (true) {
            if (m9802 < 0) {
                break;
            }
            if (f0Var == this.f4339.m9803(m9802)) {
                this.f4339.m9801(m9802);
                break;
            }
            m9802--;
        }
        a remove = this.f4338.remove(f0Var);
        if (remove != null) {
            a.m5239(remove);
        }
    }
}
