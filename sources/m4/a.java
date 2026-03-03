package m4;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a<T> extends s0 implements x3.c<T> {

    /* renamed from: ˆ, reason: contains not printable characters */
    private final x3.e f9329;

    @Override // x3.c
    public final x3.e getContext() {
        return this.f9329;
    }

    @Override // m4.s0, m4.o0
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo10105() {
        return super.mo10105();
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    protected void mo10106(Object obj) {
        mo10249(obj);
    }

    @Override // x3.c
    /* renamed from: ˈ */
    public final void mo9541(Object obj) {
        Object m10248 = m10248(r.m10203(obj, null, 1, null));
        if (m10248 == t0.f9386) {
            return;
        }
        mo10106(m10248);
    }

    @Override // m4.s0
    /* renamed from: ˋˋ, reason: contains not printable characters */
    public final void mo10109(Throwable th) {
        v.m10277(this.f9329, th);
    }

    @Override // m4.s0
    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public String mo10110() {
        String m10206 = s.m10206(this.f9329);
        if (m10206 == null) {
            return super.mo10110();
        }
        return '\"' + m10206 + "\":" + super.mo10110();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m4.s0
    /* renamed from: ﹳ, reason: contains not printable characters */
    public String mo10111() {
        return x.m10279(this) + " was cancelled";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.s0
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    protected final void mo10112(Object obj) {
        if (!(obj instanceof n)) {
            m10108(obj);
        } else {
            n nVar = (n) obj;
            m10107(nVar.f9363, nVar.m10193());
        }
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    protected void m10108(T t5) {
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    protected void m10107(Throwable th, boolean z5) {
    }
}
