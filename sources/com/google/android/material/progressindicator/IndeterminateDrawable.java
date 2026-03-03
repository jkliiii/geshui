package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends c {
    private e<ObjectAnimator> animatorDelegate;
    private d<S> drawingDelegate;

    IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, d<S> dVar, e<ObjectAnimator> eVar) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(dVar);
        setAnimatorDelegate(eVar);
    }

    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, new a(circularProgressIndicatorSpec), new b(circularProgressIndicatorSpec));
    }

    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, new f(linearProgressIndicatorSpec), linearProgressIndicatorSpec.indeterminateAnimationType == 0 ? new g(linearProgressIndicatorSpec) : new h(context, linearProgressIndicatorSpec));
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.drawingDelegate.m7018(canvas, getBounds(), getGrowFraction());
        this.drawingDelegate.mo6988(canvas, this.paint);
        int i5 = 0;
        while (true) {
            e<ObjectAnimator> eVar = this.animatorDelegate;
            int[] iArr = eVar.f5938;
            if (i5 >= iArr.length) {
                canvas.restore();
                return;
            }
            d<S> dVar = this.drawingDelegate;
            Paint paint = this.paint;
            float[] fArr = eVar.f5937;
            int i6 = i5 * 2;
            dVar.mo6987(canvas, paint, fArr[i6], fArr[i6 + 1], iArr[i5]);
            i5++;
        }
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    e<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
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

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.registerAnimationCallback(bVar);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i5) {
        super.setAlpha(i5);
    }

    void setAnimatorDelegate(e<ObjectAnimator> eVar) {
        this.animatorDelegate = eVar;
        eVar.m7020(this);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    void setDrawingDelegate(d<S> dVar) {
        this.drawingDelegate = dVar;
        dVar.m7017(this);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z5, boolean z6) {
        return super.setVisible(z5, z6);
    }

    @Override // com.google.android.material.progressindicator.c
    boolean setVisibleInternal(boolean z5, boolean z6, boolean z7) {
        boolean visibleInternal = super.setVisibleInternal(z5, z6, z7);
        if (!isRunning()) {
            this.animatorDelegate.mo7003();
        }
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (z5 && (z7 || (Build.VERSION.SDK_INT <= 22 && systemAnimatorDurationScale > 0.0f))) {
            this.animatorDelegate.mo7007();
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
