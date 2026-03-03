package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class f<K, V> {

    /* renamed from: ʻ, reason: contains not printable characters */
    f<K, V>.b f9061;

    /* renamed from: ʼ, reason: contains not printable characters */
    f<K, V>.c f9062;

    /* renamed from: ʽ, reason: contains not printable characters */
    f<K, V>.e f9063;

    /* compiled from: MapCollections.java */
    final class a<T> implements Iterator<T> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final int f9064;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f9065;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f9066;

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean f9067 = false;

        a(int i5) {
            this.f9064 = i5;
            this.f9065 = f.this.mo9771();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9066 < this.f9065;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t5 = (T) f.this.mo9769(this.f9066, this.f9064);
            this.f9066++;
            this.f9067 = true;
            return t5;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9067) {
                throw new IllegalStateException();
            }
            int i5 = this.f9066 - 1;
            this.f9066 = i5;
            this.f9065--;
            this.f9067 = false;
            f.this.mo9775(i5);
        }
    }

    /* compiled from: MapCollections.java */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo9771 = f.this.mo9771();
            for (Map.Entry<K, V> entry : collection) {
                f.this.mo9774(entry.getKey(), entry.getValue());
            }
            return mo9771 != f.this.mo9771();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.mo9768();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo9772 = f.this.mo9772(entry.getKey());
            if (mo9772 < 0) {
                return false;
            }
            return m.c.m9787(f.this.mo9769(mo9772, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.m9812(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i5 = 0;
            for (int mo9771 = f.this.mo9771() - 1; mo9771 >= 0; mo9771--) {
                Object mo9769 = f.this.mo9769(mo9771, 0);
                Object mo97692 = f.this.mo9769(mo9771, 1);
                i5 += (mo9769 == null ? 0 : mo9769.hashCode()) ^ (mo97692 == null ? 0 : mo97692.hashCode());
            }
            return i5;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.mo9771() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.mo9771();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.mo9768();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.mo9772(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return f.m9811(f.this.mo9770(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.m9812(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i5 = 0;
            for (int mo9771 = f.this.mo9771() - 1; mo9771 >= 0; mo9771--) {
                Object mo9769 = f.this.mo9769(mo9771, 0);
                i5 += mo9769 == null ? 0 : mo9769.hashCode();
            }
            return i5;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.mo9771() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo9772 = f.this.mo9772(obj);
            if (mo9772 < 0) {
                return false;
            }
            f.this.mo9775(mo9772);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return f.m9813(f.this.mo9770(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return f.m9814(f.this.mo9770(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.mo9771();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return f.this.m9818(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.m9819(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: ʾ, reason: contains not printable characters */
        int f9071;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f9073 = false;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f9072 = -1;

        d() {
            this.f9071 = f.this.mo9771() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f9073) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m.c.m9787(entry.getKey(), f.this.mo9769(this.f9072, 0)) && m.c.m9787(entry.getValue(), f.this.mo9769(this.f9072, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f9073) {
                return (K) f.this.mo9769(this.f9072, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f9073) {
                return (V) f.this.mo9769(this.f9072, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9072 < this.f9071;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f9073) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo9769 = f.this.mo9769(this.f9072, 0);
            Object mo97692 = f.this.mo9769(this.f9072, 1);
            return (mo9769 == null ? 0 : mo9769.hashCode()) ^ (mo97692 != null ? mo97692.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9073) {
                throw new IllegalStateException();
            }
            f.this.mo9775(this.f9072);
            this.f9072--;
            this.f9071--;
            this.f9073 = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            if (this.f9073) {
                return (V) f.this.mo9776(this.f9072, v5);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Iterator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f9072++;
            this.f9073 = true;
            return this;
        }
    }

    /* compiled from: MapCollections.java */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            f.this.mo9768();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return f.this.mo9773(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return f.this.mo9771() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo9773 = f.this.mo9773(obj);
            if (mo9773 < 0) {
                return false;
            }
            f.this.mo9775(mo9773);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo9771 = f.this.mo9771();
            int i5 = 0;
            boolean z5 = false;
            while (i5 < mo9771) {
                if (collection.contains(f.this.mo9769(i5, 1))) {
                    f.this.mo9775(i5);
                    i5--;
                    mo9771--;
                    z5 = true;
                }
                i5++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo9771 = f.this.mo9771();
            int i5 = 0;
            boolean z5 = false;
            while (i5 < mo9771) {
                if (!collection.contains(f.this.mo9769(i5, 1))) {
                    f.this.mo9775(i5);
                    i5--;
                    mo9771--;
                    z5 = true;
                }
                i5++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public int size() {
            return f.this.mo9771();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return f.this.m9818(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.m9819(tArr, 1);
        }
    }

    f() {
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static <K, V> boolean m9811(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static <T> boolean m9812(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static <K, V> boolean m9813(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static <K, V> boolean m9814(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: ʻ */
    protected abstract void mo9768();

    /* renamed from: ʼ */
    protected abstract Object mo9769(int i5, int i6);

    /* renamed from: ʽ */
    protected abstract Map<K, V> mo9770();

    /* renamed from: ʾ */
    protected abstract int mo9771();

    /* renamed from: ʿ */
    protected abstract int mo9772(Object obj);

    /* renamed from: ˆ */
    protected abstract int mo9773(Object obj);

    /* renamed from: ˈ */
    protected abstract void mo9774(K k5, V v5);

    /* renamed from: ˉ */
    protected abstract void mo9775(int i5);

    /* renamed from: ˊ */
    protected abstract V mo9776(int i5, V v5);

    /* renamed from: ˏ, reason: contains not printable characters */
    public Set<Map.Entry<K, V>> m9815() {
        if (this.f9061 == null) {
            this.f9061 = new b();
        }
        return this.f9061;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public Set<K> m9816() {
        if (this.f9062 == null) {
            this.f9062 = new c();
        }
        return this.f9062;
    }

    /* renamed from: י, reason: contains not printable characters */
    public Collection<V> m9817() {
        if (this.f9063 == null) {
            this.f9063 = new e();
        }
        return this.f9063;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public Object[] m9818(int i5) {
        int mo9771 = mo9771();
        Object[] objArr = new Object[mo9771];
        for (int i6 = 0; i6 < mo9771; i6++) {
            objArr[i6] = mo9769(i6, i5);
        }
        return objArr;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public <T> T[] m9819(T[] tArr, int i5) {
        int mo9771 = mo9771();
        if (tArr.length < mo9771) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo9771));
        }
        for (int i6 = 0; i6 < mo9771; i6++) {
            tArr[i6] = mo9769(i6, i5);
        }
        if (tArr.length > mo9771) {
            tArr[mo9771] = null;
        }
        return tArr;
    }
}
