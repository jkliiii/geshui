package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.core.view.n0;
import androidx.core.view.o0;
import androidx.core.view.p0;
import androidx.core.view.y3;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class RecyclerView extends ViewGroup implements o0 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final c0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    androidx.recyclerview.widget.k mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<f0> mPendingAccessibilityImportanceChange;
    z mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private p0 mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final e0 mViewFlinger;
    private final p.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.p mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    public static abstract class a0 {

        /* renamed from: ʼ, reason: contains not printable characters */
        private RecyclerView f4034;

        /* renamed from: ʽ, reason: contains not printable characters */
        private p f4035;

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f4036;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f4037;

        /* renamed from: ˆ, reason: contains not printable characters */
        private View f4038;

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f4040;

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f4033 = -1;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final a f4039 = new a(0, 0);

        public static class a {

            /* renamed from: ʻ, reason: contains not printable characters */
            private int f4041;

            /* renamed from: ʼ, reason: contains not printable characters */
            private int f4042;

            /* renamed from: ʽ, reason: contains not printable characters */
            private int f4043;

            /* renamed from: ʾ, reason: contains not printable characters */
            private int f4044;

            /* renamed from: ʿ, reason: contains not printable characters */
            private Interpolator f4045;

            /* renamed from: ˆ, reason: contains not printable characters */
            private boolean f4046;

            /* renamed from: ˈ, reason: contains not printable characters */
            private int f4047;

            public a(int i5, int i6) {
                this(i5, i6, RecyclerView.UNDEFINED_DURATION, null);
            }

            /* renamed from: ʿ, reason: contains not printable characters */
            private void m4760() {
                if (this.f4045 != null && this.f4043 < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4043 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            boolean m4761() {
                return this.f4044 >= 0;
            }

            /* renamed from: ʼ, reason: contains not printable characters */
            public void m4762(int i5) {
                this.f4044 = i5;
            }

            /* renamed from: ʽ, reason: contains not printable characters */
            void m4763(RecyclerView recyclerView) {
                int i5 = this.f4044;
                if (i5 >= 0) {
                    this.f4044 = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i5);
                    this.f4046 = false;
                } else {
                    if (!this.f4046) {
                        this.f4047 = 0;
                        return;
                    }
                    m4760();
                    recyclerView.mViewFlinger.m4792(this.f4041, this.f4042, this.f4043, this.f4045);
                    int i6 = this.f4047 + 1;
                    this.f4047 = i6;
                    if (i6 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4046 = false;
                }
            }

            /* renamed from: ʾ, reason: contains not printable characters */
            public void m4764(int i5, int i6, int i7, Interpolator interpolator) {
                this.f4041 = i5;
                this.f4042 = i6;
                this.f4043 = i7;
                this.f4045 = interpolator;
                this.f4046 = true;
            }

            public a(int i5, int i6, int i7, Interpolator interpolator) {
                this.f4044 = -1;
                this.f4046 = false;
                this.f4047 = 0;
                this.f4041 = i5;
                this.f4042 = i6;
                this.f4043 = i7;
                this.f4045 = interpolator;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i5);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public PointF mo4742(int i5) {
            Object m4746 = m4746();
            if (m4746 instanceof b) {
                return ((b) m4746).computeScrollVectorForPosition(i5);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public View m4743(int i5) {
            return this.f4034.mLayout.findViewByPosition(i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m4744() {
            return this.f4034.mLayout.getChildCount();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public int m4745(View view) {
            return this.f4034.getChildLayoutPosition(view);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public p m4746() {
            return this.f4035;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public int m4747() {
            return this.f4033;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean m4748() {
            return this.f4036;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public boolean m4749() {
            return this.f4037;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        protected void m4750(PointF pointF) {
            float f5 = pointF.x;
            float f6 = pointF.y;
            float sqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        void m4751(int i5, int i6) {
            PointF mo4742;
            RecyclerView recyclerView = this.f4034;
            if (this.f4033 == -1 || recyclerView == null) {
                m4759();
            }
            if (this.f4036 && this.f4038 == null && this.f4035 != null && (mo4742 = mo4742(this.f4033)) != null) {
                float f5 = mo4742.x;
                if (f5 != 0.0f || mo4742.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f5), (int) Math.signum(mo4742.y), null);
                }
            }
            this.f4036 = false;
            View view = this.f4038;
            if (view != null) {
                if (m4745(view) == this.f4033) {
                    mo4756(this.f4038, recyclerView.mState, this.f4039);
                    this.f4039.m4763(recyclerView);
                    m4759();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f4038 = null;
                }
            }
            if (this.f4037) {
                mo4753(i5, i6, recyclerView.mState, this.f4039);
                boolean m4761 = this.f4039.m4761();
                this.f4039.m4763(recyclerView);
                if (m4761 && this.f4037) {
                    this.f4036 = true;
                    recyclerView.mViewFlinger.m4791();
                }
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        protected void m4752(View view) {
            if (m4745(view) == m4747()) {
                this.f4038 = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "smooth scroll target view has been attached");
                }
            }
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        protected abstract void mo4753(int i5, int i6, b0 b0Var, a aVar);

        /* renamed from: ˑ, reason: contains not printable characters */
        protected abstract void mo4754();

        /* renamed from: י, reason: contains not printable characters */
        protected abstract void mo4755();

        /* renamed from: ـ, reason: contains not printable characters */
        protected abstract void mo4756(View view, b0 b0Var, a aVar);

        /* renamed from: ٴ, reason: contains not printable characters */
        public void m4757(int i5) {
            this.f4033 = i5;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        void m4758(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.m4793();
            if (this.f4040) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4034 = recyclerView;
            this.f4035 = pVar;
            int i5 = this.f4033;
            if (i5 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f4049 = i5;
            this.f4037 = true;
            this.f4036 = true;
            this.f4038 = m4743(m4747());
            mo4754();
            this.f4034.mViewFlinger.m4791();
            this.f4040 = true;
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        protected final void m4759() {
            if (this.f4037) {
                this.f4037 = false;
                mo4755();
                this.f4034.mState.f4049 = -1;
                this.f4038 = null;
                this.f4033 = -1;
                this.f4036 = false;
                this.f4035.onSmoothScrollerStopped(this);
                this.f4035 = null;
                this.f4034 = null;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.mo4853();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static class b0 {

        /* renamed from: ʼ, reason: contains not printable characters */
        private SparseArray<Object> f4050;

        /* renamed from: ˑ, reason: contains not printable characters */
        int f4061;

        /* renamed from: י, reason: contains not printable characters */
        long f4062;

        /* renamed from: ـ, reason: contains not printable characters */
        int f4063;

        /* renamed from: ٴ, reason: contains not printable characters */
        int f4064;

        /* renamed from: ᐧ, reason: contains not printable characters */
        int f4065;

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4049 = -1;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f4051 = 0;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4052 = 0;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f4053 = 1;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f4054 = 0;

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean f4055 = false;

        /* renamed from: ˉ, reason: contains not printable characters */
        boolean f4056 = false;

        /* renamed from: ˊ, reason: contains not printable characters */
        boolean f4057 = false;

        /* renamed from: ˋ, reason: contains not printable characters */
        boolean f4058 = false;

        /* renamed from: ˎ, reason: contains not printable characters */
        boolean f4059 = false;

        /* renamed from: ˏ, reason: contains not printable characters */
        boolean f4060 = false;

        public String toString() {
            return "State{mTargetPosition=" + this.f4049 + ", mData=" + this.f4050 + ", mItemCount=" + this.f4054 + ", mIsMeasuring=" + this.f4058 + ", mPreviousLayoutItemCount=" + this.f4051 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4052 + ", mStructureChanged=" + this.f4055 + ", mInPreLayout=" + this.f4056 + ", mRunSimpleAnimations=" + this.f4059 + ", mRunPredictiveAnimations=" + this.f4060 + '}';
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4765(int i5) {
            if ((this.f4053 & i5) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i5) + " but it is " + Integer.toBinaryString(this.f4053));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m4766() {
            return this.f4056 ? this.f4051 - this.f4052 : this.f4054;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m4767() {
            return this.f4049;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean m4768() {
            return this.f4049 != -1;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean m4769() {
            return this.f4056;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        void m4770(h hVar) {
            this.f4053 = 1;
            this.f4054 = hVar.mo4807();
            this.f4056 = false;
            this.f4057 = false;
            this.f4058 = false;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean m4771() {
            return this.f4060;
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f6 = f5 - 1.0f;
            return (f6 * f6 * f6 * f6 * f6) + 1.0f;
        }
    }

    static class c0 extends l {
        c0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        /* renamed from: ʻ, reason: contains not printable characters */
        protected EdgeEffect mo4772(RecyclerView recyclerView, int i5) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    class d implements p.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4773(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(f0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.p.b
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4774(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.animateAppearance(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo4775(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.mRecycler.m4915(f0Var);
            RecyclerView.this.animateDisappearance(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo4776(f0 f0Var, m.c cVar, m.c cVar2) {
            f0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo4835(f0Var, f0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo4837(f0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    public static abstract class d0 {
    }

    class e implements b.InterfaceC0059b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ʻ, reason: contains not printable characters */
        public View mo4777(int i5) {
            return RecyclerView.this.getChildAt(i5);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4778(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ʽ, reason: contains not printable characters */
        public f0 mo4779(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo4780(int i5) {
            View mo4777 = mo4777(i5);
            if (mo4777 != null) {
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(mo4777);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.addFlags(256);
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No view at offset " + i5 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.detachViewFromParent(i5);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo4781(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ˆ, reason: contains not printable characters */
        public void mo4782(View view, int i5) {
            RecyclerView.this.addView(view, i5);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ˈ, reason: contains not printable characters */
        public int mo4783() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ˉ, reason: contains not printable characters */
        public void mo4784(int i5) {
            View childAt = RecyclerView.this.getChildAt(i5);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i5);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ˊ, reason: contains not printable characters */
        public void mo4785() {
            int mo4783 = mo4783();
            for (int i5 = 0; i5 < mo4783; i5++) {
                View mo4777 = mo4777(i5);
                RecyclerView.this.dispatchChildDetached(mo4777);
                mo4777.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ˋ, reason: contains not printable characters */
        public void mo4786(View view, int i5, ViewGroup.LayoutParams layoutParams) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.clearTmpDetachFlag();
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i5 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.attachViewToParent(view, i5, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0059b
        /* renamed from: ˎ, reason: contains not printable characters */
        public int mo4787(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    class e0 implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f4068;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f4069;

        /* renamed from: ˆ, reason: contains not printable characters */
        OverScroller f4070;

        /* renamed from: ˈ, reason: contains not printable characters */
        Interpolator f4071;

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f4072;

        /* renamed from: ˊ, reason: contains not printable characters */
        private boolean f4073;

        e0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f4071 = interpolator;
            this.f4072 = false;
            this.f4073 = false;
            this.f4070 = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private int m4788(int i5, int i6) {
            int abs = Math.abs(i5);
            int abs2 = Math.abs(i6);
            boolean z5 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z5) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m4789() {
            RecyclerView.this.removeCallbacks(this);
            f1.m2822(RecyclerView.this, this);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i5;
            int i6;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m4793();
                return;
            }
            this.f4073 = false;
            this.f4072 = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f4070;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i7 = currX - this.f4068;
                int i8 = currY - this.f4069;
                this.f4068 = currX;
                this.f4069 = currY;
                int consumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i7);
                int consumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i8);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i6 = iArr4[0];
                    i5 = iArr4[1];
                    consumeFlingInHorizontalStretch -= i6;
                    consumeFlingInVerticalStretch -= i5;
                    a0 a0Var = recyclerView4.mLayout.mSmoothScroller;
                    if (a0Var != null && !a0Var.m4748() && a0Var.m4749()) {
                        int m4766 = RecyclerView.this.mState.m4766();
                        if (m4766 == 0) {
                            a0Var.m4759();
                        } else if (a0Var.m4747() >= m4766) {
                            a0Var.m4757(m4766 - 1);
                            a0Var.m4751(i6, i5);
                        } else {
                            a0Var.m4751(i6, i5);
                        }
                    }
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i6, i5, consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i9 = consumeFlingInHorizontalStretch - iArr6[0];
                int i10 = consumeFlingInVerticalStretch - iArr6[1];
                if (i6 != 0 || i5 != 0) {
                    recyclerView6.dispatchOnScrolled(i6, i5);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i9 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i10 != 0));
                a0 a0Var2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((a0Var2 != null && a0Var2.m4748()) || !z5) {
                    m4791();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.mGapWorker;
                    if (eVar != null) {
                        eVar.m5138(recyclerView7, i6, i5);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i11 = i9 < 0 ? -currVelocity : i9 > 0 ? currVelocity : 0;
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i11, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m5142();
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (a0Var3 != null && a0Var3.m4748()) {
                a0Var3.m4751(0, 0);
            }
            this.f4072 = false;
            if (this.f4073) {
                m4789();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m4790(int i5, int i6) {
            RecyclerView.this.setScrollState(2);
            this.f4069 = 0;
            this.f4068 = 0;
            Interpolator interpolator = this.f4071;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f4071 = interpolator2;
                this.f4070 = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4070.fling(0, 0, i5, i6, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            m4791();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m4791() {
            if (this.f4072) {
                this.f4073 = true;
            } else {
                m4789();
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public void m4792(int i5, int i6, int i7, Interpolator interpolator) {
            if (i7 == Integer.MIN_VALUE) {
                i7 = m4788(i5, i6);
            }
            int i8 = i7;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f4071 != interpolator) {
                this.f4071 = interpolator;
                this.f4070 = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4069 = 0;
            this.f4068 = 0;
            RecyclerView.this.setScrollState(2);
            this.f4070.startScroll(0, 0, i5, i6, i8);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4070.computeScrollOffset();
            }
            m4791();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public void m4793() {
            RecyclerView.this.removeCallbacks(this);
            this.f4070.abortAnimation();
        }
    }

    class f implements a.InterfaceC0058a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4794(int i5, int i6) {
            RecyclerView.this.offsetPositionRecordsForMove(i5, i6);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4795(a.b bVar) {
            m4802(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ʽ, reason: contains not printable characters */
        public f0 mo4796(int i5) {
            f0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i5, true);
            if (findViewHolderForPosition == null) {
                return null;
            }
            if (!RecyclerView.this.mChildHelper.m5083(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo4797(int i5, int i6) {
            RecyclerView.this.offsetPositionRecordsForRemove(i5, i6, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo4798(int i5, int i6) {
            RecyclerView.this.offsetPositionRecordsForInsert(i5, i6);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ˆ, reason: contains not printable characters */
        public void mo4799(int i5, int i6) {
            RecyclerView.this.offsetPositionRecordsForRemove(i5, i6, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f4052 += i6;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ˈ, reason: contains not printable characters */
        public void mo4800(a.b bVar) {
            m4802(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0058a
        /* renamed from: ˉ, reason: contains not printable characters */
        public void mo4801(int i5, int i6, Object obj) {
            RecyclerView.this.viewRangeUpdate(i5, i6, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        void m4802(a.b bVar) {
            int i5 = bVar.f4186;
            if (i5 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f4187, bVar.f4189);
                return;
            }
            if (i5 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f4187, bVar.f4189);
            } else if (i5 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f4187, bVar.f4189, bVar.f4188);
            } else {
                if (i5 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f4187, bVar.f4189, 1);
            }
        }
    }

    public static abstract class f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends f0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        f0 mShadowedHolder = null;
        f0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public f0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i5) {
            this.mFlags = i5 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && f1.m2901(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i5, int i6, boolean z5) {
            addFlags(8);
            offsetPosition(i6, z5);
            this.mPosition = i5;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends f0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.m4806(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i5 = this.mPreLayoutPosition;
            return i5 == -1 ? this.mPosition : i5;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i5 = this.mPreLayoutPosition;
            return i5 == -1 ? this.mPosition : i5;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i5) {
            return (i5 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !f1.m2901(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i5, boolean z5) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z5) {
                this.mPreLayoutPosition += i5;
            }
            this.mPosition += i5;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f4103 = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i5 = this.mPendingAccessibilityState;
            if (i5 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i5;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = f1.m2807(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i5, int i6) {
            this.mFlags = (i5 & i6) | (this.mFlags & (i6 ^ (-1)));
        }

        public final void setIsRecyclable(boolean z5) {
            int i5 = this.mIsRecyclableCount;
            int i6 = z5 ? i5 - 1 : i5 + 1;
            this.mIsRecyclableCount = i6;
            if (i6 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z5 && i6 == 1) {
                this.mFlags |= 16;
            } else if (z5 && i6 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z5 + ":" + this);
            }
        }

        void setScrapContainer(w wVar, boolean z5) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z5;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.m4915(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static /* synthetic */ class g {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f4076;

        static {
            int[] iArr = new int[h.a.values().length];
            f4076 = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4076[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m4826() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m4827() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).mo4830();
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m4828(int i5, int i6) {
            m4829(i5, i6, null);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m4829(int i5, int i6, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).mo4832(i5, i6, obj);
            }
        }
    }

    public interface k {
    }

    public static class l {
        /* renamed from: ʻ */
        protected EdgeEffect mo4772(RecyclerView recyclerView, int i5) {
            throw null;
        }
    }

    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        /* renamed from: ʻ */
        public void mo4856(f0 f0Var) {
            f0Var.setIsRecyclable(true);
            if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                f0Var.mShadowedHolder = null;
            }
            f0Var.mShadowingHolder = null;
            if (f0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(f0Var.itemView) || !f0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.itemView, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i5, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).m4865(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class p {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.b mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.o mHorizontalBoundCheck;
        private final o.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        a0 mSmoothScroller;
        androidx.recyclerview.widget.o mVerticalBoundCheck;
        private final o.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        class a implements o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʻ, reason: contains not printable characters */
            public View mo4859(int i5) {
                return p.this.getChildAt(i5);
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʼ, reason: contains not printable characters */
            public int mo4860() {
                return p.this.getWidth() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʽ, reason: contains not printable characters */
            public int mo4861(View view) {
                return p.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʾ, reason: contains not printable characters */
            public int mo4862() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʿ, reason: contains not printable characters */
            public int mo4863(View view) {
                return p.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʻ */
            public View mo4859(int i5) {
                return p.this.getChildAt(i5);
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʼ */
            public int mo4860() {
                return p.this.getHeight() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʽ */
            public int mo4861(View view) {
                return p.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʾ */
            public int mo4862() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.o.b
            /* renamed from: ʿ */
            public int mo4863(View view) {
                return p.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            /* renamed from: ʻ, reason: contains not printable characters */
            void mo4864(int i5, int i6);
        }

        public static class d {

            /* renamed from: ʻ, reason: contains not printable characters */
            public int f4097;

            /* renamed from: ʼ, reason: contains not printable characters */
            public int f4098;

            /* renamed from: ʽ, reason: contains not printable characters */
            public boolean f4099;

            /* renamed from: ʾ, reason: contains not printable characters */
            public boolean f4100;
        }

        public p() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.o(aVar);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.o(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i5, boolean z5) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z5 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m5222(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m5235(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.m5074(view, i5, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int m5082 = this.mChildHelper.m5082(view);
                if (i5 == -1) {
                    i5 = this.mChildHelper.m5078();
                }
                if (m5082 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (m5082 != i5) {
                    this.mRecyclerView.mLayout.moveView(m5082, i5);
                }
            } else {
                this.mChildHelper.m5072(view, i5, false);
                qVar.f4103 = true;
                a0 a0Var = this.mSmoothScroller;
                if (a0Var != null && a0Var.m4749()) {
                    this.mSmoothScroller.m4752(view);
                }
            }
            if (qVar.f4104) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "consuming pending invalidate on child " + qVar.f4101);
                }
                childViewHolderInt.itemView.invalidate();
                qVar.f4104 = false;
            }
        }

        public static int chooseSize(int i5, int i6, int i7) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i6, i7) : size : Math.min(size, Math.max(i6, i7));
        }

        private void detachViewInternal(int i5, View view) {
            this.mChildHelper.m5075(i5);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = 0
                goto L21
            Lf:
                if (r3 < 0) goto L14
            L11:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top2 = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top2;
            int i5 = left - paddingLeft;
            int min = Math.min(0, i5);
            int i6 = top2 - paddingTop;
            int min2 = Math.min(0, i6);
            int i7 = width2 - width;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i5, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i7);
            }
            if (min2 == 0) {
                min2 = Math.min(i6, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i5, int i6) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0.c.f9092, i5, i6);
            dVar.f4097 = obtainStyledAttributes.getInt(m0.c.f9093, 1);
            dVar.f4098 = obtainStyledAttributes.getInt(m0.c.f9103, 1);
            dVar.f4099 = obtainStyledAttributes.getBoolean(m0.c.f9102, false);
            dVar.f4100 = obtainStyledAttributes.getBoolean(m0.c.f9104, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i5, int i6) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i5 < width && rect.right - i5 > paddingLeft && rect.top - i6 < height && rect.bottom - i6 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i5, int i6, int i7) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            if (i7 > 0 && i5 != i7) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i5;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i5;
            }
            return true;
        }

        private void scrapOrRecycleView(w wVar, int i5, View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.m4811()) {
                removeViewAt(i5);
                wVar.m4923(childViewHolderInt);
            } else {
                detachViewAt(i5);
                wVar.m4906(view);
                this.mRecyclerView.mViewInfoStore.m5231(childViewHolderInt);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i5, q qVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m5222(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m5235(childViewHolderInt);
            }
            this.mChildHelper.m5074(view, i5, qVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(q qVar) {
            return qVar != null;
        }

        public int computeHorizontalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollRange(b0 b0Var) {
            return 0;
        }

        public void detachAndScrapAttachedViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(wVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, w wVar) {
            scrapOrRecycleView(wVar, this.mChildHelper.m5082(view), view);
        }

        public void detachAndScrapViewAt(int i5, w wVar) {
            scrapOrRecycleView(wVar, i5, getChildAt(i5));
        }

        public void detachView(View view) {
            int m5082 = this.mChildHelper.m5082(view);
            if (m5082 >= 0) {
                detachViewInternal(m5082, view);
            }
        }

        public void detachViewAt(int i5) {
            detachViewInternal(i5, getChildAt(i5));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, wVar);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            m mVar = this.mRecyclerView.mItemAnimator;
            if (mVar != null) {
                mVar.mo4842(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.m5083(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i5) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i5 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.m4769() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f4102.bottom;
        }

        public View getChildAt(int i5) {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.m5077(i5);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.m5078();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((q) view.getLayoutParams()).f4102;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((q) view.getLayoutParams()).f4102;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.m5083(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo4807();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return f1.m2834(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f4102.left;
        }

        public int getMinimumHeight() {
            return f1.m2865(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return f1.m2863(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return f1.m2867(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return f1.m2871(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((q) view.getLayoutParams()).m4865();
        }

        public int getRightDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f4102.right;
        }

        public int getRowCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getSelectionModeForAccessibility(w wVar, b0 b0Var) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f4102.top;
        }

        public void getTransformedBoundingBox(View view, boolean z5, Rect rect) {
            Matrix matrix;
            if (z5) {
                Rect rect2 = ((q) view.getLayoutParams()).f4102;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i5).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.m5236(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(w wVar, b0 b0Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            a0 a0Var = this.mSmoothScroller;
            return a0Var != null && a0Var.m4749();
        }

        public boolean isViewPartiallyVisible(View view, boolean z5, boolean z6) {
            boolean z7 = this.mHorizontalBoundCheck.m5214(view, 24579) && this.mVerticalBoundCheck.m5214(view, 24579);
            return z5 ? z7 : !z7;
        }

        public void layoutDecorated(View view, int i5, int i6, int i7, int i8) {
            Rect rect = ((q) view.getLayoutParams()).f4102;
            view.layout(i5 + rect.left, i6 + rect.top, i7 - rect.right, i8 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i5, int i6, int i7, int i8) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f4102;
            view.layout(i5 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i6 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i7 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i8 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void measureChild(View view, int i5, int i6) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i7 = i5 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i8 = i6 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i7, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i8, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i5, int i6) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i7 = i5 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i8 = i6 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i7, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i5, int i6) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                detachViewAt(i5);
                attachView(childAt, i6);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i5 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i5) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i5);
            }
        }

        public void offsetChildrenVertical(int i5) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i5);
            }
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i5, int i6) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i5, w wVar, b0 b0Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(j0 j0Var) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, j0Var);
        }

        public void onInitializeAccessibilityNodeInfoForItem(w wVar, b0 b0Var, View view, j0 j0Var) {
        }

        public View onInterceptFocusSearch(View view, int i5) {
            return null;
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i5, int i6) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(w wVar, b0 b0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(w wVar, b0 b0Var, int i5, int i6) {
            this.mRecyclerView.defaultOnMeasure(i5, i6);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        void onSmoothScrollerStopped(a0 a0Var) {
            if (this.mSmoothScroller == a0Var) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i5, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i5, bundle);
        }

        public boolean performAccessibilityActionForItem(w wVar, b0 b0Var, View view, int i5, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                f1.m2822(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.m5086(childCount);
            }
        }

        public void removeAndRecycleAllViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, wVar);
                }
            }
        }

        void removeAndRecycleScrapInt(w wVar) {
            int m4912 = wVar.m4912();
            for (int i5 = m4912 - 1; i5 >= 0; i5--) {
                View m4920 = wVar.m4920(i5);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(m4920);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(m4920, false);
                    }
                    m mVar = this.mRecyclerView.mItemAnimator;
                    if (mVar != null) {
                        mVar.mo4842(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.m4900(m4920);
                }
            }
            wVar.m4903();
            if (m4912 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, w wVar) {
            removeView(view);
            wVar.m4902(view);
        }

        public void removeAndRecycleViewAt(int i5, w wVar) {
            View childAt = getChildAt(i5);
            removeViewAt(i5);
            wVar.m4902(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.mChildHelper.m5085(view);
        }

        public void removeViewAt(int i5) {
            if (getChildAt(i5) != null) {
                this.mChildHelper.m5086(i5);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z5, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i5, w wVar, b0 b0Var) {
            return 0;
        }

        public void scrollToPosition(int i5) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i5, w wVar, b0 b0Var) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z5) {
            this.mAutoMeasure = z5;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z5) {
            if (z5 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z5;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m4919();
                }
            }
        }

        void setMeasureSpecs(int i5, int i6) {
            this.mWidth = View.MeasureSpec.getSize(i5);
            int mode = View.MeasureSpec.getMode(i5);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i6);
            int mode2 = View.MeasureSpec.getMode(i6);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i5, int i6) {
            setMeasuredDimension(chooseSize(i5, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i6, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i5, int i6) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i5, i6);
                return;
            }
            int i7 = RecyclerView.UNDEFINED_DURATION;
            int i8 = RecyclerView.UNDEFINED_DURATION;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i12 = rect.left;
                if (i12 < i9) {
                    i9 = i12;
                }
                int i13 = rect.right;
                if (i13 > i7) {
                    i7 = i13;
                }
                int i14 = rect.top;
                if (i14 < i10) {
                    i10 = i14;
                }
                int i15 = rect.bottom;
                if (i15 > i8) {
                    i8 = i15;
                }
            }
            this.mRecyclerView.mTempRect.set(i9, i10, i7, i8);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i5, i6);
        }

        public void setMeasurementCacheEnabled(boolean z5) {
            this.mMeasurementCacheEnabled = z5;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i5, int i6, q qVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i5, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view.getHeight(), i6, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i5, int i6, q qVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i5, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i6, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, b0 b0Var, int i5) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(a0 a0Var) {
            a0 a0Var2 = this.mSmoothScroller;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.m4749()) {
                this.mSmoothScroller.m4759();
            }
            this.mSmoothScroller = a0Var;
            a0Var.m4758(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            a0 a0Var = this.mSmoothScroller;
            if (a0Var != null) {
                a0Var.m4759();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i5) {
            addViewInt(view, i5, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i5) {
            addViewInt(view, i5, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z5 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z5 = false;
            }
            accessibilityEvent.setScrollable(z5);
            h hVar = this.mRecyclerView.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.mo4807());
            }
        }

        public void onInitializeAccessibilityNodeInfo(w wVar, b0 b0Var, j0 j0Var) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                j0Var.m2636(8192);
                j0Var.m2663(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                j0Var.m2636(4096);
                j0Var.m2663(true);
            }
            j0Var.m2643(j0.b.m2710(getRowCountForAccessibility(wVar, b0Var), getColumnCountForAccessibility(wVar, b0Var), isLayoutHierarchical(wVar, b0Var), getSelectionModeForAccessibility(wVar, b0Var)));
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, j0 j0Var) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.m5083(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, j0Var);
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i5, int i6, Object obj) {
            onItemsUpdated(recyclerView, i5, i6);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(w wVar, b0 b0Var, int i5, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i6;
            int i7;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i5 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i6 = paddingTop;
                    i7 = paddingLeft;
                }
                i6 = paddingTop;
                i7 = 0;
            } else if (i5 != 8192) {
                i7 = 0;
                i6 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i6 = paddingTop;
                    i7 = paddingLeft;
                }
                i6 = paddingTop;
                i7 = 0;
            }
            if (i6 == 0 && i7 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i7, i6, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        boolean performAccessibilityActionForItem(View view, int i5, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i5, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i5 = childRectangleOnScreenScrollAmount[0];
            int i6 = childRectangleOnScreenScrollAmount[1];
            if ((z6 && !isFocusedChildVisibleAfterScrolling(recyclerView, i5, i6)) || (i5 == 0 && i6 == 0)) {
                return false;
            }
            if (z5) {
                recyclerView.scrollBy(i5, i6);
            } else {
                recyclerView.smoothScrollBy(i5, i6);
            }
            return true;
        }

        public static int getChildMeasureSpec(int i5, int i6, int i7, int i8, boolean z5) {
            int max = Math.max(0, i5 - i7);
            if (z5) {
                if (i8 < 0) {
                    if (i8 != -1 || (i6 != Integer.MIN_VALUE && (i6 == 0 || i6 != 1073741824))) {
                        i6 = 0;
                        i8 = 0;
                    } else {
                        i8 = max;
                    }
                }
                i6 = 1073741824;
            } else {
                if (i8 < 0) {
                    if (i8 != -1) {
                        if (i8 == -2) {
                            i6 = (i6 == Integer.MIN_VALUE || i6 == 1073741824) ? RecyclerView.UNDEFINED_DURATION : 0;
                        }
                        i6 = 0;
                        i8 = 0;
                    }
                    i8 = max;
                }
                i6 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i8, i6);
        }

        public void attachView(View view, int i5) {
            attachView(view, i5, (q) view.getLayoutParams());
        }

        @SuppressLint({"UnknownNullness"})
        public q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void setMeasuredDimension(int i5, int i6) {
            this.mRecyclerView.setMeasuredDimension(i5, i6);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(b0 b0Var) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i5) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i5, c cVar) {
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        public void onItemsAdded(RecyclerView recyclerView, int i5, int i6) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i5, int i6) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i5, int i6, b0 b0Var, c cVar) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i5, int i6, int i7) {
        }
    }

    public interface r {
        /* renamed from: ʻ, reason: contains not printable characters */
        void m4869(View view);

        /* renamed from: ʼ, reason: contains not printable characters */
        void m4870(View view);
    }

    public static abstract class s {
        public abstract boolean onFling(int i5, int i6);
    }

    public interface t {
        /* renamed from: ʻ, reason: contains not printable characters */
        boolean mo4871(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: ʼ, reason: contains not printable characters */
        void mo4872(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: ʽ, reason: contains not printable characters */
        void mo4873(boolean z5);
    }

    public static class v {

        /* renamed from: ʻ, reason: contains not printable characters */
        SparseArray<a> f4105 = new SparseArray<>();

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4106 = 0;

        /* renamed from: ʽ, reason: contains not printable characters */
        Set<h<?>> f4107 = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: ʻ, reason: contains not printable characters */
            final ArrayList<f0> f4108 = new ArrayList<>();

            /* renamed from: ʼ, reason: contains not printable characters */
            int f4109 = 5;

            /* renamed from: ʽ, reason: contains not printable characters */
            long f4110 = 0;

            /* renamed from: ʾ, reason: contains not printable characters */
            long f4111 = 0;

            a() {
            }
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private a m4876(int i5) {
            a aVar = this.f4105.get(i5);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4105.put(i5, aVar2);
            return aVar2;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4877() {
            this.f4106++;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m4878(h<?> hVar) {
            this.f4107.add(hVar);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m4879() {
            for (int i5 = 0; i5 < this.f4105.size(); i5++) {
                a valueAt = this.f4105.valueAt(i5);
                Iterator<f0> it = valueAt.f4108.iterator();
                while (it.hasNext()) {
                    z.a.m13101(it.next().itemView);
                }
                valueAt.f4108.clear();
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m4880() {
            this.f4106--;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m4881(h<?> hVar, boolean z5) {
            this.f4107.remove(hVar);
            if (this.f4107.size() != 0 || z5) {
                return;
            }
            for (int i5 = 0; i5 < this.f4105.size(); i5++) {
                SparseArray<a> sparseArray = this.f4105;
                ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i5)).f4108;
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    z.a.m13101(arrayList.get(i6).itemView);
                }
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        void m4882(int i5, long j5) {
            a m4876 = m4876(i5);
            m4876.f4111 = m4887(m4876.f4111, j5);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        void m4883(int i5, long j5) {
            a m4876 = m4876(i5);
            m4876.f4110 = m4887(m4876.f4110, j5);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public f0 m4884(int i5) {
            a aVar = this.f4105.get(i5);
            if (aVar == null || aVar.f4108.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.f4108;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        void m4885(h<?> hVar, h<?> hVar2, boolean z5) {
            if (hVar != null) {
                m4880();
            }
            if (!z5 && this.f4106 == 0) {
                m4879();
            }
            if (hVar2 != null) {
                m4877();
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public void m4886(f0 f0Var) {
            int itemViewType = f0Var.getItemViewType();
            ArrayList<f0> arrayList = m4876(itemViewType).f4108;
            if (this.f4105.get(itemViewType).f4109 <= arrayList.size()) {
                z.a.m13101(f0Var.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(f0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f0Var.resetInternal();
                arrayList.add(f0Var);
            }
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        long m4887(long j5, long j6) {
            return j5 == 0 ? j6 : ((j5 / 4) * 3) + (j6 / 4);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        boolean m4888(int i5, long j5, long j6) {
            long j7 = m4876(i5).f4111;
            return j7 == 0 || j5 + j7 < j6;
        }

        /* renamed from: י, reason: contains not printable characters */
        boolean m4889(int i5, long j5, long j6) {
            long j7 = m4876(i5).f4110;
            return j7 == 0 || j5 + j7 < j6;
        }
    }

    public interface x {
        /* renamed from: ʻ, reason: contains not printable characters */
        void m4934(f0 f0Var);
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        /* renamed from: ʻ */
        public void mo4830() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f4055 = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.m5062()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        /* renamed from: ʽ */
        public void mo4832(int i5, int i6, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m5064(i5, i6, obj)) {
                m4935();
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m4935() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    f1.m2822(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i5 == 19 || i5 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i5 >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = i5 >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
        sDefaultEdgeEffectFactory = new c0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(f0 f0Var) {
        View view = f0Var.itemView;
        boolean z5 = view.getParent() == this;
        this.mRecycler.m4915(getChildViewHolder(view));
        if (f0Var.isTmpDetached()) {
            this.mChildHelper.m5074(view, -1, view.getLayoutParams(), true);
        } else if (z5) {
            this.mChildHelper.m5081(view);
        } else {
            this.mChildHelper.m5073(view, true);
        }
    }

    private void animateChange(f0 f0Var, f0 f0Var2, m.c cVar, m.c cVar2, boolean z5, boolean z6) {
        f0Var.setIsRecyclable(false);
        if (z5) {
            addAnimatingView(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z6) {
                addAnimatingView(f0Var2);
            }
            f0Var.mShadowedHolder = f0Var2;
            addAnimatingView(f0Var);
            this.mRecycler.m4915(f0Var);
            f0Var2.setIsRecyclable(false);
            f0Var2.mShadowingHolder = f0Var;
        }
        if (this.mItemAnimator.mo4835(f0Var, f0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i5, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i6) {
        if (i5 > 0 && edgeEffect != null && androidx.core.widget.l.m3630(edgeEffect) != 0.0f) {
            int round = Math.round(((-i6) / FLING_DESTRETCH_FACTOR) * androidx.core.widget.l.m3632(edgeEffect, ((-i5) * FLING_DESTRETCH_FACTOR) / i6, 0.5f));
            if (round != i5) {
                edgeEffect.finish();
            }
            return i5 - round;
        }
        if (i5 >= 0 || edgeEffect2 == null || androidx.core.widget.l.m3630(edgeEffect2) == 0.0f) {
            return i5;
        }
        float f5 = i6;
        int round2 = Math.round((f5 / FLING_DESTRETCH_FACTOR) * androidx.core.widget.l.m3632(edgeEffect2, (i5 * FLING_DESTRETCH_FACTOR) / f5, 0.5f));
        if (round2 != i5) {
            edgeEffect2.finish();
        }
        return i5 - round2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i5, int i6) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i5), Integer.valueOf(i6)};
                } catch (NoSuchMethodException e5) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e6) {
                        e6.initCause(e5);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e6);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e7);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e8);
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e9);
            } catch (InstantiationException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e11);
            }
        }
    }

    private boolean didChildRangeChange(int i5, int i6) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i5 && iArr[1] == i6) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i5 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i5 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        androidx.core.view.accessibility.b.m2598(obtain, i5);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.m4765(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f4058 = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m5226();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        b0 b0Var = this.mState;
        b0Var.f4057 = b0Var.f4059 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var.f4056 = b0Var.f4060;
        b0Var.f4054 = this.mAdapter.mo4807();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f4059) {
            int m5078 = this.mChildHelper.m5078();
            for (int i5 = 0; i5 < m5078; i5++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5077(i5));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.m4811())) {
                    this.mViewInfoStore.m5225(childViewHolderInt, this.mItemAnimator.m4852(this.mState, childViewHolderInt, m.m4833(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f4057 && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m5223(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f4060) {
            saveOldPositions();
            b0 b0Var2 = this.mState;
            boolean z5 = b0Var2.f4055;
            b0Var2.f4055 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, b0Var2);
            this.mState.f4055 = z5;
            for (int i6 = 0; i6 < this.mChildHelper.m5078(); i6++) {
                f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m5077(i6));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m5229(childViewHolderInt2)) {
                    int m4833 = m.m4833(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        m4833 |= 4096;
                    }
                    m.c m4852 = this.mItemAnimator.m4852(this.mState, childViewHolderInt2, m4833, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, m4852);
                    } else {
                        this.mViewInfoStore.m5221(childViewHolderInt2, m4852);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f4053 = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m4765(6);
        this.mAdapterHelper.m5057();
        this.mState.f4054 = this.mAdapter.mo4807();
        this.mState.f4052 = 0;
        if (this.mPendingSavedState != null && this.mAdapter.m4804()) {
            Parcelable parcelable = this.mPendingSavedState.f4121;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        b0 b0Var = this.mState;
        b0Var.f4056 = false;
        this.mLayout.onLayoutChildren(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.f4055 = false;
        b0Var2.f4059 = b0Var2.f4059 && this.mItemAnimator != null;
        b0Var2.f4053 = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m4765(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        b0 b0Var = this.mState;
        b0Var.f4053 = 1;
        if (b0Var.f4059) {
            for (int m5078 = this.mChildHelper.m5078() - 1; m5078 >= 0; m5078--) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5077(m5078));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.c m4851 = this.mItemAnimator.m4851(this.mState, childViewHolderInt);
                    f0 m5227 = this.mViewInfoStore.m5227(changedHolderKey);
                    if (m5227 == null || m5227.shouldIgnore()) {
                        this.mViewInfoStore.m5224(childViewHolderInt, m4851);
                    } else {
                        boolean m5228 = this.mViewInfoStore.m5228(m5227);
                        boolean m52282 = this.mViewInfoStore.m5228(childViewHolderInt);
                        if (m5228 && m5227 == childViewHolderInt) {
                            this.mViewInfoStore.m5224(childViewHolderInt, m4851);
                        } else {
                            m.c m5233 = this.mViewInfoStore.m5233(m5227);
                            this.mViewInfoStore.m5224(childViewHolderInt, m4851);
                            m.c m5232 = this.mViewInfoStore.m5232(childViewHolderInt);
                            if (m5233 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, m5227);
                            } else {
                                animateChange(m5227, childViewHolderInt, m5233, m5232, m5228, m52282);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.m5234(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        b0 b0Var2 = this.mState;
        b0Var2.f4051 = b0Var2.f4054;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        b0Var2.f4059 = false;
        b0Var2.f4060 = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<f0> arrayList = this.mRecycler.f4113;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.mLayout;
        if (pVar.mPrefetchMaxObservedInInitialPrefetch) {
            pVar.mPrefetchMaxCountObserved = 0;
            pVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m4919();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m5226();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.mo4872(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i5 = 0; i5 < size; i5++) {
            t tVar = this.mOnItemTouchListeners.get(i5);
            if (tVar.mo4871(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int m5078 = this.mChildHelper.m5078();
        if (m5078 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i5 = Integer.MAX_VALUE;
        int i6 = UNDEFINED_DURATION;
        for (int i7 = 0; i7 < m5078; i7++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5077(i7));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i5) {
                    i5 = layoutPosition;
                }
                if (layoutPosition > i6) {
                    i6 = layoutPosition;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i5));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        f0 findViewHolderForAdapterPosition;
        b0 b0Var = this.mState;
        int i5 = b0Var.f4061;
        if (i5 == -1) {
            i5 = 0;
        }
        int m4766 = b0Var.m4766();
        for (int i6 = i5; i6 < m4766; i6++) {
            f0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i6);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(m4766, i5);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    static f0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f4101;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f4102;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private p0 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new p0(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i5) {
        double log = Math.log((Math.abs(i5) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f5 = DECELERATION_RATE;
        double d6 = f5;
        Double.isNaN(d6);
        double d7 = this.mPhysicalCoef * SCROLL_FRICTION;
        double d8 = f5;
        Double.isNaN(d8);
        double exp = Math.exp((d8 / (d6 - 1.0d)) * log);
        Double.isNaN(d7);
        return (float) (d7 * exp);
    }

    private void handleMissingPreInfoForChangeError(long j5, f0 f0Var, f0 f0Var2) {
        int m5078 = this.mChildHelper.m5078();
        for (int i5 = 0; i5 < m5078; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5077(i5));
            if (childViewHolderInt != f0Var && getChangedHolderKey(childViewHolderInt) == j5) {
                h hVar = this.mAdapter;
                if (hVar == null || !hVar.m4811()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int m5078 = this.mChildHelper.m5078();
        for (int i5 = 0; i5 < m5078; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5077(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (f1.m2861(this) == 0) {
            f1.m2844(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i5) {
        int i6;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c6 = 65535;
        int i7 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i8 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i9 = rect2.left;
        if ((i8 < i9 || rect.right <= i9) && rect.right < rect2.right) {
            i6 = 1;
        } else {
            int i10 = rect.right;
            int i11 = rect2.right;
            i6 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? -1 : 0;
        }
        int i12 = rect.top;
        int i13 = rect2.top;
        if ((i12 < i13 || rect.bottom <= i13) && rect.bottom < rect2.bottom) {
            c6 = 1;
        } else {
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if ((i14 <= i15 && i12 < i15) || i12 <= i13) {
                c6 = 0;
            }
        }
        if (i5 == 1) {
            return c6 < 0 || (c6 == 0 && i6 * i7 < 0);
        }
        if (i5 == 2) {
            return c6 > 0 || (c6 == 0 && i6 * i7 > 0);
        }
        if (i5 == 17) {
            return i6 < 0;
        }
        if (i5 == 33) {
            return c6 < 0;
        }
        if (i5 == 66) {
            return i6 > 0;
        }
        if (i5 == 130) {
            return c6 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i5 + exceptionLabel());
    }

    private void nestedScrollByInternal(int i5, int i6, MotionEvent motionEvent, int i7) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i8 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int releaseHorizontalGlow = i5 - releaseHorizontalGlow(i5, height);
        int releaseVerticalGlow = i6 - releaseVerticalGlow(i6, width);
        startNestedScroll(i8, i7);
        if (dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i7)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, i7);
        androidx.recyclerview.widget.e eVar = this.mGapWorker;
        if (eVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            eVar.m5138(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i7);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i5);
            int x5 = (int) (motionEvent.getX(i5) + 0.5f);
            this.mLastTouchX = x5;
            this.mInitialTouchX = x5;
            int y5 = (int) (motionEvent.getY(i5) + 0.5f);
            this.mLastTouchY = y5;
            this.mInitialTouchY = y5;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z5;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m5067();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m5065();
        } else {
            this.mAdapterHelper.m5057();
        }
        boolean z6 = false;
        boolean z7 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f4059 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z5 = this.mDataSetHasChangedAfterLayout) || z7 || this.mLayout.mRequestedSimpleAnimations) && (!z5 || this.mAdapter.m4811());
        b0 b0Var = this.mState;
        if (b0Var.f4059 && z7 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z6 = true;
        }
        b0Var.f4060 = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.l.m3632(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.l.m3632(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.l.m3632(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.l.m3632(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.f1.m2821(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.m5083(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m5078() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        f0 findViewHolderForItemId = (this.mState.f4062 == -1 || !this.mAdapter.m4811()) ? null : findViewHolderForItemId(this.mState.f4062);
        if (findViewHolderForItemId != null && !this.mChildHelper.m5083(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.m5078() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i5 = this.mState.f4063;
            if (i5 != -1 && (findViewById = view.findViewById(i5)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z5;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = this.mLeftGlow.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z5 |= this.mBottomGlow.isFinished();
        }
        if (z5) {
            f1.m2821(this);
        }
    }

    private int releaseHorizontalGlow(int i5, float f5) {
        float height = f5 / getHeight();
        float width = i5 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f6 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.l.m3630(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.l.m3630(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float m3632 = androidx.core.widget.l.m3632(this.mRightGlow, width, height);
                    if (androidx.core.widget.l.m3630(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f6 = m3632;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f7 = -androidx.core.widget.l.m3632(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.l.m3630(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f6 = f7;
            }
            invalidate();
        }
        return Math.round(f6 * getWidth());
    }

    private int releaseVerticalGlow(int i5, float f5) {
        float width = f5 / getWidth();
        float height = i5 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f6 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.l.m3630(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.l.m3630(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float m3632 = androidx.core.widget.l.m3632(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.l.m3630(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f6 = m3632;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f7 = -androidx.core.widget.l.m3632(this.mTopGlow, -height, width);
                if (androidx.core.widget.l.m3630(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f6 = f7;
            }
            invalidate();
        }
        return Math.round(f6 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f4103) {
                Rect rect = qVar.f4102;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        b0 b0Var = this.mState;
        b0Var.f4062 = -1L;
        b0Var.f4061 = -1;
        b0Var.f4063 = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        f0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f4062 = this.mAdapter.m4811() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.f4061 = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f4063 = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(h<?> hVar, boolean z5, boolean z6) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.m4825(this.mObserver);
            this.mAdapter.m4818(this);
        }
        if (!z5 || z6) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m5067();
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.m4823(this.mObserver);
            hVar.m4814(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onAdapterChanged(hVar3, this.mAdapter);
        }
        this.mRecycler.m4932(hVar3, this.mAdapter, z5);
        this.mState.f4055 = true;
    }

    public static void setDebugAssertionsEnabled(boolean z5) {
        sDebugAssertionsEnabled = z5;
    }

    public static void setVerboseLoggingEnabled(boolean z5) {
        sVerboseLoggingEnabled = z5;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i5, int i6) {
        if (i5 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i5) < androidx.core.widget.l.m3630(edgeEffect) * ((float) i6);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.l.m3630(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z5 = false;
        } else {
            androidx.core.widget.l.m3632(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z5 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.l.m3630(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.l.m3632(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z5 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.l.m3630(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.l.m3632(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.l.m3630(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z5;
        }
        androidx.core.widget.l.m3632(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m4793();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.stopSmoothScroller();
        }
    }

    void absorbGlows(int i5, int i6) {
        if (i5 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i5);
            }
        }
        if (i6 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i6);
            }
        } else if (i6 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i6);
            }
        }
        if (i5 == 0 && i6 == 0) {
            return;
        }
        f1.m2821(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i6) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.onAddFocusables(this, arrayList, i5, i6)) {
            super.addFocusables(arrayList, i5, i6);
        }
    }

    public void addItemDecoration(o oVar, int i5) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i5 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i5, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        androidx.core.util.h.m2578(xVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    void animateAppearance(f0 f0Var, m.c cVar, m.c cVar2) {
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.mo4834(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(f0 f0Var, m.c cVar, m.c cVar2) {
        addAnimatingView(f0Var);
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.mo4836(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(f0 f0Var) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.mo4839(f0Var, f0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.checkLayoutParams((q) layoutParams);
    }

    void clearOldPositions() {
        int m5080 = this.mChildHelper.m5080();
        for (int i5 = 0; i5 < m5080; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i5));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m4901();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i5, int i6) {
        boolean z5;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i5 <= 0) {
            z5 = false;
        } else {
            this.mLeftGlow.onRelease();
            z5 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i5 < 0) {
            this.mRightGlow.onRelease();
            z5 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i6 > 0) {
            this.mTopGlow.onRelease();
            z5 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i6 < 0) {
            this.mBottomGlow.onRelease();
            z5 |= this.mBottomGlow.isFinished();
        }
        if (z5) {
            f1.m2821(this);
        }
    }

    int consumeFlingInHorizontalStretch(int i5) {
        return consumeFlingInStretch(i5, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i5) {
        return consumeFlingInStretch(i5, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.t.m2443(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            androidx.core.os.t.m2444();
            return;
        }
        if (this.mAdapterHelper.m5062()) {
            if (!this.mAdapterHelper.m5061(4) || this.mAdapterHelper.m5061(11)) {
                if (this.mAdapterHelper.m5062()) {
                    androidx.core.os.t.m2443(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    androidx.core.os.t.m2444();
                    return;
                }
                return;
            }
            androidx.core.os.t.m2443(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m5065();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.m5056();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            androidx.core.os.t.m2444();
        }
    }

    void defaultOnMeasure(int i5, int i6) {
        setMeasuredDimension(p.chooseSize(i5, getPaddingLeft() + getPaddingRight(), f1.m2863(this)), p.chooseSize(i6, getPaddingTop() + getPaddingBottom(), f1.m2865(this)));
    }

    void dispatchChildAttached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.m4820(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m4869(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.m4821(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m4870(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f4058 = false;
        boolean z5 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f4053 == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.m5063() || z5 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f6, boolean z5) {
        return getScrollingChildHelper().m3247(f5, f6, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return getScrollingChildHelper().m3248(f5, f6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3249(i5, i6, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return getScrollingChildHelper().m3252(i5, i6, i7, i8, iArr);
    }

    void dispatchOnScrollStateChanged(int i5) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onScrollStateChanged(i5);
        }
        onScrollStateChanged(i5);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.mo4874(this, i5);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo4874(this, i5);
            }
        }
    }

    void dispatchOnScrolled(int i5, int i6) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i5, scrollY - i6);
        onScrolled(i5, i6);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.mo4875(this, i5, i6);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo4875(this, i5, i6);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i5;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            f0 f0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i5 = f0Var.mPendingAccessibilityState) != -1) {
                f1.m2843(f0Var.itemView, i5);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z5;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z6 = false;
        for (int i5 = 0; i5 < size; i5++) {
            this.mItemDecorations.get(i5).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z5 |= z6;
            canvas.restoreToCount(save4);
        }
        if ((z5 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo4848()) ? z5 : true) {
            f1.m2821(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j5) {
        return super.drawChild(canvas, view, j5);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect mo4772 = this.mEdgeEffectFactory.mo4772(this, 3);
        this.mBottomGlow = mo4772;
        if (this.mClipToPadding) {
            mo4772.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            mo4772.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect mo4772 = this.mEdgeEffectFactory.mo4772(this, 0);
        this.mLeftGlow = mo4772;
        if (this.mClipToPadding) {
            mo4772.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            mo4772.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect mo4772 = this.mEdgeEffectFactory.mo4772(this, 2);
        this.mRightGlow = mo4772;
        if (this.mClipToPadding) {
            mo4772.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            mo4772.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect mo4772 = this.mEdgeEffectFactory.mo4772(this, 1);
        this.mTopGlow = mo4772;
        if (this.mClipToPadding) {
            mo4772.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            mo4772.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.f4064 = 0;
            b0Var.f4065 = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f4070;
            b0Var.f4064 = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f4065 = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View findChildViewUnder(float f5, float f6) {
        for (int m5078 = this.mChildHelper.m5078() - 1; m5078 >= 0; m5078--) {
            View m5077 = this.mChildHelper.m5077(m5078);
            float translationX = m5077.getTranslationX();
            float translationY = m5077.getTranslationY();
            if (f5 >= m5077.getLeft() + translationX && f5 <= m5077.getRight() + translationX && f6 >= m5077.getTop() + translationY && f6 <= m5077.getBottom() + translationY) {
                return m5077;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public f0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public f0 findViewHolderForAdapterPosition(int i5) {
        f0 f0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int m5080 = this.mChildHelper.m5080();
        for (int i6 = 0; i6 < m5080; i6++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i6));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i5) {
                if (!this.mChildHelper.m5083(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                f0Var = childViewHolderInt;
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForItemId(long j5) {
        h hVar = this.mAdapter;
        f0 f0Var = null;
        if (hVar != null && hVar.m4811()) {
            int m5080 = this.mChildHelper.m5080();
            for (int i5 = 0; i5 < m5080; i5++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i5));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j5) {
                    if (!this.mChildHelper.m5083(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f0Var = childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForLayoutPosition(int i5) {
        return findViewHolderForPosition(i5, false);
    }

    @Deprecated
    public f0 findViewHolderForPosition(int i5) {
        return findViewHolderForPosition(i5, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i5, int i6) {
        int i7;
        int i8;
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally == 0 || Math.abs(i5) < this.mMinFlingVelocity) {
            i5 = 0;
        }
        if (!canScrollVertically || Math.abs(i6) < this.mMinFlingVelocity) {
            i6 = 0;
        }
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        if (i5 == 0) {
            i7 = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || androidx.core.widget.l.m3630(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && androidx.core.widget.l.m3630(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i5, getWidth())) {
                        this.mRightGlow.onAbsorb(i5);
                        i5 = 0;
                    }
                    i7 = i5;
                    i5 = 0;
                }
                i7 = 0;
            } else {
                int i9 = -i5;
                if (shouldAbsorb(this.mLeftGlow, i9, getWidth())) {
                    this.mLeftGlow.onAbsorb(i9);
                    i5 = 0;
                }
                i7 = i5;
                i5 = 0;
            }
        }
        if (i6 == 0) {
            i8 = i6;
            i6 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || androidx.core.widget.l.m3630(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && androidx.core.widget.l.m3630(edgeEffect4) != 0.0f) {
                    if (shouldAbsorb(this.mBottomGlow, i6, getHeight())) {
                        this.mBottomGlow.onAbsorb(i6);
                        i6 = 0;
                    }
                    i8 = 0;
                }
                i8 = i6;
                i6 = 0;
            } else {
                int i10 = -i6;
                if (shouldAbsorb(this.mTopGlow, i10, getHeight())) {
                    this.mTopGlow.onAbsorb(i10);
                    i6 = 0;
                }
                i8 = 0;
            }
        }
        if (i7 != 0 || i6 != 0) {
            int i11 = this.mMaxFlingVelocity;
            i7 = Math.max(-i11, Math.min(i7, i11));
            int i12 = this.mMaxFlingVelocity;
            i6 = Math.max(-i12, Math.min(i6, i12));
            this.mViewFlinger.m4790(i7, i6);
        }
        if (i5 == 0 && i8 == 0) {
            return (i7 == 0 && i6 == 0) ? false : true;
        }
        float f5 = i5;
        float f6 = i8;
        if (!dispatchNestedPreFling(f5, f6)) {
            boolean z5 = canScrollHorizontally != 0 || canScrollVertically;
            dispatchNestedFling(f5, f6, z5);
            s sVar = this.mOnFlingListener;
            if (sVar != null && sVar.onFling(i5, i8)) {
                return true;
            }
            if (z5) {
                if (canScrollVertically) {
                    canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(canScrollHorizontally, 1);
                int i13 = this.mMaxFlingVelocity;
                int max = Math.max(-i13, Math.min(i5, i13));
                int i14 = this.mMaxFlingVelocity;
                this.mViewFlinger.m4790(max, Math.max(-i14, Math.min(i8, i14)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i5) {
        View view2;
        boolean z5;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i5);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z6 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z6 && (i5 == 2 || i5 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i6 = i5 == 2 ? 130 : 33;
                z5 = focusFinder.findNextFocus(this, view, i6) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i5 = i6;
                }
            } else {
                z5 = false;
            }
            if (!z5 && this.mLayout.canScrollHorizontally()) {
                int i7 = (this.mLayout.getLayoutDirection() == 1) ^ (i5 == 2) ? 66 : 17;
                boolean z7 = focusFinder.findNextFocus(this, view, i7) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i5 = i7;
                }
                z5 = z7;
            }
            if (z5) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i5, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i5);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i5);
            if (findNextFocus == null && z6) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i5, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i5) ? view2 : super.focusSearch(view, i5);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i5);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(f0 f0Var) {
        if (f0Var.hasAnyOfTheFlags(524) || !f0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.m5055(f0Var.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        return pVar != null ? pVar.getBaseline() : super.getBaseline();
    }

    long getChangedHolderKey(f0 f0Var) {
        return this.mAdapter.m4811() ? f0Var.getItemId() : f0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        return super.getChildDrawingOrder(i5, i6);
    }

    public long getChildItemId(View view) {
        f0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.m4811() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public f0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f4103) {
            return qVar.f4102;
        }
        if (this.mState.m4769() && (qVar.m4866() || qVar.m4868())) {
            return qVar.f4102;
        }
        Rect rect = qVar.f4102;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i5).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i6 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i6 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f4103 = false;
        return rect;
    }

    public o getItemDecorationAt(int i5) {
        int itemDecorationCount = getItemDecorationCount();
        if (i5 >= 0 && i5 < itemDecorationCount) {
            return this.mItemDecorations.get(i5);
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.m4911();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m3254();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m5062();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(m0.b.f9089), resources.getDimensionPixelSize(m0.b.f9091), resources.getDimensionPixelOffset(m0.b.f9090));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.mo4848();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.o0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m3256();
    }

    void jumpToPositionForSmoothScroller(int i5) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i5);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int m5080 = this.mChildHelper.m5080();
        for (int i5 = 0; i5 < m5080; i5++) {
            ((q) this.mChildHelper.m5079(i5).getLayoutParams()).f4103 = true;
        }
        this.mRecycler.m4926();
    }

    void markKnownViewsInvalid() {
        int m5080 = this.mChildHelper.m5080();
        for (int i5 = 0; i5 < m5080; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m4927();
    }

    public void nestedScrollBy(int i5, int i6) {
        nestedScrollByInternal(i5, i6, null, 1);
    }

    public void offsetChildrenHorizontal(int i5) {
        int m5078 = this.mChildHelper.m5078();
        for (int i6 = 0; i6 < m5078; i6++) {
            this.mChildHelper.m5077(i6).offsetLeftAndRight(i5);
        }
    }

    public void offsetChildrenVertical(int i5) {
        int m5078 = this.mChildHelper.m5078();
        for (int i6 = 0; i6 < m5078; i6++) {
            this.mChildHelper.m5077(i6).offsetTopAndBottom(i5);
        }
    }

    void offsetPositionRecordsForInsert(int i5, int i6) {
        int m5080 = this.mChildHelper.m5080();
        for (int i7 = 0; i7 < m5080; i7++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i5) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i7 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i6));
                }
                childViewHolderInt.offsetPosition(i6, false);
                this.mState.f4055 = true;
            }
        }
        this.mRecycler.m4929(i5, i6);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int m5080 = this.mChildHelper.m5080();
        if (i5 < i6) {
            i9 = -1;
            i8 = i5;
            i7 = i6;
        } else {
            i7 = i5;
            i8 = i6;
            i9 = 1;
        }
        for (int i11 = 0; i11 < m5080; i11++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i11));
            if (childViewHolderInt != null && (i10 = childViewHolderInt.mPosition) >= i8 && i10 <= i7) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i11 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i5) {
                    childViewHolderInt.offsetPosition(i6 - i5, false);
                } else {
                    childViewHolderInt.offsetPosition(i9, false);
                }
                this.mState.f4055 = true;
            }
        }
        this.mRecycler.m4930(i5, i6);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i5, int i6, boolean z5) {
        int i7 = i5 + i6;
        int m5080 = this.mChildHelper.m5080();
        for (int i8 = 0; i8 < m5080; i8++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i8));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i9 = childViewHolderInt.mPosition;
                if (i9 >= i7) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i8 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i6));
                    }
                    childViewHolderInt.offsetPosition(-i6, z5);
                    this.mState.f4055 = true;
                } else if (i9 >= i5) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i8 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i5 - 1, -i6, z5);
                    this.mState.f4055 = true;
                }
            }
        }
        this.mRecycler.m4931(i5, i6, z5);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.mRecycler
            r1.m4933()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.e.f4284
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.f1.m2902(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.e r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4288 = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.e r0 = r5.mGapWorker
            r0.m5137(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.mo4843();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m5230();
        this.mRecycler.m4925();
        z.a.m13102(this);
        if (!ALLOW_THREAD_GAP_WORK || (eVar = this.mGapWorker) == null) {
            return;
        }
        eVar.m5140(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mItemDecorations.get(i5).onDraw(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x5;
            this.mInitialTouchX = x5;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y5;
            this.mInitialTouchY = y5;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i5 = canScrollHorizontally;
            if (canScrollVertically) {
                i5 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i5, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i6 = x6 - this.mInitialTouchX;
                int i7 = y6 - this.mInitialTouchY;
                if (canScrollHorizontally == 0 || Math.abs(i6) <= this.mTouchSlop) {
                    z5 = false;
                } else {
                    this.mLastTouchX = x6;
                    z5 = true;
                }
                if (canScrollVertically && Math.abs(i7) > this.mTouchSlop) {
                    this.mLastTouchY = y6;
                    z5 = true;
                }
                if (z5) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x7;
            this.mInitialTouchX = x7;
            int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y7;
            this.mInitialTouchY = y7;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        androidx.core.os.t.m2443(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.t.m2444();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i5, i6);
            return;
        }
        boolean z5 = false;
        if (pVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i6);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z5;
            if (z5 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f4053 == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i5, i6);
            this.mState.f4058 = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i5, i6);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f4058 = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i5, i6);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i6);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            b0 b0Var = this.mState;
            if (b0Var.f4060) {
                b0Var.f4056 = true;
            } else {
                this.mAdapterHelper.m5057();
                this.mState.f4056 = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f4060) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.mAdapter;
        if (hVar != null) {
            this.mState.f4054 = hVar.mo4807();
        } else {
            this.mState.f4054 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i6);
        stopInterceptRequestLayout(false);
        this.mState.f4056 = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i5, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.m4936(zVar2);
        } else {
            p pVar = this.mLayout;
            if (pVar != null) {
                zVar.f4121 = pVar.onSaveInstanceState();
            } else {
                zVar.f4121 = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (i5 == i7 && i6 == i8) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[PHI: r0
  0x00df: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:43:0x00c8, B:46:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        f1.m2822(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z5) {
        this.mDispatchItemsChangedEvent = z5 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(f0 f0Var, m.c cVar) {
        f0Var.setFlags(0, 8192);
        if (this.mState.f4057 && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.mViewInfoStore.m5223(getChangedHolderKey(f0Var), f0Var);
        }
        this.mViewInfoStore.m5225(f0Var, cVar);
    }

    void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.mo4843();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.m4899();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean m5087 = this.mChildHelper.m5087(view);
        if (m5087) {
            f0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m4915(childViewHolderInt);
            this.mRecycler.m4923(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!m5087);
        return m5087;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z5) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z5);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i5) {
        int itemDecorationCount = getItemDecorationCount();
        if (i5 >= 0 && i5 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i5));
            return;
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    void repositionShadowingViews() {
        f0 f0Var;
        int m5078 = this.mChildHelper.m5078();
        for (int i5 = 0; i5 < m5078; i5++) {
            View m5077 = this.mChildHelper.m5077(i5);
            f0 childViewHolder = getChildViewHolder(m5077);
            if (childViewHolder != null && (f0Var = childViewHolder.mShadowingHolder) != null) {
                View view = f0Var.itemView;
                int left = m5077.getLeft();
                int top2 = m5077.getTop();
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        int size = this.mOnItemTouchListeners.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mOnItemTouchListeners.get(i5).mo4873(z5);
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int m5080 = this.mChildHelper.m5080();
        for (int i5 = 0; i5 < m5080; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5079(i5));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i5, int i6) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i5 = 0;
            }
            if (!canScrollVertically) {
                i6 = 0;
            }
            scrollByInternal(i5, i6, null, 0);
        }
    }

    boolean scrollByInternal(int i5, int i6, MotionEvent motionEvent, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i5, i6, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            i8 = i13;
            i9 = i12;
            i10 = i5 - i12;
            i11 = i6 - i13;
        } else {
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i9, i8, i10, i11, this.mScrollOffset, i7, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i14 = iArr4[0];
        int i15 = i10 - i14;
        int i16 = iArr4[1];
        int i17 = i11 - i16;
        boolean z5 = (i14 == 0 && i16 == 0) ? false : true;
        int i18 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i19 = iArr5[0];
        this.mLastTouchX = i18 - i19;
        int i20 = this.mLastTouchY;
        int i21 = iArr5[1];
        this.mLastTouchY = i20 - i21;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i19;
        iArr6[1] = iArr6[1] + i21;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !n0.m3215(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i15, motionEvent.getY(), i17);
            }
            considerReleasingGlowsOnScroll(i5, i6);
        }
        if (i9 != 0 || i8 != 0) {
            dispatchOnScrolled(i9, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z5 && i9 == 0 && i8 == 0) ? false : true;
    }

    void scrollStep(int i5, int i6, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.t.m2443(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i5 != 0 ? this.mLayout.scrollHorizontallyBy(i5, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i6 != 0 ? this.mLayout.scrollVerticallyBy(i6, this.mRecycler, this.mState) : 0;
        androidx.core.os.t.m2444();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i6) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i5) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.scrollToPosition(i5);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.mAccessibilityDelegate = kVar;
        f1.m2830(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    boolean setChildImportantForAccessibilityInternal(f0 f0Var, int i5) {
        if (!isComputingLayout()) {
            f1.m2843(f0Var.itemView, i5);
            return true;
        }
        f0Var.mPendingAccessibilityState = i5;
        this.mPendingAccessibilityImportanceChange.add(f0Var);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z5;
        super.setClipToPadding(z5);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        androidx.core.util.h.m2583(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z5) {
        this.mHasFixedSize = z5;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.mo4843();
            this.mItemAnimator.m4854(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.m4854(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i5) {
        this.mRecycler.m4913(i5);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.mo4843();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.m4899();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m4899();
        }
        this.mChildHelper.m5084();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.mRecyclerView.exceptionLabel());
            }
            pVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m4919();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        getScrollingChildHelper().m3257(z5);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.mPreserveFocusAfterLayout = z5;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.m4910(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i5) {
        if (i5 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            Log.d(TAG, "setting scroll state to " + i5 + " from " + this.mScrollState, new Exception());
        }
        this.mScrollState = i5;
        if (i5 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i5);
    }

    public void setScrollingTouchSlop(int i5) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i5 != 0) {
            if (i5 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i5 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.mRecycler.m4908(d0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int m2597 = accessibilityEvent != null ? androidx.core.view.accessibility.b.m2597(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= m2597 != 0 ? m2597 : 0;
        return true;
    }

    public void smoothScrollBy(int i5, int i6) {
        smoothScrollBy(i5, i6, null);
    }

    public void smoothScrollToPosition(int i5) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.smoothScrollToPosition(this, this.mState, i5);
        }
    }

    void startInterceptRequestLayout() {
        int i5 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i5;
        if (i5 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i5) {
        return getScrollingChildHelper().m3258(i5);
    }

    void stopInterceptRequestLayout(boolean z5) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z5 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z5 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.o0
    public void stopNestedScroll() {
        getScrollingChildHelper().m3260();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        if (z5 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z5) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(h hVar, boolean z5) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z5);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i5, int i6, Object obj) {
        int i7;
        int m5080 = this.mChildHelper.m5080();
        int i8 = i5 + i6;
        for (int i9 = 0; i9 < m5080; i9++) {
            View m5079 = this.mChildHelper.m5079(i9);
            f0 childViewHolderInt = getChildViewHolderInt(m5079);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i7 = childViewHolderInt.mPosition) >= i5 && i7 < i8) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) m5079.getLayoutParams()).f4103 = true;
            }
        }
        this.mRecycler.m4921(i5, i6);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m0.a.f9088);
    }

    public boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        return getScrollingChildHelper().m3250(i5, i6, iArr, iArr2, i7);
    }

    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr, int i9) {
        return getScrollingChildHelper().m3253(i5, i6, i7, i8, iArr, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.f0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.m5080()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.m5079(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m5083(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    public boolean hasNestedScrollingParent(int i5) {
        return getScrollingChildHelper().m3255(i5);
    }

    void onExitLayoutOrScroll(boolean z5) {
        int i5 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i5;
        if (i5 < 1) {
            if (sDebugAssertionsEnabled && i5 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z5) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i5, int i6, Interpolator interpolator) {
        smoothScrollBy(i5, i6, interpolator, UNDEFINED_DURATION);
    }

    public boolean startNestedScroll(int i5, int i6) {
        return getScrollingChildHelper().m3259(i5, i6);
    }

    public void stopNestedScroll(int i5) {
        getScrollingChildHelper().m3261(i5);
    }

    public static class z extends androidx.customview.view.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        Parcelable f4121;

        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public z[] newArray(int i5) {
                return new z[i5];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4121 = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeParcelable(this.f4121, 0);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4936(z zVar) {
            this.f4121 = zVar.f4121;
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i5) {
        boolean z5;
        super(context, attributeSet, i5);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new androidx.recyclerview.widget.p();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new e0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new e.b() : null;
        this.mState = new b0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = y3.m3447(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = y3.m3449(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m4854(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (f1.m2807(this) == 0) {
            f1.m2843(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = m0.c.f9092;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        f1.m2828(this, context, iArr, attributeSet, obtainStyledAttributes, i5, 0);
        String string = obtainStyledAttributes.getString(m0.c.f9101);
        if (obtainStyledAttributes.getInt(m0.c.f9095, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(m0.c.f9094, true);
        boolean z6 = obtainStyledAttributes.getBoolean(m0.c.f9096, false);
        this.mEnableFastScroller = z6;
        if (z6) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(m0.c.f9099), obtainStyledAttributes.getDrawable(m0.c.f9100), (StateListDrawable) obtainStyledAttributes.getDrawable(m0.c.f9097), obtainStyledAttributes.getDrawable(m0.c.f9098));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i5, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
            f1.m2828(this, context, iArr2, attributeSet, obtainStyledAttributes2, i5, 0);
            z5 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        } else {
            z5 = true;
        }
        setNestedScrollingEnabled(z5);
        z.a.m13104(this, true);
    }

    public final void dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        getScrollingChildHelper().m3251(i5, i6, i7, i8, iArr, i9, iArr2);
    }

    public void smoothScrollBy(int i5, int i6, Interpolator interpolator, int i7) {
        smoothScrollBy(i5, i6, interpolator, i7, false);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: ʻ, reason: contains not printable characters */
        f0 f4101;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Rect f4102;

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f4103;

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f4104;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4102 = new Rect();
            this.f4103 = true;
            this.f4104 = false;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public int m4865() {
            return this.f4101.getLayoutPosition();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m4866() {
            return this.f4101.isUpdated();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean m4867() {
            return this.f4101.isRemoved();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean m4868() {
            return this.f4101.isInvalid();
        }

        public q(int i5, int i6) {
            super(i5, i6);
            this.f4102 = new Rect();
            this.f4103 = true;
            this.f4104 = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4102 = new Rect();
            this.f4103 = true;
            this.f4104 = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4102 = new Rect();
            this.f4103 = true;
            this.f4104 = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f4102 = new Rect();
            this.f4103 = true;
            this.f4104 = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i5, int i6, Interpolator interpolator, int i7, boolean z5) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!pVar.canScrollHorizontally()) {
            i5 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i6 = 0;
        }
        if (i5 == 0 && i6 == 0) {
            return;
        }
        if (i7 == Integer.MIN_VALUE || i7 > 0) {
            if (z5) {
                int i8 = i5 != 0 ? 1 : 0;
                if (i6 != 0) {
                    i8 |= 2;
                }
                startNestedScroll(i8, 1);
            }
            this.mViewFlinger.m4792(i5, i6, i7, interpolator);
            return;
        }
        scrollBy(i5, i6);
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }

    public static abstract class h<VH extends f0> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final i f4077 = new i();

        /* renamed from: ʼ, reason: contains not printable characters */
        private boolean f4078 = false;

        /* renamed from: ʽ, reason: contains not printable characters */
        private a f4079 = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m4803(VH vh, int i5) {
            boolean z5 = vh.mBindingAdapter == null;
            if (z5) {
                vh.mPosition = i5;
                if (m4811()) {
                    vh.mItemId = mo4808(i5);
                }
                vh.setFlags(1, 519);
                androidx.core.os.t.m2443(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null && f1.m2903(vh.itemView) != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + f1.m2903(vh.itemView) + ", holder: " + vh);
                }
                if (vh.itemView.getParent() == null && f1.m2903(vh.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                }
            }
            m4816(vh, i5, vh.getUnmodifiedPayloads());
            if (z5) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f4103 = true;
                }
                androidx.core.os.t.m2444();
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean m4804() {
            int i5 = g.f4076[this.f4079.ordinal()];
            if (i5 != 1) {
                return i5 != 2 || mo4807() > 0;
            }
            return false;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final VH m4805(ViewGroup viewGroup, int i5) {
            try {
                androidx.core.os.t.m2443(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) mo4817(viewGroup, i5);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i5;
                return vh;
            } finally {
                androidx.core.os.t.m2444();
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public int m4806(h<? extends f0> hVar, f0 f0Var, int i5) {
            if (hVar == this) {
                return i5;
            }
            return -1;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public abstract int mo4807();

        /* renamed from: ˆ, reason: contains not printable characters */
        public long mo4808(int i5) {
            return -1L;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public int mo4809(int i5) {
            return 0;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public final boolean m4810() {
            return this.f4077.m4826();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final boolean m4811() {
            return this.f4078;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final void m4812() {
            this.f4077.m4827();
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final void m4813(int i5) {
            this.f4077.m4828(i5, 1);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public abstract void mo4815(VH vh, int i5);

        /* renamed from: י, reason: contains not printable characters */
        public void m4816(VH vh, int i5, List<Object> list) {
            mo4815(vh, i5);
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public abstract VH mo4817(ViewGroup viewGroup, int i5);

        /* renamed from: ᐧ, reason: contains not printable characters */
        public boolean m4819(VH vh) {
            return false;
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        public void m4823(j jVar) {
            this.f4077.registerObserver(jVar);
        }

        /* renamed from: ⁱ, reason: contains not printable characters */
        public void m4824(boolean z5) {
            if (m4810()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f4078 = z5;
        }

        /* renamed from: ﹳ, reason: contains not printable characters */
        public void m4825(j jVar) {
            this.f4077.unregisterObserver(jVar);
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public void m4814(RecyclerView recyclerView) {
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        public void m4818(RecyclerView recyclerView) {
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        public void m4820(VH vh) {
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        public void m4821(VH vh) {
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        public void mo4822(VH vh) {
        }
    }

    public static abstract class m {

        /* renamed from: ʻ, reason: contains not printable characters */
        private b f4084 = null;

        /* renamed from: ʼ, reason: contains not printable characters */
        private ArrayList<a> f4085 = new ArrayList<>();

        /* renamed from: ʽ, reason: contains not printable characters */
        private long f4086 = 120;

        /* renamed from: ʾ, reason: contains not printable characters */
        private long f4087 = 120;

        /* renamed from: ʿ, reason: contains not printable characters */
        private long f4088 = 250;

        /* renamed from: ˆ, reason: contains not printable characters */
        private long f4089 = 250;

        public interface a {
            /* renamed from: ʻ, reason: contains not printable characters */
            void m4855();
        }

        interface b {
            /* renamed from: ʻ, reason: contains not printable characters */
            void mo4856(f0 f0Var);
        }

        public static class c {

            /* renamed from: ʻ, reason: contains not printable characters */
            public int f4090;

            /* renamed from: ʼ, reason: contains not printable characters */
            public int f4091;

            /* renamed from: ʽ, reason: contains not printable characters */
            public int f4092;

            /* renamed from: ʾ, reason: contains not printable characters */
            public int f4093;

            /* renamed from: ʻ, reason: contains not printable characters */
            public c m4857(f0 f0Var) {
                return m4858(f0Var, 0);
            }

            /* renamed from: ʼ, reason: contains not printable characters */
            public c m4858(f0 f0Var, int i5) {
                View view = f0Var.itemView;
                this.f4090 = view.getLeft();
                this.f4091 = view.getTop();
                this.f4092 = view.getRight();
                this.f4093 = view.getBottom();
                return this;
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static int m4833(f0 f0Var) {
            int i5 = f0Var.mFlags & 14;
            if (f0Var.isInvalid()) {
                return 4;
            }
            if ((i5 & 4) != 0) {
                return i5;
            }
            int oldPosition = f0Var.getOldPosition();
            int absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i5 : i5 | 2048;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public abstract boolean mo4834(f0 f0Var, c cVar, c cVar2);

        /* renamed from: ʼ, reason: contains not printable characters */
        public abstract boolean mo4835(f0 f0Var, f0 f0Var2, c cVar, c cVar2);

        /* renamed from: ʽ, reason: contains not printable characters */
        public abstract boolean mo4836(f0 f0Var, c cVar, c cVar2);

        /* renamed from: ʾ, reason: contains not printable characters */
        public abstract boolean mo4837(f0 f0Var, c cVar, c cVar2);

        /* renamed from: ˆ, reason: contains not printable characters */
        public abstract boolean mo4838(f0 f0Var);

        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean mo4839(f0 f0Var, List<Object> list) {
            return mo4838(f0Var);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public final void m4840(f0 f0Var) {
            m4850(f0Var);
            b bVar = this.f4084;
            if (bVar != null) {
                bVar.mo4856(f0Var);
            }
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final void m4841() {
            int size = this.f4085.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f4085.get(i5).m4855();
            }
            this.f4085.clear();
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public abstract void mo4842(f0 f0Var);

        /* renamed from: ˎ, reason: contains not printable characters */
        public abstract void mo4843();

        /* renamed from: ˏ, reason: contains not printable characters */
        public long m4844() {
            return this.f4086;
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public long m4845() {
            return this.f4089;
        }

        /* renamed from: י, reason: contains not printable characters */
        public long m4846() {
            return this.f4088;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public long m4847() {
            return this.f4087;
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        public abstract boolean mo4848();

        /* renamed from: ᐧ, reason: contains not printable characters */
        public c m4849() {
            return new c();
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        public c m4851(b0 b0Var, f0 f0Var) {
            return m4849().m4857(f0Var);
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        public c m4852(b0 b0Var, f0 f0Var, int i5, List<Object> list) {
            return m4849().m4857(f0Var);
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        public abstract void mo4853();

        /* renamed from: ⁱ, reason: contains not printable characters */
        void m4854(b bVar) {
            this.f4084 = bVar;
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        public void m4850(f0 f0Var) {
        }
    }

    public final class w {

        /* renamed from: ʻ, reason: contains not printable characters */
        final ArrayList<f0> f4112;

        /* renamed from: ʼ, reason: contains not printable characters */
        ArrayList<f0> f4113;

        /* renamed from: ʽ, reason: contains not printable characters */
        final ArrayList<f0> f4114;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final List<f0> f4115;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f4116;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f4117;

        /* renamed from: ˈ, reason: contains not printable characters */
        v f4118;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f4112 = arrayList;
            this.f4113 = null;
            this.f4114 = new ArrayList<>();
            this.f4115 = Collections.unmodifiableList(arrayList);
            this.f4116 = 2;
            this.f4117 = 2;
        }

        /* renamed from: ʻʻ, reason: contains not printable characters */
        private void m4890(h<?> hVar, boolean z5) {
            v vVar = this.f4118;
            if (vVar != null) {
                vVar.m4881(hVar, z5);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m4891(f0 f0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = f0Var.itemView;
                if (f1.m2807(view) == 0) {
                    f1.m2843(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.mAccessibilityDelegate;
                if (kVar == null) {
                    return;
                }
                androidx.core.view.a m5190 = kVar.m5190();
                if (m5190 instanceof k.a) {
                    ((k.a) m5190).m5193(view);
                }
                f1.m2830(view, m5190);
            }
        }

        /* renamed from: ˊˊ, reason: contains not printable characters */
        private boolean m4892(f0 f0Var, int i5, int i6, long j5) {
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = f0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z5 = false;
            if (j5 != RecyclerView.FOREVER_NS && !this.f4118.m4888(itemViewType, nanoTime, j5)) {
                return false;
            }
            if (f0Var.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f0Var.itemView, recyclerView.getChildCount(), f0Var.itemView.getLayoutParams());
                z5 = true;
            }
            RecyclerView.this.mAdapter.m4803(f0Var, i5);
            if (z5) {
                RecyclerView.this.detachViewFromParent(f0Var.itemView);
            }
            this.f4118.m4882(f0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m4891(f0Var);
            if (RecyclerView.this.mState.m4769()) {
                f0Var.mPreLayoutPosition = i6;
            }
            return true;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        private void m4893(ViewGroup viewGroup, boolean z5) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4893((ViewGroup) childAt, true);
                }
            }
            if (z5) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        private void m4894(f0 f0Var) {
            View view = f0Var.itemView;
            if (view instanceof ViewGroup) {
                m4893((ViewGroup) view, false);
            }
        }

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        private void m4895(h<?> hVar) {
            m4890(hVar, false);
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        private void m4896() {
            if (this.f4118 != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f4118.m4878(RecyclerView.this.mAdapter);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4897(f0 f0Var, boolean z5) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(f0Var);
            View view = f0Var.itemView;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.mAccessibilityDelegate;
            if (kVar != null) {
                androidx.core.view.a m5190 = kVar.m5190();
                f1.m2830(view, m5190 instanceof k.a ? ((k.a) m5190).m5192(view) : null);
            }
            if (z5) {
                m4907(f0Var);
            }
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
            m4911().m4886(f0Var);
        }

        /* renamed from: ʼʼ, reason: contains not printable characters */
        void m4898() {
            for (int size = this.f4114.size() - 1; size >= 0; size--) {
                m4904(size);
            }
            this.f4114.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m5142();
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m4899() {
            this.f4112.clear();
            m4898();
        }

        /* renamed from: ʽʽ, reason: contains not printable characters */
        void m4900(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m4923(childViewHolderInt);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m4901() {
            int size = this.f4114.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f4114.get(i5).clearOldPosition();
            }
            int size2 = this.f4112.size();
            for (int i6 = 0; i6 < size2; i6++) {
                this.f4112.get(i6).clearOldPosition();
            }
            ArrayList<f0> arrayList = this.f4113;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    this.f4113.get(i7).clearOldPosition();
                }
            }
        }

        /* renamed from: ʾʾ, reason: contains not printable characters */
        public void m4902(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m4923(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.mo4842(childViewHolderInt);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m4903() {
            this.f4112.clear();
            ArrayList<f0> arrayList = this.f4113;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: ʿʿ, reason: contains not printable characters */
        void m4904(int i5) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "Recycling cached view at index " + i5);
            }
            f0 f0Var = this.f4114.get(i5);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + f0Var);
            }
            m4897(f0Var, true);
            this.f4114.remove(i5);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public int m4905(int i5) {
            if (i5 >= 0 && i5 < RecyclerView.this.mState.m4766()) {
                return !RecyclerView.this.mState.m4769() ? i5 : RecyclerView.this.mAdapterHelper.m5059(i5);
            }
            throw new IndexOutOfBoundsException("invalid position " + i5 + ". State item count is " + RecyclerView.this.mState.m4766() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: ˆˆ, reason: contains not printable characters */
        void m4906(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f4113 == null) {
                    this.f4113 = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f4113.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.m4811()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f4112.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        void m4907(f0 f0Var) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.m4934(f0Var);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.this.mRecyclerListeners.get(i5).m4934(f0Var);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.mo4822(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m5236(f0Var);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + f0Var);
            }
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        f0 m4909(int i5) {
            int size;
            int m5059;
            ArrayList<f0> arrayList = this.f4113;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    f0 f0Var = this.f4113.get(i6);
                    if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i5) {
                        f0Var.addFlags(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.m4811() && (m5059 = RecyclerView.this.mAdapterHelper.m5059(i5)) > 0 && m5059 < RecyclerView.this.mAdapter.mo4807()) {
                    long mo4808 = RecyclerView.this.mAdapter.mo4808(m5059);
                    for (int i7 = 0; i7 < size; i7++) {
                        f0 f0Var2 = this.f4113.get(i7);
                        if (!f0Var2.wasReturnedFromScrap() && f0Var2.getItemId() == mo4808) {
                            f0Var2.addFlags(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: ˉˉ, reason: contains not printable characters */
        void m4910(v vVar) {
            m4895(RecyclerView.this.mAdapter);
            v vVar2 = this.f4118;
            if (vVar2 != null) {
                vVar2.m4880();
            }
            this.f4118 = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f4118.m4877();
            }
            m4896();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        v m4911() {
            if (this.f4118 == null) {
                this.f4118 = new v();
                m4896();
            }
            return this.f4118;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        int m4912() {
            return this.f4112.size();
        }

        /* renamed from: ˋˋ, reason: contains not printable characters */
        public void m4913(int i5) {
            this.f4116 = i5;
            m4919();
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public List<f0> m4914() {
            return this.f4115;
        }

        /* renamed from: ˎˎ, reason: contains not printable characters */
        void m4915(f0 f0Var) {
            if (f0Var.mInChangeScrap) {
                this.f4113.remove(f0Var);
            } else {
                this.f4112.remove(f0Var);
            }
            f0Var.mScrapContainer = null;
            f0Var.mInChangeScrap = false;
            f0Var.clearReturnedFromScrapFlag();
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        f0 m4916(long j5, int i5, boolean z5) {
            for (int size = this.f4112.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f4112.get(size);
                if (f0Var.getItemId() == j5 && !f0Var.wasReturnedFromScrap()) {
                    if (i5 == f0Var.getItemViewType()) {
                        f0Var.addFlags(32);
                        if (f0Var.isRemoved() && !RecyclerView.this.mState.m4769()) {
                            f0Var.setFlags(2, 14);
                        }
                        return f0Var;
                    }
                    if (!z5) {
                        this.f4112.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.itemView, false);
                        m4900(f0Var.itemView);
                    }
                }
            }
            int size2 = this.f4114.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f4114.get(size2);
                if (f0Var2.getItemId() == j5 && !f0Var2.isAttachedToTransitionOverlay()) {
                    if (i5 == f0Var2.getItemViewType()) {
                        if (!z5) {
                            this.f4114.remove(size2);
                        }
                        return f0Var2;
                    }
                    if (!z5) {
                        m4904(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
        /* renamed from: ˏˏ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.f0 m4917(int r19, boolean r20, long r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.m4917(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        f0 m4918(int i5, boolean z5) {
            View m5076;
            int size = this.f4112.size();
            for (int i6 = 0; i6 < size; i6++) {
                f0 f0Var = this.f4112.get(i6);
                if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i5 && !f0Var.isInvalid() && (RecyclerView.this.mState.f4056 || !f0Var.isRemoved())) {
                    f0Var.addFlags(32);
                    return f0Var;
                }
            }
            if (!z5 && (m5076 = RecyclerView.this.mChildHelper.m5076(i5)) != null) {
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(m5076);
                RecyclerView.this.mChildHelper.m5088(m5076);
                int m5082 = RecyclerView.this.mChildHelper.m5082(m5076);
                if (m5082 != -1) {
                    RecyclerView.this.mChildHelper.m5075(m5082);
                    m4906(m5076);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f4114.size();
            for (int i7 = 0; i7 < size2; i7++) {
                f0 f0Var2 = this.f4114.get(i7);
                if (!f0Var2.isInvalid() && f0Var2.getLayoutPosition() == i5 && !f0Var2.isAttachedToTransitionOverlay()) {
                    if (!z5) {
                        this.f4114.remove(i7);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "getScrapOrHiddenOrCachedHolderForPosition(" + i5 + ") found match in cache: " + f0Var2);
                    }
                    return f0Var2;
                }
            }
            return null;
        }

        /* renamed from: ˑˑ, reason: contains not printable characters */
        void m4919() {
            p pVar = RecyclerView.this.mLayout;
            this.f4117 = this.f4116 + (pVar != null ? pVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f4114.size() - 1; size >= 0 && this.f4114.size() > this.f4117; size--) {
                m4904(size);
            }
        }

        /* renamed from: י, reason: contains not printable characters */
        View m4920(int i5) {
            return this.f4112.get(i5).itemView;
        }

        /* renamed from: יי, reason: contains not printable characters */
        void m4921(int i5, int i6) {
            int i7;
            int i8 = i6 + i5;
            for (int size = this.f4114.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f4114.get(size);
                if (f0Var != null && (i7 = f0Var.mPosition) >= i5 && i7 < i8) {
                    f0Var.addFlags(2);
                    m4904(size);
                }
            }
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public View m4922(int i5) {
            return m4924(i5, false);
        }

        /* renamed from: ــ, reason: contains not printable characters */
        void m4923(f0 f0Var) {
            boolean z5;
            boolean z6 = true;
            if (f0Var.isScrap() || f0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(f0Var.isScrap());
                sb.append(" isAttached:");
                sb.append(f0Var.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (f0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.exceptionLabel());
            }
            if (f0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean doesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.mAdapter;
            boolean z7 = hVar != null && doesTransientStatePreventRecycling && hVar.m4819(f0Var);
            if (RecyclerView.sDebugAssertionsEnabled && this.f4114.contains(f0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f0Var + RecyclerView.this.exceptionLabel());
            }
            if (z7 || f0Var.isRecyclable()) {
                if (this.f4117 <= 0 || f0Var.hasAnyOfTheFlags(526)) {
                    z5 = false;
                } else {
                    int size = this.f4114.size();
                    if (size >= this.f4117 && size > 0) {
                        m4904(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m5144(f0Var.mPosition)) {
                        int i5 = size - 1;
                        while (i5 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.m5144(this.f4114.get(i5).mPosition)) {
                                break;
                            } else {
                                i5--;
                            }
                        }
                        size = i5 + 1;
                    }
                    this.f4114.add(size, f0Var);
                    z5 = true;
                }
                if (!z5) {
                    m4897(f0Var, true);
                    r1 = z5;
                    RecyclerView.this.mViewInfoStore.m5236(f0Var);
                    if (r1 && !z6 && doesTransientStatePreventRecycling) {
                        z.a.m13101(f0Var.itemView);
                        f0Var.mBindingAdapter = null;
                        f0Var.mOwnerRecyclerView = null;
                        return;
                    }
                    return;
                }
                r1 = z5;
            } else if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.exceptionLabel());
            }
            z6 = false;
            RecyclerView.this.mViewInfoStore.m5236(f0Var);
            if (r1) {
            }
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        View m4924(int i5, boolean z5) {
            return m4917(i5, z5, RecyclerView.FOREVER_NS).itemView;
        }

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        void m4925() {
            for (int i5 = 0; i5 < this.f4114.size(); i5++) {
                z.a.m13101(this.f4114.get(i5).itemView);
            }
            m4895(RecyclerView.this.mAdapter);
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        void m4926() {
            int size = this.f4114.size();
            for (int i5 = 0; i5 < size; i5++) {
                q qVar = (q) this.f4114.get(i5).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f4103 = true;
                }
            }
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        void m4927() {
            int size = this.f4114.size();
            for (int i5 = 0; i5 < size; i5++) {
                f0 f0Var = this.f4114.get(i5);
                if (f0Var != null) {
                    f0Var.addFlags(6);
                    f0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.m4811()) {
                m4898();
            }
        }

        /* renamed from: ᵔᵔ, reason: contains not printable characters */
        boolean m4928(f0 f0Var) {
            if (f0Var.isRemoved()) {
                if (!RecyclerView.sDebugAssertionsEnabled || RecyclerView.this.mState.m4769()) {
                    return RecyclerView.this.mState.m4769();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
            }
            int i5 = f0Var.mPosition;
            if (i5 >= 0 && i5 < RecyclerView.this.mAdapter.mo4807()) {
                if (RecyclerView.this.mState.m4769() || RecyclerView.this.mAdapter.mo4809(f0Var.mPosition) == f0Var.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.m4811() || f0Var.getItemId() == RecyclerView.this.mAdapter.mo4808(f0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: ⁱ, reason: contains not printable characters */
        void m4929(int i5, int i6) {
            int size = this.f4114.size();
            for (int i7 = 0; i7 < size; i7++) {
                f0 f0Var = this.f4114.get(i7);
                if (f0Var != null && f0Var.mPosition >= i5) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForInsert cached " + i7 + " holder " + f0Var + " now at position " + (f0Var.mPosition + i6));
                    }
                    f0Var.offsetPosition(i6, false);
                }
            }
        }

        /* renamed from: ﹳ, reason: contains not printable characters */
        void m4930(int i5, int i6) {
            int i7;
            int i8;
            int i9;
            int i10;
            if (i5 < i6) {
                i7 = -1;
                i9 = i5;
                i8 = i6;
            } else {
                i7 = 1;
                i8 = i5;
                i9 = i6;
            }
            int size = this.f4114.size();
            for (int i11 = 0; i11 < size; i11++) {
                f0 f0Var = this.f4114.get(i11);
                if (f0Var != null && (i10 = f0Var.mPosition) >= i9 && i10 <= i8) {
                    if (i10 == i5) {
                        f0Var.offsetPosition(i6 - i5, false);
                    } else {
                        f0Var.offsetPosition(i7, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForMove cached child " + i11 + " holder " + f0Var);
                    }
                }
            }
        }

        /* renamed from: ﹶ, reason: contains not printable characters */
        void m4931(int i5, int i6, boolean z5) {
            int i7 = i5 + i6;
            for (int size = this.f4114.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f4114.get(size);
                if (f0Var != null) {
                    int i8 = f0Var.mPosition;
                    if (i8 >= i7) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + f0Var + " now at position " + (f0Var.mPosition - i6));
                        }
                        f0Var.offsetPosition(-i6, z5);
                    } else if (i8 >= i5) {
                        f0Var.addFlags(8);
                        m4904(size);
                    }
                }
            }
        }

        /* renamed from: ﾞ, reason: contains not printable characters */
        void m4932(h<?> hVar, h<?> hVar2, boolean z5) {
            m4899();
            m4890(hVar, true);
            m4911().m4885(hVar, hVar2, z5);
            m4896();
        }

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        void m4933() {
            m4896();
        }

        /* renamed from: ˈˈ, reason: contains not printable characters */
        void m4908(d0 d0Var) {
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i5) {
    }

    public static abstract class j {
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo4832(int i5, int i6, Object obj) {
            mo4831(i5, i6);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4830() {
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4831(int i5, int i6) {
        }
    }

    public static abstract class u {
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4874(RecyclerView recyclerView, int i5) {
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4875(RecyclerView recyclerView, int i5, int i6) {
        }
    }

    public void onScrolled(int i5, int i6) {
    }
}
