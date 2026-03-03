package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;

    class a extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6592;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6593;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ float f6594;

        a(View view, float f5, float f6) {
            this.f6592 = view;
            this.f6593 = f5;
            this.f6594 = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6592.setScaleX(this.f6593);
            this.f6592.setScaleY(this.f6594);
        }
    }

    public ScaleProvider() {
        this(true);
    }

    private static Animator createScaleAnimator(View view, float f5, float f6) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f5, scaleX * f6), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f5 * scaleY, f6 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
        return this.growing ? createScaleAnimator(view, this.incomingStartScale, this.incomingEndScale) : createScaleAnimator(view, this.outgoingEndScale, this.outgoingStartScale);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
        if (this.scaleOnDisappear) {
            return this.growing ? createScaleAnimator(view, this.outgoingStartScale, this.outgoingEndScale) : createScaleAnimator(view, this.incomingEndScale, this.incomingStartScale);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.incomingEndScale;
    }

    public float getIncomingStartScale() {
        return this.incomingStartScale;
    }

    public float getOutgoingEndScale() {
        return this.outgoingEndScale;
    }

    public float getOutgoingStartScale() {
        return this.outgoingStartScale;
    }

    public boolean isGrowing() {
        return this.growing;
    }

    public boolean isScaleOnDisappear() {
        return this.scaleOnDisappear;
    }

    public void setGrowing(boolean z5) {
        this.growing = z5;
    }

    public void setIncomingEndScale(float f5) {
        this.incomingEndScale = f5;
    }

    public void setIncomingStartScale(float f5) {
        this.incomingStartScale = f5;
    }

    public void setOutgoingEndScale(float f5) {
        this.outgoingEndScale = f5;
    }

    public void setOutgoingStartScale(float f5) {
        this.outgoingStartScale = f5;
    }

    public void setScaleOnDisappear(boolean z5) {
        this.scaleOnDisappear = z5;
    }

    public ScaleProvider(boolean z5) {
        this.outgoingStartScale = 1.0f;
        this.outgoingEndScale = 1.1f;
        this.incomingStartScale = 0.8f;
        this.incomingEndScale = 1.0f;
        this.scaleOnDisappear = true;
        this.growing = z5;
    }
}
