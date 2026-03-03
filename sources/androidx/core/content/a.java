package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.app.r;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Object f2572 = new Object();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Object f2573 = new Object();

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    static class C0025a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m2001(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m2002(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static File[] m2003(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static File[] m2004(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static File[] m2005(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static File m2006(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static Drawable m2007(Context context, int i5) {
            return context.getDrawable(i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static File m2008(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    static class d {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2009(Context context, int i5) {
            return context.getColor(i5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static <T> T m2010(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static String m2011(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    static class e {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Executor m2012(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat.java */
    private static final class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final HashMap<Class<?>, String> f2574;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f2574 = hashMap;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            if (i5 >= 21) {
                hashMap.put(AppWidgetManager.class, "appwidget");
                hashMap.put(BatteryManager.class, "batterymanager");
                hashMap.put(CameraManager.class, "camera");
                hashMap.put(JobScheduler.class, "jobscheduler");
                hashMap.put(LauncherApps.class, "launcherapps");
                hashMap.put(MediaProjectionManager.class, "media_projection");
                hashMap.put(MediaSessionManager.class, "media_session");
                hashMap.put(RestrictionsManager.class, "restrictions");
                hashMap.put(TelecomManager.class, "telecom");
                hashMap.put(TvInputManager.class, "tv_input");
            }
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m1990(Context context, String str) {
        androidx.core.util.c.m2570(str, "permission must be non-null");
        return (androidx.core.os.a.m2404() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : r.m1982(context).m1983() ? 0 : -1;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m1991(Context context, int i5) {
        return Build.VERSION.SDK_INT >= 23 ? d.m2009(context, i5) : context.getResources().getColor(i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static ColorStateList m1992(Context context, int i5) {
        return androidx.core.content.res.i.m2109(context.getResources(), i5, context.getTheme());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static Drawable m1993(Context context, int i5) {
        return Build.VERSION.SDK_INT >= 21 ? c.m2007(context, i5) : context.getResources().getDrawable(i5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static File[] m1994(Context context) {
        return b.m2003(context);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static File[] m1995(Context context, String str) {
        return b.m2004(context, str);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static Executor m1996(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.m2012(context) : androidx.core.os.h.m2417(new Handler(context.getMainLooper()));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static <T> T m1997(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) d.m2010(context, cls);
        }
        String m1998 = m1998(context, cls);
        if (m1998 != null) {
            return (T) context.getSystemService(m1998);
        }
        return null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static String m1998(Context context, Class<?> cls) {
        return Build.VERSION.SDK_INT >= 23 ? d.m2011(context, cls) : f.f2574.get(cls);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m1999(Context context, Intent[] intentArr, Bundle bundle) {
        C0025a.m2001(context, intentArr, bundle);
        return true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m2000(Context context, Intent intent, Bundle bundle) {
        C0025a.m2002(context, intent, bundle);
    }
}
