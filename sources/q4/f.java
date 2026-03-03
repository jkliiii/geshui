package q4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.a0;
import m4.e0;
import m4.x;
import m4.z0;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f<T> extends a0<T> implements z3.d, x3.c<T> {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10630 = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: ˈ, reason: contains not printable characters */
    public final m4.t f10631;

    /* renamed from: ˉ, reason: contains not printable characters */
    public final x3.c<T> f10632;

    /* renamed from: ˊ, reason: contains not printable characters */
    public Object f10633;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final Object f10634;

    /* JADX WARN: Multi-variable type inference failed */
    public f(m4.t tVar, x3.c<? super T> cVar) {
        super(-1);
        this.f10631 = tVar;
        this.f10632 = cVar;
        this.f10633 = g.f10635;
        this.f10634 = s.m11536(getContext());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private final m4.h<?> m11483() {
        Object obj = f10630.get(this);
        if (obj instanceof m4.h) {
            return (m4.h) obj;
        }
        return null;
    }

    @Override // x3.c
    public x3.e getContext() {
        return this.f10632.getContext();
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f10631 + ", " + x.m10281(this.f10632) + ']';
    }

    @Override // m4.a0
    /* renamed from: ʻ */
    public void mo10113(Object obj, Throwable th) {
        if (obj instanceof m4.o) {
            ((m4.o) obj).f9366.mo430(th);
        }
    }

    @Override // z3.d
    /* renamed from: ʾ */
    public z3.d mo10176() {
        x3.c<T> cVar = this.f10632;
        if (cVar instanceof z3.d) {
            return (z3.d) cVar;
        }
        return null;
    }

    @Override // x3.c
    /* renamed from: ˈ */
    public void mo9541(Object obj) {
        x3.e context = this.f10632.getContext();
        Object m10203 = m4.r.m10203(obj, null, 1, null);
        if (this.f10631.m10267(context)) {
            this.f10633 = m10203;
            this.f9330 = 0;
            this.f10631.mo10154(context, this);
            return;
        }
        e0 m10291 = z0.f9398.m10291();
        if (m10291.m10139()) {
            this.f10633 = m10203;
            this.f9330 = 0;
            m10291.m10136(this);
            return;
        }
        m10291.m10138(true);
        try {
            x3.e context2 = getContext();
            Object m11537 = s.m11537(context2, this.f10634);
            try {
                this.f10632.mo9541(obj);
                v3.p pVar = v3.p.f11735;
                while (m10291.m10141()) {
                }
            } finally {
                s.m11535(context2, m11537);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // m4.a0
    /* renamed from: ˉ */
    public Object mo10118() {
        Object obj = this.f10633;
        this.f10633 = g.f10635;
        return obj;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m11484() {
        while (f10630.get(this) == g.f10636) {
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m11485() {
        return f10630.get(this) != null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m11486() {
        m11484();
        m4.h<?> m11483 = m11483();
        if (m11483 != null) {
            m11483.m10179();
        }
    }

    @Override // m4.a0
    /* renamed from: ʼ */
    public x3.c<T> mo10114() {
        return this;
    }
}
