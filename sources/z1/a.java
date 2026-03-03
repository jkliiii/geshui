package z1;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final g<Object> f12762 = new C0183a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // z1.a.d
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public List<T> mo8383() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // z1.a.g
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo13140(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    public interface d<T> {
        /* renamed from: ʻ */
        T mo8383();
    }

    /* compiled from: FactoryPools.java */
    private static final class e<T> implements androidx.core.util.e<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final d<T> f12763;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final g<T> f12764;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final androidx.core.util.e<T> f12765;

        e(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
            this.f12765 = eVar;
            this.f12763 = dVar;
            this.f12764 = gVar;
        }

        @Override // androidx.core.util.e
        /* renamed from: ʻ */
        public boolean mo2574(T t5) {
            if (t5 instanceof f) {
                ((f) t5).mo8343().mo13150(true);
            }
            this.f12764.mo13140(t5);
            return this.f12765.mo2574(t5);
        }

        @Override // androidx.core.util.e
        /* renamed from: ʼ */
        public T mo2575() {
            T mo2575 = this.f12765.mo2575();
            if (mo2575 == null) {
                mo2575 = this.f12763.mo8383();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + mo2575.getClass());
                }
            }
            if (mo2575 instanceof f) {
                mo2575.mo8343().mo13150(false);
            }
            return (T) mo2575;
        }
    }

    /* compiled from: FactoryPools.java */
    public interface f {
        /* renamed from: ˆ */
        z1.c mo8343();
    }

    /* compiled from: FactoryPools.java */
    public interface g<T> {
        /* renamed from: ʻ */
        void mo13140(T t5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static <T extends f> androidx.core.util.e<T> m13134(androidx.core.util.e<T> eVar, d<T> dVar) {
        return m13135(eVar, dVar, m13136());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static <T> androidx.core.util.e<T> m13135(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
        return new e(eVar, dVar, gVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static <T> g<T> m13136() {
        return (g<T>) f12762;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static <T extends f> androidx.core.util.e<T> m13137(int i5, d<T> dVar) {
        return m13134(new androidx.core.util.g(i5), dVar);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static <T> androidx.core.util.e<List<T>> m13138() {
        return m13139(20);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static <T> androidx.core.util.e<List<T>> m13139(int i5) {
        return m13135(new androidx.core.util.g(i5), new b(), new c());
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: z1.a$a, reason: collision with other inner class name */
    class C0183a implements g<Object> {
        C0183a() {
        }

        @Override // z1.a.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo13140(Object obj) {
        }
    }
}
