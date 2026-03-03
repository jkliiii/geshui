package androidx.core.os;

import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f2731;

    /* renamed from: ʼ, reason: contains not printable characters */
    private b f2732;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Object f2733;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f2734;

    /* compiled from: CancellationSignal.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m2415(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static CancellationSignal m2416() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal.java */
    public interface b {
        void onCancel();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m2411() {
        while (this.f2734) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m2412() {
        synchronized (this) {
            if (this.f2731) {
                return;
            }
            this.f2731 = true;
            this.f2734 = true;
            b bVar = this.f2732;
            Object obj = this.f2733;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2734 = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.m2415(obj);
            }
            synchronized (this) {
                this.f2734 = false;
                notifyAll();
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m2413() {
        boolean z5;
        synchronized (this) {
            z5 = this.f2731;
        }
        return z5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m2414(b bVar) {
        synchronized (this) {
            m2411();
            if (this.f2732 == bVar) {
                return;
            }
            this.f2732 = bVar;
            if (this.f2731 && bVar != null) {
                bVar.onCancel();
            }
        }
    }
}
