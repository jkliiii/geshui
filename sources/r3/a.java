package r3;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f10848;

    public a() {
        this(256);
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.f10848;
    }

    public a(int i5) {
        super(i5, 1.0f, true);
        this.f10848 = i5;
    }
}
