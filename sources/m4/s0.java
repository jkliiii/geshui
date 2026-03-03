package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.o0;
import q4.j;
import x3.e;

/* compiled from: JobSupport.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s0 implements o0, l, x0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f9371 = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_state");

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f9372 = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    private static final class a extends r0 {

        /* renamed from: ˉ, reason: contains not printable characters */
        private final s0 f9373;

        /* renamed from: ˊ, reason: contains not printable characters */
        private final b f9374;

        /* renamed from: ˋ, reason: contains not printable characters */
        private final k f9375;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final Object f9376;

        public a(s0 s0Var, b bVar, k kVar, Object obj) {
            this.f9373 = s0Var;
            this.f9374 = bVar;
            this.f9375 = kVar;
            this.f9376 = obj;
        }

        @Override // e4.l
        /* renamed from: ˉ */
        public /* bridge */ /* synthetic */ v3.p mo430(Throwable th) {
            mo10187(th);
            return v3.p.f11735;
        }

        @Override // m4.p
        /* renamed from: ﹳ */
        public void mo10187(Throwable th) {
            this.f9373.m10236(this.f9374, this.f9375, this.f9376);
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class b implements k0 {

        /* renamed from: ʿ, reason: contains not printable characters */
        private static final AtomicIntegerFieldUpdater f9377 = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting");

        /* renamed from: ˆ, reason: contains not printable characters */
        private static final AtomicReferenceFieldUpdater f9378 = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause");

        /* renamed from: ˈ, reason: contains not printable characters */
        private static final AtomicReferenceFieldUpdater f9379 = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final u0 f9380;

        public b(u0 u0Var, boolean z5, Throwable th) {
            this.f9380 = u0Var;
            this._isCompleting = z5 ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private final ArrayList<Throwable> m10253() {
            return new ArrayList<>(4);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Object m10254() {
            return f9379.get(this);
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        private final void m10255(Object obj) {
            f9379.set(this, obj);
        }

        public String toString() {
            return "Finishing[cancelling=" + m10258() + ", completing=" + m10259() + ", rootCause=" + m10257() + ", exceptions=" + m10254() + ", list=" + mo10132() + ']';
        }

        @Override // m4.k0
        /* renamed from: ʻ */
        public boolean mo10131() {
            return m10257() == null;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final void m10256(Throwable th) {
            Throwable m10257 = m10257();
            if (m10257 == null) {
                m10263(th);
                return;
            }
            if (th == m10257) {
                return;
            }
            Object m10254 = m10254();
            if (m10254 == null) {
                m10255(th);
                return;
            }
            if (m10254 instanceof Throwable) {
                if (th == m10254) {
                    return;
                }
                ArrayList<Throwable> m10253 = m10253();
                m10253.add(m10254);
                m10253.add(th);
                m10255(m10253);
                return;
            }
            if (m10254 instanceof ArrayList) {
                ((ArrayList) m10254).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + m10254).toString());
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public final Throwable m10257() {
            return (Throwable) f9378.get(this);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public final boolean m10258() {
            return m10257() != null;
        }

        @Override // m4.k0
        /* renamed from: ˈ */
        public u0 mo10132() {
            return this.f9380;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public final boolean m10259() {
            return f9377.get(this) != 0;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final boolean m10260() {
            return m10254() == t0.f9389;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final List<Throwable> m10261(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object m10254 = m10254();
            if (m10254 == null) {
                arrayList = m10253();
            } else if (m10254 instanceof Throwable) {
                ArrayList<Throwable> m10253 = m10253();
                m10253.add(m10254);
                arrayList = m10253;
            } else {
                if (!(m10254 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + m10254).toString());
                }
                arrayList = (ArrayList) m10254;
            }
            Throwable m10257 = m10257();
            if (m10257 != null) {
                arrayList.add(0, m10257);
            }
            if (th != null && !f4.k.m8619(th, m10257)) {
                arrayList.add(th);
            }
            m10255(t0.f9389);
            return arrayList;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final void m10262(boolean z5) {
            f9377.set(this, z5 ? 1 : 0);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public final void m10263(Throwable th) {
            f9378.set(this, th);
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class c extends j.a {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ s0 f9381;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Object f9382;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q4.j jVar, s0 s0Var, Object obj) {
            super(jVar);
            this.f9381 = s0Var;
            this.f9382 = obj;
        }

        @Override // q4.b
        /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Object mo10264(q4.j jVar) {
            if (this.f9381.m10246() == this.f9382) {
                return null;
            }
            return q4.i.m11491();
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private final k m10209(k0 k0Var) {
        k kVar = k0Var instanceof k ? (k) k0Var : null;
        if (kVar != null) {
            return kVar;
        }
        u0 mo10132 = k0Var.mo10132();
        if (mo10132 != null) {
            return m10221(mo10132);
        }
        return null;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private final String m10210(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof k0 ? ((k0) obj).mo10131() ? "Active" : "New" : obj instanceof n ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.m10258() ? "Cancelling" : bVar.m10259() ? "Completing" : "Active";
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    public static /* synthetic */ CancellationException m10211(s0 s0Var, Throwable th, String str, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i5 & 1) != 0) {
            str = null;
        }
        return s0Var.m10239(th, str);
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private final boolean m10212(k0 k0Var, Object obj) {
        if (!androidx.concurrent.futures.b.m1740(f9371, this, k0Var, t0.m10275(obj))) {
            return false;
        }
        m10251(null);
        mo10112(obj);
        m10235(k0Var, obj);
        return true;
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    private final boolean m10213(k0 k0Var, Throwable th) {
        u0 m10223 = m10223(k0Var);
        if (m10223 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.m1740(f9371, this, k0Var, new b(m10223, false, th))) {
            return false;
        }
        m10230(m10223, th);
        return true;
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private final Object m10214(Object obj, Object obj2) {
        return !(obj instanceof k0) ? t0.f9385 : ((!(obj instanceof d0) && !(obj instanceof r0)) || (obj instanceof k) || (obj2 instanceof n)) ? m10215((k0) obj, obj2) : m10212((k0) obj, obj2) ? obj2 : t0.f9387;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: ʻˎ, reason: contains not printable characters */
    private final Object m10215(k0 k0Var, Object obj) {
        u0 m10223 = m10223(k0Var);
        if (m10223 == null) {
            return t0.f9387;
        }
        b bVar = k0Var instanceof b ? (b) k0Var : null;
        if (bVar == null) {
            bVar = new b(m10223, false, null);
        }
        f4.q qVar = new f4.q();
        synchronized (bVar) {
            if (bVar.m10259()) {
                return t0.f9385;
            }
            bVar.m10262(true);
            if (bVar != k0Var && !androidx.concurrent.futures.b.m1740(f9371, this, k0Var, bVar)) {
                return t0.f9387;
            }
            boolean m10258 = bVar.m10258();
            n nVar = obj instanceof n ? (n) obj : null;
            if (nVar != null) {
                bVar.m10256(nVar.f9363);
            }
            ?? m10257 = Boolean.valueOf(m10258 ? false : true).booleanValue() ? bVar.m10257() : 0;
            qVar.f7799 = m10257;
            v3.p pVar = v3.p.f11735;
            if (m10257 != 0) {
                m10230(m10223, m10257);
            }
            k m10209 = m10209(k0Var);
            return (m10209 == null || !m10216(bVar, m10209, obj)) ? m10229(bVar, obj) : t0.f9386;
        }
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private final boolean m10216(b bVar, k kVar, Object obj) {
        while (o0.a.m10199(kVar.f9353, false, false, new a(this, bVar, kVar, obj), 1, null) == v0.f9394) {
            kVar = m10221(kVar);
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private final Throwable m10217(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.m10258()) {
                return new p0(mo10111(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private final Throwable m10218(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null) {
            return nVar.f9363;
        }
        return null;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private final Object m10219(Object obj) {
        Throwable th = null;
        while (true) {
            Object m10246 = m10246();
            if (m10246 instanceof b) {
                synchronized (m10246) {
                    if (((b) m10246).m10260()) {
                        return t0.f9388;
                    }
                    boolean m10258 = ((b) m10246).m10258();
                    if (obj != null || !m10258) {
                        if (th == null) {
                            th = m10227(obj);
                        }
                        ((b) m10246).m10256(th);
                    }
                    Throwable m10257 = m10258 ^ true ? ((b) m10246).m10257() : null;
                    if (m10257 != null) {
                        m10230(((b) m10246).mo10132(), m10257);
                    }
                    return t0.f9385;
                }
            }
            if (!(m10246 instanceof k0)) {
                return t0.f9388;
            }
            if (th == null) {
                th = m10227(obj);
            }
            k0 k0Var = (k0) m10246;
            if (!k0Var.mo10131()) {
                Object m10214 = m10214(m10246, new n(th, false, 2, null));
                if (m10214 == t0.f9385) {
                    throw new IllegalStateException(("Cannot happen in " + m10246).toString());
                }
                if (m10214 != t0.f9387) {
                    return m10214;
                }
            } else if (m10213(k0Var, th)) {
                return t0.f9385;
            }
        }
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private final r0 m10220(e4.l<? super Throwable, v3.p> lVar, boolean z5) {
        r0 r0Var;
        if (z5) {
            r0Var = lVar instanceof q0 ? (q0) lVar : null;
            if (r0Var == null) {
                r0Var = new m0(lVar);
            }
        } else {
            r0Var = lVar instanceof r0 ? (r0) lVar : null;
            if (r0Var == null) {
                r0Var = new n0(lVar);
            }
        }
        r0Var.m10205(this);
        return r0Var;
    }

    /* renamed from: יי, reason: contains not printable characters */
    private final k m10221(q4.j jVar) {
        while (jVar.mo11490()) {
            jVar = jVar.m11502();
        }
        while (true) {
            jVar = jVar.m11501();
            if (!jVar.mo11490()) {
                if (jVar instanceof k) {
                    return (k) jVar;
                }
                if (jVar instanceof u0) {
                    return null;
                }
            }
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private final u0 m10223(k0 k0Var) {
        u0 mo10132 = k0Var.mo10132();
        if (mo10132 != null) {
            return mo10132;
        }
        if (k0Var instanceof d0) {
            return new u0();
        }
        if (k0Var instanceof r0) {
            m10234((r0) k0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + k0Var).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [m4.j0] */
    /* renamed from: ٴٴ, reason: contains not printable characters */
    private final void m10225(d0 d0Var) {
        u0 u0Var = new u0();
        if (!d0Var.mo10131()) {
            u0Var = new j0(u0Var);
        }
        androidx.concurrent.futures.b.m1740(f9371, this, d0Var, u0Var);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final boolean m10226(Object obj, u0 u0Var, r0 r0Var) {
        int m11505;
        c cVar = new c(r0Var, this, obj);
        do {
            m11505 = u0Var.m11502().m11505(r0Var, u0Var, cVar);
            if (m11505 == 1) {
                return true;
            }
        } while (m11505 != 2);
        return false;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private final Throwable m10227(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new p0(mo10111(), null, this) : th;
        }
        f4.k.m8621(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((x0) obj).mo10245();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final void m10228(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                v3.b.m12373(th, th2);
            }
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final Object m10229(b bVar, Object obj) {
        boolean m10258;
        Throwable m10217;
        n nVar = obj instanceof n ? (n) obj : null;
        Throwable th = nVar != null ? nVar.f9363 : null;
        synchronized (bVar) {
            m10258 = bVar.m10258();
            List<Throwable> m10261 = bVar.m10261(th);
            m10217 = m10217(bVar, m10261);
            if (m10217 != null) {
                m10228(m10217, m10261);
            }
        }
        if (m10217 != null && m10217 != th) {
            obj = new n(m10217, false, 2, null);
        }
        if (m10217 != null) {
            if (m10233(m10217) || m10244(m10217)) {
                f4.k.m8621(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((n) obj).m10194();
            }
        }
        if (!m10258) {
            m10251(m10217);
        }
        mo10112(obj);
        androidx.concurrent.futures.b.m1740(f9371, this, bVar, t0.m10275(obj));
        m10235(bVar, obj);
        return obj;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private final void m10230(u0 u0Var, Throwable th) {
        m10251(th);
        Object m11500 = u0Var.m11500();
        f4.k.m8621(m11500, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        q qVar = null;
        for (q4.j jVar = (q4.j) m11500; !f4.k.m8619(jVar, u0Var); jVar = jVar.m11501()) {
            if (jVar instanceof q0) {
                r0 r0Var = (r0) jVar;
                try {
                    r0Var.mo10187(th);
                } catch (Throwable th2) {
                    if (qVar != null) {
                        v3.b.m12373(qVar, th2);
                    } else {
                        qVar = new q("Exception in completion handler " + r0Var + " for " + this, th2);
                        v3.p pVar = v3.p.f11735;
                    }
                }
            }
        }
        if (qVar != null) {
            mo10109(qVar);
        }
        m10233(th);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private final Object m10231(Object obj) {
        Object m10214;
        do {
            Object m10246 = m10246();
            if (!(m10246 instanceof k0) || ((m10246 instanceof b) && ((b) m10246).m10259())) {
                return t0.f9385;
            }
            m10214 = m10214(m10246, new n(m10227(obj), false, 2, null));
        } while (m10214 == t0.f9387);
        return m10214;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private final void m10232(u0 u0Var, Throwable th) {
        Object m11500 = u0Var.m11500();
        f4.k.m8621(m11500, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        q qVar = null;
        for (q4.j jVar = (q4.j) m11500; !f4.k.m8619(jVar, u0Var); jVar = jVar.m11501()) {
            if (jVar instanceof r0) {
                r0 r0Var = (r0) jVar;
                try {
                    r0Var.mo10187(th);
                } catch (Throwable th2) {
                    if (qVar != null) {
                        v3.b.m12373(qVar, th2);
                    } else {
                        qVar = new q("Exception in completion handler " + r0Var + " for " + this, th2);
                        v3.p pVar = v3.p.f11735;
                    }
                }
            }
        }
        if (qVar != null) {
            mo10109(qVar);
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final boolean m10233(Throwable th) {
        if (mo10247()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        j m10243 = m10243();
        return (m10243 == null || m10243 == v0.f9394) ? z5 : m10243.mo10186(th) || z5;
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private final void m10234(r0 r0Var) {
        r0Var.m11499(new u0());
        androidx.concurrent.futures.b.m1740(f9371, this, r0Var, r0Var.m11501());
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private final void m10235(k0 k0Var, Object obj) {
        j m10243 = m10243();
        if (m10243 != null) {
            m10243.mo10129();
            m10238(v0.f9394);
        }
        n nVar = obj instanceof n ? (n) obj : null;
        Throwable th = nVar != null ? nVar.f9363 : null;
        if (!(k0Var instanceof r0)) {
            u0 mo10132 = k0Var.mo10132();
            if (mo10132 != null) {
                m10232(mo10132, th);
                return;
            }
            return;
        }
        try {
            ((r0) k0Var).mo10187(th);
        } catch (Throwable th2) {
            mo10109(new q("Exception in completion handler " + k0Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final void m10236(b bVar, k kVar, Object obj) {
        k m10221 = m10221(kVar);
        if (m10221 == null || !m10216(bVar, m10221, obj)) {
            mo10249(m10229(bVar, obj));
        }
    }

    @Override // x3.e.a
    public final e.b<?> getKey() {
        return o0.f9367;
    }

    public String toString() {
        return m10240() + '@' + x.m10280(this);
    }

    @Override // m4.o0
    /* renamed from: ʻ */
    public boolean mo10105() {
        Object m10246 = m10246();
        return (m10246 instanceof k0) && ((k0) m10246).mo10131();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m10237(r0 r0Var) {
        Object m10246;
        do {
            m10246 = m10246();
            if (!(m10246 instanceof r0)) {
                if (!(m10246 instanceof k0) || ((k0) m10246).mo10132() == null) {
                    return;
                }
                r0Var.m11503();
                return;
            }
            if (m10246 != r0Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.m1740(f9371, this, m10246, t0.f9391));
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m10238(j jVar) {
        f9372.set(this, jVar);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    protected final CancellationException m10239(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo10111();
            }
            cancellationException = new p0(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    public final String m10240() {
        return mo10110() + '{' + m10210(m10246()) + '}';
    }

    @Override // m4.l
    /* renamed from: ʽ */
    public final void mo10188(x0 x0Var) {
        m10250(x0Var);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public boolean m10241() {
        return false;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public boolean m10242() {
        return true;
    }

    @Override // x3.e
    /* renamed from: ˆ */
    public <E extends e.a> E mo10126(e.b<E> bVar) {
        return (E) o0.a.m10198(this, bVar);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public final j m10243() {
        return (j) f9372.get(this);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    protected boolean m10244(Throwable th) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // m4.x0
    /* renamed from: ˉ, reason: contains not printable characters */
    public CancellationException mo10245() {
        CancellationException cancellationException;
        Object m10246 = m10246();
        if (m10246 instanceof b) {
            cancellationException = ((b) m10246).m10257();
        } else if (m10246 instanceof n) {
            cancellationException = ((n) m10246).f9363;
        } else {
            if (m10246 instanceof k0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + m10246).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new p0("Parent job is " + m10210(m10246), cancellationException, this);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public final Object m10246() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9371;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q4.l)) {
                return obj;
            }
            ((q4.l) obj).mo11478(this);
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    protected boolean mo10247() {
        return false;
    }

    @Override // m4.o0
    /* renamed from: ˋ */
    public final CancellationException mo10195() {
        Object m10246 = m10246();
        if (!(m10246 instanceof b)) {
            if (m10246 instanceof k0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (m10246 instanceof n) {
                return m10211(this, ((n) m10246).f9363, null, 1, null);
            }
            return new p0(x.m10279(this) + " has completed normally", null, this);
        }
        Throwable m10257 = ((b) m10246).m10257();
        if (m10257 != null) {
            CancellationException m10239 = m10239(m10257, x.m10279(this) + " is cancelling");
            if (m10239 != null) {
                return m10239;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // x3.e
    /* renamed from: ˎ */
    public <R> R mo10127(R r5, e4.p<? super R, ? super e.a, ? extends R> pVar) {
        return (R) o0.a.m10197(this, r5, pVar);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public final Object m10248(Object obj) {
        Object m10214;
        do {
            m10214 = m10214(m10246(), obj);
            if (m10214 == t0.f9385) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m10218(obj));
            }
        } while (m10214 == t0.f9387);
        return m10214;
    }

    @Override // m4.o0
    /* renamed from: ˑ */
    public final c0 mo10196(boolean z5, boolean z6, e4.l<? super Throwable, v3.p> lVar) {
        r0 m10220 = m10220(lVar, z5);
        while (true) {
            Object m10246 = m10246();
            if (m10246 instanceof d0) {
                d0 d0Var = (d0) m10246;
                if (!d0Var.mo10131()) {
                    m10225(d0Var);
                } else if (androidx.concurrent.futures.b.m1740(f9371, this, m10246, m10220)) {
                    return m10220;
                }
            } else {
                if (!(m10246 instanceof k0)) {
                    if (z6) {
                        n nVar = m10246 instanceof n ? (n) m10246 : null;
                        lVar.mo430(nVar != null ? nVar.f9363 : null);
                    }
                    return v0.f9394;
                }
                u0 mo10132 = ((k0) m10246).mo10132();
                if (mo10132 == null) {
                    f4.k.m8621(m10246, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m10234((r0) m10246);
                } else {
                    c0 c0Var = v0.f9394;
                    if (z5 && (m10246 instanceof b)) {
                        synchronized (m10246) {
                            r3 = ((b) m10246).m10257();
                            if (r3 == null || ((lVar instanceof k) && !((b) m10246).m10259())) {
                                if (m10226(m10246, mo10132, m10220)) {
                                    if (r3 == null) {
                                        return m10220;
                                    }
                                    c0Var = m10220;
                                }
                            }
                            v3.p pVar = v3.p.f11735;
                        }
                    } else {
                        if (r3 != null) {
                            if (z6) {
                                lVar.mo430(r3);
                            }
                            return c0Var;
                        }
                        if (m10226(m10246, mo10132, m10220)) {
                            return m10220;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean m10250(Object obj) {
        Object obj2 = t0.f9385;
        if (m10241() && (obj2 = m10231(obj)) == t0.f9386) {
            return true;
        }
        if (obj2 == t0.f9385) {
            obj2 = m10219(obj);
        }
        if (obj2 == t0.f9385 || obj2 == t0.f9386) {
            return true;
        }
        if (obj2 == t0.f9388) {
            return false;
        }
        mo10249(obj2);
        return true;
    }

    /* renamed from: ᵔᵔ */
    public String mo10110() {
        return x.m10279(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ﹳ */
    public String mo10111() {
        return "Job was cancelled";
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public boolean m10252(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m10250(th) && m10242();
    }

    /* renamed from: ˋˋ */
    public void mo10109(Throwable th) {
        throw th;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    protected void mo10249(Object obj) {
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    protected void m10251(Throwable th) {
    }

    /* renamed from: ﹳﹳ */
    protected void mo10112(Object obj) {
    }
}
