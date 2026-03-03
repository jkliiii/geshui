package f1;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i implements f1.b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final g<a, Object> f7673 = new g<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final b f7674 = new b();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f7675 = new HashMap();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Map<Class<?>, f1.a<?>> f7676 = new HashMap();

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f7677;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f7678;

    /* compiled from: LruArrayPool.java */
    private static final class a implements m {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final b f7679;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f7680;

        /* renamed from: ʽ, reason: contains not printable characters */
        private Class<?> f7681;

        a(b bVar) {
            this.f7679 = bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7680 == aVar.f7680 && this.f7681 == aVar.f7681;
        }

        public int hashCode() {
            int i5 = this.f7680 * 31;
            Class<?> cls = this.f7681;
            return i5 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f7680 + "array=" + this.f7681 + '}';
        }

        @Override // f1.m
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo8556() {
            this.f7679.m8525(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m8557(int i5, Class<?> cls) {
            this.f7680 = i5;
            this.f7681 = cls;
        }
    }

    /* compiled from: LruArrayPool.java */
    private static final class b extends c<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f1.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public a mo8523() {
            return new a(this);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        a m8559(int i5, Class<?> cls) {
            a m8524 = m8524();
            m8524.m8557(i5, cls);
            return m8524;
        }
    }

    public i(int i5) {
        this.f7677 = i5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m8545(int i5, Class<?> cls) {
        NavigableMap<Integer, Integer> m8552 = m8552(cls);
        Integer num = m8552.get(Integer.valueOf(i5));
        if (num != null) {
            if (num.intValue() == 1) {
                m8552.remove(Integer.valueOf(i5));
                return;
            } else {
                m8552.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i5 + ", this: " + this);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m8546() {
        m8547(this.f7677);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m8547(int i5) {
        while (this.f7678 > i5) {
            Object m8539 = this.f7673.m8539();
            y1.k.m12893(m8539);
            f1.a m8548 = m8548(m8539);
            this.f7678 -= m8548.mo8517(m8539) * m8548.mo8518();
            m8545(m8548.mo8517(m8539), m8539.getClass());
            if (Log.isLoggable(m8548.mo8516(), 2)) {
                Log.v(m8548.mo8516(), "evicted: " + m8548.mo8517(m8539));
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private <T> f1.a<T> m8548(T t5) {
        return m8549(t5.getClass());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private <T> f1.a<T> m8549(Class<T> cls) {
        f1.a<T> aVar = (f1.a) this.f7676.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                aVar = new f();
            }
            this.f7676.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private <T> T m8550(a aVar) {
        return (T) this.f7673.m8537(aVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private <T> T m8551(a aVar, Class<T> cls) {
        f1.a<T> m8549 = m8549(cls);
        T t5 = (T) m8550(aVar);
        if (t5 != null) {
            this.f7678 -= m8549.mo8517(t5) * m8549.mo8518();
            m8545(m8549.mo8517(t5), cls);
        }
        if (t5 != null) {
            return t5;
        }
        if (Log.isLoggable(m8549.mo8516(), 2)) {
            Log.v(m8549.mo8516(), "Allocated " + aVar.f7680 + " bytes");
        }
        return m8549.newArray(aVar.f7680);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private NavigableMap<Integer, Integer> m8552(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f7675.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f7675.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean m8553() {
        int i5 = this.f7678;
        return i5 == 0 || this.f7677 / i5 >= 2;
    }

    /* renamed from: י, reason: contains not printable characters */
    private boolean m8554(int i5) {
        return i5 <= this.f7677 / 2;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean m8555(int i5, Integer num) {
        return num != null && (m8553() || num.intValue() <= i5 * 8);
    }

    @Override // f1.b
    public synchronized <T> void put(T t5) {
        Class<?> cls = t5.getClass();
        f1.a<T> m8549 = m8549(cls);
        int mo8517 = m8549.mo8517(t5);
        int mo8518 = m8549.mo8518() * mo8517;
        if (m8554(mo8518)) {
            a m8559 = this.f7674.m8559(mo8517, cls);
            this.f7673.m8538(m8559, t5);
            NavigableMap<Integer, Integer> m8552 = m8552(cls);
            Integer num = m8552.get(Integer.valueOf(m8559.f7680));
            Integer valueOf = Integer.valueOf(m8559.f7680);
            int i5 = 1;
            if (num != null) {
                i5 = 1 + num.intValue();
            }
            m8552.put(valueOf, Integer.valueOf(i5));
            this.f7678 += mo8518;
            m8546();
        }
    }

    @Override // f1.b
    /* renamed from: ʻ */
    public synchronized void mo8519(int i5) {
        try {
            if (i5 >= 40) {
                mo8520();
            } else if (i5 >= 20 || i5 == 15) {
                m8547(this.f7677 / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f1.b
    /* renamed from: ʼ */
    public synchronized void mo8520() {
        m8547(0);
    }

    @Override // f1.b
    /* renamed from: ʽ */
    public synchronized <T> T mo8521(int i5, Class<T> cls) {
        return (T) m8551(this.f7674.m8559(i5, cls), cls);
    }

    @Override // f1.b
    /* renamed from: ʾ */
    public synchronized <T> T mo8522(int i5, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = m8552(cls).ceilingKey(Integer.valueOf(i5));
        return (T) m8551(m8555(i5, ceilingKey) ? this.f7674.m8559(ceilingKey.intValue(), cls) : this.f7674.m8559(i5, cls), cls);
    }
}
