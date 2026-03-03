package t1;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import y1.j;

/* compiled from: ModelToResourceClassCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final AtomicReference<j> f11267 = new AtomicReference<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final m.a<j, List<Class<?>>> f11268 = new m.a<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public List<Class<?>> m12034(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f11267.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.m12889(cls, cls2, cls3);
        }
        synchronized (this.f11268) {
            list = this.f11268.get(andSet);
        }
        this.f11267.set(andSet);
        return list;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m12035(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f11268) {
            this.f11268.put(new j(cls, cls2, cls3), list);
        }
    }
}
