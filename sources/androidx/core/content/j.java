package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.k;

/* compiled from: PermissionChecker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class j {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m2032(Context context, String str, int i5, int i6, String str2) {
        if (context.checkPermission(str, i5, i6) == -1) {
            return -1;
        }
        String m1960 = k.m1960(str);
        if (m1960 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i6);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i6 && androidx.core.util.c.m2568(context.getPackageName(), str2) ? k.m1958(context, i6, m1960, str2) : k.m1959(context, m1960, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m2033(Context context, String str) {
        return m2032(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
