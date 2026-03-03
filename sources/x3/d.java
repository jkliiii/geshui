package x3;

import f4.k;
import x3.e;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface d extends e.a {

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final b f12389 = b.f12390;

    /* compiled from: ContinuationInterceptor.kt */
    public static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static <E extends e.a> E m12819(d dVar, e.b<E> bVar) {
            k.m8623(bVar, "key");
            if (!(bVar instanceof x3.b)) {
                if (d.f12389 != bVar) {
                    return null;
                }
                k.m8621(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            x3.b bVar2 = (x3.b) bVar;
            if (!bVar2.m12817(dVar.getKey())) {
                return null;
            }
            E e5 = (E) bVar2.m12818(dVar);
            if (e5 instanceof e.a) {
                return e5;
            }
            return null;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    public static final class b implements e.b<d> {

        /* renamed from: ʾ, reason: contains not printable characters */
        static final /* synthetic */ b f12390 = new b();

        private b() {
        }
    }

    /* renamed from: ʼ */
    void mo10266(c<?> cVar);

    /* renamed from: י */
    <T> c<T> mo10268(c<? super T> cVar);
}
