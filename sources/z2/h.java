package z2;

import java.lang.ref.Reference;
import java.util.Hashtable;

/* compiled from: ReferenceHashtable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class h<K, V, R extends Reference<V>> {

    /* renamed from: ʻ, reason: contains not printable characters */
    Hashtable<K, R> f12793 = new Hashtable<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    protected abstract R mo13180(V v5);

    /* renamed from: ʼ, reason: contains not printable characters */
    public V m13181(K k5, V v5) {
        Reference reference = (Reference) this.f12793.put(k5, mo13180(v5));
        if (reference == null) {
            return null;
        }
        return (V) reference.get();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public V m13182(K k5) {
        R remove = this.f12793.remove(k5);
        if (remove == null) {
            return null;
        }
        return (V) remove.get();
    }
}
