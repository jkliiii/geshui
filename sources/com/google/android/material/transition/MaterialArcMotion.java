package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MaterialArcMotion extends androidx.transition.h {
    private static PointF getControlPoint(float f5, float f6, float f7, float f8) {
        return f6 > f8 ? new PointF(f7, f6) : new PointF(f5, f8);
    }

    @Override // androidx.transition.h
    public Path getPath(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f5, f6);
        PointF controlPoint = getControlPoint(f5, f6, f7, f8);
        path.quadTo(controlPoint.x, controlPoint.y, f7, f8);
        return path;
    }
}
