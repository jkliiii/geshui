package com.google.android.material.shape;

import android.graphics.RectF;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f5, float f6, ShapePath shapePath) {
    }

    public void getCornerPath(ShapePath shapePath, float f5, float f6, float f7) {
        getCornerPath(f5, f6, shapePath);
    }

    public void getCornerPath(ShapePath shapePath, float f5, float f6, RectF rectF, CornerSize cornerSize) {
        getCornerPath(shapePath, f5, f6, cornerSize.getCornerSize(rectF));
    }
}
