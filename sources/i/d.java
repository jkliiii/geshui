package i;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Object f8445 = new Object();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final ExecutorService f8446 = Executors.newFixedThreadPool(4, new a());

    /* renamed from: ʽ, reason: contains not printable characters */
    private volatile Handler f8447;

    /* compiled from: DefaultTaskExecutor.java */
    class a implements ThreadFactory {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final AtomicInteger f8448 = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f8448.getAndIncrement());
            return thread;
        }
    }

    /* compiled from: DefaultTaskExecutor.java */
    private static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static Handler m9111(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Handler m9110(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m9111(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // i.f
    /* renamed from: ʻ */
    public void mo9107(Runnable runnable) {
        this.f8446.execute(runnable);
    }

    @Override // i.f
    /* renamed from: ʼ */
    public boolean mo9108() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // i.f
    /* renamed from: ʽ */
    public void mo9109(Runnable runnable) {
        if (this.f8447 == null) {
            synchronized (this.f8445) {
                if (this.f8447 == null) {
                    this.f8447 = m9110(Looper.getMainLooper());
                }
            }
        }
        this.f8447.post(runnable);
    }
}
