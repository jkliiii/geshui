package q;

import java.util.ArrayList;
import java.util.Arrays;
import r.o;

/* compiled from: HelperWidget.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends e implements i {

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    public e[] f10593 = new e[4];

    /* renamed from: ʼᴵ, reason: contains not printable characters */
    public int f10594 = 0;

    @Override // q.i
    /* renamed from: ʼ */
    public void mo11428(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i5 = this.f10594 + 1;
        e[] eVarArr = this.f10593;
        if (i5 > eVarArr.length) {
            this.f10593 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f10593;
        int i6 = this.f10594;
        eVarArr2[i6] = eVar;
        this.f10594 = i6 + 1;
    }

    @Override // q.i
    /* renamed from: ʽ */
    public void mo11429() {
        this.f10594 = 0;
        Arrays.fill(this.f10593, (Object) null);
    }

    /* renamed from: ʽﾞ, reason: contains not printable characters */
    public void m11430(ArrayList<o> arrayList, int i5, o oVar) {
        for (int i6 = 0; i6 < this.f10594; i6++) {
            oVar.m11612(this.f10593[i6]);
        }
        for (int i7 = 0; i7 < this.f10594; i7++) {
            r.i.m11597(this.f10593[i7], i5, arrayList, oVar);
        }
    }

    /* renamed from: ʾʻ, reason: contains not printable characters */
    public int m11431(int i5) {
        int i6;
        int i7;
        for (int i8 = 0; i8 < this.f10594; i8++) {
            e eVar = this.f10593[i8];
            if (i5 == 0 && (i7 = eVar.f10456) != -1) {
                return i7;
            }
            if (i5 == 1 && (i6 = eVar.f10457) != -1) {
                return i6;
            }
        }
        return -1;
    }

    @Override // q.i
    /* renamed from: ʻ */
    public void mo11427(f fVar) {
    }
}
