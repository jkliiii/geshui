package u1;

import u1.e;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j implements e, d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e f11514;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Object f11515;

    /* renamed from: ʽ, reason: contains not printable characters */
    private volatile d f11516;

    /* renamed from: ʾ, reason: contains not printable characters */
    private volatile d f11517;

    /* renamed from: ʿ, reason: contains not printable characters */
    private e.a f11518;

    /* renamed from: ˆ, reason: contains not printable characters */
    private e.a f11519;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f11520;

    public j(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f11518 = aVar;
        this.f11519 = aVar;
        this.f11515 = obj;
        this.f11514 = eVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m12201() {
        e eVar = this.f11514;
        return eVar == null || eVar.mo12162(this);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean m12202() {
        e eVar = this.f11514;
        return eVar == null || eVar.mo12166(this);
    }

    /* renamed from: י, reason: contains not printable characters */
    private boolean m12203() {
        e eVar = this.f11514;
        return eVar == null || eVar.mo12157(this);
    }

    @Override // u1.d
    public void clear() {
        synchronized (this.f11515) {
            this.f11520 = false;
            e.a aVar = e.a.CLEARED;
            this.f11518 = aVar;
            this.f11519 = aVar;
            this.f11517.clear();
            this.f11516.clear();
        }
    }

    @Override // u1.e
    public e getRoot() {
        e root;
        synchronized (this.f11515) {
            e eVar = this.f11514;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // u1.d
    public boolean isRunning() {
        boolean z5;
        synchronized (this.f11515) {
            z5 = this.f11518 == e.a.RUNNING;
        }
        return z5;
    }

    @Override // u1.e, u1.d
    /* renamed from: ʻ */
    public boolean mo12156() {
        boolean z5;
        synchronized (this.f11515) {
            z5 = this.f11517.mo12156() || this.f11516.mo12156();
        }
        return z5;
    }

    @Override // u1.e
    /* renamed from: ʼ */
    public boolean mo12157(d dVar) {
        boolean z5;
        synchronized (this.f11515) {
            z5 = m12203() && (dVar.equals(this.f11516) || this.f11518 != e.a.SUCCESS);
        }
        return z5;
    }

    @Override // u1.d
    /* renamed from: ʽ */
    public void mo12158() {
        synchronized (this.f11515) {
            if (!this.f11519.m12171()) {
                this.f11519 = e.a.PAUSED;
                this.f11517.mo12158();
            }
            if (!this.f11518.m12171()) {
                this.f11518 = e.a.PAUSED;
                this.f11516.mo12158();
            }
        }
    }

    @Override // u1.e
    /* renamed from: ʾ */
    public void mo12159(d dVar) {
        synchronized (this.f11515) {
            if (dVar.equals(this.f11517)) {
                this.f11519 = e.a.SUCCESS;
                return;
            }
            this.f11518 = e.a.SUCCESS;
            e eVar = this.f11514;
            if (eVar != null) {
                eVar.mo12159(this);
            }
            if (!this.f11519.m12171()) {
                this.f11517.clear();
            }
        }
    }

    @Override // u1.d
    /* renamed from: ʿ */
    public boolean mo12160() {
        boolean z5;
        synchronized (this.f11515) {
            z5 = this.f11518 == e.a.CLEARED;
        }
        return z5;
    }

    @Override // u1.d
    /* renamed from: ˆ */
    public boolean mo12161(d dVar) {
        if (!(dVar instanceof j)) {
            return false;
        }
        j jVar = (j) dVar;
        if (this.f11516 == null) {
            if (jVar.f11516 != null) {
                return false;
            }
        } else if (!this.f11516.mo12161(jVar.f11516)) {
            return false;
        }
        if (this.f11517 == null) {
            if (jVar.f11517 != null) {
                return false;
            }
        } else if (!this.f11517.mo12161(jVar.f11517)) {
            return false;
        }
        return true;
    }

    @Override // u1.e
    /* renamed from: ˈ */
    public boolean mo12162(d dVar) {
        boolean z5;
        synchronized (this.f11515) {
            z5 = m12201() && dVar.equals(this.f11516) && this.f11518 != e.a.PAUSED;
        }
        return z5;
    }

    @Override // u1.e
    /* renamed from: ˉ */
    public void mo12163(d dVar) {
        synchronized (this.f11515) {
            if (!dVar.equals(this.f11516)) {
                this.f11519 = e.a.FAILED;
                return;
            }
            this.f11518 = e.a.FAILED;
            e eVar = this.f11514;
            if (eVar != null) {
                eVar.mo12163(this);
            }
        }
    }

    @Override // u1.d
    /* renamed from: ˊ */
    public void mo12164() {
        synchronized (this.f11515) {
            this.f11520 = true;
            try {
                if (this.f11518 != e.a.SUCCESS) {
                    e.a aVar = this.f11519;
                    e.a aVar2 = e.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f11519 = aVar2;
                        this.f11517.mo12164();
                    }
                }
                if (this.f11520) {
                    e.a aVar3 = this.f11518;
                    e.a aVar4 = e.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f11518 = aVar4;
                        this.f11516.mo12164();
                    }
                }
            } finally {
                this.f11520 = false;
            }
        }
    }

    @Override // u1.d
    /* renamed from: ˋ */
    public boolean mo12165() {
        boolean z5;
        synchronized (this.f11515) {
            z5 = this.f11518 == e.a.SUCCESS;
        }
        return z5;
    }

    @Override // u1.e
    /* renamed from: ˎ */
    public boolean mo12166(d dVar) {
        boolean z5;
        synchronized (this.f11515) {
            z5 = m12202() && dVar.equals(this.f11516) && !mo12156();
        }
        return z5;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m12204(d dVar, d dVar2) {
        this.f11516 = dVar;
        this.f11517 = dVar2;
    }
}
