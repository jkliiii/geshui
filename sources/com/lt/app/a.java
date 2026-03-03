package com.lt.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: AppLifecycle.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f6718 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Activity f6719 = null;

    /* renamed from: ˆ, reason: contains not printable characters */
    private InterfaceC0094a f6720 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private long f6721 = -1;

    /* renamed from: ˉ, reason: contains not printable characters */
    private long f6722 = 0;

    /* compiled from: AppLifecycle.java */
    /* renamed from: com.lt.app.a$a, reason: collision with other inner class name */
    interface InterfaceC0094a {
        /* renamed from: ʻ */
        void mo7836();

        /* renamed from: ʼ */
        void mo7840();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f6719 == activity) {
            this.f6719 = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f6719 = activity;
        if (this.f6718) {
            return;
        }
        this.f6718 = true;
        if (this.f6722 > 0) {
            this.f6721 = (System.currentTimeMillis() - this.f6722) / 1000;
            InterfaceC0094a interfaceC0094a = this.f6720;
            if (interfaceC0094a != null) {
                interfaceC0094a.mo7840();
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        if (i5 == 20) {
            if (this.f6719 == null) {
                this.f6722 = -1L;
            } else {
                this.f6722 = System.currentTimeMillis();
            }
            this.f6718 = false;
            InterfaceC0094a interfaceC0094a = this.f6720;
            if (interfaceC0094a != null) {
                interfaceC0094a.mo7836();
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public Activity m7953() {
        return this.f6719;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public long m7954() {
        return this.f6721;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m7955(InterfaceC0094a interfaceC0094a) {
        this.f6720 = interfaceC0094a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
