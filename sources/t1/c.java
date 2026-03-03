package t1;

import e1.i;
import e1.t;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import q1.g;
import y1.j;

/* compiled from: LoadPathCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final t<?, ?, ?> f11264 = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final m.a<j, t<?, ?, ?>> f11265 = new m.a<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final AtomicReference<j> f11266 = new AtomicReference<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private j m12030(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f11266.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.m12889(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> m12031(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        j m12030 = m12030(cls, cls2, cls3);
        synchronized (this.f11265) {
            tVar = (t) this.f11265.get(m12030);
        }
        this.f11266.set(m12030);
        return tVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m12032(t<?, ?, ?> tVar) {
        return f11264.equals(tVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m12033(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f11265) {
            m.a<j, t<?, ?, ?>> aVar = this.f11265;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f11264;
            }
            aVar.put(jVar, tVar);
        }
    }
}
