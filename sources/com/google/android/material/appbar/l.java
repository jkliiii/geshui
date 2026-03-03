package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class l extends m<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public l() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i5) {
        if (i5 == 0) {
            return 8388659;
        }
        return i5;
    }

    abstract View findFirstDependency(List<View> list);

    final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i5 = this.overlayTop;
        return w.a.m12444((int) (overlapRatioForOffset * i5), 0, i5);
    }

    float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.m
    protected void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i5) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency == null) {
            super.layoutChild(coordinatorLayout, view, i5);
            this.verticalLayoutGap = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.tempRect1;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        f5 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && f1.m2891(coordinatorLayout) && !f1.m2891(view)) {
            rect.left += lastWindowInsets.m3074();
            rect.right -= lastWindowInsets.m3075();
        }
        Rect rect2 = this.tempRect2;
        androidx.core.view.r.m3297(resolveGravity(fVar.f2506), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i5);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i5, int i6, int i7, int i8) {
        View findFirstDependency;
        f5 lastWindowInsets;
        int i9 = view.getLayoutParams().height;
        if ((i9 != -1 && i9 != -2) || (findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (f1.m2891(findFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m3076() + lastWindowInsets.m3073();
        }
        int scrollRange = size + getScrollRange(findFirstDependency);
        int measuredHeight = findFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i5, i6, View.MeasureSpec.makeMeasureSpec(scrollRange, i9 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i8);
        return true;
    }

    public final void setOverlayTop(int i5) {
        this.overlayTop = i5;
    }

    protected boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
