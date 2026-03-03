package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static c f6133;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Object f6134 = new Object();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Handler f6135 = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: ʽ, reason: contains not printable characters */
    private C0088c f6136;

    /* renamed from: ʾ, reason: contains not printable characters */
    private C0088c f6137;

    /* compiled from: SnackbarManager.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.m7242((C0088c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    interface b {
        /* renamed from: ʻ */
        void mo7227();

        /* renamed from: ʼ */
        void mo7228(int i5);
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0088c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final WeakReference<b> f6139;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f6140;

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f6141;

        C0088c(int i5, b bVar) {
            this.f6139 = new WeakReference<>(bVar);
            this.f6140 = i5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m7250(b bVar) {
            return bVar != null && this.f6139.get() == bVar;
        }
    }

    private c() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m7235(C0088c c0088c, int i5) {
        b bVar = c0088c.f6139.get();
        if (bVar == null) {
            return false;
        }
        this.f6135.removeCallbacksAndMessages(c0088c);
        bVar.mo7228(i5);
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static c m7236() {
        if (f6133 == null) {
            f6133 = new c();
        }
        return f6133;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean m7237(b bVar) {
        C0088c c0088c = this.f6136;
        return c0088c != null && c0088c.m7250(bVar);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean m7238(b bVar) {
        C0088c c0088c = this.f6137;
        return c0088c != null && c0088c.m7250(bVar);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m7239(C0088c c0088c) {
        int i5 = c0088c.f6140;
        if (i5 == -2) {
            return;
        }
        if (i5 <= 0) {
            i5 = i5 == -1 ? 1500 : 2750;
        }
        this.f6135.removeCallbacksAndMessages(c0088c);
        Handler handler = this.f6135;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0088c), i5);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m7240() {
        C0088c c0088c = this.f6137;
        if (c0088c != null) {
            this.f6136 = c0088c;
            this.f6137 = null;
            b bVar = c0088c.f6139.get();
            if (bVar != null) {
                bVar.mo7227();
            } else {
                this.f6136 = null;
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m7241(b bVar, int i5) {
        synchronized (this.f6134) {
            if (m7237(bVar)) {
                m7235(this.f6136, i5);
            } else if (m7238(bVar)) {
                m7235(this.f6137, i5);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m7242(C0088c c0088c) {
        synchronized (this.f6134) {
            if (this.f6136 == c0088c || this.f6137 == c0088c) {
                m7235(c0088c, 2);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m7243(b bVar) {
        boolean m7237;
        synchronized (this.f6134) {
            m7237 = m7237(bVar);
        }
        return m7237;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m7244(b bVar) {
        boolean z5;
        synchronized (this.f6134) {
            z5 = m7237(bVar) || m7238(bVar);
        }
        return z5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m7245(b bVar) {
        synchronized (this.f6134) {
            if (m7237(bVar)) {
                this.f6136 = null;
                if (this.f6137 != null) {
                    m7240();
                }
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m7246(b bVar) {
        synchronized (this.f6134) {
            if (m7237(bVar)) {
                m7239(this.f6136);
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m7247(b bVar) {
        synchronized (this.f6134) {
            if (m7237(bVar)) {
                C0088c c0088c = this.f6136;
                if (!c0088c.f6141) {
                    c0088c.f6141 = true;
                    this.f6135.removeCallbacksAndMessages(c0088c);
                }
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m7248(b bVar) {
        synchronized (this.f6134) {
            if (m7237(bVar)) {
                C0088c c0088c = this.f6136;
                if (c0088c.f6141) {
                    c0088c.f6141 = false;
                    m7239(c0088c);
                }
            }
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m7249(int i5, b bVar) {
        synchronized (this.f6134) {
            if (m7237(bVar)) {
                C0088c c0088c = this.f6136;
                c0088c.f6140 = i5;
                this.f6135.removeCallbacksAndMessages(c0088c);
                m7239(this.f6136);
                return;
            }
            if (m7238(bVar)) {
                this.f6137.f6140 = i5;
            } else {
                this.f6137 = new C0088c(i5, bVar);
            }
            C0088c c0088c2 = this.f6136;
            if (c0088c2 == null || !m7235(c0088c2, 4)) {
                this.f6136 = null;
                m7240();
            }
        }
    }
}
