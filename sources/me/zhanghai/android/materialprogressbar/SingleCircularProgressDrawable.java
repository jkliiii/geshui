package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: E:\78999\cookie_5123796.dex */
class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    SingleCircularProgressDrawable(int i5) {
        if (i5 == 0) {
            this.mStartAngleMax = START_ANGLE_MAX_NORMAL;
        } else {
            if (i5 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.mStartAngleMax = 360.0f;
        }
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable
    protected void onDrawRing(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f5 = level / 10000.0f;
        float f6 = this.mStartAngleMax * f5;
        float f7 = f5 * 360.0f;
        drawRing(canvas, paint, f6, f7);
        if (this.mShowBackground) {
            drawRing(canvas, paint, f6, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        invalidateSelf();
        return true;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z5) {
        if (this.mShowBackground != z5) {
            this.mShowBackground = z5;
            invalidateSelf();
        }
    }
}
