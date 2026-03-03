package m;

/* compiled from: LongSparseArray.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d<E> implements Cloneable {

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final Object f9048 = new Object();

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f9049;

    /* renamed from: ʿ, reason: contains not printable characters */
    private long[] f9050;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Object[] f9051;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f9052;

    public d() {
        this(10);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m9791() {
        int i5 = this.f9052;
        long[] jArr = this.f9050;
        Object[] objArr = this.f9051;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != f9048) {
                if (i7 != i6) {
                    jArr[i6] = jArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.f9049 = false;
        this.f9052 = i6;
    }

    public String toString() {
        if (m9802() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9052 * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f9052; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(m9798(i5));
            sb.append('=');
            E m9803 = m9803(i5);
            if (m9803 != this) {
                sb.append(m9803);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m9792(long j5, E e5) {
        int i5 = this.f9052;
        if (i5 != 0 && j5 <= this.f9050[i5 - 1]) {
            m9799(j5, e5);
            return;
        }
        if (this.f9049 && i5 >= this.f9050.length) {
            m9791();
        }
        int i6 = this.f9052;
        if (i6 >= this.f9050.length) {
            int m9790 = c.m9790(i6 + 1);
            long[] jArr = new long[m9790];
            Object[] objArr = new Object[m9790];
            long[] jArr2 = this.f9050;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f9051;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f9050 = jArr;
            this.f9051 = objArr;
        }
        this.f9050[i6] = j5;
        this.f9051[i6] = e5;
        this.f9052 = i6 + 1;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m9793() {
        int i5 = this.f9052;
        Object[] objArr = this.f9051;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.f9052 = 0;
        this.f9049 = false;
    }

    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f9050 = (long[]) this.f9050.clone();
            dVar.f9051 = (Object[]) this.f9051.clone();
            return dVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public E m9795(long j5) {
        return m9796(j5, null);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public E m9796(long j5, E e5) {
        E e6;
        int m9786 = c.m9786(this.f9050, this.f9052, j5);
        return (m9786 < 0 || (e6 = (E) this.f9051[m9786]) == f9048) ? e5 : e6;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m9797(long j5) {
        if (this.f9049) {
            m9791();
        }
        return c.m9786(this.f9050, this.f9052, j5);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public long m9798(int i5) {
        if (this.f9049) {
            m9791();
        }
        return this.f9050[i5];
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m9799(long j5, E e5) {
        int m9786 = c.m9786(this.f9050, this.f9052, j5);
        if (m9786 >= 0) {
            this.f9051[m9786] = e5;
            return;
        }
        int i5 = m9786 ^ (-1);
        int i6 = this.f9052;
        if (i5 < i6) {
            Object[] objArr = this.f9051;
            if (objArr[i5] == f9048) {
                this.f9050[i5] = j5;
                objArr[i5] = e5;
                return;
            }
        }
        if (this.f9049 && i6 >= this.f9050.length) {
            m9791();
            i5 = c.m9786(this.f9050, this.f9052, j5) ^ (-1);
        }
        int i7 = this.f9052;
        if (i7 >= this.f9050.length) {
            int m9790 = c.m9790(i7 + 1);
            long[] jArr = new long[m9790];
            Object[] objArr2 = new Object[m9790];
            long[] jArr2 = this.f9050;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f9051;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9050 = jArr;
            this.f9051 = objArr2;
        }
        int i8 = this.f9052;
        if (i8 - i5 != 0) {
            long[] jArr3 = this.f9050;
            int i9 = i5 + 1;
            System.arraycopy(jArr3, i5, jArr3, i9, i8 - i5);
            Object[] objArr4 = this.f9051;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f9052 - i5);
        }
        this.f9050[i5] = j5;
        this.f9051[i5] = e5;
        this.f9052++;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m9800(long j5) {
        int m9786 = c.m9786(this.f9050, this.f9052, j5);
        if (m9786 >= 0) {
            Object[] objArr = this.f9051;
            Object obj = objArr[m9786];
            Object obj2 = f9048;
            if (obj != obj2) {
                objArr[m9786] = obj2;
                this.f9049 = true;
            }
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m9801(int i5) {
        Object[] objArr = this.f9051;
        Object obj = objArr[i5];
        Object obj2 = f9048;
        if (obj != obj2) {
            objArr[i5] = obj2;
            this.f9049 = true;
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public int m9802() {
        if (this.f9049) {
            m9791();
        }
        return this.f9052;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public E m9803(int i5) {
        if (this.f9049) {
            m9791();
        }
        return (E) this.f9051[i5];
    }

    public d(int i5) {
        this.f9049 = false;
        if (i5 == 0) {
            this.f9050 = c.f9046;
            this.f9051 = c.f9047;
        } else {
            int m9790 = c.m9790(i5);
            this.f9050 = new long[m9790];
            this.f9051 = new Object[m9790];
        }
    }
}
