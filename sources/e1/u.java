package e1;

import z1.a;

/* compiled from: LockedResource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class u<Z> implements v<Z>, a.f {

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final androidx.core.util.e<u<?>> f7545 = z1.a.m13137(20, new a());

    /* renamed from: ʾ, reason: contains not printable characters */
    private final z1.c f7546 = z1.c.m13149();

    /* renamed from: ʿ, reason: contains not printable characters */
    private v<Z> f7547;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f7548;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f7549;

    /* compiled from: LockedResource.java */
    class a implements a.d<u<?>> {
        a() {
        }

        @Override // z1.a.d
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public u<?> mo8383() {
            return new u<>();
        }
    }

    u() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m8436(v<Z> vVar) {
        this.f7549 = false;
        this.f7548 = true;
        this.f7547 = vVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static <Z> u<Z> m8437(v<Z> vVar) {
        u<Z> uVar = (u) y1.k.m12893(f7545.mo2575());
        uVar.m8436(vVar);
        return uVar;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m8438() {
        this.f7547 = null;
        f7545.mo2574(this);
    }

    @Override // e1.v
    public Z get() {
        return this.f7547.get();
    }

    @Override // e1.v
    /* renamed from: ʼ */
    public int mo8411() {
        return this.f7547.mo8411();
    }

    @Override // e1.v
    /* renamed from: ʽ */
    public Class<Z> mo8412() {
        return this.f7547.mo8412();
    }

    @Override // e1.v
    /* renamed from: ʾ */
    public synchronized void mo8413() {
        this.f7546.mo13151();
        this.f7549 = true;
        if (!this.f7548) {
            this.f7547.mo8413();
            m8438();
        }
    }

    @Override // z1.a.f
    /* renamed from: ˆ */
    public z1.c mo8343() {
        return this.f7546;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    synchronized void m8439() {
        this.f7546.mo13151();
        if (!this.f7548) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f7548 = false;
        if (this.f7549) {
            mo8413();
        }
    }
}
