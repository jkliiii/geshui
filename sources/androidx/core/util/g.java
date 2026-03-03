package androidx.core.util;

/* compiled from: Pools.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g<T> extends f<T> {

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Object f2847;

    public g(int i5) {
        super(i5);
        this.f2847 = new Object();
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    /* renamed from: ʻ */
    public boolean mo2574(T t5) {
        boolean mo2574;
        synchronized (this.f2847) {
            mo2574 = super.mo2574(t5);
        }
        return mo2574;
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    /* renamed from: ʼ */
    public T mo2575() {
        T t5;
        synchronized (this.f2847) {
            t5 = (T) super.mo2575();
        }
        return t5;
    }
}
