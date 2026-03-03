package q;

import java.util.ArrayList;
import q.e;

/* compiled from: ChainHead.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected e f10373;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected e f10374;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected e f10375;

    /* renamed from: ʾ, reason: contains not printable characters */
    protected e f10376;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected e f10377;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected e f10378;

    /* renamed from: ˈ, reason: contains not printable characters */
    protected e f10379;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected ArrayList<e> f10380;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected int f10381;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected int f10382;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected float f10383 = 0.0f;

    /* renamed from: ˏ, reason: contains not printable characters */
    int f10384;

    /* renamed from: ˑ, reason: contains not printable characters */
    int f10385;

    /* renamed from: י, reason: contains not printable characters */
    int f10386;

    /* renamed from: ـ, reason: contains not printable characters */
    boolean f10387;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f10388;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f10389;

    /* renamed from: ᴵ, reason: contains not printable characters */
    protected boolean f10390;

    /* renamed from: ᵎ, reason: contains not printable characters */
    protected boolean f10391;

    /* renamed from: ᵔ, reason: contains not printable characters */
    protected boolean f10392;

    /* renamed from: ᵢ, reason: contains not printable characters */
    protected boolean f10393;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f10394;

    public c(e eVar, int i5, boolean z5) {
        this.f10373 = eVar;
        this.f10388 = i5;
        this.f10389 = z5;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m11189() {
        int i5 = this.f10388 * 2;
        e eVar = this.f10373;
        this.f10387 = true;
        e eVar2 = eVar;
        boolean z5 = false;
        while (!z5) {
            this.f10381++;
            e[] eVarArr = eVar.f10453;
            int i6 = this.f10388;
            e eVar3 = null;
            eVarArr[i6] = null;
            eVar.f10452[i6] = null;
            if (eVar.m11322() != 8) {
                this.f10384++;
                e.b m11317 = eVar.m11317(this.f10388);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (m11317 != bVar) {
                    this.f10385 += eVar.m11244(this.f10388);
                }
                int m11197 = this.f10385 + eVar.f10485[i5].m11197();
                this.f10385 = m11197;
                int i7 = i5 + 1;
                this.f10385 = m11197 + eVar.f10485[i7].m11197();
                int m111972 = this.f10386 + eVar.f10485[i5].m11197();
                this.f10386 = m111972;
                this.f10386 = m111972 + eVar.f10485[i7].m11197();
                if (this.f10374 == null) {
                    this.f10374 = eVar;
                }
                this.f10376 = eVar;
                e.b[] bVarArr = eVar.f10419;
                int i8 = this.f10388;
                if (bVarArr[i8] == bVar) {
                    int i9 = eVar.f10502[i8];
                    if (i9 == 0 || i9 == 3 || i9 == 2) {
                        this.f10382++;
                        float f5 = eVar.f10451[i8];
                        if (f5 > 0.0f) {
                            this.f10383 += f5;
                        }
                        if (m11190(eVar, i8)) {
                            if (f5 < 0.0f) {
                                this.f10390 = true;
                            } else {
                                this.f10391 = true;
                            }
                            if (this.f10380 == null) {
                                this.f10380 = new ArrayList<>();
                            }
                            this.f10380.add(eVar);
                        }
                        if (this.f10378 == null) {
                            this.f10378 = eVar;
                        }
                        e eVar4 = this.f10379;
                        if (eVar4 != null) {
                            eVar4.f10452[this.f10388] = eVar;
                        }
                        this.f10379 = eVar;
                    }
                    if (this.f10388 == 0) {
                        if (eVar.f10498 != 0) {
                            this.f10387 = false;
                        } else if (eVar.f10503 != 0 || eVar.f10487 != 0) {
                            this.f10387 = false;
                        }
                    } else if (eVar.f10500 != 0) {
                        this.f10387 = false;
                    } else if (eVar.f10417 != 0 || eVar.f10459 != 0) {
                        this.f10387 = false;
                    }
                    if (eVar.f10423 != 0.0f) {
                        this.f10387 = false;
                        this.f10393 = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f10453[this.f10388] = eVar;
            }
            d dVar = eVar.f10485[i5 + 1].f10400;
            if (dVar != null) {
                e eVar5 = dVar.f10398;
                d dVar2 = eVar5.f10485[i5].f10400;
                if (dVar2 != null && dVar2.f10398 == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z5 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f10374;
        if (eVar6 != null) {
            this.f10385 -= eVar6.f10485[i5].m11197();
        }
        e eVar7 = this.f10376;
        if (eVar7 != null) {
            this.f10385 -= eVar7.f10485[i5 + 1].m11197();
        }
        this.f10375 = eVar;
        if (this.f10388 == 0 && this.f10389) {
            this.f10377 = eVar;
        } else {
            this.f10377 = this.f10373;
        }
        this.f10392 = this.f10391 && this.f10390;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m11190(e eVar, int i5) {
        int i6;
        return eVar.m11322() != 8 && eVar.f10419[i5] == e.b.MATCH_CONSTRAINT && ((i6 = eVar.f10502[i5]) == 0 || i6 == 3);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m11191() {
        if (!this.f10394) {
            m11189();
        }
        this.f10394 = true;
    }
}
