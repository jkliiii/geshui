package androidx.core.util;

/* compiled from: Pools.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f<T> implements e<T> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Object[] f2845;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f2846;

    public f(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2845 = new Object[i5];
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m2576(T t5) {
        for (int i5 = 0; i5 < this.f2846; i5++) {
            if (this.f2845[i5] == t5) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.e
    /* renamed from: ʻ */
    public boolean mo2574(T t5) {
        if (m2576(t5)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i5 = this.f2846;
        Object[] objArr = this.f2845;
        if (i5 >= objArr.length) {
            return false;
        }
        objArr[i5] = t5;
        this.f2846 = i5 + 1;
        return true;
    }

    @Override // androidx.core.util.e
    /* renamed from: ʼ */
    public T mo2575() {
        int i5 = this.f2846;
        if (i5 <= 0) {
            return null;
        }
        int i6 = i5 - 1;
        Object[] objArr = this.f2845;
        T t5 = (T) objArr[i6];
        objArr[i6] = null;
        this.f2846 = i5 - 1;
        return t5;
    }
}
