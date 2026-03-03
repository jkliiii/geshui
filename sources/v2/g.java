package v2;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g<K, V> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final LinkedHashMap<K, V> f11717;

    /* renamed from: ʼ, reason: contains not printable characters */
    private long f11718;

    /* renamed from: ʽ, reason: contains not printable characters */
    private long f11719;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f11720;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f11721;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f11722;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f11723;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f11724;

    public g(long j5) {
        if (j5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f11719 = j5;
        this.f11717 = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private long m12356(K k5, V v5) {
        long mo12345 = mo12345(k5, v5);
        if (mo12345 >= 0) {
            return mo12345;
        }
        throw new IllegalStateException("Negative size: " + k5 + "=" + v5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12357(long r7) {
        /*
            r6 = this;
        L0:
            monitor-enter(r6)
            long r0 = r6.f11718     // Catch: java.lang.Throwable -> L79
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L5a
            java.util.LinkedHashMap<K, V> r0 = r6.f11717     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L17
            long r0 = r6.f11718     // Catch: java.lang.Throwable -> L79
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L5a
        L17:
            long r0 = r6.f11718     // Catch: java.lang.Throwable -> L79
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L58
            java.util.LinkedHashMap<K, V> r0 = r6.f11717     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L26
            goto L58
        L26:
            java.util.LinkedHashMap<K, V> r0 = r6.f11717     // Catch: java.lang.Throwable -> L79
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L79
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, V> r2 = r6.f11717     // Catch: java.lang.Throwable -> L79
            r2.remove(r1)     // Catch: java.lang.Throwable -> L79
            long r2 = r6.f11718     // Catch: java.lang.Throwable -> L79
            long r4 = r6.m12356(r1, r0)     // Catch: java.lang.Throwable -> L79
            long r2 = r2 - r4
            r6.f11718 = r2     // Catch: java.lang.Throwable -> L79
            int r2 = r6.f11722     // Catch: java.lang.Throwable -> L79
            r3 = 1
            int r2 = r2 + r3
            r6.f11722 = r2     // Catch: java.lang.Throwable -> L79
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L79
            r2 = 0
            r6.mo12344(r3, r1, r0, r2)
            goto L0
        L58:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L79
            return
        L5a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r8.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L79
            r8.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r8.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L79
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L79
            throw r7     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L79
            goto L7d
        L7c:
            throw r7
        L7d:
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.g.m12357(long):void");
    }

    public final synchronized String toString() {
        int i5;
        int i6;
        i5 = this.f11723;
        i6 = this.f11724 + i5;
        return String.format(Locale.ENGLISH, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Long.valueOf(this.f11719), Integer.valueOf(this.f11723), Integer.valueOf(this.f11724), Integer.valueOf(i6 != 0 ? (i5 * 100) / i6 : 0));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected V m12358(K k5) {
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final V m12359(K k5) {
        V v5;
        if (k5 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v6 = this.f11717.get(k5);
            if (v6 != null) {
                this.f11723++;
                return v6;
            }
            this.f11724++;
            V m12358 = m12358(k5);
            if (m12358 == null) {
                return null;
            }
            synchronized (this) {
                this.f11721++;
                v5 = (V) this.f11717.put(k5, m12358);
                if (v5 != null) {
                    this.f11717.put(k5, v5);
                } else {
                    this.f11718 += m12356(k5, m12358);
                }
            }
            if (v5 != null) {
                mo12344(false, k5, m12358, v5);
                return v5;
            }
            m12357(this.f11719);
            return m12358;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final synchronized long m12360() {
        return this.f11719;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final V m12361(K k5, V v5) {
        V put;
        if (k5 == null || v5 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f11720++;
            this.f11718 += m12356(k5, v5);
            put = this.f11717.put(k5, v5);
            if (put != null) {
                this.f11718 -= m12356(k5, put);
            }
        }
        if (put != null) {
            mo12344(false, k5, put, v5);
        }
        m12357(this.f11719);
        return put;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final V m12362(K k5) {
        V remove;
        if (k5 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f11717.remove(k5);
            if (remove != null) {
                this.f11718 -= m12356(k5, remove);
            }
        }
        if (remove != null) {
            mo12344(false, k5, remove, null);
        }
        return remove;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m12363(long j5) {
        this.f11719 = j5;
    }

    /* renamed from: ˊ */
    protected long mo12345(K k5, V v5) {
        throw null;
    }

    /* renamed from: ʼ */
    protected void mo12344(boolean z5, K k5, V v5, V v6) {
    }
}
