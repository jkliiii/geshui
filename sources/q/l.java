package q;

import java.util.HashSet;
import q.e;
import r.b;

/* compiled from: VirtualLayout.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l extends j {

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    private int f10596 = 0;

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    private int f10597 = 0;

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    private int f10598 = 0;

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    private int f10599 = 0;

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    private int f10600 = 0;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    private int f10601 = 0;

    /* renamed from: ʼﾞ, reason: contains not printable characters */
    private int f10602 = 0;

    /* renamed from: ʽʻ, reason: contains not printable characters */
    private int f10603 = 0;

    /* renamed from: ʽʼ, reason: contains not printable characters */
    private boolean f10604 = false;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private int f10605 = 0;

    /* renamed from: ʽʿ, reason: contains not printable characters */
    private int f10606 = 0;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    protected b.a f10607 = new b.a();

    /* renamed from: ʽˈ, reason: contains not printable characters */
    b.InterfaceC0152b f10608 = null;

    @Override // q.j, q.i
    /* renamed from: ʻ */
    public void mo11427(f fVar) {
        m11435();
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public void m11434(boolean z5) {
        int i5 = this.f10600;
        if (i5 > 0 || this.f10601 > 0) {
            if (z5) {
                this.f10602 = this.f10601;
                this.f10603 = i5;
            } else {
                this.f10602 = i5;
                this.f10603 = this.f10601;
            }
        }
    }

    /* renamed from: ʾʽ, reason: contains not printable characters */
    public void m11435() {
        for (int i5 = 0; i5 < this.f10594; i5++) {
            e eVar = this.f10593[i5];
            if (eVar != null) {
                eVar.m11265(true);
            }
        }
    }

    /* renamed from: ʾʿ, reason: contains not printable characters */
    public boolean m11436(HashSet<e> hashSet) {
        for (int i5 = 0; i5 < this.f10594; i5++) {
            if (hashSet.contains(this.f10593[i5])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʾˆ, reason: contains not printable characters */
    public int m11437() {
        return this.f10606;
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int m11438() {
        return this.f10605;
    }

    /* renamed from: ʾˉ, reason: contains not printable characters */
    public int m11439() {
        return this.f10597;
    }

    /* renamed from: ʾˊ, reason: contains not printable characters */
    public int m11440() {
        return this.f10602;
    }

    /* renamed from: ʾˋ, reason: contains not printable characters */
    public int m11441() {
        return this.f10603;
    }

    /* renamed from: ʾˎ, reason: contains not printable characters */
    public int m11442() {
        return this.f10596;
    }

    /* renamed from: ʾˑ, reason: contains not printable characters */
    protected void m11443(e eVar, e.b bVar, int i5, e.b bVar2, int i6) {
        while (this.f10608 == null && m11294() != null) {
            this.f10608 = ((f) m11294()).m11343();
        }
        b.a aVar = this.f10607;
        aVar.f10675 = bVar;
        aVar.f10676 = bVar2;
        aVar.f10677 = i5;
        aVar.f10678 = i6;
        this.f10608.mo1813(eVar, aVar);
        eVar.m11282(this.f10607.f10679);
        eVar.m11256(this.f10607.f10680);
        eVar.m11255(this.f10607.f10682);
        eVar.m11245(this.f10607.f10681);
    }

    /* renamed from: ʾי, reason: contains not printable characters */
    protected boolean m11444() {
        e eVar = this.f10420;
        b.InterfaceC0152b m11343 = eVar != null ? ((f) eVar).m11343() : null;
        if (m11343 == null) {
            return false;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.f10594) {
                return true;
            }
            e eVar2 = this.f10593[i5];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b m11317 = eVar2.m11317(0);
                e.b m113172 = eVar2.m11317(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (!(m11317 == bVar && eVar2.f10498 != 1 && m113172 == bVar && eVar2.f10500 != 1)) {
                    if (m11317 == bVar) {
                        m11317 = e.b.WRAP_CONTENT;
                    }
                    if (m113172 == bVar) {
                        m113172 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.f10607;
                    aVar.f10675 = m11317;
                    aVar.f10676 = m113172;
                    aVar.f10677 = eVar2.m11309();
                    this.f10607.f10678 = eVar2.m11323();
                    m11343.mo1813(eVar2, this.f10607);
                    eVar2.m11282(this.f10607.f10679);
                    eVar2.m11256(this.f10607.f10680);
                    eVar2.m11245(this.f10607.f10681);
                }
            }
            i5++;
        }
    }

    /* renamed from: ʾـ, reason: contains not printable characters */
    public boolean m11445() {
        return this.f10604;
    }

    /* renamed from: ʾٴ, reason: contains not printable characters */
    protected void m11446(boolean z5) {
        this.f10604 = z5;
    }

    /* renamed from: ʾᐧ, reason: contains not printable characters */
    public void m11447(int i5, int i6) {
        this.f10605 = i5;
        this.f10606 = i6;
    }

    /* renamed from: ʾᴵ, reason: contains not printable characters */
    public void m11448(int i5) {
        this.f10598 = i5;
        this.f10596 = i5;
        this.f10599 = i5;
        this.f10597 = i5;
        this.f10600 = i5;
        this.f10601 = i5;
    }

    /* renamed from: ʾᵎ, reason: contains not printable characters */
    public void m11449(int i5) {
        this.f10597 = i5;
    }

    /* renamed from: ʾᵔ, reason: contains not printable characters */
    public void m11450(int i5) {
        this.f10601 = i5;
    }

    /* renamed from: ʾᵢ, reason: contains not printable characters */
    public void m11451(int i5) {
        this.f10598 = i5;
        this.f10602 = i5;
    }

    /* renamed from: ʾⁱ, reason: contains not printable characters */
    public void m11452(int i5) {
        this.f10599 = i5;
        this.f10603 = i5;
    }

    /* renamed from: ʾﹳ, reason: contains not printable characters */
    public void m11453(int i5) {
        this.f10600 = i5;
        this.f10602 = i5;
        this.f10603 = i5;
    }

    /* renamed from: ʾﹶ, reason: contains not printable characters */
    public void m11454(int i5) {
        this.f10596 = i5;
    }

    /* renamed from: ʾˏ */
    public void mo11387(int i5, int i6, int i7, int i8) {
    }
}
