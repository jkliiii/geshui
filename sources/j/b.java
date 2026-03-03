package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: ʾ, reason: contains not printable characters */
    c<K, V> f8596;

    /* renamed from: ʿ, reason: contains not printable characters */
    private c<K, V> f8597;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final WeakHashMap<f<K, V>, Boolean> f8598 = new WeakHashMap<>();

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f8599 = 0;

    /* compiled from: SafeIterableMap.java */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        /* renamed from: ʼ, reason: contains not printable characters */
        c<K, V> mo9269(c<K, V> cVar) {
            return cVar.f8603;
        }

        @Override // j.b.e
        /* renamed from: ʽ, reason: contains not printable characters */
        c<K, V> mo9270(c<K, V> cVar) {
            return cVar.f8602;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: j.b$b, reason: collision with other inner class name */
    private static class C0120b<K, V> extends e<K, V> {
        C0120b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        /* renamed from: ʼ */
        c<K, V> mo9269(c<K, V> cVar) {
            return cVar.f8602;
        }

        @Override // j.b.e
        /* renamed from: ʽ */
        c<K, V> mo9270(c<K, V> cVar) {
            return cVar.f8603;
        }
    }

    /* compiled from: SafeIterableMap.java */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final K f8600;

        /* renamed from: ʿ, reason: contains not printable characters */
        final V f8601;

        /* renamed from: ˆ, reason: contains not printable characters */
        c<K, V> f8602;

        /* renamed from: ˈ, reason: contains not printable characters */
        c<K, V> f8603;

        c(K k5, V v5) {
            this.f8600 = k5;
            this.f8601 = v5;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8600.equals(cVar.f8600) && this.f8601.equals(cVar.f8601);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f8600;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f8601;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f8600.hashCode() ^ this.f8601.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f8600 + "=" + this.f8601;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private c<K, V> f8604;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f8605 = true;

        d() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8605) {
                return b.this.f8596 != null;
            }
            c<K, V> cVar = this.f8604;
            return (cVar == null || cVar.f8602 == null) ? false : true;
        }

        @Override // j.b.f
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo9271(c<K, V> cVar) {
            c<K, V> cVar2 = this.f8604;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f8603;
                this.f8604 = cVar3;
                this.f8605 = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f8605) {
                this.f8605 = false;
                this.f8604 = b.this.f8596;
            } else {
                c<K, V> cVar = this.f8604;
                this.f8604 = cVar != null ? cVar.f8602 : null;
            }
            return this.f8604;
        }
    }

    /* compiled from: SafeIterableMap.java */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: ʾ, reason: contains not printable characters */
        c<K, V> f8607;

        /* renamed from: ʿ, reason: contains not printable characters */
        c<K, V> f8608;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f8607 = cVar2;
            this.f8608 = cVar;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private c<K, V> m9273() {
            c<K, V> cVar = this.f8608;
            c<K, V> cVar2 = this.f8607;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo9270(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8608 != null;
        }

        @Override // j.b.f
        /* renamed from: ʻ */
        public void mo9271(c<K, V> cVar) {
            if (this.f8607 == cVar && cVar == this.f8608) {
                this.f8608 = null;
                this.f8607 = null;
            }
            c<K, V> cVar2 = this.f8607;
            if (cVar2 == cVar) {
                this.f8607 = mo9269(cVar2);
            }
            if (this.f8608 == cVar) {
                this.f8608 = m9273();
            }
        }

        /* renamed from: ʼ */
        abstract c<K, V> mo9269(c<K, V> cVar);

        /* renamed from: ʽ */
        abstract c<K, V> mo9270(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f8608;
            this.f8608 = m9273();
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static abstract class f<K, V> {
        /* renamed from: ʻ */
        abstract void mo9271(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0120b c0120b = new C0120b(this.f8597, this.f8596);
        this.f8598.put(c0120b, Boolean.FALSE);
        return c0120b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().hashCode();
        }
        return i5;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f8596, this.f8597);
        this.f8598.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f8599;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public Map.Entry<K, V> m9265() {
        return this.f8596;
    }

    /* renamed from: ʼ */
    protected c<K, V> mo9261(K k5) {
        c<K, V> cVar = this.f8596;
        while (cVar != null && !cVar.f8600.equals(k5)) {
            cVar = cVar.f8602;
        }
        return cVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public b<K, V>.d m9266() {
        b<K, V>.d dVar = new d();
        this.f8598.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public Map.Entry<K, V> m9267() {
        return this.f8597;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    c<K, V> m9268(K k5, V v5) {
        c<K, V> cVar = new c<>(k5, v5);
        this.f8599++;
        c<K, V> cVar2 = this.f8597;
        if (cVar2 == null) {
            this.f8596 = cVar;
            this.f8597 = cVar;
            return cVar;
        }
        cVar2.f8602 = cVar;
        cVar.f8603 = cVar2;
        this.f8597 = cVar;
        return cVar;
    }

    /* renamed from: ˆ */
    public V mo9262(K k5, V v5) {
        c<K, V> mo9261 = mo9261(k5);
        if (mo9261 != null) {
            return mo9261.f8601;
        }
        m9268(k5, v5);
        return null;
    }

    /* renamed from: ˈ */
    public V mo9263(K k5) {
        c<K, V> mo9261 = mo9261(k5);
        if (mo9261 == null) {
            return null;
        }
        this.f8599--;
        if (!this.f8598.isEmpty()) {
            Iterator<f<K, V>> it = this.f8598.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo9271(mo9261);
            }
        }
        c<K, V> cVar = mo9261.f8603;
        if (cVar != null) {
            cVar.f8602 = mo9261.f8602;
        } else {
            this.f8596 = mo9261.f8602;
        }
        c<K, V> cVar2 = mo9261.f8602;
        if (cVar2 != null) {
            cVar2.f8603 = cVar;
        } else {
            this.f8597 = cVar;
        }
        mo9261.f8602 = null;
        mo9261.f8603 = null;
        return mo9261.f8601;
    }
}
