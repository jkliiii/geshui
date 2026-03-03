package c0;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m.g;

/* compiled from: AnimationHandler.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a {

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final ThreadLocal<a> f4909 = new ThreadLocal<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    private c f4913;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final g<b, Long> f4910 = new g<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    final ArrayList<b> f4911 = new ArrayList<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final C0073a f4912 = new C0073a();

    /* renamed from: ʿ, reason: contains not printable characters */
    long f4914 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f4915 = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: c0.a$a, reason: collision with other inner class name */
    class C0073a {
        C0073a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5755() {
            a.this.f4914 = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.m5752(aVar.f4914);
            if (a.this.f4911.size() > 0) {
                a.this.m5753().mo5757();
            }
        }
    }

    /* compiled from: AnimationHandler.java */
    interface b {
        /* renamed from: ʻ, reason: contains not printable characters */
        boolean mo5756(long j5);
    }

    /* compiled from: AnimationHandler.java */
    static abstract class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final C0073a f4917;

        c(C0073a c0073a) {
            this.f4917 = c0073a;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        abstract void mo5757();
    }

    /* compiled from: AnimationHandler.java */
    private static class d extends c {

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Choreographer f4918;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Choreographer.FrameCallback f4919;

        /* compiled from: AnimationHandler.java */
        /* renamed from: c0.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0074a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0074a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j5) {
                d.this.f4917.m5755();
            }
        }

        d(C0073a c0073a) {
            super(c0073a);
            this.f4918 = Choreographer.getInstance();
            this.f4919 = new ChoreographerFrameCallbackC0074a();
        }

        @Override // c0.a.c
        /* renamed from: ʻ */
        void mo5757() {
            this.f4918.postFrameCallback(this.f4919);
        }
    }

    a() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m5748() {
        if (this.f4915) {
            for (int size = this.f4911.size() - 1; size >= 0; size--) {
                if (this.f4911.get(size) == null) {
                    this.f4911.remove(size);
                }
            }
            this.f4915 = false;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static a m5749() {
        ThreadLocal<a> threadLocal = f4909;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m5750(b bVar, long j5) {
        Long l5 = this.f4910.get(bVar);
        if (l5 == null) {
            return true;
        }
        if (l5.longValue() >= j5) {
            return false;
        }
        this.f4910.remove(bVar);
        return true;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m5751(b bVar, long j5) {
        if (this.f4911.size() == 0) {
            m5753().mo5757();
        }
        if (!this.f4911.contains(bVar)) {
            this.f4911.add(bVar);
        }
        if (j5 > 0) {
            this.f4910.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j5));
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m5752(long j5) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i5 = 0; i5 < this.f4911.size(); i5++) {
            b bVar = this.f4911.get(i5);
            if (bVar != null && m5750(bVar, uptimeMillis)) {
                bVar.mo5756(j5);
            }
        }
        m5748();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    c m5753() {
        if (this.f4913 == null) {
            this.f4913 = new d(this.f4912);
        }
        return this.f4913;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m5754(b bVar) {
        this.f4910.remove(bVar);
        int indexOf = this.f4911.indexOf(bVar);
        if (indexOf >= 0) {
            this.f4911.set(indexOf, null);
            this.f4915 = true;
        }
    }
}
