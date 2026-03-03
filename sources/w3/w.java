package w3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: Collections.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class w implements ListIterator {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final w f12052 = new w();

    private w() {
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void previous() {
        throw new NoSuchElementException();
    }
}
