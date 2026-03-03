package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class m<V extends View> extends CoordinatorLayout.c<V> {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private n viewOffsetHelper;

    public m() {
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    public int getLeftAndRightOffset() {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            return nVar.m6193();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            return nVar.m6194();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        n nVar = this.viewOffsetHelper;
        return nVar != null && nVar.m6195();
    }

    public boolean isVerticalOffsetEnabled() {
        n nVar = this.viewOffsetHelper;
        return nVar != null && nVar.m6196();
    }

    protected void layoutChild(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        coordinatorLayout.onLayoutChild(v5, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        layoutChild(coordinatorLayout, v5, i5);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new n(v5);
        }
        this.viewOffsetHelper.m6197();
        this.viewOffsetHelper.m6191();
        int i6 = this.tempTopBottomOffset;
        if (i6 != 0) {
            this.viewOffsetHelper.m6200(i6);
            this.tempTopBottomOffset = 0;
        }
        int i7 = this.tempLeftRightOffset;
        if (i7 == 0) {
            return true;
        }
        this.viewOffsetHelper.m6199(i7);
        this.tempLeftRightOffset = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z5) {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            nVar.m6198(z5);
        }
    }

    public boolean setLeftAndRightOffset(int i5) {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            return nVar.m6199(i5);
        }
        this.tempLeftRightOffset = i5;
        return false;
    }

    public boolean setTopAndBottomOffset(int i5) {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            return nVar.m6200(i5);
        }
        this.tempTopBottomOffset = i5;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z5) {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            nVar.m6201(z5);
        }
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }
}
