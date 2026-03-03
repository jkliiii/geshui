package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: E:\78999\cookie_5123796.dex */
abstract class BaseDrawable extends Drawable implements TintableDrawable {
    protected ColorFilter mColorFilter;
    protected PorterDuffColorFilter mTintFilter;
    protected ColorStateList mTintList;
    protected int mAlpha = 255;
    protected PorterDuff.Mode mTintMode = PorterDuff.Mode.SRC_IN;
    private DummyConstantState mConstantState = new DummyConstantState();

    private class DummyConstantState extends Drawable.ConstantState {
        private DummyConstantState() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return BaseDrawable.this;
        }
    }

    BaseDrawable() {
    }

    private boolean updateTintFilter() {
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null && this.mTintMode != null) {
            this.mTintFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.mTintMode);
            return true;
        }
        boolean z5 = this.mTintFilter != null;
        this.mTintFilter = null;
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        onDraw(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    protected ColorFilter getColorFilterForDrawing() {
        ColorFilter colorFilter = this.mColorFilter;
        return colorFilter != null ? colorFilter : this.mTintFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.mConstantState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.mTintList;
        return colorStateList != null && colorStateList.isStateful();
    }

    protected abstract void onDraw(Canvas canvas, int i5, int i6);

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return updateTintFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (this.mAlpha != i5) {
            this.mAlpha = i5;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mColorFilter = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }
}
