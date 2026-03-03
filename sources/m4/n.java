package m4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f9362 = AtomicIntegerFieldUpdater.newUpdater(n.class, "_handled");
    private volatile int _handled;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Throwable f9363;

    public n(Throwable th, boolean z5) {
        this.f9363 = th;
        this._handled = z5 ? 1 : 0;
    }

    public String toString() {
        return x.m10279(this) + '[' + this.f9363 + ']';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final boolean m10193() {
        return f9362.get(this) != 0;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean m10194() {
        return f9362.compareAndSet(this, 0, 1);
    }

    public /* synthetic */ n(Throwable th, boolean z5, int i5, f4.g gVar) {
        this(th, (i5 & 2) != 0 ? false : z5);
    }
}
