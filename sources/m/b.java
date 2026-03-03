package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final int[] f9034 = new int[0];

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final Object[] f9035 = new Object[0];

    /* renamed from: ˋ, reason: contains not printable characters */
    private static Object[] f9036;

    /* renamed from: ˎ, reason: contains not printable characters */
    private static int f9037;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static Object[] f9038;

    /* renamed from: ˑ, reason: contains not printable characters */
    private static int f9039;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int[] f9040;

    /* renamed from: ʿ, reason: contains not printable characters */
    Object[] f9041;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f9042;

    /* renamed from: ˈ, reason: contains not printable characters */
    private f<E, E> f9043;

    /* compiled from: ArraySet.java */
    class a extends f<E, E> {
        a() {
        }

        @Override // m.f
        /* renamed from: ʻ */
        protected void mo9768() {
            b.this.clear();
        }

        @Override // m.f
        /* renamed from: ʼ */
        protected Object mo9769(int i5, int i6) {
            return b.this.f9041[i5];
        }

        @Override // m.f
        /* renamed from: ʽ */
        protected Map<E, E> mo9770() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // m.f
        /* renamed from: ʾ */
        protected int mo9771() {
            return b.this.f9042;
        }

        @Override // m.f
        /* renamed from: ʿ */
        protected int mo9772(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // m.f
        /* renamed from: ˆ */
        protected int mo9773(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // m.f
        /* renamed from: ˈ */
        protected void mo9774(E e5, E e6) {
            b.this.add(e5);
        }

        @Override // m.f
        /* renamed from: ˉ */
        protected void mo9775(int i5) {
            b.this.m9783(i5);
        }

        @Override // m.f
        /* renamed from: ˊ */
        protected E mo9776(int i5, E e5) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m9777(int i5) {
        if (i5 == 8) {
            synchronized (b.class) {
                Object[] objArr = f9038;
                if (objArr != null) {
                    this.f9041 = objArr;
                    f9038 = (Object[]) objArr[0];
                    this.f9040 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9039--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f9036;
                if (objArr2 != null) {
                    this.f9041 = objArr2;
                    f9036 = (Object[]) objArr2[0];
                    this.f9040 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9037--;
                    return;
                }
            }
        }
        this.f9040 = new int[i5];
        this.f9041 = new Object[i5];
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m9778(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f9039 < 10) {
                    objArr[0] = f9038;
                    objArr[1] = iArr;
                    for (int i6 = i5 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f9038 = objArr;
                    f9039++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f9037 < 10) {
                    objArr[0] = f9036;
                    objArr[1] = iArr;
                    for (int i7 = i5 - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f9036 = objArr;
                    f9037++;
                }
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private f<E, E> m9779() {
        if (this.f9043 == null) {
            this.f9043 = new a();
        }
        return this.f9043;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m9780(Object obj, int i5) {
        int i6 = this.f9042;
        if (i6 == 0) {
            return -1;
        }
        int m9785 = c.m9785(this.f9040, i6, i5);
        if (m9785 < 0) {
            return m9785;
        }
        if (obj.equals(this.f9041[m9785])) {
            return m9785;
        }
        int i7 = m9785 + 1;
        while (i7 < i6 && this.f9040[i7] == i5) {
            if (obj.equals(this.f9041[i7])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = m9785 - 1; i8 >= 0 && this.f9040[i8] == i5; i8--) {
            if (obj.equals(this.f9041[i8])) {
                return i8;
            }
        }
        return i7 ^ (-1);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private int m9781() {
        int i5 = this.f9042;
        if (i5 == 0) {
            return -1;
        }
        int m9785 = c.m9785(this.f9040, i5, 0);
        if (m9785 < 0) {
            return m9785;
        }
        if (this.f9041[m9785] == null) {
            return m9785;
        }
        int i6 = m9785 + 1;
        while (i6 < i5 && this.f9040[i6] == 0) {
            if (this.f9041[i6] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = m9785 - 1; i7 >= 0 && this.f9040[i7] == 0; i7--) {
            if (this.f9041[i7] == null) {
                return i7;
            }
        }
        return i6 ^ (-1);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e5) {
        int i5;
        int m9780;
        if (e5 == null) {
            m9780 = m9781();
            i5 = 0;
        } else {
            int hashCode = e5.hashCode();
            i5 = hashCode;
            m9780 = m9780(e5, hashCode);
        }
        if (m9780 >= 0) {
            return false;
        }
        int i6 = m9780 ^ (-1);
        int i7 = this.f9042;
        int[] iArr = this.f9040;
        if (i7 >= iArr.length) {
            int i8 = 8;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f9041;
            m9777(i8);
            int[] iArr2 = this.f9040;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9041, 0, objArr.length);
            }
            m9778(iArr, objArr, this.f9042);
        }
        int i9 = this.f9042;
        if (i6 < i9) {
            int[] iArr3 = this.f9040;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.f9041;
            System.arraycopy(objArr2, i6, objArr2, i10, this.f9042 - i6);
        }
        this.f9040[i6] = i5;
        this.f9041[i6] = e5;
        this.f9042++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m9782(this.f9042 + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= add(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i5 = this.f9042;
        if (i5 != 0) {
            m9778(this.f9040, this.f9041, i5);
            this.f9040 = f9034;
            this.f9041 = f9035;
            this.f9042 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f9042; i5++) {
                try {
                    if (!set.contains(m9784(i5))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f9040;
        int i5 = this.f9042;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    public int indexOf(Object obj) {
        return obj == null ? m9781() : m9780(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9042 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m9779().m9816().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m9783(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z5 = false;
        for (int i5 = this.f9042 - 1; i5 >= 0; i5--) {
            if (!collection.contains(this.f9041[i5])) {
                m9783(i5);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f9042;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i5 = this.f9042;
        Object[] objArr = new Object[i5];
        System.arraycopy(this.f9041, 0, objArr, 0, i5);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9042 * 14);
        sb.append('{');
        for (int i5 = 0; i5 < this.f9042; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            E m9784 = m9784(i5);
            if (m9784 != this) {
                sb.append(m9784);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m9782(int i5) {
        int[] iArr = this.f9040;
        if (iArr.length < i5) {
            Object[] objArr = this.f9041;
            m9777(i5);
            int i6 = this.f9042;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.f9040, 0, i6);
                System.arraycopy(objArr, 0, this.f9041, 0, this.f9042);
            }
            m9778(iArr, objArr, this.f9042);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public E m9783(int i5) {
        Object[] objArr = this.f9041;
        E e5 = (E) objArr[i5];
        int i6 = this.f9042;
        if (i6 <= 1) {
            m9778(this.f9040, objArr, i6);
            this.f9040 = f9034;
            this.f9041 = f9035;
            this.f9042 = 0;
        } else {
            int[] iArr = this.f9040;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                int i7 = i6 - 1;
                this.f9042 = i7;
                if (i5 < i7) {
                    int i8 = i5 + 1;
                    System.arraycopy(iArr, i8, iArr, i5, i7 - i5);
                    Object[] objArr2 = this.f9041;
                    System.arraycopy(objArr2, i8, objArr2, i5, this.f9042 - i5);
                }
                this.f9041[this.f9042] = null;
            } else {
                m9777(i6 > 8 ? i6 + (i6 >> 1) : 8);
                this.f9042--;
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.f9040, 0, i5);
                    System.arraycopy(objArr, 0, this.f9041, 0, i5);
                }
                int i9 = this.f9042;
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    System.arraycopy(iArr, i10, this.f9040, i5, i9 - i5);
                    System.arraycopy(objArr, i10, this.f9041, i5, this.f9042 - i5);
                }
            }
        }
        return e5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public E m9784(int i5) {
        return (E) this.f9041[i5];
    }

    public b(int i5) {
        if (i5 == 0) {
            this.f9040 = f9034;
            this.f9041 = f9035;
        } else {
            m9777(i5);
        }
        this.f9042 = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f9042) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f9042));
        }
        System.arraycopy(this.f9041, 0, tArr, 0, this.f9042);
        int length = tArr.length;
        int i5 = this.f9042;
        if (length > i5) {
            tArr[i5] = null;
        }
        return tArr;
    }
}
