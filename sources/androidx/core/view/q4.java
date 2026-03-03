package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class q4 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final WeakReference<View> f3007;

    /* renamed from: ʼ, reason: contains not printable characters */
    Runnable f3008 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    Runnable f3009 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f3010 = -1;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ r4 f3011;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f3012;

        a(r4 r4Var, View view) {
            this.f3011 = r4Var;
            this.f3012 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3011.mo1132(this.f3012);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3011.mo561(this.f3012);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3011.mo694(this.f3012);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static ViewPropertyAnimator m3294(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    q4(View view) {
        this.f3007 = new WeakReference<>(view);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m3283(View view, r4 r4Var) {
        if (r4Var != null) {
            view.animate().setListener(new a(r4Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public q4 m3284(float f5) {
        View view = this.f3007.get();
        if (view != null) {
            view.animate().alpha(f5);
        }
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m3285() {
        View view = this.f3007.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public long m3286() {
        View view = this.f3007.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public q4 m3287(long j5) {
        View view = this.f3007.get();
        if (view != null) {
            view.animate().setDuration(j5);
        }
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public q4 m3288(Interpolator interpolator) {
        View view = this.f3007.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public q4 m3289(r4 r4Var) {
        View view = this.f3007.get();
        if (view != null) {
            m3283(view, r4Var);
        }
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public q4 m3290(long j5) {
        View view = this.f3007.get();
        if (view != null) {
            view.animate().setStartDelay(j5);
        }
        return this;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public q4 m3291(final t4 t4Var) {
        final View view = this.f3007.get();
        if (view != null) {
            b.m3294(view.animate(), t4Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.p4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    t4Var.mo562(view);
                }
            } : null);
        }
        return this;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m3292() {
        View view = this.f3007.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public q4 m3293(float f5) {
        View view = this.f3007.get();
        if (view != null) {
            view.animate().translationY(f5);
        }
        return this;
    }
}
