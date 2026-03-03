package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: NavUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class p {

    /* compiled from: NavUtils.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Intent m1978(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m1979(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static boolean m1980(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Intent m1972(Activity activity) {
        Intent m1978 = a.m1978(activity);
        if (m1978 != null) {
            return m1978;
        }
        String m1974 = m1974(activity);
        if (m1974 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m1974);
        try {
            return m1975(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m1974 + "' in manifest");
            return null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Intent m1973(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String m1975 = m1975(context, componentName);
        if (m1975 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m1975);
        return m1975(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m1974(Activity activity) {
        try {
            return m1975(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static String m1975(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i5 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i5 >= 29 ? 269222528 : i5 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m1976(Activity activity, Intent intent) {
        a.m1979(activity, intent);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static boolean m1977(Activity activity, Intent intent) {
        return a.m1980(activity, intent);
    }
}
