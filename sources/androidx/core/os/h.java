package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class h {

    /* compiled from: ExecutorCompat.java */
    private static class a implements Executor {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Handler f2735;

        a(Handler handler) {
            this.f2735 = (Handler) androidx.core.util.h.m2583(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f2735.post((Runnable) androidx.core.util.h.m2583(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f2735 + " is shutting down");
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Executor m2417(Handler handler) {
        return new a(handler);
    }
}
