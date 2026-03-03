package f1;

import f1.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g<K extends m, V> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final a<K, V> f7667 = new a<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Map<K, a<K, V>> f7668 = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    private static class a<K, V> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final K f7669;

        /* renamed from: ʼ, reason: contains not printable characters */
        private List<V> f7670;

        /* renamed from: ʽ, reason: contains not printable characters */
        a<K, V> f7671;

        /* renamed from: ʾ, reason: contains not printable characters */
        a<K, V> f7672;

        a() {
            this(null);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m8540(V v5) {
            if (this.f7670 == null) {
                this.f7670 = new ArrayList();
            }
            this.f7670.add(v5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public V m8541() {
            int m8542 = m8542();
            if (m8542 > 0) {
                return this.f7670.remove(m8542 - 1);
            }
            return null;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m8542() {
            List<V> list = this.f7670;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k5) {
            this.f7672 = this;
            this.f7671 = this;
            this.f7669 = k5;
        }
    }

    g() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m8533(a<K, V> aVar) {
        m8535(aVar);
        a<K, V> aVar2 = this.f7667;
        aVar.f7672 = aVar2;
        aVar.f7671 = aVar2.f7671;
        m8536(aVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m8534(a<K, V> aVar) {
        m8535(aVar);
        a<K, V> aVar2 = this.f7667;
        aVar.f7672 = aVar2.f7672;
        aVar.f7671 = aVar2;
        m8536(aVar);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static <K, V> void m8535(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f7672;
        aVar2.f7671 = aVar.f7671;
        aVar.f7671.f7672 = aVar2;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static <K, V> void m8536(a<K, V> aVar) {
        aVar.f7671.f7672 = aVar;
        aVar.f7672.f7671 = aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f7667.f7671;
        boolean z5 = false;
        while (!aVar.equals(this.f7667)) {
            sb.append('{');
            sb.append(aVar.f7669);
            sb.append(':');
            sb.append(aVar.m8542());
            sb.append("}, ");
            aVar = aVar.f7671;
            z5 = true;
        }
        if (z5) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public V m8537(K k5) {
        a<K, V> aVar = this.f7668.get(k5);
        if (aVar == null) {
            aVar = new a<>(k5);
            this.f7668.put(k5, aVar);
        } else {
            k5.mo8556();
        }
        m8533(aVar);
        return aVar.m8541();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8538(K k5, V v5) {
        a<K, V> aVar = this.f7668.get(k5);
        if (aVar == null) {
            aVar = new a<>(k5);
            m8534(aVar);
            this.f7668.put(k5, aVar);
        } else {
            k5.mo8556();
        }
        aVar.m8540(v5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public V m8539() {
        for (a aVar = this.f7667.f7672; !aVar.equals(this.f7667); aVar = aVar.f7672) {
            V v5 = (V) aVar.m8541();
            if (v5 != null) {
                return v5;
            }
            m8535(aVar);
            this.f7668.remove(aVar.f7669);
            ((m) aVar.f7669).mo8556();
        }
        return null;
    }
}
