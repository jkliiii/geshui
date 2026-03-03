package n;

import java.util.Arrays;
import java.util.Comparator;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n.b;

/* compiled from: PriorityGoalRow.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends n.b {

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f9450;

    /* renamed from: ˉ, reason: contains not printable characters */
    private i[] f9451;

    /* renamed from: ˊ, reason: contains not printable characters */
    private i[] f9452;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f9453;

    /* renamed from: ˎ, reason: contains not printable characters */
    b f9454;

    /* renamed from: ˏ, reason: contains not printable characters */
    c f9455;

    /* compiled from: PriorityGoalRow.java */
    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f9463 - iVar2.f9463;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        i f9457;

        /* renamed from: ʼ, reason: contains not printable characters */
        h f9458;

        public b(h hVar) {
            this.f9458 = hVar;
        }

        public String toString() {
            String str = "[ ";
            if (this.f9457 != null) {
                for (int i5 = 0; i5 < 9; i5++) {
                    str = str + this.f9457.f9469[i5] + " ";
                }
            }
            return str + "] " + this.f9457;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m10379(i iVar, float f5) {
            boolean z5 = true;
            if (!this.f9457.f9461) {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f6 = iVar.f9469[i5];
                    if (f6 != 0.0f) {
                        float f7 = f6 * f5;
                        if (Math.abs(f7) < 1.0E-4f) {
                            f7 = 0.0f;
                        }
                        this.f9457.f9469[i5] = f7;
                    } else {
                        this.f9457.f9469[i5] = 0.0f;
                    }
                }
                return true;
            }
            for (int i6 = 0; i6 < 9; i6++) {
                float[] fArr = this.f9457.f9469;
                float f8 = fArr[i6] + (iVar.f9469[i6] * f5);
                fArr[i6] = f8;
                if (Math.abs(f8) < 1.0E-4f) {
                    this.f9457.f9469[i6] = 0.0f;
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                h.this.m10376(this.f9457);
            }
            return false;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m10380(i iVar) {
            this.f9457 = iVar;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final boolean m10381() {
            for (int i5 = 8; i5 >= 0; i5--) {
                float f5 = this.f9457.f9469[i5];
                if (f5 > 0.0f) {
                    return false;
                }
                if (f5 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public final boolean m10382(i iVar) {
            int i5 = 8;
            while (true) {
                if (i5 < 0) {
                    break;
                }
                float f5 = iVar.f9469[i5];
                float f6 = this.f9457.f9469[i5];
                if (f6 == f5) {
                    i5--;
                } else if (f6 < f5) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public void m10383() {
            Arrays.fill(this.f9457.f9469, 0.0f);
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f9450 = 128;
        this.f9451 = new i[128];
        this.f9452 = new i[128];
        this.f9453 = 0;
        this.f9454 = new b(this);
        this.f9455 = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʾ, reason: contains not printable characters */
    public final void m10376(i iVar) {
        int i5 = 0;
        while (i5 < this.f9453) {
            if (this.f9451[i5] == iVar) {
                while (true) {
                    int i6 = this.f9453;
                    if (i5 >= i6 - 1) {
                        this.f9453 = i6 - 1;
                        iVar.f9461 = false;
                        return;
                    } else {
                        i[] iVarArr = this.f9451;
                        int i7 = i5 + 1;
                        iVarArr[i5] = iVarArr[i7];
                        i5 = i7;
                    }
                }
            } else {
                i5++;
            }
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private final void m10377(i iVar) {
        int i5;
        int i6 = this.f9453 + 1;
        i[] iVarArr = this.f9451;
        if (i6 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f9451 = iVarArr2;
            this.f9452 = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f9451;
        int i7 = this.f9453;
        iVarArr3[i7] = iVar;
        int i8 = i7 + 1;
        this.f9453 = i8;
        if (i8 > 1 && iVarArr3[i8 - 1].f9463 > iVar.f9463) {
            int i9 = 0;
            while (true) {
                i5 = this.f9453;
                if (i9 >= i5) {
                    break;
                }
                this.f9452[i9] = this.f9451[i9];
                i9++;
            }
            Arrays.sort(this.f9452, 0, i5, new a());
            for (int i10 = 0; i10 < this.f9453; i10++) {
                this.f9451[i10] = this.f9452[i10];
            }
        }
        iVar.f9461 = true;
        iVar.m10385(this);
    }

    @Override // n.b, n.d.a
    public void clear() {
        this.f9453 = 0;
        this.f9413 = 0.0f;
    }

    @Override // n.b, n.d.a
    public boolean isEmpty() {
        return this.f9453 == 0;
    }

    @Override // n.b
    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f9413 + ") : ";
        for (int i5 = 0; i5 < this.f9453; i5++) {
            this.f9454.m10380(this.f9451[i5]);
            str = str + this.f9454 + " ";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // n.b, n.d.a
    /* renamed from: ʻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n.i mo10314(n.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f9453
            if (r0 >= r2) goto L32
            n.i[] r2 = r4.f9451
            r2 = r2[r0]
            int r3 = r2.f9463
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            n.h$b r3 = r4.f9454
            r3.m10380(r2)
            if (r1 != r5) goto L22
            n.h$b r2 = r4.f9454
            boolean r2 = r2.m10381()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            n.h$b r2 = r4.f9454
            n.i[] r3 = r4.f9451
            r3 = r3[r1]
            boolean r2 = r2.m10382(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            n.i[] r5 = r4.f9451
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n.h.mo10314(n.d, boolean[]):n.i");
    }

    @Override // n.b, n.d.a
    /* renamed from: ʼ */
    public void mo10316(i iVar) {
        this.f9454.m10380(iVar);
        this.f9454.m10383();
        iVar.f9469[iVar.f9465] = 1.0f;
        m10377(iVar);
    }

    @Override // n.b
    /* renamed from: ᴵᴵ */
    public void mo10335(d dVar, n.b bVar, boolean z5) {
        i iVar = bVar.f9412;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f9416;
        int mo10305 = aVar.mo10305();
        for (int i5 = 0; i5 < mo10305; i5++) {
            i mo10308 = aVar.mo10308(i5);
            float mo10301 = aVar.mo10301(i5);
            this.f9454.m10380(mo10308);
            if (this.f9454.m10379(iVar, mo10301)) {
                m10377(mo10308);
            }
            this.f9413 += bVar.f9413 * mo10301;
        }
        m10376(iVar);
    }
}
