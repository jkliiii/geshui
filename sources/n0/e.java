package n0;

import android.os.Bundle;
import androidx.lifecycle.l;
import f4.k;

/* compiled from: SavedStateRegistryController.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final a f9510 = new a(null);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f f9511;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final d f9512;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f9513;

    /* compiled from: SavedStateRegistryController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final e m10415(f fVar) {
            k.m8623(fVar, "owner");
            return new e(fVar, null);
        }
    }

    public /* synthetic */ e(f fVar, f4.g gVar) {
        this(fVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final e m10410(f fVar) {
        return f9510.m10415(fVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final d m10411() {
        return this.f9512;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m10412() {
        l lifecycle = this.f9511.getLifecycle();
        if (!(lifecycle.mo4445() == l.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.mo4444(new b(this.f9511));
        this.f9512.m10405(lifecycle);
        this.f9513 = true;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m10413(Bundle bundle) {
        if (!this.f9513) {
            m10412();
        }
        l lifecycle = this.f9511.getLifecycle();
        if (!lifecycle.mo4445().m4455(l.b.STARTED)) {
            this.f9512.m10406(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo4445()).toString());
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final void m10414(Bundle bundle) {
        k.m8623(bundle, "outBundle");
        this.f9512.m10407(bundle);
    }

    private e(f fVar) {
        this.f9511 = fVar;
        this.f9512 = new d();
    }
}
