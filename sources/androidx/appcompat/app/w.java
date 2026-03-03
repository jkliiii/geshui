package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;

/* compiled from: AppLocalesMetadataHolderService.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class w extends Service {

    /* compiled from: AppLocalesMetadataHolderService.java */
    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m741() {
            return 512;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static ServiceInfo m740(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) w.class), Build.VERSION.SDK_INT >= 24 ? a.m741() | 128 : 640);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
