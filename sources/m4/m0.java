package m4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class m0 extends q0 {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f9360 = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final e4.l<Throwable, v3.p> f9361;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(e4.l<? super Throwable, v3.p> lVar) {
        this.f9361 = lVar;
    }

    @Override // e4.l
    /* renamed from: ˉ */
    public /* bridge */ /* synthetic */ v3.p mo430(Throwable th) {
        mo10187(th);
        return v3.p.f11735;
    }

    @Override // m4.p
    /* renamed from: ﹳ */
    public void mo10187(Throwable th) {
        if (f9360.compareAndSet(this, 0, 1)) {
            this.f9361.mo430(th);
        }
    }
}
