package androidx.lifecycle;

import androidx.lifecycle.l;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f0 implements n {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final i0 f3809;

    public f0(i0 i0Var) {
        f4.k.m8623(i0Var, "provider");
        this.f3809 = i0Var;
    }

    @Override // androidx.lifecycle.n
    /* renamed from: ʿ */
    public void mo389(p pVar, l.a aVar) {
        f4.k.m8623(pVar, "source");
        f4.k.m8623(aVar, "event");
        if (aVar == l.a.ON_CREATE) {
            pVar.getLifecycle().mo4446(this);
            this.f3809.m4435();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
