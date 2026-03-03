package y1;

import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Executor f12447 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Executor f12448 = new b();

    /* compiled from: Executors.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.m12915(runnable);
        }
    }

    /* compiled from: Executors.java */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Executor m12875() {
        return f12448;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Executor m12876() {
        return f12447;
    }
}
