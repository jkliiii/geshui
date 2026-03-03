package m4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: EventLoop.common.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class f0 extends g0 {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f9338 = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_queue");

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f9339 = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_delayed");

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f9340 = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    public static abstract class a implements Runnable, Comparable<a>, c0, q4.v {
        private volatile Object _heap;

        /* renamed from: ʾ, reason: contains not printable characters */
        public long f9341;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f9342;

        @Override // q4.v
        public int getIndex() {
            return this.f9342;
        }

        @Override // q4.v
        public void setIndex(int i5) {
            this.f9342 = i5;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f9341 + ']';
        }

        @Override // q4.v
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo10159(q4.u<?> uVar) {
            if (!(this._heap != i0.f9350)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = uVar;
        }

        @Override // q4.v
        /* renamed from: ʼ, reason: contains not printable characters */
        public q4.u<?> mo10160() {
            Object obj = this._heap;
            if (obj instanceof q4.u) {
                return (q4.u) obj;
            }
            return null;
        }

        @Override // m4.c0
        /* renamed from: ʽ */
        public final void mo10129() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == i0.f9350) {
                    return;
                }
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.m11552(this);
                }
                this._heap = i0.f9350;
                v3.p pVar = v3.p.f11735;
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j5 = this.f9341 - aVar.f9341;
            if (j5 > 0) {
                return 1;
            }
            return j5 < 0 ? -1 : 0;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public final int m10162(long j5, b bVar, f0 f0Var) {
            synchronized (this) {
                if (this._heap == i0.f9350) {
                    return 2;
                }
                synchronized (bVar) {
                    a m11548 = bVar.m11548();
                    if (f0Var.m10146()) {
                        return 1;
                    }
                    if (m11548 == null) {
                        bVar.f9343 = j5;
                    } else {
                        long j6 = m11548.f9341;
                        if (j6 - j5 < 0) {
                            j5 = j6;
                        }
                        if (j5 - bVar.f9343 > 0) {
                            bVar.f9343 = j5;
                        }
                    }
                    long j7 = this.f9341;
                    long j8 = bVar.f9343;
                    if (j7 - j8 < 0) {
                        this.f9341 = j8;
                    }
                    bVar.m11547(this);
                    return 0;
                }
            }
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public final boolean m10163(long j5) {
            return j5 - this.f9341 >= 0;
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class b extends q4.u<a> {

        /* renamed from: ʽ, reason: contains not printable characters */
        public long f9343;

        public b(long j5) {
            this.f9343 = j5;
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private final void m10144() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9338;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.m1740(f9338, this, null, i0.f9351)) {
                    return;
                }
            } else if (obj instanceof q4.k) {
                ((q4.k) obj).m11513();
                return;
            } else {
                if (obj == i0.f9351) {
                    return;
                }
                q4.k kVar = new q4.k(8, true);
                f4.k.m8621(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                kVar.m11512((Runnable) obj);
                if (androidx.concurrent.futures.b.m1740(f9338, this, obj, kVar)) {
                    return;
                }
            }
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private final Runnable m10145() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9338;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof q4.k) {
                f4.k.m8621(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q4.k kVar = (q4.k) obj;
                Object m11516 = kVar.m11516();
                if (m11516 != q4.k.f10646) {
                    return (Runnable) m11516;
                }
                androidx.concurrent.futures.b.m1740(f9338, this, obj, kVar.m11515());
            } else {
                if (obj == i0.f9351) {
                    return null;
                }
                if (androidx.concurrent.futures.b.m1740(f9338, this, obj, null)) {
                    f4.k.m8621(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʾ, reason: contains not printable characters */
    public final boolean m10146() {
        return f9340.get(this) != 0;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private final boolean m10147(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9338;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m10146()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.m1740(f9338, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof q4.k) {
                f4.k.m8621(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q4.k kVar = (q4.k) obj;
                int m11512 = kVar.m11512(runnable);
                if (m11512 == 0) {
                    return true;
                }
                if (m11512 == 1) {
                    androidx.concurrent.futures.b.m1740(f9338, this, obj, kVar.m11515());
                } else if (m11512 == 2) {
                    return false;
                }
            } else {
                if (obj == i0.f9351) {
                    return false;
                }
                q4.k kVar2 = new q4.k(8, true);
                f4.k.m8621(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                kVar2.m11512((Runnable) obj);
                kVar2.m11512(runnable);
                if (androidx.concurrent.futures.b.m1740(f9338, this, obj, kVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private final void m10148() {
        a m11554;
        c.m10128();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) f9339.get(this);
            if (bVar == null || (m11554 = bVar.m11554()) == null) {
                return;
            } else {
                mo10165(nanoTime, m11554);
            }
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private final int m10149(long j5, a aVar) {
        if (m10146()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9339;
        b bVar = (b) atomicReferenceFieldUpdater.get(this);
        if (bVar == null) {
            androidx.concurrent.futures.b.m1740(atomicReferenceFieldUpdater, this, null, new b(j5));
            Object obj = atomicReferenceFieldUpdater.get(this);
            f4.k.m8620(obj);
            bVar = (b) obj;
        }
        return aVar.m10162(j5, bVar, this);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private final boolean m10150(a aVar) {
        b bVar = (b) f9339.get(this);
        return (bVar != null ? bVar.m11551() : null) == aVar;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private final void m10151(boolean z5) {
        f9340.set(this, z5 ? 1 : 0);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public void mo10153(Runnable runnable) {
        if (m10147(runnable)) {
            m10164();
        } else {
            y.f9395.mo10153(runnable);
        }
    }

    @Override // m4.t
    /* renamed from: ʾ, reason: contains not printable characters */
    public final void mo10154(x3.e eVar, Runnable runnable) {
        mo10153(runnable);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public long m10155() {
        a aVar;
        if (m10141()) {
            return 0L;
        }
        b bVar = (b) f9339.get(this);
        if (bVar != null && !bVar.m11550()) {
            c.m10128();
            long nanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    a m11548 = bVar.m11548();
                    if (m11548 != null) {
                        a aVar2 = m11548;
                        aVar = aVar2.m10163(nanoTime) ? m10147(aVar2) : false ? bVar.m11553(0) : null;
                    }
                }
            } while (aVar != null);
        }
        Runnable m10145 = m10145();
        if (m10145 == null) {
            return mo10137();
        }
        m10145.run();
        return 0L;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    protected final void m10156() {
        f9338.set(this, null);
        f9339.set(this, null);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public final void m10157(long j5, a aVar) {
        int m10149 = m10149(j5, aVar);
        if (m10149 == 0) {
            if (m10150(aVar)) {
                m10164();
            }
        } else if (m10149 == 1) {
            mo10165(j5, aVar);
        } else if (m10149 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    protected boolean m10158() {
        if (!m10140()) {
            return false;
        }
        b bVar = (b) f9339.get(this);
        if (bVar != null && !bVar.m11550()) {
            return false;
        }
        Object obj = f9338.get(this);
        if (obj != null) {
            if (obj instanceof q4.k) {
                return ((q4.k) obj).m11514();
            }
            if (obj != i0.f9351) {
                return false;
            }
        }
        return true;
    }

    @Override // m4.e0
    /* renamed from: ᴵ */
    protected long mo10137() {
        a m11551;
        if (super.mo10137() == 0) {
            return 0L;
        }
        Object obj = f9338.get(this);
        if (obj != null) {
            if (!(obj instanceof q4.k)) {
                return obj == i0.f9351 ? Long.MAX_VALUE : 0L;
            }
            if (!((q4.k) obj).m11514()) {
                return 0L;
            }
        }
        b bVar = (b) f9339.get(this);
        if (bVar == null || (m11551 = bVar.m11551()) == null) {
            return Long.MAX_VALUE;
        }
        long j5 = m11551.f9341;
        c.m10128();
        return i4.f.m9257(j5 - System.nanoTime(), 0L);
    }

    @Override // m4.e0
    /* renamed from: ﹶ */
    public void mo10142() {
        z0.f9398.m10292();
        m10151(true);
        m10144();
        while (m10155() <= 0) {
        }
        m10148();
    }
}
