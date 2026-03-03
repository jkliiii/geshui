package k4;

import f4.k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import v3.j;
import v3.p;

/* compiled from: SequenceBuilder.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class c<T> extends d<T> implements Iterator<T>, x3.c<p> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f8894;

    /* renamed from: ʿ, reason: contains not printable characters */
    private T f8895;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Iterator<? extends T> f8896;

    /* renamed from: ˈ, reason: contains not printable characters */
    private x3.c<? super p> f8897;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Throwable m9536() {
        int i5 = this.f8894;
        if (i5 == 4) {
            return new NoSuchElementException();
        }
        if (i5 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8894);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private final T m9537() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // x3.c
    public x3.e getContext() {
        return x3.f.f12391;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i5 = this.f8894;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        return true;
                    }
                    if (i5 == 4) {
                        return false;
                    }
                    throw m9536();
                }
                Iterator<? extends T> it = this.f8896;
                k.m8620(it);
                if (it.hasNext()) {
                    this.f8894 = 2;
                    return true;
                }
                this.f8896 = null;
            }
            this.f8894 = 5;
            x3.c<? super p> cVar = this.f8897;
            k.m8620(cVar);
            this.f8897 = null;
            j.a aVar = v3.j.f11729;
            cVar.mo9541(v3.j.m12380(p.f11735));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i5 = this.f8894;
        if (i5 == 0 || i5 == 1) {
            return m9537();
        }
        if (i5 == 2) {
            this.f8894 = 1;
            Iterator<? extends T> it = this.f8896;
            k.m8620(it);
            return it.next();
        }
        if (i5 != 3) {
            throw m9536();
        }
        this.f8894 = 0;
        T t5 = this.f8895;
        this.f8895 = null;
        return t5;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // k4.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public Object mo9538(T t5, x3.c<? super p> cVar) {
        this.f8895 = t5;
        this.f8894 = 3;
        this.f8897 = cVar;
        Object m12938 = y3.d.m12938();
        if (m12938 == y3.d.m12938()) {
            z3.g.m13194(cVar);
        }
        return m12938 == y3.d.m12938() ? m12938 : p.f11735;
    }

    @Override // k4.d
    /* renamed from: ʼ, reason: contains not printable characters */
    public Object mo9539(Iterator<? extends T> it, x3.c<? super p> cVar) {
        if (!it.hasNext()) {
            return p.f11735;
        }
        this.f8896 = it;
        this.f8894 = 2;
        this.f8897 = cVar;
        Object m12938 = y3.d.m12938();
        if (m12938 == y3.d.m12938()) {
            z3.g.m13194(cVar);
        }
        return m12938 == y3.d.m12938() ? m12938 : p.f11735;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final void m9540(x3.c<? super p> cVar) {
        this.f8897 = cVar;
    }

    @Override // x3.c
    /* renamed from: ˈ, reason: contains not printable characters */
    public void mo9541(Object obj) {
        v3.k.m12383(obj);
        this.f8894 = 4;
    }
}
