package x2;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContextReference.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class e<T> extends WeakReference<T> implements n {

    /* compiled from: ContextReference.java */
    static class a extends d<Context> {
        a(Context context) {
            super(context);
        }

        @Override // x2.n
        /* renamed from: ʻ, reason: contains not printable characters */
        public String mo12694() {
            if (((Context) get()) == null) {
                return "Context reference null";
            }
            return null;
        }
    }

    /* compiled from: ContextReference.java */
    public static class b extends d<Activity> {
        public b(Activity activity) {
            super(activity);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static String m12695(Activity activity) {
            if (activity == null) {
                return "Activity reference null";
            }
            if (activity.isFinishing()) {
                return "Activity finished";
            }
            return null;
        }

        @Override // x2.e.d, x2.n
        public /* bridge */ /* synthetic */ Context getContext() {
            return super.getContext();
        }

        @Override // x2.n
        /* renamed from: ʻ */
        public String mo12694() {
            return m12695((Activity) get());
        }
    }

    /* compiled from: ContextReference.java */
    public static class c extends e<ImageView> {
        public c(ImageView imageView) {
            super(imageView);
        }

        @Override // x2.n
        public Context getContext() {
            ImageView imageView = get();
            if (imageView == null) {
                return null;
            }
            return imageView.getContext();
        }

        @Override // x2.n
        /* renamed from: ʻ */
        public String mo12694() {
            ImageView imageView = get();
            return imageView == null ? "ImageView reference null" : d.m12696(imageView.getContext());
        }
    }

    /* compiled from: ContextReference.java */
    static abstract class d<T extends Context> extends e<T> {
        d(T t5) {
            super(t5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static String m12696(Context context) {
            if (context instanceof Service) {
                return C0174e.m12697((Service) context);
            }
            if (context instanceof Activity) {
                return b.m12695((Activity) context);
            }
            return null;
        }

        public Context getContext() {
            return get();
        }
    }

    /* compiled from: ContextReference.java */
    /* renamed from: x2.e$e, reason: collision with other inner class name */
    public static class C0174e extends d<Service> {
        public C0174e(Service service) {
            super(service);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static String m12697(Service service) {
            if (service == null) {
                return "Service reference null";
            }
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) service.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
            if (runningServices == null) {
                return "Could not retrieve services from service manager";
            }
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (it.hasNext()) {
                if (service.getClass().getName().equals(it.next().service.getClassName())) {
                    return null;
                }
            }
            return "Service stopped";
        }

        @Override // x2.e.d, x2.n
        public /* bridge */ /* synthetic */ Context getContext() {
            return super.getContext();
        }

        @Override // x2.n
        /* renamed from: ʻ */
        public String mo12694() {
            return m12697((Service) get());
        }
    }

    public e(T t5) {
        super(t5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static e m12693(Context context) {
        return context instanceof Service ? new C0174e((Service) context) : context instanceof Activity ? new b((Activity) context) : new a(context);
    }
}
