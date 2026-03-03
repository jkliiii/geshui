package m4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i extends n {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f9349 = AtomicIntegerFieldUpdater.newUpdater(i.class, "_resumed");
    private volatile int _resumed;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m10183() {
        return f9349.compareAndSet(this, 0, 1);
    }
}
