package v2;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* compiled from: ArrayDeque.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b<E> extends AbstractCollection<E> implements Queue, Cloneable, Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private transient Object[] f11691 = new Object[16];

    /* renamed from: ʿ, reason: contains not printable characters */
    private transient int f11692;

    /* renamed from: ˆ, reason: contains not printable characters */
    private transient int f11693;

    /* compiled from: ArrayDeque.java */
    /* renamed from: v2.b$b, reason: collision with other inner class name */
    private class C0167b implements Iterator<E> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f11694;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f11695;

        /* renamed from: ˆ, reason: contains not printable characters */
        private int f11696;

        private C0167b() {
            this.f11694 = b.this.f11692;
            this.f11695 = b.this.f11693;
            this.f11696 = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11694 != this.f11695;
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f11694 == this.f11695) {
                throw new NoSuchElementException();
            }
            E e5 = (E) b.this.f11691[this.f11694];
            if (b.this.f11693 != this.f11695 || e5 == null) {
                throw new ConcurrentModificationException();
            }
            int i5 = this.f11694;
            this.f11696 = i5;
            this.f11694 = (i5 + 1) & (b.this.f11691.length - 1);
            return e5;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i5 = this.f11696;
            if (i5 < 0) {
                throw new IllegalStateException();
            }
            if (b.this.m12323(i5)) {
                this.f11694 = (this.f11694 - 1) & (b.this.f11691.length - 1);
                this.f11695 = b.this.f11693;
            }
            this.f11696 = -1;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private <T> T[] m12322(T[] tArr) {
        int i5 = this.f11692;
        int i6 = this.f11693;
        if (i5 < i6) {
            System.arraycopy(this.f11691, i5, tArr, 0, size());
        } else if (i5 > i6) {
            Object[] objArr = this.f11691;
            int length = objArr.length - i5;
            System.arraycopy(objArr, i5, tArr, 0, length);
            System.arraycopy(this.f11691, 0, tArr, length, this.f11693);
        }
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m12323(int i5) {
        m12321();
        Object[] objArr = this.f11691;
        int length = objArr.length - 1;
        int i6 = this.f11692;
        int i7 = this.f11693;
        int i8 = (i5 - i6) & length;
        int i9 = (i7 - i5) & length;
        if (i8 >= ((i7 - i6) & length)) {
            throw new ConcurrentModificationException();
        }
        if (i8 < i9) {
            if (i6 <= i5) {
                System.arraycopy(objArr, i6, objArr, i6 + 1, i8);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, i5);
                objArr[0] = objArr[length];
                System.arraycopy(objArr, i6, objArr, i6 + 1, length - i6);
            }
            objArr[i6] = null;
            this.f11692 = (i6 + 1) & length;
            return false;
        }
        if (i5 < i7) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, i9);
            this.f11693 = i7 - 1;
        } else {
            System.arraycopy(objArr, i5 + 1, objArr, i5, length - i5);
            objArr[length] = objArr[0];
            System.arraycopy(objArr, 1, objArr, 0, i7);
            this.f11693 = (i7 - 1) & length;
        }
        return true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m12324() {
        int i5 = this.f11692;
        Object[] objArr = this.f11691;
        int length = objArr.length;
        int i6 = length - i5;
        int i7 = length << 1;
        if (i7 < 0) {
            throw new IllegalStateException("Sorry, deque too big");
        }
        Object[] objArr2 = new Object[i7];
        System.arraycopy(objArr, i5, objArr2, 0, i6);
        System.arraycopy(this.f11691, 0, objArr2, i6, i5);
        this.f11691 = objArr2;
        this.f11692 = 0;
        this.f11693 = length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e5) {
        addLast(e5);
        return true;
    }

    public void addFirst(E e5) {
        if (e5 == null) {
            throw new NullPointerException("e == null");
        }
        Object[] objArr = this.f11691;
        int length = (this.f11692 - 1) & (objArr.length - 1);
        this.f11692 = length;
        objArr[length] = e5;
        if (length == this.f11693) {
            m12324();
        }
    }

    public void addLast(E e5) {
        if (e5 == null) {
            throw new NullPointerException("e == null");
        }
        Object[] objArr = this.f11691;
        int i5 = this.f11693;
        objArr[i5] = e5;
        int length = (objArr.length - 1) & (i5 + 1);
        this.f11693 = length;
        if (length == this.f11692) {
            m12324();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int i5 = this.f11692;
        int i6 = this.f11693;
        if (i5 != i6) {
            this.f11693 = 0;
            this.f11692 = 0;
            int length = this.f11691.length - 1;
            do {
                this.f11691[i5] = null;
                i5 = (i5 + 1) & length;
            } while (i5 != i6);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f11691.length - 1;
        int i5 = this.f11692;
        while (true) {
            Object obj2 = this.f11691[i5];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                return true;
            }
            i5 = (i5 + 1) & length;
        }
    }

    @Override // java.util.Queue
    public E element() {
        return getFirst();
    }

    public E getFirst() {
        E e5 = (E) this.f11691[this.f11692];
        if (e5 != null) {
            return e5;
        }
        throw new NoSuchElementException();
    }

    public E getLast() {
        E e5 = (E) this.f11691[(this.f11693 - 1) & (r0.length - 1)];
        if (e5 != null) {
            return e5;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f11692 == this.f11693;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C0167b();
    }

    @Override // java.util.Queue
    public boolean offer(E e5) {
        return offerLast(e5);
    }

    public boolean offerLast(E e5) {
        addLast(e5);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return peekFirst();
    }

    public E peekFirst() {
        return (E) this.f11691[this.f11692];
    }

    public E peekLast() {
        return (E) this.f11691[(this.f11693 - 1) & (r0.length - 1)];
    }

    @Override // java.util.Queue
    public E poll() {
        return pollFirst();
    }

    public E pollFirst() {
        int i5 = this.f11692;
        Object[] objArr = this.f11691;
        E e5 = (E) objArr[i5];
        if (e5 == null) {
            return null;
        }
        objArr[i5] = null;
        this.f11692 = (i5 + 1) & (objArr.length - 1);
        return e5;
    }

    public E pop() {
        return removeFirst();
    }

    public void push(E e5) {
        addFirst(e5);
    }

    @Override // java.util.Queue
    public E remove() {
        return removeFirst();
    }

    public E removeFirst() {
        E pollFirst = pollFirst();
        if (pollFirst != null) {
            return pollFirst;
        }
        throw new NoSuchElementException();
    }

    public boolean removeFirstOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f11691.length - 1;
        int i5 = this.f11692;
        while (true) {
            Object obj2 = this.f11691[i5];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                m12323(i5);
                return true;
            }
            i5 = (i5 + 1) & length;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return (this.f11693 - this.f11692) & (this.f11691.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return m12322(new Object[size()]);
    }

    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public b<E> clone() {
        try {
            b<E> bVar = (b) super.clone();
            Object[] objArr = this.f11691;
            System.arraycopy(objArr, 0, bVar.f11691, 0, objArr.length);
            return bVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return removeFirstOccurrence(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        m12322(tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m12321() {
    }
}
