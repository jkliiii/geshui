package e1;

import android.os.Process;
import e1.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final boolean f7347;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Executor f7348;

    /* renamed from: ʽ, reason: contains not printable characters */
    final Map<c1.f, c> f7349;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ReferenceQueue<p<?>> f7350;

    /* renamed from: ʿ, reason: contains not printable characters */
    private p.a f7351;

    /* renamed from: ˆ, reason: contains not printable characters */
    private volatile boolean f7352;

    /* compiled from: ActiveResources.java */
    /* renamed from: e1.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0100a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: e1.a$a$a, reason: collision with other inner class name */
        class RunnableC0101a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ Runnable f7353;

            RunnableC0101a(Runnable runnable) {
                this.f7353 = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f7353.run();
            }
        }

        ThreadFactoryC0100a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0101a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.m8283();
        }
    }

    /* compiled from: ActiveResources.java */
    static final class c extends WeakReference<p<?>> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final c1.f f7356;

        /* renamed from: ʼ, reason: contains not printable characters */
        final boolean f7357;

        /* renamed from: ʽ, reason: contains not printable characters */
        v<?> f7358;

        c(c1.f fVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z5) {
            super(pVar, referenceQueue);
            this.f7356 = (c1.f) y1.k.m12893(fVar);
            this.f7358 = (pVar.m8415() && z5) ? (v) y1.k.m12893(pVar.m8414()) : null;
            this.f7357 = pVar.m8415();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m8288() {
            this.f7358 = null;
            clear();
        }
    }

    a(boolean z5) {
        this(z5, Executors.newSingleThreadExecutor(new ThreadFactoryC0100a()));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    synchronized void m8282(c1.f fVar, p<?> pVar) {
        c put = this.f7349.put(fVar, new c(fVar, pVar, this.f7350, this.f7347));
        if (put != null) {
            put.m8288();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m8283() {
        while (!this.f7352) {
            try {
                m8284((c) this.f7350.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m8284(c cVar) {
        v<?> vVar;
        synchronized (this) {
            this.f7349.remove(cVar.f7356);
            if (cVar.f7357 && (vVar = cVar.f7358) != null) {
                this.f7351.mo8377(cVar.f7356, new p<>(vVar, true, false, cVar.f7356, this.f7351));
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    synchronized void m8285(c1.f fVar) {
        c remove = this.f7349.remove(fVar);
        if (remove != null) {
            remove.m8288();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    synchronized p<?> m8286(c1.f fVar) {
        c cVar = this.f7349.get(fVar);
        if (cVar == null) {
            return null;
        }
        p<?> pVar = cVar.get();
        if (pVar == null) {
            m8284(cVar);
        }
        return pVar;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m8287(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f7351 = aVar;
            }
        }
    }

    a(boolean z5, Executor executor) {
        this.f7349 = new HashMap();
        this.f7350 = new ReferenceQueue<>();
        this.f7347 = z5;
        this.f7348 = executor;
        executor.execute(new b());
    }
}
