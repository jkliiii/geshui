package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class x0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final View f3070;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ViewTreeObserver f3071;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Runnable f3072;

    private x0(View view, Runnable runnable) {
        this.f3070 = view;
        this.f3071 = view.getViewTreeObserver();
        this.f3072 = runnable;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static x0 m3434(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        x0 x0Var = new x0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(x0Var);
        view.addOnAttachStateChangeListener(x0Var);
        return x0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m3435();
        this.f3072.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3071 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m3435();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m3435() {
        if (this.f3071.isAlive()) {
            this.f3071.removeOnPreDrawListener(this);
        } else {
            this.f3070.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3070.removeOnAttachStateChangeListener(this);
    }
}
