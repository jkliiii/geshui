package t1;

import c1.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<a<?>> f11274 = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    private static final class a<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Class<T> f11275;

        /* renamed from: ʼ, reason: contains not printable characters */
        final k<T> f11276;

        a(Class<T> cls, k<T> kVar) {
            this.f11275 = cls;
            this.f11276 = kVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m12044(Class<?> cls) {
            return this.f11275.isAssignableFrom(cls);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized <Z> void m12042(Class<Z> cls, k<Z> kVar) {
        this.f11274.add(new a<>(cls, kVar));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized <Z> k<Z> m12043(Class<Z> cls) {
        int size = this.f11274.size();
        for (int i5 = 0; i5 < size; i5++) {
            a<?> aVar = this.f11274.get(i5);
            if (aVar.m12044(cls)) {
                return (k<Z>) aVar.f11276;
            }
        }
        return null;
    }
}
