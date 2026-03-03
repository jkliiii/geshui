package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.j3;
import androidx.core.view.accessibility.j0;
import androidx.core.view.b1;
import androidx.core.view.f1;
import androidx.core.widget.c0;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class NavigationBarItemView extends FrameLayout implements n.a {
    private static final d ACTIVE_INDICATOR_LABELED_TRANSFORM;
    private static final d ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorLabelPadding;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private d activeIndicatorTransform;
    private final View activeIndicatorView;
    private int activeTextAppearance;
    private BadgeDrawable badgeDrawable;
    private final ImageView icon;
    private final FrameLayout iconContainer;
    private ColorStateList iconTint;
    private boolean initialized;
    private boolean isShifting;
    Drawable itemBackground;
    private i itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private ColorStateList itemRippleColor;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    private Drawable wrappedIconDrawable;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            if (NavigationBarItemView.this.icon.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f5893;

        b(int i5) {
            this.f5893 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.updateActiveIndicatorLayoutParams(this.f5893);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ float f5895;

        c(float f5) {
            this.f5895 = f5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f5895);
        }
    }

    private static class d {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        protected float m6968(float f5, float f6) {
            return AnimationUtils.lerp(0.0f, 1.0f, f6 == 0.0f ? 0.8f : 0.0f, f6 == 0.0f ? 1.0f : 0.2f, f5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        protected float m6969(float f5, float f6) {
            return AnimationUtils.lerp(0.4f, 1.0f, f5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        protected float mo6970(float f5, float f6) {
            return 1.0f;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m6971(float f5, float f6, View view) {
            view.setScaleX(m6969(f5, f6));
            view.setScaleY(mo6970(f5, f6));
            view.setAlpha(m6968(f5, f6));
        }
    }

    private static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.d
        /* renamed from: ʽ */
        protected float mo6970(float f5, float f6) {
            return m6969(f5, f6);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        ACTIVE_INDICATOR_LABELED_TRANSFORM = new d(aVar);
        ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new e(aVar);
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.activeTextAppearance = 0;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.iconContainer = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.activeIndicatorView = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        this.icon = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.labelGroup = viewGroup;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = viewGroup.getPaddingBottom();
        this.activeIndicatorLabelPadding = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_item_active_indicator_label_padding);
        f1.m2843(textView, 2);
        f1.m2843(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private void calculateTextScaleFactors(float f5, float f6) {
        this.shiftAmount = f5 - f6;
        this.scaleUpFactor = (f6 * 1.0f) / f5;
        this.scaleDownFactor = (f5 * 1.0f) / f6;
    }

    private static Drawable createItemBackgroundCompat(ColorStateList colorStateList) {
        ColorStateList convertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(convertToRippleDrawableColor, null, null);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable m2213 = androidx.core.graphics.drawable.a.m2213(gradientDrawable);
        androidx.core.graphics.drawable.a.m2210(m2213, convertToRippleDrawableColor);
        return m2213;
    }

    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view == imageView && BadgeUtils.USE_COMPAT_PARENT) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.iconContainer;
        return frameLayout != null ? frameLayout : this.icon;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i5 = 0;
        for (int i6 = 0; i6 < indexOfChild; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i5++;
            }
        }
        return i5;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        return this.activeIndicatorResizeable && this.labelVisibilityMode == 2;
    }

    private void maybeAnimateActiveIndicatorToProgress(float f5) {
        if (!this.activeIndicatorEnabled || !this.initialized || !f1.m2903(this)) {
            setActiveIndicatorProgress(f5, f5);
            return;
        }
        ValueAnimator valueAnimator = this.activeIndicatorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.activeIndicatorAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.activeIndicatorProgress, f5);
        this.activeIndicatorAnimator = ofFloat;
        ofFloat.addUpdateListener(new c(f5));
        this.activeIndicatorAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        this.activeIndicatorAnimator.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        this.activeIndicatorAnimator.start();
    }

    private void refreshChecked() {
        i iVar = this.itemData;
        if (iVar != null) {
            setChecked(iVar.isChecked());
        }
    }

    private void refreshItemBackground() {
        Drawable drawable = this.itemBackground;
        RippleDrawable rippleDrawable = null;
        boolean z5 = true;
        if (this.itemRippleColor != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (Build.VERSION.SDK_INT >= 21 && this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && this.iconContainer != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor), null, activeIndicatorDrawable);
                z5 = false;
            } else if (drawable == null) {
                drawable = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.iconContainer.setForeground(rippleDrawable);
        }
        f1.m2836(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(float f5, float f6) {
        View view = this.activeIndicatorView;
        if (view != null) {
            this.activeIndicatorTransform.m6971(f5, f6, view);
        }
        this.activeIndicatorProgress = f5;
    }

    private static void setTextAppearanceWithoutFontScaling(TextView textView, int i5) {
        c0.m3570(textView, i5);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i5, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    private static void setViewScaleValues(View view, float f5, float f6, int i5) {
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setVisibility(i5);
    }

    private static void setViewTopMarginAndGravity(View view, int i5, int i6) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i5;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i6;
        view.setLayoutParams(layoutParams);
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
            }
            this.badgeDrawable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateActiveIndicatorLayoutParams(int i5) {
        if (this.activeIndicatorView == null || i5 <= 0) {
            return;
        }
        int min = Math.min(this.activeIndicatorDesiredWidth, i5 - (this.activeIndicatorMarginHorizontal * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
        layoutParams.height = isActiveIndicatorResizeableAndUnlabeled() ? min : this.activeIndicatorDesiredHeight;
        layoutParams.width = min;
        this.activeIndicatorView.setLayoutParams(layoutParams);
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    private static void updateViewPaddingBottom(View view, int i5) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i5);
    }

    void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null && this.activeIndicatorEnabled) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.activeIndicatorView;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    protected int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.itemData;
    }

    protected int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return getSuggestedIconHeight() + (this.labelGroup.getVisibility() == 0 ? this.activeIndicatorLabelPadding : 0) + layoutParams.topMargin + this.labelGroup.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.labelGroup.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void initialize(i iVar, int i5) {
        this.itemData = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        CharSequence tooltipText = !TextUtils.isEmpty(iVar.getTooltipText()) ? iVar.getTooltipText() : iVar.getTitle();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 21 || i6 > 23) {
            j3.m1399(this, tooltipText);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        this.initialized = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        i iVar = this.itemData;
        if (iVar != null && iVar.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        j0 m2620 = j0.m2620(accessibilityNodeInfo);
        m2620.m2644(j0.c.m2711(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            m2620.m2642(false);
            m2620.m2699(j0.a.f2869);
        }
        m2620.m2660(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        post(new b(i5));
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.activeIndicatorView;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        refreshItemBackground();
    }

    public void setActiveIndicatorEnabled(boolean z5) {
        this.activeIndicatorEnabled = z5;
        refreshItemBackground();
        View view = this.activeIndicatorView;
        if (view != null) {
            view.setVisibility(z5 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i5) {
        this.activeIndicatorDesiredHeight = i5;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i5) {
        if (this.activeIndicatorLabelPadding != i5) {
            this.activeIndicatorLabelPadding = i5;
            refreshChecked();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i5) {
        this.activeIndicatorMarginHorizontal = i5;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z5) {
        this.activeIndicatorResizeable = z5;
    }

    public void setActiveIndicatorWidth(int i5) {
        this.activeIndicatorDesiredWidth = i5;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    void setBadge(BadgeDrawable badgeDrawable) {
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && this.icon != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            tryRemoveBadgeFromAnchor(this.icon);
        }
        this.badgeDrawable = badgeDrawable;
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
    }

    public void setChecked(boolean z5) {
        this.largeLabel.setPivotX(r0.getWidth() / 2);
        this.largeLabel.setPivotY(r0.getBaseline());
        this.smallLabel.setPivotX(r0.getWidth() / 2);
        this.smallLabel.setPivotY(r0.getBaseline());
        maybeAnimateActiveIndicatorToProgress(z5 ? 1.0f : 0.0f);
        int i5 = this.labelVisibilityMode;
        if (i5 != -1) {
            if (i5 == 0) {
                if (z5) {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    this.largeLabel.setVisibility(0);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                    updateViewPaddingBottom(this.labelGroup, 0);
                    this.largeLabel.setVisibility(4);
                }
                this.smallLabel.setVisibility(4);
            } else if (i5 == 1) {
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                if (z5) {
                    setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                    setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                    TextView textView = this.smallLabel;
                    float f5 = this.scaleUpFactor;
                    setViewScaleValues(textView, f5, f5, 4);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    TextView textView2 = this.largeLabel;
                    float f6 = this.scaleDownFactor;
                    setViewScaleValues(textView2, f6, f6, 4);
                    setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
                }
            } else if (i5 == 2) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                this.largeLabel.setVisibility(8);
                this.smallLabel.setVisibility(8);
            }
        } else if (this.isShifting) {
            if (z5) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                this.largeLabel.setVisibility(0);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                updateViewPaddingBottom(this.labelGroup, 0);
                this.largeLabel.setVisibility(4);
            }
            this.smallLabel.setVisibility(4);
        } else {
            updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
            if (z5) {
                setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                TextView textView3 = this.smallLabel;
                float f7 = this.scaleUpFactor;
                setViewScaleValues(textView3, f7, f7, 4);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                TextView textView4 = this.largeLabel;
                float f8 = this.scaleDownFactor;
                setViewScaleValues(textView4, f8, f8, 4);
                setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z5);
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        this.smallLabel.setEnabled(z5);
        this.largeLabel.setEnabled(z5);
        this.icon.setEnabled(z5);
        if (z5) {
            f1.m2848(this, b1.m2753(getContext(), 1002));
        } else {
            f1.m2848(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.a.m2213(drawable).mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.m2210(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconSize(int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i5;
        layoutParams.height = i5;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.m2210(drawable, colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setItemBackground(int i5) {
        setItemBackground(i5 == 0 ? null : androidx.core.content.a.m1993(getContext(), i5));
    }

    public void setItemPaddingBottom(int i5) {
        if (this.itemPaddingBottom != i5) {
            this.itemPaddingBottom = i5;
            refreshChecked();
        }
    }

    public void setItemPaddingTop(int i5) {
        if (this.itemPaddingTop != i5) {
            this.itemPaddingTop = i5;
            refreshChecked();
        }
    }

    public void setItemPosition(int i5) {
        this.itemPosition = i5;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    public void setLabelVisibilityMode(int i5) {
        if (this.labelVisibilityMode != i5) {
            this.labelVisibilityMode = i5;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    public void setShifting(boolean z5) {
        if (this.isShifting != z5) {
            this.isShifting = z5;
            refreshChecked();
        }
    }

    public void setTextAppearanceActive(int i5) {
        this.activeTextAppearance = i5;
        setTextAppearanceWithoutFontScaling(this.largeLabel, i5);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z5) {
        setTextAppearanceActive(this.activeTextAppearance);
        TextView textView = this.largeLabel;
        textView.setTypeface(textView.getTypeface(), z5 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i5) {
        setTextAppearanceWithoutFontScaling(this.smallLabel, i5);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        i iVar = this.itemData;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        i iVar2 = this.itemData;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21 || i5 > 23) {
            j3.m1399(this, charSequence);
        }
    }

    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }

    public void setShortcut(boolean z5, char c6) {
    }
}
