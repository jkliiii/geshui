package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.u0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private boolean haveChildWithInterpolator;
    private f5 lastInsets;
    private boolean liftOnScroll;
    private final ColorStateList liftOnScrollColor;
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    protected static class BaseBehavior<T extends AppBarLayout> extends k<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private boolean coordinatorLayoutA11yScrollable;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(T t5);
        }

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ CoordinatorLayout f5248;

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ AppBarLayout f5249;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f5248 = coordinatorLayout;
                this.f5249 = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.setHeaderTopBottomOffset(this.f5248, this.f5249, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends androidx.core.view.a {
            b() {
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
                super.onInitializeAccessibilityNodeInfo(view, j0Var);
                j0Var.m2663(BaseBehavior.this.coordinatorLayoutA11yScrollable);
                j0Var.m2641(ScrollView.class.getName());
            }
        }

        class c implements o0 {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ CoordinatorLayout f5252;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ AppBarLayout f5253;

            /* renamed from: ʽ, reason: contains not printable characters */
            final /* synthetic */ View f5254;

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ int f5255;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i5) {
                this.f5252 = coordinatorLayout;
                this.f5253 = appBarLayout;
                this.f5254 = view;
                this.f5255 = i5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.o0
            /* renamed from: ʻ */
            public boolean mo2731(View view, o0.a aVar) {
                BaseBehavior.this.onNestedPreScroll(this.f5252, (CoordinatorLayout) this.f5253, this.f5254, 0, this.f5255, new int[]{0, 0}, 1);
                return true;
            }
        }

        class d implements o0 {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ AppBarLayout f5257;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ boolean f5258;

            d(AppBarLayout appBarLayout, boolean z5) {
                this.f5257 = appBarLayout;
                this.f5258 = z5;
            }

            @Override // androidx.core.view.accessibility.o0
            /* renamed from: ʻ */
            public boolean mo2731(View view, o0.a aVar) {
                this.f5257.setExpanded(this.f5258);
                return true;
            }
        }

        public BaseBehavior() {
        }

        private boolean addAccessibilityScrollActions(CoordinatorLayout coordinatorLayout, T t5, View view) {
            boolean z5 = false;
            if (getTopBottomOffsetForScrollingSibling() != (-t5.getTotalScrollRange())) {
                addActionToExpand(coordinatorLayout, t5, j0.a.f2884, false);
                z5 = true;
            }
            if (getTopBottomOffsetForScrollingSibling() != 0) {
                if (!view.canScrollVertically(-1)) {
                    addActionToExpand(coordinatorLayout, t5, j0.a.f2886, true);
                    return true;
                }
                int i5 = -t5.getDownNestedPreScrollRange();
                if (i5 != 0) {
                    f1.m2826(coordinatorLayout, j0.a.f2886, null, new c(coordinatorLayout, t5, view, i5));
                    return true;
                }
            }
            return z5;
        }

        private void addActionToExpand(CoordinatorLayout coordinatorLayout, T t5, j0.a aVar, boolean z5) {
            f1.m2826(coordinatorLayout, aVar, null, new d(t5, z5));
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, T t5, int i5, float f5) {
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i5);
            float abs2 = Math.abs(f5);
            animateOffsetWithDuration(coordinatorLayout, t5, i5, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t5.getHeight()) + 1.0f) * 150.0f));
        }

        private void animateOffsetWithDuration(CoordinatorLayout coordinatorLayout, T t5, int i5, int i6) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i5) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new a(coordinatorLayout, t5));
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i6, MAX_OFFSET_ANIMATION_DURATION));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i5);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i5, int i6, int i7) {
            return i5 < (i6 + i7) / 2 ? i6 : i7;
        }

        private boolean canScrollChildren(CoordinatorLayout coordinatorLayout, T t5, View view) {
            return t5.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t5.getHeight();
        }

        private static boolean checkFlag(int i5, int i6) {
            return (i5 & i6) == i6;
        }

        private boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                if (((LayoutParams) appBarLayout.getChildAt(i5).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        private View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if ((childAt instanceof androidx.core.view.o0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int i5) {
            int abs = Math.abs(i5);
            int childCount = appBarLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = appBarLayout.getChildAt(i6);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(T t5, int i5) {
            int childCount = t5.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t5.getChildAt(i6);
                int top2 = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top2 -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i7 = -i5;
                if (top2 <= i7 && bottom >= i7) {
                    return i6;
                }
            }
            return -1;
        }

        private View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).m1896() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(T t5, int i5) {
            int abs = Math.abs(i5);
            int childCount = t5.getChildCount();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = t5.getChildAt(i7);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i7++;
                } else if (scrollInterpolator != null) {
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        i6 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            i6 -= f1.m2865(childAt);
                        }
                    }
                    if (f1.m2891(childAt)) {
                        i6 -= t5.getTopInset();
                    }
                    if (i6 > 0) {
                        float f5 = i6;
                        return Integer.signum(i5) * (childAt.getTop() + Math.round(f5 * scrollInterpolator.getInterpolation((abs - childAt.getTop()) / f5)));
                    }
                }
            }
            return i5;
        }

        private boolean shouldJumpElevationState(CoordinatorLayout coordinatorLayout, T t5) {
            List<View> dependents = coordinatorLayout.getDependents(t5);
            int size = dependents.size();
            for (int i5 = 0; i5 < size; i5++) {
                CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) dependents.get(i5).getLayoutParams()).m1896();
                if (m1896 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m1896).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, T t5) {
            int topInset = t5.getTopInset() + t5.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t5, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t5.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i5 = -childAt.getTop();
                    int i6 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && f1.m2891(t5) && f1.m2891(childAt)) {
                        i5 -= t5.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        i6 += f1.m2865(childAt);
                    } else if (checkFlag(scrollFlags, 5)) {
                        int m2865 = f1.m2865(childAt) + i6;
                        if (topBottomOffsetForScrollingSibling < m2865) {
                            i5 = m2865;
                        } else {
                            i6 = m2865;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        i5 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i6 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t5, w.a.m12444(calculateSnapOffset(topBottomOffsetForScrollingSibling, i6, i5) + topInset, -t5.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAccessibilityActions(CoordinatorLayout coordinatorLayout, T t5) {
            View childWithScrollingBehavior;
            f1.m2824(coordinatorLayout, j0.a.f2884.m2706());
            f1.m2824(coordinatorLayout, j0.a.f2886.m2706());
            if (t5.getTotalScrollRange() == 0 || (childWithScrollingBehavior = getChildWithScrollingBehavior(coordinatorLayout)) == null || !childrenHaveScrollFlags(t5)) {
                return;
            }
            if (!f1.m2893(coordinatorLayout)) {
                f1.m2830(coordinatorLayout, new b());
            }
            this.coordinatorLayoutA11yScrollable = addAccessibilityScrollActions(coordinatorLayout, t5, childWithScrollingBehavior);
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, T t5, int i5, int i6, boolean z5) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t5, i5);
            boolean z6 = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int m2865 = f1.m2865(appBarChildOnOffset);
                    if (i6 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i5) < (appBarChildOnOffset.getBottom() - m2865) - t5.getTopInset()) : (-i5) >= (appBarChildOnOffset.getBottom() - m2865) - t5.getTopInset()) {
                        z6 = true;
                    }
                }
            }
            if (t5.isLiftOnScroll()) {
                z6 = t5.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t5.setLiftedState(z6);
            if (z5 || (liftedState && shouldJumpElevationState(coordinatorLayout, t5))) {
                if (t5.getBackground() != null) {
                    t5.getBackground().jumpToCurrentState();
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 23 && t5.getForeground() != null) {
                    t5.getForeground().jumpToCurrentState();
                }
                if (i7 < 21 || t5.getStateListAnimator() == null) {
                    return;
                }
                t5.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.k
        int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        void restoreScrollState(SavedState savedState, boolean z5) {
            if (this.savedState == null || z5) {
                this.savedState = savedState;
            }
        }

        SavedState saveScrollState(Parcelable parcelable, T t5) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t5.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t5.getChildAt(i5);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = androidx.customview.view.a.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z5 = topAndBottomOffset == 0;
                    savedState.fullyExpanded = z5;
                    savedState.fullyScrolled = !z5 && (-topAndBottomOffset) >= t5.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i5;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == f1.m2865(childAt) + t5.getTopInset();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void setDragCallback(BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        public boolean canDragView(T t5) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t5);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        public int getMaxDragOffset(T t5) {
            return (-t5.getDownNestedScrollRange()) + t5.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        public int getScrollRangeForDragFling(T t5) {
            return t5.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        public void onFlingFinished(CoordinatorLayout coordinatorLayout, T t5) {
            snapToChildIfNeeded(coordinatorLayout, t5);
            if (t5.isLiftOnScroll()) {
                t5.setLiftedState(t5.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.m, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t5, int i5) {
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) t5, i5);
            int pendingAction = t5.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z5 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i6 = -t5.getUpNestedPreScrollRange();
                        if (z5) {
                            animateOffsetTo(coordinatorLayout, t5, i6, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t5, i6);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z5) {
                            animateOffsetTo(coordinatorLayout, t5, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t5, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t5, -t5.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t5, 0);
            } else {
                View childAt = t5.getChildAt(savedState.firstVisibleChildIndex);
                setHeaderTopBottomOffset(coordinatorLayout, t5, (-childAt.getBottom()) + (this.savedState.firstVisibleChildAtMinimumHeight ? f1.m2865(childAt) + t5.getTopInset() : Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown)));
            }
            t5.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(w.a.m12444(getTopAndBottomOffset(), -t5.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t5, getTopAndBottomOffset(), 0, true);
            t5.onOffsetChanged(getTopAndBottomOffset());
            updateAccessibilityActions(coordinatorLayout, t5);
            return onLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t5, int i5, int i6, int i7, int i8) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t5.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) t5, i5, i6, i7, i8);
            }
            coordinatorLayout.onMeasureChild(t5, i5, i6, View.MeasureSpec.makeMeasureSpec(0, 0), i8);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t5, View view, int i5, int i6, int[] iArr, int i7) {
            int i8;
            int i9;
            if (i6 != 0) {
                if (i6 < 0) {
                    int i10 = -t5.getTotalScrollRange();
                    i8 = i10;
                    i9 = t5.getDownNestedPreScrollRange() + i10;
                } else {
                    i8 = -t5.getUpNestedPreScrollRange();
                    i9 = 0;
                }
                if (i8 != i9) {
                    iArr[1] = scroll(coordinatorLayout, t5, i6, i8, i9);
                }
            }
            if (t5.isLiftOnScroll()) {
                t5.setLiftedState(t5.shouldLift(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t5, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            if (i8 < 0) {
                iArr[1] = scroll(coordinatorLayout, t5, i8, -t5.getDownNestedScrollRange(), 0);
            }
            if (i8 == 0) {
                updateAccessibilityActions(coordinatorLayout, t5);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t5, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t5, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t5, parcelable);
                this.savedState = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t5) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) t5);
            SavedState saveScrollState = saveScrollState(onSaveInstanceState, t5);
            return saveScrollState == null ? onSaveInstanceState : saveScrollState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t5, View view, View view2, int i5, int i6) {
            ValueAnimator valueAnimator;
            boolean z5 = (i5 & 2) != 0 && (t5.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t5, view));
            if (z5 && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i6;
            return z5;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t5, View view, int i5) {
            if (this.lastStartedType == 0 || i5 == 1) {
                snapToChildIfNeeded(coordinatorLayout, t5);
                if (t5.isLiftOnScroll()) {
                    t5.setLiftedState(t5.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, T t5, int i5, int i6, int i7) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i8 = 0;
            if (i6 == 0 || topBottomOffsetForScrollingSibling < i6 || topBottomOffsetForScrollingSibling > i7) {
                this.offsetDelta = 0;
            } else {
                int m12444 = w.a.m12444(i5, i6, i7);
                if (topBottomOffsetForScrollingSibling != m12444) {
                    int interpolateOffset = t5.hasChildWithInterpolator() ? interpolateOffset(t5, m12444) : m12444;
                    boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
                    int i9 = topBottomOffsetForScrollingSibling - m12444;
                    this.offsetDelta = m12444 - interpolateOffset;
                    if (topAndBottomOffset) {
                        while (i8 < t5.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t5.getChildAt(i8).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t5, t5.getChildAt(i8), getTopAndBottomOffset());
                            }
                            i8++;
                        }
                    }
                    if (!topAndBottomOffset && t5.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t5);
                    }
                    t5.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t5, m12444, m12444 < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i8 = i9;
                }
            }
            updateAccessibilityActions(coordinatorLayout, t5);
            return i8;
        }

        protected static class SavedState extends androidx.customview.view.a {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i5) {
                    return new SavedState[i5];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i5) {
                super.writeToParcel(parcel, i5);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t5, int i5);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.k, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i5) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i5, int i6, int i7, int i8) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i5, i6, i7, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i5, int i6, int[] iArr, int i7) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i5, i6, iArr, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i5, i6, i7, i8, i9, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i5, int i6) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i5, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i5) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i5);
        }

        @Override // com.google.android.material.appbar.k, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z5) {
            super.setHorizontalOffsetEnabled(z5);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i5) {
            return super.setLeftAndRightOffset(i5);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i5) {
            return super.setTopAndBottomOffset(i5);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z5) {
            super.setVerticalOffsetEnabled(z5);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(AppBarLayout appBarLayout, View view, float f5);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect relativeRect = new Rect();
        private final Rect ghostRect = new Rect();

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(AppBarLayout appBarLayout, View view, float f5) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float abs = this.relativeRect.top - Math.abs(f5);
            if (abs > 0.0f) {
                f1.m2839(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float m12443 = 1.0f - w.a.m12443(Math.abs(abs / this.relativeRect.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.relativeRect.height() * COMPRESS_DISTANCE_FACTOR) * (1.0f - (m12443 * m12443)));
            view.setTranslationY(height);
            view.getDrawingRect(this.ghostRect);
            this.ghostRect.offset(0, (int) (-height));
            f1.m2839(view, this.ghostRect);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.scrollFlags = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i5 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i5)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i5, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private ChildScrollEffect createScrollEffectFromInt(int i5) {
            if (i5 != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        boolean isCollapsible() {
            int i5 = this.scrollFlags;
            return (i5 & 1) == 1 && (i5 & 10) != 0;
        }

        public void setScrollEffect(ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public void setScrollFlags(int i5) {
            this.scrollFlags = i5;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public void setScrollEffect(int i5) {
            this.scrollEffect = createScrollEffectFromInt(i5);
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i5, int i6, float f5) {
            super(i5, i6, f5);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    public interface LiftOnScrollListener {
        void onUpdate(float f5, int i5);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i5);
    }

    public static class ScrollingViewBehavior extends l {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).m1896();
            if (m1896 instanceof BaseBehavior) {
                return ((BaseBehavior) m1896).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) view2.getLayoutParams()).m1896();
            if (m1896 instanceof BaseBehavior) {
                f1.m2815(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m1896).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.l
        /* bridge */ /* synthetic */ View findFirstDependency(List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.l
        float getOverlapRatioForOffset(View view) {
            int i5;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i5 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i5) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.l
        int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.getScrollRange(view);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                f1.m2824(coordinatorLayout, j0.a.f2884.m2706());
                f1.m2824(coordinatorLayout, j0.a.f2886.m2706());
                f1.m2830(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.m, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i5) {
            return super.onLayoutChild(coordinatorLayout, view, i5);
        }

        @Override // com.google.android.material.appbar.l, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i5, int i6, int i7, int i8) {
            return super.onMeasureChild(coordinatorLayout, view, i5, i6, i7, i8);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z5) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.setExpanded(false, !z5);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z5) {
            super.setHorizontalOffsetEnabled(z5);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i5) {
            return super.setLeftAndRightOffset(i5);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i5) {
            return super.setTopAndBottomOffset(i5);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z5) {
            super.setVerticalOffsetEnabled(z5);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.material.appbar.l
        AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = list.get(i5);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    class a implements u0 {
        a() {
        }

        @Override // androidx.core.view.u0
        /* renamed from: ʻ */
        public f5 mo691(View view, f5 f5Var) {
            return AppBarLayout.this.onWindowInsetChanged(f5Var);
        }
    }

    private static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʼ, reason: contains not printable characters */
        public static ColorStateList m6182(Drawable drawable) {
            if (drawable instanceof ColorStateListDrawable) {
                return ((ColorStateListDrawable) drawable).getColorStateList();
            }
            return null;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    private View findLiftOnScrollTargetView(View view) {
        int i5;
        if (this.liftOnScrollTargetView == null && (i5 = this.liftOnScrollTargetViewId) != -1) {
            View findViewById = view != null ? view.findViewById(i5) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (findViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private ColorStateList getBackgroundCSL() {
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) background).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return b.m6182(background);
        }
        return null;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.setAlpha(this.lifted ? 255 : 0);
        materialShapeDrawable.setFillColor(this.liftOnScrollColor);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5264.lambda$initializeLiftOnScrollWithColor$0(materialShapeDrawable, valueAnimator);
            }
        };
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5266.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
            }
        };
    }

    private void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState saveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(androidx.customview.view.a.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (saveScrollState != null) {
            this.behavior.restoreScrollState(saveScrollState, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setAlpha(floatValue);
        for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
            if (materialShapeDrawable.getFillColor() != null) {
                liftOnScrollListener.onUpdate(0.0f, materialShapeDrawable.getFillColor().withAlpha(floatValue).getDefaultColor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(floatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(floatValue);
        }
        Iterator<LiftOnScrollListener> it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(floatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    private boolean setLiftableState(boolean z5) {
        if (this.liftable == z5) {
            return false;
        }
        this.liftable = z5;
        refreshDrawableState();
        return true;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || f1.m2891(childAt)) ? false : true;
    }

    private void startLiftOnScrollColorAnimation(float f5, float f6) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f6);
        this.liftOnScrollColorAnimator = ofFloat;
        ofFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public void addOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i5;
        int m2865;
        int i6 = this.downPreScrollRange;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = layoutParams.scrollFlags;
                if ((i8 & 5) != 5) {
                    if (i7 > 0) {
                        break;
                    }
                } else {
                    int i9 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i8 & 8) != 0) {
                        m2865 = f1.m2865(childAt);
                    } else if ((i8 & 2) != 0) {
                        m2865 = measuredHeight - f1.m2865(childAt);
                    } else {
                        i5 = i9 + measuredHeight;
                        if (childCount == 0 && f1.m2891(childAt)) {
                            i5 = Math.min(i5, measuredHeight - getTopInset());
                        }
                        i7 += i5;
                    }
                    i5 = i9 + m2865;
                    if (childCount == 0) {
                        i5 = Math.min(i5, measuredHeight - getTopInset());
                    }
                    i7 += i5;
                }
            }
        }
        int max = Math.max(0, i7);
        this.downPreScrollRange = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i5 = this.downScrollRange;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i8 = layoutParams.scrollFlags;
                if ((i8 & 1) == 0) {
                    break;
                }
                i7 += measuredHeight;
                if ((i8 & 2) != 0) {
                    i7 -= f1.m2865(childAt);
                    break;
                }
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.downScrollRange = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m2865 = f1.m2865(this);
        if (m2865 == 0) {
            int childCount = getChildCount();
            m2865 = childCount >= 1 ? f1.m2865(getChildAt(childCount - 1)) : 0;
            if (m2865 == 0) {
                return getHeight() / 3;
            }
        }
        return (m2865 * 2) + topInset;
    }

    int getPendingAction() {
        return this.pendingAction;
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        f5 f5Var = this.lastInsets;
        if (f5Var != null) {
            return f5Var.m3076();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i5 = this.totalScrollRange;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = layoutParams.scrollFlags;
                if ((i8 & 1) == 0) {
                    break;
                }
                i7 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i6 == 0 && f1.m2891(childAt)) {
                    i7 -= getTopInset();
                }
                if ((i8 & 2) != 0) {
                    i7 -= f1.m2865(childAt);
                    break;
                }
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.totalScrollRange = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + iArr.length);
        boolean z5 = this.liftable;
        int i6 = R.attr.state_liftable;
        if (!z5) {
            i6 = -i6;
        }
        iArr[0] = i6;
        iArr[1] = (z5 && this.lifted) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i7 = R.attr.state_collapsible;
        if (!z5) {
            i7 = -i7;
        }
        iArr[2] = i7;
        iArr[3] = (z5 && this.lifted) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        boolean z6 = true;
        if (f1.m2891(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                f1.m2815(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i9).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i9++;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z6 = false;
        }
        setLiftableState(z6);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i6);
        if (mode != 1073741824 && f1.m2891(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = w.a.m12444(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i6));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    void onOffsetChanged(int i5) {
        this.currentOffset = i5;
        if (!willNotDraw()) {
            f1.m2821(this);
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i6);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i5);
                }
            }
        }
    }

    f5 onWindowInsetChanged(f5 f5Var) {
        f5 f5Var2 = f1.m2891(this) ? f5Var : null;
        if (!androidx.core.util.c.m2568(this.lastInsets, f5Var2)) {
            this.lastInsets = f5Var2;
            updateWillNotDraw();
            requestLayout();
        }
        return f5Var;
    }

    public boolean removeLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation(this, f5);
    }

    public void setExpanded(boolean z5) {
        setExpanded(z5, f1.m2808(this));
    }

    public void setLiftOnScroll(boolean z5) {
        this.liftOnScroll = z5;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i5) {
        this.liftOnScrollTargetViewId = i5;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z5) {
        this.liftableOverride = true;
        return setLiftableState(z5);
    }

    public void setLiftableOverrideEnabled(boolean z5) {
        this.liftableOverride = z5;
    }

    public boolean setLifted(boolean z5) {
        return setLiftedState(z5, true);
    }

    boolean setLiftedState(boolean z5) {
        return setLiftedState(z5, !this.liftableOverride);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i5) {
        if (i5 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i5);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.statusBarForeground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m2208(this.statusBarForeground, f1.m2834(this));
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            f1.m2821(this);
        }
    }

    public void setStatusBarForegroundColor(int i5) {
        setStatusBarForeground(new ColorDrawable(i5));
    }

    public void setStatusBarForegroundResource(int i5) {
        setStatusBarForeground(f.a.m8475(getContext(), i5));
    }

    @Deprecated
    public void setTargetElevation(float f5) {
        if (Build.VERSION.SDK_INT >= 21) {
            t.m6208(this, f5);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
    }

    boolean shouldLift(View view) {
        View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z5, boolean z6) {
        setExpanded(z5, z6, true);
    }

    boolean setLiftedState(boolean z5, boolean z6) {
        if (!z6 || this.lifted == z5) {
            return false;
        }
        this.lifted = z5;
        refreshDrawableState();
        if (!this.liftOnScroll || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        if (this.liftOnScrollColor != null) {
            startLiftOnScrollColorAnimation(z5 ? 0.0f : 255.0f, z5 ? 255.0f : 0.0f);
            return true;
        }
        startLiftOnScrollColorAnimation(z5 ? 0.0f : this.appBarElevation, z5 ? this.appBarElevation : 0.0f);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 21) {
            if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
                t.m6207(this);
            }
            t.m6209(this, attributeSet, i5, i6);
        }
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.AppBarLayout, i5, i6, new int[0]);
        f1.m2836(this, obtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_android_background));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.AppBarLayout_liftOnScrollColor);
        this.liftOnScrollColor = colorStateList;
        ColorStateList backgroundCSL = getBackgroundCSL();
        if (backgroundCSL != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(backgroundCSL);
            if (colorStateList != null) {
                initializeLiftOnScrollWithColor(materialShapeDrawable);
            } else {
                initializeLiftOnScrollWithElevation(context2, materialShapeDrawable);
            }
            f1.m2836(this, materialShapeDrawable);
        }
        this.liftOnScrollColorDuration = MotionUtils.resolveThemeDuration(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.liftOnScrollColorInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        int i8 = R.styleable.AppBarLayout_expanded;
        if (obtainStyledAttributes.hasValue(i8)) {
            setExpanded(obtainStyledAttributes.getBoolean(i8, false), false, false);
        }
        if (i7 >= 21) {
            if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_elevation)) {
                t.m6208(this, obtainStyledAttributes.getDimensionPixelSize(r13, 0));
            }
        }
        if (i7 >= 26) {
            int i9 = R.styleable.AppBarLayout_android_keyboardNavigationCluster;
            if (obtainStyledAttributes.hasValue(i9)) {
                setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(i9, false));
            }
            int i10 = R.styleable.AppBarLayout_android_touchscreenBlocksFocus;
            if (obtainStyledAttributes.hasValue(i10)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(i10, false));
            }
        }
        this.appBarElevation = getResources().getDimension(R.dimen.design_appbar_elevation);
        this.liftOnScroll = obtainStyledAttributes.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
        this.liftOnScrollTargetViewId = obtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(obtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
        obtainStyledAttributes.recycle();
        f1.m2846(this, new a());
    }

    private void setExpanded(boolean z5, boolean z6, boolean z7) {
        this.pendingAction = (z5 ? 1 : 2) | (z6 ? 4 : 0) | (z7 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
