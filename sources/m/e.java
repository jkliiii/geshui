package m;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e<K, V> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final LinkedHashMap<K, V> f9053;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f9054;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f9055;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f9056;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f9057;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f9058;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f9059;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f9060;

    public e(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f9055 = i5;
        this.f9053 = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m9804(K k5, V v5) {
        int m9809 = m9809(k5, v5);
        if (m9809 >= 0) {
            return m9809;
        }
        throw new IllegalStateException("Negative size: " + k5 + "=" + v5);
    }

    public final synchronized String toString() {
        int i5;
        int i6;
        i5 = this.f9059;
        i6 = this.f9060 + i5;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f9055), Integer.valueOf(this.f9059), Integer.valueOf(this.f9060), Integer.valueOf(i6 != 0 ? (i5 * 100) / i6 : 0));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected V m9805(K k5) {
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final V m9807(K k5) {
        V v5;
        if (k5 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v6 = this.f9053.get(k5);
            if (v6 != null) {
                this.f9059++;
                return v6;
            }
            this.f9060++;
            V m9805 = m9805(k5);
            if (m9805 == null) {
                return null;
            }
            synchronized (this) {
                this.f9057++;
                v5 = (V) this.f9053.put(k5, m9805);
                if (v5 != null) {
                    this.f9053.put(k5, v5);
                } else {
                    this.f9054 += m9804(k5, m9805);
                }
            }
            if (v5 != null) {
                m9806(false, k5, m9805, v5);
                return v5;
            }
            m9810(this.f9055);
            return m9805;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final V m9808(K k5, V v5) {
        V put;
        if (k5 == null || v5 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f9056++;
            this.f9054 += m9804(k5, v5);
            put = this.f9053.put(k5, v5);
            if (put != null) {
                this.f9054 -= m9804(k5, put);
            }
        }
        if (put != null) {
            m9806(false, k5, put, v5);
        }
        m9810(this.f9055);
        return put;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected int m9809(K k5, V v5) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: ˈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m9810(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f9054     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f9053     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f9054     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f9054     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f9053     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f9053     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f9053     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f9054     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m9804(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f9054 = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f9058     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f9058 = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m9806(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: m.e.m9810(int):void");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected void m9806(boolean z5, K k5, V v5, V v6) {
    }
}
