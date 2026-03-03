package r;

import java.util.ArrayList;
import q.d;
import q.e;

/* compiled from: BasicMeasure.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ArrayList<q.e> f10669 = new ArrayList<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private a f10670 = new a();

    /* renamed from: ʽ, reason: contains not printable characters */
    private q.f f10671;

    /* compiled from: BasicMeasure.java */
    public static class a {

        /* renamed from: ˎ, reason: contains not printable characters */
        public static int f10672 = 0;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static int f10673 = 1;

        /* renamed from: ˑ, reason: contains not printable characters */
        public static int f10674 = 2;

        /* renamed from: ʻ, reason: contains not printable characters */
        public e.b f10675;

        /* renamed from: ʼ, reason: contains not printable characters */
        public e.b f10676;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f10677;

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f10678;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f10679;

        /* renamed from: ˆ, reason: contains not printable characters */
        public int f10680;

        /* renamed from: ˈ, reason: contains not printable characters */
        public int f10681;

        /* renamed from: ˉ, reason: contains not printable characters */
        public boolean f10682;

        /* renamed from: ˊ, reason: contains not printable characters */
        public boolean f10683;

        /* renamed from: ˋ, reason: contains not printable characters */
        public int f10684;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: r.b$b, reason: collision with other inner class name */
    public interface InterfaceC0152b {
        /* renamed from: ʻ */
        void mo1812();

        /* renamed from: ʼ */
        void mo1813(q.e eVar, a aVar);
    }

    public b(q.f fVar) {
        this.f10671 = fVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m11557(InterfaceC0152b interfaceC0152b, q.e eVar, int i5) {
        this.f10670.f10675 = eVar.m11311();
        this.f10670.f10676 = eVar.m11318();
        this.f10670.f10677 = eVar.m11309();
        this.f10670.f10678 = eVar.m11323();
        a aVar = this.f10670;
        aVar.f10683 = false;
        aVar.f10684 = i5;
        e.b bVar = aVar.f10675;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z5 = bVar == bVar2;
        boolean z6 = aVar.f10676 == bVar2;
        boolean z7 = z5 && eVar.f10423 > 0.0f;
        boolean z8 = z6 && eVar.f10423 > 0.0f;
        if (z7 && eVar.f10502[0] == 4) {
            aVar.f10675 = e.b.FIXED;
        }
        if (z8 && eVar.f10502[1] == 4) {
            aVar.f10676 = e.b.FIXED;
        }
        interfaceC0152b.mo1813(eVar, aVar);
        eVar.m11282(this.f10670.f10679);
        eVar.m11256(this.f10670.f10680);
        eVar.m11255(this.f10670.f10682);
        eVar.m11245(this.f10670.f10681);
        a aVar2 = this.f10670;
        aVar2.f10684 = a.f10672;
        return aVar2.f10683;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:28:0x0061, B:30:0x0067, B:32:0x006b, B:50:0x0094, B:48:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11558(q.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<q.e> r0 = r13.f10609
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.m11353(r1)
            r.b$b r2 = r13.m11343()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<q.e> r5 = r13.f10609
            java.lang.Object r5 = r5.get(r4)
            q.e r5 = (q.e) r5
            boolean r6 = r5 instanceof q.h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof q.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.m11234()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            r.l r6 = r5.f10462
            if (r6 == 0) goto L47
            r.n r7 = r5.f10464
            if (r7 == 0) goto L47
            r.g r6 = r6.f10753
            boolean r6 = r6.f10705
            if (r6 == 0) goto L47
            r.g r6 = r7.f10753
            boolean r6 = r6.f10705
            if (r6 == 0) goto L47
            goto La0
        L47:
            q.e$b r6 = r5.m11317(r3)
            r7 = 1
            q.e$b r8 = r5.m11317(r7)
            q.e$b r9 = q.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f10498
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f10500
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.m11353(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof q.l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f10498
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.m11231()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f10500
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.m11231()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f10423
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = r.b.a.f10672
            r12.m11557(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.mo1812()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.m11558(q.f):void");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m11559(q.f fVar, String str, int i5, int i6, int i7) {
        int m11293 = fVar.m11293();
        int m11307 = fVar.m11307();
        fVar.m11272(0);
        fVar.m11271(0);
        fVar.m11282(i6);
        fVar.m11256(i7);
        fVar.m11272(m11293);
        fVar.m11271(m11307);
        this.f10671.m11356(i5);
        this.f10671.mo11333();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public long m11560(q.f fVar, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        boolean z5;
        int i14;
        q.f fVar2;
        int i15;
        boolean z6;
        int i16;
        int i17;
        boolean z7;
        b bVar = this;
        InterfaceC0152b m11343 = fVar.m11343();
        int size = fVar.f10609.size();
        int m11309 = fVar.m11309();
        int m11323 = fVar.m11323();
        boolean m11433 = q.k.m11433(i5, 128);
        boolean z8 = m11433 || q.k.m11433(i5, 64);
        if (z8) {
            for (int i18 = 0; i18 < size; i18++) {
                q.e eVar = fVar.f10609.get(i18);
                e.b m11311 = eVar.m11311();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z9 = (m11311 == bVar2) && (eVar.m11318() == bVar2) && eVar.m11319() > 0.0f;
                if ((eVar.m11231() && z9) || ((eVar.m11233() && z9) || (eVar instanceof q.l) || eVar.m11231() || eVar.m11233())) {
                    z8 = false;
                    break;
                }
            }
        }
        if (z8) {
            boolean z10 = n.d.f9422;
        }
        boolean z11 = z8 & ((i8 == 1073741824 && i10 == 1073741824) || m11433);
        if (z11) {
            int min = Math.min(fVar.m11289(), i9);
            int min2 = Math.min(fVar.m11291(), i11);
            if (i8 == 1073741824 && fVar.m11309() != min) {
                fVar.m11282(min);
                fVar.m11347();
            }
            if (i10 == 1073741824 && fVar.m11323() != min2) {
                fVar.m11256(min2);
                fVar.m11347();
            }
            if (i8 == 1073741824 && i10 == 1073741824) {
                z5 = fVar.m11340(m11433);
                i14 = 2;
            } else {
                boolean m11341 = fVar.m11341(m11433);
                if (i8 == 1073741824) {
                    m11341 &= fVar.m11342(m11433, 0);
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if (i10 == 1073741824) {
                    z5 = fVar.m11342(m11433, 1) & m11341;
                    i14++;
                } else {
                    z5 = m11341;
                }
            }
            if (z5) {
                fVar.mo11287(i8 == 1073741824, i10 == 1073741824);
            }
        } else {
            z5 = false;
            i14 = 0;
        }
        if (z5 && i14 == 2) {
            return 0L;
        }
        int m11344 = fVar.m11344();
        if (size > 0) {
            m11558(fVar);
        }
        m11561(fVar);
        int size2 = bVar.f10669.size();
        if (size > 0) {
            m11559(fVar, "First pass", 0, m11309, m11323);
        }
        if (size2 > 0) {
            e.b m113112 = fVar.m11311();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z12 = m113112 == bVar3;
            boolean z13 = fVar.m11318() == bVar3;
            int max = Math.max(fVar.m11309(), bVar.f10671.m11293());
            int max2 = Math.max(fVar.m11323(), bVar.f10671.m11307());
            int i19 = 0;
            boolean z14 = false;
            while (i19 < size2) {
                q.e eVar2 = bVar.f10669.get(i19);
                if (eVar2 instanceof q.l) {
                    int m113092 = eVar2.m11309();
                    int m113232 = eVar2.m11323();
                    i17 = m11344;
                    boolean m11557 = bVar.m11557(m11343, eVar2, a.f10673) | z14;
                    int m113093 = eVar2.m11309();
                    int m113233 = eVar2.m11323();
                    if (m113093 != m113092) {
                        eVar2.m11282(m113093);
                        if (z12 && eVar2.m11296() > max) {
                            max = Math.max(max, eVar2.m11296() + eVar2.mo11306(d.b.RIGHT).m11197());
                        }
                        z7 = true;
                    } else {
                        z7 = m11557;
                    }
                    if (m113233 != m113232) {
                        eVar2.m11256(m113233);
                        if (z13 && eVar2.m11312() > max2) {
                            max2 = Math.max(max2, eVar2.m11312() + eVar2.mo11306(d.b.BOTTOM).m11197());
                        }
                        z7 = true;
                    }
                    z14 = z7 | ((q.l) eVar2).m11445();
                } else {
                    i17 = m11344;
                }
                i19++;
                m11344 = i17;
            }
            int i20 = m11344;
            int i21 = 0;
            int i22 = 2;
            while (i21 < i22) {
                int i23 = 0;
                while (i23 < size2) {
                    q.e eVar3 = bVar.f10669.get(i23);
                    if (((eVar3 instanceof q.i) && !(eVar3 instanceof q.l)) || (eVar3 instanceof q.h) || eVar3.m11322() == 8 || ((z11 && eVar3.f10462.f10753.f10705 && eVar3.f10464.f10753.f10705) || (eVar3 instanceof q.l))) {
                        z6 = z11;
                        i16 = size2;
                    } else {
                        int m113094 = eVar3.m11309();
                        int m113234 = eVar3.m11323();
                        z6 = z11;
                        int m11308 = eVar3.m11308();
                        int i24 = a.f10673;
                        i16 = size2;
                        if (i21 == 1) {
                            i24 = a.f10674;
                        }
                        boolean m115572 = bVar.m11557(m11343, eVar3, i24) | z14;
                        int m113095 = eVar3.m11309();
                        int m113235 = eVar3.m11323();
                        if (m113095 != m113094) {
                            eVar3.m11282(m113095);
                            if (z12 && eVar3.m11296() > max) {
                                max = Math.max(max, eVar3.m11296() + eVar3.mo11306(d.b.RIGHT).m11197());
                            }
                            m115572 = true;
                        }
                        if (m113235 != m113234) {
                            eVar3.m11256(m113235);
                            if (z13 && eVar3.m11312() > max2) {
                                max2 = Math.max(max2, eVar3.m11312() + eVar3.mo11306(d.b.BOTTOM).m11197());
                            }
                            m115572 = true;
                        }
                        z14 = (!eVar3.m11223() || m11308 == eVar3.m11308()) ? m115572 : true;
                    }
                    i23++;
                    bVar = this;
                    z11 = z6;
                    size2 = i16;
                }
                boolean z15 = z11;
                int i25 = size2;
                if (!z14) {
                    break;
                }
                i21++;
                m11559(fVar, "intermediate pass", i21, m11309, m11323);
                bVar = this;
                z11 = z15;
                size2 = i25;
                i22 = 2;
                z14 = false;
            }
            fVar2 = fVar;
            i15 = i20;
        } else {
            fVar2 = fVar;
            i15 = m11344;
        }
        fVar2.m11355(i15);
        return 0L;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m11561(q.f fVar) {
        this.f10669.clear();
        int size = fVar.f10609.size();
        for (int i5 = 0; i5 < size; i5++) {
            q.e eVar = fVar.f10609.get(i5);
            e.b m11311 = eVar.m11311();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (m11311 == bVar || eVar.m11318() == bVar) {
                this.f10669.add(eVar);
            }
        }
        fVar.m11347();
    }
}
