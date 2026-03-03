package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.g;
import androidx.core.view.x0;
import androidx.fragment.app.w;

/* compiled from: FragmentAnim.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g {

    /* compiled from: FragmentAnim.java */
    class a implements g.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3539;

        a(androidx.fragment.app.e eVar) {
            this.f3539 = eVar;
        }

        @Override // androidx.core.os.g.b
        public void onCancel() {
            if (this.f3539.getAnimatingAway() != null) {
                View animatingAway = this.f3539.getAnimatingAway();
                this.f3539.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f3539.setAnimator(null);
        }
    }

    /* compiled from: FragmentAnim.java */
    class c extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f3545;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f3546;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3547;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ w.g f3548;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ androidx.core.os.g f3549;

        c(ViewGroup viewGroup, View view, androidx.fragment.app.e eVar, w.g gVar, androidx.core.os.g gVar2) {
            this.f3545 = viewGroup;
            this.f3546 = view;
            this.f3547 = eVar;
            this.f3548 = gVar;
            this.f3549 = gVar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3545.endViewTransition(this.f3546);
            Animator animator2 = this.f3547.getAnimator();
            this.f3547.setAnimator(null);
            if (animator2 == null || this.f3545.indexOfChild(this.f3546) >= 0) {
                return;
            }
            this.f3548.mo4260(this.f3547, this.f3549);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m4052(androidx.fragment.app.e eVar, d dVar, w.g gVar) {
        View view = eVar.mView;
        ViewGroup viewGroup = eVar.mContainer;
        viewGroup.startViewTransition(view);
        androidx.core.os.g gVar2 = new androidx.core.os.g();
        gVar2.m2414(new a(eVar));
        gVar.mo4261(eVar, gVar2);
        if (dVar.f3550 != null) {
            e eVar2 = new e(dVar.f3550, viewGroup, view);
            eVar.setAnimatingAway(eVar.mView);
            eVar2.setAnimationListener(new b(viewGroup, eVar, gVar, gVar2));
            eVar.mView.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f3551;
        eVar.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, eVar, gVar, gVar2));
        animator.setTarget(eVar.mView);
        animator.start();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m4053(androidx.fragment.app.e eVar, boolean z5, boolean z6) {
        return z6 ? z5 ? eVar.getPopEnterAnim() : eVar.getPopExitAnim() : z5 ? eVar.getEnterAnim() : eVar.getExitAnim();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static d m4054(Context context, androidx.fragment.app.e eVar, boolean z5, boolean z6) {
        int nextTransition = eVar.getNextTransition();
        int m4053 = m4053(eVar, z5, z6);
        boolean z7 = false;
        eVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = eVar.mContainer;
        if (viewGroup != null) {
            int i5 = g0.b.f7828;
            if (viewGroup.getTag(i5) != null) {
                eVar.mContainer.setTag(i5, null);
            }
        }
        ViewGroup viewGroup2 = eVar.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = eVar.onCreateAnimation(nextTransition, z5, m4053);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        Animator onCreateAnimator = eVar.onCreateAnimator(nextTransition, z5, m4053);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        if (m4053 == 0 && nextTransition != 0) {
            m4053 = m4055(nextTransition, z5);
        }
        if (m4053 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m4053));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m4053);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z7 = true;
                } catch (Resources.NotFoundException e5) {
                    throw e5;
                } catch (RuntimeException unused) {
                }
            }
            if (!z7) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, m4053);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e6) {
                    if (equals) {
                        throw e6;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m4053);
                    if (loadAnimation2 != null) {
                        return new d(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int m4055(int i5, boolean z5) {
        if (i5 == 4097) {
            return z5 ? g0.a.f7824 : g0.a.f7825;
        }
        if (i5 == 4099) {
            return z5 ? g0.a.f7822 : g0.a.f7823;
        }
        if (i5 != 8194) {
            return -1;
        }
        return z5 ? g0.a.f7820 : g0.a.f7821;
    }

    /* compiled from: FragmentAnim.java */
    static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final Animation f3550;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final Animator f3551;

        d(Animation animation) {
            this.f3550 = animation;
            this.f3551 = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f3550 = null;
            this.f3551 = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final ViewGroup f3552;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final View f3553;

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f3554;

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean f3555;

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f3556;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3556 = true;
            this.f3552 = viewGroup;
            this.f3553 = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j5, Transformation transformation) {
            this.f3556 = true;
            if (this.f3554) {
                return !this.f3555;
            }
            if (!super.getTransformation(j5, transformation)) {
                this.f3554 = true;
                x0.m3434(this.f3552, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3554 || !this.f3556) {
                this.f3552.endViewTransition(this.f3553);
                this.f3555 = true;
            } else {
                this.f3556 = false;
                this.f3552.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j5, Transformation transformation, float f5) {
            this.f3556 = true;
            if (this.f3554) {
                return !this.f3555;
            }
            if (!super.getTransformation(j5, transformation, f5)) {
                this.f3554 = true;
                x0.m3434(this.f3552, this);
            }
            return true;
        }
    }

    /* compiled from: FragmentAnim.java */
    class b implements Animation.AnimationListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f3540;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3541;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ w.g f3542;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ androidx.core.os.g f3543;

        /* compiled from: FragmentAnim.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f3541.getAnimatingAway() != null) {
                    b.this.f3541.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f3542.mo4260(bVar.f3541, bVar.f3543);
                }
            }
        }

        b(ViewGroup viewGroup, androidx.fragment.app.e eVar, w.g gVar, androidx.core.os.g gVar2) {
            this.f3540 = viewGroup;
            this.f3541 = eVar;
            this.f3542 = gVar;
            this.f3543 = gVar2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3540.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
