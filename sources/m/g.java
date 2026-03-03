package m;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g<K, V> {

    /* renamed from: ˈ, reason: contains not printable characters */
    static Object[] f9076;

    /* renamed from: ˉ, reason: contains not printable characters */
    static int f9077;

    /* renamed from: ˊ, reason: contains not printable characters */
    static Object[] f9078;

    /* renamed from: ˋ, reason: contains not printable characters */
    static int f9079;

    /* renamed from: ʾ, reason: contains not printable characters */
    int[] f9080;

    /* renamed from: ʿ, reason: contains not printable characters */
    Object[] f9081;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f9082;

    public g() {
        this.f9080 = c.f9045;
        this.f9081 = c.f9047;
        this.f9082 = 0;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m9822(int i5) {
        if (i5 == 8) {
            synchronized (g.class) {
                Object[] objArr = f9078;
                if (objArr != null) {
                    this.f9081 = objArr;
                    f9078 = (Object[]) objArr[0];
                    this.f9080 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9079--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f9076;
                if (objArr2 != null) {
                    this.f9081 = objArr2;
                    f9076 = (Object[]) objArr2[0];
                    this.f9080 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9077--;
                    return;
                }
            }
        }
        this.f9080 = new int[i5];
        this.f9081 = new Object[i5 << 1];
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m9823(int[] iArr, int i5, int i6) {
        try {
            return c.m9785(iArr, i5, i6);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m9824(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f9079 < 10) {
                    objArr[0] = f9078;
                    objArr[1] = iArr;
                    for (int i6 = (i5 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f9078 = objArr;
                    f9079++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                if (f9077 < 10) {
                    objArr[0] = f9076;
                    objArr[1] = iArr;
                    for (int i7 = (i5 << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f9076 = objArr;
                    f9077++;
                }
            }
        }
    }

    public void clear() {
        int i5 = this.f9082;
        if (i5 > 0) {
            int[] iArr = this.f9080;
            Object[] objArr = this.f9081;
            this.f9080 = c.f9045;
            this.f9081 = c.f9047;
            this.f9082 = 0;
            m9824(iArr, objArr, i5);
        }
        if (this.f9082 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m9827(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m9829(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f9082; i5++) {
                try {
                    K m9830 = m9830(i5);
                    V m9834 = m9834(i5);
                    Object obj2 = gVar.get(m9830);
                    if (m9834 == null) {
                        if (obj2 != null || !gVar.containsKey(m9830)) {
                            return false;
                        }
                    } else if (!m9834.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f9082; i6++) {
                try {
                    K m98302 = m9830(i6);
                    V m98342 = m9834(i6);
                    Object obj3 = map.get(m98302);
                    if (m98342 == null) {
                        if (obj3 != null || !map.containsKey(m98302)) {
                            return false;
                        }
                    } else if (!m98342.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v5) {
        int m9827 = m9827(obj);
        return m9827 >= 0 ? (V) this.f9081[(m9827 << 1) + 1] : v5;
    }

    public int hashCode() {
        int[] iArr = this.f9080;
        Object[] objArr = this.f9081;
        int i5 = this.f9082;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            i8 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return i8;
    }

    public boolean isEmpty() {
        return this.f9082 <= 0;
    }

    public V put(K k5, V v5) {
        int i5;
        int m9826;
        int i6 = this.f9082;
        if (k5 == null) {
            m9826 = m9828();
            i5 = 0;
        } else {
            int hashCode = k5.hashCode();
            i5 = hashCode;
            m9826 = m9826(k5, hashCode);
        }
        if (m9826 >= 0) {
            int i7 = (m9826 << 1) + 1;
            Object[] objArr = this.f9081;
            V v6 = (V) objArr[i7];
            objArr[i7] = v5;
            return v6;
        }
        int i8 = m9826 ^ (-1);
        int[] iArr = this.f9080;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            Object[] objArr2 = this.f9081;
            m9822(i9);
            if (i6 != this.f9082) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f9080;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f9081, 0, objArr2.length);
            }
            m9824(iArr, objArr2, i6);
        }
        if (i8 < i6) {
            int[] iArr3 = this.f9080;
            int i10 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i10, i6 - i8);
            Object[] objArr3 = this.f9081;
            System.arraycopy(objArr3, i8 << 1, objArr3, i10 << 1, (this.f9082 - i8) << 1);
        }
        int i11 = this.f9082;
        if (i6 == i11) {
            int[] iArr4 = this.f9080;
            if (i8 < iArr4.length) {
                iArr4[i8] = i5;
                Object[] objArr4 = this.f9081;
                int i12 = i8 << 1;
                objArr4[i12] = k5;
                objArr4[i12 + 1] = v5;
                this.f9082 = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k5, V v5) {
        V v6 = get(k5);
        return v6 == null ? put(k5, v5) : v6;
    }

    public V remove(Object obj) {
        int m9827 = m9827(obj);
        if (m9827 >= 0) {
            return mo9832(m9827);
        }
        return null;
    }

    public V replace(K k5, V v5) {
        int m9827 = m9827(k5);
        if (m9827 >= 0) {
            return mo9833(m9827, v5);
        }
        return null;
    }

    public int size() {
        return this.f9082;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9082 * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f9082; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            K m9830 = m9830(i5);
            if (m9830 != this) {
                sb.append(m9830);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m9834 = m9834(i5);
            if (m9834 != this) {
                sb.append(m9834);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m9825(int i5) {
        int i6 = this.f9082;
        int[] iArr = this.f9080;
        if (iArr.length < i5) {
            Object[] objArr = this.f9081;
            m9822(i5);
            if (this.f9082 > 0) {
                System.arraycopy(iArr, 0, this.f9080, 0, i6);
                System.arraycopy(objArr, 0, this.f9081, 0, i6 << 1);
            }
            m9824(iArr, objArr, i6);
        }
        if (this.f9082 != i6) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    int m9826(Object obj, int i5) {
        int i6 = this.f9082;
        if (i6 == 0) {
            return -1;
        }
        int m9823 = m9823(this.f9080, i6, i5);
        if (m9823 < 0) {
            return m9823;
        }
        if (obj.equals(this.f9081[m9823 << 1])) {
            return m9823;
        }
        int i7 = m9823 + 1;
        while (i7 < i6 && this.f9080[i7] == i5) {
            if (obj.equals(this.f9081[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = m9823 - 1; i8 >= 0 && this.f9080[i8] == i5; i8--) {
            if (obj.equals(this.f9081[i8 << 1])) {
                return i8;
            }
        }
        return i7 ^ (-1);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m9827(Object obj) {
        return obj == null ? m9828() : m9826(obj, obj.hashCode());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m9828() {
        int i5 = this.f9082;
        if (i5 == 0) {
            return -1;
        }
        int m9823 = m9823(this.f9080, i5, 0);
        if (m9823 < 0) {
            return m9823;
        }
        if (this.f9081[m9823 << 1] == null) {
            return m9823;
        }
        int i6 = m9823 + 1;
        while (i6 < i5 && this.f9080[i6] == 0) {
            if (this.f9081[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = m9823 - 1; i7 >= 0 && this.f9080[i7] == 0; i7--) {
            if (this.f9081[i7 << 1] == null) {
                return i7;
            }
        }
        return i6 ^ (-1);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    int m9829(Object obj) {
        int i5 = this.f9082 * 2;
        Object[] objArr = this.f9081;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public K m9830(int i5) {
        return (K) this.f9081[i5 << 1];
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo9831(g<? extends K, ? extends V> gVar) {
        int i5 = gVar.f9082;
        m9825(this.f9082 + i5);
        if (this.f9082 != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                put(gVar.m9830(i6), gVar.m9834(i6));
            }
        } else if (i5 > 0) {
            System.arraycopy(gVar.f9080, 0, this.f9080, 0, i5);
            System.arraycopy(gVar.f9081, 0, this.f9081, 0, i5 << 1);
            this.f9082 = i5;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public V mo9832(int i5) {
        Object[] objArr = this.f9081;
        int i6 = i5 << 1;
        V v5 = (V) objArr[i6 + 1];
        int i7 = this.f9082;
        int i8 = 0;
        if (i7 <= 1) {
            m9824(this.f9080, objArr, i7);
            this.f9080 = c.f9045;
            this.f9081 = c.f9047;
        } else {
            int i9 = i7 - 1;
            int[] iArr = this.f9080;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    int i11 = i9 - i5;
                    System.arraycopy(iArr, i10, iArr, i5, i11);
                    Object[] objArr2 = this.f9081;
                    System.arraycopy(objArr2, i10 << 1, objArr2, i6, i11 << 1);
                }
                Object[] objArr3 = this.f9081;
                int i12 = i9 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            } else {
                m9822(i7 > 8 ? i7 + (i7 >> 1) : 8);
                if (i7 != this.f9082) {
                    throw new ConcurrentModificationException();
                }
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.f9080, 0, i5);
                    System.arraycopy(objArr, 0, this.f9081, 0, i6);
                }
                if (i5 < i9) {
                    int i13 = i5 + 1;
                    int i14 = i9 - i5;
                    System.arraycopy(iArr, i13, this.f9080, i5, i14);
                    System.arraycopy(objArr, i13 << 1, this.f9081, i6, i14 << 1);
                }
            }
            i8 = i9;
        }
        if (i7 != this.f9082) {
            throw new ConcurrentModificationException();
        }
        this.f9082 = i8;
        return v5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public V mo9833(int i5, V v5) {
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.f9081;
        V v6 = (V) objArr[i6];
        objArr[i6] = v5;
        return v6;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public V m9834(int i5) {
        return (V) this.f9081[(i5 << 1) + 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int m9827 = m9827(obj);
        if (m9827 < 0) {
            return false;
        }
        V m9834 = m9834(m9827);
        if (obj2 != m9834 && (obj2 == null || !obj2.equals(m9834))) {
            return false;
        }
        mo9832(m9827);
        return true;
    }

    public boolean replace(K k5, V v5, V v6) {
        int m9827 = m9827(k5);
        if (m9827 < 0) {
            return false;
        }
        V m9834 = m9834(m9827);
        if (m9834 != v5 && (v5 == null || !v5.equals(m9834))) {
            return false;
        }
        mo9833(m9827, v6);
        return true;
    }

    public g(int i5) {
        if (i5 == 0) {
            this.f9080 = c.f9045;
            this.f9081 = c.f9047;
        } else {
            m9822(i5);
        }
        this.f9082 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            mo9831(gVar);
        }
    }
}
