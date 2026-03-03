package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a extends d<CircularProgressIndicatorSpec> {

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f5913;

    /* renamed from: ʾ, reason: contains not printable characters */
    private float f5914;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f5915;

    /* renamed from: ˆ, reason: contains not printable characters */
    private float f5916;

    public a(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f5913 = 1;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m6984(Canvas canvas, Paint paint, float f5, float f6, float f7) {
        canvas.save();
        canvas.rotate(f7);
        float f8 = this.f5916;
        float f9 = f5 / 2.0f;
        canvas.drawRoundRect(new RectF(f8 - f9, f6, f8 + f9, -f6), f6, f6, paint);
        canvas.restore();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int m6985() {
        S s5 = this.f5934;
        return ((CircularProgressIndicatorSpec) s5).indicatorSize + (((CircularProgressIndicatorSpec) s5).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo6986(Canvas canvas, Rect rect, float f5) {
        float width = rect.width() / mo6990();
        float height = rect.height() / mo6989();
        S s5 = this.f5934;
        float f6 = (((CircularProgressIndicatorSpec) s5).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s5).indicatorInset;
        canvas.translate((f6 * width) + rect.left, (f6 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f7 = -f6;
        canvas.clipRect(f7, f7, f6, f6);
        this.f5913 = ((CircularProgressIndicatorSpec) this.f5934).indicatorDirection == 0 ? 1 : -1;
        this.f5914 = ((CircularProgressIndicatorSpec) r8).trackThickness * f5;
        this.f5915 = ((CircularProgressIndicatorSpec) r8).trackCornerRadius * f5;
        this.f5916 = (((CircularProgressIndicatorSpec) r8).indicatorSize - ((CircularProgressIndicatorSpec) r8).trackThickness) / 2.0f;
        if ((this.f5935.isShowing() && ((CircularProgressIndicatorSpec) this.f5934).showAnimationBehavior == 2) || (this.f5935.isHiding() && ((CircularProgressIndicatorSpec) this.f5934).hideAnimationBehavior == 1)) {
            this.f5916 += ((1.0f - f5) * ((CircularProgressIndicatorSpec) this.f5934).trackThickness) / 2.0f;
        } else if ((this.f5935.isShowing() && ((CircularProgressIndicatorSpec) this.f5934).showAnimationBehavior == 1) || (this.f5935.isHiding() && ((CircularProgressIndicatorSpec) this.f5934).hideAnimationBehavior == 2)) {
            this.f5916 -= ((1.0f - f5) * ((CircularProgressIndicatorSpec) this.f5934).trackThickness) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʼ, reason: contains not printable characters */
    void mo6987(Canvas canvas, Paint paint, float f5, float f6, int i5) {
        if (f5 == f6) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i5);
        paint.setStrokeWidth(this.f5914);
        int i6 = this.f5913;
        float f7 = f5 * 360.0f * i6;
        float f8 = (f6 >= f5 ? f6 - f5 : (1.0f + f6) - f5) * 360.0f * i6;
        float f9 = this.f5916;
        canvas.drawArc(new RectF(-f9, -f9, f9, f9), f7, f8, false, paint);
        if (this.f5915 <= 0.0f || Math.abs(f8) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m6984(canvas, paint, this.f5914, this.f5915, f7);
        m6984(canvas, paint, this.f5914, this.f5915, f7 + f8);
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʽ, reason: contains not printable characters */
    void mo6988(Canvas canvas, Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.f5934).trackColor, this.f5935.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        paint.setStrokeWidth(this.f5914);
        float f5 = this.f5916;
        canvas.drawArc(new RectF(-f5, -f5, f5, f5), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʾ, reason: contains not printable characters */
    public int mo6989() {
        return m6985();
    }

    @Override // com.google.android.material.progressindicator.d
    /* renamed from: ʿ, reason: contains not printable characters */
    public int mo6990() {
        return m6985();
    }
}
