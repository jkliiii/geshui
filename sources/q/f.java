package q;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import q.e;
import r.b;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends m {

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    private int f10513;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    int f10517;

    /* renamed from: ʼﾞ, reason: contains not printable characters */
    int f10518;

    /* renamed from: ʽʻ, reason: contains not printable characters */
    int f10519;

    /* renamed from: ʽʼ, reason: contains not printable characters */
    int f10520;

    /* renamed from: ʼᴵ, reason: contains not printable characters */
    r.b f10511 = new r.b(this);

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public r.e f10512 = new r.e(this);

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    protected b.InterfaceC0152b f10514 = null;

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    private boolean f10515 = false;

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    protected n.d f10516 = new n.d();

    /* renamed from: ʽʾ, reason: contains not printable characters */
    public int f10521 = 0;

    /* renamed from: ʽʿ, reason: contains not printable characters */
    public int f10522 = 0;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    c[] f10523 = new c[4];

    /* renamed from: ʽˈ, reason: contains not printable characters */
    c[] f10524 = new c[4];

    /* renamed from: ʽˉ, reason: contains not printable characters */
    public boolean f10525 = false;

    /* renamed from: ʽˊ, reason: contains not printable characters */
    public boolean f10526 = false;

    /* renamed from: ʽˋ, reason: contains not printable characters */
    public boolean f10527 = false;

    /* renamed from: ʽˎ, reason: contains not printable characters */
    public int f10528 = 0;

    /* renamed from: ʽˏ, reason: contains not printable characters */
    public int f10529 = 0;

    /* renamed from: ʽˑ, reason: contains not printable characters */
    private int f10530 = 257;

    /* renamed from: ʽי, reason: contains not printable characters */
    public boolean f10531 = false;

    /* renamed from: ʽـ, reason: contains not printable characters */
    private boolean f10532 = false;

    /* renamed from: ʽٴ, reason: contains not printable characters */
    private boolean f10533 = false;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    int f10534 = 0;

    /* renamed from: ʽᴵ, reason: contains not printable characters */
    private WeakReference<d> f10535 = null;

    /* renamed from: ʽᵎ, reason: contains not printable characters */
    private WeakReference<d> f10536 = null;

    /* renamed from: ʽᵔ, reason: contains not printable characters */
    private WeakReference<d> f10537 = null;

    /* renamed from: ʽᵢ, reason: contains not printable characters */
    private WeakReference<d> f10538 = null;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    HashSet<e> f10539 = new HashSet<>();

    /* renamed from: ʽﹳ, reason: contains not printable characters */
    public b.a f10540 = new b.a();

    /* renamed from: ʾˈ, reason: contains not printable characters */
    private void m11327(e eVar) {
        int i5 = this.f10521 + 1;
        c[] cVarArr = this.f10524;
        if (i5 >= cVarArr.length) {
            this.f10524 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f10524[this.f10521] = new c(eVar, 0, m11350());
        this.f10521++;
    }

    /* renamed from: ʾˋ, reason: contains not printable characters */
    private void m11328(d dVar, n.i iVar) {
        this.f10516.m10358(iVar, this.f10516.m10365(dVar), 0, 5);
    }

    /* renamed from: ʾˎ, reason: contains not printable characters */
    private void m11329(d dVar, n.i iVar) {
        this.f10516.m10358(this.f10516.m10365(dVar), iVar, 0, 5);
    }

    /* renamed from: ʾˏ, reason: contains not printable characters */
    private void m11330(e eVar) {
        int i5 = this.f10522 + 1;
        c[] cVarArr = this.f10523;
        if (i5 >= cVarArr.length) {
            this.f10523 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f10523[this.f10522] = new c(eVar, 1, m11350());
        this.f10522++;
    }

    /* renamed from: ʿʽ, reason: contains not printable characters */
    public static boolean m11331(int i5, e eVar, b.InterfaceC0152b interfaceC0152b, b.a aVar, int i6) {
        int i7;
        int i8;
        if (interfaceC0152b == null) {
            return false;
        }
        if (eVar.m11322() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f10679 = 0;
            aVar.f10680 = 0;
            return false;
        }
        aVar.f10675 = eVar.m11311();
        aVar.f10676 = eVar.m11318();
        aVar.f10677 = eVar.m11309();
        aVar.f10678 = eVar.m11323();
        aVar.f10683 = false;
        aVar.f10684 = i6;
        e.b bVar = aVar.f10675;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z5 = bVar == bVar2;
        boolean z6 = aVar.f10676 == bVar2;
        boolean z7 = z5 && eVar.f10423 > 0.0f;
        boolean z8 = z6 && eVar.f10423 > 0.0f;
        if (z5 && eVar.m11224(0) && eVar.f10498 == 0 && !z7) {
            aVar.f10675 = e.b.WRAP_CONTENT;
            if (z6 && eVar.f10500 == 0) {
                aVar.f10675 = e.b.FIXED;
            }
            z5 = false;
        }
        if (z6 && eVar.m11224(1) && eVar.f10500 == 0 && !z8) {
            aVar.f10676 = e.b.WRAP_CONTENT;
            if (z5 && eVar.f10498 == 0) {
                aVar.f10676 = e.b.FIXED;
            }
            z6 = false;
        }
        if (eVar.mo11174()) {
            aVar.f10675 = e.b.FIXED;
            z5 = false;
        }
        if (eVar.mo11175()) {
            aVar.f10676 = e.b.FIXED;
            z6 = false;
        }
        if (z7) {
            if (eVar.f10502[0] == 4) {
                aVar.f10675 = e.b.FIXED;
            } else if (!z6) {
                e.b bVar3 = aVar.f10676;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i8 = aVar.f10678;
                } else {
                    aVar.f10675 = e.b.WRAP_CONTENT;
                    interfaceC0152b.mo1813(eVar, aVar);
                    i8 = aVar.f10680;
                }
                aVar.f10675 = bVar4;
                aVar.f10677 = (int) (eVar.m11319() * i8);
            }
        }
        if (z8) {
            if (eVar.f10502[1] == 4) {
                aVar.f10676 = e.b.FIXED;
            } else if (!z5) {
                e.b bVar5 = aVar.f10675;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i7 = aVar.f10677;
                } else {
                    aVar.f10676 = e.b.WRAP_CONTENT;
                    interfaceC0152b.mo1813(eVar, aVar);
                    i7 = aVar.f10679;
                }
                aVar.f10676 = bVar6;
                if (eVar.m11321() == -1) {
                    aVar.f10678 = (int) (i7 / eVar.m11319());
                } else {
                    aVar.f10678 = (int) (eVar.m11319() * i7);
                }
            }
        }
        interfaceC0152b.mo1813(eVar, aVar);
        eVar.m11282(aVar.f10679);
        eVar.m11256(aVar.f10680);
        eVar.m11255(aVar.f10682);
        eVar.m11245(aVar.f10681);
        aVar.f10684 = b.a.f10672;
        return aVar.f10683;
    }

    /* renamed from: ʿˆ, reason: contains not printable characters */
    private void m11332() {
        this.f10521 = 0;
        this.f10522 = 0;
    }

    @Override // q.m, q.e
    /* renamed from: ʻﹳ */
    public void mo11240() {
        this.f10516.m10353();
        this.f10517 = 0;
        this.f10519 = 0;
        this.f10518 = 0;
        this.f10520 = 0;
        this.f10531 = false;
        super.mo11240();
    }

    @Override // q.e
    /* renamed from: ʽﹳ */
    public void mo11287(boolean z5, boolean z6) {
        super.mo11287(z5, z6);
        int size = this.f10609.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f10609.get(i5).mo11287(z5, z6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0309 A[PHI: r2 r16
  0x0309: PHI (r2v14 boolean) = (r2v13 boolean), (r2v18 boolean), (r2v18 boolean), (r2v18 boolean) binds: [B:138:0x02ca, B:146:0x02ef, B:147:0x02f1, B:149:0x02f7] A[DONT_GENERATE, DONT_INLINE]
  0x0309: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02ca, B:146:0x02ef, B:147:0x02f1, B:149:0x02f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // q.m
    /* renamed from: ʾʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11333() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.mo11333():void");
    }

    /* renamed from: ʾʿ, reason: contains not printable characters */
    void m11334(e eVar, int i5) {
        if (i5 == 0) {
            m11327(eVar);
        } else if (i5 == 1) {
            m11330(eVar);
        }
    }

    /* renamed from: ʾˆ, reason: contains not printable characters */
    public boolean m11335(n.d dVar) {
        boolean m11353 = m11353(64);
        mo11185(dVar, m11353);
        int size = this.f10609.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f10609.get(i5);
            eVar.m11263(0, false);
            eVar.m11263(1, false);
            if (eVar instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i6 = 0; i6 < size; i6++) {
                e eVar2 = this.f10609.get(i6);
                if (eVar2 instanceof a) {
                    ((a) eVar2).m11181();
                }
            }
        }
        this.f10539.clear();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar3 = this.f10609.get(i7);
            if (eVar3.m11292()) {
                if (eVar3 instanceof l) {
                    this.f10539.add(eVar3);
                } else {
                    eVar3.mo11185(dVar, m11353);
                }
            }
        }
        while (this.f10539.size() > 0) {
            int size2 = this.f10539.size();
            Iterator<e> it = this.f10539.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                if (lVar.m11436(this.f10539)) {
                    lVar.mo11185(dVar, m11353);
                    this.f10539.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f10539.size()) {
                Iterator<e> it2 = this.f10539.iterator();
                while (it2.hasNext()) {
                    it2.next().mo11185(dVar, m11353);
                }
                this.f10539.clear();
            }
        }
        if (n.d.f9422) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar4 = this.f10609.get(i8);
                if (!eVar4.m11292()) {
                    hashSet.add(eVar4);
                }
            }
            m11290(this, dVar, hashSet, m11311() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.m11432(this, dVar, next);
                next.mo11185(dVar, m11353);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                e eVar5 = this.f10609.get(i9);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.f10419;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.m11260(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.m11278(e.b.FIXED);
                    }
                    eVar5.mo11185(dVar, m11353);
                    if (bVar == bVar3) {
                        eVar5.m11260(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.m11278(bVar2);
                    }
                } else {
                    k.m11432(this, dVar, eVar5);
                    if (!eVar5.m11292()) {
                        eVar5.mo11185(dVar, m11353);
                    }
                }
            }
        }
        if (this.f10521 > 0) {
            b.m11188(this, dVar, null, 0);
        }
        if (this.f10522 > 0) {
            b.m11188(this, dVar, null, 1);
        }
        return true;
    }

    /* renamed from: ʾˉ, reason: contains not printable characters */
    public void m11336(d dVar) {
        WeakReference<d> weakReference = this.f10538;
        if (weakReference == null || weakReference.get() == null || dVar.m11196() > this.f10538.get().m11196()) {
            this.f10538 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: ʾˊ, reason: contains not printable characters */
    public void m11337(d dVar) {
        WeakReference<d> weakReference = this.f10536;
        if (weakReference == null || weakReference.get() == null || dVar.m11196() > this.f10536.get().m11196()) {
            this.f10536 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: ʾˑ, reason: contains not printable characters */
    void m11338(d dVar) {
        WeakReference<d> weakReference = this.f10537;
        if (weakReference == null || weakReference.get() == null || dVar.m11196() > this.f10537.get().m11196()) {
            this.f10537 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: ʾי, reason: contains not printable characters */
    void m11339(d dVar) {
        WeakReference<d> weakReference = this.f10535;
        if (weakReference == null || weakReference.get() == null || dVar.m11196() > this.f10535.get().m11196()) {
            this.f10535 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: ʾـ, reason: contains not printable characters */
    public boolean m11340(boolean z5) {
        return this.f10512.m11578(z5);
    }

    /* renamed from: ʾٴ, reason: contains not printable characters */
    public boolean m11341(boolean z5) {
        return this.f10512.m11579(z5);
    }

    /* renamed from: ʾᐧ, reason: contains not printable characters */
    public boolean m11342(boolean z5, int i5) {
        return this.f10512.m11580(z5, i5);
    }

    /* renamed from: ʾᴵ, reason: contains not printable characters */
    public b.InterfaceC0152b m11343() {
        return this.f10514;
    }

    /* renamed from: ʾᵎ, reason: contains not printable characters */
    public int m11344() {
        return this.f10530;
    }

    /* renamed from: ʾᵔ, reason: contains not printable characters */
    public n.d m11345() {
        return this.f10516;
    }

    /* renamed from: ʾᵢ, reason: contains not printable characters */
    public boolean m11346() {
        return false;
    }

    /* renamed from: ʾⁱ, reason: contains not printable characters */
    public void m11347() {
        this.f10512.m11581();
    }

    /* renamed from: ʾﹳ, reason: contains not printable characters */
    public void m11348() {
        this.f10512.m11582();
    }

    /* renamed from: ʾﹶ, reason: contains not printable characters */
    public boolean m11349() {
        return this.f10533;
    }

    /* renamed from: ʾﾞ, reason: contains not printable characters */
    public boolean m11350() {
        return this.f10515;
    }

    /* renamed from: ʿʻ, reason: contains not printable characters */
    public boolean m11351() {
        return this.f10532;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long m11352(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f10517 = i12;
        this.f10518 = i13;
        return this.f10511.m11560(this, i5, i12, i13, i6, i7, i8, i9, i10, i11);
    }

    /* renamed from: ʿʾ, reason: contains not printable characters */
    public boolean m11353(int i5) {
        return (this.f10530 & i5) == i5;
    }

    /* renamed from: ʿˈ, reason: contains not printable characters */
    public void m11354(b.InterfaceC0152b interfaceC0152b) {
        this.f10514 = interfaceC0152b;
        this.f10512.m11584(interfaceC0152b);
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public void m11355(int i5) {
        this.f10530 = i5;
        n.d.f9422 = m11353(512);
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public void m11356(int i5) {
        this.f10513 = i5;
    }

    /* renamed from: ʿˋ, reason: contains not printable characters */
    public void m11357(boolean z5) {
        this.f10515 = z5;
    }

    /* renamed from: ʿˎ, reason: contains not printable characters */
    public boolean m11358(n.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean m11353 = m11353(64);
        mo11288(dVar, m11353);
        int size = this.f10609.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f10609.get(i5);
            eVar.mo11288(dVar, m11353);
            if (eVar.m11226()) {
                z5 = true;
            }
        }
        return z5;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public void m11359() {
        this.f10511.m11561(this);
    }

    @Override // q.e
    /* renamed from: ˎˎ */
    public void mo11300(StringBuilder sb) {
        sb.append(this.f10482 + ":{\n");
        sb.append("  actualWidth:" + this.f10421);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f10422);
        sb.append("\n");
        Iterator<e> it = m11456().iterator();
        while (it.hasNext()) {
            it.next().mo11300(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
