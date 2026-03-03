package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l extends Drawable {

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static final double f1556 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: ᴵ, reason: contains not printable characters */
    static a f1557;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f1558;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Paint f1560;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Paint f1561;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final RectF f1562;

    /* renamed from: ˆ, reason: contains not printable characters */
    private float f1563;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Path f1564;

    /* renamed from: ˉ, reason: contains not printable characters */
    private float f1565;

    /* renamed from: ˊ, reason: contains not printable characters */
    private float f1566;

    /* renamed from: ˋ, reason: contains not printable characters */
    private float f1567;

    /* renamed from: ˎ, reason: contains not printable characters */
    private ColorStateList f1568;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final int f1570;

    /* renamed from: י, reason: contains not printable characters */
    private final int f1571;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f1569 = true;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f1572 = true;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f1573 = false;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Paint f1559 = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    interface a {
        /* renamed from: ʻ */
        void mo1666(Canvas canvas, RectF rectF, float f5, Paint paint);
    }

    l(Resources resources, ColorStateList colorStateList, float f5, float f6, float f7) {
        this.f1570 = resources.getColor(l.b.f8904);
        this.f1571 = resources.getColor(l.b.f8903);
        this.f1558 = resources.getDimensionPixelSize(l.c.f8905);
        m1702(colorStateList);
        Paint paint = new Paint(5);
        this.f1560 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1563 = (int) (f5 + 0.5f);
        this.f1562 = new RectF();
        Paint paint2 = new Paint(this.f1560);
        this.f1561 = paint2;
        paint2.setAntiAlias(false);
        m1703(f6, f7);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1697(Rect rect) {
        float f5 = this.f1565;
        float f6 = 1.5f * f5;
        this.f1562.set(rect.left + f5, rect.top + f6, rect.right - f5, rect.bottom - f6);
        m1698();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m1698() {
        float f5 = this.f1563;
        RectF rectF = new RectF(-f5, -f5, f5, f5);
        RectF rectF2 = new RectF(rectF);
        float f6 = this.f1566;
        rectF2.inset(-f6, -f6);
        Path path = this.f1564;
        if (path == null) {
            this.f1564 = new Path();
        } else {
            path.reset();
        }
        this.f1564.setFillType(Path.FillType.EVEN_ODD);
        this.f1564.moveTo(-this.f1563, 0.0f);
        this.f1564.rLineTo(-this.f1566, 0.0f);
        this.f1564.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1564.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1564.close();
        float f7 = this.f1563;
        float f8 = f7 / (this.f1566 + f7);
        Paint paint = this.f1560;
        float f9 = this.f1563 + this.f1566;
        int i5 = this.f1570;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{i5, i5, this.f1571}, new float[]{0.0f, f8, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1561;
        float f10 = this.f1563;
        float f11 = this.f1566;
        int i6 = this.f1570;
        paint2.setShader(new LinearGradient(0.0f, (-f10) + f11, 0.0f, (-f10) - f11, new int[]{i6, i6, this.f1571}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1561.setAntiAlias(false);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static float m1699(float f5, float f6, boolean z5) {
        if (!z5) {
            return f5;
        }
        double d6 = f5;
        double d7 = 1.0d - f1556;
        double d8 = f6;
        Double.isNaN(d8);
        Double.isNaN(d6);
        return (float) (d6 + (d7 * d8));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static float m1700(float f5, float f6, boolean z5) {
        if (!z5) {
            return f5 * 1.5f;
        }
        double d6 = f5 * 1.5f;
        double d7 = 1.0d - f1556;
        double d8 = f6;
        Double.isNaN(d8);
        Double.isNaN(d6);
        return (float) (d6 + (d7 * d8));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m1701(Canvas canvas) {
        float f5 = this.f1563;
        float f6 = (-f5) - this.f1566;
        float f7 = f5 + this.f1558 + (this.f1567 / 2.0f);
        float f8 = f7 * 2.0f;
        boolean z5 = this.f1562.width() - f8 > 0.0f;
        boolean z6 = this.f1562.height() - f8 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1562;
        canvas.translate(rectF.left + f7, rectF.top + f7);
        canvas.drawPath(this.f1564, this.f1560);
        if (z5) {
            canvas.drawRect(0.0f, f6, this.f1562.width() - f8, -this.f1563, this.f1561);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1562;
        canvas.translate(rectF2.right - f7, rectF2.bottom - f7);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1564, this.f1560);
        if (z5) {
            canvas.drawRect(0.0f, f6, this.f1562.width() - f8, (-this.f1563) + this.f1566, this.f1561);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1562;
        canvas.translate(rectF3.left + f7, rectF3.bottom - f7);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1564, this.f1560);
        if (z6) {
            canvas.drawRect(0.0f, f6, this.f1562.height() - f8, -this.f1563, this.f1561);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1562;
        canvas.translate(rectF4.right - f7, rectF4.top + f7);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1564, this.f1560);
        if (z6) {
            canvas.drawRect(0.0f, f6, this.f1562.height() - f8, -this.f1563, this.f1561);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m1702(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1568 = colorStateList;
        this.f1559.setColor(colorStateList.getColorForState(getState(), this.f1568.getDefaultColor()));
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m1703(float f5, float f6) {
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f5 + ". Must be >= 0");
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f6 + ". Must be >= 0");
        }
        float m1704 = m1704(f5);
        float m17042 = m1704(f6);
        if (m1704 > m17042) {
            if (!this.f1573) {
                this.f1573 = true;
            }
            m1704 = m17042;
        }
        if (this.f1567 == m1704 && this.f1565 == m17042) {
            return;
        }
        this.f1567 = m1704;
        this.f1565 = m17042;
        this.f1566 = (int) ((m1704 * 1.5f) + this.f1558 + 0.5f);
        this.f1569 = true;
        invalidateSelf();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int m1704(float f5) {
        int i5 = (int) (f5 + 0.5f);
        return i5 % 2 == 1 ? i5 - 1 : i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1569) {
            m1697(getBounds());
            this.f1569 = false;
        }
        canvas.translate(0.0f, this.f1567 / 2.0f);
        m1701(canvas);
        canvas.translate(0.0f, (-this.f1567) / 2.0f);
        f1557.mo1666(canvas, this.f1562, this.f1563, this.f1559);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m1700(this.f1565, this.f1563, this.f1572));
        int ceil2 = (int) Math.ceil(m1699(this.f1565, this.f1563, this.f1572));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1568;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1569 = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1568;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1559.getColor() == colorForState) {
            return false;
        }
        this.f1559.setColor(colorForState);
        this.f1569 = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f1559.setAlpha(i5);
        this.f1560.setAlpha(i5);
        this.f1561.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1559.setColorFilter(colorFilter);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    ColorStateList m1705() {
        return this.f1568;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    float m1706() {
        return this.f1563;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m1707(Rect rect) {
        getPadding(rect);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    float m1708() {
        return this.f1565;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    float m1709() {
        float f5 = this.f1565;
        return (Math.max(f5, this.f1563 + this.f1558 + ((f5 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1565 * 1.5f) + this.f1558) * 2.0f);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    float m1710() {
        float f5 = this.f1565;
        return (Math.max(f5, this.f1563 + this.f1558 + (f5 / 2.0f)) * 2.0f) + ((this.f1565 + this.f1558) * 2.0f);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    float m1711() {
        return this.f1567;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m1712(boolean z5) {
        this.f1572 = z5;
        invalidateSelf();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m1713(ColorStateList colorStateList) {
        m1702(colorStateList);
        invalidateSelf();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m1714(float f5) {
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f5 + ". Must be >= 0");
        }
        float f6 = (int) (f5 + 0.5f);
        if (this.f1563 == f6) {
            return;
        }
        this.f1563 = f6;
        this.f1569 = true;
        invalidateSelf();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m1715(float f5) {
        m1703(this.f1567, f5);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m1716(float f5) {
        m1703(f5, this.f1565);
    }
}
