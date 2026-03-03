package q4;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k<E> {

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final a f10643 = new a(null);

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10644 = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final AtomicLongFieldUpdater f10645 = AtomicLongFieldUpdater.newUpdater(k.class, "_state");

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final o f10646 = new o("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f10647;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean f10648;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f10649;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final AtomicReferenceArray f10650;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int m11517(long j5) {
            return (j5 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final long m11518(long j5, int i5) {
            return m11520(j5, 1073741823L) | (i5 << 0);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final long m11519(long j5, int i5) {
            return m11520(j5, 1152921503533105152L) | (i5 << 30);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public final long m11520(long j5, long j6) {
            return j5 & (j6 ^ (-1));
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int f10651;

        public b(int i5) {
            this.f10651 = i5;
        }
    }

    public k(int i5, boolean z5) {
        this.f10647 = i5;
        this.f10648 = z5;
        int i6 = i5 - 1;
        this.f10649 = i6;
        this.f10650 = new AtomicReferenceArray(i5);
        if (!(i6 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i5 & i6) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    private final k<E> m11507(long j5) {
        k<E> kVar = new k<>(this.f10647 * 2, this.f10648);
        int i5 = (int) ((1073741823 & j5) >> 0);
        int i6 = (int) ((1152921503533105152L & j5) >> 30);
        while (true) {
            int i7 = this.f10649;
            if ((i5 & i7) == (i6 & i7)) {
                f10645.set(kVar, f10643.m11520(j5, 1152921504606846976L));
                return kVar;
            }
            Object obj = this.f10650.get(i7 & i5);
            if (obj == null) {
                obj = new b(i5);
            }
            kVar.f10650.set(kVar.f10649 & i5, obj);
            i5++;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final k<E> m11508(long j5) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10644;
        while (true) {
            k<E> kVar = (k) atomicReferenceFieldUpdater.get(this);
            if (kVar != null) {
                return kVar;
            }
            androidx.concurrent.futures.b.m1740(f10644, this, null, m11507(j5));
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private final k<E> m11509(int i5, E e5) {
        Object obj = this.f10650.get(this.f10649 & i5);
        if (!(obj instanceof b) || ((b) obj).f10651 != i5) {
            return null;
        }
        this.f10650.set(i5 & this.f10649, e5);
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private final long m11510() {
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10645;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 1152921504606846976L) != 0) {
                return j5;
            }
            j6 = j5 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, j6));
        return j6;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private final k<E> m11511(int i5, int i6) {
        long j5;
        int i7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10645;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            i7 = (int) ((1073741823 & j5) >> 0);
            if ((1152921504606846976L & j5) != 0) {
                return m11515();
            }
        } while (!f10645.compareAndSet(this, j5, f10643.m11518(j5, i6)));
        this.f10650.set(this.f10649 & i7, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return 1;
     */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m11512(E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = q4.k.f10645
        L2:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L16
            q4.k$a r14 = q4.k.f10643
            int r14 = r14.m11517(r3)
            return r14
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r2 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r1 = 30
            long r5 = r5 >> r1
            int r10 = (int) r5
            int r11 = r13.f10649
            int r1 = r10 + 2
            r1 = r1 & r11
            r5 = r2 & r11
            r6 = 1
            if (r1 != r5) goto L32
            return r6
        L32:
            boolean r1 = r13.f10648
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r13.f10650
            r12 = r10 & r11
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L51
            int r1 = r13.f10647
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L50
            int r10 = r10 - r2
            r2 = r10 & r5
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L50:
            return r6
        L51:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = q4.k.f10645
            q4.k$a r5 = q4.k.f10643
            long r5 = r5.m11519(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f10650
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = q4.k.f10645
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L83
            q4.k r0 = r0.m11515()
            q4.k r0 = r0.m11509(r10, r14)
            if (r0 != 0) goto L6c
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.k.m11512(java.lang.Object):int");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final boolean m11513() {
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10645;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, j5 | 2305843009213693952L));
        return true;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final boolean m11514() {
        long j5 = f10645.get(this);
        return ((int) ((1073741823 & j5) >> 0)) == ((int) ((j5 & 1152921503533105152L) >> 30));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final k<E> m11515() {
        return m11508(m11510());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final Object m11516() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10645;
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j5) != 0) {
                return f10646;
            }
            int i5 = (int) ((1073741823 & j5) >> 0);
            int i6 = (int) ((1152921503533105152L & j5) >> 30);
            int i7 = this.f10649;
            if ((i6 & i7) == (i5 & i7)) {
                return null;
            }
            Object obj = this.f10650.get(i7 & i5);
            if (obj == null) {
                if (this.f10648) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i8 = (i5 + 1) & 1073741823;
                if (f10645.compareAndSet(this, j5, f10643.m11518(j5, i8))) {
                    this.f10650.set(this.f10649 & i5, null);
                    return obj;
                }
                if (this.f10648) {
                    k<E> kVar = this;
                    do {
                        kVar = kVar.m11511(i5, i8);
                    } while (kVar != null);
                    return obj;
                }
            }
        }
    }
}
