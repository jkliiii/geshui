package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* loaded from: E:\78999\cookie_5123796.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f5, float f6, float f7) {
        this.fabMargin = f5;
        this.roundedCornerRadius = f6;
        setCradleVerticalOffset(f7);
        this.horizontalOffset = 0.0f;
    }

    float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        float f8;
        float f9;
        float f10 = this.fabDiameter;
        if (f10 == 0.0f) {
            shapePath.lineTo(f5, 0.0f);
            return;
        }
        float f11 = ((this.fabMargin * 2.0f) + f10) / 2.0f;
        float f12 = f7 * this.roundedCornerRadius;
        float f13 = f6 + this.horizontalOffset;
        float f14 = (this.cradleVerticalOffset * f7) + ((1.0f - f7) * f11);
        if (f14 / f11 >= 1.0f) {
            shapePath.lineTo(f5, 0.0f);
            return;
        }
        float f15 = this.fabCornerSize;
        float f16 = f15 * f7;
        boolean z5 = f15 == -1.0f || Math.abs((f15 * 2.0f) - f10) < 0.1f;
        if (z5) {
            f8 = f14;
            f9 = 0.0f;
        } else {
            f9 = ROUNDED_CORNER_FAB_OFFSET;
            f8 = 0.0f;
        }
        float f17 = f11 + f12;
        float f18 = f8 + f12;
        float sqrt = (float) Math.sqrt((f17 * f17) - (f18 * f18));
        float f19 = f13 - sqrt;
        float f20 = f13 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f18));
        float f21 = (90.0f - degrees) + f9;
        shapePath.lineTo(f19, 0.0f);
        float f22 = f12 * 2.0f;
        shapePath.addArc(f19 - f12, 0.0f, f19 + f12, f22, 270.0f, degrees);
        if (z5) {
            shapePath.addArc(f13 - f11, (-f11) - f8, f13 + f11, f11 - f8, 180.0f - f21, (f21 * 2.0f) - 180.0f);
        } else {
            float f23 = this.fabMargin;
            float f24 = f16 * 2.0f;
            float f25 = f13 - f11;
            shapePath.addArc(f25, -(f16 + f23), f25 + f23 + f24, f23 + f16, 180.0f - f21, ((f21 * 2.0f) - 180.0f) / 2.0f);
            float f26 = f13 + f11;
            float f27 = this.fabMargin;
            shapePath.lineTo(f26 - ((f27 / 2.0f) + f16), f27 + f16);
            float f28 = this.fabMargin;
            shapePath.addArc(f26 - (f24 + f28), -(f16 + f28), f26, f28 + f16, 90.0f, f21 - 90.0f);
        }
        shapePath.addArc(f20 - f12, 0.0f, f20 + f12, f22, 270.0f - degrees, degrees);
        shapePath.lineTo(f5, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    float getFabCradleMargin() {
        return this.fabMargin;
    }

    float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    void setCradleVerticalOffset(float f5) {
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f5;
    }

    public void setFabCornerSize(float f5) {
        this.fabCornerSize = f5;
    }

    void setFabCradleMargin(float f5) {
        this.fabMargin = f5;
    }

    void setFabCradleRoundedCornerRadius(float f5) {
        this.roundedCornerRadius = f5;
    }

    public void setFabDiameter(float f5) {
        this.fabDiameter = f5;
    }

    void setHorizontalOffset(float f5) {
        this.horizontalOffset = f5;
    }
}
