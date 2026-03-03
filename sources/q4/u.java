package q4;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q4.v;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u<T extends v & Comparable<? super T>> {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f10663 = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size");
    private volatile int _size;

    /* renamed from: ʻ, reason: contains not printable characters */
    private T[] f10664;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final T[] m11542() {
        T[] tArr = this.f10664;
        if (tArr == null) {
            T[] tArr2 = (T[]) new v[4];
            this.f10664 = tArr2;
            return tArr2;
        }
        if (m11549() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, m11549() * 2);
        f4.k.m8622(copyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((v[]) copyOf);
        this.f10664 = tArr3;
        return tArr3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private final void m11543(int i5) {
        f10663.set(this, i5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private final void m11544(int i5) {
        while (true) {
            int i6 = (i5 * 2) + 1;
            if (i6 >= m11549()) {
                return;
            }
            T[] tArr = this.f10664;
            f4.k.m8620(tArr);
            int i7 = i6 + 1;
            if (i7 < m11549()) {
                T t5 = tArr[i7];
                f4.k.m8620(t5);
                T t6 = tArr[i6];
                f4.k.m8620(t6);
                if (((Comparable) t5).compareTo(t6) < 0) {
                    i6 = i7;
                }
            }
            T t7 = tArr[i5];
            f4.k.m8620(t7);
            T t8 = tArr[i6];
            f4.k.m8620(t8);
            if (((Comparable) t7).compareTo(t8) <= 0) {
                return;
            }
            m11546(i5, i6);
            i5 = i6;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private final void m11545(int i5) {
        while (i5 > 0) {
            T[] tArr = this.f10664;
            f4.k.m8620(tArr);
            int i6 = (i5 - 1) / 2;
            T t5 = tArr[i6];
            f4.k.m8620(t5);
            T t6 = tArr[i5];
            f4.k.m8620(t6);
            if (((Comparable) t5).compareTo(t6) <= 0) {
                return;
            }
            m11546(i5, i6);
            i5 = i6;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private final void m11546(int i5, int i6) {
        T[] tArr = this.f10664;
        f4.k.m8620(tArr);
        T t5 = tArr[i6];
        f4.k.m8620(t5);
        T t6 = tArr[i5];
        f4.k.m8620(t6);
        tArr[i5] = t5;
        tArr[i6] = t6;
        t5.setIndex(i5);
        t6.setIndex(i6);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m11547(T t5) {
        t5.mo10159(this);
        v[] m11542 = m11542();
        int m11549 = m11549();
        m11543(m11549 + 1);
        m11542[m11549] = t5;
        t5.setIndex(m11549);
        m11545(m11549);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final T m11548() {
        T[] tArr = this.f10664;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m11549() {
        return f10663.get(this);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final boolean m11550() {
        return m11549() == 0;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final T m11551() {
        T t5;
        synchronized (this) {
            t5 = (T) m11548();
        }
        return t5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final boolean m11552(T t5) {
        boolean z5;
        synchronized (this) {
            if (t5.mo10160() == null) {
                z5 = false;
            } else {
                m11553(t5.getIndex());
                z5 = true;
            }
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* renamed from: ˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T m11553(int r6) {
        /*
            r5 = this;
            T extends q4.v & java.lang.Comparable<? super T>[] r0 = r5.f10664
            f4.k.m8620(r0)
            int r1 = r5.m11549()
            r2 = -1
            int r1 = r1 + r2
            r5.m11543(r1)
            int r1 = r5.m11549()
            if (r6 >= r1) goto L3d
            int r1 = r5.m11549()
            r5.m11546(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            f4.k.m8620(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            f4.k.m8620(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m11546(r6, r1)
            r5.m11545(r1)
            goto L3d
        L3a:
            r5.m11544(r6)
        L3d:
            int r6 = r5.m11549()
            r6 = r0[r6]
            f4.k.m8620(r6)
            r1 = 0
            r6.mo10159(r1)
            r6.setIndex(r2)
            int r2 = r5.m11549()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.u.m11553(int):q4.v");
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final T m11554() {
        T t5;
        synchronized (this) {
            t5 = m11549() > 0 ? (T) m11553(0) : null;
        }
        return t5;
    }
}
