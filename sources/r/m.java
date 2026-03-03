package r;

import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class m {

    /* renamed from: ˉ, reason: contains not printable characters */
    public static int f10723;

    /* renamed from: ʽ, reason: contains not printable characters */
    p f10726;

    /* renamed from: ʾ, reason: contains not printable characters */
    p f10727;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f10729;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f10730;

    /* renamed from: ʻ, reason: contains not printable characters */
    public int f10724 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean f10725 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    ArrayList<p> f10728 = new ArrayList<>();

    public m(p pVar, int i5) {
        this.f10726 = null;
        this.f10727 = null;
        int i6 = f10723;
        this.f10729 = i6;
        f10723 = i6 + 1;
        this.f10726 = pVar;
        this.f10727 = pVar;
        this.f10730 = i5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private long m11605(f fVar, long j5) {
        p pVar = fVar.f10699;
        if (pVar instanceof k) {
            return j5;
        }
        int size = fVar.f10706.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = fVar.f10706.get(i5);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f10699 != pVar) {
                    j6 = Math.min(j6, m11605(fVar2, fVar2.f10701 + j5));
                }
            }
        }
        if (fVar != pVar.f10757) {
            return j6;
        }
        long mo11569 = j5 - pVar.mo11569();
        return Math.min(Math.min(j6, m11605(pVar.f10756, mo11569)), mo11569 - pVar.f10756.f10701);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private long m11606(f fVar, long j5) {
        p pVar = fVar.f10699;
        if (pVar instanceof k) {
            return j5;
        }
        int size = fVar.f10706.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = fVar.f10706.get(i5);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f10699 != pVar) {
                    j6 = Math.max(j6, m11606(fVar2, fVar2.f10701 + j5));
                }
            }
        }
        if (fVar != pVar.f10756) {
            return j6;
        }
        long mo11569 = j5 + pVar.mo11569();
        return Math.max(Math.max(j6, m11606(pVar.f10757, mo11569)), mo11569 - pVar.f10757.f10701);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m11607(p pVar) {
        this.f10728.add(pVar);
        this.f10727 = pVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public long m11608(q.f fVar, int i5) {
        long mo11569;
        int i6;
        p pVar = this.f10726;
        if (pVar instanceof c) {
            if (((c) pVar).f10754 != i5) {
                return 0L;
            }
        } else if (i5 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i5 == 0 ? fVar.f10462 : fVar.f10464).f10756;
        f fVar3 = (i5 == 0 ? fVar.f10462 : fVar.f10464).f10757;
        boolean contains = pVar.f10756.f10707.contains(fVar2);
        boolean contains2 = this.f10726.f10757.f10707.contains(fVar3);
        long mo115692 = this.f10726.mo11569();
        if (contains && contains2) {
            long m11606 = m11606(this.f10726.f10756, 0L);
            long m11605 = m11605(this.f10726.f10757, 0L);
            long j5 = m11606 - mo115692;
            p pVar2 = this.f10726;
            int i7 = pVar2.f10757.f10701;
            if (j5 >= (-i7)) {
                j5 += i7;
            }
            int i8 = pVar2.f10756.f10701;
            long j6 = ((-m11605) - mo115692) - i8;
            if (j6 >= i8) {
                j6 -= i8;
            }
            float m11310 = pVar2.f10750.m11310(i5);
            float f5 = m11310 > 0.0f ? (long) ((j6 / m11310) + (j5 / (1.0f - m11310))) : 0L;
            long j7 = ((long) ((f5 * m11310) + 0.5f)) + mo115692 + ((long) ((f5 * (1.0f - m11310)) + 0.5f));
            mo11569 = r13.f10756.f10701 + j7;
            i6 = this.f10726.f10757.f10701;
        } else {
            if (contains) {
                return Math.max(m11606(this.f10726.f10756, r13.f10701), this.f10726.f10756.f10701 + mo115692);
            }
            if (contains2) {
                return Math.max(-m11605(this.f10726.f10757, r13.f10701), (-this.f10726.f10757.f10701) + mo115692);
            }
            mo11569 = r13.f10756.f10701 + this.f10726.mo11569();
            i6 = this.f10726.f10757.f10701;
        }
        return mo11569 - i6;
    }
}
