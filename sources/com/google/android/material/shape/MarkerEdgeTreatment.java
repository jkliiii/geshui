package com.google.android.material.shape;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f5) {
        this.radius = f5 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        double d6 = this.radius;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d6);
        float f8 = (float) ((d6 * sqrt) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(f8, 2.0d));
        double d7 = this.radius;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        double d8 = d7 * sqrt3;
        double d9 = this.radius;
        Double.isNaN(d9);
        shapePath.reset(f6 - f8, ((float) (-(d8 - d9))) + sqrt2);
        double d10 = this.radius;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d10);
        double d11 = d10 * sqrt4;
        double d12 = this.radius;
        Double.isNaN(d12);
        shapePath.lineTo(f6, (float) (-(d11 - d12)));
        double d13 = this.radius;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d13);
        double d14 = d13 * sqrt5;
        double d15 = this.radius;
        Double.isNaN(d15);
        shapePath.lineTo(f6 + f8, ((float) (-(d14 - d15))) + sqrt2);
    }
}
