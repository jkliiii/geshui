package s4;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import v4.g;

/* compiled from: ConnectionPool.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final Executor f11073 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), t4.c.m12058("OkHttp ConnectionPool", true));

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f11074;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final long f11075;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Runnable f11076;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Deque<v4.c> f11077;

    /* renamed from: ʿ, reason: contains not printable characters */
    final v4.d f11078;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f11079;

    /* compiled from: ConnectionPool.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long m11806 = i.this.m11806(System.nanoTime());
                if (m11806 == -1) {
                    return;
                }
                if (m11806 > 0) {
                    long j5 = m11806 / 1000000;
                    long j6 = m11806 - (1000000 * j5);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j5, (int) j6);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m11805(v4.c cVar, long j5) {
        List<Reference<v4.g>> list = cVar.f11753;
        int i5 = 0;
        while (i5 < list.size()) {
            Reference<v4.g> reference = list.get(i5);
            if (reference.get() != null) {
                i5++;
            } else {
                z4.k.m13239().mo13217("A connection to " + cVar.m12405().m11784().m11728() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f11782);
                list.remove(i5);
                cVar.f11750 = true;
                if (list.isEmpty()) {
                    cVar.f11754 = j5 - this.f11075;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    long m11806(long j5) {
        synchronized (this) {
            v4.c cVar = null;
            long j6 = Long.MIN_VALUE;
            int i5 = 0;
            int i6 = 0;
            for (v4.c cVar2 : this.f11077) {
                if (m11805(cVar2, j5) > 0) {
                    i6++;
                } else {
                    i5++;
                    long j7 = j5 - cVar2.f11754;
                    if (j7 > j6) {
                        cVar = cVar2;
                        j6 = j7;
                    }
                }
            }
            long j8 = this.f11075;
            if (j6 < j8 && i5 <= this.f11074) {
                if (i5 > 0) {
                    return j8 - j6;
                }
                if (i6 > 0) {
                    return j8;
                }
                this.f11079 = false;
                return -1L;
            }
            this.f11077.remove(cVar);
            t4.c.m12061(cVar.m12406());
            return 0L;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean m11807(v4.c cVar) {
        if (cVar.f11750 || this.f11074 == 0) {
            this.f11077.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    @Nullable
    /* renamed from: ʽ, reason: contains not printable characters */
    Socket m11808(s4.a aVar, v4.g gVar) {
        for (v4.c cVar : this.f11077) {
            if (cVar.m12401(aVar, null) && cVar.m12403() && cVar != gVar.m12434()) {
                return gVar.m12439(cVar);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: ʾ, reason: contains not printable characters */
    v4.c m11809(s4.a aVar, v4.g gVar, c0 c0Var) {
        for (v4.c cVar : this.f11077) {
            if (cVar.m12401(aVar, c0Var)) {
                gVar.m12431(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m11810(v4.c cVar) {
        if (!this.f11079) {
            this.f11079 = true;
            f11073.execute(this.f11076);
        }
        this.f11077.add(cVar);
    }

    public i(int i5, long j5, TimeUnit timeUnit) {
        this.f11076 = new a();
        this.f11077 = new ArrayDeque();
        this.f11078 = new v4.d();
        this.f11074 = i5;
        this.f11075 = timeUnit.toNanos(j5);
        if (j5 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j5);
    }
}
