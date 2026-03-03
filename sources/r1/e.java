package r1;

import android.content.Context;
import android.util.Log;
import r1.b;

/* compiled from: DefaultConnectivityMonitorFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e implements c {
    @Override // r1.c
    /* renamed from: ʻ */
    public b mo11632(Context context, b.a aVar) {
        boolean z5 = androidx.core.content.a.m1990(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z5 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z5 ? new d(context, aVar) : new n();
    }
}
