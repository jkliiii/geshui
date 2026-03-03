package j;

import j.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: ˉ, reason: contains not printable characters */
    private final HashMap<K, b.c<K, V>> f8595 = new HashMap<>();

    public boolean contains(K k5) {
        return this.f8595.containsKey(k5);
    }

    @Override // j.b
    /* renamed from: ʼ, reason: contains not printable characters */
    protected b.c<K, V> mo9261(K k5) {
        return this.f8595.get(k5);
    }

    @Override // j.b
    /* renamed from: ˆ, reason: contains not printable characters */
    public V mo9262(K k5, V v5) {
        b.c<K, V> mo9261 = mo9261(k5);
        if (mo9261 != null) {
            return mo9261.f8601;
        }
        this.f8595.put(k5, m9268(k5, v5));
        return null;
    }

    @Override // j.b
    /* renamed from: ˈ, reason: contains not printable characters */
    public V mo9263(K k5) {
        V v5 = (V) super.mo9263(k5);
        this.f8595.remove(k5);
        return v5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public Map.Entry<K, V> m9264(K k5) {
        if (contains(k5)) {
            return this.f8595.get(k5).f8603;
        }
        return null;
    }
}
