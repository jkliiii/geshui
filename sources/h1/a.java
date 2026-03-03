package h1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a implements ExecutorService {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final long f8111 = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: ˆ, reason: contains not printable characters */
    private static volatile int f8112;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ExecutorService f8113;

    /* compiled from: GlideExecutor.java */
    public static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final boolean f8114;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f8115;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f8116;

        /* renamed from: ʾ, reason: contains not printable characters */
        private ThreadFactory f8117 = new c();

        /* renamed from: ʿ, reason: contains not printable characters */
        private e f8118 = e.f8132;

        /* renamed from: ˆ, reason: contains not printable characters */
        private String f8119;

        /* renamed from: ˈ, reason: contains not printable characters */
        private long f8120;

        b(boolean z5) {
            this.f8114 = z5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public a m8763() {
            if (TextUtils.isEmpty(this.f8119)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f8119);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f8115, this.f8116, this.f8120, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f8117, this.f8119, this.f8118, this.f8114));
            if (this.f8120 != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public b m8764(String str) {
            this.f8119 = str;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public b m8765(int i5) {
            this.f8115 = i5;
            this.f8116 = i5;
            return this;
        }
    }

    /* compiled from: GlideExecutor.java */
    private static final class c implements ThreadFactory {

        /* compiled from: GlideExecutor.java */
        /* renamed from: h1.a$c$a, reason: collision with other inner class name */
        class C0109a extends Thread {
            C0109a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0109a(runnable);
        }
    }

    /* compiled from: GlideExecutor.java */
    private static final class d implements ThreadFactory {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ThreadFactory f8122;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final String f8123;

        /* renamed from: ʽ, reason: contains not printable characters */
        final e f8124;

        /* renamed from: ʾ, reason: contains not printable characters */
        final boolean f8125;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final AtomicInteger f8126 = new AtomicInteger();

        /* compiled from: GlideExecutor.java */
        /* renamed from: h1.a$d$a, reason: collision with other inner class name */
        class RunnableC0110a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ Runnable f8127;

            RunnableC0110a(Runnable runnable) {
                this.f8127 = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f8125) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f8127.run();
                } catch (Throwable th) {
                    d.this.f8124.mo8766(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z5) {
            this.f8122 = threadFactory;
            this.f8123 = str;
            this.f8124 = eVar;
            this.f8125 = z5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f8122.newThread(new RunnableC0110a(runnable));
            newThread.setName("glide-" + this.f8123 + "-thread-" + this.f8126.getAndIncrement());
            return newThread;
        }
    }

    a(ExecutorService executorService) {
        this.f8113 = executorService;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static b m8754() {
        return new b(false).m8765(m8760()).m8764("source");
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static a m8755() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f8111, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f8132, false)));
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static a m8756() {
        return m8754().m8763();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static b m8757() {
        return new b(true).m8765(1).m8764("disk-cache");
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static a m8758() {
        return m8757().m8763();
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static int m8759() {
        return m8760() >= 4 ? 2 : 1;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static int m8760() {
        if (f8112 == 0) {
            f8112 = Math.min(4, h1.b.m8767());
        }
        return f8112;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static b m8761() {
        return new b(true).m8765(m8759()).m8764("animation");
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static a m8762() {
        return m8761().m8763();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j5, TimeUnit timeUnit) throws InterruptedException {
        return this.f8113.awaitTermination(j5, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f8113.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f8113.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f8113.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f8113.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f8113.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f8113.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f8113.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f8113.submit(runnable);
    }

    public String toString() {
        return this.f8113.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) throws InterruptedException {
        return this.f8113.invokeAll(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f8113.invokeAny(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t5) {
        return this.f8113.submit(runnable, t5);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f8113.submit(callable);
    }

    /* compiled from: GlideExecutor.java */
    public interface e {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final e f8129 = new C0111a();

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final e f8130;

        /* renamed from: ʽ, reason: contains not printable characters */
        public static final e f8131;

        /* renamed from: ʾ, reason: contains not printable characters */
        public static final e f8132;

        /* compiled from: GlideExecutor.java */
        class b implements e {
            b() {
            }

            @Override // h1.a.e
            /* renamed from: ʻ */
            public void mo8766(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* compiled from: GlideExecutor.java */
        class c implements e {
            c() {
            }

            @Override // h1.a.e
            /* renamed from: ʻ */
            public void mo8766(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f8130 = bVar;
            f8131 = new c();
            f8132 = bVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void mo8766(Throwable th);

        /* compiled from: GlideExecutor.java */
        /* renamed from: h1.a$e$a, reason: collision with other inner class name */
        class C0111a implements e {
            C0111a() {
            }

            @Override // h1.a.e
            /* renamed from: ʻ */
            public void mo8766(Throwable th) {
            }
        }
    }
}
