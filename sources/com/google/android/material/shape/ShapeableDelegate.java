package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class ShapeableDelegate {
    ShapeAppearanceModel shapeAppearanceModel;
    boolean forceCompatClippingEnabled = false;
    boolean offsetZeroCornerEdgeBoundsEnabled = false;
    RectF maskBounds = new RectF();
    final Path shapePath = new Path();

    public static ShapeableDelegate create(View view) {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 33 ? new d(view) : i5 >= 22 ? new c(view) : new a();
    }

    private void updateShapePath() {
        if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null) {
            return;
        }
        ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
    }

    abstract void invalidateClippingMethod(View view);

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void maybeClip(Canvas canvas, CanvasCompat.CanvasOperation canvasOperation) {
        if (!shouldUseCompatClipping() || this.shapePath.isEmpty()) {
            canvasOperation.run(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.shapePath);
        canvasOperation.run(canvas);
        canvas.restore();
    }

    public void onMaskChanged(View view, RectF rectF) {
        this.maskBounds = rectF;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(View view, ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void setForceCompatClippingEnabled(View view, boolean z5) {
        if (z5 != this.forceCompatClippingEnabled) {
            this.forceCompatClippingEnabled = z5;
            invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(View view, boolean z5) {
        this.offsetZeroCornerEdgeBoundsEnabled = z5;
        invalidateClippingMethod(view);
    }

    abstract boolean shouldUseCompatClipping();
}
