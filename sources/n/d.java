package n;

import java.util.Arrays;
import java.util.HashMap;
import n.i;
import q.d;

/* compiled from: LinearSystem.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static boolean f9422 = false;

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static boolean f9423 = true;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static boolean f9424 = true;

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static boolean f9425 = true;

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static boolean f9426 = false;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static int f9427 = 1000;

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static long f9428;

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static long f9429;

    /* renamed from: ʾ, reason: contains not printable characters */
    private a f9433;

    /* renamed from: ˈ, reason: contains not printable characters */
    n.b[] f9436;

    /* renamed from: י, reason: contains not printable characters */
    final c f9443;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private a f9446;

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean f9430 = false;

    /* renamed from: ʼ, reason: contains not printable characters */
    int f9431 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private HashMap<String, i> f9432 = null;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f9434 = 32;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f9435 = 32;

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean f9437 = false;

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean f9438 = false;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean[] f9439 = new boolean[32];

    /* renamed from: ˎ, reason: contains not printable characters */
    int f9440 = 1;

    /* renamed from: ˏ, reason: contains not printable characters */
    int f9441 = 0;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f9442 = 32;

    /* renamed from: ـ, reason: contains not printable characters */
    private i[] f9444 = new i[f9427];

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f9445 = 0;

    /* compiled from: LinearSystem.java */
    interface a {
        void clear();

        i getKey();

        boolean isEmpty();

        /* renamed from: ʻ */
        i mo10314(d dVar, boolean[] zArr);

        /* renamed from: ʼ */
        void mo10316(i iVar);

        /* renamed from: ʽ */
        void mo10317(a aVar);
    }

    /* compiled from: LinearSystem.java */
    class b extends n.b {
        public b(c cVar) {
            this.f9416 = new j(this, cVar);
        }
    }

    public d() {
        this.f9436 = null;
        this.f9436 = new n.b[32];
        m10343();
        c cVar = new c();
        this.f9443 = cVar;
        this.f9433 = new h(cVar);
        if (f9426) {
            this.f9446 = new b(cVar);
        } else {
            this.f9446 = new n.b(cVar);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private i m10342(i.a aVar, String str) {
        i mo10373 = this.f9443.f9420.mo10373();
        if (mo10373 == null) {
            mo10373 = new i(aVar, str);
            mo10373.m10390(aVar, str);
        } else {
            mo10373.m10388();
            mo10373.m10390(aVar, str);
        }
        int i5 = this.f9445;
        int i6 = f9427;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            f9427 = i7;
            this.f9444 = (i[]) Arrays.copyOf(this.f9444, i7);
        }
        i[] iVarArr = this.f9444;
        int i8 = this.f9445;
        this.f9445 = i8 + 1;
        iVarArr[i8] = mo10373;
        return mo10373;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m10343() {
        int i5 = 0;
        if (f9426) {
            while (i5 < this.f9441) {
                n.b bVar = this.f9436[i5];
                if (bVar != null) {
                    this.f9443.f9418.mo10372(bVar);
                }
                this.f9436[i5] = null;
                i5++;
            }
            return;
        }
        while (i5 < this.f9441) {
            n.b bVar2 = this.f9436[i5];
            if (bVar2 != null) {
                this.f9443.f9419.mo10372(bVar2);
            }
            this.f9436[i5] = null;
            i5++;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private final void m10344(n.b bVar) {
        int i5;
        if (f9424 && bVar.f9417) {
            bVar.f9412.m10389(this, bVar.f9413);
        } else {
            n.b[] bVarArr = this.f9436;
            int i6 = this.f9441;
            bVarArr[i6] = bVar;
            i iVar = bVar.f9412;
            iVar.f9464 = i6;
            this.f9441 = i6 + 1;
            iVar.m10391(this, bVar);
        }
        if (f9424 && this.f9430) {
            int i7 = 0;
            while (i7 < this.f9441) {
                if (this.f9436[i7] == null) {
                    System.out.println("WTF");
                }
                n.b bVar2 = this.f9436[i7];
                if (bVar2 != null && bVar2.f9417) {
                    bVar2.f9412.m10389(this, bVar2.f9413);
                    if (f9426) {
                        this.f9443.f9418.mo10372(bVar2);
                    } else {
                        this.f9443.f9419.mo10372(bVar2);
                    }
                    this.f9436[i7] = null;
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (true) {
                        i5 = this.f9441;
                        if (i8 >= i5) {
                            break;
                        }
                        n.b[] bVarArr2 = this.f9436;
                        int i10 = i8 - 1;
                        n.b bVar3 = bVarArr2[i8];
                        bVarArr2[i10] = bVar3;
                        i iVar2 = bVar3.f9412;
                        if (iVar2.f9464 == i8) {
                            iVar2.f9464 = i10;
                        }
                        i9 = i8;
                        i8++;
                    }
                    if (i9 < i5) {
                        this.f9436[i9] = null;
                    }
                    this.f9441 = i5 - 1;
                    i7--;
                }
                i7++;
            }
            this.f9430 = false;
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m10345() {
        for (int i5 = 0; i5 < this.f9441; i5++) {
            n.b bVar = this.f9436[i5];
            bVar.f9412.f9466 = bVar.f9413;
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final int m10346(a aVar, boolean z5) {
        for (int i5 = 0; i5 < this.f9440; i5++) {
            this.f9439[i5] = false;
        }
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            i6++;
            if (i6 >= this.f9440 * 2) {
                return i6;
            }
            if (aVar.getKey() != null) {
                this.f9439[aVar.getKey().f9463] = true;
            }
            i mo10314 = aVar.mo10314(this, this.f9439);
            if (mo10314 != null) {
                boolean[] zArr = this.f9439;
                int i7 = mo10314.f9463;
                if (zArr[i7]) {
                    return i6;
                }
                zArr[i7] = true;
            }
            if (mo10314 != null) {
                float f5 = Float.MAX_VALUE;
                int i8 = -1;
                for (int i9 = 0; i9 < this.f9441; i9++) {
                    n.b bVar = this.f9436[i9];
                    if (bVar.f9412.f9470 != i.a.UNRESTRICTED && !bVar.f9417 && bVar.m10337(mo10314)) {
                        float mo10306 = bVar.f9416.mo10306(mo10314);
                        if (mo10306 < 0.0f) {
                            float f6 = (-bVar.f9413) / mo10306;
                            if (f6 < f5) {
                                i8 = i9;
                                f5 = f6;
                            }
                        }
                    }
                }
                if (i8 > -1) {
                    n.b bVar2 = this.f9436[i8];
                    bVar2.f9412.f9464 = -1;
                    bVar2.m10339(mo10314);
                    i iVar = bVar2.f9412;
                    iVar.f9464 = i8;
                    iVar.m10391(this, bVar2);
                }
            } else {
                z6 = true;
            }
        }
        return i6;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static n.b m10347(d dVar, i iVar, i iVar2, float f5) {
        return dVar.m10367().m10325(iVar, iVar2, f5);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int m10348(a aVar) throws Exception {
        boolean z5;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f9441) {
                z5 = false;
                break;
            }
            n.b bVar = this.f9436[i5];
            if (bVar.f9412.f9470 != i.a.UNRESTRICTED && bVar.f9413 < 0.0f) {
                z5 = true;
                break;
            }
            i5++;
        }
        if (!z5) {
            return 0;
        }
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            i6++;
            float f5 = Float.MAX_VALUE;
            int i7 = -1;
            int i8 = -1;
            int i9 = 0;
            for (int i10 = 0; i10 < this.f9441; i10++) {
                n.b bVar2 = this.f9436[i10];
                if (bVar2.f9412.f9470 != i.a.UNRESTRICTED && !bVar2.f9417 && bVar2.f9413 < 0.0f) {
                    int i11 = 9;
                    if (f9425) {
                        int mo10305 = bVar2.f9416.mo10305();
                        int i12 = 0;
                        while (i12 < mo10305) {
                            i mo10308 = bVar2.f9416.mo10308(i12);
                            float mo10306 = bVar2.f9416.mo10306(mo10308);
                            if (mo10306 > 0.0f) {
                                int i13 = 0;
                                while (i13 < i11) {
                                    float f6 = mo10308.f9468[i13] / mo10306;
                                    if ((f6 < f5 && i13 == i9) || i13 > i9) {
                                        i8 = mo10308.f9463;
                                        i9 = i13;
                                        i7 = i10;
                                        f5 = f6;
                                    }
                                    i13++;
                                    i11 = 9;
                                }
                            }
                            i12++;
                            i11 = 9;
                        }
                    } else {
                        for (int i14 = 1; i14 < this.f9440; i14++) {
                            i iVar = this.f9443.f9421[i14];
                            float mo103062 = bVar2.f9416.mo10306(iVar);
                            if (mo103062 > 0.0f) {
                                for (int i15 = 0; i15 < 9; i15++) {
                                    float f7 = iVar.f9468[i15] / mo103062;
                                    if ((f7 < f5 && i15 == i9) || i15 > i9) {
                                        i8 = i14;
                                        i7 = i10;
                                        i9 = i15;
                                        f5 = f7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i7 != -1) {
                n.b bVar3 = this.f9436[i7];
                bVar3.f9412.f9464 = -1;
                bVar3.m10339(this.f9443.f9421[i8]);
                i iVar2 = bVar3.f9412;
                iVar2.f9464 = i7;
                iVar2.m10391(this, bVar3);
            } else {
                z6 = true;
            }
            if (i6 > this.f9440 / 2) {
                z6 = true;
            }
        }
        return i6;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static e m10349() {
        return null;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m10350() {
        int i5 = this.f9434 * 2;
        this.f9434 = i5;
        this.f9436 = (n.b[]) Arrays.copyOf(this.f9436, i5);
        c cVar = this.f9443;
        cVar.f9421 = (i[]) Arrays.copyOf(cVar.f9421, this.f9434);
        int i6 = this.f9434;
        this.f9439 = new boolean[i6];
        this.f9435 = i6;
        this.f9442 = i6;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m10351(q.e eVar, q.e eVar2, float f5, int i5) {
        d.b bVar = d.b.LEFT;
        i m10365 = m10365(eVar.mo11306(bVar));
        d.b bVar2 = d.b.TOP;
        i m103652 = m10365(eVar.mo11306(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i m103653 = m10365(eVar.mo11306(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i m103654 = m10365(eVar.mo11306(bVar4));
        i m103655 = m10365(eVar2.mo11306(bVar));
        i m103656 = m10365(eVar2.mo11306(bVar2));
        i m103657 = m10365(eVar2.mo11306(bVar3));
        i m103658 = m10365(eVar2.mo11306(bVar4));
        n.b m10367 = m10367();
        double d6 = f5;
        double sin = Math.sin(d6);
        double d7 = i5;
        Double.isNaN(d7);
        m10367.m10332(m103652, m103654, m103656, m103658, (float) (sin * d7));
        m10354(m10367);
        n.b m103672 = m10367();
        double cos = Math.cos(d6);
        Double.isNaN(d7);
        m103672.m10332(m10365, m103653, m103655, m103657, (float) (cos * d7));
        m10354(m103672);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m10352(i iVar, i iVar2, int i5, float f5, i iVar3, i iVar4, int i6, int i7) {
        n.b m10367 = m10367();
        m10367.m10323(iVar, iVar2, i5, f5, iVar3, iVar4, i6);
        if (i7 != 8) {
            m10367.m10319(this, i7);
        }
        m10354(m10367);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m10353() {
        c cVar;
        int i5 = 0;
        while (true) {
            cVar = this.f9443;
            i[] iVarArr = cVar.f9421;
            if (i5 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i5];
            if (iVar != null) {
                iVar.m10388();
            }
            i5++;
        }
        cVar.f9420.mo10374(this.f9444, this.f9445);
        this.f9445 = 0;
        Arrays.fill(this.f9443.f9421, (Object) null);
        HashMap<String, i> hashMap = this.f9432;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f9431 = 0;
        this.f9433.clear();
        this.f9440 = 1;
        for (int i6 = 0; i6 < this.f9441; i6++) {
            n.b bVar = this.f9436[i6];
            if (bVar != null) {
                bVar.f9414 = false;
            }
        }
        m10343();
        this.f9441 = 0;
        if (f9426) {
            this.f9446 = new b(this.f9443);
        } else {
            this.f9446 = new n.b(this.f9443);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* renamed from: ʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10354(n.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f9441
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f9442
            if (r0 >= r2) goto L12
            int r0 = r5.f9440
            int r0 = r0 + r1
            int r2 = r5.f9435
            if (r0 < r2) goto L15
        L12:
            r5.m10350()
        L15:
            boolean r0 = r6.f9417
            r2 = 0
            if (r0 != 0) goto L84
            r6.m10318(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L24
            return
        L24:
            r6.m10334()
            boolean r0 = r6.m10321(r5)
            if (r0 == 0) goto L7b
            n.i r0 = r5.m10364()
            r6.f9412 = r0
            int r3 = r5.f9441
            r5.m10344(r6)
            int r4 = r5.f9441
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            n.d$a r2 = r5.f9446
            r2.mo10317(r6)
            n.d$a r2 = r5.f9446
            r5.m10346(r2, r1)
            int r2 = r0.f9464
            r3 = -1
            if (r2 != r3) goto L7c
            n.i r2 = r6.f9412
            if (r2 != r0) goto L59
            n.i r0 = r6.m10338(r0)
            if (r0 == 0) goto L59
            r6.m10339(r0)
        L59:
            boolean r0 = r6.f9417
            if (r0 != 0) goto L62
            n.i r0 = r6.f9412
            r0.m10391(r5, r6)
        L62:
            boolean r0 = n.d.f9426
            if (r0 == 0) goto L6e
            n.c r0 = r5.f9443
            n.f<n.b> r0 = r0.f9418
            r0.mo10372(r6)
            goto L75
        L6e:
            n.c r0 = r5.f9443
            n.f<n.b> r0 = r0.f9419
            r0.mo10372(r6)
        L75:
            int r0 = r5.f9441
            int r0 = r0 - r1
            r5.f9441 = r0
            goto L7c
        L7b:
            r1 = 0
        L7c:
            boolean r0 = r6.m10336()
            if (r0 != 0) goto L83
            return
        L83:
            r2 = r1
        L84:
            if (r2 != 0) goto L89
            r5.m10344(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.d.m10354(n.b):void");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public n.b m10355(i iVar, i iVar2, int i5, int i6) {
        if (f9423 && i6 == 8 && iVar2.f9467 && iVar.f9464 == -1) {
            iVar.m10389(this, iVar2.f9466 + i5);
            return null;
        }
        n.b m10367 = m10367();
        m10367.m10329(iVar, iVar2, i5);
        if (i6 != 8) {
            m10367.m10319(this, i6);
        }
        m10354(m10367);
        return m10367;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m10356(i iVar, int i5) {
        if (f9423 && iVar.f9464 == -1) {
            float f5 = i5;
            iVar.m10389(this, f5);
            for (int i6 = 0; i6 < this.f9431 + 1; i6++) {
                i iVar2 = this.f9443.f9421[i6];
                if (iVar2 != null && iVar2.f9474 && iVar2.f9475 == iVar.f9463) {
                    iVar2.m10389(this, iVar2.f9476 + f5);
                }
            }
            return;
        }
        int i7 = iVar.f9464;
        if (i7 == -1) {
            n.b m10367 = m10367();
            m10367.m10324(iVar, i5);
            m10354(m10367);
            return;
        }
        n.b bVar = this.f9436[i7];
        if (bVar.f9417) {
            bVar.f9413 = i5;
            return;
        }
        if (bVar.f9416.mo10305() == 0) {
            bVar.f9417 = true;
            bVar.f9413 = i5;
        } else {
            n.b m103672 = m10367();
            m103672.m10328(iVar, i5);
            m10354(m103672);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m10357(i iVar, i iVar2, int i5, boolean z5) {
        n.b m10367 = m10367();
        i m10368 = m10368();
        m10368.f9465 = 0;
        m10367.m10330(iVar, iVar2, m10368, i5);
        m10354(m10367);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m10358(i iVar, i iVar2, int i5, int i6) {
        n.b m10367 = m10367();
        i m10368 = m10368();
        m10368.f9465 = 0;
        m10367.m10330(iVar, iVar2, m10368, i5);
        if (i6 != 8) {
            m10362(m10367, (int) (m10367.f9416.mo10306(m10368) * (-1.0f)), i6);
        }
        m10354(m10367);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m10359(i iVar, i iVar2, int i5, boolean z5) {
        n.b m10367 = m10367();
        i m10368 = m10368();
        m10368.f9465 = 0;
        m10367.m10331(iVar, iVar2, m10368, i5);
        m10354(m10367);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m10360(i iVar, i iVar2, int i5, int i6) {
        n.b m10367 = m10367();
        i m10368 = m10368();
        m10368.f9465 = 0;
        m10367.m10331(iVar, iVar2, m10368, i5);
        if (i6 != 8) {
            m10362(m10367, (int) (m10367.f9416.mo10306(m10368) * (-1.0f)), i6);
        }
        m10354(m10367);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m10361(i iVar, i iVar2, i iVar3, i iVar4, float f5, int i5) {
        n.b m10367 = m10367();
        m10367.m10326(iVar, iVar2, iVar3, iVar4, f5);
        if (i5 != 8) {
            m10367.m10319(this, i5);
        }
        m10354(m10367);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m10362(n.b bVar, int i5, int i6) {
        bVar.m10320(m10363(i6, null), i5);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public i m10363(int i5, String str) {
        if (this.f9440 + 1 >= this.f9435) {
            m10350();
        }
        i m10342 = m10342(i.a.ERROR, str);
        int i6 = this.f9431 + 1;
        this.f9431 = i6;
        this.f9440++;
        m10342.f9463 = i6;
        m10342.f9465 = i5;
        this.f9443.f9421[i6] = m10342;
        this.f9433.mo10316(m10342);
        return m10342;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public i m10364() {
        if (this.f9440 + 1 >= this.f9435) {
            m10350();
        }
        i m10342 = m10342(i.a.SLACK, null);
        int i5 = this.f9431 + 1;
        this.f9431 = i5;
        this.f9440++;
        m10342.f9463 = i5;
        this.f9443.f9421[i5] = m10342;
        return m10342;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public i m10365(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f9440 + 1 >= this.f9435) {
            m10350();
        }
        if (obj instanceof q.d) {
            q.d dVar = (q.d) obj;
            iVar = dVar.m11200();
            if (iVar == null) {
                dVar.m11210(this.f9443);
                iVar = dVar.m11200();
            }
            int i5 = iVar.f9463;
            if (i5 == -1 || i5 > this.f9431 || this.f9443.f9421[i5] == null) {
                if (i5 != -1) {
                    iVar.m10388();
                }
                int i6 = this.f9431 + 1;
                this.f9431 = i6;
                this.f9440++;
                iVar.f9463 = i6;
                iVar.f9470 = i.a.UNRESTRICTED;
                this.f9443.f9421[i6] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    void m10366(a aVar) throws Exception {
        m10348(aVar);
        m10346(aVar, false);
        m10345();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public n.b m10367() {
        n.b mo10373;
        if (f9426) {
            mo10373 = this.f9443.f9418.mo10373();
            if (mo10373 == null) {
                mo10373 = new b(this.f9443);
                f9429++;
            } else {
                mo10373.m10340();
            }
        } else {
            mo10373 = this.f9443.f9419.mo10373();
            if (mo10373 == null) {
                mo10373 = new n.b(this.f9443);
                f9428++;
            } else {
                mo10373.m10340();
            }
        }
        i.m10384();
        return mo10373;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public i m10368() {
        if (this.f9440 + 1 >= this.f9435) {
            m10350();
        }
        i m10342 = m10342(i.a.SLACK, null);
        int i5 = this.f9431 + 1;
        this.f9431 = i5;
        this.f9440++;
        m10342.f9463 = i5;
        this.f9443.f9421[i5] = m10342;
        return m10342;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public c m10369() {
        return this.f9443;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public int m10370(Object obj) {
        i m11200 = ((q.d) obj).m11200();
        if (m11200 != null) {
            return (int) (m11200.f9466 + 0.5f);
        }
        return 0;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m10371() throws Exception {
        if (this.f9433.isEmpty()) {
            m10345();
            return;
        }
        if (!this.f9437 && !this.f9438) {
            m10366(this.f9433);
            return;
        }
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f9441) {
                z5 = true;
                break;
            } else if (!this.f9436[i5].f9417) {
                break;
            } else {
                i5++;
            }
        }
        if (z5) {
            m10345();
        } else {
            m10366(this.f9433);
        }
    }
}
