package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.j0;

/* compiled from: ClickActionDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends androidx.core.view.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final j0.a f6354;

    public b(Context context, int i5) {
        this.f6354 = new j0.a(16, context.getString(i5));
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
        super.onInitializeAccessibilityNodeInfo(view, j0Var);
        j0Var.m2662(this.f6354);
    }
}
