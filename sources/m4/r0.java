package m4;

/* compiled from: JobSupport.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class r0 extends p implements c0, k0 {

    /* renamed from: ˈ, reason: contains not printable characters */
    public s0 f9370;

    @Override // q4.j
    public String toString() {
        return x.m10279(this) + '@' + x.m10280(this) + "[job@" + x.m10280(m10204()) + ']';
    }

    @Override // m4.k0
    /* renamed from: ʻ */
    public boolean mo10131() {
        return true;
    }

    @Override // m4.c0
    /* renamed from: ʽ */
    public void mo10129() {
        m10204().m10237(this);
    }

    @Override // m4.k0
    /* renamed from: ˈ */
    public u0 mo10132() {
        return null;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public final s0 m10204() {
        s0 s0Var = this.f9370;
        if (s0Var != null) {
            return s0Var;
        }
        f4.k.m8632("job");
        return null;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public final void m10205(s0 s0Var) {
        this.f9370 = s0Var;
    }
}
