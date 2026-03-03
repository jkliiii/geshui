package q1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<a<?, ?>> f10618 = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    private static final class a<Z, R> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Class<Z> f10619;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Class<R> f10620;

        /* renamed from: ʽ, reason: contains not printable characters */
        final e<Z, R> f10621;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f10619 = cls;
            this.f10620 = cls2;
            this.f10621 = eVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m11472(Class<?> cls, Class<?> cls2) {
            return this.f10619.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f10620);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized <Z, R> e<Z, R> m11469(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.m11473();
        }
        for (a<?, ?> aVar : this.f10618) {
            if (aVar.m11472(cls, cls2)) {
                return (e<Z, R>) aVar.f10621;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized <Z, R> List<Class<R>> m11470(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f10618) {
            if (aVar.m11472(cls, cls2) && !arrayList.contains(aVar.f10620)) {
                arrayList.add(aVar.f10620);
            }
        }
        return arrayList;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public synchronized <Z, R> void m11471(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f10618.add(new a<>(cls, cls2, eVar));
    }
}
