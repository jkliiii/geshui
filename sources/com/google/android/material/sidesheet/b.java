package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: RightSheetDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b extends d {

    /* renamed from: ʻ, reason: contains not printable characters */
    final SideSheetBehavior<? extends View> f6084;

    b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f6084 = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʻ */
    int mo7193(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʼ */
    float mo7194(int i5) {
        float mo7197 = mo7197();
        return (mo7197 - i5) / (mo7197 - mo7196());
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʽ */
    int mo7195(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʾ */
    int mo7196() {
        return Math.max(0, (mo7197() - this.f6084.getChildWidth()) - this.f6084.getInnerMargin());
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʿ */
    int mo7197() {
        return this.f6084.getParentWidth();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˆ */
    int mo7198() {
        return this.f6084.getParentWidth();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˈ */
    int mo7199() {
        return mo7196();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˉ */
    <V extends View> int mo7200(V v5) {
        return v5.getLeft() - this.f6084.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˊ */
    public int mo7201(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˋ */
    int mo7202() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˎ */
    boolean mo7203(float f5) {
        return f5 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˏ */
    boolean mo7204(View view) {
        return view.getLeft() > (mo7197() + mo7196()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˑ */
    boolean mo7205(float f5, float f6) {
        return g.m7210(f5, f6) && Math.abs(f5) > ((float) this.f6084.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: י */
    boolean mo7206(View view, float f5) {
        return Math.abs(((float) view.getRight()) + (f5 * this.f6084.getHideFriction())) > this.f6084.getHideThreshold();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ـ */
    void mo7207(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        marginLayoutParams.rightMargin = i5;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ٴ */
    void mo7208(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6) {
        int parentWidth = this.f6084.getParentWidth();
        if (i5 <= parentWidth) {
            marginLayoutParams.rightMargin = parentWidth - i5;
        }
    }
}
