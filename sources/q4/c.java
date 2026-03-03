package q4;

import java.util.Collection;
import java.util.ServiceLoader;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Collection<m4.u> f10628 = k4.j.m9551(k4.h.m9548(ServiceLoader.load(m4.u.class, m4.u.class.getClassLoader()).iterator()));

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final Collection<m4.u> m11480() {
        return f10628;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final void m11481(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
