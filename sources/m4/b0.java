package m4;

import v3.j;

/* compiled from: DispatchedTask.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b0 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final <T> void m10121(a0<? super T> a0Var, int i5) {
        x3.c<? super T> mo10114 = a0Var.mo10114();
        boolean z5 = i5 == 4;
        if (z5 || !(mo10114 instanceof q4.f) || m10122(i5) != m10122(a0Var.f9330)) {
            m10124(a0Var, mo10114, z5);
            return;
        }
        t tVar = ((q4.f) mo10114).f10631;
        x3.e context = mo10114.getContext();
        if (tVar.m10267(context)) {
            tVar.mo10154(context, a0Var);
        } else {
            m10125(a0Var);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final boolean m10122(int i5) {
        return i5 == 1 || i5 == 2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final boolean m10123(int i5) {
        return i5 == 2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final <T> void m10124(a0<? super T> a0Var, x3.c<? super T> cVar, boolean z5) {
        Object mo10116;
        Object mo10118 = a0Var.mo10118();
        Throwable mo10115 = a0Var.mo10115(mo10118);
        if (mo10115 != null) {
            j.a aVar = v3.j.f11729;
            mo10116 = v3.k.m12382(mo10115);
        } else {
            j.a aVar2 = v3.j.f11729;
            mo10116 = a0Var.mo10116(mo10118);
        }
        Object m12380 = v3.j.m12380(mo10116);
        if (!z5) {
            cVar.mo9541(m12380);
            return;
        }
        f4.k.m8621(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        q4.f fVar = (q4.f) cVar;
        x3.c<T> cVar2 = fVar.f10632;
        Object obj = fVar.f10634;
        x3.e context = cVar2.getContext();
        Object m11537 = q4.s.m11537(context, obj);
        a1<?> m10208 = m11537 != q4.s.f10656 ? s.m10208(cVar2, context, m11537) : null;
        try {
            fVar.f10632.mo9541(m12380);
            v3.p pVar = v3.p.f11735;
        } finally {
            if (m10208 == null || m10208.m10119()) {
                q4.s.m11535(context, m11537);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final void m10125(a0<?> a0Var) {
        e0 m10291 = z0.f9398.m10291();
        if (m10291.m10139()) {
            m10291.m10136(a0Var);
            return;
        }
        m10291.m10138(true);
        try {
            m10124(a0Var, a0Var.mo10114(), true);
            do {
            } while (m10291.m10141());
        } finally {
            try {
            } finally {
            }
        }
    }
}
