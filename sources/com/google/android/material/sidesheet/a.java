package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: LeftSheetDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a extends d {

    /* renamed from: ʻ, reason: contains not printable characters */
    final SideSheetBehavior<? extends View> f6083;

    a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f6083 = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʻ, reason: contains not printable characters */
    int mo7193(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʼ, reason: contains not printable characters */
    float mo7194(int i5) {
        float mo7197 = mo7197();
        return (i5 - mo7197) / (mo7196() - mo7197);
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʽ, reason: contains not printable characters */
    int mo7195(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʾ, reason: contains not printable characters */
    int mo7196() {
        return Math.max(0, this.f6083.getParentInnerEdge() + this.f6083.getInnerMargin());
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ʿ, reason: contains not printable characters */
    int mo7197() {
        return (-this.f6083.getChildWidth()) - this.f6083.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˆ, reason: contains not printable characters */
    int mo7198() {
        return this.f6083.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˈ, reason: contains not printable characters */
    int mo7199() {
        return -this.f6083.getChildWidth();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˉ, reason: contains not printable characters */
    <V extends View> int mo7200(V v5) {
        return v5.getRight() + this.f6083.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˊ, reason: contains not printable characters */
    public int mo7201(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˋ, reason: contains not printable characters */
    int mo7202() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˎ, reason: contains not printable characters */
    boolean mo7203(float f5) {
        return f5 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˏ, reason: contains not printable characters */
    boolean mo7204(View view) {
        return view.getRight() < (mo7196() - mo7197()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ˑ, reason: contains not printable characters */
    boolean mo7205(float f5, float f6) {
        return g.m7210(f5, f6) && Math.abs(f5) > ((float) this.f6083.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: י, reason: contains not printable characters */
    boolean mo7206(View view, float f5) {
        return Math.abs(((float) view.getLeft()) + (f5 * this.f6083.getHideFriction())) > this.f6083.getHideThreshold();
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ـ, reason: contains not printable characters */
    void mo7207(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        marginLayoutParams.leftMargin = i5;
    }

    @Override // com.google.android.material.sidesheet.d
    /* renamed from: ٴ, reason: contains not printable characters */
    void mo7208(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6) {
        if (i5 <= this.f6083.getParentWidth()) {
            marginLayoutParams.leftMargin = i6;
        }
    }
}
