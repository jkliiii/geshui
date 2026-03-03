package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    private float cornerRadius;
    private Path path;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        this.cornerRadius = 0.0f;
        invalidate();
    }

    public void updateClipBoundsAndCornerRadius(Rect rect, float f5) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f5);
    }

    public void updateCornerRadius(float f5) {
        updateClipBoundsAndCornerRadius(getLeft(), getTop(), getRight(), getBottom(), f5);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void updateClipBoundsAndCornerRadius(float f5, float f6, float f7, float f8, float f9) {
        updateClipBoundsAndCornerRadius(new RectF(f5, f6, f7, f8), f9);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }

    public void updateClipBoundsAndCornerRadius(RectF rectF, float f5) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.cornerRadius = f5;
        this.path.reset();
        this.path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        this.path.close();
        invalidate();
    }
}
