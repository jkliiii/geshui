package t1;

import c1.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<String> f11269 = new ArrayList();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Map<String, List<a<?, ?>>> f11270 = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    private static class a<T, R> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Class<T> f11271;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Class<R> f11272;

        /* renamed from: ʽ, reason: contains not printable characters */
        final j<T, R> f11273;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f11271 = cls;
            this.f11272 = cls2;
            this.f11273 = jVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m12041(Class<?> cls, Class<?> cls2) {
            return this.f11271.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11272);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private synchronized List<a<?, ?>> m12036(String str) {
        List<a<?, ?>> list;
        if (!this.f11269.contains(str)) {
            this.f11269.add(str);
        }
        list = this.f11270.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f11270.put(str, list);
        }
        return list;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized <T, R> void m12037(String str, j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        m12036(str).add(new a<>(cls, cls2, jVar));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized <T, R> List<j<T, R>> m12038(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f11269.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f11270.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m12041(cls, cls2)) {
                        arrayList.add(aVar.f11273);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized <T, R> List<Class<R>> m12039(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f11269.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f11270.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m12041(cls, cls2) && !arrayList.contains(aVar.f11272)) {
                        arrayList.add(aVar.f11272);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public synchronized void m12040(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f11269);
        this.f11269.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f11269.add(it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f11269.add(str);
            }
        }
    }
}
