package w3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayDeque.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e<E> extends c<E> {

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final a f12047 = new a(null);

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final Object[] f12048 = new Object[0];

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f12049;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Object[] f12050 = f12048;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f12051;

    /* compiled from: ArrayDeque.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int m12524(int i5, int i6) {
            int i7 = i5 + (i5 >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            return i7 - 2147483639 > 0 ? i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i7;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final void m12516(int i5, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f12050.length;
        while (i5 < length && it.hasNext()) {
            this.f12050[i5] = it.next();
            i5++;
        }
        int i6 = this.f12049;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.f12050[i7] = it.next();
        }
        this.f12051 = size() + collection.size();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private final void m12517(int i5) {
        Object[] objArr = new Object[i5];
        Object[] objArr2 = this.f12050;
        i.m12538(objArr2, objArr, 0, this.f12049, objArr2.length);
        Object[] objArr3 = this.f12050;
        int length = objArr3.length;
        int i6 = this.f12049;
        i.m12538(objArr3, objArr, length - i6, 0, i6);
        this.f12049 = 0;
        this.f12050 = objArr;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int m12518(int i5) {
        return i5 == 0 ? j.m12544(this.f12050) : i5 - 1;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private final void m12519(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f12050;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr == f12048) {
            this.f12050 = new Object[i4.f.m9256(i5, 10)];
        } else {
            m12517(f12047.m12524(objArr.length, i5));
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int m12520(int i5) {
        if (i5 == j.m12544(this.f12050)) {
            return 0;
        }
        return i5 + 1;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int m12521(int i5) {
        return i5 < 0 ? i5 + this.f12050.length : i5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int m12522(int i5) {
        Object[] objArr = this.f12050;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        addLast(e5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        f4.k.m8623(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m12519(size() + collection.size());
        m12516(m12522(this.f12049 + size()), collection);
        return true;
    }

    public final void addFirst(E e5) {
        m12519(size() + 1);
        int m12518 = m12518(this.f12049);
        this.f12049 = m12518;
        this.f12050[m12518] = e5;
        this.f12051 = size() + 1;
    }

    public final void addLast(E e5) {
        m12519(size() + 1);
        this.f12050[m12522(this.f12049 + size())] = e5;
        this.f12051 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m12522 = m12522(this.f12049 + size());
        int i5 = this.f12049;
        if (i5 < m12522) {
            i.m12540(this.f12050, null, i5, m12522);
        } else if (!isEmpty()) {
            Object[] objArr = this.f12050;
            i.m12540(objArr, null, this.f12049, objArr.length);
            i.m12540(this.f12050, null, 0, m12522);
        }
        this.f12049 = 0;
        this.f12051 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        b.f12044.m12504(i5, size());
        return (E) this.f12050[m12522(this.f12049 + i5)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i5;
        int m12522 = m12522(this.f12049 + size());
        int i6 = this.f12049;
        if (i6 < m12522) {
            while (i6 < m12522) {
                if (f4.k.m8619(obj, this.f12050[i6])) {
                    i5 = this.f12049;
                } else {
                    i6++;
                }
            }
            return -1;
        }
        if (i6 < m12522) {
            return -1;
        }
        int length = this.f12050.length;
        while (true) {
            if (i6 >= length) {
                for (int i7 = 0; i7 < m12522; i7++) {
                    if (f4.k.m8619(obj, this.f12050[i7])) {
                        i6 = i7 + this.f12050.length;
                        i5 = this.f12049;
                    }
                }
                return -1;
            }
            if (f4.k.m8619(obj, this.f12050[i6])) {
                i5 = this.f12049;
                break;
            }
            i6++;
        }
        return i6 - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m12544;
        int i5;
        int m12522 = m12522(this.f12049 + size());
        int i6 = this.f12049;
        if (i6 < m12522) {
            m12544 = m12522 - 1;
            if (i6 <= m12544) {
                while (!f4.k.m8619(obj, this.f12050[m12544])) {
                    if (m12544 != i6) {
                        m12544--;
                    }
                }
                i5 = this.f12049;
                return m12544 - i5;
            }
            return -1;
        }
        if (i6 > m12522) {
            int i7 = m12522 - 1;
            while (true) {
                if (-1 >= i7) {
                    m12544 = j.m12544(this.f12050);
                    int i8 = this.f12049;
                    if (i8 <= m12544) {
                        while (!f4.k.m8619(obj, this.f12050[m12544])) {
                            if (m12544 != i8) {
                                m12544--;
                            }
                        }
                        i5 = this.f12049;
                    }
                } else {
                    if (f4.k.m8619(obj, this.f12050[i7])) {
                        m12544 = i7 + this.f12050.length;
                        i5 = this.f12049;
                        break;
                    }
                    i7--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int m12522;
        f4.k.m8623(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty()) {
            if (!(this.f12050.length == 0)) {
                int m125222 = m12522(this.f12049 + size());
                int i5 = this.f12049;
                if (i5 < m125222) {
                    m12522 = i5;
                    while (i5 < m125222) {
                        Object obj = this.f12050[i5];
                        if (!collection.contains(obj)) {
                            this.f12050[m12522] = obj;
                            m12522++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    i.m12540(this.f12050, null, m12522, m125222);
                } else {
                    int length = this.f12050.length;
                    int i6 = i5;
                    boolean z6 = false;
                    while (i5 < length) {
                        Object[] objArr = this.f12050;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (!collection.contains(obj2)) {
                            this.f12050[i6] = obj2;
                            i6++;
                        } else {
                            z6 = true;
                        }
                        i5++;
                    }
                    m12522 = m12522(i6);
                    for (int i7 = 0; i7 < m125222; i7++) {
                        Object[] objArr2 = this.f12050;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (!collection.contains(obj3)) {
                            this.f12050[m12522] = obj3;
                            m12522 = m12520(m12522);
                        } else {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                if (z5) {
                    this.f12051 = m12521(m12522 - this.f12049);
                }
            }
        }
        return z5;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f12050;
        int i5 = this.f12049;
        E e5 = (E) objArr[i5];
        objArr[i5] = null;
        this.f12049 = m12520(i5);
        this.f12051 = size() - 1;
        return e5;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int m12522 = m12522(this.f12049 + n.m12563(this));
        Object[] objArr = this.f12050;
        E e5 = (E) objArr[m12522];
        objArr[m12522] = null;
        this.f12051 = size() - 1;
        return e5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int m12522;
        f4.k.m8623(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty()) {
            if (!(this.f12050.length == 0)) {
                int m125222 = m12522(this.f12049 + size());
                int i5 = this.f12049;
                if (i5 < m125222) {
                    m12522 = i5;
                    while (i5 < m125222) {
                        Object obj = this.f12050[i5];
                        if (collection.contains(obj)) {
                            this.f12050[m12522] = obj;
                            m12522++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    i.m12540(this.f12050, null, m12522, m125222);
                } else {
                    int length = this.f12050.length;
                    int i6 = i5;
                    boolean z6 = false;
                    while (i5 < length) {
                        Object[] objArr = this.f12050;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (collection.contains(obj2)) {
                            this.f12050[i6] = obj2;
                            i6++;
                        } else {
                            z6 = true;
                        }
                        i5++;
                    }
                    m12522 = m12522(i6);
                    for (int i7 = 0; i7 < m125222; i7++) {
                        Object[] objArr2 = this.f12050;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (collection.contains(obj3)) {
                            this.f12050[m12522] = obj3;
                            m12522 = m12520(m12522);
                        } else {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                if (z5) {
                    this.f12051 = m12521(m12522 - this.f12049);
                }
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i5, E e5) {
        b.f12044.m12504(i5, size());
        int m12522 = m12522(this.f12049 + i5);
        Object[] objArr = this.f12050;
        E e6 = (E) objArr[m12522];
        objArr[m12522] = e5;
        return e6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        f4.k.m8623(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) g.m12536(tArr, size());
        }
        int m12522 = m12522(this.f12049 + size());
        int i5 = this.f12049;
        if (i5 < m12522) {
            i.m12539(this.f12050, tArr, 0, i5, m12522, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f12050;
            i.m12538(objArr, tArr, 0, this.f12049, objArr.length);
            Object[] objArr2 = this.f12050;
            i.m12538(objArr2, tArr, objArr2.length - this.f12049, 0, m12522);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    @Override // w3.c
    /* renamed from: ʻ */
    public int mo12510() {
        return this.f12051;
    }

    @Override // w3.c
    /* renamed from: ʼ */
    public E mo12511(int i5) {
        b.f12044.m12504(i5, size());
        if (i5 == n.m12563(this)) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        int m12522 = m12522(this.f12049 + i5);
        E e5 = (E) this.f12050[m12522];
        if (i5 < (size() >> 1)) {
            int i6 = this.f12049;
            if (m12522 >= i6) {
                Object[] objArr = this.f12050;
                i.m12538(objArr, objArr, i6 + 1, i6, m12522);
            } else {
                Object[] objArr2 = this.f12050;
                i.m12538(objArr2, objArr2, 1, 0, m12522);
                Object[] objArr3 = this.f12050;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i7 = this.f12049;
                i.m12538(objArr3, objArr3, i7 + 1, i7, objArr3.length - 1);
            }
            Object[] objArr4 = this.f12050;
            int i8 = this.f12049;
            objArr4[i8] = null;
            this.f12049 = m12520(i8);
        } else {
            int m125222 = m12522(this.f12049 + n.m12563(this));
            if (m12522 <= m125222) {
                Object[] objArr5 = this.f12050;
                i.m12538(objArr5, objArr5, m12522, m12522 + 1, m125222 + 1);
            } else {
                Object[] objArr6 = this.f12050;
                i.m12538(objArr6, objArr6, m12522, m12522 + 1, objArr6.length);
                Object[] objArr7 = this.f12050;
                objArr7[objArr7.length - 1] = objArr7[0];
                i.m12538(objArr7, objArr7, 0, 1, m125222 + 1);
            }
            this.f12050[m125222] = null;
        }
        this.f12051 = size() - 1;
        return e5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final E m12523() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i5, E e5) {
        b.f12044.m12505(i5, size());
        if (i5 == size()) {
            addLast(e5);
            return;
        }
        if (i5 == 0) {
            addFirst(e5);
            return;
        }
        m12519(size() + 1);
        int m12522 = m12522(this.f12049 + i5);
        if (i5 < ((size() + 1) >> 1)) {
            int m12518 = m12518(m12522);
            int m125182 = m12518(this.f12049);
            int i6 = this.f12049;
            if (m12518 >= i6) {
                Object[] objArr = this.f12050;
                objArr[m125182] = objArr[i6];
                i.m12538(objArr, objArr, i6, i6 + 1, m12518 + 1);
            } else {
                Object[] objArr2 = this.f12050;
                i.m12538(objArr2, objArr2, i6 - 1, i6, objArr2.length);
                Object[] objArr3 = this.f12050;
                objArr3[objArr3.length - 1] = objArr3[0];
                i.m12538(objArr3, objArr3, 0, 1, m12518 + 1);
            }
            this.f12050[m12518] = e5;
            this.f12049 = m125182;
        } else {
            int m125222 = m12522(this.f12049 + size());
            if (m12522 < m125222) {
                Object[] objArr4 = this.f12050;
                i.m12538(objArr4, objArr4, m12522 + 1, m12522, m125222);
            } else {
                Object[] objArr5 = this.f12050;
                i.m12538(objArr5, objArr5, 1, 0, m125222);
                Object[] objArr6 = this.f12050;
                objArr6[0] = objArr6[objArr6.length - 1];
                i.m12538(objArr6, objArr6, m12522 + 1, m12522, objArr6.length - 1);
            }
            this.f12050[m12522] = e5;
        }
        this.f12051 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i5, Collection<? extends E> collection) {
        f4.k.m8623(collection, "elements");
        b.f12044.m12505(i5, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i5 == size()) {
            return addAll(collection);
        }
        m12519(size() + collection.size());
        int m12522 = m12522(this.f12049 + size());
        int m125222 = m12522(this.f12049 + i5);
        int size = collection.size();
        if (i5 < ((size() + 1) >> 1)) {
            int i6 = this.f12049;
            int i7 = i6 - size;
            if (m125222 < i6) {
                Object[] objArr = this.f12050;
                i.m12538(objArr, objArr, i7, i6, objArr.length);
                if (size >= m125222) {
                    Object[] objArr2 = this.f12050;
                    i.m12538(objArr2, objArr2, objArr2.length - size, 0, m125222);
                } else {
                    Object[] objArr3 = this.f12050;
                    i.m12538(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f12050;
                    i.m12538(objArr4, objArr4, 0, size, m125222);
                }
            } else if (i7 >= 0) {
                Object[] objArr5 = this.f12050;
                i.m12538(objArr5, objArr5, i7, i6, m125222);
            } else {
                Object[] objArr6 = this.f12050;
                i7 += objArr6.length;
                int i8 = m125222 - i6;
                int length = objArr6.length - i7;
                if (length >= i8) {
                    i.m12538(objArr6, objArr6, i7, i6, m125222);
                } else {
                    i.m12538(objArr6, objArr6, i7, i6, i6 + length);
                    Object[] objArr7 = this.f12050;
                    i.m12538(objArr7, objArr7, 0, this.f12049 + length, m125222);
                }
            }
            this.f12049 = i7;
            m12516(m12521(m125222 - size), collection);
        } else {
            int i9 = m125222 + size;
            if (m125222 < m12522) {
                int i10 = size + m12522;
                Object[] objArr8 = this.f12050;
                if (i10 <= objArr8.length) {
                    i.m12538(objArr8, objArr8, i9, m125222, m12522);
                } else if (i9 >= objArr8.length) {
                    i.m12538(objArr8, objArr8, i9 - objArr8.length, m125222, m12522);
                } else {
                    int length2 = m12522 - (i10 - objArr8.length);
                    i.m12538(objArr8, objArr8, 0, length2, m12522);
                    Object[] objArr9 = this.f12050;
                    i.m12538(objArr9, objArr9, i9, m125222, length2);
                }
            } else {
                Object[] objArr10 = this.f12050;
                i.m12538(objArr10, objArr10, size, 0, m12522);
                Object[] objArr11 = this.f12050;
                if (i9 >= objArr11.length) {
                    i.m12538(objArr11, objArr11, i9 - objArr11.length, m125222, objArr11.length);
                } else {
                    i.m12538(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f12050;
                    i.m12538(objArr12, objArr12, i9, m125222, objArr12.length - size);
                }
            }
            m12516(m125222, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
