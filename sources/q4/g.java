package q4;

import java.util.concurrent.CancellationException;
import m4.a1;
import m4.e0;
import m4.o0;
import m4.z0;
import v3.j;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final o f10635 = new o("UNDEFINED");

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final o f10636 = new o("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    public static final <T> void m11488(x3.c<? super T> cVar, Object obj, e4.l<? super Throwable, v3.p> lVar) {
        boolean z5;
        if (!(cVar instanceof f)) {
            cVar.mo9541(obj);
            return;
        }
        f fVar = (f) cVar;
        Object m10201 = m4.r.m10201(obj, lVar);
        if (fVar.f10631.m10267(fVar.getContext())) {
            fVar.f10633 = m10201;
            fVar.f9330 = 1;
            fVar.f10631.mo10154(fVar.getContext(), fVar);
            return;
        }
        e0 m10291 = z0.f9398.m10291();
        if (m10291.m10139()) {
            fVar.f10633 = m10201;
            fVar.f9330 = 1;
            m10291.m10136(fVar);
            return;
        }
        m10291.m10138(true);
        try {
            o0 o0Var = (o0) fVar.getContext().mo10126(o0.f9367);
            if (o0Var == null || o0Var.mo10105()) {
                z5 = false;
            } else {
                CancellationException mo10195 = o0Var.mo10195();
                fVar.mo10113(m10201, mo10195);
                j.a aVar = v3.j.f11729;
                fVar.mo9541(v3.j.m12380(v3.k.m12382(mo10195)));
                z5 = true;
            }
            if (!z5) {
                x3.c<T> cVar2 = fVar.f10632;
                Object obj2 = fVar.f10634;
                x3.e context = cVar2.getContext();
                Object m11537 = s.m11537(context, obj2);
                a1<?> m10208 = m11537 != s.f10656 ? m4.s.m10208(cVar2, context, m11537) : null;
                try {
                    fVar.f10632.mo9541(obj);
                    v3.p pVar = v3.p.f11735;
                    if (m10208 == null || m10208.m10119()) {
                        s.m11535(context, m11537);
                    }
                } catch (Throwable th) {
                    if (m10208 == null || m10208.m10119()) {
                        s.m11535(context, m11537);
                    }
                    throw th;
                }
            }
            while (m10291.m10141()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static /* synthetic */ void m11489(x3.c cVar, Object obj, e4.l lVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        m11488(cVar, obj, lVar);
    }
}
