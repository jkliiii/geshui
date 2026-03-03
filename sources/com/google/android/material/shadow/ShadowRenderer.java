package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.g0;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;
    private final Paint cornerShadowPaint;
    private final Paint edgeShadowPaint;
    private final Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;
    private final Paint shadowPaint;
    private int shadowStartColor;
    private final Paint transparentPaint;
    private static final int[] edgeColors = new int[3];
    private static final float[] edgePositions = {0.0f, 0.5f, 1.0f};
    private static final int[] cornerColors = new int[4];
    private static final float[] cornerPositions = {0.0f, 0.0f, 0.5f, 1.0f};

    public ShadowRenderer() {
        this(-16777216);
    }

    public void drawCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int i5, float f5, float f6) {
        boolean z5 = f6 < 0.0f;
        Path path = this.scratch;
        if (z5) {
            int[] iArr = cornerColors;
            iArr[0] = 0;
            iArr[1] = this.shadowEndColor;
            iArr[2] = this.shadowMiddleColor;
            iArr[3] = this.shadowStartColor;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f6);
            path.close();
            float f7 = -i5;
            rectF.inset(f7, f7);
            int[] iArr2 = cornerColors;
            iArr2[0] = 0;
            iArr2[1] = this.shadowStartColor;
            iArr2[2] = this.shadowMiddleColor;
            iArr2[3] = this.shadowEndColor;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f8 = 1.0f - (i5 / width);
        float[] fArr = cornerPositions;
        fArr[1] = f8;
        fArr[2] = ((1.0f - f8) / 2.0f) + f8;
        this.cornerShadowPaint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, cornerColors, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z5) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.transparentPaint);
        }
        canvas.drawArc(rectF, f5, f6, true, this.cornerShadowPaint);
        canvas.restore();
    }

    public void drawEdgeShadow(Canvas canvas, Matrix matrix, RectF rectF, int i5) {
        rectF.bottom += i5;
        rectF.offset(0.0f, -i5);
        int[] iArr = edgeColors;
        iArr[0] = this.shadowEndColor;
        iArr[1] = this.shadowMiddleColor;
        iArr[2] = this.shadowStartColor;
        Paint paint = this.edgeShadowPaint;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, edgePositions, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.edgeShadowPaint);
        canvas.restore();
    }

    public void drawInnerCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int i5, float f5, float f6, float[] fArr) {
        if (f6 > 0.0f) {
            f5 += f6;
            f6 = -f6;
        }
        drawCornerShadow(canvas, matrix, rectF, i5, f5, f6);
        Path path = this.scratch;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f5, f6);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.transparentPaint);
        canvas.drawPath(path, this.shadowPaint);
        canvas.restore();
    }

    public Paint getShadowPaint() {
        return this.shadowPaint;
    }

    public void setShadowColor(int i5) {
        this.shadowStartColor = g0.m2279(i5, 68);
        this.shadowMiddleColor = g0.m2279(i5, 20);
        this.shadowEndColor = g0.m2279(i5, 0);
        this.shadowPaint.setColor(this.shadowStartColor);
    }

    public ShadowRenderer(int i5) {
        this.scratch = new Path();
        Paint paint = new Paint();
        this.transparentPaint = paint;
        this.shadowPaint = new Paint();
        setShadowColor(i5);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.cornerShadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.edgeShadowPaint = new Paint(paint2);
    }
}
