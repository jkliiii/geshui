package i;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends f {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static volatile c f8440;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final Executor f8441 = new Executor() { // from class: i.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.m9105(runnable);
        }
    };

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Executor f8442 = new Executor() { // from class: i.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.m9106(runnable);
        }
    };

    /* renamed from: ʻ, reason: contains not printable characters */
    private f f8443;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f f8444;

    private c() {
        d dVar = new d();
        this.f8444 = dVar;
        this.f8443 = dVar;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static c m9104() {
        if (f8440 != null) {
            return f8440;
        }
        synchronized (c.class) {
            if (f8440 == null) {
                f8440 = new c();
            }
        }
        return f8440;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public static /* synthetic */ void m9105(Runnable runnable) {
        m9104().mo9109(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public static /* synthetic */ void m9106(Runnable runnable) {
        m9104().mo9107(runnable);
    }

    @Override // i.f
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo9107(Runnable runnable) {
        this.f8443.mo9107(runnable);
    }

    @Override // i.f
    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean mo9108() {
        return this.f8443.mo9108();
    }

    @Override // i.f
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo9109(Runnable runnable) {
        this.f8443.mo9109(runnable);
    }
}
