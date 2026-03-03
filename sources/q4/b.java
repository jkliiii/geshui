package q4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Atomic.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b<T> extends l {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f10627 = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f10626;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Object m11477(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10627;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f10626;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.m1740(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q4.l
    /* renamed from: ʻ, reason: contains not printable characters */
    public final Object mo11478(Object obj) {
        Object obj2 = f10627.get(this);
        if (obj2 == a.f10626) {
            obj2 = m11477(mo10264(obj));
        }
        mo11479(obj, obj2);
        return obj2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract void mo11479(T t5, Object obj);

    /* renamed from: ʾ */
    public abstract Object mo10264(T t5);
}
