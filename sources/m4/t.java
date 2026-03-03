package m4;

import x3.d;
import x3.e;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class t extends x3.a implements x3.d {

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final a f9383 = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends x3.b<x3.d, t> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: m4.t$a$a, reason: collision with other inner class name */
        static final class C0134a extends f4.l implements e4.l<e.a, t> {

            /* renamed from: ʿ, reason: contains not printable characters */
            public static final C0134a f9384 = new C0134a();

            C0134a() {
                super(1);
            }

            @Override // e4.l
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final t mo430(e.a aVar) {
                if (aVar instanceof t) {
                    return (t) aVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }

        private a() {
            super(x3.d.f12389, C0134a.f9384);
        }
    }

    public t() {
        super(x3.d.f12389);
    }

    public String toString() {
        return x.m10279(this) + '@' + x.m10280(this);
    }

    @Override // x3.d
    /* renamed from: ʼ, reason: contains not printable characters */
    public final void mo10266(x3.c<?> cVar) {
        f4.k.m8621(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((q4.f) cVar).m11486();
    }

    /* renamed from: ʾ */
    public abstract void mo10154(x3.e eVar, Runnable runnable);

    @Override // x3.a, x3.e
    /* renamed from: ˆ */
    public <E extends e.a> E mo10126(e.b<E> bVar) {
        return (E) d.a.m12819(this, bVar);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m10267(x3.e eVar) {
        return true;
    }

    @Override // x3.d
    /* renamed from: י, reason: contains not printable characters */
    public final <T> x3.c<T> mo10268(x3.c<? super T> cVar) {
        return new q4.f(this, cVar);
    }
}
