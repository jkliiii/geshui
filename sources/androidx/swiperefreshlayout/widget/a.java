package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.f1;

/* compiled from: CircleImageView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a extends ImageView {

    /* renamed from: ʾ, reason: contains not printable characters */
    private Animation.AnimationListener f4349;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f4350;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f4351;

    /* compiled from: CircleImageView.java */
    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private static class C0062a extends OvalShape {

        /* renamed from: ʾ, reason: contains not printable characters */
        private Paint f4352 = new Paint();

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f4353;

        /* renamed from: ˆ, reason: contains not printable characters */
        private a f4354;

        C0062a(a aVar, int i5) {
            this.f4354 = aVar;
            this.f4353 = i5;
            m5249((int) rect().width());
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m5249(int i5) {
            float f5 = i5 / 2;
            this.f4352.setShader(new RadialGradient(f5, f5, this.f4353, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f4354.getWidth() / 2;
            float height = this.f4354.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f4352);
            canvas.drawCircle(width, height, r0 - this.f4353, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f5, float f6) {
            super.onResize(f5, f6);
            m5249((int) f5);
        }
    }

    a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f5 = getContext().getResources().getDisplayMetrics().density;
        int i5 = (int) (1.75f * f5);
        int i6 = (int) (0.0f * f5);
        this.f4350 = (int) (3.5f * f5);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(p0.a.f10162);
        this.f4351 = obtainStyledAttributes.getColor(p0.a.f10163, -328966);
        obtainStyledAttributes.recycle();
        if (m5247()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            f1.m2840(this, f5 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0062a(this, this.f4350));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f4350, i6, i5, 503316480);
            int i7 = this.f4350;
            setPadding(i7, i7, i7, i7);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f4351);
        f1.m2836(this, shapeDrawable);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m5247() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4349;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4349;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (m5247()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f4350 * 2), getMeasuredHeight() + (this.f4350 * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i5);
            this.f4351 = i5;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m5248(Animation.AnimationListener animationListener) {
        this.f4349 = animationListener;
    }
}
