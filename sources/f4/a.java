package f4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a<T> implements Iterator<T> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final T[] f7775;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f7776;

    public a(T[] tArr) {
        k.m8623(tArr, "array");
        this.f7775 = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7776 < this.f7775.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f7775;
            int i5 = this.f7776;
            this.f7776 = i5 + 1;
            return tArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f7776--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
