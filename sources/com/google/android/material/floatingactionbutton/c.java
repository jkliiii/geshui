package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.g0;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* compiled from: BorderDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c extends Drawable {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Paint f5735;

    /* renamed from: ˉ, reason: contains not printable characters */
    float f5741;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f5742;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f5743;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f5744;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f5745;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f5746;

    /* renamed from: ـ, reason: contains not printable characters */
    private ShapeAppearanceModel f5748;

    /* renamed from: ٴ, reason: contains not printable characters */
    private ColorStateList f5749;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ShapeAppearancePathProvider f5734 = ShapeAppearancePathProvider.getInstance();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Path f5736 = new Path();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Rect f5737 = new Rect();

    /* renamed from: ʿ, reason: contains not printable characters */
    private final RectF f5738 = new RectF();

    /* renamed from: ˆ, reason: contains not printable characters */
    private final RectF f5739 = new RectF();

    /* renamed from: ˈ, reason: contains not printable characters */
    private final b f5740 = new b();

    /* renamed from: י, reason: contains not printable characters */
    private boolean f5747 = true;

    /* compiled from: BorderDrawable.java */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(ShapeAppearanceModel shapeAppearanceModel) {
        this.f5748 = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f5735 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Shader m6828() {
        copyBounds(this.f5737);
        float height = this.f5741 / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{g0.m2275(this.f5742, this.f5746), g0.m2275(this.f5743, this.f5746), g0.m2275(g0.m2279(this.f5743, 0), this.f5746), g0.m2275(g0.m2279(this.f5745, 0), this.f5746), g0.m2275(this.f5745, this.f5746), g0.m2275(this.f5744, this.f5746)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5747) {
            this.f5735.setShader(m6828());
            this.f5747 = false;
        }
        float strokeWidth = this.f5735.getStrokeWidth() / 2.0f;
        copyBounds(this.f5737);
        this.f5738.set(this.f5737);
        float min = Math.min(this.f5748.getTopLeftCornerSize().getCornerSize(m6829()), this.f5738.width() / 2.0f);
        if (this.f5748.isRoundRect(m6829())) {
            this.f5738.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f5738, min, min, this.f5735);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5740;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5741 > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f5748.isRoundRect(m6829())) {
            outline.setRoundRect(getBounds(), this.f5748.getTopLeftCornerSize().getCornerSize(m6829()));
        } else {
            copyBounds(this.f5737);
            this.f5738.set(this.f5737);
            this.f5734.calculatePath(this.f5748, 1.0f, this.f5738, this.f5736);
            DrawableUtils.setOutlineToPath(outline, this.f5736);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f5748.isRoundRect(m6829())) {
            return true;
        }
        int round = Math.round(this.f5741);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f5749;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f5747 = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f5749;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f5746)) != this.f5746) {
            this.f5747 = true;
            this.f5746 = colorForState;
        }
        if (this.f5747) {
            invalidateSelf();
        }
        return this.f5747;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f5735.setAlpha(i5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5735.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected RectF m6829() {
        this.f5739.set(getBounds());
        return this.f5739;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m6830(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f5746 = colorStateList.getColorForState(getState(), this.f5746);
        }
        this.f5749 = colorStateList;
        this.f5747 = true;
        invalidateSelf();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m6831(float f5) {
        if (this.f5741 != f5) {
            this.f5741 = f5;
            this.f5735.setStrokeWidth(f5 * 1.3333f);
            this.f5747 = true;
            invalidateSelf();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m6832(int i5, int i6, int i7, int i8) {
        this.f5742 = i5;
        this.f5743 = i6;
        this.f5744 = i7;
        this.f5745 = i8;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m6833(ShapeAppearanceModel shapeAppearanceModel) {
        this.f5748 = shapeAppearanceModel;
        invalidateSelf();
    }
}
