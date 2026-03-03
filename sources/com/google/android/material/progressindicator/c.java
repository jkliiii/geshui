package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class c extends Drawable implements Animatable {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property<c, Float> GROW_FRACTION = new C0085c(Float.class, "growFraction");
    private List<androidx.vectordrawable.graphics.drawable.b> animationCallbacks;
    final BaseProgressIndicatorSpec baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private androidx.vectordrawable.graphics.drawable.b internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    private ValueAnimator showAnimator;
    private int totalAlpha;
    final Paint paint = new Paint();
    AnimatorDurationScaleProvider animatorDurationScaleProvider = new AnimatorDurationScaleProvider();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            c.this.dispatchAnimationStart();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            c.super.setVisible(false, false);
            c.this.dispatchAnimationEnd();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* renamed from: com.google.android.material.progressindicator.c$c, reason: collision with other inner class name */
    class C0085c extends Property<c, Float> {
        C0085c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(c cVar) {
            return Float.valueOf(cVar.getGrowFraction());
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(c cVar, Float f5) {
            cVar.setGrowFraction(f5.floatValue());
        }
    }

    c(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.context = context;
        this.baseSpec = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    private void cancelAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
        boolean z5 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.ignoreCallbacks = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.internalAnimationCallback;
        if (bVar != null) {
            bVar.mo5425(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo5425(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.internalAnimationCallback;
        if (bVar != null) {
            bVar.mo5426(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo5426(this);
        }
    }

    private void endAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
        boolean z5 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = z5;
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, GROW_FRACTION, 0.0f, 1.0f);
            this.showAnimator = ofFloat;
            ofFloat.setDuration(500L);
            this.showAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, GROW_FRACTION, 1.0f, 0.0f);
            this.hideAnimator = ofFloat2;
            ofFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setHideAnimator(this.hideAnimator);
        }
    }

    private void setHideAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.hideAnimator = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void setShowAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.showAnimator = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.totalAlpha;
    }

    float getGrowFraction() {
        if (this.baseSpec.isShowAnimationEnabled() || this.baseSpec.isHideAnimationEnabled()) {
            return (this.mockHideAnimationRunning || this.mockShowAnimationRunning) ? this.mockGrowFraction : this.growFraction;
        }
        return 1.0f;
    }

    ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.hideAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning;
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.showAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning;
    }

    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (this.animationCallbacks.contains(bVar)) {
            return;
        }
        this.animationCallbacks.add(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.totalAlpha = i5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    void setGrowFraction(float f5) {
        if (this.growFraction != f5) {
            this.growFraction = f5;
            invalidateSelf();
        }
    }

    void setInternalAnimationCallback(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.internalAnimationCallback = bVar;
    }

    void setMockHideAnimationRunning(boolean z5, float f5) {
        this.mockHideAnimationRunning = z5;
        this.mockGrowFraction = f5;
    }

    void setMockShowAnimationRunning(boolean z5, float f5) {
        this.mockShowAnimationRunning = z5;
        this.mockGrowFraction = f5;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        return setVisible(z5, z6, true);
    }

    boolean setVisibleInternal(boolean z5, boolean z6, boolean z7) {
        maybeInitializeAnimators();
        if (!isVisible() && !z5) {
            return false;
        }
        ValueAnimator valueAnimator = z5 ? this.showAnimator : this.hideAnimator;
        ValueAnimator valueAnimator2 = z5 ? this.hideAnimator : this.showAnimator;
        if (!z7) {
            if (valueAnimator2.isRunning()) {
                cancelAnimatorsWithoutCallbacks(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorsWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z5, false);
        }
        if (z7 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z8 = !z5 || super.setVisible(z5, false);
        if (!(z5 ? this.baseSpec.isShowAnimationEnabled() : this.baseSpec.isHideAnimationEnabled())) {
            endAnimatorsWithoutCallbacks(valueAnimator);
            return z8;
        }
        if (z6 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z8;
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.b bVar) {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.animationCallbacks;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.animationCallbacks.remove(bVar);
        if (!this.animationCallbacks.isEmpty()) {
            return true;
        }
        this.animationCallbacks = null;
        return true;
    }

    public boolean setVisible(boolean z5, boolean z6, boolean z7) {
        return setVisibleInternal(z5, z6, z7 && this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) > 0.0f);
    }
}
