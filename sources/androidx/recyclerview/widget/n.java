package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class n extends RecyclerView.s {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.u mScrollListener = new a();

    /* compiled from: SnapHelper.java */
    class a extends RecyclerView.u {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f4328 = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        /* renamed from: ʻ */
        public void mo4874(RecyclerView recyclerView, int i5) {
            super.mo4874(recyclerView, i5);
            if (i5 == 0 && this.f4328) {
                this.f4328 = false;
                n.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        /* renamed from: ʼ */
        public void mo4875(RecyclerView recyclerView, int i5, int i6) {
            if (i5 == 0 && i6 == 0) {
                return;
            }
            this.f4328 = true;
        }
    }

    /* compiled from: SnapHelper.java */
    class b extends g {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.a0
        /* renamed from: ـ */
        protected void mo4756(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            n nVar = n.this;
            RecyclerView recyclerView = nVar.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = nVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i5 = calculateDistanceToFinalSnap[0];
            int i6 = calculateDistanceToFinalSnap[1];
            int m5157 = m5157(Math.max(Math.abs(i5), Math.abs(i6)));
            if (m5157 > 0) {
                aVar.m4764(i5, i6, m5157, this.f4309);
            }
        }

        @Override // androidx.recyclerview.widget.g
        /* renamed from: ⁱ */
        protected float mo5156(DisplayMetrics displayMetrics) {
            return n.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean snapFromFling(RecyclerView.p pVar, int i5, int i6) {
        RecyclerView.a0 createScroller;
        int findTargetSnapPosition;
        if (!(pVar instanceof RecyclerView.a0.b) || (createScroller = createScroller(pVar)) == null || (findTargetSnapPosition = findTargetSnapPosition(pVar, i5, i6)) == -1) {
            return false;
        }
        createScroller.m4757(findTargetSnapPosition);
        pVar.startSmoothScroll(createScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i5, int i6) {
        this.mGravityScroller.fling(0, 0, i5, i6, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    protected RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        return createSnapScroller(pVar);
    }

    @Deprecated
    protected g createSnapScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new b(this.mRecyclerView.getContext());
        }
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View findSnapView(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int findTargetSnapPosition(RecyclerView.p pVar, int i5, int i6);

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean onFling(int i5, int i6) {
        RecyclerView.p layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i6) > minFlingVelocity || Math.abs(i5) > minFlingVelocity) && snapFromFling(layoutManager, i5, i6);
    }

    void snapToTargetExistingView() {
        RecyclerView.p layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
        int i5 = calculateDistanceToFinalSnap[0];
        if (i5 == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i5, calculateDistanceToFinalSnap[1]);
    }
}
