package m4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import m4.f0;

/* compiled from: DefaultExecutor.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class y extends f0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final y f9395;

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final long f9396;

    static {
        Long l5;
        y yVar = new y();
        f9395 = yVar;
        e0.m10134(yVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f9396 = timeUnit.toNanos(l5.longValue());
    }

    private y() {
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private final synchronized void m10282() {
        if (m10284()) {
            debugStatus = 3;
            m10156();
            f4.k.m8621(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    private final boolean m10283() {
        return debugStatus == 4;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private final boolean m10284() {
        int i5 = debugStatus;
        return i5 == 2 || i5 == 3;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private final synchronized Thread m10285() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private final synchronized boolean m10286() {
        if (m10284()) {
            return false;
        }
        debugStatus = 1;
        f4.k.m8621(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private final void m10287() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m10158;
        z0.f9398.m10293(this);
        c.m10128();
        try {
            if (!m10286()) {
                if (m10158) {
                    return;
                } else {
                    return;
                }
            }
            long j5 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m10155 = m10155();
                if (m10155 == Long.MAX_VALUE) {
                    c.m10128();
                    long nanoTime = System.nanoTime();
                    if (j5 == Long.MAX_VALUE) {
                        j5 = f9396 + nanoTime;
                    }
                    long j6 = j5 - nanoTime;
                    if (j6 <= 0) {
                        _thread = null;
                        m10282();
                        c.m10128();
                        if (m10158()) {
                            return;
                        }
                        mo10130();
                        return;
                    }
                    m10155 = i4.f.m9259(m10155, j6);
                } else {
                    j5 = Long.MAX_VALUE;
                }
                if (m10155 > 0) {
                    if (m10284()) {
                        _thread = null;
                        m10282();
                        c.m10128();
                        if (m10158()) {
                            return;
                        }
                        mo10130();
                        return;
                    }
                    c.m10128();
                    LockSupport.parkNanos(this, m10155);
                }
            }
        } finally {
            _thread = null;
            m10282();
            c.m10128();
            if (!m10158()) {
                mo10130();
            }
        }
    }

    @Override // m4.f0
    /* renamed from: ʼʼ */
    public void mo10153(Runnable runnable) {
        if (m10283()) {
            m10287();
        }
        super.mo10153(runnable);
    }

    @Override // m4.f0, m4.e0
    /* renamed from: ﹶ */
    public void mo10142() {
        debugStatus = 4;
        super.mo10142();
    }

    @Override // m4.g0
    /* renamed from: ﾞ */
    protected Thread mo10130() {
        Thread thread = _thread;
        return thread == null ? m10285() : thread;
    }

    @Override // m4.g0
    /* renamed from: ﾞﾞ */
    protected void mo10165(long j5, f0.a aVar) {
        m10287();
    }
}
