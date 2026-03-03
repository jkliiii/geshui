package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: ActivityCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends androidx.core.content.a {

    /* compiled from: ActivityCompat.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ String[] f2537;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Activity f2538;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ int f2539;

        a(String[] strArr, Activity activity, int i5) {
            this.f2537 = strArr;
            this.f2538 = activity;
            this.f2539 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f2537.length];
            PackageManager packageManager = this.f2538.getPackageManager();
            String packageName = this.f2538.getPackageName();
            int length = this.f2537.length;
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = packageManager.checkPermission(this.f2537[i5], packageName);
            }
            ((d) this.f2538).onRequestPermissionsResult(this.f2539, this.f2537, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C0024b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1936(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1937(Activity activity, Intent intent, int i5, Bundle bundle) {
            activity.startActivityForResult(intent, i5, bundle);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m1938(Activity activity, IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1939(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1940(Activity activity, String[] strArr, int i5) {
            activity.requestPermissions(strArr, i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static boolean m1941(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    public interface d {
        void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    public interface e {
        /* renamed from: ʼ, reason: contains not printable characters */
        void mo1942(int i5);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static void m1929(Activity activity) {
        C0024b.m1936(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public static /* synthetic */ void m1930(Activity activity) {
        if (activity.isFinishing() || g.m1954(activity)) {
            return;
        }
        activity.recreate();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static void m1931(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.m1930(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴ, reason: contains not printable characters */
    public static void m1932(Activity activity, String[] strArr, int i5) {
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (TextUtils.isEmpty(strArr[i6])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (!androidx.core.os.a.m2404() && TextUtils.equals(strArr[i6], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i6));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < strArr.length; i8++) {
                if (!hashSet.contains(Integer.valueOf(i8))) {
                    strArr2[i7] = strArr[i8];
                    i7++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof e) {
                ((e) activity).mo1942(i5);
            }
            c.m1940(activity, strArr, i5);
        } else if (activity instanceof d) {
            new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i5));
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static boolean m1933(Activity activity, String str) {
        if ((androidx.core.os.a.m2404() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) && Build.VERSION.SDK_INT >= 23) {
            return c.m1941(activity, str);
        }
        return false;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static void m1934(Activity activity, Intent intent, int i5, Bundle bundle) {
        C0024b.m1937(activity, intent, i5, bundle);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static void m1935(Activity activity, IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
        C0024b.m1938(activity, intentSender, i5, intent, i6, i7, i8, bundle);
    }
}
