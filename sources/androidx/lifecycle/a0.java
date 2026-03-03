package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.c0;
import androidx.lifecycle.l;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a0 implements p {

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final b f3774 = new b(null);

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final a0 f3775 = new a0();

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f3776;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f3777;

    /* renamed from: ˉ, reason: contains not printable characters */
    private Handler f3780;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f3778 = true;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f3779 = true;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final q f3781 = new q(this);

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Runnable f3782 = new Runnable() { // from class: androidx.lifecycle.y
        @Override // java.lang.Runnable
        public final void run() {
            a0.m4380(this.f3893);
        }
    };

    /* renamed from: ˎ, reason: contains not printable characters */
    private final c0.a f3783 = new d();

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final a f3784 = new a();

        private a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final void m4388(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            f4.k.m8623(activity, "activity");
            f4.k.m8623(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f4.g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final p m4389() {
            return a0.f3775;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final void m4390(Context context) {
            f4.k.m8623(context, "context");
            a0.f3775.m4385(context);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class c extends g {

        /* compiled from: ProcessLifecycleOwner.kt */
        public static final class a extends g {
            final /* synthetic */ a0 this$0;

            a(a0 a0Var) {
                this.this$0 = a0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                f4.k.m8623(activity, "activity");
                this.this$0.m4382();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                f4.k.m8623(activity, "activity");
                this.this$0.m4383();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            f4.k.m8623(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                c0.f3796.m4408(activity).m4406(a0.this.f3783);
            }
        }

        @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            f4.k.m8623(activity, "activity");
            a0.this.m4381();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            f4.k.m8623(activity, "activity");
            a.m4388(activity, new a(a0.this));
        }

        @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            f4.k.m8623(activity, "activity");
            a0.this.m4384();
        }
    }

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public static final void m4380(a0 a0Var) {
        f4.k.m8623(a0Var, "this$0");
        a0Var.m4386();
        a0Var.m4387();
    }

    @Override // androidx.lifecycle.p
    public l getLifecycle() {
        return this.f3781;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m4381() {
        int i5 = this.f3777 - 1;
        this.f3777 = i5;
        if (i5 == 0) {
            Handler handler = this.f3780;
            f4.k.m8620(handler);
            handler.postDelayed(this.f3782, 700L);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final void m4382() {
        int i5 = this.f3777 + 1;
        this.f3777 = i5;
        if (i5 == 1) {
            if (this.f3778) {
                this.f3781.m4485(l.a.ON_RESUME);
                this.f3778 = false;
            } else {
                Handler handler = this.f3780;
                f4.k.m8620(handler);
                handler.removeCallbacks(this.f3782);
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final void m4383() {
        int i5 = this.f3776 + 1;
        this.f3776 = i5;
        if (i5 == 1 && this.f3779) {
            this.f3781.m4485(l.a.ON_START);
            this.f3779 = false;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final void m4384() {
        this.f3776--;
        m4387();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m4385(Context context) {
        f4.k.m8623(context, "context");
        this.f3780 = new Handler();
        this.f3781.m4485(l.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        f4.k.m8621(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m4386() {
        if (this.f3777 == 0) {
            this.f3778 = true;
            this.f3781.m4485(l.a.ON_PAUSE);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m4387() {
        if (this.f3776 == 0 && this.f3778) {
            this.f3781.m4485(l.a.ON_STOP);
            this.f3779 = true;
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class d implements c0.a {
        d() {
        }

        @Override // androidx.lifecycle.c0.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4391() {
            a0.this.m4382();
        }

        @Override // androidx.lifecycle.c0.a
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4392() {
            a0.this.m4383();
        }

        @Override // androidx.lifecycle.c0.a
        public void onCreate() {
        }
    }
}
