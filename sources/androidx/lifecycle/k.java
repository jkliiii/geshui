package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.l;
import java.util.Iterator;
import n0.d;

/* compiled from: LegacySavedStateHandleController.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final k f3822 = new k();

    /* compiled from: LegacySavedStateHandleController.kt */
    public static final class a implements d.a {
        @Override // n0.d.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4441(n0.f fVar) {
            f4.k.m8623(fVar, "owner");
            if (!(fVar instanceof s0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            r0 viewModelStore = ((s0) fVar).getViewModelStore();
            n0.d savedStateRegistry = fVar.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.m4494().iterator();
            while (it.hasNext()) {
                n0 m4493 = viewModelStore.m4493(it.next());
                f4.k.m8620(m4493);
                k.m4438(m4493, savedStateRegistry, fVar.getLifecycle());
            }
            if (!viewModelStore.m4494().isEmpty()) {
                savedStateRegistry.m10409(a.class);
            }
        }
    }

    /* compiled from: LegacySavedStateHandleController.kt */
    public static final class b implements n {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ l f3823;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ n0.d f3824;

        b(l lVar, n0.d dVar) {
            this.f3823 = lVar;
            this.f3824 = dVar;
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ */
        public void mo389(p pVar, l.a aVar) {
            f4.k.m8623(pVar, "source");
            f4.k.m8623(aVar, "event");
            if (aVar == l.a.ON_START) {
                this.f3823.mo4446(this);
                this.f3824.m10409(a.class);
            }
        }
    }

    private k() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m4438(n0 n0Var, n0.d dVar, l lVar) {
        f4.k.m8623(n0Var, "viewModel");
        f4.k.m8623(dVar, "registry");
        f4.k.m8623(lVar, "lifecycle");
        g0 g0Var = (g0) n0Var.m4463("androidx.lifecycle.savedstate.vm.tag");
        if (g0Var == null || g0Var.m4425()) {
            return;
        }
        g0Var.m4423(dVar, lVar);
        f3822.m4440(dVar, lVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final g0 m4439(n0.d dVar, l lVar, String str, Bundle bundle) {
        f4.k.m8623(dVar, "registry");
        f4.k.m8623(lVar, "lifecycle");
        f4.k.m8620(str);
        g0 g0Var = new g0(str, e0.f3799.m4421(dVar.m10403(str), bundle));
        g0Var.m4423(dVar, lVar);
        f3822.m4440(dVar, lVar);
        return g0Var;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final void m4440(n0.d dVar, l lVar) {
        l.b mo4445 = lVar.mo4445();
        if (mo4445 == l.b.INITIALIZED || mo4445.m4455(l.b.STARTED)) {
            dVar.m10409(a.class);
        } else {
            lVar.mo4444(new b(lVar, dVar));
        }
    }
}
