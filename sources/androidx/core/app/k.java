package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* compiled from: AppOpsManagerCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k {

    /* compiled from: AppOpsManagerCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static <T> T m1961(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m1962(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m1963(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static String m1964(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m1965(AppOpsManager appOpsManager, String str, int i5, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i5, str2);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static String m1966(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static AppOpsManager m1967(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m1958(Context context, int i5, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m1959(context, str, str2);
        }
        AppOpsManager m1967 = b.m1967(context);
        int m1965 = b.m1965(m1967, str, Binder.getCallingUid(), str2);
        return m1965 != 0 ? m1965 : b.m1965(m1967, str, i5, b.m1966(context));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m1959(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m1963((AppOpsManager) a.m1961(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m1960(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m1964(str);
        }
        return null;
    }
}
