package q;

import q.e;

/* compiled from: Optimizer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k {

    /* renamed from: ʻ, reason: contains not printable characters */
    static boolean[] f10595 = new boolean[3];

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m11432(f fVar, n.d dVar, e eVar) {
        eVar.f10492 = -1;
        eVar.f10494 = -1;
        e.b bVar = fVar.f10419[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f10419[0] == e.b.MATCH_PARENT) {
            int i5 = eVar.f10475.f10401;
            int m11309 = fVar.m11309() - eVar.f10493.f10401;
            d dVar2 = eVar.f10475;
            dVar2.f10403 = dVar.m10365(dVar2);
            d dVar3 = eVar.f10493;
            dVar3.f10403 = dVar.m10365(dVar3);
            dVar.m10356(eVar.f10475.f10403, i5);
            dVar.m10356(eVar.f10493.f10403, m11309);
            eVar.f10492 = 2;
            eVar.m11259(i5, m11309);
        }
        if (fVar.f10419[1] == bVar2 || eVar.f10419[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i6 = eVar.f10479.f10401;
        int m11323 = fVar.m11323() - eVar.f10481.f10401;
        d dVar4 = eVar.f10479;
        dVar4.f10403 = dVar.m10365(dVar4);
        d dVar5 = eVar.f10481;
        dVar5.f10403 = dVar.m10365(dVar5);
        dVar.m10356(eVar.f10479.f10403, i6);
        dVar.m10356(eVar.f10481.f10403, m11323);
        if (eVar.f10431 > 0 || eVar.m11322() == 8) {
            d dVar6 = eVar.f10491;
            dVar6.f10403 = dVar.m10365(dVar6);
            dVar.m10356(eVar.f10491.f10403, eVar.f10431 + i6);
        }
        eVar.f10494 = 2;
        eVar.m11277(i6, m11323);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final boolean m11433(int i5, int i6) {
        return (i5 & i6) == i6;
    }
}
