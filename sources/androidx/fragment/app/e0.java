package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e0 implements androidx.lifecycle.j, n0.f, s0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final e f3525;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final r0 f3526;

    /* renamed from: ˆ, reason: contains not printable characters */
    private androidx.lifecycle.q f3527 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private n0.e f3528 = null;

    e0(e eVar, r0 r0Var) {
        this.f3525 = eVar;
        this.f3526 = r0Var;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ j0.a getDefaultViewModelCreationExtras() {
        return androidx.lifecycle.i.m4432(this);
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.l getLifecycle() {
        m4031();
        return this.f3527;
    }

    @Override // n0.f
    public n0.d getSavedStateRegistry() {
        m4031();
        return this.f3528.m10411();
    }

    @Override // androidx.lifecycle.s0
    public r0 getViewModelStore() {
        m4031();
        return this.f3526;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m4030(l.a aVar) {
        this.f3527.m4485(aVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m4031() {
        if (this.f3527 == null) {
            this.f3527 = new androidx.lifecycle.q(this);
            this.f3528 = n0.e.m10410(this);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean m4032() {
        return this.f3527 != null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m4033(Bundle bundle) {
        this.f3528.m10413(bundle);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m4034(Bundle bundle) {
        this.f3528.m10414(bundle);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m4035(l.b bVar) {
        this.f3527.m4487(bVar);
    }
}
