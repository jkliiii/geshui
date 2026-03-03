package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: E:\78999\cookie_5123796.dex */
abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    BasePaintDrawable() {
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    protected final void onDraw(Canvas canvas, int i5, int i6) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-16777216);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i5, i6, this.mPaint);
    }

    protected abstract void onDraw(Canvas canvas, int i5, int i6, Paint paint);

    protected abstract void onPreparePaint(Paint paint);
}
