package com.google.android.material.shape;

/* loaded from: E:\78999\cookie_5123796.dex */
public class EdgeTreatment {
    boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f5, float f6, ShapePath shapePath) {
        getEdgePath(f5, f5 / 2.0f, f6, shapePath);
    }

    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        shapePath.lineTo(f5, 0.0f);
    }
}
