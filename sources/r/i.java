package r;

import java.util.ArrayList;
import q.e;

/* compiled from: Grouping.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static o m11597(q.e eVar, int i5, ArrayList<o> arrayList, o oVar) {
        int m11431;
        int i6 = i5 == 0 ? eVar.f10456 : eVar.f10457;
        if (i6 != -1 && (oVar == null || i6 != oVar.f10736)) {
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i7);
                if (oVar2.m11614() == i6) {
                    if (oVar != null) {
                        oVar.m11617(i5, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i7++;
                }
            }
        } else if (i6 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof q.j) && (m11431 = ((q.j) eVar).m11431(i5)) != -1) {
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i8);
                    if (oVar3.m11614() == m11431) {
                        oVar = oVar3;
                        break;
                    }
                    i8++;
                }
            }
            if (oVar == null) {
                oVar = new o(i5);
            }
            arrayList.add(oVar);
        }
        if (oVar.m11612(eVar)) {
            if (eVar instanceof q.h) {
                q.h hVar = (q.h) eVar;
                hVar.m11417().m11194(hVar.m11418() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i5 == 0) {
                eVar.f10456 = oVar.m11614();
                eVar.f10475.m11194(i5, arrayList, oVar);
                eVar.f10493.m11194(i5, arrayList, oVar);
            } else {
                eVar.f10457 = oVar.m11614();
                eVar.f10479.m11194(i5, arrayList, oVar);
                eVar.f10491.m11194(i5, arrayList, oVar);
                eVar.f10481.m11194(i5, arrayList, oVar);
            }
            eVar.f10499.m11194(i5, arrayList, oVar);
        }
        return oVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static o m11598(ArrayList<o> arrayList, int i5) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = arrayList.get(i6);
            if (i5 == oVar.f10736) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x034b  */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m11599(q.f r16, r.b.InterfaceC0152b r17) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.m11599(q.f, r.b$b):boolean");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m11600(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
