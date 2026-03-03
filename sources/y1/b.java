package y1;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b<K, V> extends m.a<K, V> {

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f12441;

    @Override // m.g, java.util.Map
    public void clear() {
        this.f12441 = 0;
        super.clear();
    }

    @Override // m.g, java.util.Map
    public int hashCode() {
        if (this.f12441 == 0) {
            this.f12441 = super.hashCode();
        }
        return this.f12441;
    }

    @Override // m.g, java.util.Map
    public V put(K k5, V v5) {
        this.f12441 = 0;
        return (V) super.put(k5, v5);
    }

    @Override // m.g
    /* renamed from: ˋ */
    public void mo9831(m.g<? extends K, ? extends V> gVar) {
        this.f12441 = 0;
        super.mo9831(gVar);
    }

    @Override // m.g
    /* renamed from: ˎ */
    public V mo9832(int i5) {
        this.f12441 = 0;
        return (V) super.mo9832(i5);
    }

    @Override // m.g
    /* renamed from: ˏ */
    public V mo9833(int i5, V v5) {
        this.f12441 = 0;
        return (V) super.mo9833(i5, v5);
    }
}
