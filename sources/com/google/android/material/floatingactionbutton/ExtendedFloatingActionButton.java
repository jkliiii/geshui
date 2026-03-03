package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    private static final int HIDE = 1;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    private int animState;
    private boolean animateShowBeforeLayout;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> behavior;
    private final com.google.android.material.floatingactionbutton.a changeVisibilityTracker;
    private final int collapsedSize;
    private final com.google.android.material.floatingactionbutton.g extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final com.google.android.material.floatingactionbutton.g hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;
    protected ColorStateList originalTextCsl;
    private int originalWidth;
    private final com.google.android.material.floatingactionbutton.g showStrategy;
    private final com.google.android.material.floatingactionbutton.g shrinkStrategy;
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final Property<View, Float> WIDTH = new f(Float.class, "width");
    static final Property<View, Float> HEIGHT = new g(Float.class, "height");
    static final Property<View, Float> PADDING_START = new h(Float.class, "paddingStart");
    static final Property<View, Float> PADDING_END = new i(Float.class, "paddingEnd");

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;
        private OnChangedCallback internalAutoHideCallback;
        private OnChangedCallback internalAutoShrinkCallback;
        private Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = AUTO_SHRINK_DEFAULT;
        }

        private static boolean isBottomSheet(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).m1896() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean shouldUpdateVisibility(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.autoHideEnabled || this.autoShrinkEnabled) && fVar.m1895() == view.getId()) {
                return AUTO_SHRINK_DEFAULT;
            }
            return false;
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return AUTO_SHRINK_DEFAULT;
            }
            extendOrShow(extendedFloatingActionButton);
            return AUTO_SHRINK_DEFAULT;
        }

        private boolean updateFabVisibilityForBottomSheet(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return AUTO_SHRINK_DEFAULT;
            }
            extendOrShow(extendedFloatingActionButton);
            return AUTO_SHRINK_DEFAULT;
        }

        protected void extendOrShow(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z5 = this.autoShrinkEnabled;
            extendedFloatingActionButton.performMotion(z5 ? 3 : 0, z5 ? this.internalAutoShrinkCallback : this.internalAutoHideCallback);
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public boolean isAutoShrinkEnabled() {
            return this.autoShrinkEnabled;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            if (fVar.f2511 == 0) {
                fVar.f2511 = 80;
            }
        }

        public void setAutoHideEnabled(boolean z5) {
            this.autoHideEnabled = z5;
        }

        public void setAutoShrinkEnabled(boolean z5) {
            this.autoShrinkEnabled = z5;
        }

        void setInternalAutoHideCallback(OnChangedCallback onChangedCallback) {
            this.internalAutoHideCallback = onChangedCallback;
        }

        void setInternalAutoShrinkCallback(OnChangedCallback onChangedCallback) {
            this.internalAutoShrinkCallback = onChangedCallback;
        }

        protected void shrinkOrHide(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z5 = this.autoShrinkEnabled;
            extendedFloatingActionButton.performMotion(z5 ? 2 : 1, z5 ? this.internalAutoShrinkCallback : this.internalAutoHideCallback);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (CoordinatorLayout) extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i5) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = dependencies.get(i6);
                if (!(view instanceof AppBarLayout)) {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i5);
            return AUTO_SHRINK_DEFAULT;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.autoShrinkEnabled = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, AUTO_SHRINK_DEFAULT);
            obtainStyledAttributes.recycle();
        }
    }

    class a implements m {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʻ, reason: contains not printable characters */
        public int mo6792() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʼ, reason: contains not printable characters */
        public int mo6793() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʽ, reason: contains not printable characters */
        public int mo6794() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʾ, reason: contains not printable characters */
        public int mo6795() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʿ, reason: contains not printable characters */
        public ViewGroup.LayoutParams mo6796() {
            return new ViewGroup.LayoutParams(mo6795(), mo6792());
        }
    }

    class b implements m {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʻ */
        public int mo6792() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʼ */
        public int mo6793() {
            return ExtendedFloatingActionButton.this.extendedPaddingEnd;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʽ */
        public int mo6794() {
            return ExtendedFloatingActionButton.this.extendedPaddingStart;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʾ */
        public int mo6795() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.extendedPaddingStart + ExtendedFloatingActionButton.this.extendedPaddingEnd;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʿ */
        public ViewGroup.LayoutParams mo6796() {
            return new ViewGroup.LayoutParams(-2, -2);
        }
    }

    class c implements m {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ m f5706;

        c(m mVar) {
            this.f5706 = mVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʻ */
        public int mo6792() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.originalHeight != -1) {
                return (ExtendedFloatingActionButton.this.originalHeight == 0 || ExtendedFloatingActionButton.this.originalHeight == -2) ? this.f5706.mo6792() : ExtendedFloatingActionButton.this.originalHeight;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f5706.mo6792();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height == -2) {
                return this.f5706.mo6792();
            }
            int i5 = 0;
            int paddingTop = view.getPaddingTop() + view.getPaddingBottom() + 0;
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i5 = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            return (view.getHeight() - i5) - paddingTop;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʼ */
        public int mo6793() {
            return ExtendedFloatingActionButton.this.extendedPaddingEnd;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʽ */
        public int mo6794() {
            return ExtendedFloatingActionButton.this.extendedPaddingStart;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʾ */
        public int mo6795() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f5706.mo6795();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2) {
                return this.f5706.mo6795();
            }
            int i5 = 0;
            int paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + 0;
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i5 = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
            return (view.getWidth() - i5) - paddingLeft;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʿ */
        public ViewGroup.LayoutParams mo6796() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.originalHeight == 0 ? -2 : ExtendedFloatingActionButton.this.originalHeight);
        }
    }

    class d implements m {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ m f5708;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ m f5709;

        d(m mVar, m mVar2) {
            this.f5708 = mVar;
            this.f5709 = mVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʻ */
        public int mo6792() {
            return ExtendedFloatingActionButton.this.originalHeight == -1 ? this.f5708.mo6792() : (ExtendedFloatingActionButton.this.originalHeight == 0 || ExtendedFloatingActionButton.this.originalHeight == -2) ? this.f5709.mo6792() : ExtendedFloatingActionButton.this.originalHeight;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʼ */
        public int mo6793() {
            return ExtendedFloatingActionButton.this.extendedPaddingEnd;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʽ */
        public int mo6794() {
            return ExtendedFloatingActionButton.this.extendedPaddingStart;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʾ */
        public int mo6795() {
            return ExtendedFloatingActionButton.this.originalWidth == -1 ? this.f5708.mo6795() : (ExtendedFloatingActionButton.this.originalWidth == 0 || ExtendedFloatingActionButton.this.originalWidth == -2) ? this.f5709.mo6795() : ExtendedFloatingActionButton.this.originalWidth;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m
        /* renamed from: ʿ */
        public ViewGroup.LayoutParams mo6796() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.originalWidth == 0 ? -2 : ExtendedFloatingActionButton.this.originalWidth, ExtendedFloatingActionButton.this.originalHeight != 0 ? ExtendedFloatingActionButton.this.originalHeight : -2);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f5711;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ com.google.android.material.floatingactionbutton.g f5712;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ OnChangedCallback f5713;

        e(com.google.android.material.floatingactionbutton.g gVar, OnChangedCallback onChangedCallback) {
            this.f5712 = gVar;
            this.f5713 = onChangedCallback;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5711 = true;
            this.f5712.mo6810();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5712.onAnimationEnd();
            if (this.f5711) {
                return;
            }
            this.f5712.mo6808(this.f5713);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5712.onAnimationStart(animator);
            this.f5711 = false;
        }
    }

    class f extends Property<View, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            view.getLayoutParams().width = f5.intValue();
            view.requestLayout();
        }
    }

    class g extends Property<View, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            view.getLayoutParams().height = f5.intValue();
            view.requestLayout();
        }
    }

    class h extends Property<View, Float> {
        h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(f1.m2871(view));
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            f1.m2847(view, f5.intValue(), view.getPaddingTop(), f1.m2867(view), view.getPaddingBottom());
        }
    }

    class i extends Property<View, Float> {
        i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(f1.m2867(view));
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            f1.m2847(view, f1.m2871(view), view.getPaddingTop(), f5.intValue(), view.getPaddingBottom());
        }
    }

    class j extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: ˈ, reason: contains not printable characters */
        private final m f5715;

        /* renamed from: ˉ, reason: contains not printable characters */
        private final boolean f5716;

        j(com.google.android.material.floatingactionbutton.a aVar, m mVar, boolean z5) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f5715 = mVar;
            this.f5716 = z5;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.isTransforming = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f5715.mo6796().width;
            layoutParams.height = this.f5715.mo6796().height;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.isExtended = this.f5716;
            ExtendedFloatingActionButton.this.isTransforming = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ʾ, reason: contains not printable characters */
        public int mo6805() {
            return this.f5716 ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo6806() {
            ExtendedFloatingActionButton.this.isExtended = this.f5716;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f5716) {
                ExtendedFloatingActionButton.this.originalWidth = layoutParams.width;
                ExtendedFloatingActionButton.this.originalHeight = layoutParams.height;
            }
            layoutParams.width = this.f5715.mo6796().width;
            layoutParams.height = this.f5715.mo6796().height;
            f1.m2847(ExtendedFloatingActionButton.this, this.f5715.mo6794(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f5715.mo6793(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        /* renamed from: ˈ, reason: contains not printable characters */
        public AnimatorSet mo6807() {
            MotionSpec m6825 = m6825();
            if (m6825.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = m6825.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f5715.mo6795());
                m6825.setPropertyValues("width", propertyValues);
            }
            if (m6825.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = m6825.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f5715.mo6792());
                m6825.setPropertyValues("height", propertyValues2);
            }
            if (m6825.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = m6825.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(f1.m2871(ExtendedFloatingActionButton.this), this.f5715.mo6794());
                m6825.setPropertyValues("paddingStart", propertyValues3);
            }
            if (m6825.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = m6825.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(f1.m2867(ExtendedFloatingActionButton.this), this.f5715.mo6793());
                m6825.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (m6825.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = m6825.getPropertyValues("labelOpacity");
                boolean z5 = this.f5716;
                propertyValues5[0].setFloatValues(z5 ? 0.0f : 1.0f, z5 ? 1.0f : 0.0f);
                m6825.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.m6824(m6825);
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ˊ, reason: contains not printable characters */
        public void mo6808(OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.f5716) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ˋ, reason: contains not printable characters */
        public boolean mo6809() {
            return this.f5716 == ExtendedFloatingActionButton.this.isExtended || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    class k extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean f5718;

        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.animState = 0;
            if (this.f5718) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f5718 = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.animState = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo6810() {
            super.mo6810();
            this.f5718 = true;
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ʾ */
        public int mo6805() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ʿ */
        public void mo6806() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ˊ */
        public void mo6808(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ˋ */
        public boolean mo6809() {
            return ExtendedFloatingActionButton.this.isOrWillBeHidden();
        }
    }

    class l extends com.google.android.material.floatingactionbutton.b {
        public l(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.animState = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.g
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.animState = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ʾ */
        public int mo6805() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ʿ */
        public void mo6806() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ˊ */
        public void mo6808(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.g
        /* renamed from: ˋ */
        public boolean mo6809() {
            return ExtendedFloatingActionButton.this.isOrWillBeShown();
        }
    }

    interface m {
        /* renamed from: ʻ */
        int mo6792();

        /* renamed from: ʼ */
        int mo6793();

        /* renamed from: ʽ */
        int mo6794();

        /* renamed from: ʾ */
        int mo6795();

        /* renamed from: ʿ */
        ViewGroup.LayoutParams mo6796();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    private m getSizeFromExtendStrategyType(int i5) {
        b bVar = new b();
        c cVar = new c(bVar);
        return i5 != 1 ? i5 != 2 ? new d(cVar, bVar) : cVar : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeHidden() {
        return getVisibility() == 0 ? this.animState == 1 : this.animState != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeShown() {
        return getVisibility() != 0 ? this.animState == 2 : this.animState != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performMotion(int i5, OnChangedCallback onChangedCallback) {
        com.google.android.material.floatingactionbutton.g gVar;
        if (i5 == 0) {
            gVar = this.showStrategy;
        } else if (i5 == 1) {
            gVar = this.hideStrategy;
        } else if (i5 == 2) {
            gVar = this.shrinkStrategy;
        } else {
            if (i5 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i5);
            }
            gVar = this.extendStrategy;
        }
        if (gVar.mo6809()) {
            return;
        }
        if (!shouldAnimateVisibilityChange()) {
            gVar.mo6806();
            gVar.mo6808(onChangedCallback);
            return;
        }
        if (i5 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = layoutParams.width;
                this.originalHeight = layoutParams.height;
            } else {
                this.originalWidth = getWidth();
                this.originalHeight = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet mo6807 = gVar.mo6807();
        mo6807.addListener(new e(gVar, onChangedCallback));
        Iterator<Animator.AnimatorListener> it = gVar.mo6822().iterator();
        while (it.hasNext()) {
            mo6807.addListener(it.next());
        }
        mo6807.start();
    }

    private void saveOriginalTextCsl() {
        this.originalTextCsl = getTextColors();
    }

    private boolean shouldAnimateVisibilityChange() {
        return (f1.m2808(this) || (!isOrWillBeShown() && this.animateShowBeforeLayout)) && !isInEditMode();
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.extendStrategy.mo6819(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.hideStrategy.mo6819(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.showStrategy.mo6819(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.mo6819(animatorListener);
    }

    public void extend() {
        performMotion(3, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.behavior;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i5 = this.collapsedSize;
        return i5 < 0 ? (Math.min(f1.m2871(this), f1.m2867(this)) * 2) + getIconSize() : i5;
    }

    public MotionSpec getExtendMotionSpec() {
        return this.extendStrategy.mo6821();
    }

    public MotionSpec getHideMotionSpec() {
        return this.hideStrategy.mo6821();
    }

    public MotionSpec getShowMotionSpec() {
        return this.showStrategy.mo6821();
    }

    public MotionSpec getShrinkMotionSpec() {
        return this.shrinkStrategy.mo6821();
    }

    public void hide() {
        performMotion(1, null);
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isExtended && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.isExtended = false;
            this.shrinkStrategy.mo6806();
        }
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.extendStrategy.mo6823(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.hideStrategy.mo6823(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.showStrategy.mo6823(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.mo6823(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z5) {
        this.animateShowBeforeLayout = z5;
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        this.extendStrategy.mo6820(motionSpec);
    }

    public void setExtendMotionSpecResource(int i5) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i5));
    }

    public void setExtended(boolean z5) {
        if (this.isExtended == z5) {
            return;
        }
        com.google.android.material.floatingactionbutton.g gVar = z5 ? this.extendStrategy : this.shrinkStrategy;
        if (gVar.mo6809()) {
            return;
        }
        gVar.mo6806();
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideStrategy.mo6820(motionSpec);
    }

    public void setHideMotionSpecResource(int i5) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i5));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i5, int i6, int i7, int i8) {
        super.setPadding(i5, i6, i7, i8);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = f1.m2871(this);
        this.extendedPaddingEnd = f1.m2867(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i5, int i6, int i7, int i8) {
        super.setPaddingRelative(i5, i6, i7, i8);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i5;
        this.extendedPaddingEnd = i7;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.showStrategy.mo6820(motionSpec);
    }

    public void setShowMotionSpecResource(int i5) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i5));
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        this.shrinkStrategy.mo6820(motionSpec);
    }

    public void setShrinkMotionSpecResource(int i5) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i5));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i5) {
        super.setTextColor(i5);
        saveOriginalTextCsl();
    }

    public void show() {
        performMotion(0, null);
    }

    public void shrink() {
        performMotion(2, null);
    }

    protected void silentlyUpdateTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(OnChangedCallback onChangedCallback) {
        performMotion(3, onChangedCallback);
    }

    public void hide(OnChangedCallback onChangedCallback) {
        performMotion(1, onChangedCallback);
    }

    public void show(OnChangedCallback onChangedCallback) {
        performMotion(0, onChangedCallback);
    }

    public void shrink(OnChangedCallback onChangedCallback) {
        performMotion(2, onChangedCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.animState = 0;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        this.changeVisibilityTracker = aVar;
        l lVar = new l(aVar);
        this.showStrategy = lVar;
        k kVar = new k(aVar);
        this.hideStrategy = kVar;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = getContext();
        this.behavior = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.ExtendedFloatingActionButton, i5, i6, new int[0]);
        MotionSpec createFromAttribute = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        MotionSpec createFromAttribute2 = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        MotionSpec createFromAttribute3 = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        MotionSpec createFromAttribute4 = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.collapsedSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i7 = obtainStyledAttributes.getInt(R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.extendStrategyType = i7;
        this.extendedPaddingStart = f1.m2871(this);
        this.extendedPaddingEnd = f1.m2867(this);
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        j jVar = new j(aVar2, getSizeFromExtendStrategyType(i7), true);
        this.extendStrategy = jVar;
        j jVar2 = new j(aVar2, new a(), false);
        this.shrinkStrategy = jVar2;
        lVar.mo6820(createFromAttribute);
        kVar.mo6820(createFromAttribute2);
        jVar.mo6820(createFromAttribute3);
        jVar2.mo6820(createFromAttribute4);
        obtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i5, i6, ShapeAppearanceModel.PILL).build());
        saveOriginalTextCsl();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
    }

    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }
}
