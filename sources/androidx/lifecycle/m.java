package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class m {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final m f3841 = new m();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final AtomicBoolean f3842 = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    public static final class a extends g {
        @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            f4.k.m8623(activity, "activity");
            c0.f3796.m4409(activity);
        }
    }

    private m() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m4460(Context context) {
        f4.k.m8623(context, "context");
        if (f3842.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        f4.k.m8621(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
