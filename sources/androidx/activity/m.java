package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: FullyDrawnReporter.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class m {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Executor f243;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final e4.a<v3.p> f244;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Object f245;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f246;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f247;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f248;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final List<e4.a<v3.p>> f249;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final Runnable f250;

    public m(Executor executor, e4.a<v3.p> aVar) {
        f4.k.m8623(executor, "executor");
        f4.k.m8623(aVar, "reportFullyDrawn");
        this.f243 = executor;
        this.f244 = aVar;
        this.f245 = new Object();
        this.f249 = new ArrayList();
        this.f250 = new Runnable() { // from class: androidx.activity.l
            @Override // java.lang.Runnable
            public final void run() {
                m.m398(this.f242);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static final void m398(m mVar) {
        f4.k.m8623(mVar, "this$0");
        synchronized (mVar.f245) {
            mVar.f247 = false;
            if (mVar.f246 == 0 && !mVar.f248) {
                mVar.f244.mo368();
                mVar.m399();
            }
            v3.p pVar = v3.p.f11735;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m399() {
        synchronized (this.f245) {
            this.f248 = true;
            Iterator<T> it = this.f249.iterator();
            while (it.hasNext()) {
                ((e4.a) it.next()).mo368();
            }
            this.f249.clear();
            v3.p pVar = v3.p.f11735;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m400() {
        boolean z5;
        synchronized (this.f245) {
            z5 = this.f248;
        }
        return z5;
    }
}
