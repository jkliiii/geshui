package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collection;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final a listener;
    private final View[] views;

    interface a {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo6914(ValueAnimator valueAnimator, View view);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(a aVar, View... viewArr) {
        this.listener = aVar;
        this.views = viewArr;
    }

    public static MultiViewUpdateListener alphaListener(View... viewArr) {
        return new MultiViewUpdateListener(new h(), viewArr);
    }

    public static MultiViewUpdateListener scaleListener(View... viewArr) {
        return new MultiViewUpdateListener(new f(), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(ValueAnimator valueAnimator, View view) {
        Float f5 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f5.floatValue());
        view.setScaleY(f5.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static MultiViewUpdateListener translationXListener(View... viewArr) {
        return new MultiViewUpdateListener(new e(), viewArr);
    }

    public static MultiViewUpdateListener translationYListener(View... viewArr) {
        return new MultiViewUpdateListener(new g(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.views) {
            this.listener.mo6914(valueAnimator, view);
        }
    }

    public static MultiViewUpdateListener alphaListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new h(), collection);
    }

    public static MultiViewUpdateListener scaleListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new f(), collection);
    }

    public static MultiViewUpdateListener translationXListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new e(), collection);
    }

    public static MultiViewUpdateListener translationYListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new g(), collection);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(a aVar, Collection<View> collection) {
        this.listener = aVar;
        this.views = (View[]) collection.toArray(new View[0]);
    }
}
