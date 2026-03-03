package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: E:\78999\cookie_5123796.dex */
abstract class BaseSingleCircularProgressDrawable extends BaseProgressDrawable {
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    BaseSingleCircularProgressDrawable() {
    }

    protected void drawRing(Canvas canvas, Paint paint, float f5, float f6) {
        canvas.drawArc(RECT_PROGRESS, f5 - 90.0f, f6, false, paint);
    }

    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    protected void onDraw(Canvas canvas, int i5, int i6, Paint paint) {
        if (this.mUseIntrinsicPadding) {
            RectF rectF = RECT_PADDED_BOUND;
            canvas.scale(i5 / rectF.width(), i6 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = RECT_BOUND;
            canvas.scale(i5 / rectF2.width(), i6 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        onDrawRing(canvas, paint);
    }

    protected abstract void onDrawRing(Canvas canvas, Paint paint);

    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    protected void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }
}
