package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {
    static final float FADE_THROUGH_THRESHOLD = 0.35f;
    private float progressThreshold = FADE_THROUGH_THRESHOLD;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6528;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6529;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ float f6530;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ float f6531;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ float f6532;

        a(View view, float f5, float f6, float f7, float f8) {
            this.f6528 = view;
            this.f6529 = f5;
            this.f6530 = f6;
            this.f6531 = f7;
            this.f6532 = f8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6528.setAlpha(q.m7762(this.f6529, this.f6530, this.f6531, this.f6532, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6533;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6534;

        b(View view, float f5) {
            this.f6533 = view;
            this.f6534 = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6533.setAlpha(this.f6534);
        }
    }

    private static Animator createFadeThroughAnimator(View view, float f5, float f6, float f7, float f8, float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f5, f6, f7, f8));
        ofFloat.addListener(new b(view, f9));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, 0.0f, alpha, this.progressThreshold, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, alpha, 0.0f, 0.0f, this.progressThreshold, alpha);
    }

    public float getProgressThreshold() {
        return this.progressThreshold;
    }

    public void setProgressThreshold(float f5) {
        this.progressThreshold = f5;
    }
}
