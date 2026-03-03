package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f1;

/* compiled from: Fade.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends s0 {

    /* compiled from: Fade.java */
    class a extends r {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f4481;

        a(View view) {
            this.f4481 = view;
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            f0.m5356(this.f4481, 1.0f);
            f0.m5350(this.f4481);
            qVar.removeListener(this);
        }
    }

    /* compiled from: Fade.java */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final View f4483;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f4484 = false;

        b(View view) {
            this.f4483 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f0.m5356(this.f4483, 1.0f);
            if (this.f4484) {
                this.f4483.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (f1.m2899(this.f4483) && this.f4483.getLayerType() == 0) {
                this.f4484 = true;
                this.f4483.setLayerType(2, null);
            }
        }
    }

    public d(int i5) {
        setMode(i5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Animator m5344(View view, float f5, float f6) {
        if (f5 == f6) {
            return null;
        }
        f0.m5356(view, f5);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, f0.f4501, f6);
        ofFloat.addListener(new b(view));
        addListener(new a(view));
        return ofFloat;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static float m5345(x xVar, float f5) {
        Float f6;
        return (xVar == null || (f6 = (Float) xVar.f4580.get("android:fade:transitionAlpha")) == null) ? f5 : f6.floatValue();
    }

    @Override // androidx.transition.s0, androidx.transition.q
    public void captureStartValues(x xVar) {
        super.captureStartValues(xVar);
        xVar.f4580.put("android:fade:transitionAlpha", Float.valueOf(f0.m5352(xVar.f4581)));
    }

    @Override // androidx.transition.s0
    public Animator onAppear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        float m5345 = m5345(xVar, 0.0f);
        return m5344(view, m5345 != 1.0f ? m5345 : 0.0f, 1.0f);
    }

    @Override // androidx.transition.s0
    public Animator onDisappear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        f0.m5354(view);
        return m5344(view, m5345(xVar, 1.0f), 0.0f);
    }

    public d() {
    }
}
