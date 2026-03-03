package com.google.android.material.sidesheet;

import a0.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.f1;
import androidx.core.view.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private ColorStateList backgroundTint;
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;
    private int coplanarSiblingViewId;
    private WeakReference<View> coplanarSiblingViewRef;
    private final c.AbstractC0005c dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private d sheetDelegate;
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior<V>.c stateSettlingTracker;
    private VelocityTracker velocityTracker;
    private a0.c viewDragHelper;
    private WeakReference<V> viewRef;

    protected static class SavedState extends androidx.customview.view.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        final int state;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((SideSheetBehavior) sideSheetBehavior).state;
        }
    }

    class a extends c.AbstractC0005c {
        a() {
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʻ */
        public int mo112(View view, int i5, int i6) {
            return w.a.m12444(i5, SideSheetBehavior.this.sheetDelegate.mo7199(), SideSheetBehavior.this.sheetDelegate.mo7198());
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʼ */
        public int mo113(View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʾ */
        public int mo115(View view) {
            return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˋ */
        public void mo121(int i5) {
            if (i5 == 1 && SideSheetBehavior.this.draggable) {
                SideSheetBehavior.this.setStateInternal(1);
            }
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˎ */
        public void mo122(View view, int i5, int i6, int i7, int i8) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
            if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                SideSheetBehavior.this.sheetDelegate.mo7208(marginLayoutParams, view.getLeft(), view.getRight());
                coplanarSiblingView.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.dispatchOnSlide(view, i5);
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˏ */
        public void mo123(View view, float f5, float f6) {
            int calculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f5, f6);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˑ */
        public boolean mo124(View view, int i5) {
            return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.setStateInternal(5);
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
        }
    }

    class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f6078;

        /* renamed from: ʼ, reason: contains not printable characters */
        private boolean f6079;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Runnable f6080 = new Runnable() { // from class: com.google.android.material.sidesheet.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f6095.m7191();
            }
        };

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public /* synthetic */ void m7191() {
            this.f6079 = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.m101(true)) {
                m7192(this.f6078);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(this.f6078);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m7192(int i5) {
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.f6078 = i5;
            if (this.f6079) {
                return;
            }
            f1.m2822((View) SideSheetBehavior.this.viewRef.get(), this.f6080);
            this.f6079 = true;
        }
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new c();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = HIDE_FRICTION;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new a();
    }

    private int calculateCurrentOffset(int i5, V v5) {
        int i6 = this.state;
        if (i6 == 1 || i6 == 2) {
            return i5 - this.sheetDelegate.mo7200(v5);
        }
        if (i6 == 3) {
            return 0;
        }
        if (i6 == 5) {
            return this.sheetDelegate.mo7197();
        }
        throw new IllegalStateException("Unexpected value: " + this.state);
    }

    private float calculateDragDistance(float f5, float f6) {
        return Math.abs(f5 - f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(View view, float f5, float f6) {
        if (isExpandingOutwards(f5)) {
            return 3;
        }
        if (shouldHide(view, f5)) {
            if (!this.sheetDelegate.mo7205(f5, f6) && !this.sheetDelegate.mo7204(view)) {
                return 3;
            }
        } else if (f5 == 0.0f || !g.m7210(f5, f6)) {
            int left = view.getLeft();
            if (Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.mo7197())) {
                return 3;
            }
        }
        return 5;
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private o0 createAccessibilityViewCommandForState(final int i5) {
        return new o0() { // from class: com.google.android.material.sidesheet.j
            @Override // androidx.core.view.accessibility.o0
            /* renamed from: ʻ */
            public final boolean mo2731(View view, o0.a aVar) {
                return this.f6093.lambda$createAccessibilityViewCommandForState$2(i5, view, aVar);
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(View view, int i5) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float mo7194 = this.sheetDelegate.mo7194(i5);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view, mo7194);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (f1.m2890(view) == null) {
            f1.m2835(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    public static <V extends View> SideSheetBehavior<V> from(V v5) {
        ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) layoutParams).m1896();
        if (m1896 instanceof SideSheetBehavior) {
            return (SideSheetBehavior) m1896;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    private int getChildMeasureSpec(int i5, int i6, int i7, int i8) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, i6, i8);
        if (i7 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i7), 1073741824);
        }
        if (size != 0) {
            i7 = Math.min(size, i7);
        }
        return View.MeasureSpec.makeMeasureSpec(i7, RecyclerView.UNDEFINED_DURATION);
    }

    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int mo7195 = this.sheetDelegate.mo7195(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f6087.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, mo7195, coplanarSiblingView, valueAnimator);
            }
        };
    }

    private int getGravityFromSheetEdge() {
        d dVar = this.sheetDelegate;
        return (dVar == null || dVar.mo7202() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f getViewLayoutParams() {
        V v5;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v5 = weakReference.get()) == null || !(v5.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v5.getLayoutParams();
    }

    private boolean hasLeftMargin() {
        CoordinatorLayout.f viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0;
    }

    private boolean hasRightMargin() {
        CoordinatorLayout.f viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0;
    }

    private boolean isDraggedFarEnough(MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.m111());
    }

    private boolean isExpandingOutwards(float f5) {
        return this.sheetDelegate.mo7203(f5);
    }

    private boolean isLayingOut(V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && f1.m2903(v5);
    }

    private boolean isSettling(View view, int i5, boolean z5) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i5);
        a0.c viewDragHelper = getViewDragHelper();
        return viewDragHelper != null && (!z5 ? !viewDragHelper.m107(view, outerEdgeOffsetForState, view.getTop()) : !viewDragHelper.m99(outerEdgeOffsetForState, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int i5, View view, o0.a aVar) {
        setState(i5);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, View view, ValueAnimator valueAnimator) {
        this.sheetDelegate.mo7207(marginLayoutParams, AnimationUtils.lerp(i5, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i5) {
        V v5 = this.viewRef.get();
        if (v5 != null) {
            startSettling(v5, i5, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(CoordinatorLayout coordinatorLayout) {
        int i5;
        View findViewById;
        if (this.coplanarSiblingViewRef != null || (i5 = this.coplanarSiblingViewId) == -1 || (findViewById = coordinatorLayout.findViewById(i5)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(findViewById);
    }

    private void replaceAccessibilityActionForState(V v5, j0.a aVar, int i5) {
        f1.m2826(v5, aVar, null, createAccessibilityViewCommandForState(i5));
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(V v5, Runnable runnable) {
        if (isLayingOut(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setSheetEdge(V v5, int i5) {
        setSheetEdge(r.m3298(((CoordinatorLayout.f) v5.getLayoutParams()).f2506, i5) == 3 ? 1 : 0);
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    private boolean shouldInterceptTouchEvent(V v5) {
        return (v5.isShown() || f1.m2890(v5) != null) && this.draggable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i5, boolean z5) {
        if (!isSettling(view, i5, z5)) {
            setStateInternal(i5);
        } else {
            setStateInternal(2);
            this.stateSettlingTracker.m7192(i5);
        }
    }

    private void updateAccessibilityActions() {
        V v5;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        f1.m2824(v5, 262144);
        f1.m2824(v5, 1048576);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v5, j0.a.f2898, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v5, j0.a.f2896, 3);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v5 = this.viewRef.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.mo7207(marginLayoutParams, (int) ((this.childWidth * v5.getScaleX()) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    private void updateMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateSheetVisibility(View view) {
        int i5 = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i5) {
            view.setVisibility(i5);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public void expand() {
        setState(3);
    }

    MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    int getChildWidth() {
        return this.childWidth;
    }

    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.mo7196();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    float getHideThreshold() {
        return HIDE_THRESHOLD;
    }

    int getInnerMargin() {
        return this.innerMargin;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    int getOuterEdgeOffsetForState(int i5) {
        if (i5 == 3) {
            return getExpandedOffset();
        }
        if (i5 == 5) {
            return this.sheetDelegate.mo7197();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i5);
    }

    int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    int getParentWidth() {
        return this.parentWidth;
    }

    int getSignificantVelocityThreshold() {
        return SIGNIFICANT_VEL_THRESHOLD;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    a0.c getViewDragHelper() {
        return this.viewDragHelper;
    }

    float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        androidx.activity.b onHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, getGravityFromSheetEdge(), new b(), getCoplanarFinishAnimatorUpdateListener());
        }
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        a0.c cVar;
        if (!shouldInterceptTouchEvent(v5)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.initialX = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
            this.ignoreEvents = false;
            return false;
        }
        return (this.ignoreEvents || (cVar = this.viewDragHelper) == null || !cVar.m102(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        if (f1.m2891(coordinatorLayout) && !f1.m2891(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v5);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(v5);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                f1.m2836(v5, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float f5 = this.elevation;
                if (f5 == -1.0f) {
                    f5 = f1.m2904(v5);
                }
                materialShapeDrawable2.setElevation(f5);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    f1.m2837(v5, colorStateList);
                }
            }
            updateSheetVisibility(v5);
            updateAccessibilityActions();
            if (f1.m2807(v5) == 0) {
                f1.m2843(v5, 1);
            }
            ensureAccessibilityPaneTitleIsSet(v5);
        }
        setSheetEdge(v5, i5);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = a0.c.m81(coordinatorLayout, this.dragCallback);
        }
        int mo7200 = this.sheetDelegate.mo7200(v5);
        coordinatorLayout.onLayoutChild(v5, i5);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.mo7201(coordinatorLayout);
        this.childWidth = v5.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.mo7193(marginLayoutParams) : 0;
        f1.m2814(v5, calculateCurrentOffset(mo7200, v5));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof SideSheetCallback) {
                sideSheetCallback.onLayout(v5);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(getChildMeasureSpec(i5, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, -1, marginLayoutParams.width), getChildMeasureSpec(i7, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v5, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v5, savedState.getSuperState());
        }
        int i5 = savedState.state;
        if (i5 == 1 || i5 == 2) {
            i5 = 5;
        }
        this.state = i5;
        this.lastStableState = i5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v5) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v5), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.m95(motionEvent);
        }
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.m91(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void setCoplanarSiblingView(View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v5 = weakReference.get();
            if (f1.m2808(v5)) {
                v5.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(int i5) {
        this.coplanarSiblingViewId = i5;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v5 = weakReference.get();
            if (i5 == -1 || !f1.m2808(v5)) {
                return;
            }
            v5.requestLayout();
        }
    }

    public void setDraggable(boolean z5) {
        this.draggable = z5;
    }

    public void setHideFriction(float f5) {
        this.hideFriction = f5;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i5) {
        if (i5 == 1 || i5 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i5 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i5);
        } else {
            runAfterLayout(this.viewRef.get(), new Runnable() { // from class: com.google.android.material.sidesheet.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6091.lambda$setState$0(i5);
                }
            });
        }
    }

    void setStateInternal(int i5) {
        V v5;
        if (this.state == i5) {
            return;
        }
        this.state = i5;
        if (i5 == 3 || i5 == 5) {
            this.lastStableState = i5;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v5);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v5, i5);
        }
        updateAccessibilityActions();
    }

    boolean shouldHide(View view, float f5) {
        return this.sheetDelegate.mo7206(view, f5);
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.activity.b bVar) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(bVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.activity.b bVar) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(bVar, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    public void removeCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    private void setSheetEdge(int i5) {
        d dVar = this.sheetDelegate;
        if (dVar == null || dVar.mo7202() != i5) {
            if (i5 == 0) {
                this.sheetDelegate = new com.google.android.material.sidesheet.b(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i5 == 1) {
                this.sheetDelegate = new com.google.android.material.sidesheet.a(this);
                if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i5 + ". Must be 0 or 1.");
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new c();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = HIDE_FRICTION;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        int i5 = R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, i5);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        int i6 = R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (obtainStyledAttributes.hasValue(i6)) {
            setCoplanarSiblingViewId(obtainStyledAttributes.getResourceId(i6, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
