package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.f1;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* compiled from: SearchViewAnimationHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final SearchView f5992;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final View f5993;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final ClippableRoundedCornerLayout f5994;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final FrameLayout f5995;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final FrameLayout f5996;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Toolbar f5997;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Toolbar f5998;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final TextView f5999;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final EditText f6000;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final ImageButton f6001;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final View f6002;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final TouchObserverFrameLayout f6003;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final MaterialMainContainerBackHelper f6004;

    /* renamed from: י, reason: contains not printable characters */
    private AnimatorSet f6005;

    /* renamed from: ـ, reason: contains not printable characters */
    private SearchBar f6006;

    /* compiled from: SearchViewAnimationHelper.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!d0.this.f5992.isAdjustNothingSoftInputMode()) {
                d0.this.f5992.requestFocusAndShowKeyboardIfNeeded();
            }
            d0.this.f5992.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d0.this.f5994.setVisibility(0);
            d0.this.f6006.stopOnLoadAnimation();
        }
    }

    /* compiled from: SearchViewAnimationHelper.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d0.this.f5994.setVisibility(8);
            if (!d0.this.f5992.isAdjustNothingSoftInputMode()) {
                d0.this.f5992.clearFocusAndHideKeyboard();
            }
            d0.this.f5992.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d0.this.f5992.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* compiled from: SearchViewAnimationHelper.java */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!d0.this.f5992.isAdjustNothingSoftInputMode()) {
                d0.this.f5992.requestFocusAndShowKeyboardIfNeeded();
            }
            d0.this.f5992.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d0.this.f5994.setVisibility(0);
            d0.this.f5992.setTransitionState(SearchView.TransitionState.SHOWING);
        }
    }

    /* compiled from: SearchViewAnimationHelper.java */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d0.this.f5994.setVisibility(8);
            if (!d0.this.f5992.isAdjustNothingSoftInputMode()) {
                d0.this.f5992.clearFocusAndHideKeyboard();
            }
            d0.this.f5992.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d0.this.f5992.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* compiled from: SearchViewAnimationHelper.java */
    class e extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ boolean f6011;

        e(boolean z5) {
            this.f6011 = z5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d0.this.m7114(this.f6011 ? 1.0f : 0.0f);
            d0.this.f5994.resetClipBoundsAndCornerRadius();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d0.this.m7114(this.f6011 ? 0.0f : 1.0f);
        }
    }

    d0(SearchView searchView) {
        this.f5992 = searchView;
        this.f5993 = searchView.scrim;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.f5994 = clippableRoundedCornerLayout;
        this.f5995 = searchView.headerContainer;
        this.f5996 = searchView.toolbarContainer;
        this.f5997 = searchView.toolbar;
        this.f5998 = searchView.dummyToolbar;
        this.f5999 = searchView.searchPrefix;
        this.f6000 = searchView.editText;
        this.f6001 = searchView.clearButton;
        this.f6002 = searchView.divider;
        this.f6003 = searchView.contentContainer;
        this.f6004 = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private int m7072(View view) {
        int m3353 = androidx.core.view.u.m3353((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return ViewUtils.isLayoutRtl(this.f6006) ? this.f6006.getLeft() - m3353 : (this.f6006.getRight() - this.f5992.getWidth()) + m3353;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private void m7073() {
        Menu menu = this.f5998.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f6006.getMenuResId() == -1 || !this.f5992.isMenuItemsAnimated()) {
            this.f5998.setVisibility(8);
            return;
        }
        this.f5998.inflateMenu(this.f6006.getMenuResId());
        m7104(this.f5998);
        this.f5998.setVisibility(0);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private AnimatorSet m7074() {
        if (this.f5992.isAdjustNothingSoftInputMode()) {
            this.f5992.clearFocusAndHideKeyboard();
        }
        AnimatorSet m7107 = m7107(false);
        m7107.addListener(new b());
        m7107.start();
        return m7107;
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private AnimatorSet m7075() {
        if (this.f5992.isAdjustNothingSoftInputMode()) {
            this.f5992.clearFocusAndHideKeyboard();
        }
        AnimatorSet m7091 = m7091(false);
        m7091.addListener(new d());
        m7091.start();
        return m7091;
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private void m7076() {
        if (this.f5992.isAdjustNothingSoftInputMode()) {
            this.f5992.requestFocusAndShowKeyboardIfNeeded();
        }
        this.f5992.setTransitionState(SearchView.TransitionState.SHOWING);
        m7073();
        this.f6000.setText(this.f6006.getText());
        EditText editText = this.f6000;
        editText.setSelection(editText.getText().length());
        this.f5994.setVisibility(4);
        this.f5994.post(new Runnable() { // from class: com.google.android.material.search.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f6048.m7110();
            }
        });
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private void m7077() {
        if (this.f5992.isAdjustNothingSoftInputMode()) {
            final SearchView searchView = this.f5992;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.a0
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.requestFocusAndShowKeyboardIfNeeded();
                }
            }, 150L);
        }
        this.f5994.setVisibility(4);
        this.f5994.post(new Runnable() { // from class: com.google.android.material.search.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5980.m7102();
            }
        });
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private int m7079() {
        return ((this.f6006.getTop() + this.f6006.getBottom()) / 2) - ((this.f5996.getTop() + this.f5996.getBottom()) / 2);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private int m7081(View view) {
        int m3354 = androidx.core.view.u.m3354((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int m2871 = f1.m2871(this.f6006);
        return ViewUtils.isLayoutRtl(this.f6006) ? ((this.f6006.getWidth() - this.f6006.getRight()) + m3354) - m2871 : (this.f6006.getLeft() - m3354) + m2871;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private Animator m7083(boolean z5) {
        Rect initialHideToClipBounds = this.f6004.getInitialHideToClipBounds();
        Rect initialHideFromClipBounds = this.f6004.getInitialHideFromClipBounds();
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.f5992);
        }
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.f5994, this.f6006);
        }
        final Rect rect = new Rect(initialHideFromClipBounds);
        final float cornerSize = this.f6006.getCornerSize();
        final float max = Math.max(this.f5994.getCornerRadius(), this.f6004.getExpandedCornerSize());
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5986.m7100(cornerSize, max, rect, valueAnimator);
            }
        });
        ofObject.setDuration(z5 ? 300L : 250L);
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private Animator m7085(boolean z5) {
        return m7089(z5, false, this.f5995);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private Animator m7087(boolean z5) {
        return m7089(z5, true, this.f5999);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private Animator m7089(boolean z5, boolean z6, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z6 ? m7081(view) : m7072(view), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m7079(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z5 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private AnimatorSet m7091(boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m7094());
        m7095(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet.setDuration(z5 ? 350L : 300L);
        return animatorSet;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m7093(AnimatorSet animatorSet) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this.f5997);
        if (actionMenuView == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m7072(actionMenuView), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m7079(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private Animator m7094() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5994.getHeight(), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.f5994));
        return ofFloat;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m7095(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f5997);
        if (navigationIconButton == null) {
            return;
        }
        Drawable m2212 = androidx.core.graphics.drawable.a.m2212(navigationIconButton.getDrawable());
        if (!this.f5992.isAnimatedNavigationIcon()) {
            m7116(m2212);
        } else {
            m7099(animatorSet, m2212);
            m7101(animatorSet, m2212);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static /* synthetic */ void m7096(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        fadeThroughDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m7097(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f5997);
        if (navigationIconButton == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m7081(navigationIconButton), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m7079(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏˏ, reason: contains not printable characters */
    public static /* synthetic */ void m7098(androidx.appcompat.graphics.drawable.g gVar, ValueAnimator valueAnimator) {
        gVar.m822(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m7099(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.g) {
            final androidx.appcompat.graphics.drawable.g gVar = (androidx.appcompat.graphics.drawable.g) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.y
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d0.m7098(gVar, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑˑ, reason: contains not printable characters */
    public /* synthetic */ void m7100(float f5, float f6, Rect rect, ValueAnimator valueAnimator) {
        this.f5994.updateClipBoundsAndCornerRadius(rect, AnimationUtils.lerp(f5, f6, valueAnimator.getAnimatedFraction()));
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m7101(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof FadeThroughDrawable) {
            final FadeThroughDrawable fadeThroughDrawable = (FadeThroughDrawable) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.x
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d0.m7096(fadeThroughDrawable, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: יי, reason: contains not printable characters */
    public /* synthetic */ void m7102() {
        this.f5994.setTranslationY(r0.getHeight());
        AnimatorSet m7091 = m7091(true);
        m7091.addListener(new c());
        m7091.start();
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private Animator m7103(boolean z5) {
        TimeInterpolator timeInterpolator = z5 ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z5 ? 300L : 250L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, timeInterpolator));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f5993));
        return ofFloat;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private void m7104(Toolbar toolbar) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i5 = 0; i5 < actionMenuView.getChildCount(); i5++) {
                View childAt = actionMenuView.getChildAt(i5);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private Animator m7105(boolean z5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z5 ? 300L : 250L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.f5992.isMenuItemsAnimated()) {
            ofFloat.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(this.f5998), ToolbarUtils.getActionMenuView(this.f5997)));
        }
        return ofFloat;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private Animator m7106(boolean z5) {
        return m7089(z5, true, this.f6000);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private AnimatorSet m7107(boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (!(this.f6005 != null)) {
            animatorSet.playTogether(m7108(z5), m7109(z5));
        }
        animatorSet.playTogether(m7103(z5), m7083(z5), m7111(z5), m7115(z5), m7085(z5), m7119(z5), m7105(z5), m7106(z5), m7087(z5));
        animatorSet.addListener(new e(z5));
        return animatorSet;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private AnimatorSet m7108(boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        m7095(animatorSet);
        animatorSet.setDuration(z5 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private AnimatorSet m7109(boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        m7097(animatorSet);
        m7093(animatorSet);
        animatorSet.setDuration(z5 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public /* synthetic */ void m7110() {
        AnimatorSet m7107 = m7107(true);
        m7107.addListener(new a());
        m7107.start();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private Animator m7111(boolean z5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z5 ? 50L : 42L);
        ofFloat.setStartDelay(z5 ? 250L : 0L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f6001));
        return ofFloat;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private void m7112(float f5) {
        ActionMenuView actionMenuView;
        if (!this.f5992.isMenuItemsAnimated() || (actionMenuView = ToolbarUtils.getActionMenuView(this.f5997)) == null) {
            return;
        }
        actionMenuView.setAlpha(f5);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Animator m7113(boolean z5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z5 ? 150L : 83L);
        ofFloat.setStartDelay(z5 ? 75L : 0L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f6002, this.f6003));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public void m7114(float f5) {
        this.f6001.setAlpha(f5);
        this.f6002.setAlpha(f5);
        this.f6003.setAlpha(f5);
        m7112(f5);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private Animator m7115(boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m7113(z5), m7118(z5), m7117(z5));
        return animatorSet;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private void m7116(Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.g) {
            ((androidx.appcompat.graphics.drawable.g) drawable).m822(1.0f);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private Animator m7117(boolean z5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat.setDuration(z5 ? 300L : 250L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.scaleListener(this.f6003));
        return ofFloat;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private Animator m7118(boolean z5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.f6003.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat.setDuration(z5 ? 300L : 250L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z5, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.f6002));
        return ofFloat;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private Animator m7119(boolean z5) {
        return m7089(z5, false, this.f5998);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void m7120() {
        if (this.f6006 != null) {
            m7076();
        } else {
            m7077();
        }
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    void m7121(androidx.activity.b bVar) {
        this.f6004.startBackProgress(bVar, this.f6006);
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    public void m7122(androidx.activity.b bVar) {
        if (bVar.m365() <= 0.0f) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.f6004;
        SearchBar searchBar = this.f6006;
        materialMainContainerBackHelper.updateBackProgress(bVar, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f6005;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (bVar.m365() * this.f6005.getDuration()));
            return;
        }
        if (this.f5992.isAdjustNothingSoftInputMode()) {
            this.f5992.clearFocusAndHideKeyboard();
        }
        if (this.f5992.isAnimatedNavigationIcon()) {
            AnimatorSet m7108 = m7108(false);
            this.f6005 = m7108;
            m7108.start();
            this.f6005.pause();
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: ˊˊ, reason: contains not printable characters */
    AnimatorSet m7123() {
        return this.f6006 != null ? m7074() : m7075();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m7124() {
        this.f6004.cancelBackProgress(this.f6006);
        AnimatorSet animatorSet = this.f6005;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f6005 = null;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public void m7125() {
        this.f6004.finishBackProgress(m7123().getTotalDuration(), this.f6006);
        if (this.f6005 != null) {
            m7109(false).start();
            this.f6005.resume();
        }
        this.f6005 = null;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    MaterialMainContainerBackHelper m7126() {
        return this.f6004;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public androidx.activity.b m7127() {
        return this.f6004.onHandleBackInvoked();
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    void m7128(SearchBar searchBar) {
        this.f6006 = searchBar;
    }
}
