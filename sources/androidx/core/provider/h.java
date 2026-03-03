package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h {

    /* compiled from: RequestExecutor.java */
    private static class a implements ThreadFactory {

        /* renamed from: ʻ, reason: contains not printable characters */
        private String f2789;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f2790;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        private static class C0029a extends Thread {

            /* renamed from: ʾ, reason: contains not printable characters */
            private final int f2791;

            C0029a(Runnable runnable, String str, int i5) {
                super(runnable, str);
                this.f2791 = i5;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f2791);
                super.run();
            }
        }

        a(String str, int i5) {
            this.f2789 = str;
            this.f2790 = i5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0029a(runnable, this.f2789, this.f2790);
        }
    }

    /* compiled from: RequestExecutor.java */
    private static class b<T> implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private Callable<T> f2792;

        /* renamed from: ʿ, reason: contains not printable characters */
        private androidx.core.util.a<T> f2793;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Handler f2794;

        /* compiled from: RequestExecutor.java */
        class a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ androidx.core.util.a f2795;

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ Object f2796;

            a(androidx.core.util.a aVar, Object obj) {
                this.f2795 = aVar;
                this.f2796 = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f2795.accept(this.f2796);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f2792 = callable;
            this.f2793 = aVar;
            this.f2794 = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t5;
            try {
                t5 = this.f2792.call();
            } catch (Exception unused) {
                t5 = null;
            }
            this.f2794.post(new a(this.f2793, t5));
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static ThreadPoolExecutor m2489(String str, int i5, int i6) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i6, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static <T> void m2490(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(androidx.core.provider.b.m2450(), callable, aVar));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static <T> T m2491(ExecutorService executorService, Callable<T> callable, int i5) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i5, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            throw e5;
        } catch (ExecutionException e6) {
            throw new RuntimeException(e6);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
