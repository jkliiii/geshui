package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.f;
import androidx.core.content.a;
import com.google.android.material.R;

@Deprecated
/* loaded from: E:\78999\cookie_5123796.dex */
public class ShadowDrawableWrapper extends f {
    static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    final RectF contentBounds;
    float cornerRadius;
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty;
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f5, float f6, float f7) {
        super(drawable);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        this.shadowStartColor = a.m1991(context, R.color.design_fab_shadow_start_color);
        this.shadowMiddleColor = a.m1991(context, R.color.design_fab_shadow_mid_color);
        this.shadowEndColor = a.m1991(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.cornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.cornerRadius = Math.round(f5);
        this.contentBounds = new RectF();
        Paint paint2 = new Paint(paint);
        this.edgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f6, f7);
    }

    private void buildComponents(Rect rect) {
        float f5 = this.rawMaxShadowSize;
        float f6 = SHADOW_MULTIPLIER * f5;
        this.contentBounds.set(rect.left + f5, rect.top + f6, rect.right - f5, rect.bottom - f6);
        Drawable drawable = getDrawable();
        RectF rectF = this.contentBounds;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f5 = this.cornerRadius;
        RectF rectF = new RectF(-f5, -f5, f5, f5);
        RectF rectF2 = new RectF(rectF);
        float f6 = this.shadowSize;
        rectF2.inset(-f6, -f6);
        Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.cornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f7 = -rectF2.top;
        if (f7 > 0.0f) {
            float f8 = this.cornerRadius / f7;
            this.cornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f7, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, f8, ((1.0f - f8) / 2.0f) + f8, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.edgeShadowPaint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, SHADOW_HORIZ_SCALE, 1.0f}, Shader.TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f5, float f6, boolean z5) {
        if (!z5) {
            return f5;
        }
        double d6 = f5;
        double d7 = 1.0d - COS_45;
        double d8 = f6;
        Double.isNaN(d8);
        Double.isNaN(d6);
        return (float) (d6 + (d7 * d8));
    }

    public static float calculateVerticalPadding(float f5, float f6, boolean z5) {
        if (!z5) {
            return f5 * SHADOW_MULTIPLIER;
        }
        double d6 = f5 * SHADOW_MULTIPLIER;
        double d7 = 1.0d - COS_45;
        double d8 = f6;
        Double.isNaN(d8);
        Double.isNaN(d6);
        return (float) (d6 + (d7 * d8));
    }

    private void drawShadow(Canvas canvas) {
        int i5;
        float f5;
        int i6;
        float f6;
        float f7;
        float f8;
        int save = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f9 = this.cornerRadius;
        float f10 = (-f9) - this.shadowSize;
        float f11 = f9 * 2.0f;
        boolean z5 = this.contentBounds.width() - f11 > 0.0f;
        boolean z6 = this.contentBounds.height() - f11 > 0.0f;
        float f12 = this.rawShadowSize;
        float f13 = f12 - (SHADOW_TOP_SCALE * f12);
        float f14 = f9 / ((f12 - (SHADOW_HORIZ_SCALE * f12)) + f9);
        float f15 = f9 / (f13 + f9);
        float f16 = f9 / ((f12 - (f12 * 1.0f)) + f9);
        int save2 = canvas.save();
        RectF rectF = this.contentBounds;
        canvas.translate(rectF.left + f9, rectF.top + f9);
        canvas.scale(f14, f15);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z5) {
            canvas.scale(1.0f / f14, 1.0f);
            i5 = save2;
            f5 = f16;
            i6 = save;
            f6 = f15;
            canvas.drawRect(0.0f, f10, this.contentBounds.width() - f11, -this.cornerRadius, this.edgeShadowPaint);
        } else {
            i5 = save2;
            f5 = f16;
            i6 = save;
            f6 = f15;
        }
        canvas.restoreToCount(i5);
        int save3 = canvas.save();
        RectF rectF2 = this.contentBounds;
        canvas.translate(rectF2.right - f9, rectF2.bottom - f9);
        float f17 = f5;
        canvas.scale(f14, f17);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z5) {
            canvas.scale(1.0f / f14, 1.0f);
            f7 = f6;
            f8 = f17;
            canvas.drawRect(0.0f, f10, this.contentBounds.width() - f11, (-this.cornerRadius) + this.shadowSize, this.edgeShadowPaint);
        } else {
            f7 = f6;
            f8 = f17;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.contentBounds;
        canvas.translate(rectF3.left + f9, rectF3.bottom - f9);
        canvas.scale(f14, f8);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z6) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f10, this.contentBounds.height() - f11, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.contentBounds;
        canvas.translate(rectF4.right - f9, rectF4.top + f9);
        float f18 = f7;
        canvas.scale(f14, f18);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z6) {
            canvas.scale(1.0f / f18, 1.0f);
            canvas.drawRect(0.0f, f10, this.contentBounds.height() - f11, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i6);
    }

    private static int toEven(float f5) {
        int round = Math.round(f5);
        return round % 2 == 1 ? round - 1 : round;
    }

    @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinHeight() {
        float f5 = this.rawMaxShadowSize;
        return (Math.max(f5, this.cornerRadius + ((f5 * SHADOW_MULTIPLIER) / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * SHADOW_MULTIPLIER * 2.0f);
    }

    public float getMinWidth() {
        float f5 = this.rawMaxShadowSize;
        return (Math.max(f5, this.cornerRadius + (f5 / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 2.0f);
    }

    @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean z5) {
        this.addPaddingForCorners = z5;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        super.setAlpha(i5);
        this.cornerShadowPaint.setAlpha(i5);
        this.edgeShadowPaint.setAlpha(i5);
    }

    public void setCornerRadius(float f5) {
        float round = Math.round(f5);
        if (this.cornerRadius == round) {
            return;
        }
        this.cornerRadius = round;
        this.dirty = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f5) {
        setShadowSize(this.rawShadowSize, f5);
    }

    public final void setRotation(float f5) {
        if (this.rotation != f5) {
            this.rotation = f5;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f5, float f6) {
        if (f5 < 0.0f || f6 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float even = toEven(f5);
        float even2 = toEven(f6);
        if (even > even2) {
            if (!this.printedShadowClipWarning) {
                this.printedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.rawShadowSize == even && this.rawMaxShadowSize == even2) {
            return;
        }
        this.rawShadowSize = even;
        this.rawMaxShadowSize = even2;
        this.shadowSize = Math.round(even * SHADOW_MULTIPLIER);
        this.maxShadowSize = even2;
        this.dirty = true;
        invalidateSelf();
    }

    public void setShadowSize(float f5) {
        setShadowSize(f5, this.rawMaxShadowSize);
    }
}
