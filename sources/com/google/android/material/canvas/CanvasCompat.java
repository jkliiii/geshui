package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CanvasCompat {

    public interface CanvasOperation {
        void run(Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(Canvas canvas, RectF rectF, int i5) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(rectF, i5) : canvas.saveLayerAlpha(rectF, i5, 31);
    }

    public static int saveLayerAlpha(Canvas canvas, float f5, float f6, float f7, float f8, int i5) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f5, f6, f7, f8, i5);
        }
        return canvas.saveLayerAlpha(f5, f6, f7, f8, i5, 31);
    }
}
