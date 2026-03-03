package q;

import q.d;
import q.e;

/* compiled from: Guideline.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends e {

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    protected float f10584 = -1.0f;

    /* renamed from: ʼᴵ, reason: contains not printable characters */
    protected int f10585 = -1;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    protected int f10586 = -1;

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    protected boolean f10587 = true;

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    private d f10588 = this.f10479;

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    private int f10589 = 0;

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    private int f10590 = 0;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    private boolean f10591;

    /* compiled from: Guideline.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10592;

        static {
            int[] iArr = new int[d.b.values().length];
            f10592 = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10592[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10592[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10592[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10592[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10592[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10592[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10592[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10592[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f10501.clear();
        this.f10501.add(this.f10588);
        int length = this.f10485.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f10485[i5] = this.f10588;
        }
    }

    @Override // q.e
    /* renamed from: ʻᐧ */
    public boolean mo11174() {
        return this.f10591;
    }

    @Override // q.e
    /* renamed from: ʻᴵ */
    public boolean mo11175() {
        return this.f10591;
    }

    @Override // q.e
    /* renamed from: ʽﹶ */
    public void mo11288(n.d dVar, boolean z5) {
        if (m11294() == null) {
            return;
        }
        int m10370 = dVar.m10370(this.f10588);
        if (this.f10589 == 1) {
            m11284(m10370);
            m11285(0);
            m11256(m11294().m11323());
            m11282(0);
            return;
        }
        m11284(0);
        m11285(m10370);
        m11282(m11294().m11309());
        m11256(0);
    }

    /* renamed from: ʽﾞ, reason: contains not printable characters */
    public d m11417() {
        return this.f10588;
    }

    /* renamed from: ʾʻ, reason: contains not printable characters */
    public int m11418() {
        return this.f10589;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int m11419() {
        return this.f10585;
    }

    /* renamed from: ʾʽ, reason: contains not printable characters */
    public int m11420() {
        return this.f10586;
    }

    /* renamed from: ʾʿ, reason: contains not printable characters */
    public float m11421() {
        return this.f10584;
    }

    /* renamed from: ʾˆ, reason: contains not printable characters */
    public void m11422(int i5) {
        this.f10588.m11211(i5);
        this.f10591 = true;
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public void m11423(int i5) {
        if (i5 > -1) {
            this.f10584 = -1.0f;
            this.f10585 = i5;
            this.f10586 = -1;
        }
    }

    /* renamed from: ʾˉ, reason: contains not printable characters */
    public void m11424(int i5) {
        if (i5 > -1) {
            this.f10584 = -1.0f;
            this.f10585 = -1;
            this.f10586 = i5;
        }
    }

    /* renamed from: ʾˊ, reason: contains not printable characters */
    public void m11425(float f5) {
        if (f5 > -1.0f) {
            this.f10584 = f5;
            this.f10585 = -1;
            this.f10586 = -1;
        }
    }

    /* renamed from: ʾˋ, reason: contains not printable characters */
    public void m11426(int i5) {
        if (this.f10589 == i5) {
            return;
        }
        this.f10589 = i5;
        this.f10501.clear();
        if (this.f10589 == 1) {
            this.f10588 = this.f10475;
        } else {
            this.f10588 = this.f10479;
        }
        this.f10501.add(this.f10588);
        int length = this.f10485.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.f10485[i6] = this.f10588;
        }
    }

    @Override // q.e
    /* renamed from: ˈ */
    public void mo11185(n.d dVar, boolean z5) {
        f fVar = (f) m11294();
        if (fVar == null) {
            return;
        }
        d mo11306 = fVar.mo11306(d.b.LEFT);
        d mo113062 = fVar.mo11306(d.b.RIGHT);
        e eVar = this.f10420;
        boolean z6 = eVar != null && eVar.f10419[0] == e.b.WRAP_CONTENT;
        if (this.f10589 == 0) {
            mo11306 = fVar.mo11306(d.b.TOP);
            mo113062 = fVar.mo11306(d.b.BOTTOM);
            e eVar2 = this.f10420;
            z6 = eVar2 != null && eVar2.f10419[1] == e.b.WRAP_CONTENT;
        }
        if (this.f10591 && this.f10588.m11205()) {
            n.i m10365 = dVar.m10365(this.f10588);
            dVar.m10356(m10365, this.f10588.m11196());
            if (this.f10585 != -1) {
                if (z6) {
                    dVar.m10358(dVar.m10365(mo113062), m10365, 0, 5);
                }
            } else if (this.f10586 != -1 && z6) {
                n.i m103652 = dVar.m10365(mo113062);
                dVar.m10358(m10365, dVar.m10365(mo11306), 0, 5);
                dVar.m10358(m103652, m10365, 0, 5);
            }
            this.f10591 = false;
            return;
        }
        if (this.f10585 != -1) {
            n.i m103653 = dVar.m10365(this.f10588);
            dVar.m10355(m103653, dVar.m10365(mo11306), this.f10585, 8);
            if (z6) {
                dVar.m10358(dVar.m10365(mo113062), m103653, 0, 5);
                return;
            }
            return;
        }
        if (this.f10586 == -1) {
            if (this.f10584 != -1.0f) {
                dVar.m10354(n.d.m10347(dVar, dVar.m10365(this.f10588), dVar.m10365(mo113062), this.f10584));
                return;
            }
            return;
        }
        n.i m103654 = dVar.m10365(this.f10588);
        n.i m103655 = dVar.m10365(mo113062);
        dVar.m10355(m103654, m103655, -this.f10586, 8);
        if (z6) {
            dVar.m10358(m103654, dVar.m10365(mo11306), 0, 5);
            dVar.m10358(m103655, m103654, 0, 5);
        }
    }

    @Override // q.e
    /* renamed from: ˉ */
    public boolean mo11186() {
        return true;
    }

    @Override // q.e
    /* renamed from: ـ */
    public d mo11306(d.b bVar) {
        int i5 = a.f10592[bVar.ordinal()];
        if (i5 == 1 || i5 == 2) {
            if (this.f10589 == 1) {
                return this.f10588;
            }
            return null;
        }
        if ((i5 == 3 || i5 == 4) && this.f10589 == 0) {
            return this.f10588;
        }
        return null;
    }
}
