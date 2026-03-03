package y3;

import e4.p;
import f4.k;
import f4.t;
import x3.e;
import x3.f;
import z3.g;
import z3.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {

    /* compiled from: IntrinsicsJvm.kt */
    public static final class a extends i {

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f12479;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ p f12480;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ Object f12481;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3.c cVar, p pVar, Object obj) {
            super(cVar);
            this.f12480 = pVar;
            this.f12481 = obj;
            k.m8621(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // z3.a
        /* renamed from: ˋ */
        protected Object mo3059(Object obj) {
            int i5 = this.f12479;
            if (i5 == 0) {
                this.f12479 = 1;
                v3.k.m12383(obj);
                k.m8621(this.f12480, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) t.m8645(this.f12480, 2)).mo3058(this.f12481, this);
            }
            if (i5 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f12479 = 2;
            v3.k.m12383(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    public static final class b extends z3.c {

        /* renamed from: ˈ, reason: contains not printable characters */
        private int f12482;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ p f12483;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ Object f12484;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3.c cVar, e eVar, p pVar, Object obj) {
            super(cVar, eVar);
            this.f12483 = pVar;
            this.f12484 = obj;
            k.m8621(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // z3.a
        /* renamed from: ˋ */
        protected Object mo3059(Object obj) {
            int i5 = this.f12482;
            if (i5 == 0) {
                this.f12482 = 1;
                v3.k.m12383(obj);
                k.m8621(this.f12483, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) t.m8645(this.f12483, 2)).mo3058(this.f12484, this);
            }
            if (i5 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f12482 = 2;
            v3.k.m12383(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻ, reason: contains not printable characters */
    public static <R, T> x3.c<v3.p> m12936(p<? super R, ? super x3.c<? super T>, ? extends Object> pVar, R r5, x3.c<? super T> cVar) {
        k.m8623(pVar, "<this>");
        k.m8623(cVar, "completion");
        x3.c<?> m13192 = g.m13192(cVar);
        if (pVar instanceof z3.a) {
            return ((z3.a) pVar).mo3057(r5, m13192);
        }
        e context = m13192.getContext();
        return context == f.f12391 ? new a(m13192, pVar, r5) : new b(m13192, context, pVar, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    public static <T> x3.c<T> m12937(x3.c<? super T> cVar) {
        x3.c<T> cVar2;
        k.m8623(cVar, "<this>");
        z3.c cVar3 = cVar instanceof z3.c ? (z3.c) cVar : null;
        return (cVar3 == null || (cVar2 = (x3.c<T>) cVar3.m13187()) == null) ? cVar : cVar2;
    }
}
