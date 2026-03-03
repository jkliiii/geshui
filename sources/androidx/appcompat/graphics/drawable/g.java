package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e.i;
import e.j;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends Drawable {

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final float f670 = (float) Math.toRadians(45.0d);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Paint f671;

    /* renamed from: ʼ, reason: contains not printable characters */
    private float f672;

    /* renamed from: ʽ, reason: contains not printable characters */
    private float f673;

    /* renamed from: ʾ, reason: contains not printable characters */
    private float f674;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f675;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f676;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Path f677;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f678;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f679;

    /* renamed from: ˋ, reason: contains not printable characters */
    private float f680;

    /* renamed from: ˎ, reason: contains not printable characters */
    private float f681;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f682;

    public g(Context context) {
        Paint paint = new Paint();
        this.f671 = paint;
        this.f677 = new Path();
        this.f679 = false;
        this.f682 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.f7138, e.a.f6918, i.f7074);
        m820(obtainStyledAttributes.getColor(j.f7142, 0));
        m819(obtainStyledAttributes.getDimension(j.f7146, 0.0f));
        m823(obtainStyledAttributes.getBoolean(j.f7145, true));
        m821(Math.round(obtainStyledAttributes.getDimension(j.f7144, 0.0f)));
        this.f678 = obtainStyledAttributes.getDimensionPixelSize(j.f7143, 0);
        this.f673 = Math.round(obtainStyledAttributes.getDimension(j.f7141, 0.0f));
        this.f672 = Math.round(obtainStyledAttributes.getDimension(j.f7139, 0.0f));
        this.f674 = obtainStyledAttributes.getDimension(j.f7140, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static float m818(float f5, float f6, float f7) {
        return f5 + ((f6 - f5) * f7);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i5 = this.f682;
        boolean z5 = false;
        if (i5 != 0 && (i5 == 1 || (i5 == 3 ? androidx.core.graphics.drawable.a.m2201(this) == 0 : androidx.core.graphics.drawable.a.m2201(this) == 1))) {
            z5 = true;
        }
        float f5 = this.f672;
        float m818 = m818(this.f673, (float) Math.sqrt(f5 * f5 * 2.0f), this.f680);
        float m8182 = m818(this.f673, this.f674, this.f680);
        float round = Math.round(m818(0.0f, this.f681, this.f680));
        float m8183 = m818(0.0f, f670, this.f680);
        float m8184 = m818(z5 ? 0.0f : -180.0f, z5 ? 180.0f : 0.0f, this.f680);
        double d6 = m818;
        double d7 = m8183;
        double cos = Math.cos(d7);
        Double.isNaN(d6);
        boolean z6 = z5;
        float round2 = Math.round(cos * d6);
        double sin = Math.sin(d7);
        Double.isNaN(d6);
        float round3 = Math.round(d6 * sin);
        this.f677.rewind();
        float m8185 = m818(this.f675 + this.f671.getStrokeWidth(), -this.f681, this.f680);
        float f6 = (-m8182) / 2.0f;
        this.f677.moveTo(f6 + round, 0.0f);
        this.f677.rLineTo(m8182 - (round * 2.0f), 0.0f);
        this.f677.moveTo(f6, m8185);
        this.f677.rLineTo(round2, round3);
        this.f677.moveTo(f6, -m8185);
        this.f677.rLineTo(round2, -round3);
        this.f677.close();
        canvas.save();
        float strokeWidth = this.f671.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f675);
        if (this.f676) {
            canvas.rotate(m8184 * (this.f679 ^ z6 ? -1 : 1));
        } else if (z6) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f677, this.f671);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f678;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f678;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (i5 != this.f671.getAlpha()) {
            this.f671.setAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f671.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m819(float f5) {
        if (this.f671.getStrokeWidth() != f5) {
            this.f671.setStrokeWidth(f5);
            double d6 = f5 / 2.0f;
            double cos = Math.cos(f670);
            Double.isNaN(d6);
            this.f681 = (float) (d6 * cos);
            invalidateSelf();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m820(int i5) {
        if (i5 != this.f671.getColor()) {
            this.f671.setColor(i5);
            invalidateSelf();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m821(float f5) {
        if (f5 != this.f675) {
            this.f675 = f5;
            invalidateSelf();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m822(float f5) {
        if (this.f680 != f5) {
            this.f680 = f5;
            invalidateSelf();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m823(boolean z5) {
        if (this.f676 != z5) {
            this.f676 = z5;
            invalidateSelf();
        }
    }
}
