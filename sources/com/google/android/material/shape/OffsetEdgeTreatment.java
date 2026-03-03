package com.google.android.material.shape;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    public OffsetEdgeTreatment(EdgeTreatment edgeTreatment, float f5) {
        this.other = edgeTreatment;
        this.offset = f5;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        this.other.getEdgePath(f5, f6 - this.offset, f7, shapePath);
    }
}
