package m4;

import v3.j;

/* compiled from: DebugStrings.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class x {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final String m10279(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final String m10280(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final String m10281(x3.c<?> cVar) {
        Object m12380;
        if (cVar instanceof q4.f) {
            return cVar.toString();
        }
        try {
            j.a aVar = v3.j.f11729;
            m12380 = v3.j.m12380(cVar + '@' + m10280(cVar));
        } catch (Throwable th) {
            j.a aVar2 = v3.j.f11729;
            m12380 = v3.j.m12380(v3.k.m12382(th));
        }
        if (v3.j.m12381(m12380) != null) {
            m12380 = cVar.getClass().getName() + '@' + m10280(cVar);
        }
        return (String) m12380;
    }
}
