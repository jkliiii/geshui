package e1;

/* compiled from: EngineResource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class p<Z> implements v<Z> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final boolean f7523;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean f7524;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final v<Z> f7525;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final a f7526;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final c1.f f7527;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f7528;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f7529;

    /* compiled from: EngineResource.java */
    interface a {
        /* renamed from: ʼ */
        void mo8377(c1.f fVar, p<?> pVar);
    }

    p(v<Z> vVar, boolean z5, boolean z6, c1.f fVar, a aVar) {
        this.f7525 = (v) y1.k.m12893(vVar);
        this.f7523 = z5;
        this.f7524 = z6;
        this.f7527 = fVar;
        this.f7526 = (a) y1.k.m12893(aVar);
    }

    @Override // e1.v
    public Z get() {
        return this.f7525.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f7523 + ", listener=" + this.f7526 + ", key=" + this.f7527 + ", acquired=" + this.f7528 + ", isRecycled=" + this.f7529 + ", resource=" + this.f7525 + '}';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    synchronized void m8410() {
        if (this.f7529) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f7528++;
    }

    @Override // e1.v
    /* renamed from: ʼ, reason: contains not printable characters */
    public int mo8411() {
        return this.f7525.mo8411();
    }

    @Override // e1.v
    /* renamed from: ʽ, reason: contains not printable characters */
    public Class<Z> mo8412() {
        return this.f7525.mo8412();
    }

    @Override // e1.v
    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized void mo8413() {
        if (this.f7528 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f7529) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f7529 = true;
        if (this.f7524) {
            this.f7525.mo8413();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    v<Z> m8414() {
        return this.f7525;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean m8415() {
        return this.f7523;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m8416() {
        boolean z5;
        synchronized (this) {
            int i5 = this.f7528;
            if (i5 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z5 = true;
            int i6 = i5 - 1;
            this.f7528 = i6;
            if (i6 != 0) {
                z5 = false;
            }
        }
        if (z5) {
            this.f7526.mo8377(this.f7527, this);
        }
    }
}
