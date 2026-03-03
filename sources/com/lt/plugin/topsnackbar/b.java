package com.lt.plugin.topsnackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static b f6765;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Object f6766 = new Object();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Handler f6767 = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: ʽ, reason: contains not printable characters */
    private c f6768;

    /* renamed from: ʾ, reason: contains not printable characters */
    private c f6769;

    /* compiled from: SnackbarManager.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.m8077((c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.lt.plugin.topsnackbar.b$b, reason: collision with other inner class name */
    interface InterfaceC0096b {
        /* renamed from: ʻ */
        void mo8071();

        /* renamed from: ʼ */
        void mo8072(int i5);
    }

    /* compiled from: SnackbarManager.java */
    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final WeakReference<InterfaceC0096b> f6771;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f6772;

        c(int i5, InterfaceC0096b interfaceC0096b) {
            this.f6771 = new WeakReference<>(interfaceC0096b);
            this.f6772 = i5;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean m8093(InterfaceC0096b interfaceC0096b) {
            return interfaceC0096b != null && this.f6771.get() == interfaceC0096b;
        }
    }

    private b() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean m8075(c cVar, int i5) {
        InterfaceC0096b interfaceC0096b = (InterfaceC0096b) cVar.f6771.get();
        if (interfaceC0096b == null) {
            return false;
        }
        interfaceC0096b.mo8072(i5);
        return true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static b m8076() {
        if (f6765 == null) {
            f6765 = new b();
        }
        return f6765;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆ, reason: contains not printable characters */
    public void m8077(c cVar) {
        synchronized (this.f6766) {
            if (this.f6768 == cVar || this.f6769 == cVar) {
                m8075(cVar, 2);
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean m8078(InterfaceC0096b interfaceC0096b) {
        c cVar = this.f6768;
        return cVar != null && cVar.m8093(interfaceC0096b);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean m8079(InterfaceC0096b interfaceC0096b) {
        c cVar = this.f6769;
        return cVar != null && cVar.m8093(interfaceC0096b);
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m8080(c cVar) {
        if (cVar.f6772 == -2) {
            return;
        }
        int i5 = cVar.f6772 > 0 ? cVar.f6772 : cVar.f6772 == -1 ? 1500 : 2750;
        this.f6767.removeCallbacksAndMessages(cVar);
        Handler handler = this.f6767;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i5);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m8081() {
        c cVar = this.f6769;
        if (cVar != null) {
            this.f6768 = cVar;
            this.f6769 = null;
            InterfaceC0096b interfaceC0096b = (InterfaceC0096b) cVar.f6771.get();
            if (interfaceC0096b != null) {
                interfaceC0096b.mo8071();
            } else {
                this.f6768 = null;
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m8082(InterfaceC0096b interfaceC0096b) {
        synchronized (this.f6766) {
            if (m8078(interfaceC0096b)) {
                this.f6767.removeCallbacksAndMessages(this.f6768);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8083(InterfaceC0096b interfaceC0096b, int i5) {
        synchronized (this.f6766) {
            if (m8078(interfaceC0096b)) {
                m8075(this.f6768, i5);
            } else if (m8079(interfaceC0096b)) {
                m8075(this.f6769, i5);
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m8084(InterfaceC0096b interfaceC0096b) {
        boolean m8078;
        synchronized (this.f6766) {
            m8078 = m8078(interfaceC0096b);
        }
        return m8078;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m8085(InterfaceC0096b interfaceC0096b) {
        boolean z5;
        synchronized (this.f6766) {
            z5 = m8078(interfaceC0096b) || m8079(interfaceC0096b);
        }
        return z5;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m8086(InterfaceC0096b interfaceC0096b) {
        synchronized (this.f6766) {
            if (m8078(interfaceC0096b)) {
                this.f6768 = null;
                if (this.f6769 != null) {
                    m8081();
                }
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m8087(InterfaceC0096b interfaceC0096b) {
        synchronized (this.f6766) {
            if (m8078(interfaceC0096b)) {
                m8080(this.f6768);
            }
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m8088(InterfaceC0096b interfaceC0096b) {
        synchronized (this.f6766) {
            if (m8078(interfaceC0096b)) {
                m8080(this.f6768);
            }
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m8089(int i5, InterfaceC0096b interfaceC0096b) {
        synchronized (this.f6766) {
            if (m8078(interfaceC0096b)) {
                this.f6768.f6772 = i5;
                this.f6767.removeCallbacksAndMessages(this.f6768);
                m8080(this.f6768);
                return;
            }
            if (m8079(interfaceC0096b)) {
                this.f6769.f6772 = i5;
            } else {
                this.f6769 = new c(i5, interfaceC0096b);
            }
            c cVar = this.f6768;
            if (cVar == null || !m8075(cVar, 4)) {
                this.f6768 = null;
                m8081();
            }
        }
    }
}
