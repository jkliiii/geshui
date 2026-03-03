package r;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends p {

    /* renamed from: ˎ, reason: contains not printable characters */
    ArrayList<p> f10685;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f10686;

    public c(q.e eVar, int i5) {
        super(eVar);
        this.f10685 = new ArrayList<>();
        this.f10754 = i5;
        m11562();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m11562() {
        q.e eVar;
        q.e eVar2 = this.f10750;
        q.e m11298 = eVar2.m11298(this.f10754);
        while (true) {
            q.e eVar3 = m11298;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                m11298 = eVar2.m11298(this.f10754);
            }
        }
        this.f10750 = eVar;
        this.f10685.add(eVar.m11302(this.f10754));
        q.e m11295 = eVar.m11295(this.f10754);
        while (m11295 != null) {
            this.f10685.add(m11295.m11302(this.f10754));
            m11295 = m11295.m11295(this.f10754);
        }
        Iterator<p> it = this.f10685.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i5 = this.f10754;
            if (i5 == 0) {
                next.f10750.f10458 = this;
            } else if (i5 == 1) {
                next.f10750.f10460 = this;
            }
        }
        if ((this.f10754 == 0 && ((q.f) this.f10750.m11294()).m11350()) && this.f10685.size() > 1) {
            ArrayList<p> arrayList = this.f10685;
            this.f10750 = arrayList.get(arrayList.size() - 1).f10750;
        }
        this.f10686 = this.f10754 == 0 ? this.f10750.m11326() : this.f10750.m11315();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private q.e m11563() {
        for (int i5 = 0; i5 < this.f10685.size(); i5++) {
            p pVar = this.f10685.get(i5);
            if (pVar.f10750.m11322() != 8) {
                return pVar.f10750;
            }
        }
        return null;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private q.e m11564() {
        for (int size = this.f10685.size() - 1; size >= 0; size--) {
            p pVar = this.f10685.get(size);
            if (pVar.f10750.m11322() != 8) {
                return pVar.f10750;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f10754 == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f10685.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // r.p, r.d
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11565(r.d r27) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.c.mo11565(r.d):void");
    }

    @Override // r.p
    /* renamed from: ʾ, reason: contains not printable characters */
    void mo11566() {
        Iterator<p> it = this.f10685.iterator();
        while (it.hasNext()) {
            it.next().mo11566();
        }
        int size = this.f10685.size();
        if (size < 1) {
            return;
        }
        q.e eVar = this.f10685.get(0).f10750;
        q.e eVar2 = this.f10685.get(size - 1).f10750;
        if (this.f10754 == 0) {
            q.d dVar = eVar.f10475;
            q.d dVar2 = eVar2.f10493;
            f m11625 = m11625(dVar, 0);
            int m11197 = dVar.m11197();
            q.e m11563 = m11563();
            if (m11563 != null) {
                m11197 = m11563.f10475.m11197();
            }
            if (m11625 != null) {
                m11621(this.f10756, m11625, m11197);
            }
            f m116252 = m11625(dVar2, 0);
            int m111972 = dVar2.m11197();
            q.e m11564 = m11564();
            if (m11564 != null) {
                m111972 = m11564.f10493.m11197();
            }
            if (m116252 != null) {
                m11621(this.f10757, m116252, -m111972);
            }
        } else {
            q.d dVar3 = eVar.f10479;
            q.d dVar4 = eVar2.f10481;
            f m116253 = m11625(dVar3, 1);
            int m111973 = dVar3.m11197();
            q.e m115632 = m11563();
            if (m115632 != null) {
                m111973 = m115632.f10479.m11197();
            }
            if (m116253 != null) {
                m11621(this.f10756, m116253, m111973);
            }
            f m116254 = m11625(dVar4, 1);
            int m111974 = dVar4.m11197();
            q.e m115642 = m11564();
            if (m115642 != null) {
                m111974 = m115642.f10481.m11197();
            }
            if (m116254 != null) {
                m11621(this.f10757, m116254, -m111974);
            }
        }
        this.f10756.f10696 = this;
        this.f10757.f10696 = this;
    }

    @Override // r.p
    /* renamed from: ʿ, reason: contains not printable characters */
    public void mo11567() {
        for (int i5 = 0; i5 < this.f10685.size(); i5++) {
            this.f10685.get(i5).mo11567();
        }
    }

    @Override // r.p
    /* renamed from: ˆ, reason: contains not printable characters */
    void mo11568() {
        this.f10751 = null;
        Iterator<p> it = this.f10685.iterator();
        while (it.hasNext()) {
            it.next().mo11568();
        }
    }

    @Override // r.p
    /* renamed from: ˋ, reason: contains not printable characters */
    public long mo11569() {
        int size = this.f10685.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j5 = j5 + r4.f10756.f10701 + this.f10685.get(i5).mo11569() + r4.f10757.f10701;
        }
        return j5;
    }

    @Override // r.p
    /* renamed from: ˑ, reason: contains not printable characters */
    boolean mo11570() {
        int size = this.f10685.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!this.f10685.get(i5).mo11570()) {
                return false;
            }
        }
        return true;
    }
}
