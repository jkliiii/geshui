package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: R8$$SyntheticClass */
/* loaded from: E:\78999\cookie_5123796.dex */
public final /* synthetic */ class b {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1740(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
