package com.google.android.material.shape;

/* loaded from: E:\78999\cookie_5123796.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f5, boolean z5) {
        this.size = f5;
        this.inside = z5;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        if (!this.inside) {
            float f8 = this.size;
            shapePath.lineTo(f6 - (f8 * f7), 0.0f, f6, (-f8) * f7);
            shapePath.lineTo(f6 + (this.size * f7), 0.0f, f5, 0.0f);
        } else {
            shapePath.lineTo(f6 - (this.size * f7), 0.0f);
            float f9 = this.size;
            shapePath.lineTo(f6, f9 * f7, (f9 * f7) + f6, 0.0f);
            shapePath.lineTo(f5, 0.0f);
        }
    }
}
