package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {
    private float incomingEndThreshold = 1.0f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6422;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6423;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ float f6424;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ float f6425;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ float f6426;

        a(View view, float f5, float f6, float f7, float f8) {
            this.f6422 = view;
            this.f6423 = f5;
            this.f6424 = f6;
            this.f6425 = f7;
            this.f6426 = f8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6422.setAlpha(k.m7698(this.f6423, this.f6424, this.f6425, this.f6426, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6427;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6428;

        b(View view, float f5) {
            this.f6427 = view;
            this.f6428 = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6427.setAlpha(this.f6428);
        }
    }

    private static Animator createFadeAnimator(View view, float f5, float f6, float f7, float f8, float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f5, f6, f7, f8));
        ofFloat.addListener(new b(view, f9));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, 0.0f, alpha, 0.0f, this.incomingEndThreshold, alpha);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.incomingEndThreshold;
    }

    public void setIncomingEndThreshold(float f5) {
        this.incomingEndThreshold = f5;
    }
}
