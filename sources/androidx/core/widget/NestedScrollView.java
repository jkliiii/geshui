package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.core.view.t0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: E:\78999\cookie_5123796.dex */
public class NestedScrollView extends FrameLayout implements androidx.core.view.r0, androidx.core.view.o0 {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private float f3077;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private c f3078;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final float f3079;

    /* renamed from: ʿ, reason: contains not printable characters */
    private long f3080;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Rect f3081;

    /* renamed from: ˈ, reason: contains not printable characters */
    private OverScroller f3082;

    /* renamed from: ˉ, reason: contains not printable characters */
    public EdgeEffect f3083;

    /* renamed from: ˊ, reason: contains not printable characters */
    public EdgeEffect f3084;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f3085;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f3086;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f3087;

    /* renamed from: ˑ, reason: contains not printable characters */
    private View f3088;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f3089;

    /* renamed from: ـ, reason: contains not printable characters */
    private VelocityTracker f3090;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f3091;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f3092;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private final t0 f3093;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f3094;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final androidx.core.view.p0 f3095;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f3096;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f3097;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f3098;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final int[] f3099;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private final int[] f3100;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private int f3101;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int f3102;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private d f3103;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static final float f3074 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private static final a f3076 = new a();

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private static final int[] f3075 = {R.attr.fillViewport};

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.n0.m2722(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.n0.m2723(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j0 j0Var) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            j0Var.m2641(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            j0Var.m2663(true);
            if (nestedScrollView.getScrollY() > 0) {
                j0Var.m2662(j0.a.f2886);
                j0Var.m2662(j0.a.f2857);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                j0Var.m2662(j0.a.f2884);
                j0Var.m2662(j0.a.f2858);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            if (super.performAccessibilityAction(view, i5, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i5 != 4096) {
                if (i5 == 8192 || i5 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m3502(0, max, true);
                    return true;
                }
                if (i5 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m3502(0, min, true);
            return true;
        }
    }

    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m3509(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        /* renamed from: ʻ */
        void mo472(NestedScrollView nestedScrollView, int i5, int i6, int i7, int i8);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f3104;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public d[] newArray(int i5) {
                return new d[i5];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3104 + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f3104);
        }

        d(Parcel parcel) {
            super(parcel);
            this.f3104 = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u.a.f11346);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3077 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3077 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3077;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m3466() {
        this.f3082.abortAnimation();
        m3508(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m3467(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3083
            float r0 = androidx.core.widget.l.m3630(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f3083
            float r4 = -r4
            float r4 = androidx.core.widget.l.m3632(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3083
            float r5 = androidx.core.widget.l.m3630(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3083
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f3084
            float r0 = androidx.core.widget.l.m3630(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f3084
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.l.m3632(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3084
            float r5 = androidx.core.widget.l.m3630(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3084
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m3467(int, float):int");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m3468() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m3469() {
        VelocityTracker velocityTracker = this.f3090;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3090 = null;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean m3470() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean m3471(int i5, int i6, int i7) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z5 = false;
        boolean z6 = i5 == 33;
        View m3481 = m3481(z6, i6, i7);
        if (m3481 == null) {
            m3481 = this;
        }
        if (i6 < scrollY || i7 > i8) {
            m3476(z6 ? i6 - scrollY : i7 - i8);
            z5 = true;
        }
        if (m3481 != findFocus()) {
            m3481.requestFocus(i5);
        }
        return z5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int m3472(int i5, int i6, int i7) {
        if (i6 >= i7 || i5 < 0) {
            return 0;
        }
        return i6 + i5 > i7 ? i7 - i6 : i5;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m3473(boolean z5) {
        if (z5) {
            m3501(2, 1);
        } else {
            m3508(1);
        }
        this.f3102 = getScrollY();
        f1.m2821(this);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private boolean m3474(Rect rect, boolean z5) {
        int m3495 = m3495(rect);
        boolean z6 = m3495 != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, m3495);
            } else {
                m3497(0, m3495);
            }
        }
        return z6;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private boolean m3475(EdgeEffect edgeEffect, int i5) {
        if (i5 > 0) {
            return true;
        }
        return m3483(-i5) < l.m3630(edgeEffect) * ((float) getHeight());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m3476(int i5) {
        if (i5 != 0) {
            if (this.f3092) {
                m3497(0, i5);
            } else {
                scrollBy(0, i5);
            }
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private void m3477(int i5, int i6, int i7, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3080 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3082.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i6 + scrollY, Math.max(0, height - height2))) - scrollY, i7);
            m3473(z5);
        } else {
            if (!this.f3082.isFinished()) {
                m3466();
            }
            scrollBy(i5, i6);
        }
        this.f3080 = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean m3478(int i5) {
        if (l.m3630(this.f3083) != 0.0f) {
            if (m3475(this.f3083, i5)) {
                this.f3083.onAbsorb(i5);
            } else {
                m3504(-i5);
            }
        } else {
            if (l.m3630(this.f3084) == 0.0f) {
                return false;
            }
            int i6 = -i5;
            if (m3475(this.f3084, i6)) {
                this.f3084.onAbsorb(i6);
            } else {
                m3504(i6);
            }
        }
        return true;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m3479() {
        this.f3089 = false;
        m3469();
        m3508(0);
        this.f3083.onRelease();
        this.f3084.onRelease();
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private boolean m3480(MotionEvent motionEvent) {
        boolean z5;
        if (l.m3630(this.f3083) != 0.0f) {
            l.m3632(this.f3083, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        if (l.m3630(this.f3084) == 0.0f) {
            return z5;
        }
        l.m3632(this.f3084, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* renamed from: י, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View m3481(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m3481(boolean, int, int):android.view.View");
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private void m3482(View view) {
        view.getDrawingRect(this.f3081);
        offsetDescendantRectToMyCoords(view, this.f3081);
        int m3495 = m3495(this.f3081);
        if (m3495 != 0) {
            scrollBy(0, m3495);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private float m3483(int i5) {
        double log = Math.log((Math.abs(i5) * 0.35f) / (this.f3079 * 0.015f));
        float f5 = f3074;
        double d6 = f5;
        Double.isNaN(d6);
        double d7 = this.f3079 * 0.015f;
        double d8 = f5;
        Double.isNaN(d8);
        double exp = Math.exp((d8 / (d6 - 1.0d)) * log);
        Double.isNaN(d7);
        return (float) (d7 * exp);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private void m3484(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3098) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f3085 = (int) motionEvent.getY(i5);
            this.f3098 = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.f3090;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean m3485(int i5, int i6) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i6 >= childAt.getTop() - scrollY && i6 < childAt.getBottom() - scrollY && i5 >= childAt.getLeft() && i5 < childAt.getRight();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m3486() {
        VelocityTracker velocityTracker = this.f3090;
        if (velocityTracker == null) {
            this.f3090 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m3487() {
        this.f3082 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3094 = viewConfiguration.getScaledTouchSlop();
        this.f3096 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3097 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m3488() {
        if (this.f3090 == null) {
            this.f3090 = VelocityTracker.obtain();
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean m3489(View view) {
        return !m3491(view, 0, getHeight());
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static boolean m3490(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m3490((View) parent, view2);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean m3491(View view, int i5, int i6) {
        view.getDrawingRect(this.f3081);
        offsetDescendantRectToMyCoords(view, this.f3081);
        return this.f3081.bottom + i5 >= getScrollY() && this.f3081.top - i5 <= getScrollY() + i6;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m3492(int i5, int i6, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3095.m3251(0, scrollY2, 0, i5 - scrollY2, null, i6, iArr);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3082.isFinished()) {
            return;
        }
        this.f3082.computeScrollOffset();
        int currY = this.f3082.getCurrY();
        int m3496 = m3496(currY - this.f3102);
        this.f3102 = currY;
        int[] iArr = this.f3100;
        boolean z5 = false;
        iArr[1] = 0;
        m3498(0, m3496, iArr, null, 1);
        int i5 = m3496 - this.f3100[1];
        int scrollRange = getScrollRange();
        if (i5 != 0) {
            int scrollY = getScrollY();
            m3507(0, i5, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i6 = i5 - scrollY2;
            int[] iArr2 = this.f3100;
            iArr2[1] = 0;
            m3499(0, scrollY2, 0, i6, this.f3099, 1, iArr2);
            i5 = i6 - this.f3100[1];
        }
        if (i5 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z5 = true;
            }
            if (z5) {
                if (i5 < 0) {
                    if (this.f3083.isFinished()) {
                        this.f3083.onAbsorb((int) this.f3082.getCurrVelocity());
                    }
                } else if (this.f3084.isFinished()) {
                    this.f3084.onAbsorb((int) this.f3082.getCurrVelocity());
                }
            }
            m3466();
        }
        if (this.f3082.isFinished()) {
            m3508(1);
        } else {
            f1.m2821(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m3503(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f6, boolean z5) {
        return this.f3095.m3247(f5, f6, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f3095.m3248(f5, f6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return m3498(i5, i6, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return this.f3095.m3252(i5, i6, i7, i8, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i5 = 0;
        if (!this.f3083.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 21 || b.m3509(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i6 >= 21 && b.m3509(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f3083.setSize(width, height);
            if (this.f3083.draw(canvas)) {
                f1.m2821(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f3084.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 21 || b.m3509(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i5 = 0 + getPaddingLeft();
        }
        if (i7 >= 21 && b.m3509(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i5 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3084.setSize(width2, height2);
        if (this.f3084.draw(canvas)) {
            f1.m2821(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3093.m3319();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m3506(0);
    }

    @Override // android.view.View, androidx.core.view.o0
    public boolean isNestedScrollingEnabled() {
        return this.f3095.m3256();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i5, int i6) {
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3087 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z5;
        int i5 = 0;
        if (motionEvent.getAction() == 8 && !this.f3089) {
            float axisValue = androidx.core.view.n0.m3215(motionEvent, 2) ? motionEvent.getAxisValue(9) : androidx.core.view.n0.m3215(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i6 = scrollY - verticalScrollFactorCompat;
                if (i6 < 0) {
                    if (m3468() && !androidx.core.view.n0.m3215(motionEvent, 8194)) {
                        l.m3632(this.f3083, (-i6) / getHeight(), 0.5f);
                        this.f3083.onRelease();
                        invalidate();
                        z5 = 1;
                    } else {
                        z5 = 0;
                    }
                } else if (i6 > scrollRange) {
                    if (m3468() && !androidx.core.view.n0.m3215(motionEvent, 8194)) {
                        l.m3632(this.f3084, (i6 - scrollRange) / getHeight(), 0.5f);
                        this.f3084.onRelease();
                        invalidate();
                        i5 = 1;
                    }
                    z5 = i5;
                    i5 = scrollRange;
                } else {
                    i5 = i6;
                    z5 = 0;
                }
                if (i5 == scrollY) {
                    return z5;
                }
                super.scrollTo(getScrollX(), i5);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        int i9 = 0;
        this.f3086 = false;
        View view = this.f3088;
        if (view != null && m3490(view, this)) {
            m3482(this.f3088);
        }
        this.f3088 = null;
        if (!this.f3087) {
            if (this.f3103 != null) {
                scrollTo(getScrollX(), this.f3103.f3104);
                this.f3103 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i9 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m3472 = m3472(scrollY, paddingTop, i9);
            if (m3472 != scrollY) {
                scrollTo(getScrollX(), m3472);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3087 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f3091 && View.MeasureSpec.getMode(i6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedFling(View view, float f5, float f6, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f6, true);
        m3504((int) f6);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedPreFling(View view, float f5, float f6) {
        return dispatchNestedPreFling(f5, f6);
    }

    @Override // androidx.core.view.q0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr, int i7) {
        m3498(i5, i6, iArr, null, i7);
    }

    @Override // androidx.core.view.r0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        m3492(i8, i9, iArr);
    }

    @Override // androidx.core.view.q0
    public void onNestedScrollAccepted(View view, View view2, int i5, int i6) {
        this.f3093.m3321(view, view2, i5, i6);
        m3501(2, i6);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i5, int i6, boolean z5, boolean z6) {
        super.scrollTo(i5, i6);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (i5 == 2) {
            i5 = 130;
        } else if (i5 == 1) {
            i5 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i5) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i5);
        if (findNextFocus == null || m3489(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i5, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f3103 = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f3104 = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i5, int i6, int i7, int i8) {
        super.onScrollChanged(i5, i6, i7, i8);
        c cVar = this.f3078;
        if (cVar != null) {
            cVar.mo472(this, i5, i6, i7, i8);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m3491(findFocus, 0, i8)) {
            return;
        }
        findFocus.getDrawingRect(this.f3081);
        offsetDescendantRectToMyCoords(findFocus, this.f3081);
        m3476(m3495(this.f3081));
    }

    @Override // androidx.core.view.q0
    public boolean onStartNestedScroll(View view, View view2, int i5, int i6) {
        return (i5 & 2) != 0;
    }

    @Override // androidx.core.view.q0
    public void onStopNestedScroll(View view, int i5) {
        this.f3093.m3323(view, i5);
        m3508(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3086) {
            this.f3088 = view2;
        } else {
            m3482(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3474(rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        if (z5) {
            m3469();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3086 = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i6) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m3472 = m3472(i5, width, width2);
            int m34722 = m3472(i6, height, height2);
            if (m3472 == getScrollX() && m34722 == getScrollY()) {
                return;
            }
            super.scrollTo(m3472, m34722);
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f3091) {
            this.f3091 = z5;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        this.f3095.m3257(z5);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.f3078 = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f3092 = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i5) {
        return m3501(i5, 0);
    }

    @Override // android.view.View, androidx.core.view.o0
    public void stopNestedScroll() {
        m3508(0);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean m3493(int i5) {
        boolean z5 = i5 == 130;
        int height = getHeight();
        if (z5) {
            this.f3081.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3081;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3081.top = getScrollY() - height;
            Rect rect2 = this.f3081;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3081;
        int i6 = rect3.top;
        int i7 = height + i6;
        rect3.bottom = i7;
        return m3471(i5, i6, i7);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m3494(int i5) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i5);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3491(findNextFocus, maxScrollAmount, getHeight())) {
            if (i5 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i5 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i5 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3476(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3081);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3081);
            m3476(m3495(this.f3081));
            findNextFocus.requestFocus(i5);
        }
        if (findFocus == null || !findFocus.isFocused() || !m3489(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected int m3495(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i6 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i5 - verticalFadingEdgeLength : i5;
        int i7 = rect.bottom;
        if (i7 > i6 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i6) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        }
        if (rect.top >= scrollY || i7 >= i6) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i6 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m3496(int i5) {
        int height = getHeight();
        if (i5 > 0 && l.m3630(this.f3083) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * l.m3632(this.f3083, ((-i5) * 4.0f) / height, 0.5f));
            if (round != i5) {
                this.f3083.finish();
            }
            return i5 - round;
        }
        if (i5 >= 0 || l.m3630(this.f3084) == 0.0f) {
            return i5;
        }
        float f5 = height;
        int round2 = Math.round((f5 / 4.0f) * l.m3632(this.f3084, (i5 * 4.0f) / f5, 0.5f));
        if (round2 != i5) {
            this.f3084.finish();
        }
        return i5 - round2;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public final void m3497(int i5, int i6) {
        m3477(i5, i6, 250, false);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m3498(int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        return this.f3095.m3250(i5, i6, iArr, iArr2, i7);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m3499(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        this.f3095.m3251(i5, i6, i7, i8, iArr, i9, iArr2);
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m3500(int i5, int i6, int i7, boolean z5) {
        m3477(i5 - getScrollX(), i6 - getScrollY(), i7, z5);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public boolean m3501(int i5, int i6) {
        return this.f3095.m3259(i5, i6);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m3502(int i5, int i6, boolean z5) {
        m3500(i5, i6, 250, z5);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m3503(KeyEvent keyEvent) {
        this.f3081.setEmpty();
        if (!m3470()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m3494(33) : m3505(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m3494(130) : m3505(130);
        }
        if (keyCode != 62) {
            return false;
        }
        m3493(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m3504(int i5) {
        if (getChildCount() > 0) {
            this.f3082.fling(getScrollX(), getScrollY(), 0, i5, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            m3473(true);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m3505(int i5) {
        int childCount;
        boolean z5 = i5 == 130;
        int height = getHeight();
        Rect rect = this.f3081;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3081.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3081;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3081;
        return m3471(i5, rect3.top, rect3.bottom);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public boolean m3506(int i5) {
        return this.f3095.m3255(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m3507(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m3506(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f3082
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m3507(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public void m3508(int i5) {
        this.f3095.m3261(i5);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f3081 = new Rect();
        this.f3086 = true;
        this.f3087 = false;
        this.f3088 = null;
        this.f3089 = false;
        this.f3092 = true;
        this.f3098 = -1;
        this.f3099 = new int[2];
        this.f3100 = new int[2];
        this.f3083 = l.m3629(context, attributeSet);
        this.f3084 = l.m3629(context, attributeSet);
        this.f3079 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m3487();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3075, i5, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3093 = new t0(this);
        this.f3095 = new androidx.core.view.p0(this);
        setNestedScrollingEnabled(true);
        f1.m2830(this, f3076);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        onNestedPreScroll(view, i5, i6, iArr, 0);
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9) {
        m3492(i8, i9, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        return onStartNestedScroll(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        m3492(i8, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        onNestedScrollAccepted(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5) {
        if (getChildCount() <= 0) {
            super.addView(view, i5);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
