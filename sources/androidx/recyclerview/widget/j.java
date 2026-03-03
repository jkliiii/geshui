package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends n {

    /* renamed from: ʻ, reason: contains not printable characters */
    private i f4320;

    /* renamed from: ʼ, reason: contains not printable characters */
    private i f4321;

    /* compiled from: PagerSnapHelper.java */
    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.a0
        /* renamed from: ـ */
        protected void mo4756(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            j jVar = j.this;
            int[] calculateDistanceToFinalSnap = jVar.calculateDistanceToFinalSnap(jVar.mRecyclerView.getLayoutManager(), view);
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
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        /* renamed from: ﹶ */
        protected int mo5158(int i5) {
            return Math.min(100, super.mo5158(i5));
        }
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

    /* renamed from: ʻ, reason: contains not printable characters */
    private int m5185(View view, i iVar) {
        return (iVar.mo5172(view) + (iVar.mo5170(view) / 2)) - (iVar.mo5178() + (iVar.mo5179() / 2));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private View m5186(RecyclerView.p pVar, i iVar) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int mo5178 = iVar.mo5178() + (iVar.mo5179() / 2);
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = pVar.getChildAt(i6);
            int abs = Math.abs((iVar.mo5172(childAt) + (iVar.mo5170(childAt) / 2)) - mo5178);
            if (abs < i5) {
                view = childAt;
                i5 = abs;
            }
        }
        return view;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private i m5187(RecyclerView.p pVar) {
        i iVar = this.f4321;
        if (iVar == null || iVar.f4317 != pVar) {
            this.f4321 = i.m5166(pVar);
        }
        return this.f4321;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private i m5188(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return m5189(pVar);
        }
        if (pVar.canScrollHorizontally()) {
            return m5187(pVar);
        }
        return null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private i m5189(RecyclerView.p pVar) {
        i iVar = this.f4320;
        if (iVar == null || iVar.f4317 != pVar) {
            this.f4320 = i.m5168(pVar);
        }
        return this.f4320;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.canScrollHorizontally()) {
            iArr[0] = m5185(view, m5187(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = m5185(view, m5189(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return m5186(pVar, m5189(pVar));
        }
        if (pVar.canScrollHorizontally()) {
            return m5186(pVar, m5187(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.p pVar, int i5, int i6) {
        i m5188;
        int itemCount = pVar.getItemCount();
        if (itemCount == 0 || (m5188 = m5188(pVar)) == null) {
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
                int m5185 = m5185(childAt, m5188);
                if (m5185 <= 0 && m5185 > i7) {
                    view2 = childAt;
                    i7 = m5185;
                }
                if (m5185 >= 0 && m5185 < i8) {
                    view = childAt;
                    i8 = m5185;
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
}
