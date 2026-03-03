package e1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class y {

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f7569;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Handler f7570 = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).mo8413();
            return true;
        }
    }

    y() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    synchronized void m8443(v<?> vVar, boolean z5) {
        if (this.f7569 || z5) {
            this.f7570.obtainMessage(1, vVar).sendToTarget();
        } else {
            this.f7569 = true;
            vVar.mo8413();
            this.f7569 = false;
        }
    }
}
