package com.google.android.material.shape;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(ShapePath shapePath, float f5, float f6, float f7) {
        shapePath.reset(0.0f, f7 * f6, 180.0f, 180.0f - f5);
        double sin = Math.sin(Math.toRadians(f5));
        double d6 = f7;
        Double.isNaN(d6);
        double d7 = f6;
        Double.isNaN(d7);
        double sin2 = Math.sin(Math.toRadians(90.0f - f5));
        Double.isNaN(d6);
        Double.isNaN(d7);
        shapePath.lineTo((float) (sin * d6 * d7), (float) (sin2 * d6 * d7));
    }

    @Deprecated
    public CutCornerTreatment(float f5) {
        this.size = f5;
    }
}
