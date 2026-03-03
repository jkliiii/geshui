package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.h;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Interpolator f4355 = new LinearInterpolator();

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Interpolator f4356 = new h0.b();

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final int[] f4357 = {-16777216};

    /* renamed from: ʾ, reason: contains not printable characters */
    private final c f4358;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f4359;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Resources f4360;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Animator f4361;

    /* renamed from: ˉ, reason: contains not printable characters */
    float f4362;

    /* renamed from: ˊ, reason: contains not printable characters */
    boolean f4363;

    /* compiled from: CircularProgressDrawable.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ c f4364;

        a(c cVar) {
            this.f4364 = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.m5263(floatValue, this.f4364);
            b.this.m5255(floatValue, this.f4364, false);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final RectF f4368 = new RectF();

        /* renamed from: ʼ, reason: contains not printable characters */
        final Paint f4369;

        /* renamed from: ʽ, reason: contains not printable characters */
        final Paint f4370;

        /* renamed from: ʾ, reason: contains not printable characters */
        final Paint f4371;

        /* renamed from: ʿ, reason: contains not printable characters */
        float f4372;

        /* renamed from: ˆ, reason: contains not printable characters */
        float f4373;

        /* renamed from: ˈ, reason: contains not printable characters */
        float f4374;

        /* renamed from: ˉ, reason: contains not printable characters */
        float f4375;

        /* renamed from: ˊ, reason: contains not printable characters */
        int[] f4376;

        /* renamed from: ˋ, reason: contains not printable characters */
        int f4377;

        /* renamed from: ˎ, reason: contains not printable characters */
        float f4378;

        /* renamed from: ˏ, reason: contains not printable characters */
        float f4379;

        /* renamed from: ˑ, reason: contains not printable characters */
        float f4380;

        /* renamed from: י, reason: contains not printable characters */
        boolean f4381;

        /* renamed from: ـ, reason: contains not printable characters */
        Path f4382;

        /* renamed from: ٴ, reason: contains not printable characters */
        float f4383;

        /* renamed from: ᐧ, reason: contains not printable characters */
        float f4384;

        /* renamed from: ᴵ, reason: contains not printable characters */
        int f4385;

        /* renamed from: ᵎ, reason: contains not printable characters */
        int f4386;

        /* renamed from: ᵔ, reason: contains not printable characters */
        int f4387;

        /* renamed from: ᵢ, reason: contains not printable characters */
        int f4388;

        c() {
            Paint paint = new Paint();
            this.f4369 = paint;
            Paint paint2 = new Paint();
            this.f4370 = paint2;
            Paint paint3 = new Paint();
            this.f4371 = paint3;
            this.f4372 = 0.0f;
            this.f4373 = 0.0f;
            this.f4374 = 0.0f;
            this.f4375 = 5.0f;
            this.f4383 = 1.0f;
            this.f4387 = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5264(Canvas canvas, Rect rect) {
            RectF rectF = this.f4368;
            float f5 = this.f4384;
            float f6 = (this.f4375 / 2.0f) + f5;
            if (f5 <= 0.0f) {
                f6 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f4385 * this.f4383) / 2.0f, this.f4375 / 2.0f);
            }
            rectF.set(rect.centerX() - f6, rect.centerY() - f6, rect.centerX() + f6, rect.centerY() + f6);
            float f7 = this.f4372;
            float f8 = this.f4374;
            float f9 = (f7 + f8) * 360.0f;
            float f10 = ((this.f4373 + f8) * 360.0f) - f9;
            this.f4369.setColor(this.f4388);
            this.f4369.setAlpha(this.f4387);
            float f11 = this.f4375 / 2.0f;
            rectF.inset(f11, f11);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4371);
            float f12 = -f11;
            rectF.inset(f12, f12);
            canvas.drawArc(rectF, f9, f10, false, this.f4369);
            m5265(canvas, f9, f10, rectF);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m5265(Canvas canvas, float f5, float f6, RectF rectF) {
            if (this.f4381) {
                Path path = this.f4382;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4382 = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f7 = (this.f4385 * this.f4383) / 2.0f;
                this.f4382.moveTo(0.0f, 0.0f);
                this.f4382.lineTo(this.f4385 * this.f4383, 0.0f);
                Path path3 = this.f4382;
                float f8 = this.f4385;
                float f9 = this.f4383;
                path3.lineTo((f8 * f9) / 2.0f, this.f4386 * f9);
                this.f4382.offset((min + rectF.centerX()) - f7, rectF.centerY() + (this.f4375 / 2.0f));
                this.f4382.close();
                this.f4370.setColor(this.f4388);
                this.f4370.setAlpha(this.f4387);
                canvas.save();
                canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4382, this.f4370);
                canvas.restore();
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        int m5266() {
            return this.f4387;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        float m5267() {
            return this.f4373;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        int m5268() {
            return this.f4376[m5269()];
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        int m5269() {
            return (this.f4377 + 1) % this.f4376.length;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        float m5270() {
            return this.f4372;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        int m5271() {
            return this.f4376[this.f4377];
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        float m5272() {
            return this.f4379;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        float m5273() {
            return this.f4380;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        float m5274() {
            return this.f4378;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        void m5275() {
            m5284(m5269());
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        void m5276() {
            this.f4378 = 0.0f;
            this.f4379 = 0.0f;
            this.f4380 = 0.0f;
            m5289(0.0f);
            m5286(0.0f);
            m5287(0.0f);
        }

        /* renamed from: י, reason: contains not printable characters */
        void m5277(int i5) {
            this.f4387 = i5;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        void m5278(float f5, float f6) {
            this.f4385 = (int) f5;
            this.f4386 = (int) f6;
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        void m5279(float f5) {
            if (f5 != this.f4383) {
                this.f4383 = f5;
            }
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        void m5280(float f5) {
            this.f4384 = f5;
        }

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        void m5281() {
            this.f4378 = this.f4372;
            this.f4379 = this.f4373;
            this.f4380 = this.f4374;
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        void m5282(int i5) {
            this.f4388 = i5;
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        void m5283(ColorFilter colorFilter) {
            this.f4369.setColorFilter(colorFilter);
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        void m5284(int i5) {
            this.f4377 = i5;
            this.f4388 = this.f4376[i5];
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        void m5285(int[] iArr) {
            this.f4376 = iArr;
            m5284(0);
        }

        /* renamed from: ⁱ, reason: contains not printable characters */
        void m5286(float f5) {
            this.f4373 = f5;
        }

        /* renamed from: ﹳ, reason: contains not printable characters */
        void m5287(float f5) {
            this.f4374 = f5;
        }

        /* renamed from: ﹶ, reason: contains not printable characters */
        void m5288(boolean z5) {
            if (this.f4381 != z5) {
                this.f4381 = z5;
            }
        }

        /* renamed from: ﾞ, reason: contains not printable characters */
        void m5289(float f5) {
            this.f4372 = f5;
        }

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        void m5290(float f5) {
            this.f4375 = f5;
            this.f4369.setStrokeWidth(f5);
        }
    }

    public b(Context context) {
        this.f4360 = ((Context) h.m2583(context)).getResources();
        c cVar = new c();
        this.f4358 = cVar;
        cVar.m5285(f4357);
        m5261(2.5f);
        m5254();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m5250(float f5, c cVar) {
        m5263(f5, cVar);
        float floor = (float) (Math.floor(cVar.m5273() / 0.8f) + 1.0d);
        cVar.m5289(cVar.m5274() + (((cVar.m5272() - 0.01f) - cVar.m5274()) * f5));
        cVar.m5286(cVar.m5272());
        cVar.m5287(cVar.m5273() + ((floor - cVar.m5273()) * f5));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private int m5251(float f5, int i5, int i6) {
        return ((((i5 >> 24) & 255) + ((int) ((((i6 >> 24) & 255) - r0) * f5))) << 24) | ((((i5 >> 16) & 255) + ((int) ((((i6 >> 16) & 255) - r1) * f5))) << 16) | ((((i5 >> 8) & 255) + ((int) ((((i6 >> 8) & 255) - r2) * f5))) << 8) | ((i5 & 255) + ((int) (f5 * ((i6 & 255) - r8))));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m5252(float f5) {
        this.f4359 = f5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m5253(float f5, float f6, float f7, float f8) {
        c cVar = this.f4358;
        float f9 = this.f4360.getDisplayMetrics().density;
        cVar.m5290(f6 * f9);
        cVar.m5280(f5 * f9);
        cVar.m5284(0);
        cVar.m5278(f7 * f9, f8 * f9);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m5254() {
        c cVar = this.f4358;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4355);
        ofFloat.addListener(new C0063b(cVar));
        this.f4361 = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4359, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4358.m5264(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4358.m5266();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4361.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f4358.m5277(i5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4358.m5283(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4361.cancel();
        this.f4358.m5281();
        if (this.f4358.m5267() != this.f4358.m5270()) {
            this.f4363 = true;
            this.f4361.setDuration(666L);
            this.f4361.start();
        } else {
            this.f4358.m5284(0);
            this.f4358.m5276();
            this.f4361.setDuration(1332L);
            this.f4361.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4361.cancel();
        m5252(0.0f);
        this.f4358.m5288(false);
        this.f4358.m5284(0);
        this.f4358.m5276();
        invalidateSelf();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m5255(float f5, c cVar, boolean z5) {
        float interpolation;
        float f6;
        if (this.f4363) {
            m5250(f5, cVar);
            return;
        }
        if (f5 != 1.0f || z5) {
            float m5273 = cVar.m5273();
            if (f5 < 0.5f) {
                interpolation = cVar.m5274();
                f6 = (f4356.getInterpolation(f5 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m5274 = cVar.m5274() + 0.79f;
                interpolation = m5274 - (((1.0f - f4356.getInterpolation((f5 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f6 = m5274;
            }
            float f7 = m5273 + (0.20999998f * f5);
            float f8 = (f5 + this.f4362) * 216.0f;
            cVar.m5289(interpolation);
            cVar.m5286(f6);
            cVar.m5287(f7);
            m5252(f8);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m5256(boolean z5) {
        this.f4358.m5288(z5);
        invalidateSelf();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m5257(float f5) {
        this.f4358.m5279(f5);
        invalidateSelf();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m5258(int... iArr) {
        this.f4358.m5285(iArr);
        this.f4358.m5284(0);
        invalidateSelf();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m5259(float f5) {
        this.f4358.m5287(f5);
        invalidateSelf();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m5260(float f5, float f6) {
        this.f4358.m5289(f5);
        this.f4358.m5286(f6);
        invalidateSelf();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m5261(float f5) {
        this.f4358.m5290(f5);
        invalidateSelf();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m5262(int i5) {
        if (i5 == 0) {
            m5253(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m5253(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: י, reason: contains not printable characters */
    void m5263(float f5, c cVar) {
        if (f5 > 0.75f) {
            cVar.m5282(m5251((f5 - 0.75f) / 0.25f, cVar.m5271(), cVar.m5268()));
        } else {
            cVar.m5282(cVar.m5271());
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0063b implements Animator.AnimatorListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ c f4366;

        C0063b(c cVar) {
            this.f4366 = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.m5255(1.0f, this.f4366, true);
            this.f4366.m5281();
            this.f4366.m5275();
            b bVar = b.this;
            if (!bVar.f4363) {
                bVar.f4362 += 1.0f;
                return;
            }
            bVar.f4363 = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f4366.m5288(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f4362 = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
