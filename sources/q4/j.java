package q4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.x;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10638 = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10639 = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10640 = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends q4.b<j> {

        /* renamed from: ʼ, reason: contains not printable characters */
        public final j f10641;

        /* renamed from: ʽ, reason: contains not printable characters */
        public j f10642;

        public a(j jVar) {
            this.f10641 = jVar;
        }

        @Override // q4.b
        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo11479(j jVar, Object obj) {
            boolean z5 = obj == null;
            j jVar2 = z5 ? this.f10641 : this.f10642;
            if (jVar2 != null && androidx.concurrent.futures.b.m1740(j.f10638, jVar, this, jVar2) && z5) {
                j jVar3 = this.f10641;
                j jVar4 = this.f10642;
                f4.k.m8620(jVar4);
                jVar3.m11497(jVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.b.m1740(r4, r3, r2, ((q4.m) r5).f10652) != false) goto L26;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final q4.j m11495(q4.l r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = q4.j.f10639
            java.lang.Object r0 = r0.get(r8)
            q4.j r0 = (q4.j) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = q4.j.f10638
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = q4.j.f10639
            boolean r0 = androidx.concurrent.futures.b.m1740(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.mo11490()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof q4.l
            if (r6 == 0) goto L34
            q4.l r5 = (q4.l) r5
            r5.mo11478(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof q4.m
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            q4.m r5 = (q4.m) r5
            q4.j r5 = r5.f10652
            boolean r2 = androidx.concurrent.futures.b.m1740(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = q4.j.f10639
            java.lang.Object r2 = r4.get(r2)
            q4.j r2 = (q4.j) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            f4.k.m8621(r5, r3)
            r3 = r5
            q4.j r3 = (q4.j) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.j.m11495(q4.l):q4.j");
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private final j m11496(j jVar) {
        while (jVar.mo11490()) {
            jVar = (j) f10639.get(jVar);
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public final void m11497(j jVar) {
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10639;
        do {
            jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (m11500() != jVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.m1740(f10639, jVar, jVar2, this));
        if (mo11490()) {
            jVar.m11495(null);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private final m m11498() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10640;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this);
        atomicReferenceFieldUpdater.lazySet(this, mVar2);
        return mVar2;
    }

    public String toString() {
        return new f4.o(this) { // from class: q4.j.b
            @Override // j4.e
            public Object get() {
                return x.m10279(this.f7779);
            }
        } + '@' + x.m10280(this);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m11499(j jVar) {
        f10639.lazySet(jVar, this);
        f10638.lazySet(jVar, this);
        while (m11500() == this) {
            if (androidx.concurrent.futures.b.m1740(f10638, this, this, jVar)) {
                jVar.m11497(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public final Object m11500() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10638;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof l)) {
                return obj;
            }
            ((l) obj).mo11478(this);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public final j m11501() {
        return i.m11492(m11500());
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public final j m11502() {
        j m11495 = m11495(null);
        return m11495 == null ? m11496((j) f10639.get(this)) : m11495;
    }

    /* renamed from: ᴵ */
    public boolean mo11490() {
        return m11500() instanceof m;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public boolean m11503() {
        return m11504() == null;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final j m11504() {
        Object m11500;
        j jVar;
        do {
            m11500 = m11500();
            if (m11500 instanceof m) {
                return ((m) m11500).f10652;
            }
            if (m11500 == this) {
                return (j) m11500;
            }
            f4.k.m8621(m11500, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            jVar = (j) m11500;
        } while (!androidx.concurrent.futures.b.m1740(f10638, this, m11500, jVar.m11498()));
        jVar.m11495(null);
        return null;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public final int m11505(j jVar, j jVar2, a aVar) {
        f10639.lazySet(jVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10638;
        atomicReferenceFieldUpdater.lazySet(jVar, jVar2);
        aVar.f10642 = jVar2;
        if (androidx.concurrent.futures.b.m1740(atomicReferenceFieldUpdater, this, jVar2, aVar)) {
            return aVar.mo11478(this) == null ? 1 : 2;
        }
        return 0;
    }
}
