package t1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<C0160a<?>> f11260 = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: t1.a$a, reason: collision with other inner class name */
    private static final class C0160a<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Class<T> f11261;

        /* renamed from: ʼ, reason: contains not printable characters */
        final c1.d<T> f11262;

        C0160a(Class<T> cls, c1.d<T> dVar) {
            this.f11261 = cls;
            this.f11262 = dVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m12027(Class<?> cls) {
            return this.f11261.isAssignableFrom(cls);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized <T> void m12025(Class<T> cls, c1.d<T> dVar) {
        this.f11260.add(new C0160a<>(cls, dVar));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized <T> c1.d<T> m12026(Class<T> cls) {
        for (C0160a<?> c0160a : this.f11260) {
            if (c0160a.m12027(cls)) {
                return (c1.d<T>) c0160a.f11262;
            }
        }
        return null;
    }
}
