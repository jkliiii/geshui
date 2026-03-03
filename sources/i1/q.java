package i1;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class q {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final s f8514;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final a f8515;

    /* compiled from: ModelLoaderRegistry.java */
    private static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Map<Class<?>, C0117a<?>> f8516 = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: i1.q$a$a, reason: collision with other inner class name */
        private static class C0117a<Model> {

            /* renamed from: ʻ, reason: contains not printable characters */
            final List<o<Model, ?>> f8517;

            public C0117a(List<o<Model, ?>> list) {
                this.f8517 = list;
            }
        }

        a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m9182() {
            this.f8516.clear();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public <Model> List<o<Model, ?>> m9183(Class<Model> cls) {
            C0117a<?> c0117a = this.f8516.get(cls);
            if (c0117a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c0117a.f8517;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public <Model> void m9184(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f8516.put(cls, new C0117a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(androidx.core.util.e<List<Throwable>> eVar) {
        this(new s(eVar));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static <A> Class<A> m9177(A a6) {
        return (Class<A>) a6.getClass();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private synchronized <A> List<o<A, ?>> m9178(Class<A> cls) {
        List<o<A, ?>> m9183;
        m9183 = this.f8515.m9183(cls);
        if (m9183 == null) {
            m9183 = Collections.unmodifiableList(this.f8514.m9191(cls));
            this.f8515.m9184(cls, m9183);
        }
        return m9183;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized <Model, Data> void m9179(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f8514.m9189(cls, cls2, pVar);
        this.f8515.m9182();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public synchronized List<Class<?>> m9180(Class<?> cls) {
        return this.f8514.m9192(cls);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public <A> List<o<A, ?>> m9181(A a6) {
        List<o<A, ?>> m9178 = m9178(m9177(a6));
        if (m9178.isEmpty()) {
            throw new i.c(a6);
        }
        int size = m9178.size();
        List<o<A, ?>> emptyList = Collections.emptyList();
        boolean z5 = true;
        for (int i5 = 0; i5 < size; i5++) {
            o<A, ?> oVar = m9178.get(i5);
            if (oVar.mo9114(a6)) {
                if (z5) {
                    emptyList = new ArrayList<>(size - i5);
                    z5 = false;
                }
                emptyList.add(oVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new i.c(a6, m9178);
        }
        return emptyList;
    }

    private q(s sVar) {
        this.f8515 = new a();
        this.f8514 = sVar;
    }
}
