package m4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h<T> extends a0<T> implements g<T>, z3.d {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f9344 = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex");

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f9345 = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state");

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f9346 = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final x3.c<T> f9347;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final x3.e f9348;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final Void m10166(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private final void m10167() {
        if (m10171()) {
            return;
        }
        m10179();
    }

    /* renamed from: י, reason: contains not printable characters */
    private final void m10168(int i5) {
        if (m10175()) {
            return;
        }
        b0.m10121(this, i5);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private final c0 m10169() {
        return (c0) f9346.get(this);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final String m10170() {
        Object m10180 = m10180();
        return m10180 instanceof w0 ? "Active" : m10180 instanceof i ? "Cancelled" : "Completed";
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final boolean m10171() {
        if (b0.m10123(this.f9330)) {
            x3.c<T> cVar = this.f9347;
            f4.k.m8621(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((q4.f) cVar).m11485()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private final void m10172(Object obj, int i5, e4.l<? super Throwable, v3.p> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9345;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof w0)) {
                if (obj2 instanceof i) {
                    i iVar = (i) obj2;
                    if (iVar.m10183()) {
                        if (lVar != null) {
                            m10178(lVar, iVar.f9363);
                            return;
                        }
                        return;
                    }
                }
                m10166(obj);
                throw new v3.d();
            }
        } while (!androidx.concurrent.futures.b.m1740(f9345, this, obj2, m10174((w0) obj2, obj, i5, lVar, null)));
        m10167();
        m10168(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵢ, reason: contains not printable characters */
    static /* synthetic */ void m10173(h hVar, Object obj, int i5, e4.l lVar, int i6, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        hVar.m10172(obj, i5, lVar);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final Object m10174(w0 w0Var, Object obj, int i5, e4.l<? super Throwable, v3.p> lVar, Object obj2) {
        if (obj instanceof n) {
            return obj;
        }
        if (!b0.m10122(i5) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(w0Var instanceof e) && obj2 == null) {
            return obj;
        }
        return new m(obj, w0Var instanceof e ? (e) w0Var : null, lVar, obj2, null, 16, null);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private final boolean m10175() {
        int i5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9344;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f9344.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
        return true;
    }

    @Override // x3.c
    public x3.e getContext() {
        return this.f9348;
    }

    public String toString() {
        return m10181() + '(' + x.m10281(this.f9347) + "){" + m10170() + "}@" + x.m10280(this);
    }

    @Override // m4.a0
    /* renamed from: ʻ */
    public void mo10113(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9345;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof w0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof n) {
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (!(!mVar.m10191())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.m1740(f9345, this, obj2, m.m10189(mVar, null, null, null, null, th, 15, null))) {
                    mVar.m10192(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.m1740(f9345, this, obj2, new m(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // m4.a0
    /* renamed from: ʼ */
    public final x3.c<T> mo10114() {
        return this.f9347;
    }

    @Override // m4.a0
    /* renamed from: ʽ */
    public Throwable mo10115(Object obj) {
        Throwable mo10115 = super.mo10115(obj);
        if (mo10115 != null) {
            return mo10115;
        }
        return null;
    }

    @Override // z3.d
    /* renamed from: ʾ, reason: contains not printable characters */
    public z3.d mo10176() {
        x3.c<T> cVar = this.f9347;
        if (cVar instanceof z3.d) {
            return (z3.d) cVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.a0
    /* renamed from: ʿ */
    public <T> T mo10116(Object obj) {
        return obj instanceof m ? (T) ((m) obj).f9355 : obj;
    }

    @Override // x3.c
    /* renamed from: ˈ */
    public void mo9541(Object obj) {
        m10173(this, r.m10202(obj, this), this.f9330, null, 4, null);
    }

    @Override // m4.a0
    /* renamed from: ˉ */
    public Object mo10118() {
        return m10180();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m10177(e eVar, Throwable th) {
        try {
            eVar.m10143(th);
        } catch (Throwable th2) {
            v.m10277(getContext(), new q("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m10178(e4.l<? super Throwable, v3.p> lVar, Throwable th) {
        try {
            lVar.mo430(th);
        } catch (Throwable th2) {
            v.m10277(getContext(), new q("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m10179() {
        c0 m10169 = m10169();
        if (m10169 == null) {
            return;
        }
        m10169.mo10129();
        f9346.set(this, v0.f9394);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public final Object m10180() {
        return f9345.get(this);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    protected String m10181() {
        return "CancellableContinuation";
    }
}
