package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final e.a<?> f5221 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<Class<?>, e.a<?>> f5222 = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʻ */
        public Class<Object> mo6129() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʼ */
        public e<Object> mo6130(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized <T> e<T> m6147(T t5) {
        e.a<?> aVar;
        y1.k.m12893(t5);
        aVar = this.f5222.get(t5.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it = this.f5222.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a<?> next = it.next();
                if (next.mo6129().isAssignableFrom(t5.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f5221;
        }
        return (e<T>) aVar.mo6130(t5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized void m6148(e.a<?> aVar) {
        this.f5222.put(aVar.mo6129(), aVar);
    }

    /* compiled from: DataRewinderRegistry.java */
    private static final class b implements e<Object> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Object f5223;

        b(Object obj) {
            this.f5223 = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        /* renamed from: ʻ */
        public Object mo6126() {
            return this.f5223;
        }

        @Override // com.bumptech.glide.load.data.e
        /* renamed from: ʼ */
        public void mo6127() {
        }
    }
}
