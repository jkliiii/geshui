package n;

/* compiled from: Pools.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g<T> implements f<T> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Object[] f9448;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f9449;

    g(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f9448 = new Object[i5];
    }

    @Override // n.f
    /* renamed from: ʻ */
    public boolean mo10372(T t5) {
        int i5 = this.f9449;
        Object[] objArr = this.f9448;
        if (i5 >= objArr.length) {
            return false;
        }
        objArr[i5] = t5;
        this.f9449 = i5 + 1;
        return true;
    }

    @Override // n.f
    /* renamed from: ʼ */
    public T mo10373() {
        int i5 = this.f9449;
        if (i5 <= 0) {
            return null;
        }
        int i6 = i5 - 1;
        Object[] objArr = this.f9448;
        T t5 = (T) objArr[i6];
        objArr[i6] = null;
        this.f9449 = i5 - 1;
        return t5;
    }

    @Override // n.f
    /* renamed from: ʽ */
    public void mo10374(T[] tArr, int i5) {
        if (i5 > tArr.length) {
            i5 = tArr.length;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            T t5 = tArr[i6];
            int i7 = this.f9449;
            Object[] objArr = this.f9448;
            if (i7 < objArr.length) {
                objArr[i7] = t5;
                this.f9449 = i7 + 1;
            }
        }
    }
}
