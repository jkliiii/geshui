package u1;

import u1.e;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b implements e, d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Object f11463;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final e f11464;

    /* renamed from: ʽ, reason: contains not printable characters */
    private volatile d f11465;

    /* renamed from: ʾ, reason: contains not printable characters */
    private volatile d f11466;

    /* renamed from: ʿ, reason: contains not printable characters */
    private e.a f11467;

    /* renamed from: ˆ, reason: contains not printable characters */
    private e.a f11468;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f11467 = aVar;
        this.f11468 = aVar;
        this.f11463 = obj;
        this.f11464 = eVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m12152(d dVar) {
        e.a aVar;
        e.a aVar2 = this.f11467;
        e.a aVar3 = e.a.FAILED;
        return aVar2 != aVar3 ? dVar.equals(this.f11465) : dVar.equals(this.f11466) && ((aVar = this.f11468) == e.a.SUCCESS || aVar == aVar3);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean m12153() {
        e eVar = this.f11464;
        return eVar == null || eVar.mo12162(this);
    }

    /* renamed from: י, reason: contains not printable characters */
    private boolean m12154() {
        e eVar = this.f11464;
        return eVar == null || eVar.mo12166(this);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean m12155() {
        e eVar = this.f11464;
        return eVar == null || eVar.mo12157(this);
    }

    @Override // u1.d
    public void clear() {
        synchronized (this.f11463) {
            e.a aVar = e.a.CLEARED;
            this.f11467 = aVar;
            this.f11465.clear();
            if (this.f11468 != aVar) {
                this.f11468 = aVar;
                this.f11466.clear();
            }
        }
    }

    @Override // u1.e
    public e getRoot() {
        e root;
        synchronized (this.f11463) {
            e eVar = this.f11464;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // u1.d
    public boolean isRunning() {
        boolean z5;
        synchronized (this.f11463) {
            e.a aVar = this.f11467;
            e.a aVar2 = e.a.RUNNING;
            z5 = aVar == aVar2 || this.f11468 == aVar2;
        }
        return z5;
    }

    @Override // u1.e, u1.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo12156() {
        boolean z5;
        synchronized (this.f11463) {
            z5 = this.f11465.mo12156() || this.f11466.mo12156();
        }
        return z5;
    }

    @Override // u1.e
    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean mo12157(d dVar) {
        boolean m12155;
        synchronized (this.f11463) {
            m12155 = m12155();
        }
        return m12155;
    }

    @Override // u1.d
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo12158() {
        synchronized (this.f11463) {
            e.a aVar = this.f11467;
            e.a aVar2 = e.a.RUNNING;
            if (aVar == aVar2) {
                this.f11467 = e.a.PAUSED;
                this.f11465.mo12158();
            }
            if (this.f11468 == aVar2) {
                this.f11468 = e.a.PAUSED;
                this.f11466.mo12158();
            }
        }
    }

    @Override // u1.e
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo12159(d dVar) {
        synchronized (this.f11463) {
            if (dVar.equals(this.f11465)) {
                this.f11467 = e.a.SUCCESS;
            } else if (dVar.equals(this.f11466)) {
                this.f11468 = e.a.SUCCESS;
            }
            e eVar = this.f11464;
            if (eVar != null) {
                eVar.mo12159(this);
            }
        }
    }

    @Override // u1.d
    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean mo12160() {
        boolean z5;
        synchronized (this.f11463) {
            e.a aVar = this.f11467;
            e.a aVar2 = e.a.CLEARED;
            z5 = aVar == aVar2 && this.f11468 == aVar2;
        }
        return z5;
    }

    @Override // u1.d
    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean mo12161(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f11465.mo12161(bVar.f11465) && this.f11466.mo12161(bVar.f11466);
    }

    @Override // u1.e
    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean mo12162(d dVar) {
        boolean z5;
        synchronized (this.f11463) {
            z5 = m12153() && dVar.equals(this.f11465);
        }
        return z5;
    }

    @Override // u1.e
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo12163(d dVar) {
        synchronized (this.f11463) {
            if (dVar.equals(this.f11466)) {
                this.f11468 = e.a.FAILED;
                e eVar = this.f11464;
                if (eVar != null) {
                    eVar.mo12163(this);
                }
                return;
            }
            this.f11467 = e.a.FAILED;
            e.a aVar = this.f11468;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                this.f11468 = aVar2;
                this.f11466.mo12164();
            }
        }
    }

    @Override // u1.d
    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo12164() {
        synchronized (this.f11463) {
            e.a aVar = this.f11467;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                this.f11467 = aVar2;
                this.f11465.mo12164();
            }
        }
    }

    @Override // u1.d
    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean mo12165() {
        boolean z5;
        synchronized (this.f11463) {
            e.a aVar = this.f11467;
            e.a aVar2 = e.a.SUCCESS;
            z5 = aVar == aVar2 || this.f11468 == aVar2;
        }
        return z5;
    }

    @Override // u1.e
    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean mo12166(d dVar) {
        boolean z5;
        synchronized (this.f11463) {
            z5 = m12154() && m12152(dVar);
        }
        return z5;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public void m12167(d dVar, d dVar2) {
        this.f11465 = dVar;
        this.f11466 = dVar2;
    }
}
