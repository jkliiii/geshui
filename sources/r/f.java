package r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f implements d {

    /* renamed from: ʾ, reason: contains not printable characters */
    p f10699;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f10701;

    /* renamed from: ˈ, reason: contains not printable characters */
    public int f10702;

    /* renamed from: ʻ, reason: contains not printable characters */
    public d f10696 = null;

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean f10697 = false;

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean f10698 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    a f10700 = a.UNKNOWN;

    /* renamed from: ˉ, reason: contains not printable characters */
    int f10703 = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    g f10704 = null;

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean f10705 = false;

    /* renamed from: ˎ, reason: contains not printable characters */
    List<d> f10706 = new ArrayList();

    /* renamed from: ˏ, reason: contains not printable characters */
    List<f> f10707 = new ArrayList();

    /* compiled from: DependencyNode.java */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f10699 = pVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10699.f10750.m11316());
        sb.append(":");
        sb.append(this.f10700);
        sb.append("(");
        sb.append(this.f10705 ? Integer.valueOf(this.f10702) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f10707.size());
        sb.append(":d=");
        sb.append(this.f10706.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // r.d
    /* renamed from: ʻ */
    public void mo11565(d dVar) {
        Iterator<f> it = this.f10707.iterator();
        while (it.hasNext()) {
            if (!it.next().f10705) {
                return;
            }
        }
        this.f10698 = true;
        d dVar2 = this.f10696;
        if (dVar2 != null) {
            dVar2.mo11565(this);
        }
        if (this.f10697) {
            this.f10699.mo11565(this);
            return;
        }
        f fVar = null;
        int i5 = 0;
        for (f fVar2 : this.f10707) {
            if (!(fVar2 instanceof g)) {
                i5++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i5 == 1 && fVar.f10705) {
            g gVar = this.f10704;
            if (gVar != null) {
                if (!gVar.f10705) {
                    return;
                } else {
                    this.f10701 = this.f10703 * gVar.f10702;
                }
            }
            mo11587(fVar.f10702 + this.f10701);
        }
        d dVar3 = this.f10696;
        if (dVar3 != null) {
            dVar3.mo11565(this);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m11585(d dVar) {
        this.f10706.add(dVar);
        if (this.f10705) {
            dVar.mo11565(dVar);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m11586() {
        this.f10707.clear();
        this.f10706.clear();
        this.f10705 = false;
        this.f10702 = 0;
        this.f10698 = false;
        this.f10697 = false;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo11587(int i5) {
        if (this.f10705) {
            return;
        }
        this.f10705 = true;
        this.f10702 = i5;
        for (d dVar : this.f10706) {
            dVar.mo11565(dVar);
        }
    }
}
