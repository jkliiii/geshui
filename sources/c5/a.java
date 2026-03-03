package c5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: AsyncTimeout.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends t {

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final long f4997;

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final long f4998;

    /* renamed from: ˋ, reason: contains not printable characters */
    @Nullable
    static a f4999;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f5000;

    /* renamed from: ˆ, reason: contains not printable characters */
    @Nullable
    private a f5001;

    /* renamed from: ˈ, reason: contains not printable characters */
    private long f5002;

    /* compiled from: AsyncTimeout.java */
    /* renamed from: c5.a$a, reason: collision with other inner class name */
    class C0077a implements r {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ r f5003;

        C0077a(r rVar) {
            this.f5003 = rVar;
        }

        @Override // c5.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.m5858();
            try {
                try {
                    this.f5003.close();
                    a.this.m5860(true);
                } catch (IOException e5) {
                    throw a.this.m5859(e5);
                }
            } catch (Throwable th) {
                a.this.m5860(false);
                throw th;
            }
        }

        @Override // c5.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.m5858();
            try {
                try {
                    this.f5003.flush();
                    a.this.m5860(true);
                } catch (IOException e5) {
                    throw a.this.m5859(e5);
                }
            } catch (Throwable th) {
                a.this.m5860(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f5003 + ")";
        }

        @Override // c5.r
        /* renamed from: ʼ, reason: contains not printable characters */
        public t mo5866() {
            return a.this;
        }

        @Override // c5.r
        /* renamed from: ˈ, reason: contains not printable characters */
        public void mo5867(c5.c cVar, long j5) throws IOException {
            u.m5978(cVar.f5011, 0L, j5);
            while (true) {
                long j6 = 0;
                if (j5 <= 0) {
                    return;
                }
                o oVar = cVar.f5010;
                while (true) {
                    if (j6 >= 65536) {
                        break;
                    }
                    j6 += oVar.f5045 - oVar.f5044;
                    if (j6 >= j5) {
                        j6 = j5;
                        break;
                    }
                    oVar = oVar.f5048;
                }
                a.this.m5858();
                try {
                    try {
                        this.f5003.mo5867(cVar, j6);
                        j5 -= j6;
                        a.this.m5860(true);
                    } catch (IOException e5) {
                        throw a.this.m5859(e5);
                    }
                } catch (Throwable th) {
                    a.this.m5860(false);
                    throw th;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.java */
    class b implements s {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ s f5005;

        b(s sVar) {
            this.f5005 = sVar;
        }

        @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f5005.close();
                    a.this.m5860(true);
                } catch (IOException e5) {
                    throw a.this.m5859(e5);
                }
            } catch (Throwable th) {
                a.this.m5860(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f5005 + ")";
        }

        @Override // c5.s
        /* renamed from: ʼ, reason: contains not printable characters */
        public t mo5868() {
            return a.this;
        }

        @Override // c5.s
        /* renamed from: י, reason: contains not printable characters */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            a.this.m5858();
            try {
                try {
                    long mo5869 = this.f5005.mo5869(cVar, j5);
                    a.this.m5860(true);
                    return mo5869;
                } catch (IOException e5) {
                    throw a.this.m5859(e5);
                }
            } catch (Throwable th) {
                a.this.m5860(false);
                throw th;
            }
        }
    }

    /* compiled from: AsyncTimeout.java */
    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
        
            r1.mo5865();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<c5.a> r0 = c5.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                c5.a r1 = c5.a.m5854()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                c5.a r2 = c5.a.f4999     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                c5.a.f4999 = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.mo5865()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L1d
            L1c:
                throw r1
            L1d:
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4997 = millis;
        f4998 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    /* renamed from: ˊ, reason: contains not printable characters */
    static a m5854() throws InterruptedException {
        a aVar = f4999.f5001;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(f4997);
            if (f4999.f5001 != null || System.nanoTime() - nanoTime < f4998) {
                return null;
            }
            return f4999;
        }
        long m5856 = aVar.m5856(System.nanoTime());
        if (m5856 > 0) {
            long j5 = m5856 / 1000000;
            a.class.wait(j5, (int) (m5856 - (1000000 * j5)));
            return null;
        }
        f4999.f5001 = aVar.f5001;
        aVar.f5001 = null;
        return aVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static synchronized boolean m5855(a aVar) {
        synchronized (a.class) {
            a aVar2 = f4999;
            while (aVar2 != null) {
                a aVar3 = aVar2.f5001;
                if (aVar3 == aVar) {
                    aVar2.f5001 = aVar.f5001;
                    aVar.f5001 = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private long m5856(long j5) {
        return this.f5002 - j5;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static synchronized void m5857(a aVar, long j5, boolean z5) {
        synchronized (a.class) {
            if (f4999 == null) {
                f4999 = new a();
                new c().start();
            }
            long nanoTime = System.nanoTime();
            if (j5 != 0 && z5) {
                aVar.f5002 = Math.min(j5, aVar.mo5940() - nanoTime) + nanoTime;
            } else if (j5 != 0) {
                aVar.f5002 = j5 + nanoTime;
            } else {
                if (!z5) {
                    throw new AssertionError();
                }
                aVar.f5002 = aVar.mo5940();
            }
            long m5856 = aVar.m5856(nanoTime);
            a aVar2 = f4999;
            while (true) {
                a aVar3 = aVar2.f5001;
                if (aVar3 == null || m5856 < aVar3.m5856(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f5001;
                }
            }
            aVar.f5001 = aVar2.f5001;
            aVar2.f5001 = aVar;
            if (aVar2 == f4999) {
                a.class.notify();
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m5858() {
        if (this.f5000) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long m5976 = m5976();
        boolean mo5942 = mo5942();
        if (m5976 != 0 || mo5942) {
            this.f5000 = true;
            m5857(this, m5976, mo5942);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final IOException m5859(IOException iOException) throws IOException {
        return !m5861() ? iOException : mo5862(iOException);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    final void m5860(boolean z5) throws IOException {
        if (m5861() && z5) {
            throw mo5862(null);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public final boolean m5861() {
        if (!this.f5000) {
            return false;
        }
        this.f5000 = false;
        return m5855(this);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    protected IOException mo5862(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public final r m5863(r rVar) {
        return new C0077a(rVar);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public final s m5864(s sVar) {
        return new b(sVar);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    protected void mo5865() {
    }
}
