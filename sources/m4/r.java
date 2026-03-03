package m4;

import v3.j;

/* compiled from: CompletionState.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class r {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final <T> Object m10200(Object obj, x3.c<? super T> cVar) {
        if (!(obj instanceof n)) {
            return v3.j.m12380(obj);
        }
        j.a aVar = v3.j.f11729;
        return v3.j.m12380(v3.k.m12382(((n) obj).f9363));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final <T> Object m10201(Object obj, e4.l<? super Throwable, v3.p> lVar) {
        Throwable m12381 = v3.j.m12381(obj);
        return m12381 == null ? lVar != null ? new o(obj, lVar) : obj : new n(m12381, false, 2, null);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final <T> Object m10202(Object obj, g<?> gVar) {
        Throwable m12381 = v3.j.m12381(obj);
        return m12381 == null ? obj : new n(m12381, false, 2, null);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static /* synthetic */ Object m10203(Object obj, e4.l lVar, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            lVar = null;
        }
        return m10201(obj, lVar);
    }
}
