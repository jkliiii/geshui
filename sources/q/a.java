package q;

import q.d;
import q.e;

/* compiled from: Barrier.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends j {

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    private int f10369 = 0;

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    private boolean f10370 = true;

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    private int f10371 = 0;

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    boolean f10372 = false;

    @Override // q.e
    public String toString() {
        String str = "[Barrier] " + m11316() + " {";
        for (int i5 = 0; i5 < this.f10594; i5++) {
            e eVar = this.f10593[i5];
            if (i5 > 0) {
                str = str + ", ";
            }
            str = str + eVar.m11316();
        }
        return str + "}";
    }

    @Override // q.e
    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public boolean mo11174() {
        return this.f10372;
    }

    @Override // q.e
    /* renamed from: ʻᴵ, reason: contains not printable characters */
    public boolean mo11175() {
        return this.f10372;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean m11176() {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        boolean z5 = true;
        while (true) {
            i5 = this.f10594;
            if (i8 >= i5) {
                break;
            }
            e eVar = this.f10593[i8];
            if ((this.f10370 || eVar.mo11186()) && ((((i6 = this.f10369) == 0 || i6 == 1) && !eVar.mo11174()) || (((i7 = this.f10369) == 2 || i7 == 3) && !eVar.mo11175()))) {
                z5 = false;
            }
            i8++;
        }
        if (!z5 || i5 <= 0) {
            return false;
        }
        int i9 = 0;
        boolean z6 = false;
        for (int i10 = 0; i10 < this.f10594; i10++) {
            e eVar2 = this.f10593[i10];
            if (this.f10370 || eVar2.mo11186()) {
                if (!z6) {
                    int i11 = this.f10369;
                    if (i11 == 0) {
                        i9 = eVar2.mo11306(d.b.LEFT).m11196();
                    } else if (i11 == 1) {
                        i9 = eVar2.mo11306(d.b.RIGHT).m11196();
                    } else if (i11 == 2) {
                        i9 = eVar2.mo11306(d.b.TOP).m11196();
                    } else if (i11 == 3) {
                        i9 = eVar2.mo11306(d.b.BOTTOM).m11196();
                    }
                    z6 = true;
                }
                int i12 = this.f10369;
                if (i12 == 0) {
                    i9 = Math.min(i9, eVar2.mo11306(d.b.LEFT).m11196());
                } else if (i12 == 1) {
                    i9 = Math.max(i9, eVar2.mo11306(d.b.RIGHT).m11196());
                } else if (i12 == 2) {
                    i9 = Math.min(i9, eVar2.mo11306(d.b.TOP).m11196());
                } else if (i12 == 3) {
                    i9 = Math.max(i9, eVar2.mo11306(d.b.BOTTOM).m11196());
                }
            }
        }
        int i13 = i9 + this.f10371;
        int i14 = this.f10369;
        if (i14 == 0 || i14 == 1) {
            m11250(i13, i13);
        } else {
            m11253(i13, i13);
        }
        this.f10372 = true;
        return true;
    }

    /* renamed from: ʾʽ, reason: contains not printable characters */
    public boolean m11177() {
        return this.f10370;
    }

    /* renamed from: ʾʿ, reason: contains not printable characters */
    public int m11178() {
        return this.f10369;
    }

    /* renamed from: ʾˆ, reason: contains not printable characters */
    public int m11179() {
        return this.f10371;
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int m11180() {
        int i5 = this.f10369;
        if (i5 == 0 || i5 == 1) {
            return 0;
        }
        return (i5 == 2 || i5 == 3) ? 1 : -1;
    }

    /* renamed from: ʾˉ, reason: contains not printable characters */
    protected void m11181() {
        for (int i5 = 0; i5 < this.f10594; i5++) {
            e eVar = this.f10593[i5];
            if (this.f10370 || eVar.mo11186()) {
                int i6 = this.f10369;
                if (i6 == 0 || i6 == 1) {
                    eVar.m11263(0, true);
                } else if (i6 == 2 || i6 == 3) {
                    eVar.m11263(1, true);
                }
            }
        }
    }

    /* renamed from: ʾˊ, reason: contains not printable characters */
    public void m11182(boolean z5) {
        this.f10370 = z5;
    }

    /* renamed from: ʾˋ, reason: contains not printable characters */
    public void m11183(int i5) {
        this.f10369 = i5;
    }

    /* renamed from: ʾˎ, reason: contains not printable characters */
    public void m11184(int i5) {
        this.f10371 = i5;
    }

    @Override // q.e
    /* renamed from: ˈ, reason: contains not printable characters */
    public void mo11185(n.d dVar, boolean z5) {
        d[] dVarArr;
        boolean z6;
        int i5;
        int i6;
        int i7;
        d[] dVarArr2 = this.f10485;
        dVarArr2[0] = this.f10475;
        dVarArr2[2] = this.f10479;
        dVarArr2[1] = this.f10493;
        dVarArr2[3] = this.f10481;
        int i8 = 0;
        while (true) {
            dVarArr = this.f10485;
            if (i8 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i8];
            dVar2.f10403 = dVar.m10365(dVar2);
            i8++;
        }
        int i9 = this.f10369;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i9];
        if (!this.f10372) {
            m11176();
        }
        if (this.f10372) {
            this.f10372 = false;
            int i10 = this.f10369;
            if (i10 == 0 || i10 == 1) {
                dVar.m10356(this.f10475.f10403, this.f10425);
                dVar.m10356(this.f10493.f10403, this.f10425);
                return;
            } else {
                if (i10 == 2 || i10 == 3) {
                    dVar.m10356(this.f10479.f10403, this.f10426);
                    dVar.m10356(this.f10481.f10403, this.f10426);
                    return;
                }
                return;
            }
        }
        for (int i11 = 0; i11 < this.f10594; i11++) {
            e eVar = this.f10593[i11];
            if ((this.f10370 || eVar.mo11186()) && ((((i6 = this.f10369) == 0 || i6 == 1) && eVar.m11311() == e.b.MATCH_CONSTRAINT && eVar.f10475.f10400 != null && eVar.f10493.f10400 != null) || (((i7 = this.f10369) == 2 || i7 == 3) && eVar.m11318() == e.b.MATCH_CONSTRAINT && eVar.f10479.f10400 != null && eVar.f10481.f10400 != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z7 = this.f10475.m11203() || this.f10493.m11203();
        boolean z8 = this.f10479.m11203() || this.f10481.m11203();
        int i12 = !(!z6 && (((i5 = this.f10369) == 0 && z7) || ((i5 == 2 && z8) || ((i5 == 1 && z7) || (i5 == 3 && z8))))) ? 4 : 5;
        for (int i13 = 0; i13 < this.f10594; i13++) {
            e eVar2 = this.f10593[i13];
            if (this.f10370 || eVar2.mo11186()) {
                n.i m10365 = dVar.m10365(eVar2.f10485[this.f10369]);
                d[] dVarArr3 = eVar2.f10485;
                int i14 = this.f10369;
                d dVar4 = dVarArr3[i14];
                dVar4.f10403 = m10365;
                d dVar5 = dVar4.f10400;
                int i15 = (dVar5 == null || dVar5.f10398 != this) ? 0 : dVar4.f10401 + 0;
                if (i14 == 0 || i14 == 2) {
                    dVar.m10359(dVar3.f10403, m10365, this.f10371 - i15, z6);
                } else {
                    dVar.m10357(dVar3.f10403, m10365, this.f10371 + i15, z6);
                }
                dVar.m10355(dVar3.f10403, m10365, this.f10371 + i15, i12);
            }
        }
        int i16 = this.f10369;
        if (i16 == 0) {
            dVar.m10355(this.f10493.f10403, this.f10475.f10403, 0, 8);
            dVar.m10355(this.f10475.f10403, this.f10420.f10493.f10403, 0, 4);
            dVar.m10355(this.f10475.f10403, this.f10420.f10475.f10403, 0, 0);
            return;
        }
        if (i16 == 1) {
            dVar.m10355(this.f10475.f10403, this.f10493.f10403, 0, 8);
            dVar.m10355(this.f10475.f10403, this.f10420.f10475.f10403, 0, 4);
            dVar.m10355(this.f10475.f10403, this.f10420.f10493.f10403, 0, 0);
        } else if (i16 == 2) {
            dVar.m10355(this.f10481.f10403, this.f10479.f10403, 0, 8);
            dVar.m10355(this.f10479.f10403, this.f10420.f10481.f10403, 0, 4);
            dVar.m10355(this.f10479.f10403, this.f10420.f10479.f10403, 0, 0);
        } else if (i16 == 3) {
            dVar.m10355(this.f10479.f10403, this.f10481.f10403, 0, 8);
            dVar.m10355(this.f10479.f10403, this.f10420.f10479.f10403, 0, 4);
            dVar.m10355(this.f10479.f10403, this.f10420.f10481.f10403, 0, 0);
        }
    }

    @Override // q.e
    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean mo11186() {
        return true;
    }
}
