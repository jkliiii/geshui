package m4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: Builders.common.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class z<T> extends q4.n<T> {

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f9397 = AtomicIntegerFieldUpdater.newUpdater(z.class, "_decision");
    private volatile int _decision;

    /* renamed from: ʻٴ, reason: contains not printable characters */
    private final boolean m10290() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9397;
        do {
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f9397.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // q4.n, m4.a
    /* renamed from: ʻˑ */
    protected void mo10106(Object obj) {
        if (m10290()) {
            return;
        }
        q4.g.m11489(y3.c.m12937(this.f10653), r.m10200(obj, this.f10653), null, 2, null);
    }

    @Override // q4.n, m4.s0
    /* renamed from: ᵎ */
    protected void mo10249(Object obj) {
        mo10106(obj);
    }
}
