package d2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: ShapeSprite.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class e extends f {

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private int f6849;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private int f6850;

    /* renamed from: ــ, reason: contains not printable characters */
    private Paint f6851;

    public e() {
        mo8195(-1);
        Paint paint = new Paint();
        this.f6851 = paint;
        paint.setAntiAlias(true);
        this.f6851.setColor(this.f6849);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private void m8192() {
        int alpha = getAlpha();
        int i5 = this.f6850;
        this.f6849 = ((((i5 >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i5 << 8) >>> 8);
    }

    @Override // d2.f, android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        super.setAlpha(i5);
        m8192();
    }

    @Override // d2.f, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6851.setColorFilter(colorFilter);
    }

    @Override // d2.f
    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void mo8193(Canvas canvas) {
        this.f6851.setColor(this.f6849);
        mo8191(canvas, this.f6851);
    }

    @Override // d2.f
    /* renamed from: ʽ, reason: contains not printable characters */
    public int mo8194() {
        return this.f6850;
    }

    /* renamed from: ˉˉ */
    public abstract void mo8191(Canvas canvas, Paint paint);

    @Override // d2.f
    /* renamed from: ᵢ, reason: contains not printable characters */
    public void mo8195(int i5) {
        this.f6850 = i5;
        m8192();
    }
}
