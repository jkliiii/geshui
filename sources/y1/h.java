package y1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h<T, Y> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<T, a<Y>> f12452 = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: ʼ, reason: contains not printable characters */
    private final long f12453;

    /* renamed from: ʽ, reason: contains not printable characters */
    private long f12454;

    /* renamed from: ʾ, reason: contains not printable characters */
    private long f12455;

    /* compiled from: LruCache.java */
    static final class a<Y> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Y f12456;

        /* renamed from: ʼ, reason: contains not printable characters */
        final int f12457;

        a(Y y5, int i5) {
            this.f12456 = y5;
            this.f12457 = i5;
        }
    }

    public h(long j5) {
        this.f12453 = j5;
        this.f12454 = j5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m12880() {
        m12886(this.f12454);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m12881() {
        m12886(0L);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public synchronized Y m12882(T t5) {
        a<Y> aVar;
        aVar = this.f12452.get(t5);
        return aVar != null ? aVar.f12456 : null;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public synchronized long m12883() {
        return this.f12454;
    }

    /* renamed from: ˊ */
    protected int mo8673(Y y5) {
        return 1;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public synchronized Y m12884(T t5, Y y5) {
        int mo8673 = mo8673(y5);
        long j5 = mo8673;
        if (j5 >= this.f12454) {
            mo8674(t5, y5);
            return null;
        }
        if (y5 != null) {
            this.f12455 += j5;
        }
        a<Y> put = this.f12452.put(t5, y5 == null ? null : new a<>(y5, mo8673));
        if (put != null) {
            this.f12455 -= put.f12457;
            if (!put.f12456.equals(y5)) {
                mo8674(t5, put.f12456);
            }
        }
        m12880();
        return put != null ? put.f12456 : null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public synchronized Y m12885(T t5) {
        a<Y> remove = this.f12452.remove(t5);
        if (remove == null) {
            return null;
        }
        this.f12455 -= remove.f12457;
        return remove.f12456;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    protected synchronized void m12886(long j5) {
        while (this.f12455 > j5) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f12452.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f12455 -= value.f12457;
            T key = next.getKey();
            it.remove();
            mo8674(key, value.f12456);
        }
    }

    /* renamed from: ˋ */
    protected void mo8674(T t5, Y y5) {
    }
}
