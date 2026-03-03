package x3;

import e4.p;
import f4.k;

/* compiled from: CoroutineContext.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface e {

    /* compiled from: CoroutineContext.kt */
    public interface a extends e {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: x3.e$a$a, reason: collision with other inner class name */
        public static final class C0176a {
            /* renamed from: ʻ, reason: contains not printable characters */
            public static <R> R m12820(a aVar, R r5, p<? super R, ? super a, ? extends R> pVar) {
                k.m8623(pVar, "operation");
                return pVar.mo3058(r5, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: ʼ, reason: contains not printable characters */
            public static <E extends a> E m12821(a aVar, b<E> bVar) {
                k.m8623(bVar, "key");
                if (!k.m8619(aVar.getKey(), bVar)) {
                    return null;
                }
                k.m8621(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }
        }

        b<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface b<E extends a> {
    }

    /* renamed from: ˆ */
    <E extends a> E mo10126(b<E> bVar);

    /* renamed from: ˎ */
    <R> R mo10127(R r5, p<? super R, ? super a, ? extends R> pVar);
}
