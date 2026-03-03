package m4;

/* compiled from: EventLoop.common.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class e0 extends t {

    /* renamed from: ˆ, reason: contains not printable characters */
    private long f9335;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f9336;

    /* renamed from: ˉ, reason: contains not printable characters */
    private w3.e<a0<?>> f9337;

    /* renamed from: ٴ, reason: contains not printable characters */
    private final long m10133(boolean z5) {
        return z5 ? 4294967296L : 1L;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static /* synthetic */ void m10134(e0 e0Var, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        e0Var.m10138(z5);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public final void m10135(boolean z5) {
        long m10133 = this.f9335 - m10133(z5);
        this.f9335 = m10133;
        if (m10133 <= 0 && this.f9336) {
            mo10142();
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public final void m10136(a0<?> a0Var) {
        w3.e<a0<?>> eVar = this.f9337;
        if (eVar == null) {
            eVar = new w3.e<>();
            this.f9337 = eVar;
        }
        eVar.addLast(a0Var);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    protected long mo10137() {
        w3.e<a0<?>> eVar = this.f9337;
        return (eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public final void m10138(boolean z5) {
        this.f9335 += m10133(z5);
        if (z5) {
            return;
        }
        this.f9336 = true;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public final boolean m10139() {
        return this.f9335 >= m10133(true);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public final boolean m10140() {
        w3.e<a0<?>> eVar = this.f9337;
        if (eVar != null) {
            return eVar.isEmpty();
        }
        return true;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final boolean m10141() {
        a0<?> m12523;
        w3.e<a0<?>> eVar = this.f9337;
        if (eVar == null || (m12523 = eVar.m12523()) == null) {
            return false;
        }
        m12523.run();
        return true;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void mo10142() {
    }
}
