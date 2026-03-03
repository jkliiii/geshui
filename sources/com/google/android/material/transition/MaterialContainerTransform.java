package com.google.android.material.transition;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.f1;
import androidx.transition.q;
import androidx.transition.x;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MaterialContainerTransform extends q {
    private static final c DEFAULT_RETURN_THRESHOLDS;
    private static final c DEFAULT_RETURN_THRESHOLDS_ARC;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private boolean appliedThemeValues;
    private int containerColor;
    private boolean drawDebugEnabled;
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    private int endContainerColor;
    private float endElevation;
    private ShapeAppearanceModel endShapeAppearanceModel;
    private View endView;
    private int endViewId;
    private int fadeMode;
    private ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;
    private ProgressThresholds scaleMaskProgressThresholds;
    private ProgressThresholds scaleProgressThresholds;
    private int scrimColor;
    private ProgressThresholds shapeMaskProgressThresholds;
    private int startContainerColor;
    private float startElevation;
    private ShapeAppearanceModel startShapeAppearanceModel;
    private View startView;
    private int startViewId;
    private int transitionDirection;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    private static final c DEFAULT_ENTER_THRESHOLDS = new c(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f), null);
    private static final c DEFAULT_ENTER_THRESHOLDS_ARC = new c(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f), null);

    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    public static class ProgressThresholds {
        private final float end;
        private final float start;

        public ProgressThresholds(float f5, float f6) {
            this.start = f5;
            this.end = f6;
        }

        public float getEnd() {
            return this.end;
        }

        public float getStart() {
            return this.start;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d f6436;

        a(d dVar) {
            this.f6436 = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6436.m7671(valueAnimator.getAnimatedFraction());
        }
    }

    class b extends i {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6438;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ d f6439;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f6440;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ View f6441;

        b(View view, d dVar, View view2, View view3) {
            this.f6438 = view;
            this.f6439 = dVar;
            this.f6440 = view2;
            this.f6441 = view3;
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʻ */
        public void mo5348(q qVar) {
            ViewUtils.getOverlay(this.f6438).add(this.f6439);
            this.f6440.setAlpha(0.0f);
            this.f6441.setAlpha(0.0f);
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            MaterialContainerTransform.this.removeListener(this);
            if (MaterialContainerTransform.this.holdAtEndEnabled) {
                return;
            }
            this.f6440.setAlpha(1.0f);
            this.f6441.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f6438).remove(this.f6439);
        }
    }

    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ProgressThresholds f6443;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final ProgressThresholds f6444;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final ProgressThresholds f6445;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final ProgressThresholds f6446;

        /* synthetic */ c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, a aVar) {
            this(progressThresholds, progressThresholds2, progressThresholds3, progressThresholds4);
        }

        private c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f6443 = progressThresholds;
            this.f6444 = progressThresholds2;
            this.f6445 = progressThresholds3;
            this.f6446 = progressThresholds4;
        }
    }

    private static final class d extends Drawable {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final View f6447;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        private final com.google.android.material.transition.d f6448;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final RectF f6449;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        private final Paint f6450;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final ShapeAppearanceModel f6451;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        private final boolean f6452;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final float f6453;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        private com.google.android.material.transition.c f6454;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final View f6455;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        private final Path f6456;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final RectF f6457;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        private RectF f6458;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final ShapeAppearanceModel f6459;

        /* renamed from: ˈˈ, reason: contains not printable characters */
        private float f6460;

        /* renamed from: ˉ, reason: contains not printable characters */
        private final float f6461;

        /* renamed from: ˉˉ, reason: contains not printable characters */
        private float f6462;

        /* renamed from: ˊ, reason: contains not printable characters */
        private final Paint f6463;

        /* renamed from: ˋ, reason: contains not printable characters */
        private final Paint f6464;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        private float f6465;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final Paint f6466;

        /* renamed from: ˏ, reason: contains not printable characters */
        private final Paint f6467;

        /* renamed from: ˑ, reason: contains not printable characters */
        private final Paint f6468;

        /* renamed from: י, reason: contains not printable characters */
        private final g f6469;

        /* renamed from: ـ, reason: contains not printable characters */
        private final PathMeasure f6470;

        /* renamed from: ــ, reason: contains not printable characters */
        private f f6471;

        /* renamed from: ٴ, reason: contains not printable characters */
        private final float f6472;

        /* renamed from: ᐧ, reason: contains not printable characters */
        private final float[] f6473;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        private final c f6474;

        /* renamed from: ᴵ, reason: contains not printable characters */
        private final boolean f6475;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        private final com.google.android.material.transition.a f6476;

        /* renamed from: ᵎ, reason: contains not printable characters */
        private final float f6477;

        /* renamed from: ᵔ, reason: contains not printable characters */
        private final float f6478;

        /* renamed from: ᵢ, reason: contains not printable characters */
        private final boolean f6479;

        /* renamed from: ⁱ, reason: contains not printable characters */
        private final MaterialShapeDrawable f6480;

        /* renamed from: ﹳ, reason: contains not printable characters */
        private final RectF f6481;

        /* renamed from: ﹶ, reason: contains not printable characters */
        private final RectF f6482;

        /* renamed from: ﾞ, reason: contains not printable characters */
        private final RectF f6483;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        private final RectF f6484;

        class a implements CanvasCompat.CanvasOperation {
            a() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                d.this.f6447.draw(canvas);
            }
        }

        class b implements CanvasCompat.CanvasOperation {
            b() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                d.this.f6455.draw(canvas);
            }
        }

        /* synthetic */ d(androidx.transition.h hVar, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f6, int i5, int i6, int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.a aVar, com.google.android.material.transition.d dVar, c cVar, boolean z7, a aVar2) {
            this(hVar, view, rectF, shapeAppearanceModel, f5, view2, rectF2, shapeAppearanceModel2, f6, i5, i6, i7, i8, z5, z6, aVar, dVar, cVar, z7);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private static float m7660(RectF rectF, float f5) {
            return ((rectF.centerX() / (f5 / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private static float m7661(RectF rectF, float f5) {
            return (rectF.centerY() / f5) * 1.5f;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private void m7662(Canvas canvas, RectF rectF, Path path, int i5) {
            PointF m7669 = m7669(rectF);
            if (this.f6465 == 0.0f) {
                path.reset();
                path.moveTo(m7669.x, m7669.y);
            } else {
                path.lineTo(m7669.x, m7669.y);
                this.f6450.setColor(i5);
                canvas.drawPath(path, this.f6450);
            }
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private void m7663(Canvas canvas, RectF rectF, int i5) {
            this.f6450.setColor(i5);
            canvas.drawRect(rectF, this.f6450);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private void m7664(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f6469.m7685(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m7666(canvas);
            } else {
                m7665(canvas);
            }
            canvas.restore();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private void m7665(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f6480;
            RectF rectF = this.f6458;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f6480.setElevation(this.f6462);
            this.f6480.setShadowVerticalOffset((int) this.f6460);
            this.f6480.setShapeAppearanceModel(this.f6469.m7684());
            this.f6480.draw(canvas);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        private void m7666(Canvas canvas) {
            ShapeAppearanceModel m7684 = this.f6469.m7684();
            if (!m7684.isRoundRect(this.f6458)) {
                canvas.drawPath(this.f6469.m7685(), this.f6467);
            } else {
                float cornerSize = m7684.getTopLeftCornerSize().getCornerSize(this.f6458);
                canvas.drawRoundRect(this.f6458, cornerSize, cornerSize, this.f6467);
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        private void m7667(Canvas canvas) {
            m7670(canvas, this.f6466);
            Rect bounds = getBounds();
            RectF rectF = this.f6483;
            k.m7707(canvas, bounds, rectF.left, rectF.top, this.f6471.f6504, this.f6454.f6499, new b());
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        private void m7668(Canvas canvas) {
            m7670(canvas, this.f6464);
            Rect bounds = getBounds();
            RectF rectF = this.f6481;
            k.m7707(canvas, bounds, rectF.left, rectF.top, this.f6471.f6503, this.f6454.f6498, new a());
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private static PointF m7669(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: י, reason: contains not printable characters */
        private void m7670(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ـ, reason: contains not printable characters */
        public void m7671(float f5) {
            if (this.f6465 != f5) {
                m7672(f5);
            }
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        private void m7672(float f5) {
            float f6;
            float f7;
            this.f6465 = f5;
            this.f6468.setAlpha((int) (this.f6475 ? k.m7697(0.0f, 255.0f, f5) : k.m7697(255.0f, 0.0f, f5)));
            this.f6470.getPosTan(this.f6472 * f5, this.f6473, null);
            float[] fArr = this.f6473;
            float f8 = fArr[0];
            float f9 = fArr[1];
            if (f5 > 1.0f || f5 < 0.0f) {
                if (f5 > 1.0f) {
                    f7 = (f5 - 1.0f) / 0.00999999f;
                    f6 = 0.99f;
                } else {
                    f6 = 0.01f;
                    f7 = (f5 / 0.01f) * MaterialContainerTransform.ELEVATION_NOT_SET;
                }
                this.f6470.getPosTan(this.f6472 * f6, fArr, null);
                float[] fArr2 = this.f6473;
                f8 += (f8 - fArr2[0]) * f7;
                f9 += (f9 - fArr2[1]) * f7;
            }
            float f10 = f8;
            float f11 = f9;
            f mo7677 = this.f6448.mo7677(f5, ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6474.f6444.start))).floatValue(), ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6474.f6444.end))).floatValue(), this.f6449.width(), this.f6449.height(), this.f6457.width(), this.f6457.height());
            this.f6471 = mo7677;
            RectF rectF = this.f6481;
            float f12 = mo7677.f6505;
            rectF.set(f10 - (f12 / 2.0f), f11, (f12 / 2.0f) + f10, mo7677.f6506 + f11);
            RectF rectF2 = this.f6483;
            f fVar = this.f6471;
            float f13 = fVar.f6507;
            rectF2.set(f10 - (f13 / 2.0f), f11, f10 + (f13 / 2.0f), fVar.f6508 + f11);
            this.f6482.set(this.f6481);
            this.f6484.set(this.f6483);
            float floatValue = ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6474.f6445.start))).floatValue();
            float floatValue2 = ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6474.f6445.end))).floatValue();
            boolean mo7679 = this.f6448.mo7679(this.f6471);
            RectF rectF3 = mo7679 ? this.f6482 : this.f6484;
            float m7698 = k.m7698(0.0f, 1.0f, floatValue, floatValue2, f5);
            if (!mo7679) {
                m7698 = 1.0f - m7698;
            }
            this.f6448.mo7678(rectF3, m7698, this.f6471);
            this.f6458 = new RectF(Math.min(this.f6482.left, this.f6484.left), Math.min(this.f6482.top, this.f6484.top), Math.max(this.f6482.right, this.f6484.right), Math.max(this.f6482.bottom, this.f6484.bottom));
            this.f6469.m7683(f5, this.f6451, this.f6459, this.f6481, this.f6482, this.f6484, this.f6474.f6446);
            this.f6462 = k.m7697(this.f6453, this.f6461, f5);
            float m7660 = m7660(this.f6458, this.f6477);
            float m7661 = m7661(this.f6458, this.f6478);
            float f14 = this.f6462;
            float f15 = (int) (m7661 * f14);
            this.f6460 = f15;
            this.f6467.setShadowLayer(f14, (int) (m7660 * f14), f15, 754974720);
            this.f6454 = this.f6476.mo7673(f5, ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6474.f6443.start))).floatValue(), ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6474.f6443.end))).floatValue(), 0.35f);
            if (this.f6464.getColor() != 0) {
                this.f6464.setAlpha(this.f6454.f6498);
            }
            if (this.f6466.getColor() != 0) {
                this.f6466.setAlpha(this.f6454.f6499);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f6468.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f6468);
            }
            int save = this.f6452 ? canvas.save() : -1;
            if (this.f6479 && this.f6462 > 0.0f) {
                m7664(canvas);
            }
            this.f6469.m7682(canvas);
            m7670(canvas, this.f6463);
            if (this.f6454.f6500) {
                m7668(canvas);
                m7667(canvas);
            } else {
                m7667(canvas);
                m7668(canvas);
            }
            if (this.f6452) {
                canvas.restoreToCount(save);
                m7662(canvas, this.f6481, this.f6456, -65281);
                m7663(canvas, this.f6482, -256);
                m7663(canvas, this.f6481, -16711936);
                m7663(canvas, this.f6484, -16711681);
                m7663(canvas, this.f6483, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private d(androidx.transition.h hVar, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f6, int i5, int i6, int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.a aVar, com.google.android.material.transition.d dVar, c cVar, boolean z7) {
            Paint paint = new Paint();
            this.f6463 = paint;
            Paint paint2 = new Paint();
            this.f6464 = paint2;
            Paint paint3 = new Paint();
            this.f6466 = paint3;
            this.f6467 = new Paint();
            Paint paint4 = new Paint();
            this.f6468 = paint4;
            this.f6469 = new g();
            this.f6473 = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f6480 = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f6450 = paint5;
            this.f6456 = new Path();
            this.f6447 = view;
            this.f6449 = rectF;
            this.f6451 = shapeAppearanceModel;
            this.f6453 = f5;
            this.f6455 = view2;
            this.f6457 = rectF2;
            this.f6459 = shapeAppearanceModel2;
            this.f6461 = f6;
            this.f6475 = z5;
            this.f6479 = z6;
            this.f6476 = aVar;
            this.f6448 = dVar;
            this.f6474 = cVar;
            this.f6452 = z7;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f6477 = r12.widthPixels;
            this.f6478 = r12.heightPixels;
            paint.setColor(i5);
            paint2.setColor(i6);
            paint3.setColor(i7);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f6481 = rectF3;
            this.f6482 = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f6483 = rectF4;
            this.f6484 = new RectF(rectF4);
            PointF m7669 = m7669(rectF);
            PointF m76692 = m7669(rectF2);
            PathMeasure pathMeasure = new PathMeasure(hVar.getPath(m7669.x, m7669.y, m76692.x, m76692.y), false);
            this.f6470 = pathMeasure;
            this.f6472 = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(k.m7689(i8));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m7672(0.0f);
        }
    }

    static {
        a aVar = null;
        DEFAULT_RETURN_THRESHOLDS = new c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f), aVar);
        DEFAULT_RETURN_THRESHOLDS_ARC = new c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f), aVar);
    }

    public MaterialContainerTransform() {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = ELEVATION_NOT_SET;
        this.endElevation = ELEVATION_NOT_SET;
    }

    private c buildThresholdsGroup(boolean z5) {
        return getPathMotion() instanceof MaterialArcMotion ? getThresholdsOrDefault(z5, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC) : getThresholdsOrDefault(z5, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private static RectF calculateDrawableBounds(View view, View view2, float f5, float f6) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF m7693 = k.m7693(view2);
        m7693.offset(f5, f6);
        return m7693;
    }

    private static ShapeAppearanceModel captureShapeAppearance(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return k.m7688(getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    private static void captureValues(x xVar, View view, int i5, ShapeAppearanceModel shapeAppearanceModel) {
        if (i5 != -1) {
            xVar.f4581 = k.m7692(xVar.f4581, i5);
        } else if (view != null) {
            xVar.f4581 = view;
        } else {
            View view2 = xVar.f4581;
            int i6 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view2.getTag(i6) instanceof View) {
                View view3 = (View) xVar.f4581.getTag(i6);
                xVar.f4581.setTag(i6, null);
                xVar.f4581 = view3;
            }
        }
        View view4 = xVar.f4581;
        if (!f1.m2808(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF m7694 = view4.getParent() == null ? k.m7694(view4) : k.m7693(view4);
        xVar.f4580.put(PROP_BOUNDS, m7694);
        xVar.f4580.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view4, m7694, shapeAppearanceModel));
    }

    private static float getElevationOrDefault(float f5, View view) {
        return f5 != ELEVATION_NOT_SET ? f5 : f1.m2904(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ShapeAppearanceModel getShapeAppearance(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        int i5 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
        if (view.getTag(i5) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(i5);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        return transitionShapeAppearanceResId != -1 ? ShapeAppearanceModel.builder(context, transitionShapeAppearanceResId, 0).build() : view instanceof Shapeable ? ((Shapeable) view).getShapeAppearanceModel() : ShapeAppearanceModel.builder().build();
    }

    private c getThresholdsOrDefault(boolean z5, c cVar, c cVar2) {
        if (!z5) {
            cVar = cVar2;
        }
        return new c((ProgressThresholds) k.m7690(this.fadeProgressThresholds, cVar.f6443), (ProgressThresholds) k.m7690(this.scaleProgressThresholds, cVar.f6444), (ProgressThresholds) k.m7690(this.scaleMaskProgressThresholds, cVar.f6445), (ProgressThresholds) k.m7690(this.shapeMaskProgressThresholds, cVar.f6446), null);
    }

    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i5 = this.transitionDirection;
        if (i5 == 0) {
            return k.m7687(rectF2) > k.m7687(rectF);
        }
        if (i5 == 1) {
            return true;
        }
        if (i5 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.transitionDirection);
    }

    private void maybeApplyThemeValues(Context context, boolean z5) {
        k.m7703(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        k.m7702(this, context, z5 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.pathMotionCustom) {
            return;
        }
        k.m7704(this, context, com.google.android.material.R.attr.motionPath);
    }

    @Override // androidx.transition.q
    public void captureEndValues(x xVar) {
        captureValues(xVar, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    @Override // androidx.transition.q
    public void captureStartValues(x xVar) {
        captureValues(xVar, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    @Override // androidx.transition.q
    public Animator createAnimator(ViewGroup viewGroup, x xVar, x xVar2) {
        View m7691;
        View view;
        if (xVar != null && xVar2 != null) {
            RectF rectF = (RectF) xVar.f4580.get(PROP_BOUNDS);
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) xVar.f4580.get(PROP_SHAPE_APPEARANCE);
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) xVar2.f4580.get(PROP_BOUNDS);
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) xVar2.f4580.get(PROP_SHAPE_APPEARANCE);
                if (rectF2 == null || shapeAppearanceModel2 == null) {
                    Log.w(TAG, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = xVar.f4581;
                View view3 = xVar2.f4581;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.drawingViewId == view4.getId()) {
                    m7691 = (View) view4.getParent();
                    view = view4;
                } else {
                    m7691 = k.m7691(view4, this.drawingViewId);
                    view = null;
                }
                RectF m7693 = k.m7693(m7691);
                float f5 = -m7693.left;
                float f6 = -m7693.top;
                RectF calculateDrawableBounds = calculateDrawableBounds(m7691, view, f5, f6);
                rectF.offset(f5, f6);
                rectF2.offset(f5, f6);
                boolean isEntering = isEntering(rectF, rectF2);
                if (!this.appliedThemeValues) {
                    maybeApplyThemeValues(view4.getContext(), isEntering);
                }
                d dVar = new d(getPathMotion(), view2, rectF, shapeAppearanceModel, getElevationOrDefault(this.startElevation, view2), view3, rectF2, shapeAppearanceModel2, getElevationOrDefault(this.endElevation, view3), this.containerColor, this.startContainerColor, this.endContainerColor, this.scrimColor, isEntering, this.elevationShadowEnabled, com.google.android.material.transition.b.m7674(this.fadeMode, isEntering), e.m7680(this.fitMode, isEntering, rectF, rectF2), buildThresholdsGroup(isEntering), this.drawDebugEnabled, null);
                dVar.setBounds(Math.round(calculateDrawableBounds.left), Math.round(calculateDrawableBounds.top), Math.round(calculateDrawableBounds.right), Math.round(calculateDrawableBounds.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(dVar));
                addListener(new b(m7691, dVar, view2, view3));
                return ofFloat;
            }
            Log.w(TAG, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public View getEndView() {
        return this.endView;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public ProgressThresholds getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public ProgressThresholds getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public View getStartView() {
        return this.startView;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    @Override // androidx.transition.q
    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(int i5) {
        this.containerColor = i5;
        this.startContainerColor = i5;
        this.endContainerColor = i5;
    }

    public void setContainerColor(int i5) {
        this.containerColor = i5;
    }

    public void setDrawDebugEnabled(boolean z5) {
        this.drawDebugEnabled = z5;
    }

    public void setDrawingViewId(int i5) {
        this.drawingViewId = i5;
    }

    public void setElevationShadowEnabled(boolean z5) {
        this.elevationShadowEnabled = z5;
    }

    public void setEndContainerColor(int i5) {
        this.endContainerColor = i5;
    }

    public void setEndElevation(float f5) {
        this.endElevation = f5;
    }

    public void setEndShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.endShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setEndView(View view) {
        this.endView = view;
    }

    public void setEndViewId(int i5) {
        this.endViewId = i5;
    }

    public void setFadeMode(int i5) {
        this.fadeMode = i5;
    }

    public void setFadeProgressThresholds(ProgressThresholds progressThresholds) {
        this.fadeProgressThresholds = progressThresholds;
    }

    public void setFitMode(int i5) {
        this.fitMode = i5;
    }

    public void setHoldAtEndEnabled(boolean z5) {
        this.holdAtEndEnabled = z5;
    }

    @Override // androidx.transition.q
    public void setPathMotion(androidx.transition.h hVar) {
        super.setPathMotion(hVar);
        this.pathMotionCustom = true;
    }

    public void setScaleMaskProgressThresholds(ProgressThresholds progressThresholds) {
        this.scaleMaskProgressThresholds = progressThresholds;
    }

    public void setScaleProgressThresholds(ProgressThresholds progressThresholds) {
        this.scaleProgressThresholds = progressThresholds;
    }

    public void setScrimColor(int i5) {
        this.scrimColor = i5;
    }

    public void setShapeMaskProgressThresholds(ProgressThresholds progressThresholds) {
        this.shapeMaskProgressThresholds = progressThresholds;
    }

    public void setStartContainerColor(int i5) {
        this.startContainerColor = i5;
    }

    public void setStartElevation(float f5) {
        this.startElevation = f5;
    }

    public void setStartShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.startShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setStartView(View view) {
        this.startView = view;
    }

    public void setStartViewId(int i5) {
        this.startViewId = i5;
    }

    public void setTransitionDirection(int i5) {
        this.transitionDirection = i5;
    }

    public MaterialContainerTransform(Context context, boolean z5) {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = ELEVATION_NOT_SET;
        this.endElevation = ELEVATION_NOT_SET;
        maybeApplyThemeValues(context, z5);
        this.appliedThemeValues = true;
    }
}
