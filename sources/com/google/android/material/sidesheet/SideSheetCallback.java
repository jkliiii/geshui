package com.google.android.material.sidesheet;

import android.view.View;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class SideSheetCallback implements c {
    @Override // com.google.android.material.sidesheet.c
    public abstract void onSlide(View view, float f5);

    @Override // com.google.android.material.sidesheet.c
    public abstract void onStateChanged(View view, int i5);

    void onLayout(View view) {
    }
}
