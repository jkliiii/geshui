package q;

import java.util.ArrayList;
import q.e;

/* compiled from: Flow.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends l {

    /* renamed from: ʾˈ, reason: contains not printable characters */
    private e[] f10564;

    /* renamed from: ʽˉ, reason: contains not printable characters */
    private int f10541 = -1;

    /* renamed from: ʽˊ, reason: contains not printable characters */
    private int f10542 = -1;

    /* renamed from: ʽˋ, reason: contains not printable characters */
    private int f10543 = -1;

    /* renamed from: ʽˎ, reason: contains not printable characters */
    private int f10544 = -1;

    /* renamed from: ʽˏ, reason: contains not printable characters */
    private int f10545 = -1;

    /* renamed from: ʽˑ, reason: contains not printable characters */
    private int f10546 = -1;

    /* renamed from: ʽי, reason: contains not printable characters */
    private float f10547 = 0.5f;

    /* renamed from: ʽـ, reason: contains not printable characters */
    private float f10548 = 0.5f;

    /* renamed from: ʽٴ, reason: contains not printable characters */
    private float f10549 = 0.5f;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private float f10550 = 0.5f;

    /* renamed from: ʽᴵ, reason: contains not printable characters */
    private float f10551 = 0.5f;

    /* renamed from: ʽᵎ, reason: contains not printable characters */
    private float f10552 = 0.5f;

    /* renamed from: ʽᵔ, reason: contains not printable characters */
    private int f10553 = 0;

    /* renamed from: ʽᵢ, reason: contains not printable characters */
    private int f10554 = 0;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    private int f10555 = 2;

    /* renamed from: ʽﹳ, reason: contains not printable characters */
    private int f10556 = 2;

    /* renamed from: ʽﹶ, reason: contains not printable characters */
    private int f10557 = 0;

    /* renamed from: ʽﾞ, reason: contains not printable characters */
    private int f10558 = -1;

    /* renamed from: ʾʻ, reason: contains not printable characters */
    private int f10559 = 0;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    private ArrayList<a> f10560 = new ArrayList<>();

    /* renamed from: ʾʽ, reason: contains not printable characters */
    private e[] f10561 = null;

    /* renamed from: ʾʿ, reason: contains not printable characters */
    private e[] f10562 = null;

    /* renamed from: ʾˆ, reason: contains not printable characters */
    private int[] f10563 = null;

    /* renamed from: ʾˉ, reason: contains not printable characters */
    private int f10565 = 0;

    /* compiled from: Flow.java */
    private class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f10566;

        /* renamed from: ʾ, reason: contains not printable characters */
        private d f10569;

        /* renamed from: ʿ, reason: contains not printable characters */
        private d f10570;

        /* renamed from: ˆ, reason: contains not printable characters */
        private d f10571;

        /* renamed from: ˈ, reason: contains not printable characters */
        private d f10572;

        /* renamed from: ˉ, reason: contains not printable characters */
        private int f10573;

        /* renamed from: ˊ, reason: contains not printable characters */
        private int f10574;

        /* renamed from: ˋ, reason: contains not printable characters */
        private int f10575;

        /* renamed from: ˎ, reason: contains not printable characters */
        private int f10576;

        /* renamed from: ᐧ, reason: contains not printable characters */
        private int f10582;

        /* renamed from: ʼ, reason: contains not printable characters */
        private e f10567 = null;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f10568 = 0;

        /* renamed from: ˏ, reason: contains not printable characters */
        private int f10577 = 0;

        /* renamed from: ˑ, reason: contains not printable characters */
        private int f10578 = 0;

        /* renamed from: י, reason: contains not printable characters */
        private int f10579 = 0;

        /* renamed from: ـ, reason: contains not printable characters */
        private int f10580 = 0;

        /* renamed from: ٴ, reason: contains not printable characters */
        private int f10581 = 0;

        public a(int i5, d dVar, d dVar2, d dVar3, d dVar4, int i6) {
            this.f10573 = 0;
            this.f10574 = 0;
            this.f10575 = 0;
            this.f10576 = 0;
            this.f10582 = 0;
            this.f10566 = i5;
            this.f10569 = dVar;
            this.f10570 = dVar2;
            this.f10571 = dVar3;
            this.f10572 = dVar4;
            this.f10573 = g.this.m11440();
            this.f10574 = g.this.m11442();
            this.f10575 = g.this.m11441();
            this.f10576 = g.this.m11439();
            this.f10582 = i6;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private void m11408() {
            this.f10577 = 0;
            this.f10578 = 0;
            this.f10567 = null;
            this.f10568 = 0;
            int i5 = this.f10580;
            for (int i6 = 0; i6 < i5 && this.f10579 + i6 < g.this.f10565; i6++) {
                e eVar = g.this.f10564[this.f10579 + i6];
                if (this.f10566 == 0) {
                    int m11309 = eVar.m11309();
                    int i7 = g.this.f10553;
                    if (eVar.m11322() == 8) {
                        i7 = 0;
                    }
                    this.f10577 += m11309 + i7;
                    int m11381 = g.this.m11381(eVar, this.f10582);
                    if (this.f10567 == null || this.f10568 < m11381) {
                        this.f10567 = eVar;
                        this.f10568 = m11381;
                        this.f10578 = m11381;
                    }
                } else {
                    int m11382 = g.this.m11382(eVar, this.f10582);
                    int m113812 = g.this.m11381(eVar, this.f10582);
                    int i8 = g.this.f10554;
                    if (eVar.m11322() == 8) {
                        i8 = 0;
                    }
                    this.f10578 += m113812 + i8;
                    if (this.f10567 == null || this.f10568 < m11382) {
                        this.f10567 = eVar;
                        this.f10568 = m11382;
                        this.f10577 = m11382;
                    }
                }
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m11409(e eVar) {
            if (this.f10566 == 0) {
                int m11382 = g.this.m11382(eVar, this.f10582);
                if (eVar.m11311() == e.b.MATCH_CONSTRAINT) {
                    this.f10581++;
                    m11382 = 0;
                }
                this.f10577 += m11382 + (eVar.m11322() != 8 ? g.this.f10553 : 0);
                int m11381 = g.this.m11381(eVar, this.f10582);
                if (this.f10567 == null || this.f10568 < m11381) {
                    this.f10567 = eVar;
                    this.f10568 = m11381;
                    this.f10578 = m11381;
                }
            } else {
                int m113822 = g.this.m11382(eVar, this.f10582);
                int m113812 = g.this.m11381(eVar, this.f10582);
                if (eVar.m11318() == e.b.MATCH_CONSTRAINT) {
                    this.f10581++;
                    m113812 = 0;
                }
                this.f10578 += m113812 + (eVar.m11322() != 8 ? g.this.f10554 : 0);
                if (this.f10567 == null || this.f10568 < m113822) {
                    this.f10567 = eVar;
                    this.f10568 = m113822;
                    this.f10577 = m113822;
                }
            }
            this.f10580++;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m11410() {
            this.f10568 = 0;
            this.f10567 = null;
            this.f10577 = 0;
            this.f10578 = 0;
            this.f10579 = 0;
            this.f10580 = 0;
            this.f10581 = 0;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m11411(boolean z5, int i5, boolean z6) {
            e eVar;
            float f5;
            float f6;
            int i6 = this.f10580;
            for (int i7 = 0; i7 < i6 && this.f10579 + i7 < g.this.f10565; i7++) {
                e eVar2 = g.this.f10564[this.f10579 + i7];
                if (eVar2 != null) {
                    eVar2.m11241();
                }
            }
            if (i6 == 0 || this.f10567 == null) {
                return;
            }
            boolean z7 = z6 && i5 == 0;
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = z5 ? (i6 - 1) - i10 : i10;
                if (this.f10579 + i11 >= g.this.f10565) {
                    break;
                }
                e eVar3 = g.this.f10564[this.f10579 + i11];
                if (eVar3 != null && eVar3.m11322() == 0) {
                    if (i8 == -1) {
                        i8 = i10;
                    }
                    i9 = i10;
                }
            }
            e eVar4 = null;
            if (this.f10566 != 0) {
                e eVar5 = this.f10567;
                eVar5.m11258(g.this.f10541);
                int i12 = this.f10573;
                if (i5 > 0) {
                    i12 += g.this.f10553;
                }
                if (z5) {
                    eVar5.f10493.m11192(this.f10571, i12);
                    if (z6) {
                        eVar5.f10475.m11192(this.f10569, this.f10575);
                    }
                    if (i5 > 0) {
                        this.f10571.f10398.f10475.m11192(eVar5.f10493, 0);
                    }
                } else {
                    eVar5.f10475.m11192(this.f10569, i12);
                    if (z6) {
                        eVar5.f10493.m11192(this.f10571, this.f10575);
                    }
                    if (i5 > 0) {
                        this.f10569.f10398.f10493.m11192(eVar5.f10475, 0);
                    }
                }
                for (int i13 = 0; i13 < i6 && this.f10579 + i13 < g.this.f10565; i13++) {
                    e eVar6 = g.this.f10564[this.f10579 + i13];
                    if (eVar6 != null) {
                        if (i13 == 0) {
                            eVar6.m11299(eVar6.f10479, this.f10570, this.f10574);
                            int i14 = g.this.f10542;
                            float f7 = g.this.f10548;
                            if (this.f10579 == 0 && g.this.f10544 != -1) {
                                i14 = g.this.f10544;
                                f7 = g.this.f10550;
                            } else if (z6 && g.this.f10546 != -1) {
                                i14 = g.this.f10546;
                                f7 = g.this.f10552;
                            }
                            eVar6.m11276(i14);
                            eVar6.m11275(f7);
                        }
                        if (i13 == i6 - 1) {
                            eVar6.m11299(eVar6.f10481, this.f10572, this.f10576);
                        }
                        if (eVar4 != null) {
                            eVar6.f10479.m11192(eVar4.f10481, g.this.f10554);
                            if (i13 == i8) {
                                eVar6.f10479.m11212(this.f10574);
                            }
                            eVar4.f10481.m11192(eVar6.f10479, 0);
                            if (i13 == i9 + 1) {
                                eVar4.f10481.m11212(this.f10576);
                            }
                        }
                        if (eVar6 == eVar5) {
                            eVar4 = eVar6;
                        } else if (z5) {
                            int i15 = g.this.f10555;
                            if (i15 == 0) {
                                eVar6.f10493.m11192(eVar5.f10493, 0);
                            } else if (i15 == 1) {
                                eVar6.f10475.m11192(eVar5.f10475, 0);
                            } else if (i15 == 2) {
                                eVar6.f10475.m11192(eVar5.f10475, 0);
                                eVar6.f10493.m11192(eVar5.f10493, 0);
                            }
                            eVar4 = eVar6;
                        } else {
                            int i16 = g.this.f10555;
                            if (i16 == 0) {
                                eVar6.f10475.m11192(eVar5.f10475, 0);
                            } else if (i16 == 1) {
                                eVar6.f10493.m11192(eVar5.f10493, 0);
                            } else if (i16 == 2) {
                                if (z7) {
                                    eVar6.f10475.m11192(this.f10569, this.f10573);
                                    eVar6.f10493.m11192(this.f10571, this.f10575);
                                } else {
                                    eVar6.f10475.m11192(eVar5.f10475, 0);
                                    eVar6.f10493.m11192(eVar5.f10493, 0);
                                }
                            }
                            eVar4 = eVar6;
                        }
                    }
                }
                return;
            }
            e eVar7 = this.f10567;
            eVar7.m11276(g.this.f10542);
            int i17 = this.f10574;
            if (i5 > 0) {
                i17 += g.this.f10554;
            }
            eVar7.f10479.m11192(this.f10570, i17);
            if (z6) {
                eVar7.f10481.m11192(this.f10572, this.f10576);
            }
            if (i5 > 0) {
                this.f10570.f10398.f10481.m11192(eVar7.f10479, 0);
            }
            if (g.this.f10556 != 3 || eVar7.m11223()) {
                eVar = eVar7;
            } else {
                for (int i18 = 0; i18 < i6; i18++) {
                    int i19 = z5 ? (i6 - 1) - i18 : i18;
                    if (this.f10579 + i19 >= g.this.f10565) {
                        break;
                    }
                    eVar = g.this.f10564[this.f10579 + i19];
                    if (eVar.m11223()) {
                        break;
                    }
                }
                eVar = eVar7;
            }
            int i20 = 0;
            while (i20 < i6) {
                int i21 = z5 ? (i6 - 1) - i20 : i20;
                if (this.f10579 + i21 >= g.this.f10565) {
                    return;
                }
                e eVar8 = g.this.f10564[this.f10579 + i21];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                } else {
                    if (i20 == 0) {
                        eVar8.m11299(eVar8.f10475, this.f10569, this.f10573);
                    }
                    if (i21 == 0) {
                        int i22 = g.this.f10541;
                        float f8 = g.this.f10547;
                        if (z5) {
                            f8 = 1.0f - f8;
                        }
                        if (this.f10579 != 0 || g.this.f10543 == -1) {
                            if (z6 && g.this.f10545 != -1) {
                                i22 = g.this.f10545;
                                if (z5) {
                                    f6 = g.this.f10551;
                                    f5 = 1.0f - f6;
                                    f8 = f5;
                                } else {
                                    f5 = g.this.f10551;
                                    f8 = f5;
                                }
                            }
                            eVar8.m11258(i22);
                            eVar8.m11257(f8);
                        } else {
                            i22 = g.this.f10543;
                            if (z5) {
                                f6 = g.this.f10549;
                                f5 = 1.0f - f6;
                                f8 = f5;
                                eVar8.m11258(i22);
                                eVar8.m11257(f8);
                            } else {
                                f5 = g.this.f10549;
                                f8 = f5;
                                eVar8.m11258(i22);
                                eVar8.m11257(f8);
                            }
                        }
                        i20++;
                        eVar4 = eVar8;
                    }
                    if (i20 == i6 - 1) {
                        eVar8.m11299(eVar8.f10493, this.f10571, this.f10575);
                    }
                    if (eVar4 != null) {
                        eVar8.f10475.m11192(eVar4.f10493, g.this.f10553);
                        if (i20 == i8) {
                            eVar8.f10475.m11212(this.f10573);
                        }
                        eVar4.f10493.m11192(eVar8.f10475, 0);
                        if (i20 == i9 + 1) {
                            eVar4.f10493.m11212(this.f10575);
                        }
                    }
                    if (eVar8 != eVar7) {
                        if (g.this.f10556 == 3 && eVar.m11223() && eVar8 != eVar && eVar8.m11223()) {
                            eVar8.f10491.m11192(eVar.f10491, 0);
                        } else {
                            int i23 = g.this.f10556;
                            if (i23 == 0) {
                                eVar8.f10479.m11192(eVar7.f10479, 0);
                            } else if (i23 == 1) {
                                eVar8.f10481.m11192(eVar7.f10481, 0);
                            } else if (z7) {
                                eVar8.f10479.m11192(this.f10570, this.f10574);
                                eVar8.f10481.m11192(this.f10572, this.f10576);
                            } else {
                                eVar8.f10479.m11192(eVar7.f10479, 0);
                                eVar8.f10481.m11192(eVar7.f10481, 0);
                            }
                        }
                    }
                    i20++;
                    eVar4 = eVar8;
                }
                i20++;
                eVar4 = eVar8;
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public int m11412() {
            return this.f10566 == 1 ? this.f10578 - g.this.f10554 : this.f10578;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public int m11413() {
            return this.f10566 == 0 ? this.f10577 - g.this.f10553 : this.f10577;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public void m11414(int i5) {
            int i6 = this.f10581;
            if (i6 == 0) {
                return;
            }
            int i7 = this.f10580;
            int i8 = i5 / i6;
            for (int i9 = 0; i9 < i7 && this.f10579 + i9 < g.this.f10565; i9++) {
                e eVar = g.this.f10564[this.f10579 + i9];
                if (this.f10566 == 0) {
                    if (eVar != null && eVar.m11311() == e.b.MATCH_CONSTRAINT && eVar.f10498 == 0) {
                        g.this.m11443(eVar, e.b.FIXED, i8, eVar.m11318(), eVar.m11323());
                    }
                } else if (eVar != null && eVar.m11318() == e.b.MATCH_CONSTRAINT && eVar.f10500 == 0) {
                    g.this.m11443(eVar, eVar.m11311(), eVar.m11309(), e.b.FIXED, i8);
                }
            }
            m11408();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public void m11415(int i5) {
            this.f10579 = i5;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public void m11416(int i5, d dVar, d dVar2, d dVar3, d dVar4, int i6, int i7, int i8, int i9, int i10) {
            this.f10566 = i5;
            this.f10569 = dVar;
            this.f10570 = dVar2;
            this.f10571 = dVar3;
            this.f10572 = dVar4;
            this.f10573 = i6;
            this.f10574 = i7;
            this.f10575 = i8;
            this.f10576 = i9;
            this.f10582 = i10;
        }
    }

    /* renamed from: ʿᵢ, reason: contains not printable characters */
    private void m11380(boolean z5) {
        e eVar;
        float f5;
        int i5;
        if (this.f10563 == null || this.f10562 == null || this.f10561 == null) {
            return;
        }
        for (int i6 = 0; i6 < this.f10565; i6++) {
            this.f10564[i6].m11241();
        }
        int[] iArr = this.f10563;
        int i7 = iArr[0];
        int i8 = iArr[1];
        float f6 = this.f10547;
        e eVar2 = null;
        int i9 = 0;
        while (i9 < i7) {
            if (z5) {
                i5 = (i7 - i9) - 1;
                f5 = 1.0f - this.f10547;
            } else {
                f5 = f6;
                i5 = i9;
            }
            e eVar3 = this.f10562[i5];
            if (eVar3 != null && eVar3.m11322() != 8) {
                if (i9 == 0) {
                    eVar3.m11299(eVar3.f10475, this.f10475, m11440());
                    eVar3.m11258(this.f10541);
                    eVar3.m11257(f5);
                }
                if (i9 == i7 - 1) {
                    eVar3.m11299(eVar3.f10493, this.f10493, m11441());
                }
                if (i9 > 0 && eVar2 != null) {
                    eVar3.m11299(eVar3.f10475, eVar2.f10493, this.f10553);
                    eVar2.m11299(eVar2.f10493, eVar3.f10475, 0);
                }
                eVar2 = eVar3;
            }
            i9++;
            f6 = f5;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            e eVar4 = this.f10561[i10];
            if (eVar4 != null && eVar4.m11322() != 8) {
                if (i10 == 0) {
                    eVar4.m11299(eVar4.f10479, this.f10479, m11442());
                    eVar4.m11276(this.f10542);
                    eVar4.m11275(this.f10548);
                }
                if (i10 == i8 - 1) {
                    eVar4.m11299(eVar4.f10481, this.f10481, m11439());
                }
                if (i10 > 0 && eVar2 != null) {
                    eVar4.m11299(eVar4.f10479, eVar2.f10481, this.f10554);
                    eVar2.m11299(eVar2.f10481, eVar4.f10479, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i11 = 0; i11 < i7; i11++) {
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = (i12 * i7) + i11;
                if (this.f10559 == 1) {
                    i13 = (i11 * i8) + i12;
                }
                e[] eVarArr = this.f10564;
                if (i13 < eVarArr.length && (eVar = eVarArr[i13]) != null && eVar.m11322() != 8) {
                    e eVar5 = this.f10562[i11];
                    e eVar6 = this.f10561[i12];
                    if (eVar != eVar5) {
                        eVar.m11299(eVar.f10475, eVar5.f10475, 0);
                        eVar.m11299(eVar.f10493, eVar5.f10493, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.m11299(eVar.f10479, eVar6.f10479, 0);
                        eVar.m11299(eVar.f10481, eVar6.f10481, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿⁱ, reason: contains not printable characters */
    public final int m11381(e eVar, int i5) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.m11318() == e.b.MATCH_CONSTRAINT) {
            int i6 = eVar.f10500;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (eVar.f10444 * i5);
                if (i7 != eVar.m11323()) {
                    eVar.m11270(true);
                    m11443(eVar, eVar.m11311(), eVar.m11309(), e.b.FIXED, i7);
                }
                return i7;
            }
            if (i6 == 1) {
                return eVar.m11323();
            }
            if (i6 == 3) {
                return (int) ((eVar.m11309() * eVar.f10423) + 0.5f);
            }
        }
        return eVar.m11323();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿﹳ, reason: contains not printable characters */
    public final int m11382(e eVar, int i5) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.m11311() == e.b.MATCH_CONSTRAINT) {
            int i6 = eVar.f10498;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (eVar.f10489 * i5);
                if (i7 != eVar.m11309()) {
                    eVar.m11270(true);
                    m11443(eVar, e.b.FIXED, i7, eVar.m11318(), eVar.m11323());
                }
                return i7;
            }
            if (i6 == 1) {
                return eVar.m11309();
            }
            if (i6 == 3) {
                return (int) ((eVar.m11323() * eVar.f10423) + 0.5f);
            }
        }
        return eVar.m11309();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* renamed from: ʿﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11383(q.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.g.m11383(q.e[], int, int, int, int[]):void");
    }

    /* renamed from: ʿﾞ, reason: contains not printable characters */
    private void m11384(e[] eVarArr, int i5, int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        int i10;
        d dVar;
        int m11441;
        d dVar2;
        int m11439;
        int i11;
        if (i5 == 0) {
            return;
        }
        this.f10560.clear();
        a aVar = new a(i6, this.f10475, this.f10479, this.f10493, this.f10481, i7);
        this.f10560.add(aVar);
        if (i6 == 0) {
            i8 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < i5) {
                e eVar = eVarArr[i13];
                int m11382 = m11382(eVar, i7);
                if (eVar.m11311() == e.b.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i14 = i8;
                boolean z5 = (i12 == i7 || (this.f10553 + i12) + m11382 > i7) && aVar.f10567 != null;
                if (!z5 && i13 > 0 && (i11 = this.f10558) > 0 && i13 % i11 == 0) {
                    z5 = true;
                }
                if (z5) {
                    aVar = new a(i6, this.f10475, this.f10479, this.f10493, this.f10481, i7);
                    aVar.m11415(i13);
                    this.f10560.add(aVar);
                } else {
                    if (i13 > 0) {
                        i12 += this.f10553 + m11382;
                    }
                    aVar.m11409(eVar);
                    i13++;
                    i8 = i14;
                }
                i12 = m11382;
                aVar.m11409(eVar);
                i13++;
                i8 = i14;
            }
        } else {
            i8 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i5) {
                e eVar2 = eVarArr[i16];
                int m11381 = m11381(eVar2, i7);
                if (eVar2.m11318() == e.b.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i17 = i8;
                boolean z6 = (i15 == i7 || (this.f10554 + i15) + m11381 > i7) && aVar.f10567 != null;
                if (!z6 && i16 > 0 && (i9 = this.f10558) > 0 && i16 % i9 == 0) {
                    z6 = true;
                }
                if (z6) {
                    aVar = new a(i6, this.f10475, this.f10479, this.f10493, this.f10481, i7);
                    aVar.m11415(i16);
                    this.f10560.add(aVar);
                } else {
                    if (i16 > 0) {
                        i15 += this.f10554 + m11381;
                    }
                    aVar.m11409(eVar2);
                    i16++;
                    i8 = i17;
                }
                i15 = m11381;
                aVar.m11409(eVar2);
                i16++;
                i8 = i17;
            }
        }
        int size = this.f10560.size();
        d dVar3 = this.f10475;
        d dVar4 = this.f10479;
        d dVar5 = this.f10493;
        d dVar6 = this.f10481;
        int m11440 = m11440();
        int m11442 = m11442();
        int m114412 = m11441();
        int m114392 = m11439();
        e.b m11311 = m11311();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z7 = m11311 == bVar || m11318() == bVar;
        if (i8 > 0 && z7) {
            for (int i18 = 0; i18 < size; i18++) {
                a aVar2 = this.f10560.get(i18);
                if (i6 == 0) {
                    aVar2.m11414(i7 - aVar2.m11413());
                } else {
                    aVar2.m11414(i7 - aVar2.m11412());
                }
            }
        }
        int i19 = m11442;
        int i20 = m114412;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = m11440;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i25 = m114392;
        while (i23 < size) {
            a aVar3 = this.f10560.get(i23);
            if (i6 == 0) {
                if (i23 < size - 1) {
                    dVar2 = this.f10560.get(i23 + 1).f10567.f10479;
                    m11439 = 0;
                } else {
                    dVar2 = this.f10481;
                    m11439 = m11439();
                }
                d dVar9 = aVar3.f10567.f10481;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i26 = i21;
                d dVar12 = dVar7;
                int i27 = i22;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i10 = i23;
                aVar3.m11416(i6, dVar10, dVar12, dVar13, dVar2, i24, i19, i20, m11439, i7);
                int max = Math.max(i27, aVar3.m11413());
                i21 = i26 + aVar3.m11412();
                if (i10 > 0) {
                    i21 += this.f10554;
                }
                dVar8 = dVar11;
                i22 = max;
                dVar7 = dVar9;
                i19 = 0;
                dVar = dVar14;
                int i28 = m11439;
                dVar6 = dVar2;
                i25 = i28;
            } else {
                d dVar15 = dVar8;
                int i29 = i21;
                int i30 = i22;
                i10 = i23;
                if (i10 < size - 1) {
                    dVar = this.f10560.get(i10 + 1).f10567.f10475;
                    m11441 = 0;
                } else {
                    dVar = this.f10493;
                    m11441 = m11441();
                }
                d dVar16 = aVar3.f10567.f10493;
                aVar3.m11416(i6, dVar15, dVar7, dVar, dVar6, i24, i19, m11441, i25, i7);
                i22 = i30 + aVar3.m11413();
                int max2 = Math.max(i29, aVar3.m11412());
                if (i10 > 0) {
                    i22 += this.f10553;
                }
                i21 = max2;
                i20 = m11441;
                dVar8 = dVar16;
                i24 = 0;
            }
            i23 = i10 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i22;
        iArr[1] = i21;
    }

    /* renamed from: ˆʻ, reason: contains not printable characters */
    private void m11385(e[] eVarArr, int i5, int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        int i10;
        d dVar;
        int m11441;
        d dVar2;
        int m11439;
        int i11;
        if (i5 == 0) {
            return;
        }
        this.f10560.clear();
        a aVar = new a(i6, this.f10475, this.f10479, this.f10493, this.f10481, i7);
        this.f10560.add(aVar);
        if (i6 == 0) {
            int i12 = 0;
            i8 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i5) {
                int i15 = i12 + 1;
                e eVar = eVarArr[i14];
                int m11382 = m11382(eVar, i7);
                if (eVar.m11311() == e.b.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i16 = i8;
                boolean z5 = (i13 == i7 || (this.f10553 + i13) + m11382 > i7) && aVar.f10567 != null;
                if (!z5 && i14 > 0 && (i11 = this.f10558) > 0 && i15 > i11) {
                    z5 = true;
                }
                if (z5) {
                    aVar = new a(i6, this.f10475, this.f10479, this.f10493, this.f10481, i7);
                    aVar.m11415(i14);
                    this.f10560.add(aVar);
                    i12 = i15;
                    i13 = m11382;
                } else {
                    i13 = i14 > 0 ? i13 + this.f10553 + m11382 : m11382;
                    i12 = 0;
                }
                aVar.m11409(eVar);
                i14++;
                i8 = i16;
            }
        } else {
            int i17 = 0;
            i8 = 0;
            int i18 = 0;
            while (i18 < i5) {
                e eVar2 = eVarArr[i18];
                int m11381 = m11381(eVar2, i7);
                if (eVar2.m11318() == e.b.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i19 = i8;
                boolean z6 = (i17 == i7 || (this.f10554 + i17) + m11381 > i7) && aVar.f10567 != null;
                if (!z6 && i18 > 0 && (i9 = this.f10558) > 0 && i9 < 0) {
                    z6 = true;
                }
                if (z6) {
                    aVar = new a(i6, this.f10475, this.f10479, this.f10493, this.f10481, i7);
                    aVar.m11415(i18);
                    this.f10560.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f10554 + m11381;
                    }
                    aVar.m11409(eVar2);
                    i18++;
                    i8 = i19;
                }
                i17 = m11381;
                aVar.m11409(eVar2);
                i18++;
                i8 = i19;
            }
        }
        int size = this.f10560.size();
        d dVar3 = this.f10475;
        d dVar4 = this.f10479;
        d dVar5 = this.f10493;
        d dVar6 = this.f10481;
        int m11440 = m11440();
        int m11442 = m11442();
        int m114412 = m11441();
        int m114392 = m11439();
        e.b m11311 = m11311();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z7 = m11311 == bVar || m11318() == bVar;
        if (i8 > 0 && z7) {
            for (int i20 = 0; i20 < size; i20++) {
                a aVar2 = this.f10560.get(i20);
                if (i6 == 0) {
                    aVar2.m11414(i7 - aVar2.m11413());
                } else {
                    aVar2.m11414(i7 - aVar2.m11412());
                }
            }
        }
        int i21 = m11442;
        int i22 = m114412;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = m11440;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i27 = m114392;
        while (i25 < size) {
            a aVar3 = this.f10560.get(i25);
            if (i6 == 0) {
                if (i25 < size - 1) {
                    dVar2 = this.f10560.get(i25 + 1).f10567.f10479;
                    m11439 = 0;
                } else {
                    dVar2 = this.f10481;
                    m11439 = m11439();
                }
                d dVar9 = aVar3.f10567.f10481;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i28 = i23;
                d dVar12 = dVar7;
                int i29 = i24;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i10 = i25;
                aVar3.m11416(i6, dVar10, dVar12, dVar13, dVar2, i26, i21, i22, m11439, i7);
                int max = Math.max(i29, aVar3.m11413());
                i23 = i28 + aVar3.m11412();
                if (i10 > 0) {
                    i23 += this.f10554;
                }
                dVar8 = dVar11;
                i24 = max;
                dVar7 = dVar9;
                i21 = 0;
                dVar = dVar14;
                int i30 = m11439;
                dVar6 = dVar2;
                i27 = i30;
            } else {
                d dVar15 = dVar8;
                int i31 = i23;
                int i32 = i24;
                i10 = i25;
                if (i10 < size - 1) {
                    dVar = this.f10560.get(i10 + 1).f10567.f10475;
                    m11441 = 0;
                } else {
                    dVar = this.f10493;
                    m11441 = m11441();
                }
                d dVar16 = aVar3.f10567.f10493;
                aVar3.m11416(i6, dVar15, dVar7, dVar, dVar6, i26, i21, m11441, i27, i7);
                i24 = i32 + aVar3.m11413();
                int max2 = Math.max(i31, aVar3.m11412());
                if (i10 > 0) {
                    i24 += this.f10553;
                }
                i23 = max2;
                i22 = m11441;
                dVar8 = dVar16;
                i26 = 0;
            }
            i25 = i10 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i24;
        iArr[1] = i23;
    }

    /* renamed from: ˆʼ, reason: contains not printable characters */
    private void m11386(e[] eVarArr, int i5, int i6, int i7, int[] iArr) {
        a aVar;
        if (i5 == 0) {
            return;
        }
        if (this.f10560.size() == 0) {
            aVar = new a(i6, this.f10475, this.f10479, this.f10493, this.f10481, i7);
            this.f10560.add(aVar);
        } else {
            a aVar2 = this.f10560.get(0);
            aVar2.m11410();
            aVar = aVar2;
            aVar.m11416(i6, this.f10475, this.f10479, this.f10493, this.f10481, m11440(), m11442(), m11441(), m11439(), i7);
        }
        for (int i8 = 0; i8 < i5; i8++) {
            aVar.m11409(eVarArr[i8]);
        }
        iArr[0] = aVar.m11413();
        iArr[1] = aVar.m11412();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    @Override // q.l
    /* renamed from: ʾˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11387(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.g.mo11387(int, int, int, int):void");
    }

    /* renamed from: ˆʽ, reason: contains not printable characters */
    public void m11388(float f5) {
        this.f10549 = f5;
    }

    /* renamed from: ˆʾ, reason: contains not printable characters */
    public void m11389(int i5) {
        this.f10543 = i5;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public void m11390(float f5) {
        this.f10550 = f5;
    }

    /* renamed from: ˆˈ, reason: contains not printable characters */
    public void m11391(int i5) {
        this.f10544 = i5;
    }

    /* renamed from: ˆˉ, reason: contains not printable characters */
    public void m11392(int i5) {
        this.f10555 = i5;
    }

    /* renamed from: ˆˊ, reason: contains not printable characters */
    public void m11393(float f5) {
        this.f10547 = f5;
    }

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public void m11394(int i5) {
        this.f10553 = i5;
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public void m11395(int i5) {
        this.f10541 = i5;
    }

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public void m11396(float f5) {
        this.f10551 = f5;
    }

    /* renamed from: ˆˑ, reason: contains not printable characters */
    public void m11397(int i5) {
        this.f10545 = i5;
    }

    /* renamed from: ˆי, reason: contains not printable characters */
    public void m11398(float f5) {
        this.f10552 = f5;
    }

    /* renamed from: ˆـ, reason: contains not printable characters */
    public void m11399(int i5) {
        this.f10546 = i5;
    }

    /* renamed from: ˆٴ, reason: contains not printable characters */
    public void m11400(int i5) {
        this.f10558 = i5;
    }

    /* renamed from: ˆᐧ, reason: contains not printable characters */
    public void m11401(int i5) {
        this.f10559 = i5;
    }

    /* renamed from: ˆᴵ, reason: contains not printable characters */
    public void m11402(int i5) {
        this.f10556 = i5;
    }

    /* renamed from: ˆᵎ, reason: contains not printable characters */
    public void m11403(float f5) {
        this.f10548 = f5;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public void m11404(int i5) {
        this.f10554 = i5;
    }

    /* renamed from: ˆᵢ, reason: contains not printable characters */
    public void m11405(int i5) {
        this.f10542 = i5;
    }

    /* renamed from: ˆⁱ, reason: contains not printable characters */
    public void m11406(int i5) {
        this.f10557 = i5;
    }

    @Override // q.e
    /* renamed from: ˈ */
    public void mo11185(n.d dVar, boolean z5) {
        super.mo11185(dVar, z5);
        boolean z6 = m11294() != null && ((f) m11294()).m11350();
        int i5 = this.f10557;
        if (i5 != 0) {
            if (i5 == 1) {
                int size = this.f10560.size();
                int i6 = 0;
                while (i6 < size) {
                    this.f10560.get(i6).m11411(z6, i6, i6 == size + (-1));
                    i6++;
                }
            } else if (i5 == 2) {
                m11380(z6);
            } else if (i5 == 3) {
                int size2 = this.f10560.size();
                int i7 = 0;
                while (i7 < size2) {
                    this.f10560.get(i7).m11411(z6, i7, i7 == size2 + (-1));
                    i7++;
                }
            }
        } else if (this.f10560.size() > 0) {
            this.f10560.get(0).m11411(z6, 0, true);
        }
        m11446(false);
    }
}
