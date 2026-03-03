package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.o0;
import j0.a;
import n0.d;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class h0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final a.b<n0.f> f3813 = new b();

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final a.b<s0> f3814 = new c();

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final a.b<Bundle> f3815 = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b implements a.b<n0.f> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c implements a.b<s0> {
        c() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class d implements o0.b {
        d() {
        }

        @Override // androidx.lifecycle.o0.b
        /* renamed from: ʻ */
        public /* synthetic */ n0 mo4286(Class cls) {
            return p0.m4474(this, cls);
        }

        @Override // androidx.lifecycle.o0.b
        /* renamed from: ʼ */
        public <T extends n0> T mo4287(Class<T> cls, j0.a aVar) {
            f4.k.m8623(cls, "modelClass");
            f4.k.m8623(aVar, "extras");
            return new j0();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final e0 m4427(j0.a aVar) {
        f4.k.m8623(aVar, "<this>");
        n0.f fVar = (n0.f) aVar.mo9275(f3813);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        s0 s0Var = (s0) aVar.mo9275(f3814);
        if (s0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.mo9275(f3815);
        String str = (String) aVar.mo9275(o0.c.f3857);
        if (str != null) {
            return m4428(fVar, s0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final e0 m4428(n0.f fVar, s0 s0Var, String str, Bundle bundle) {
        i0 m4430 = m4430(fVar);
        j0 m4431 = m4431(s0Var);
        e0 e0Var = m4431.m4437().get(str);
        if (e0Var != null) {
            return e0Var;
        }
        e0 m4421 = e0.f3799.m4421(m4430.m4434(str), bundle);
        m4431.m4437().put(str, m4421);
        return m4421;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static final <T extends n0.f & s0> void m4429(T t5) {
        f4.k.m8623(t5, "<this>");
        l.b mo4445 = t5.getLifecycle().mo4445();
        if (!(mo4445 == l.b.INITIALIZED || mo4445 == l.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t5.getSavedStateRegistry().m10404("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            i0 i0Var = new i0(t5.getSavedStateRegistry(), t5);
            t5.getSavedStateRegistry().m10408("androidx.lifecycle.internal.SavedStateHandlesProvider", i0Var);
            t5.getLifecycle().mo4444(new f0(i0Var));
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final i0 m4430(n0.f fVar) {
        f4.k.m8623(fVar, "<this>");
        d.c m10404 = fVar.getSavedStateRegistry().m10404("androidx.lifecycle.internal.SavedStateHandlesProvider");
        i0 i0Var = m10404 instanceof i0 ? (i0) m10404 : null;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final j0 m4431(s0 s0Var) {
        f4.k.m8623(s0Var, "<this>");
        return (j0) new o0(s0Var, new d()).m4466("androidx.lifecycle.internal.SavedStateHandlesVM", j0.class);
    }
}
