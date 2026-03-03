package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected static final Class<?> f2540;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected static final Field f2541;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected static final Field f2542;

    /* renamed from: ʾ, reason: contains not printable characters */
    protected static final Method f2543;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected static final Method f2544;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected static final Method f2545;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final Handler f2546 = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d f2547;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Object f2548;

        a(d dVar, Object obj) {
            this.f2547 = dVar;
            this.f2548 = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2547.f2553 = this.f2548;
        }
    }

    /* compiled from: ActivityRecreator.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Application f2549;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ d f2550;

        b(Application application, d dVar) {
            this.f2549 = application;
            this.f2550 = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2549.unregisterActivityLifecycleCallbacks(this.f2550);
        }
    }

    /* compiled from: ActivityRecreator.java */
    class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Object f2551;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Object f2552;

        c(Object obj, Object obj2) {
            this.f2551 = obj;
            this.f2552 = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = g.f2543;
                if (method != null) {
                    method.invoke(this.f2551, this.f2552, Boolean.FALSE, "AppCompat recreation");
                } else {
                    g.f2544.invoke(this.f2551, this.f2552, Boolean.FALSE);
                }
            } catch (RuntimeException e5) {
                if (e5.getClass() == RuntimeException.class && e5.getMessage() != null && e5.getMessage().startsWith("Unable to stop")) {
                    throw e5;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> m1946 = m1946();
        f2540 = m1946;
        f2541 = m1947();
        f2542 = m1951();
        f2543 = m1949(m1946);
        f2544 = m1948(m1946);
        f2545 = m1950(m1946);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Class<?> m1946() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Field m1947() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Method m1948(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Method m1949(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static Method m1950(Class<?> cls) {
        if (m1952() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static Field m1951() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static boolean m1952() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 == 26 || i5 == 27;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    protected static boolean m1953(Object obj, int i5, Activity activity) {
        try {
            Object obj2 = f2542.get(activity);
            if (obj2 == obj && activity.hashCode() == i5) {
                f2546.postAtFrontOfQueue(new c(f2541.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static boolean m1954(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m1952() && f2545 == null) {
            return false;
        }
        if (f2544 == null && f2543 == null) {
            return false;
        }
        try {
            Object obj2 = f2542.get(activity);
            if (obj2 == null || (obj = f2541.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f2546;
            handler.post(new a(dVar, obj2));
            try {
                if (m1952()) {
                    Method method = f2545;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f2546.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* compiled from: ActivityRecreator.java */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ʾ, reason: contains not printable characters */
        Object f2553;

        /* renamed from: ʿ, reason: contains not printable characters */
        private Activity f2554;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final int f2555;

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean f2556 = false;

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f2557 = false;

        /* renamed from: ˊ, reason: contains not printable characters */
        private boolean f2558 = false;

        d(Activity activity) {
            this.f2554 = activity;
            this.f2555 = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2554 == activity) {
                this.f2554 = null;
                this.f2557 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2557 || this.f2558 || this.f2556 || !g.m1953(this.f2553, this.f2555, activity)) {
                return;
            }
            this.f2558 = true;
            this.f2553 = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2554 == activity) {
                this.f2556 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
