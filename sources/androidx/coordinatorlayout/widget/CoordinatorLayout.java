package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.q0;
import androidx.core.view.r;
import androidx.core.view.r0;
import androidx.core.view.t0;
import androidx.core.view.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CoordinatorLayout extends ViewGroup implements q0, r0 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final androidx.core.util.e<Rect> sRectPool;
    private u0 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.a<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private f5 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final t0 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    class a implements u0 {
        a() {
        }

        @Override // androidx.core.view.u0
        /* renamed from: ʻ */
        public f5 mo691(View view, f5 f5Var) {
            return CoordinatorLayout.this.setWindowInsets(f5Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public static Object getTag(View view) {
            return ((f) view.getLayoutParams()).f2521;
        }

        public static void setTag(View view, Object obj) {
            ((f) view.getLayoutParams()).f2521 = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v5) {
            return getScrimOpacity(coordinatorLayout, v5) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v5, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v5) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v5) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v5, View view) {
            return false;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v5, View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v5, int i5) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, int i7, int i8) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v5, View view, float f5, float f6, boolean z5) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v5, View view, float f5, float f6) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int i7, int i8) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i5) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v5, Rect rect, boolean z5) {
            return false;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v5) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i5) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int[] iArr, int i7) {
            if (i7 == 0) {
                onNestedPreScroll(coordinatorLayout, v5, view, i5, i6, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int i7, int i8, int i9) {
            if (i9 == 0) {
                onNestedScroll(coordinatorLayout, v5, view, i5, i6, i7, i8);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i5, int i6) {
            if (i6 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v5, view, view2, i5);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i5, int i6) {
            if (i6 == 0) {
                return onStartNestedScroll(coordinatorLayout, v5, view, view2, i5);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5) {
            if (i5 == 0) {
                onStopNestedScroll(coordinatorLayout, v5, view);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v5, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
            onNestedScroll(coordinatorLayout, v5, view, i5, i6, i7, i8, i9);
        }

        public void onAttachedToLayoutParams(f fVar) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public f5 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v5, f5 f5Var) {
            return f5Var;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v5, View view) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v5, Parcelable parcelable) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float m2883 = f1.m2883(view);
            float m28832 = f1.m2883(view2);
            if (m2883 > m28832) {
                return -1;
            }
            return m2883 < m28832 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r02 != null ? r02.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            TOP_SORTED_CHILDREN_COMPARATOR = new i();
        } else {
            TOP_SORTED_CHILDREN_COMPARATOR = null;
        }
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new androidx.core.util.g(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static Rect acquireTempRect() {
        Rect mo2575 = sRectPool.mo2575();
        return mo2575 == null ? new Rect() : mo2575;
    }

    private static int clamp(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
    }

    private void constrainChildRect(f fVar, Rect rect, int i5, int i6) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i5) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i6) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i5 + max, i6 + max2);
    }

    private f5 dispatchApplyWindowInsetsToBehaviors(f5 f5Var) {
        c m1896;
        if (f5Var.m3080()) {
            return f5Var;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (f1.m2891(childAt) && (m1896 = ((f) childAt.getLayoutParams()).m1896()) != null) {
                f5Var = m1896.onApplyWindowInsets(this, childAt, f5Var);
                if (f5Var.m3080()) {
                    break;
                }
            }
        }
        return f5Var;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i5, Rect rect, Rect rect2, f fVar, int i6, int i7) {
        int m3298 = r.m3298(resolveAnchoredChildGravity(fVar.f2506), i5);
        int m32982 = r.m3298(resolveGravity(fVar.f2507), i5);
        int i8 = m3298 & 7;
        int i9 = m3298 & 112;
        int i10 = m32982 & 7;
        int i11 = m32982 & 112;
        int width = i10 != 1 ? i10 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i11 != 16 ? i11 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i8 == 1) {
            width -= i6 / 2;
        } else if (i8 != 5) {
            width -= i6;
        }
        if (i9 == 16) {
            height -= i7 / 2;
        } else if (i9 != 80) {
            height -= i7;
        }
        rect2.set(width, height, i6 + width, i7 + height);
    }

    private int getKeyline(int i5) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i5);
            return 0;
        }
        if (i5 >= 0 && i5 < iArr.length) {
            return iArr[i5];
        }
        Log.e(TAG, "Keyline index " + i5 + " out of range for " + this);
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.m1922(view);
    }

    private void layoutChild(View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.mLastInsets != null && f1.m2891(this) && !f1.m2891(view)) {
            acquireTempRect.left += this.mLastInsets.m3074();
            acquireTempRect.top += this.mLastInsets.m3076();
            acquireTempRect.right -= this.mLastInsets.m3075();
            acquireTempRect.bottom -= this.mLastInsets.m3073();
        }
        Rect acquireTempRect2 = acquireTempRect();
        r.m3297(resolveGravity(fVar.f2506), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i5);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i5) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i5, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i5, int i6) {
        f fVar = (f) view.getLayoutParams();
        int m3298 = r.m3298(resolveKeylineGravity(fVar.f2506), i6);
        int i7 = m3298 & 7;
        int i8 = m3298 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i6 == 1) {
            i5 = width - i5;
        }
        int keyline = getKeyline(i5) - measuredWidth;
        if (i7 == 1) {
            keyline += measuredWidth / 2;
        } else if (i7 == 5) {
            keyline += measuredWidth;
        }
        int i9 = 0;
        if (i8 == 16) {
            i9 = 0 + (measuredHeight / 2);
        } else if (i8 == 80) {
            i9 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void offsetChildByInset(View view, Rect rect, int i5) {
        boolean z5;
        boolean z6;
        int width;
        int i6;
        int i7;
        int i8;
        int height;
        int i9;
        int i10;
        int i11;
        if (f1.m2808(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c m1896 = fVar.m1896();
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m1896 == null || !m1896.getInsetDodgeRect(this, view, acquireTempRect)) {
                acquireTempRect.set(acquireTempRect2);
            } else if (!acquireTempRect2.contains(acquireTempRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + acquireTempRect.toShortString() + " | Bounds:" + acquireTempRect2.toShortString());
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int m3298 = r.m3298(fVar.f2511, i5);
            boolean z7 = true;
            if ((m3298 & 48) != 48 || (i10 = (acquireTempRect.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f2513) >= (i11 = rect.top)) {
                z5 = false;
            } else {
                setInsetOffsetY(view, i11 - i10);
                z5 = true;
            }
            if ((m3298 & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f2513) < (i9 = rect.bottom)) {
                setInsetOffsetY(view, height - i9);
                z5 = true;
            }
            if (!z5) {
                setInsetOffsetY(view, 0);
            }
            if ((m3298 & 3) != 3 || (i7 = (acquireTempRect.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f2512) >= (i8 = rect.left)) {
                z6 = false;
            } else {
                setInsetOffsetX(view, i8 - i7);
                z6 = true;
            }
            if ((m3298 & 5) != 5 || (width = ((getWidth() - acquireTempRect.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f2512) >= (i6 = rect.right)) {
                z7 = z6;
            } else {
                setInsetOffsetX(view, width - i6);
            }
            if (!z7) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e5) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e5);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i5) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = list.get(i6);
            f fVar = (f) view.getLayoutParams();
            c m1896 = fVar.m1896();
            if (!(z5 || z6) || actionMasked == 0) {
                if (!z5 && m1896 != null) {
                    if (i5 == 0) {
                        z5 = m1896.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i5 == 1) {
                        z5 = m1896.onTouchEvent(this, view, motionEvent);
                    }
                    if (z5) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean m1893 = fVar.m1893();
                boolean m1899 = fVar.m1899(this, view);
                z6 = m1899 && !m1893;
                if (m1899 && !z6) {
                    break;
                }
            } else if (m1896 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i5 == 0) {
                    m1896.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i5 == 1) {
                    m1896.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z5;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.m1917();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.m1894(this, childAt);
            this.mChildDag.m1916(childAt);
            for (int i6 = 0; i6 < childCount; i6++) {
                if (i6 != i5) {
                    View childAt2 = getChildAt(i6);
                    if (resolvedLayoutParams.m1892(this, childAt, childAt2)) {
                        if (!this.mChildDag.m1918(childAt2)) {
                            this.mChildDag.m1916(childAt2);
                        }
                        this.mChildDag.m1915(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.m1921());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.mo2574(rect);
    }

    private void resetTouchBehaviors(boolean z5) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            c m1896 = ((f) childAt.getLayoutParams()).m1896();
            if (m1896 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    m1896.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    m1896.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            ((f) getChildAt(i6).getLayoutParams()).m1903();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i5) {
        if (i5 == 0) {
            return 17;
        }
        return i5;
    }

    private static int resolveGravity(int i5) {
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        return (i5 & 112) == 0 ? i5 | 48 : i5;
    }

    private static int resolveKeylineGravity(int i5) {
        if (i5 == 0) {
            return 8388661;
        }
        return i5;
    }

    private void setInsetOffsetX(View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        int i6 = fVar.f2512;
        if (i6 != i5) {
            f1.m2814(view, i5 - i6);
            fVar.f2512 = i5;
        }
    }

    private void setInsetOffsetY(View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        int i6 = fVar.f2513;
        if (i6 != i5) {
            f1.m2815(view, i5 - i6);
            fVar.f2513 = i5;
        }
    }

    private void setupForInsets() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!f1.m2891(this)) {
            f1.m2846(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a();
        }
        f1.m2846(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        List m1919 = this.mChildDag.m1919(view);
        if (m1919 == null || m1919.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < m1919.size(); i5++) {
            View view2 = (View) m1919.get(i5);
            c m1896 = ((f) view2.getLayoutParams()).m1896();
            if (m1896 != null) {
                m1896.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z5 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect acquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, acquireTempRect);
        Rect acquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left) {
                if (acquireTempRect.bottom >= acquireTempRect2.top) {
                    z5 = true;
                }
            }
            return z5;
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f2504;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.f2504.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (hasDependencies(getChildAt(i5))) {
                z5 = true;
                break;
            }
            i5++;
        }
        if (z5 != this.mNeedsPreDrawListener) {
            if (z5) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    void getChildRect(View view, boolean z5, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> getDependencies(View view) {
        List<View> m1920 = this.mChildDag.m1920(view);
        this.mTempDependenciesList.clear();
        if (m1920 != null) {
            this.mTempDependenciesList.addAll(m1920);
        }
        return this.mTempDependenciesList;
    }

    final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        List m1919 = this.mChildDag.m1919(view);
        this.mTempDependenciesList.clear();
        if (m1919 != null) {
            this.mTempDependenciesList.addAll(m1919);
        }
        return this.mTempDependenciesList;
    }

    void getDescendantRect(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.m1923(this, view, rect);
    }

    void getDesiredAnchoredChildRect(View view, int i5, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i5, rect, rect2, fVar, measuredWidth, measuredHeight);
        constrainChildRect(fVar, rect2, measuredWidth, measuredHeight);
    }

    void getLastChildRect(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).m1898());
    }

    public final f5 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m3319();
    }

    /* JADX WARN: Multi-variable type inference failed */
    f getResolvedLayoutParams(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f2505) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                fVar.m1904(behavior);
                fVar.f2505 = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.m1904(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e5) {
                        Log.e(TAG, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                    }
                }
                fVar.f2505 = true;
            }
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(View view, int i5, int i6) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i5, i6);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    void offsetChildToAnchor(View view, int i5) {
        c m1896;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f2514 != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(fVar.f2514, acquireTempRect);
            getChildRect(view, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i5, acquireTempRect, acquireTempRect3, fVar, measuredWidth, measuredHeight);
            boolean z5 = (acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top) ? false : true;
            constrainChildRect(fVar, acquireTempRect3, measuredWidth, measuredHeight);
            int i6 = acquireTempRect3.left - acquireTempRect2.left;
            int i7 = acquireTempRect3.top - acquireTempRect2.top;
            if (i6 != 0) {
                f1.m2814(view, i6);
            }
            if (i7 != 0) {
                f1.m2815(view, i7);
            }
            if (z5 && (m1896 = fVar.m1896()) != null) {
                m1896.onDependentViewChanged(this, view, fVar.f2514);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && f1.m2891(this)) {
            f1.m2827(this);
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void onChildViewsChanged(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onChildViewsChanged(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        f5 f5Var = this.mLastInsets;
        int m3076 = f5Var != null ? f5Var.m3076() : 0;
        if (m3076 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), m3076);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return performIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        c m1896;
        int m2834 = f1.m2834(this);
        int size = this.mDependencySortedChildren.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = this.mDependencySortedChildren.get(i9);
            if (view.getVisibility() != 8 && ((m1896 = ((f) view.getLayoutParams()).m1896()) == null || !m1896.onLayoutChild(this, view, m2834))) {
                onLayoutChild(view, m2834);
            }
        }
    }

    public void onLayoutChild(View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.m1891()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f2514;
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i5);
            return;
        }
        int i6 = fVar.f2508;
        if (i6 >= 0) {
            layoutChildWithKeyline(view, i6, i5);
        } else {
            layoutChild(view, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i5, int i6, int i7, int i8) {
        measureChildWithMargins(view, i5, i6, i7, i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedFling(View view, float f5, float f6, boolean z5) {
        c m1896;
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.m1900(0) && (m1896 = fVar.m1896()) != null) {
                    z6 |= m1896.onNestedFling(this, childAt, view, f5, f6, z5);
                }
            }
        }
        if (z6) {
            onChildViewsChanged(1);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedPreFling(View view, float f5, float f6) {
        c m1896;
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.m1900(0) && (m1896 = fVar.m1896()) != null) {
                    z5 |= m1896.onNestedPreFling(this, childAt, view, f5, f6);
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        onNestedPreScroll(view, i5, i6, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        onNestedScroll(view, i5, i6, i7, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        onNestedScrollAccepted(view, view2, i5, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        SparseArray<Parcelable> sparseArray = hVar.f2523;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            c m1896 = getResolvedLayoutParams(childAt).m1896();
            if (id != -1 && m1896 != null && (parcelable2 = sparseArray.get(id)) != null) {
                m1896.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            c m1896 = ((f) childAt.getLayoutParams()).m1896();
            if (id != -1 && m1896 != null && (onSaveInstanceState = m1896.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        hVar.f2523 = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        return onStartNestedScroll(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002b A[PHI: r3
  0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:20:0x0022, B:4:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1896()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.resetTouchBehaviors(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void recordLastChildRect(View view, Rect rect) {
        ((f) view.getLayoutParams()).m1906(rect);
    }

    void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        c m1896 = ((f) view.getLayoutParams()).m1896();
        if (m1896 == null || !m1896.onRequestChildRectangleOnScreen(this, view, rect, z5)) {
            return super.requestChildRectangleOnScreen(view, rect, z5);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m2208(this.mStatusBarBackground, f1.m2834(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            f1.m2821(this);
        }
    }

    public void setStatusBarBackgroundColor(int i5) {
        setStatusBarBackground(new ColorDrawable(i5));
    }

    public void setStatusBarBackgroundResource(int i5) {
        setStatusBarBackground(i5 != 0 ? androidx.core.content.a.m1993(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.mStatusBarBackground.setVisible(z5, false);
    }

    final f5 setWindowInsets(f5 f5Var) {
        if (androidx.core.util.c.m2568(this.mLastInsets, f5Var)) {
            return f5Var;
        }
        this.mLastInsets = f5Var;
        boolean z5 = f5Var != null && f5Var.m3076() > 0;
        this.mDrawStatusBarBackground = z5;
        setWillNotDraw(!z5 && getBackground() == null);
        f5 dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(f5Var);
        requestLayout();
        return dispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, t.a.f11242);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.q0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr, int i7) {
        c m1896;
        int childCount = getChildCount();
        boolean z5 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.m1900(i7) && (m1896 = fVar.m1896()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m1896.onNestedPreScroll(this, childAt, view, i5, i6, iArr2, i7);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i8 = i5 > 0 ? Math.max(i8, iArr3[0]) : Math.min(i8, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i9 = i6 > 0 ? Math.max(i9, iArr4[1]) : Math.min(i9, iArr4[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i9;
        if (z5) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9) {
        onNestedScroll(view, i5, i6, i7, i8, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.q0
    public void onNestedScrollAccepted(View view, View view2, int i5, int i6) {
        c m1896;
        this.mNestedScrollingParentHelper.m3321(view, view2, i5, i6);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.m1900(i6) && (m1896 = fVar.m1896()) != null) {
                m1896.onNestedScrollAccepted(this, childAt, view, view2, i5, i6);
            }
        }
    }

    @Override // androidx.core.view.q0
    public boolean onStartNestedScroll(View view, View view2, int i5, int i6) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c m1896 = fVar.m1896();
                if (m1896 != null) {
                    boolean onStartNestedScroll = m1896.onStartNestedScroll(this, childAt, view, view2, i5, i6);
                    z5 |= onStartNestedScroll;
                    fVar.m1907(i6, onStartNestedScroll);
                } else {
                    fVar.m1907(i6, false);
                }
            }
        }
        return z5;
    }

    @Override // androidx.core.view.q0
    public void onStopNestedScroll(View view, int i5) {
        this.mNestedScrollingParentHelper.m3323(view, i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.m1900(i5)) {
                c m1896 = fVar.m1896();
                if (m1896 != null) {
                    m1896.onStopNestedScroll(this, childAt, view, i5);
                }
                fVar.m1902(i5);
                fVar.m1901();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i5) {
        TypedArray obtainStyledAttributes;
        super(context, attributeSet, i5);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.a<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new t0(this);
        if (i5 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.c.f11245, 0, t.b.f11243);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.c.f11245, i5, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i5 == 0) {
                saveAttributeDataForStyleable(context, t.c.f11245, attributeSet, obtainStyledAttributes, 0, t.b.f11243);
            } else {
                saveAttributeDataForStyleable(context, t.c.f11245, attributeSet, obtainStyledAttributes, i5, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(t.c.f11246, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f5 = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.mKeylines[i6] = (int) (r12[i6] * f5);
            }
        }
        this.mStatusBarBackground = obtainStyledAttributes.getDrawable(t.c.f11247);
        obtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new e());
        if (f1.m2807(this) == 0) {
            f1.m2843(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.r0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        c m1896;
        int min;
        int childCount = getChildCount();
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.m1900(i9) && (m1896 = fVar.m1896()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m1896.onNestedScroll(this, childAt, view, i5, i6, i7, i8, i9, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i10 = i7 > 0 ? Math.max(i10, iArr3[0]) : Math.min(i10, iArr3[0]);
                    if (i8 > 0) {
                        min = Math.max(i11, this.mBehaviorConsumed[1]);
                    } else {
                        min = Math.min(i11, this.mBehaviorConsumed[1]);
                    }
                    i11 = min;
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
        if (z5) {
            onChildViewsChanged(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    protected static class h extends androidx.customview.view.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        SparseArray<Parcelable> f2523;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public h[] newArray(int i5) {
                return new h[i5];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2523 = new SparseArray<>(readInt);
            for (int i5 = 0; i5 < readInt; i5++) {
                this.f2523.append(iArr[i5], readParcelableArray[i5]);
            }
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            SparseArray<Parcelable> sparseArray = this.f2523;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i6 = 0; i6 < size; i6++) {
                iArr[i6] = this.f2523.keyAt(i6);
                parcelableArr[i6] = this.f2523.valueAt(i6);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i5);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: ʻ, reason: contains not printable characters */
        c f2504;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f2505;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f2506;

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f2507;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f2508;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f2509;

        /* renamed from: ˈ, reason: contains not printable characters */
        public int f2510;

        /* renamed from: ˉ, reason: contains not printable characters */
        public int f2511;

        /* renamed from: ˊ, reason: contains not printable characters */
        int f2512;

        /* renamed from: ˋ, reason: contains not printable characters */
        int f2513;

        /* renamed from: ˎ, reason: contains not printable characters */
        View f2514;

        /* renamed from: ˏ, reason: contains not printable characters */
        View f2515;

        /* renamed from: ˑ, reason: contains not printable characters */
        private boolean f2516;

        /* renamed from: י, reason: contains not printable characters */
        private boolean f2517;

        /* renamed from: ـ, reason: contains not printable characters */
        private boolean f2518;

        /* renamed from: ٴ, reason: contains not printable characters */
        private boolean f2519;

        /* renamed from: ᐧ, reason: contains not printable characters */
        final Rect f2520;

        /* renamed from: ᴵ, reason: contains not printable characters */
        Object f2521;

        public f(int i5, int i6) {
            super(i5, i6);
            this.f2505 = false;
            this.f2506 = 0;
            this.f2507 = 0;
            this.f2508 = -1;
            this.f2509 = -1;
            this.f2510 = 0;
            this.f2511 = 0;
            this.f2520 = new Rect();
        }

        /* renamed from: י, reason: contains not printable characters */
        private void m1888(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2509);
            this.f2514 = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2515 = null;
                    this.f2514 = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2509) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f2515 = null;
                this.f2514 = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f2515 = null;
                    this.f2514 = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f2515 = findViewById;
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        private boolean m1889(View view, int i5) {
            int m3298 = r.m3298(((f) view.getLayoutParams()).f2510, i5);
            return m3298 != 0 && (r.m3298(this.f2511, i5) & m3298) == m3298;
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        private boolean m1890(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2514.getId() != this.f2509) {
                return false;
            }
            View view2 = this.f2514;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2515 = null;
                    this.f2514 = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f2515 = view2;
            return true;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m1891() {
            return this.f2514 == null && this.f2509 != -1;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean m1892(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f2515 || m1889(view2, f1.m2834(coordinatorLayout)) || ((cVar = this.f2504) != null && cVar.layoutDependsOn(coordinatorLayout, view, view2));
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean m1893() {
            if (this.f2504 == null) {
                this.f2516 = false;
            }
            return this.f2516;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        View m1894(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2509 == -1) {
                this.f2515 = null;
                this.f2514 = null;
                return null;
            }
            if (this.f2514 == null || !m1890(view, coordinatorLayout)) {
                m1888(view, coordinatorLayout);
            }
            return this.f2514;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public int m1895() {
            return this.f2509;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public c m1896() {
            return this.f2504;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean m1897() {
            return this.f2519;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        Rect m1898() {
            return this.f2520;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        boolean m1899(CoordinatorLayout coordinatorLayout, View view) {
            boolean z5 = this.f2516;
            if (z5) {
                return true;
            }
            c cVar = this.f2504;
            boolean blocksInteractionBelow = (cVar != null ? cVar.blocksInteractionBelow(coordinatorLayout, view) : false) | z5;
            this.f2516 = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        boolean m1900(int i5) {
            if (i5 == 0) {
                return this.f2517;
            }
            if (i5 != 1) {
                return false;
            }
            return this.f2518;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        void m1901() {
            this.f2519 = false;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        void m1902(int i5) {
            m1907(i5, false);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        void m1903() {
            this.f2516 = false;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public void m1904(c cVar) {
            c cVar2 = this.f2504;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f2504 = cVar;
                this.f2521 = null;
                this.f2505 = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        void m1905(boolean z5) {
            this.f2519 = z5;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        void m1906(Rect rect) {
            this.f2520.set(rect);
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        void m1907(int i5, boolean z5) {
            if (i5 == 0) {
                this.f2517 = z5;
            } else {
                if (i5 != 1) {
                    return;
                }
                this.f2518 = z5;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2505 = false;
            this.f2506 = 0;
            this.f2507 = 0;
            this.f2508 = -1;
            this.f2509 = -1;
            this.f2510 = 0;
            this.f2511 = 0;
            this.f2520 = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.c.f11248);
            this.f2506 = obtainStyledAttributes.getInteger(t.c.f11249, 0);
            this.f2509 = obtainStyledAttributes.getResourceId(t.c.f11250, -1);
            this.f2507 = obtainStyledAttributes.getInteger(t.c.f11251, 0);
            this.f2508 = obtainStyledAttributes.getInteger(t.c.f11255, -1);
            this.f2510 = obtainStyledAttributes.getInt(t.c.f11254, 0);
            this.f2511 = obtainStyledAttributes.getInt(t.c.f11253, 0);
            int i5 = t.c.f11252;
            boolean hasValue = obtainStyledAttributes.hasValue(i5);
            this.f2505 = hasValue;
            if (hasValue) {
                this.f2504 = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(i5));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f2504;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2505 = false;
            this.f2506 = 0;
            this.f2507 = 0;
            this.f2508 = -1;
            this.f2509 = -1;
            this.f2510 = 0;
            this.f2511 = 0;
            this.f2520 = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2505 = false;
            this.f2506 = 0;
            this.f2507 = 0;
            this.f2508 = -1;
            this.f2509 = -1;
            this.f2510 = 0;
            this.f2511 = 0;
            this.f2520 = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2505 = false;
            this.f2506 = 0;
            this.f2507 = 0;
            this.f2508 = -1;
            this.f2509 = -1;
            this.f2510 = 0;
            this.f2511 = 0;
            this.f2520 = new Rect();
        }
    }
}
