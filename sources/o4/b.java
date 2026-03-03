package o4;

import f4.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v3.p;

/* compiled from: StateFlow.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b<T> extends p4.a<d> implements a<T> {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10124 = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f10125;

    public b(Object obj) {
        this._state = obj;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean m11005(Object obj, Object obj2) {
        int i5;
        d[] m11173;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10124;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !k.m8619(obj3, obj)) {
                return false;
            }
            if (k.m8619(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i6 = this.f10125;
            if ((i6 & 1) != 0) {
                this.f10125 = i6 + 2;
                return true;
            }
            int i7 = i6 + 1;
            this.f10125 = i7;
            d[] m111732 = m11173();
            p pVar = p.f11735;
            while (true) {
                d[] dVarArr = m111732;
                if (dVarArr != null) {
                    for (d dVar : dVarArr) {
                        if (dVar != null) {
                            dVar.m11009();
                        }
                    }
                }
                synchronized (this) {
                    i5 = this.f10125;
                    if (i5 == i7) {
                        this.f10125 = i7 + 1;
                        return true;
                    }
                    m11173 = m11173();
                    p pVar2 = p.f11735;
                }
                m111732 = m11173;
                i7 = i5;
            }
        }
    }

    @Override // o4.a
    public void setValue(T t5) {
        if (t5 == null) {
            t5 = (T) p4.c.f10366;
        }
        m11005(null, t5);
    }
}
