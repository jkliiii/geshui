package n2;

import java.nio.charset.Charset;
import l2.d;
import n2.d;

/* compiled from: AsyncHttpResponseImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class g extends k2.x implements f, d.i {

    /* renamed from: ˊ, reason: contains not printable characters */
    private e f9600;

    /* renamed from: ˋ, reason: contains not printable characters */
    private k2.l f9601;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected s f9602;

    /* renamed from: ˑ, reason: contains not printable characters */
    int f9604;

    /* renamed from: י, reason: contains not printable characters */
    String f9605;

    /* renamed from: ـ, reason: contains not printable characters */
    String f9606;

    /* renamed from: ᐧ, reason: contains not printable characters */
    k2.u f9608;

    /* renamed from: ˉ, reason: contains not printable characters */
    private l2.a f9599 = new b();

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean f9603 = false;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f9607 = true;

    /* compiled from: AsyncHttpResponseImpl.java */
    class a implements l2.a {
        a() {
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            g.this.mo10472(exc);
        }
    }

    /* compiled from: AsyncHttpResponseImpl.java */
    class b implements l2.a {
        b() {
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (g.this.mo10484() == null) {
                g.this.mo9511(new r("connection closed before headers received.", exc));
                return;
            }
            if (exc != null) {
                g gVar = g.this;
                if (!gVar.f9603) {
                    gVar.mo9511(new r("connection closed before response completed.", exc));
                    return;
                }
            }
            g.this.mo9511(exc);
        }
    }

    /* compiled from: AsyncHttpResponseImpl.java */
    class c extends d.a {
        c() {
        }

        @Override // l2.d.a, l2.d
        /* renamed from: ᵢ */
        public void mo9377(k2.s sVar, k2.q qVar) {
            super.mo9377(sVar, qVar);
            g.this.f9601.close();
        }
    }

    public g(e eVar) {
        this.f9600 = eVar;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private void m10522() {
        this.f9601.mo9362(new c());
    }

    @Override // k2.x, k2.s
    public void close() {
        super.close();
        m10522();
    }

    public String toString() {
        s sVar = this.f9602;
        if (sVar == null) {
            return super.toString();
        }
        return sVar.m10558(this.f9605 + " " + this.f9604 + " " + this.f9606);
    }

    @Override // k2.x, k2.s, k2.u
    /* renamed from: ʻ */
    public k2.k mo9358() {
        return this.f9601.mo9358();
    }

    @Override // n2.f, n2.d.i
    /* renamed from: ʼ */
    public int mo10482() {
        return this.f9604;
    }

    @Override // n2.d.i
    /* renamed from: ʽʽ */
    public k2.l mo10483() {
        return this.f9601;
    }

    @Override // n2.f, n2.d.i
    /* renamed from: ʾ */
    public s mo10484() {
        return this.f9602;
    }

    @Override // n2.f
    /* renamed from: ʿ */
    public e mo10520() {
        return this.f9600;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k2.t
    /* renamed from: ʿʿ */
    public void mo9511(Exception exc) {
        super.mo9511(exc);
        m10522();
        this.f9601.mo9364(null);
        this.f9601.mo9368(null);
        this.f9601.mo9366(null);
        this.f9603 = true;
    }

    @Override // n2.f, n2.d.i
    /* renamed from: ˆ */
    public String mo10485() {
        return this.f9606;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    protected void m10523() {
        o2.a m10500 = this.f9600.m10500();
        if (m10500 != null) {
            m10500.mo10974(this.f9600, this.f9608, new a());
        } else {
            mo10472(null);
        }
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    void m10524(k2.l lVar) {
        this.f9601 = lVar;
        if (lVar == null) {
            return;
        }
        lVar.mo9366(this.f9599);
    }

    @Override // n2.d.i
    /* renamed from: ˉ */
    public d.i mo10486(s sVar) {
        this.f9602 = sVar;
        return this;
    }

    /* renamed from: ˉˉ */
    protected abstract void mo10472(Exception exc);

    @Override // n2.d.i
    /* renamed from: ˊ */
    public d.i mo10487(String str) {
        this.f9605 = str;
        return this;
    }

    @Override // n2.d.i
    /* renamed from: ˏ */
    public String mo10488() {
        return this.f9605;
    }

    @Override // n2.d.i
    /* renamed from: ˑ */
    public d.i mo10489(k2.s sVar) {
        mo9512(sVar);
        return this;
    }

    @Override // n2.d.i
    /* renamed from: ᴵ */
    public d.i mo10490(String str) {
        this.f9606 = str;
        return this;
    }

    @Override // n2.d.i
    /* renamed from: ᵎ */
    public d.i mo10491(int i5) {
        this.f9604 = i5;
        return this;
    }

    @Override // k2.x, k2.t, k2.s
    /* renamed from: ⁱ */
    public String mo9372() {
        String m10576;
        w m10573 = w.m10573(mo10484().m10554("Content-Type"));
        if (m10573 == null || (m10576 = m10573.m10576("charset")) == null || !Charset.isSupported(m10576)) {
            return null;
        }
        return m10576;
    }

    @Override // n2.d.i
    /* renamed from: ﹳ */
    public k2.u mo10492() {
        return this.f9608;
    }

    @Override // n2.d.i
    /* renamed from: ﾞﾞ */
    public d.i mo10493(k2.u uVar) {
        this.f9608 = uVar;
        return this;
    }

    /* renamed from: ــ */
    protected void mo10473() {
    }
}
