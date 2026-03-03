package m;

/* compiled from: SparseArrayCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h<E> implements Cloneable {

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final Object f9083 = new Object();

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f9084;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int[] f9085;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Object[] f9086;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f9087;

    public h() {
        this(10);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m9835() {
        int i5 = this.f9087;
        int[] iArr = this.f9085;
        Object[] objArr = this.f9086;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != f9083) {
                if (i7 != i6) {
                    iArr[i6] = iArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.f9084 = false;
        this.f9087 = i6;
    }

    public String toString() {
        if (m9844() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9087 * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f9087; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(m9842(i5));
            sb.append('=');
            E m9845 = m9845(i5);
            if (m9845 != this) {
                sb.append(m9845);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m9836(int i5, E e5) {
        int i6 = this.f9087;
        if (i6 != 0 && i5 <= this.f9085[i6 - 1]) {
            m9843(i5, e5);
            return;
        }
        if (this.f9084 && i6 >= this.f9085.length) {
            m9835();
        }
        int i7 = this.f9087;
        if (i7 >= this.f9085.length) {
            int m9789 = c.m9789(i7 + 1);
            int[] iArr = new int[m9789];
            Object[] objArr = new Object[m9789];
            int[] iArr2 = this.f9085;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f9086;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f9085 = iArr;
            this.f9086 = objArr;
        }
        this.f9085[i7] = i5;
        this.f9086[i7] = e5;
        this.f9087 = i7 + 1;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m9837() {
        int i5 = this.f9087;
        Object[] objArr = this.f9086;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.f9087 = 0;
        this.f9084 = false;
    }

    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f9085 = (int[]) this.f9085.clone();
            hVar.f9086 = (Object[]) this.f9086.clone();
            return hVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public E m9839(int i5) {
        return m9840(i5, null);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public E m9840(int i5, E e5) {
        E e6;
        int m9785 = c.m9785(this.f9085, this.f9087, i5);
        return (m9785 < 0 || (e6 = (E) this.f9086[m9785]) == f9083) ? e5 : e6;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m9841(E e5) {
        if (this.f9084) {
            m9835();
        }
        for (int i5 = 0; i5 < this.f9087; i5++) {
            if (this.f9086[i5] == e5) {
                return i5;
            }
        }
        return -1;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int m9842(int i5) {
        if (this.f9084) {
            m9835();
        }
        return this.f9085[i5];
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m9843(int i5, E e5) {
        int m9785 = c.m9785(this.f9085, this.f9087, i5);
        if (m9785 >= 0) {
            this.f9086[m9785] = e5;
            return;
        }
        int i6 = m9785 ^ (-1);
        int i7 = this.f9087;
        if (i6 < i7) {
            Object[] objArr = this.f9086;
            if (objArr[i6] == f9083) {
                this.f9085[i6] = i5;
                objArr[i6] = e5;
                return;
            }
        }
        if (this.f9084 && i7 >= this.f9085.length) {
            m9835();
            i6 = c.m9785(this.f9085, this.f9087, i5) ^ (-1);
        }
        int i8 = this.f9087;
        if (i8 >= this.f9085.length) {
            int m9789 = c.m9789(i8 + 1);
            int[] iArr = new int[m9789];
            Object[] objArr2 = new Object[m9789];
            int[] iArr2 = this.f9085;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f9086;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9085 = iArr;
            this.f9086 = objArr2;
        }
        int i9 = this.f9087;
        if (i9 - i6 != 0) {
            int[] iArr3 = this.f9085;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr4 = this.f9086;
            System.arraycopy(objArr4, i6, objArr4, i10, this.f9087 - i6);
        }
        this.f9085[i6] = i5;
        this.f9086[i6] = e5;
        this.f9087++;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m9844() {
        if (this.f9084) {
            m9835();
        }
        return this.f9087;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public E m9845(int i5) {
        if (this.f9084) {
            m9835();
        }
        return (E) this.f9086[i5];
    }

    public h(int i5) {
        this.f9084 = false;
        if (i5 == 0) {
            this.f9085 = c.f9045;
            this.f9086 = c.f9047;
        } else {
            int m9789 = c.m9789(i5);
            this.f9085 = new int[m9789];
            this.f9086 = new Object[m9789];
        }
    }
}
