package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import c0.b;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends c {
    private static final c0.c<DeterminateDrawable> INDICATOR_LENGTH_IN_LEVEL = new a("indicatorLevel");
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private d<S> drawingDelegate;
    private float indicatorFraction;
    private boolean skipAnimationOnLevelChange;
    private final c0.d springAnimation;
    private final c0.e springForce;

    class a extends c0.c<DeterminateDrawable> {
        a(String str) {
            super(str);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.getIndicatorFraction() * 10000.0f;
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(DeterminateDrawable determinateDrawable, float f5) {
            determinateDrawable.setIndicatorFraction(f5 / 10000.0f);
        }
    }

    DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, d<S> dVar) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(dVar);
        c0.e eVar = new c0.e();
        this.springForce = eVar;
        eVar.m5812(1.0f);
        eVar.m5814(SPRING_FORCE_STIFFNESS);
        c0.d dVar2 = new c0.d(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = dVar2;
        dVar2.m5807(eVar);
        setGrowFraction(1.0f);
    }

    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, new com.google.android.material.progressindicator.a(circularProgressIndicatorSpec));
    }

    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, new f(linearProgressIndicatorSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.indicatorFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f5) {
        this.indicatorFraction = f5;
        invalidateSelf();
    }

    public void addSpringAnimationEndListener(b.p pVar) {
        this.springAnimation.m5763(pVar);
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.m7018(canvas, getBounds(), getGrowFraction());
            this.drawingDelegate.mo6988(canvas, this.paint);
            this.drawingDelegate.mo6987(canvas, this.paint, 0.0f, getIndicatorFraction(), MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    d<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.mo6989();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.mo6990();
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.springAnimation.m5808();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.m5808();
            setIndicatorFraction(i5 / 10000.0f);
            return true;
        }
        this.springAnimation.m5768(getIndicatorFraction() * 10000.0f);
        this.springAnimation.m5804(i5);
        return true;
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.registerAnimationCallback(bVar);
    }

    public void removeSpringAnimationEndListener(b.p pVar) {
        this.springAnimation.m5766(pVar);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i5) {
        super.setAlpha(i5);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    void setDrawingDelegate(d<S> dVar) {
        this.drawingDelegate = dVar;
        dVar.m7017(this);
    }

    void setLevelByFraction(float f5) {
        setLevel((int) (f5 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z5, boolean z6) {
        return super.setVisible(z5, z6);
    }

    @Override // com.google.android.material.progressindicator.c
    boolean setVisibleInternal(boolean z5, boolean z6, boolean z7) {
        boolean visibleInternal = super.setVisibleInternal(z5, z6, z7);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.skipAnimationOnLevelChange = true;
        } else {
            this.skipAnimationOnLevelChange = false;
            this.springForce.m5814(SPRING_FORCE_STIFFNESS / systemAnimatorDurationScale);
        }
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.unregisterAnimationCallback(bVar);
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z5, boolean z6, boolean z7) {
        return super.setVisible(z5, z6, z7);
    }
}
