package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class f extends d<LinearProgressIndicatorSpec> {

    /* renamed from: ʽ, reason: contains not printable characters */
    private float f5939;

    /* renamed from: ʾ, reason: contains not printable characters */
    private float f5940;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f5941;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Path f5942;

    public f(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f5939 = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʻ */
    public void mo6986(Canvas canvas, Rect rect, float f5) {
        this.f5939 = rect.width();
        float f6 = ((LinearProgressIndicatorSpec) this.f5934).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f5934).trackThickness) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f5934).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f5935.isShowing() && ((LinearProgressIndicatorSpec) this.f5934).showAnimationBehavior == 1) || (this.f5935.isHiding() && ((LinearProgressIndicatorSpec) this.f5934).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f5935.isShowing() || this.f5935.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f5934).trackThickness * (f5 - 1.0f)) / 2.0f);
        }
        float f7 = this.f5939;
        canvas.clipRect((-f7) / 2.0f, (-f6) / 2.0f, f7 / 2.0f, f6 / 2.0f);
        S s5 = this.f5934;
        this.f5940 = ((LinearProgressIndicatorSpec) s5).trackThickness * f5;
        this.f5941 = ((LinearProgressIndicatorSpec) s5).trackCornerRadius * f5;
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʼ */
    public void mo6987(Canvas canvas, Paint paint, float f5, float f6, int i5) {
        if (f5 == f6) {
            return;
        }
        float f7 = this.f5939;
        float f8 = (-f7) / 2.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i5);
        canvas.save();
        canvas.clipPath(this.f5942);
        float f9 = this.f5940;
        RectF rectF = new RectF(((f5 * f7) + f8) - (this.f5941 * 2.0f), (-f9) / 2.0f, f8 + (f6 * f7), f9 / 2.0f);
        float f10 = this.f5941;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʽ */
    void mo6988(Canvas canvas, Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.f5934).trackColor, this.f5935.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        Path path = new Path();
        this.f5942 = path;
        float f5 = this.f5939;
        float f6 = this.f5940;
        RectF rectF = new RectF((-f5) / 2.0f, (-f6) / 2.0f, f5 / 2.0f, f6 / 2.0f);
        float f7 = this.f5941;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CCW);
        canvas.drawPath(this.f5942, paint);
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʾ */
    public int mo6989() {
        return ((LinearProgressIndicatorSpec) this.f5934).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʿ */
    public int mo6990() {
        return -1;
    }
}
