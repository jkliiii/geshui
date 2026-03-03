package v3;

import java.io.Serializable;

/* compiled from: LazyJVM.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class l<T> implements e<T>, Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private e4.a<? extends T> f11731;

    /* renamed from: ʿ, reason: contains not printable characters */
    private volatile Object f11732;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Object f11733;

    public l(e4.a<? extends T> aVar, Object obj) {
        f4.k.m8623(aVar, "initializer");
        this.f11731 = aVar;
        this.f11732 = n.f11734;
        this.f11733 = obj == null ? this : obj;
    }

    @Override // v3.e
    public T getValue() {
        T t5;
        T t6 = (T) this.f11732;
        n nVar = n.f11734;
        if (t6 != nVar) {
            return t6;
        }
        synchronized (this.f11733) {
            t5 = (T) this.f11732;
            if (t5 == nVar) {
                e4.a<? extends T> aVar = this.f11731;
                f4.k.m8620(aVar);
                t5 = aVar.mo368();
                this.f11732 = t5;
                this.f11731 = null;
            }
        }
        return t5;
    }

    public String toString() {
        return m12384() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m12384() {
        return this.f11732 != n.f11734;
    }

    public /* synthetic */ l(e4.a aVar, Object obj, int i5, f4.g gVar) {
        this(aVar, (i5 & 2) != 0 ? null : obj);
    }
}
