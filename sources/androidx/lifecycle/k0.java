package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.o0;
import java.lang.reflect.Constructor;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k0 extends o0.d implements o0.b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private Application f3825;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final o0.b f3826;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Bundle f3827;

    /* renamed from: ʾ, reason: contains not printable characters */
    private l f3828;

    /* renamed from: ʿ, reason: contains not printable characters */
    private n0.d f3829;

    @SuppressLint({"LambdaLast"})
    public k0(Application application, n0.f fVar, Bundle bundle) {
        f4.k.m8623(fVar, "owner");
        this.f3829 = fVar.getSavedStateRegistry();
        this.f3828 = fVar.getLifecycle();
        this.f3827 = bundle;
        this.f3825 = application;
        this.f3826 = application != null ? o0.a.f3850.m4470(application) : new o0.a();
    }

    @Override // androidx.lifecycle.o0.b
    /* renamed from: ʻ */
    public <T extends n0> T mo4286(Class<T> cls) {
        f4.k.m8623(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m4443(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.o0.b
    /* renamed from: ʼ */
    public <T extends n0> T mo4287(Class<T> cls, j0.a aVar) {
        f4.k.m8623(cls, "modelClass");
        f4.k.m8623(aVar, "extras");
        String str = (String) aVar.mo9275(o0.c.f3857);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.mo9275(h0.f3813) == null || aVar.mo9275(h0.f3814) == null) {
            if (this.f3828 != null) {
                return (T) m4443(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.mo9275(o0.a.f3852);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor m4458 = (!isAssignableFrom || application == null) ? l0.m4458(cls, l0.f3840) : l0.m4458(cls, l0.f3839);
        return m4458 == null ? (T) this.f3826.mo4287(cls, aVar) : (!isAssignableFrom || application == null) ? (T) l0.m4459(cls, m4458, h0.m4427(aVar)) : (T) l0.m4459(cls, m4458, application, h0.m4427(aVar));
    }

    @Override // androidx.lifecycle.o0.d
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo4442(n0 n0Var) {
        f4.k.m8623(n0Var, "viewModel");
        if (this.f3828 != null) {
            n0.d dVar = this.f3829;
            f4.k.m8620(dVar);
            l lVar = this.f3828;
            f4.k.m8620(lVar);
            k.m4438(n0Var, dVar, lVar);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final <T extends n0> T m4443(String str, Class<T> cls) {
        T t5;
        Application application;
        f4.k.m8623(str, "key");
        f4.k.m8623(cls, "modelClass");
        l lVar = this.f3828;
        if (lVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor m4458 = (!isAssignableFrom || this.f3825 == null) ? l0.m4458(cls, l0.f3840) : l0.m4458(cls, l0.f3839);
        if (m4458 == null) {
            return this.f3825 != null ? (T) this.f3826.mo4286(cls) : (T) o0.c.f3855.m4473().mo4286(cls);
        }
        n0.d dVar = this.f3829;
        f4.k.m8620(dVar);
        g0 m4439 = k.m4439(dVar, lVar, str, this.f3827);
        if (!isAssignableFrom || (application = this.f3825) == null) {
            t5 = (T) l0.m4459(cls, m4458, m4439.m4424());
        } else {
            f4.k.m8620(application);
            t5 = (T) l0.m4459(cls, m4458, application, m4439.m4424());
        }
        t5.m4464("androidx.lifecycle.savedstate.vm.tag", m4439);
        return t5;
    }
}
