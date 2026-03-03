package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: E:\78999\cookie_5123796.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2530 = (IconCompat) aVar.m5547(remoteActionCompat.f2530, 1);
        remoteActionCompat.f2531 = aVar.m5534(remoteActionCompat.f2531, 2);
        remoteActionCompat.f2532 = aVar.m5534(remoteActionCompat.f2532, 3);
        remoteActionCompat.f2533 = (PendingIntent) aVar.m5542(remoteActionCompat.f2533, 4);
        remoteActionCompat.f2534 = aVar.m5527(remoteActionCompat.f2534, 5);
        remoteActionCompat.f2535 = aVar.m5527(remoteActionCompat.f2535, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.m5549(false, false);
        aVar.m5530(remoteActionCompat.f2530, 1);
        aVar.m5520(remoteActionCompat.f2531, 2);
        aVar.m5520(remoteActionCompat.f2532, 3);
        aVar.m5538(remoteActionCompat.f2533, 4);
        aVar.m5551(remoteActionCompat.f2534, 5);
        aVar.m5551(remoteActionCompat.f2535, 6);
    }
}
