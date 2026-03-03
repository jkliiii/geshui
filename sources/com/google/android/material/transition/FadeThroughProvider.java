package com.google.android.material.transition;

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
        final /* synthetic */ View f6429;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6430;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ float f6431;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ float f6432;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ float f6433;

        a(View view, float f5, float f6, float f7, float f8) {
            this.f6429 = view;
            this.f6430 = f5;
            this.f6431 = f6;
            this.f6432 = f7;
            this.f6433 = f8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6429.setAlpha(k.m7698(this.f6430, this.f6431, this.f6432, this.f6433, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6434;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6435;

        b(View view, float f5) {
            this.f6434 = view;
            this.f6435 = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6434.setAlpha(this.f6435);
        }
    }

    private static Animator createFadeThroughAnimator(View view, float f5, float f6, float f7, float f8, float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f5, f6, f7, f8));
        ofFloat.addListener(new b(view, f9));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, 0.0f, alpha, this.progressThreshold, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
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
