package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: FragmentHostCallback.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class k<E> extends h {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Activity f3588;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Context f3589;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Handler f3590;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int f3591;

    /* renamed from: ˉ, reason: contains not printable characters */
    final n f3592;

    k(f fVar) {
        this(fVar, fVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.h
    /* renamed from: ʽ */
    public View mo4007(int i5) {
        return null;
    }

    @Override // androidx.fragment.app.h
    /* renamed from: ʾ */
    public boolean mo4008() {
        return true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    Activity m4118() {
        return this.f3588;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    Context m4119() {
        return this.f3589;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    Handler m4120() {
        return this.f3590;
    }

    /* renamed from: ˉ */
    public abstract E mo4045();

    /* renamed from: ˊ */
    public LayoutInflater mo4046() {
        return LayoutInflater.from(this.f3589);
    }

    /* renamed from: ˎ */
    public boolean mo4047(e eVar) {
        return true;
    }

    /* renamed from: ˏ */
    public boolean mo4048(String str) {
        return false;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m4122(e eVar, @SuppressLint({"UnknownNullness"}) Intent intent, int i5, Bundle bundle) {
        if (i5 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.m2000(this.f3589, intent, bundle);
    }

    @Deprecated
    /* renamed from: ـ, reason: contains not printable characters */
    public void m4123(e eVar, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
        if (i5 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.m1935(this.f3588, intentSender, i5, intent, i6, i7, i8, bundle);
    }

    k(Activity activity, Context context, Handler handler, int i5) {
        this.f3592 = new o();
        this.f3588 = activity;
        this.f3589 = (Context) androidx.core.util.h.m2584(context, "context == null");
        this.f3590 = (Handler) androidx.core.util.h.m2584(handler, "handler == null");
        this.f3591 = i5;
    }

    /* renamed from: ٴ */
    public void mo4049() {
    }

    @Deprecated
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m4121(e eVar, String[] strArr, int i5) {
    }
}
