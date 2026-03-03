package m4;

import java.util.concurrent.CancellationException;
import x3.e;

/* compiled from: Job.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface o0 extends e.a {

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final b f9367 = b.f9368;

    /* compiled from: Job.kt */
    public static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static <R> R m10197(o0 o0Var, R r5, e4.p<? super R, ? super e.a, ? extends R> pVar) {
            return (R) e.a.C0176a.m12820(o0Var, r5, pVar);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static <E extends e.a> E m10198(o0 o0Var, e.b<E> bVar) {
            return (E) e.a.C0176a.m12821(o0Var, bVar);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static /* synthetic */ c0 m10199(o0 o0Var, boolean z5, boolean z6, e4.l lVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i5 & 1) != 0) {
                z5 = false;
            }
            if ((i5 & 2) != 0) {
                z6 = true;
            }
            return o0Var.mo10196(z5, z6, lVar);
        }
    }

    /* compiled from: Job.kt */
    public static final class b implements e.b<o0> {

        /* renamed from: ʾ, reason: contains not printable characters */
        static final /* synthetic */ b f9368 = new b();

        private b() {
        }
    }

    /* renamed from: ʻ */
    boolean mo10105();

    /* renamed from: ˋ, reason: contains not printable characters */
    CancellationException mo10195();

    /* renamed from: ˑ, reason: contains not printable characters */
    c0 mo10196(boolean z5, boolean z6, e4.l<? super Throwable, v3.p> lVar);
}
