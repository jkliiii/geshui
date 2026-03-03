package m4;

import java.util.concurrent.locks.LockSupport;
import m4.f0;

/* compiled from: EventLoop.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class g0 extends e0 {
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected final void m10164() {
        Thread mo10130 = mo10130();
        if (Thread.currentThread() != mo10130) {
            c.m10128();
            LockSupport.unpark(mo10130);
        }
    }

    /* renamed from: ﾞ */
    protected abstract Thread mo10130();

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    protected void mo10165(long j5, f0.a aVar) {
        y.f9395.m10157(j5, aVar);
    }
}
