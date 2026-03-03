package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CarouselSnapHelper extends n {
    private final boolean disableFling;
    private RecyclerView recyclerView;

    class a extends androidx.recyclerview.widget.g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.a0
        /* renamed from: ـ */
        protected void mo4756(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            if (CarouselSnapHelper.this.recyclerView != null) {
                CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                int[] calculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                int i5 = calculateDistanceToSnap[0];
                int i6 = calculateDistanceToSnap[1];
                int m5157 = m5157(Math.max(Math.abs(i5), Math.abs(i6)));
                if (m5157 > 0) {
                    aVar.m4764(i5, i6, m5157, this.f4309);
                }
            }
        }

        @Override // androidx.recyclerview.widget.g
        /* renamed from: ⁱ */
        protected float mo5156(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(RecyclerView.p pVar, View view, boolean z5) {
        if (!(pVar instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) pVar, z5);
        return pVar.canScrollHorizontally() ? new int[]{distanceToFirstFocalKeyline, 0} : pVar.canScrollVertically() ? new int[]{0, distanceToFirstFocalKeyline} : new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean z5) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z5);
    }

    private View findViewNearestFirstKeyline(RecyclerView.p pVar) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount != 0 && (pVar instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) pVar;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = pVar.getChildAt(i6);
                int abs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(pVar.getPosition(childAt), false));
                if (abs < i5) {
                    view = childAt;
                    i5 = abs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.p pVar, int i5, int i6) {
        return pVar.canScrollHorizontally() ? i5 > 0 : i6 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.p pVar) {
        PointF computeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (!(pVar instanceof RecyclerView.a0.b) || (computeScrollVectorForPosition = ((RecyclerView.a0.b) pVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view) {
        return calculateDistanceToSnap(pVar, view, false);
    }

    @Override // androidx.recyclerview.widget.n
    protected RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.recyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View findSnapView(RecyclerView.p pVar) {
        return findViewNearestFirstKeyline(pVar);
    }

    @Override // androidx.recyclerview.widget.n
    public int findTargetSnapPosition(RecyclerView.p pVar, int i5, int i6) {
        int itemCount;
        if (!this.disableFling || (itemCount = pVar.getItemCount()) == 0) {
            return -1;
        }
        int childCount = pVar.getChildCount();
        View view = null;
        View view2 = null;
        int i7 = RecyclerView.UNDEFINED_DURATION;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = pVar.getChildAt(i9);
            if (childAt != null) {
                int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) pVar, false);
                if (distanceToFirstFocalKeyline <= 0 && distanceToFirstFocalKeyline > i7) {
                    view2 = childAt;
                    i7 = distanceToFirstFocalKeyline;
                }
                if (distanceToFirstFocalKeyline >= 0 && distanceToFirstFocalKeyline < i8) {
                    view = childAt;
                    i8 = distanceToFirstFocalKeyline;
                }
            }
        }
        boolean isForwardFling = isForwardFling(pVar, i5, i6);
        if (isForwardFling && view != null) {
            return pVar.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return pVar.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = pVar.getPosition(view) + (isReverseLayout(pVar) == isForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public CarouselSnapHelper(boolean z5) {
        this.disableFling = z5;
    }
}
