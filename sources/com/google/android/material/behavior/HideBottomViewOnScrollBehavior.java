package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: E:\78999\cookie_5123796.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;
    private ViewPropertyAnimator currentAnimator;

    @ScrollState
    private int currentState;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private static final int ENTER_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(View view, @ScrollState int i5);
    }

    public @interface ScrollState {
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.currentAnimator = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    private void animateChildTo(V v5, int i5, long j5, TimeInterpolator timeInterpolator) {
        this.currentAnimator = v5.animate().translationY(i5).setInterpolator(timeInterpolator).setDuration(j5).setListener(new a());
    }

    private void updateCurrentState(V v5, @ScrollState int i5) {
        this.currentState = i5;
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v5, this.currentState);
        }
    }

    public void addOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        this.height = v5.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v5.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v5.getContext(), ENTER_ANIM_DURATION_ATTR, DEFAULT_ENTER_ANIMATION_DURATION_MS);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v5.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v5.getContext();
        int i6 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i6, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v5.getContext(), i6, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v5, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        if (i6 > 0) {
            slideDown(v5);
        } else if (i6 < 0) {
            slideUp(v5);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i5, int i6) {
        return i5 == 2;
    }

    public void removeOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(V v5, int i5) {
        this.additionalHiddenOffsetY = i5;
        if (this.currentState == 1) {
            v5.setTranslationY(this.height + i5);
        }
    }

    public void slideDown(V v5) {
        slideDown(v5, true);
    }

    public void slideUp(V v5) {
        slideUp(v5, true);
    }

    public void slideDown(V v5, boolean z5) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        updateCurrentState(v5, 1);
        int i5 = this.height + this.additionalHiddenOffsetY;
        if (z5) {
            animateChildTo(v5, i5, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            v5.setTranslationY(i5);
        }
    }

    public void slideUp(V v5, boolean z5) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        updateCurrentState(v5, 2);
        if (z5) {
            animateChildTo(v5, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            v5.setTranslationY(0);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }
}
