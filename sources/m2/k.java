package m2;

/* compiled from: SimpleCancellable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k implements c {

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final m2.a f9119 = new a();

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final m2.a f9120 = new b();

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean f9121;

    /* renamed from: ʿ, reason: contains not printable characters */
    boolean f9122;

    /* renamed from: ˆ, reason: contains not printable characters */
    private m2.a f9123;

    /* compiled from: SimpleCancellable.java */
    static class a extends k {
        a() {
            mo9875();
        }
    }

    /* compiled from: SimpleCancellable.java */
    static class b extends k {
        b() {
            cancel();
        }
    }

    @Override // m2.a
    public boolean cancel() {
        synchronized (this) {
            if (this.f9121) {
                return false;
            }
            if (this.f9122) {
                return true;
            }
            this.f9122 = true;
            m2.a aVar = this.f9123;
            this.f9123 = null;
            if (aVar != null) {
                aVar.cancel();
            }
            mo9466();
            mo9872();
            return true;
        }
    }

    @Override // m2.a
    public boolean isCancelled() {
        boolean z5;
        m2.a aVar;
        synchronized (this) {
            z5 = this.f9122 || ((aVar = this.f9123) != null && aVar.isCancelled());
        }
        return z5;
    }

    @Override // m2.a
    public boolean isDone() {
        return this.f9121;
    }

    @Override // m2.c
    /* renamed from: ˆ */
    public boolean mo9858(m2.a aVar) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f9123 = aVar;
            return true;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public m2.a m9874() {
        cancel();
        this.f9121 = false;
        this.f9122 = false;
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean mo9875() {
        synchronized (this) {
            if (this.f9122) {
                return false;
            }
            if (this.f9121) {
                return false;
            }
            this.f9121 = true;
            this.f9123 = null;
            m9873();
            mo9872();
            return true;
        }
    }

    /* renamed from: ˋ */
    protected void mo9466() {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected void mo9872() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected void m9873() {
    }
}
