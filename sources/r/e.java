package r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.e;
import r.b;

/* compiled from: DependencyGraph.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private q.f f10687;

    /* renamed from: ʾ, reason: contains not printable characters */
    private q.f f10690;

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean f10688 = true;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f10689 = true;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ArrayList<p> f10691 = new ArrayList<>();

    /* renamed from: ˆ, reason: contains not printable characters */
    private ArrayList<m> f10692 = new ArrayList<>();

    /* renamed from: ˈ, reason: contains not printable characters */
    private b.InterfaceC0152b f10693 = null;

    /* renamed from: ˉ, reason: contains not printable characters */
    private b.a f10694 = new b.a();

    /* renamed from: ˊ, reason: contains not printable characters */
    ArrayList<m> f10695 = new ArrayList<>();

    public e(q.f fVar) {
        this.f10687 = fVar;
        this.f10690 = fVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m11571(f fVar, int i5, int i6, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f10699;
        if (pVar.f10751 == null) {
            q.f fVar3 = this.f10687;
            if (pVar == fVar3.f10462 || pVar == fVar3.f10464) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i6);
                arrayList.add(mVar);
            }
            pVar.f10751 = mVar;
            mVar.m11607(pVar);
            for (d dVar : pVar.f10756.f10706) {
                if (dVar instanceof f) {
                    m11571((f) dVar, i5, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f10757.f10706) {
                if (dVar2 instanceof f) {
                    m11571((f) dVar2, i5, 1, fVar2, arrayList, mVar);
                }
            }
            if (i5 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f10731.f10706) {
                    if (dVar3 instanceof f) {
                        m11571((f) dVar3, i5, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f10756.f10707) {
                if (fVar4 == fVar2) {
                    mVar.f10725 = true;
                }
                m11571(fVar4, i5, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f10757.f10707) {
                if (fVar5 == fVar2) {
                    mVar.f10725 = true;
                }
                m11571(fVar5, i5, 1, fVar2, arrayList, mVar);
            }
            if (i5 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f10731.f10707.iterator();
                while (it.hasNext()) {
                    m11571(it.next(), i5, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0276 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278 A[SYNTHETIC] */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m11572(q.f r17) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.e.m11572(q.f):boolean");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m11573(q.f fVar, int i5) {
        int size = this.f10695.size();
        long j5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            j5 = Math.max(j5, this.f10695.get(i6).m11608(fVar, i5));
        }
        return (int) j5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m11574(p pVar, int i5, ArrayList<m> arrayList) {
        for (d dVar : pVar.f10756.f10706) {
            if (dVar instanceof f) {
                m11571((f) dVar, i5, 0, pVar.f10757, arrayList, null);
            } else if (dVar instanceof p) {
                m11571(((p) dVar).f10756, i5, 0, pVar.f10757, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f10757.f10706) {
            if (dVar2 instanceof f) {
                m11571((f) dVar2, i5, 1, pVar.f10756, arrayList, null);
            } else if (dVar2 instanceof p) {
                m11571(((p) dVar2).f10757, i5, 1, pVar.f10756, arrayList, null);
            }
        }
        if (i5 == 1) {
            for (d dVar3 : ((n) pVar).f10731.f10706) {
                if (dVar3 instanceof f) {
                    m11571((f) dVar3, i5, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m11575(q.e eVar, e.b bVar, int i5, e.b bVar2, int i6) {
        b.a aVar = this.f10694;
        aVar.f10675 = bVar;
        aVar.f10676 = bVar2;
        aVar.f10677 = i5;
        aVar.f10678 = i6;
        this.f10693.mo1813(eVar, aVar);
        eVar.m11282(this.f10694.f10679);
        eVar.m11256(this.f10694.f10680);
        eVar.m11255(this.f10694.f10682);
        eVar.m11245(this.f10694.f10681);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m11576() {
        m11577(this.f10691);
        this.f10695.clear();
        m.f10723 = 0;
        m11574(this.f10687.f10462, 0, this.f10695);
        m11574(this.f10687.f10464, 1, this.f10695);
        this.f10688 = false;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m11577(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f10690.f10462.mo11568();
        this.f10690.f10464.mo11568();
        arrayList.add(this.f10690.f10462);
        arrayList.add(this.f10690.f10464);
        Iterator<q.e> it = this.f10690.f10609.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            q.e next = it.next();
            if (next instanceof q.h) {
                arrayList.add(new j(next));
            } else {
                if (next.m11231()) {
                    if (next.f10458 == null) {
                        next.f10458 = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10458);
                } else {
                    arrayList.add(next.f10462);
                }
                if (next.m11233()) {
                    if (next.f10460 == null) {
                        next.f10460 = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10460);
                } else {
                    arrayList.add(next.f10464);
                }
                if (next instanceof q.j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo11568();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f10750 != this.f10690) {
                next2.mo11566();
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m11578(boolean z5) {
        boolean z6;
        boolean z7 = true;
        boolean z8 = z5 & true;
        if (this.f10688 || this.f10689) {
            Iterator<q.e> it = this.f10687.f10609.iterator();
            while (it.hasNext()) {
                q.e next = it.next();
                next.m11304();
                next.f10416 = false;
                next.f10462.m11604();
                next.f10464.m11609();
            }
            this.f10687.m11304();
            q.f fVar = this.f10687;
            fVar.f10416 = false;
            fVar.f10462.m11604();
            this.f10687.f10464.m11609();
            this.f10689 = false;
        }
        if (m11572(this.f10690)) {
            return false;
        }
        this.f10687.m11284(0);
        this.f10687.m11285(0);
        e.b m11317 = this.f10687.m11317(0);
        e.b m113172 = this.f10687.m11317(1);
        if (this.f10688) {
            m11576();
        }
        int m11324 = this.f10687.m11324();
        int m11222 = this.f10687.m11222();
        this.f10687.f10462.f10756.mo11587(m11324);
        this.f10687.f10464.f10756.mo11587(m11222);
        m11583();
        e.b bVar = e.b.WRAP_CONTENT;
        if (m11317 == bVar || m113172 == bVar) {
            if (z8) {
                Iterator<p> it2 = this.f10691.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().mo11570()) {
                        z8 = false;
                        break;
                    }
                }
            }
            if (z8 && m11317 == e.b.WRAP_CONTENT) {
                this.f10687.m11260(e.b.FIXED);
                q.f fVar2 = this.f10687;
                fVar2.m11282(m11573(fVar2, 0));
                q.f fVar3 = this.f10687;
                fVar3.f10462.f10753.mo11587(fVar3.m11309());
            }
            if (z8 && m113172 == e.b.WRAP_CONTENT) {
                this.f10687.m11278(e.b.FIXED);
                q.f fVar4 = this.f10687;
                fVar4.m11256(m11573(fVar4, 1));
                q.f fVar5 = this.f10687;
                fVar5.f10464.f10753.mo11587(fVar5.m11323());
            }
        }
        q.f fVar6 = this.f10687;
        e.b bVar2 = fVar6.f10419[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int m11309 = fVar6.m11309() + m11324;
            this.f10687.f10462.f10757.mo11587(m11309);
            this.f10687.f10462.f10753.mo11587(m11309 - m11324);
            m11583();
            q.f fVar7 = this.f10687;
            e.b bVar4 = fVar7.f10419[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int m11323 = fVar7.m11323() + m11222;
                this.f10687.f10464.f10757.mo11587(m11323);
                this.f10687.f10464.f10753.mo11587(m11323 - m11222);
            }
            m11583();
            z6 = true;
        } else {
            z6 = false;
        }
        Iterator<p> it3 = this.f10691.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f10750 != this.f10687 || next2.f10755) {
                next2.mo11567();
            }
        }
        Iterator<p> it4 = this.f10691.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z6 || next3.f10750 != this.f10687) {
                if (!next3.f10756.f10705 || ((!next3.f10757.f10705 && !(next3 instanceof j)) || (!next3.f10753.f10705 && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z7 = false;
                    break;
                }
            }
        }
        this.f10687.m11260(m11317);
        this.f10687.m11278(m113172);
        return z7;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m11579(boolean z5) {
        if (this.f10688) {
            Iterator<q.e> it = this.f10687.f10609.iterator();
            while (it.hasNext()) {
                q.e next = it.next();
                next.m11304();
                next.f10416 = false;
                l lVar = next.f10462;
                lVar.f10753.f10705 = false;
                lVar.f10755 = false;
                lVar.m11604();
                n nVar = next.f10464;
                nVar.f10753.f10705 = false;
                nVar.f10755 = false;
                nVar.m11609();
            }
            this.f10687.m11304();
            q.f fVar = this.f10687;
            fVar.f10416 = false;
            l lVar2 = fVar.f10462;
            lVar2.f10753.f10705 = false;
            lVar2.f10755 = false;
            lVar2.m11604();
            n nVar2 = this.f10687.f10464;
            nVar2.f10753.f10705 = false;
            nVar2.f10755 = false;
            nVar2.m11609();
            m11576();
        }
        if (m11572(this.f10690)) {
            return false;
        }
        this.f10687.m11284(0);
        this.f10687.m11285(0);
        this.f10687.f10462.f10756.mo11587(0);
        this.f10687.f10464.f10756.mo11587(0);
        return true;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m11580(boolean z5, int i5) {
        boolean z6;
        e.b bVar;
        boolean z7 = true;
        boolean z8 = z5 & true;
        e.b m11317 = this.f10687.m11317(0);
        e.b m113172 = this.f10687.m11317(1);
        int m11324 = this.f10687.m11324();
        int m11222 = this.f10687.m11222();
        if (z8 && (m11317 == (bVar = e.b.WRAP_CONTENT) || m113172 == bVar)) {
            Iterator<p> it = this.f10691.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f10754 == i5 && !next.mo11570()) {
                    z8 = false;
                    break;
                }
            }
            if (i5 == 0) {
                if (z8 && m11317 == e.b.WRAP_CONTENT) {
                    this.f10687.m11260(e.b.FIXED);
                    q.f fVar = this.f10687;
                    fVar.m11282(m11573(fVar, 0));
                    q.f fVar2 = this.f10687;
                    fVar2.f10462.f10753.mo11587(fVar2.m11309());
                }
            } else if (z8 && m113172 == e.b.WRAP_CONTENT) {
                this.f10687.m11278(e.b.FIXED);
                q.f fVar3 = this.f10687;
                fVar3.m11256(m11573(fVar3, 1));
                q.f fVar4 = this.f10687;
                fVar4.f10464.f10753.mo11587(fVar4.m11323());
            }
        }
        if (i5 == 0) {
            q.f fVar5 = this.f10687;
            e.b bVar2 = fVar5.f10419[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int m11309 = fVar5.m11309() + m11324;
                this.f10687.f10462.f10757.mo11587(m11309);
                this.f10687.f10462.f10753.mo11587(m11309 - m11324);
                z6 = true;
            }
            z6 = false;
        } else {
            q.f fVar6 = this.f10687;
            e.b bVar3 = fVar6.f10419[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int m11323 = fVar6.m11323() + m11222;
                this.f10687.f10464.f10757.mo11587(m11323);
                this.f10687.f10464.f10753.mo11587(m11323 - m11222);
                z6 = true;
            }
            z6 = false;
        }
        m11583();
        Iterator<p> it2 = this.f10691.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f10754 == i5 && (next2.f10750 != this.f10687 || next2.f10755)) {
                next2.mo11567();
            }
        }
        Iterator<p> it3 = this.f10691.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f10754 == i5 && (z6 || next3.f10750 != this.f10687)) {
                if (!next3.f10756.f10705 || !next3.f10757.f10705 || (!(next3 instanceof c) && !next3.f10753.f10705)) {
                    z7 = false;
                    break;
                }
            }
        }
        this.f10687.m11260(m11317);
        this.f10687.m11278(m113172);
        return z7;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m11581() {
        this.f10688 = true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m11582() {
        this.f10689 = true;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m11583() {
        g gVar;
        Iterator<q.e> it = this.f10687.f10609.iterator();
        while (it.hasNext()) {
            q.e next = it.next();
            if (!next.f10416) {
                e.b[] bVarArr = next.f10419;
                boolean z5 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i5 = next.f10498;
                int i6 = next.f10500;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z6 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i5 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i6 == 1)) {
                    z5 = true;
                }
                g gVar2 = next.f10462.f10753;
                boolean z7 = gVar2.f10705;
                g gVar3 = next.f10464.f10753;
                boolean z8 = gVar3.f10705;
                if (z7 && z8) {
                    e.b bVar4 = e.b.FIXED;
                    m11575(next, bVar4, gVar2.f10702, bVar4, gVar3.f10702);
                    next.f10416 = true;
                } else if (z7 && z5) {
                    m11575(next, e.b.FIXED, gVar2.f10702, bVar3, gVar3.f10702);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f10464.f10753.f10717 = next.m11323();
                    } else {
                        next.f10464.f10753.mo11587(next.m11323());
                        next.f10416 = true;
                    }
                } else if (z8 && z6) {
                    m11575(next, bVar3, gVar2.f10702, e.b.FIXED, gVar3.f10702);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f10462.f10753.f10717 = next.m11309();
                    } else {
                        next.f10462.f10753.mo11587(next.m11309());
                        next.f10416 = true;
                    }
                }
                if (next.f10416 && (gVar = next.f10464.f10732) != null) {
                    gVar.mo11587(next.m11308());
                }
            }
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m11584(b.InterfaceC0152b interfaceC0152b) {
        this.f10693 = interfaceC0152b;
    }
}
