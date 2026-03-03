package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k extends Drawable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private float f1545;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final RectF f1547;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Rect f1548;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f1549;

    /* renamed from: ˉ, reason: contains not printable characters */
    private ColorStateList f1552;

    /* renamed from: ˊ, reason: contains not printable characters */
    private PorterDuffColorFilter f1553;

    /* renamed from: ˋ, reason: contains not printable characters */
    private ColorStateList f1554;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f1550 = false;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f1551 = true;

    /* renamed from: ˎ, reason: contains not printable characters */
    private PorterDuff.Mode f1555 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Paint f1546 = new Paint(5);

    k(ColorStateList colorStateList, float f5) {
        this.f1545 = f5;
        m1689(colorStateList);
        this.f1547 = new RectF();
        this.f1548 = new Rect();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private PorterDuffColorFilter m1688(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m1689(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1552 = colorStateList;
        this.f1546.setColor(colorStateList.getColorForState(getState(), this.f1552.getDefaultColor()));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m1690(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1547.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1548.set(rect);
        if (this.f1550) {
            this.f1548.inset((int) Math.ceil(l.m1699(this.f1549, this.f1545, this.f1551)), (int) Math.ceil(l.m1700(this.f1549, this.f1545, this.f1551)));
            this.f1547.set(this.f1548);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z5;
        Paint paint = this.f1546;
        if (this.f1553 == null || paint.getColorFilter() != null) {
            z5 = false;
        } else {
            paint.setColorFilter(this.f1553);
            z5 = true;
        }
        RectF rectF = this.f1547;
        float f5 = this.f1545;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (z5) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1548, this.f1545);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1554;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1552) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1690(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1552;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z5 = colorForState != this.f1546.getColor();
        if (z5) {
            this.f1546.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1554;
        if (colorStateList2 == null || (mode = this.f1555) == null) {
            return z5;
        }
        this.f1553 = m1688(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f1546.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1546.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1554 = colorStateList;
        this.f1553 = m1688(colorStateList, this.f1555);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1555 = mode;
        this.f1553 = m1688(this.f1554, mode);
        invalidateSelf();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public ColorStateList m1691() {
        return this.f1552;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    float m1692() {
        return this.f1549;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public float m1693() {
        return this.f1545;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m1694(ColorStateList colorStateList) {
        m1689(colorStateList);
        invalidateSelf();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m1695(float f5, boolean z5, boolean z6) {
        if (f5 == this.f1549 && this.f1550 == z5 && this.f1551 == z6) {
            return;
        }
        this.f1549 = f5;
        this.f1550 = z5;
        this.f1551 = z6;
        m1690(null);
        invalidateSelf();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m1696(float f5) {
        if (f5 == this.f1545) {
            return;
        }
        this.f1545 = f5;
        m1690(null);
        invalidateSelf();
    }
}
