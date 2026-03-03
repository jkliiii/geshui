package i1;

import com.bumptech.glide.i;
import i1.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final c f8527 = new c();

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final o<Object, Object> f8528 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<b<?, ?>> f8529;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final c f8530;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Set<b<?, ?>> f8531;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final androidx.core.util.e<List<Throwable>> f8532;

    /* compiled from: MultiModelLoaderFactory.java */
    private static class a implements o<Object, Object> {
        a() {
        }

        @Override // i1.o
        /* renamed from: ʻ */
        public o.a<Object> mo9113(Object obj, int i5, int i6, c1.h hVar) {
            return null;
        }

        @Override // i1.o
        /* renamed from: ʼ */
        public boolean mo9114(Object obj) {
            return false;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    private static class b<Model, Data> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Class<Model> f8533;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Class<Data> f8534;

        /* renamed from: ʽ, reason: contains not printable characters */
        final p<? extends Model, ? extends Data> f8535;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f8533 = cls;
            this.f8534 = cls2;
            this.f8535 = pVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m9193(Class<?> cls) {
            return this.f8533.isAssignableFrom(cls);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m9194(Class<?> cls, Class<?> cls2) {
            return m9193(cls) && this.f8534.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    static class c {
        c() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public <Model, Data> r<Model, Data> m9195(List<o<Model, Data>> list, androidx.core.util.e<List<Throwable>> eVar) {
            return new r<>(list, eVar);
        }
    }

    public s(androidx.core.util.e<List<Throwable>> eVar) {
        this(eVar, f8527);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private <Model, Data> void m9186(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar, boolean z5) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f8529;
        list.add(z5 ? list.size() : 0, bVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private <Model, Data> o<Model, Data> m9187(b<?, ?> bVar) {
        return (o) y1.k.m12893(bVar.f8535.mo9118(this));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static <Model, Data> o<Model, Data> m9188() {
        return (o<Model, Data>) f8528;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    synchronized <Model, Data> void m9189(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        m9186(cls, cls2, pVar, true);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized <Model, Data> o<Model, Data> m9190(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (b<?, ?> bVar : this.f8529) {
                if (this.f8531.contains(bVar)) {
                    z5 = true;
                } else if (bVar.m9194(cls, cls2)) {
                    this.f8531.add(bVar);
                    arrayList.add(m9187(bVar));
                    this.f8531.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f8530.m9195(arrayList, this.f8532);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z5) {
                throw new i.c((Class<?>) cls, (Class<?>) cls2);
            }
            return m9188();
        } catch (Throwable th) {
            this.f8531.clear();
            throw th;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    synchronized <Model> List<o<Model, ?>> m9191(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f8529) {
                if (!this.f8531.contains(bVar) && bVar.m9193(cls)) {
                    this.f8531.add(bVar);
                    arrayList.add(m9187(bVar));
                    this.f8531.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f8531.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    synchronized List<Class<?>> m9192(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f8529) {
            if (!arrayList.contains(bVar.f8534) && bVar.m9193(cls)) {
                arrayList.add(bVar.f8534);
            }
        }
        return arrayList;
    }

    s(androidx.core.util.e<List<Throwable>> eVar, c cVar) {
        this.f8529 = new ArrayList();
        this.f8531 = new HashSet();
        this.f8532 = eVar;
        this.f8530 = cVar;
    }
}
