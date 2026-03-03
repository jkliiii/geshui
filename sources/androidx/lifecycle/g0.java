package androidx.lifecycle;

import androidx.lifecycle.l;

/* compiled from: SavedStateHandleController.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g0 implements n {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String f3810;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final e0 f3811;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f3812;

    public g0(String str, e0 e0Var) {
        f4.k.m8623(str, "key");
        f4.k.m8623(e0Var, "handle");
        this.f3810 = str;
        this.f3811 = e0Var;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m4423(n0.d dVar, l lVar) {
        f4.k.m8623(dVar, "registry");
        f4.k.m8623(lVar, "lifecycle");
        if (!(!this.f3812)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f3812 = true;
        lVar.mo4444(this);
        dVar.m10408(this.f3810, this.f3811.m4419());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final e0 m4424() {
        return this.f3811;
    }

    @Override // androidx.lifecycle.n
    /* renamed from: ʿ */
    public void mo389(p pVar, l.a aVar) {
        f4.k.m8623(pVar, "source");
        f4.k.m8623(aVar, "event");
        if (aVar == l.a.ON_DESTROY) {
            this.f3812 = false;
            pVar.getLifecycle().mo4446(this);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final boolean m4425() {
        return this.f3812;
    }
}
