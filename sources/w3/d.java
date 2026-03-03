package w3;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: Collections.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d<T> implements Collection<T> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final T[] f12045;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean f12046;

    public d(T[] tArr, boolean z5) {
        f4.k.m8623(tArr, "values");
        this.f12045 = tArr;
        this.f12046 = z5;
    }

    @Override // java.util.Collection
    public boolean add(T t5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return j.m12541(this.f12045, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        f4.k.m8623(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f12045.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return f4.b.m8607(this.f12045);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m12512();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        f4.k.m8623(tArr, "array");
        return (T[]) f4.f.m8617(this, tArr);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m12512() {
        return this.f12045.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return m.m12559(this.f12045, this.f12046);
    }
}
