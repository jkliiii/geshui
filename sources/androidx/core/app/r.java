package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class r {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Object f2563 = new Object();

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Set<String> f2564 = new HashSet();

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Object f2565 = new Object();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f2566;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final NotificationManager f2567;

    private r(Context context) {
        this.f2566 = context;
        this.f2567 = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static r m1982(Context context) {
        return new r(context);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m1983() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f2567.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2566.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2566.getApplicationInfo();
        String packageName = this.f2566.getApplicationContext().getPackageName();
        int i5 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i5), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
