package k2;

/* compiled from: BufferedDataSink.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p implements u {

    /* renamed from: ʻ, reason: contains not printable characters */
    u f8829;

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean f8830;

    /* renamed from: ʾ, reason: contains not printable characters */
    l2.g f8832;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f8834;

    /* renamed from: ʽ, reason: contains not printable characters */
    final q f8831 = new q();

    /* renamed from: ʿ, reason: contains not printable characters */
    int f8833 = Integer.MAX_VALUE;

    public p(u uVar) {
        m9475(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m9470() {
        boolean m9501;
        l2.g gVar;
        if (this.f8830) {
            return;
        }
        synchronized (this.f8831) {
            this.f8829.mo9361(this.f8831);
            m9501 = this.f8831.m9501();
        }
        if (m9501 && this.f8834) {
            this.f8829.end();
        }
        if (!m9501 || (gVar = this.f8832) == null) {
            return;
        }
        gVar.mo9413();
    }

    @Override // k2.u
    public void end() {
        if (mo9358().m9455() != Thread.currentThread()) {
            mo9358().m9462(new Runnable() { // from class: k2.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8826.end();
                }
            });
            return;
        }
        synchronized (this.f8831) {
            if (this.f8831.m9499()) {
                this.f8834 = true;
            } else {
                this.f8829.end();
            }
        }
    }

    @Override // k2.u
    /* renamed from: ʻ */
    public k mo9358() {
        return this.f8829.mo9358();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m9471(boolean z5) {
        this.f8830 = z5;
        if (z5) {
            return;
        }
        m9470();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m9472() {
        return this.f8831.m9499() || this.f8830;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m9474() {
        return this.f8831.m9500();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m9475(u uVar) {
        this.f8829 = uVar;
        uVar.mo9364(new l2.g() { // from class: k2.n
            @Override // l2.g
            /* renamed from: ʻ */
            public final void mo9413() {
                this.f8827.m9470();
            }
        });
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m9476(int i5) {
        this.f8833 = i5;
    }

    @Override // k2.u
    /* renamed from: ˋ */
    public void mo9361(q qVar) {
        if (mo9358().m9455() == Thread.currentThread()) {
            mo9473(qVar);
            if (!m9472()) {
                this.f8829.mo9361(qVar);
            }
            synchronized (this.f8831) {
                qVar.m9489(this.f8831);
            }
            return;
        }
        synchronized (this.f8831) {
            if (this.f8831.m9500() >= this.f8833) {
                return;
            }
            mo9473(qVar);
            qVar.m9489(this.f8831);
            mo9358().m9462(new Runnable() { // from class: k2.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8828.m9470();
                }
            });
        }
    }

    @Override // k2.u
    /* renamed from: י */
    public void mo9364(l2.g gVar) {
        this.f8832 = gVar;
    }

    @Override // k2.u
    /* renamed from: ᴵᴵ */
    public void mo9368(l2.a aVar) {
        this.f8829.mo9368(aVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected void mo9473(q qVar) {
    }
}
