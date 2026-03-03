package com.google.android.material.shape;

/* loaded from: E:\78999\cookie_5123796.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(ShapePath shapePath, float f5, float f6, float f7) {
        shapePath.reset(0.0f, f7 * f6, 180.0f, 180.0f - f5);
        float f8 = f7 * 2.0f * f6;
        shapePath.addArc(0.0f, 0.0f, f8, f8, 180.0f, f5);
    }

    @Deprecated
    public RoundedCornerTreatment(float f5) {
        this.radius = f5;
    }
}
