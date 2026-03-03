package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* compiled from: CalleeHandler.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b {
    /* renamed from: ʻ, reason: contains not printable characters */
    static Handler m2450() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
