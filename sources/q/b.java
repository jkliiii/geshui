package q;

import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[PHI: r8 r16
  0x0046: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:330:0x0042, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:330:0x0042, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0044 A[PHI: r8 r16
  0x0044: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:330:0x0042, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:330:0x0042, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v40, types: [q.e] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [q.e] */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m11187(q.f r37, n.d r38, int r39, int r40, q.c r41) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b.m11187(q.f, n.d, int, int, q.c):void");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m11188(f fVar, n.d dVar, ArrayList<e> arrayList, int i5) {
        int i6;
        c[] cVarArr;
        int i7;
        if (i5 == 0) {
            i6 = fVar.f10521;
            cVarArr = fVar.f10524;
            i7 = 0;
        } else {
            i6 = fVar.f10522;
            cVarArr = fVar.f10523;
            i7 = 2;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            c cVar = cVarArr[i8];
            cVar.m11191();
            if (arrayList == null || arrayList.contains(cVar.f10373)) {
                m11187(fVar, dVar, i5, i7, cVar);
            }
        }
    }
}
