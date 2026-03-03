package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConcurrencyHelpers.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b {

    /* compiled from: ConcurrencyHelpers.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static Handler m3765(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static ThreadPoolExecutor m3762(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return b.m3763(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static /* synthetic */ Thread m3763(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static Handler m3764() {
        return Build.VERSION.SDK_INT >= 28 ? a.m3765(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
