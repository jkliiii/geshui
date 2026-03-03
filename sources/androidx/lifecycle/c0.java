package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.l;

/* compiled from: ReportFragment.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c0 extends Fragment {

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final b f3796 = new b(null);

    /* renamed from: ʾ, reason: contains not printable characters */
    private a f3797;

    /* compiled from: ReportFragment.kt */
    public interface a {
        void onCreate();

        /* renamed from: ʻ */
        void mo4391();

        /* renamed from: ʼ */
        void mo4392();
    }

    /* compiled from: ReportFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f4.g gVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m4407(Activity activity, l.a aVar) {
            f4.k.m8623(activity, "activity");
            f4.k.m8623(aVar, "event");
            if (activity instanceof r) {
                ((r) activity).getLifecycle().m4485(aVar);
            } else if (activity instanceof p) {
                l lifecycle = ((p) activity).getLifecycle();
                if (lifecycle instanceof q) {
                    ((q) lifecycle).m4485(aVar);
                }
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final c0 m4408(Activity activity) {
            f4.k.m8623(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            f4.k.m8621(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (c0) findFragmentByTag;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final void m4409(Activity activity) {
            f4.k.m8623(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m4410(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new c0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.kt */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* compiled from: ReportFragment.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f4.g gVar) {
                this();
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            public final void m4410(Activity activity) {
                f4.k.m8623(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m4410(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            f4.k.m8623(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            f4.k.m8623(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            f4.k.m8623(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            f4.k.m8623(activity, "activity");
            c0.f3796.m4407(activity, l.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            f4.k.m8623(activity, "activity");
            c0.f3796.m4407(activity, l.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            f4.k.m8623(activity, "activity");
            c0.f3796.m4407(activity, l.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            f4.k.m8623(activity, "activity");
            c0.f3796.m4407(activity, l.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            f4.k.m8623(activity, "activity");
            c0.f3796.m4407(activity, l.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            f4.k.m8623(activity, "activity");
            c0.f3796.m4407(activity, l.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            f4.k.m8623(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f4.k.m8623(activity, "activity");
            f4.k.m8623(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            f4.k.m8623(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            f4.k.m8623(activity, "activity");
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private final void m4401(l.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f3796;
            Activity activity = getActivity();
            f4.k.m8622(activity, "activity");
            bVar.m4407(activity, aVar);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private final void m4402(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final void m4403(a aVar) {
        if (aVar != null) {
            aVar.mo4391();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private final void m4404(a aVar) {
        if (aVar != null) {
            aVar.mo4392();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final void m4405(Activity activity) {
        f3796.m4409(activity);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4402(this.f3797);
        m4401(l.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m4401(l.a.ON_DESTROY);
        this.f3797 = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m4401(l.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m4403(this.f3797);
        m4401(l.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m4404(this.f3797);
        m4401(l.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m4401(l.a.ON_STOP);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final void m4406(a aVar) {
        this.f3797 = aVar;
    }
}
