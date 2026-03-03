package com.google.android.material.shape;

import android.view.View;

/* compiled from: ShapeableDelegateV14.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a extends ShapeableDelegate {
    a() {
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(View view) {
        if (this.shapeAppearanceModel == null || this.maskBounds.isEmpty() || !shouldUseCompatClipping()) {
            return;
        }
        view.invalidate();
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
        return true;
    }
}
