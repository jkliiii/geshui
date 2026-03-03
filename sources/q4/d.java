package q4;

import java.util.Iterator;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m11482(x3.e eVar, Throwable th) {
        Iterator<m4.u> it = c.m11480().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo10276(eVar, th);
            } catch (Throwable th2) {
                c.m11481(m4.v.m10278(th, th2));
            }
        }
        try {
            v3.b.m12373(th, new e(eVar));
        } catch (Throwable unused) {
        }
        c.m11481(th);
    }
}
