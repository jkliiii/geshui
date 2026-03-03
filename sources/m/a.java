package m;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: ˎ, reason: contains not printable characters */
    f<K, V> f9032;

    /* compiled from: ArrayMap.java */
    /* renamed from: m.a$a, reason: collision with other inner class name */
    class C0131a extends f<K, V> {
        C0131a() {
        }

        @Override // m.f
        /* renamed from: ʻ, reason: contains not printable characters */
        protected void mo9768() {
            a.this.clear();
        }

        @Override // m.f
        /* renamed from: ʼ, reason: contains not printable characters */
        protected Object mo9769(int i5, int i6) {
            return a.this.f9081[(i5 << 1) + i6];
        }

        @Override // m.f
        /* renamed from: ʽ, reason: contains not printable characters */
        protected Map<K, V> mo9770() {
            return a.this;
        }

        @Override // m.f
        /* renamed from: ʾ, reason: contains not printable characters */
        protected int mo9771() {
            return a.this.f9082;
        }

        @Override // m.f
        /* renamed from: ʿ, reason: contains not printable characters */
        protected int mo9772(Object obj) {
            return a.this.m9827(obj);
        }

        @Override // m.f
        /* renamed from: ˆ, reason: contains not printable characters */
        protected int mo9773(Object obj) {
            return a.this.m9829(obj);
        }

        @Override // m.f
        /* renamed from: ˈ, reason: contains not printable characters */
        protected void mo9774(K k5, V v5) {
            a.this.put(k5, v5);
        }

        @Override // m.f
        /* renamed from: ˉ, reason: contains not printable characters */
        protected void mo9775(int i5) {
            a.this.mo9832(i5);
        }

        @Override // m.f
        /* renamed from: ˊ, reason: contains not printable characters */
        protected V mo9776(int i5, V v5) {
            return a.this.mo9833(i5, v5);
        }
    }

    public a() {
    }

    /* renamed from: י, reason: contains not printable characters */
    private f<K, V> m9766() {
        if (this.f9032 == null) {
            this.f9032 = new C0131a();
        }
        return this.f9032;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m9766().m9815();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m9766().m9816();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m9825(this.f9082 + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m9766().m9817();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m9767(Collection<?> collection) {
        return f.m9814(this, collection);
    }

    public a(int i5) {
        super(i5);
    }

    public a(g gVar) {
        super(gVar);
    }
}
