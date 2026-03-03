package o4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.h;
import v3.j;
import v3.p;

/* compiled from: StateFlow.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d extends p4.b<b<?>> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10128 = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m11009() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10128;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == c.f10127) {
                return;
            }
            if (obj == c.f10126) {
                if (androidx.concurrent.futures.b.m1740(f10128, this, obj, c.f10127)) {
                    return;
                }
            } else if (androidx.concurrent.futures.b.m1740(f10128, this, obj, c.f10126)) {
                j.a aVar = j.f11729;
                ((h) obj).mo9541(j.m12380(p.f11735));
                return;
            }
        }
    }
}
