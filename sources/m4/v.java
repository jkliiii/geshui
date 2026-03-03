package m4;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class v {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m10277(x3.e eVar, Throwable th) {
        try {
            u uVar = (u) eVar.mo10126(u.f9392);
            if (uVar != null) {
                uVar.mo10276(eVar, th);
            } else {
                q4.d.m11482(eVar, th);
            }
        } catch (Throwable th2) {
            q4.d.m11482(eVar, m10278(th, th2));
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final Throwable m10278(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        v3.b.m12373(runtimeException, th);
        return runtimeException;
    }
}
