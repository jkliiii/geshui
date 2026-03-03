package com.google.android.material.bottomsheet;

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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    MaterialBottomContainerBackHelper bottomContainerBackHelper;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final c.AbstractC0005c dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.g stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    a0.c viewDragHelper;
    WeakReference<V> viewRef;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    protected static class SavedState extends androidx.customview.view.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
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
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i5) {
            super(parcelable);
            this.state = i5;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f5319;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f5320;

        a(View view, int i5) {
            this.f5319 = view;
            this.f5320 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.startSettling(this.f5319, this.f5320, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.setStateInternal(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.viewRef.get().requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
            }
        }
    }

    class d implements ViewUtils.OnApplyWindowInsetsListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ boolean f5324;

        d(boolean z5) {
            this.f5324 = z5;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.f5 onApplyWindowInsets(android.view.View r11, androidx.core.view.f5 r12, com.google.android.material.internal.ViewUtils.RelativePadding r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.f5.m.m3133()
                androidx.core.graphics.i0 r0 = r12.m3070(r0)
                int r1 = androidx.core.view.f5.m.m3130()
                androidx.core.graphics.i0 r1 = r12.m3070(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f2699
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$302(r2, r3)
                boolean r2 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.m3073()
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$502(r3, r6)
                int r3 = r13.bottom
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$500(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$600(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.end
                goto L50
            L4e:
                int r4 = r13.start
            L50:
                int r6 = r0.f2698
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$700(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.start
                goto L62
            L60:
                int r13 = r13.end
            L62:
                int r2 = r0.f2700
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$800(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f2698
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = 1
                goto L81
            L80:
                r2 = 0
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$900(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f2700
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = 1
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1000(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f2699
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f5324
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f2701
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$1102(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f5324
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$1200(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.onApplyWindowInsets(android.view.View, androidx.core.view.f5, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.f5");
        }
    }

    class e extends c.AbstractC0005c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private long f5326;

        e() {
        }

        /* renamed from: י, reason: contains not printable characters */
        private boolean m6226(View view) {
            int top2 = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top2 > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʻ */
        public int mo112(View view, int i5, int i6) {
            return view.getLeft();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʼ */
        public int mo113(View view, int i5, int i6) {
            return w.a.m12444(i5, BottomSheetBehavior.this.getExpandedOffset(), mo116(view));
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʿ */
        public int mo116(View view) {
            return BottomSheetBehavior.this.canBeHiddenByDragging() ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˋ */
        public void mo121(int i5) {
            if (i5 == 1 && BottomSheetBehavior.this.draggable) {
                BottomSheetBehavior.this.setStateInternal(1);
            }
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˎ */
        public void mo122(View view, int i5, int i6, int i7, int i8) {
            BottomSheetBehavior.this.dispatchOnSlide(i6);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
        @Override // a0.c.AbstractC0005c
        /* renamed from: ˏ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo123(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.mo123(android.view.View, float, float):void");
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˑ */
        public boolean mo124(View view, int i5) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i6 = bottomSheetBehavior.state;
            if (i6 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                return false;
            }
            if (i6 == 3 && bottomSheetBehavior.activePointerId == i5) {
                WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f5326 = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements o0 {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ int f5328;

        f(int i5) {
            this.f5328 = i5;
        }

        @Override // androidx.core.view.accessibility.o0
        /* renamed from: ʻ */
        public boolean mo2731(View view, o0.a aVar) {
            BottomSheetBehavior.this.setState(this.f5328);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new g(this, null);
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new e();
    }

    private int addAccessibilityActionForState(View view, int i5, int i6) {
        return f1.m2858(view, view.getResources().getString(i5), createAccessibilityViewCommandForState(i6));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private float calculateCornerInterpolation(float f5, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f5 > 0.0f) {
                return radius / f5;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v5 = this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = v5.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int calculatePeekHeight() {
        int i5;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom : (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i5 = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i5 + this.peekHeightGestureInsetBuffer);
    }

    private float calculateSlideOffsetWithTop(int i5) {
        float f5;
        float f6;
        int i6 = this.collapsedOffset;
        if (i5 > i6 || i6 == getExpandedOffset()) {
            int i7 = this.collapsedOffset;
            f5 = i7 - i5;
            f6 = this.parentHeight - i7;
        } else {
            int i8 = this.collapsedOffset;
            f5 = i8 - i5;
            f6 = i8 - getExpandedOffset();
        }
        return f5 / f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    private void clearAccessibilityAction(View view, int i5) {
        if (view == null) {
            return;
        }
        f1.m2824(view, 524288);
        f1.m2824(view, 262144);
        f1.m2824(view, 1048576);
        int i6 = this.expandHalfwayActionIds.get(i5, -1);
        if (i6 != -1) {
            f1.m2824(view, i6);
            this.expandHalfwayActionIds.delete(i5);
        }
    }

    private o0 createAccessibilityViewCommandForState(int i5) {
        return new f(i5);
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
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

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new c());
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v5) {
        ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) layoutParams).m1896();
        if (m1896 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) m1896;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
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

    private int getTopOffsetForState(int i5) {
        if (i5 == 3) {
            return getExpandedOffset();
        }
        if (i5 == 4) {
            return this.collapsedOffset;
        }
        if (i5 == 5) {
            return this.parentHeight;
        }
        if (i5 == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i5);
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.viewRef.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        return this.state == 3 && (this.shouldRemoveExpandedCorners || isAtTopOfScreen());
    }

    private boolean isLayouting(V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && f1.m2903(v5);
    }

    private void replaceAccessibilityActionForState(View view, j0.a aVar, int i5) {
        f1.m2826(view, aVar, null, createAccessibilityViewCommandForState(i5));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i5 = this.saveFlags;
        if (i5 == 0) {
            return;
        }
        if (i5 == -1 || (i5 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i5 == -1 || (i5 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i5 == -1 || (i5 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i5 == -1 || (i5 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v5, Runnable runnable) {
        if (isLayouting(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(View view) {
        boolean z5 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z5) {
            ViewUtils.doOnApplyWindowInsets(view, new d(z5));
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i5, boolean z5) {
        int topOffsetForState = getTopOffsetForState(i5);
        a0.c cVar = this.viewDragHelper;
        if (!(cVar != null && (!z5 ? !cVar.m107(view, view.getLeft(), topOffsetForState) : !cVar.m99(view.getLeft(), topOffsetForState)))) {
            setStateInternal(i5);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i5, true);
        this.stateSettlingTracker.m6229(i5);
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i5, boolean z5) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i5 == 2 || this.expandedCornersRemoved == (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
        if (!z5 || (valueAnimator = this.interpolatorAnimator) == null) {
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.interpolatorAnimator.reverse();
        } else {
            this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.getInterpolation(), isExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z5) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if (childAt != this.viewRef.get()) {
                    if (z5) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            f1.m2843(childAt, 4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        f1.m2843(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (!z5) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z5) {
        V v5;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v5 = this.viewRef.get()) == null) {
                return;
            }
            if (z5) {
                setState(4);
            } else {
                v5.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    void dispatchOnSlide(int i5) {
        V v5 = this.viewRef.get();
        if (v5 == null || this.callbacks.isEmpty()) {
            return;
        }
        float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i5);
        for (int i6 = 0; i6 < this.callbacks.size(); i6++) {
            this.callbacks.get(i6).onSlide(v5, calculateSlideOffsetWithTop);
        }
    }

    View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (f1.m2809(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i5));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        androidx.activity.b onHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.hideable ? 5 : 4);
        } else if (this.hideable) {
            this.bottomContainerBackHelper.finishBackProgressNotPersistent(onHandleBackInvoked, new b());
        } else {
            this.bottomContainerBackHelper.finishBackProgressPersistent(onHandleBackInvoked, null);
            setState(4);
        }
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        int i5;
        a0.c cVar;
        if (!v5.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x5 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x5, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v5, x5, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.m102(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i5 = this.initialY) == -1 || Math.abs(((float) i5) - motionEvent.getY()) <= ((float) this.viewDragHelper.m111())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        if (f1.m2891(coordinatorLayout) && !f1.m2891(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v5);
            f1.m2855(v5, new com.google.android.material.bottomsheet.f(v5));
            this.viewRef = new WeakReference<>(v5);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v5);
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
            updateAccessibilityActions();
            if (f1.m2807(v5) == 0) {
                f1.m2843(v5, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = a0.c.m81(coordinatorLayout, this.dragCallback);
        }
        int top2 = v5.getTop();
        coordinatorLayout.onLayoutChild(v5, i5);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v5.getHeight();
        this.childHeight = height;
        int i6 = this.parentHeight;
        int i7 = i6 - height;
        int i8 = this.insetTop;
        if (i7 < i8) {
            if (this.paddingTopSystemWindowInsets) {
                int i9 = this.maxHeight;
                if (i9 != -1) {
                    i6 = Math.min(i6, i9);
                }
                this.childHeight = i6;
            } else {
                int i10 = i6 - i8;
                int i11 = this.maxHeight;
                if (i11 != -1) {
                    i10 = Math.min(i10, i11);
                }
                this.childHeight = i10;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i12 = this.state;
        if (i12 == 3) {
            f1.m2815(v5, getExpandedOffset());
        } else if (i12 == 6) {
            f1.m2815(v5, this.halfExpandedOffset);
        } else if (this.hideable && i12 == 5) {
            f1.m2815(v5, this.parentHeight);
        } else if (i12 == 4) {
            f1.m2815(v5, this.collapsedOffset);
        } else if (i12 == 1 || i12 == 2) {
            f1.m2815(v5, top2 - v5.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v5));
        for (int i13 = 0; i13 < this.callbacks.size(); i13++) {
            this.callbacks.get(i13).onLayout(v5);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(getChildMeasureSpec(i5, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i7, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v5, View view, float f5, float f6) {
        WeakReference<View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get()) {
            return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v5, view, f5, f6);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int[] iArr, int i7) {
        if (i7 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top2 = v5.getTop();
            int i8 = top2 - i6;
            if (i6 > 0) {
                if (i8 < getExpandedOffset()) {
                    int expandedOffset = top2 - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    f1.m2815(v5, -expandedOffset);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i6;
                    f1.m2815(v5, -i6);
                    setStateInternal(1);
                }
            } else if (i6 < 0 && !view.canScrollVertically(-1)) {
                if (i8 > this.collapsedOffset && !canBeHiddenByDragging()) {
                    int i9 = top2 - this.collapsedOffset;
                    iArr[1] = i9;
                    f1.m2815(v5, -i9);
                    setStateInternal(4);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i6;
                    f1.m2815(v5, -i6);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v5.getTop());
            this.lastNestedScrollDy = i6;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v5, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v5, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i5 = savedState.state;
        if (i5 == 1 || i5 == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i5;
            this.lastStableState = i5;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v5) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v5), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i5, int i6) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i5 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L49
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.lastNestedScrollDy
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L68
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7e
            int r1 = r2.collapsedOffset
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.startSettling(r4, r0, r3)
            r2.nestedScrolled = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
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
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.m111()) {
            this.viewDragHelper.m91(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    void setAccessibilityDelegateView(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.accessibilityDelegateViewRef) == null) {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        } else {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        }
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z5) {
        this.draggable = z5;
    }

    public void setExpandedOffset(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i5;
        updateDrawableForTargetState(this.state, true);
    }

    public void setFitToContents(boolean z5) {
        if (this.fitToContents == z5) {
            return;
        }
        this.fitToContents = z5;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z5) {
        this.gestureInsetBottomIgnored = z5;
    }

    public void setHalfExpandedRatio(float f5) {
        if (f5 <= 0.0f || f5 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f5;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideFriction(float f5) {
        this.hideFriction = f5;
    }

    public void setHideable(boolean z5) {
        if (this.hideable != z5) {
            this.hideable = z5;
            if (!z5 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z5) {
        this.hideable = z5;
    }

    public void setMaxHeight(int i5) {
        this.maxHeight = i5;
    }

    public void setMaxWidth(int i5) {
        this.maxWidth = i5;
    }

    public void setPeekHeight(int i5) {
        setPeekHeight(i5, false);
    }

    public void setSaveFlags(int i5) {
        this.saveFlags = i5;
    }

    public void setShouldRemoveExpandedCorners(boolean z5) {
        if (this.shouldRemoveExpandedCorners != z5) {
            this.shouldRemoveExpandedCorners = z5;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i5) {
        this.significantVelocityThreshold = i5;
    }

    public void setSkipCollapsed(boolean z5) {
        this.skipCollapsed = z5;
    }

    public void setState(int i5) {
        if (i5 == 1 || i5 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i5 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.hideable && i5 == 5) {
            Log.w(TAG, "Cannot set state: " + i5);
            return;
        }
        int i6 = (i5 == 6 && this.fitToContents && getTopOffsetForState(i5) <= this.fitToContentsOffset) ? 3 : i5;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i5);
        } else {
            V v5 = this.viewRef.get();
            runAfterLayout(v5, new a(v5, i6));
        }
    }

    void setStateInternal(int i5) {
        V v5;
        if (this.state == i5) {
            return;
        }
        this.state = i5;
        if (i5 == 4 || i5 == 3 || i5 == 6 || (this.hideable && i5 == 5)) {
            this.lastStableState = i5;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        if (i5 == 3) {
            updateImportantForAccessibility(true);
        } else if (i5 == 6 || i5 == 5 || i5 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i5, true);
        for (int i6 = 0; i6 < this.callbacks.size(); i6++) {
            this.callbacks.get(i6).onStateChanged(v5, i5);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z5) {
        this.updateImportantForAccessibilityOnSiblings = z5;
    }

    public boolean shouldExpandOnUpwardDrag(long j5, float f5) {
        return false;
    }

    boolean shouldHide(View view, float f5) {
        if (this.skipCollapsed) {
            return true;
        }
        if (isHideableWhenDragging() && view.getTop() >= this.collapsedOffset) {
            return Math.abs((((float) view.getTop()) + (f5 * this.hideFriction)) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > HIDE_THRESHOLD;
        }
        return false;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.activity.b bVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(bVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.activity.b bVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(bVar);
    }

    private class g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f5330;

        /* renamed from: ʼ, reason: contains not printable characters */
        private boolean f5331;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Runnable f5332;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f5331 = false;
                a0.c cVar = BottomSheetBehavior.this.viewDragHelper;
                if (cVar != null && cVar.m101(true)) {
                    g gVar = g.this;
                    gVar.m6229(gVar.f5330);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.state == 2) {
                    bottomSheetBehavior.setStateInternal(gVar2.f5330);
                }
            }
        }

        private g() {
            this.f5332 = new a();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m6229(int i5) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f5330 = i5;
            if (this.f5331) {
                return;
            }
            f1.m2822(BottomSheetBehavior.this.viewRef.get(), this.f5332);
            this.f5331 = true;
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPeekHeight(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r4 != r0) goto Lc
            boolean r4 = r3.peekHeightAuto
            if (r4 != 0) goto L15
            r3.peekHeightAuto = r1
            goto L1f
        Lc:
            boolean r0 = r3.peekHeightAuto
            if (r0 != 0) goto L17
            int r0 = r3.peekHeight
            if (r0 == r4) goto L15
            goto L17
        L15:
            r1 = 0
            goto L1f
        L17:
            r3.peekHeightAuto = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.peekHeight = r4
        L1f:
            if (r1 == 0) goto L24
            r3.updatePeekHeight(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setPeekHeight(int, boolean):void");
    }

    private void updateAccessibilityActions(View view, int i5) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i5);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i5, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, j0.a.f2898, 5);
        }
        int i6 = this.state;
        if (i6 == 3) {
            replaceAccessibilityActionForState(view, j0.a.f2897, this.fitToContents ? 4 : 6);
            return;
        }
        if (i6 == 4) {
            replaceAccessibilityActionForState(view, j0.a.f2896, this.fitToContents ? 3 : 6);
        } else {
            if (i6 != 6) {
                return;
            }
            replaceAccessibilityActionForState(view, j0.a.f2897, 4);
            replaceAccessibilityActionForState(view, j0.a.f2896, 3);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i5;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new g(this, null);
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new e();
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i6 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, i6);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        if (Build.VERSION.SDK_INT >= 21) {
            this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        int i7 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i7)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        int i8 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i8)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(i8, -1));
        }
        int i9 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i9);
        if (peekValue != null && (i5 = peekValue.data) == -1) {
            setPeekHeight(i5);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i9, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, HIDE_THRESHOLD));
        int i10 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i10);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(i10, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(View view, float f5);

        public abstract void onStateChanged(View view, int i5);

        void onLayout(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
    }
}
