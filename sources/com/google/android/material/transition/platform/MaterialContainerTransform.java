package com.google.android.material.transition.platform;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.f1;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MaterialContainerTransform extends Transition {
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
        final /* synthetic */ d f6535;

        a(d dVar) {
            this.f6535 = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6535.m7728(valueAnimator.getAnimatedFraction());
        }
    }

    class b extends n {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ View f6537;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ d f6538;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ View f6539;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6540;

        b(View view, d dVar, View view2, View view3) {
            this.f6537 = view;
            this.f6538 = dVar;
            this.f6539 = view2;
            this.f6540 = view3;
        }

        @Override // com.google.android.material.transition.platform.n, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransform.this.removeListener(this);
            if (MaterialContainerTransform.this.holdAtEndEnabled) {
                return;
            }
            this.f6539.setAlpha(1.0f);
            this.f6540.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f6537).remove(this.f6538);
        }

        @Override // com.google.android.material.transition.platform.n, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            ViewUtils.getOverlay(this.f6537).add(this.f6538);
            this.f6539.setAlpha(0.0f);
            this.f6540.setAlpha(0.0f);
        }
    }

    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ProgressThresholds f6542;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final ProgressThresholds f6543;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final ProgressThresholds f6544;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final ProgressThresholds f6545;

        /* synthetic */ c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, a aVar) {
            this(progressThresholds, progressThresholds2, progressThresholds3, progressThresholds4);
        }

        private c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f6542 = progressThresholds;
            this.f6543 = progressThresholds2;
            this.f6544 = progressThresholds3;
            this.f6545 = progressThresholds4;
        }
    }

    private static final class d extends Drawable {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final View f6546;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        private final com.google.android.material.transition.platform.d f6547;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final RectF f6548;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        private final Paint f6549;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final ShapeAppearanceModel f6550;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        private final boolean f6551;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final float f6552;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        private com.google.android.material.transition.platform.c f6553;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final View f6554;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        private final Path f6555;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final RectF f6556;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        private RectF f6557;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final ShapeAppearanceModel f6558;

        /* renamed from: ˈˈ, reason: contains not printable characters */
        private float f6559;

        /* renamed from: ˉ, reason: contains not printable characters */
        private final float f6560;

        /* renamed from: ˉˉ, reason: contains not printable characters */
        private float f6561;

        /* renamed from: ˊ, reason: contains not printable characters */
        private final Paint f6562;

        /* renamed from: ˋ, reason: contains not printable characters */
        private final Paint f6563;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        private float f6564;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final Paint f6565;

        /* renamed from: ˏ, reason: contains not printable characters */
        private final Paint f6566;

        /* renamed from: ˑ, reason: contains not printable characters */
        private final Paint f6567;

        /* renamed from: י, reason: contains not printable characters */
        private final g f6568;

        /* renamed from: ـ, reason: contains not printable characters */
        private final PathMeasure f6569;

        /* renamed from: ــ, reason: contains not printable characters */
        private f f6570;

        /* renamed from: ٴ, reason: contains not printable characters */
        private final float f6571;

        /* renamed from: ᐧ, reason: contains not printable characters */
        private final float[] f6572;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        private final c f6573;

        /* renamed from: ᴵ, reason: contains not printable characters */
        private final boolean f6574;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        private final com.google.android.material.transition.platform.a f6575;

        /* renamed from: ᵎ, reason: contains not printable characters */
        private final float f6576;

        /* renamed from: ᵔ, reason: contains not printable characters */
        private final float f6577;

        /* renamed from: ᵢ, reason: contains not printable characters */
        private final boolean f6578;

        /* renamed from: ⁱ, reason: contains not printable characters */
        private final MaterialShapeDrawable f6579;

        /* renamed from: ﹳ, reason: contains not printable characters */
        private final RectF f6580;

        /* renamed from: ﹶ, reason: contains not printable characters */
        private final RectF f6581;

        /* renamed from: ﾞ, reason: contains not printable characters */
        private final RectF f6582;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        private final RectF f6583;

        class a implements CanvasCompat.CanvasOperation {
            a() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                d.this.f6546.draw(canvas);
            }
        }

        class b implements CanvasCompat.CanvasOperation {
            b() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                d.this.f6554.draw(canvas);
            }
        }

        /* synthetic */ d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f6, int i5, int i6, int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.d dVar, c cVar, boolean z7, a aVar2) {
            this(pathMotion, view, rectF, shapeAppearanceModel, f5, view2, rectF2, shapeAppearanceModel2, f6, i5, i6, i7, i8, z5, z6, aVar, dVar, cVar, z7);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private static float m7717(RectF rectF, float f5) {
            return ((rectF.centerX() / (f5 / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private static float m7718(RectF rectF, float f5) {
            return (rectF.centerY() / f5) * 1.5f;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private void m7719(Canvas canvas, RectF rectF, Path path, int i5) {
            PointF m7726 = m7726(rectF);
            if (this.f6564 == 0.0f) {
                path.reset();
                path.moveTo(m7726.x, m7726.y);
            } else {
                path.lineTo(m7726.x, m7726.y);
                this.f6549.setColor(i5);
                canvas.drawPath(path, this.f6549);
            }
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private void m7720(Canvas canvas, RectF rectF, int i5) {
            this.f6549.setColor(i5);
            canvas.drawRect(rectF, this.f6549);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private void m7721(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f6568.m7742(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m7723(canvas);
            } else {
                m7722(canvas);
            }
            canvas.restore();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private void m7722(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f6579;
            RectF rectF = this.f6557;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f6579.setElevation(this.f6561);
            this.f6579.setShadowVerticalOffset((int) this.f6559);
            this.f6579.setShapeAppearanceModel(this.f6568.m7741());
            this.f6579.draw(canvas);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        private void m7723(Canvas canvas) {
            ShapeAppearanceModel m7741 = this.f6568.m7741();
            if (!m7741.isRoundRect(this.f6557)) {
                canvas.drawPath(this.f6568.m7742(), this.f6566);
            } else {
                float cornerSize = m7741.getTopLeftCornerSize().getCornerSize(this.f6557);
                canvas.drawRoundRect(this.f6557, cornerSize, cornerSize, this.f6566);
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        private void m7724(Canvas canvas) {
            m7727(canvas, this.f6565);
            Rect bounds = getBounds();
            RectF rectF = this.f6582;
            q.m7771(canvas, bounds, rectF.left, rectF.top, this.f6570.f6609, this.f6553.f6604, new b());
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        private void m7725(Canvas canvas) {
            m7727(canvas, this.f6563);
            Rect bounds = getBounds();
            RectF rectF = this.f6580;
            q.m7771(canvas, bounds, rectF.left, rectF.top, this.f6570.f6608, this.f6553.f6603, new a());
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private static PointF m7726(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: י, reason: contains not printable characters */
        private void m7727(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ـ, reason: contains not printable characters */
        public void m7728(float f5) {
            if (this.f6564 != f5) {
                m7729(f5);
            }
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        private void m7729(float f5) {
            float f6;
            float f7;
            this.f6564 = f5;
            this.f6567.setAlpha((int) (this.f6574 ? q.m7761(0.0f, 255.0f, f5) : q.m7761(255.0f, 0.0f, f5)));
            this.f6569.getPosTan(this.f6571 * f5, this.f6572, null);
            float[] fArr = this.f6572;
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
                this.f6569.getPosTan(this.f6571 * f6, fArr, null);
                float[] fArr2 = this.f6572;
                f8 += (f8 - fArr2[0]) * f7;
                f9 += (f9 - fArr2[1]) * f7;
            }
            float f10 = f8;
            float f11 = f9;
            f mo7734 = this.f6547.mo7734(f5, ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6573.f6543.start))).floatValue(), ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6573.f6543.end))).floatValue(), this.f6548.width(), this.f6548.height(), this.f6556.width(), this.f6556.height());
            this.f6570 = mo7734;
            RectF rectF = this.f6580;
            float f12 = mo7734.f6610;
            rectF.set(f10 - (f12 / 2.0f), f11, (f12 / 2.0f) + f10, mo7734.f6611 + f11);
            RectF rectF2 = this.f6582;
            f fVar = this.f6570;
            float f13 = fVar.f6612;
            rectF2.set(f10 - (f13 / 2.0f), f11, f10 + (f13 / 2.0f), fVar.f6613 + f11);
            this.f6581.set(this.f6580);
            this.f6583.set(this.f6582);
            float floatValue = ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6573.f6544.start))).floatValue();
            float floatValue2 = ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6573.f6544.end))).floatValue();
            boolean mo7735 = this.f6547.mo7735(this.f6570);
            RectF rectF3 = mo7735 ? this.f6581 : this.f6583;
            float m7762 = q.m7762(0.0f, 1.0f, floatValue, floatValue2, f5);
            if (!mo7735) {
                m7762 = 1.0f - m7762;
            }
            this.f6547.mo7736(rectF3, m7762, this.f6570);
            this.f6557 = new RectF(Math.min(this.f6581.left, this.f6583.left), Math.min(this.f6581.top, this.f6583.top), Math.max(this.f6581.right, this.f6583.right), Math.max(this.f6581.bottom, this.f6583.bottom));
            this.f6568.m7740(f5, this.f6550, this.f6558, this.f6580, this.f6581, this.f6583, this.f6573.f6545);
            this.f6561 = q.m7761(this.f6552, this.f6560, f5);
            float m7717 = m7717(this.f6557, this.f6576);
            float m7718 = m7718(this.f6557, this.f6577);
            float f14 = this.f6561;
            float f15 = (int) (m7718 * f14);
            this.f6559 = f15;
            this.f6566.setShadowLayer(f14, (int) (m7717 * f14), f15, 754974720);
            this.f6553 = this.f6575.mo7730(f5, ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6573.f6542.start))).floatValue(), ((Float) androidx.core.util.h.m2583(Float.valueOf(this.f6573.f6542.end))).floatValue(), 0.35f);
            if (this.f6563.getColor() != 0) {
                this.f6563.setAlpha(this.f6553.f6603);
            }
            if (this.f6565.getColor() != 0) {
                this.f6565.setAlpha(this.f6553.f6604);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f6567.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f6567);
            }
            int save = this.f6551 ? canvas.save() : -1;
            if (this.f6578 && this.f6561 > 0.0f) {
                m7721(canvas);
            }
            this.f6568.m7739(canvas);
            m7727(canvas, this.f6562);
            if (this.f6553.f6605) {
                m7725(canvas);
                m7724(canvas);
            } else {
                m7724(canvas);
                m7725(canvas);
            }
            if (this.f6551) {
                canvas.restoreToCount(save);
                m7719(canvas, this.f6580, this.f6555, -65281);
                m7720(canvas, this.f6581, -256);
                m7720(canvas, this.f6580, -16711936);
                m7720(canvas, this.f6583, -16711681);
                m7720(canvas, this.f6582, -16776961);
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

        private d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f6, int i5, int i6, int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.d dVar, c cVar, boolean z7) {
            Paint paint = new Paint();
            this.f6562 = paint;
            Paint paint2 = new Paint();
            this.f6563 = paint2;
            Paint paint3 = new Paint();
            this.f6565 = paint3;
            this.f6566 = new Paint();
            Paint paint4 = new Paint();
            this.f6567 = paint4;
            this.f6568 = new g();
            this.f6572 = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f6579 = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f6549 = paint5;
            this.f6555 = new Path();
            this.f6546 = view;
            this.f6548 = rectF;
            this.f6550 = shapeAppearanceModel;
            this.f6552 = f5;
            this.f6554 = view2;
            this.f6556 = rectF2;
            this.f6558 = shapeAppearanceModel2;
            this.f6560 = f6;
            this.f6574 = z5;
            this.f6578 = z6;
            this.f6575 = aVar;
            this.f6547 = dVar;
            this.f6573 = cVar;
            this.f6551 = z7;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f6576 = r12.widthPixels;
            this.f6577 = r12.heightPixels;
            paint.setColor(i5);
            paint2.setColor(i6);
            paint3.setColor(i7);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f6580 = rectF3;
            this.f6581 = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f6582 = rectF4;
            this.f6583 = new RectF(rectF4);
            PointF m7726 = m7726(rectF);
            PointF m77262 = m7726(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m7726.x, m7726.y, m77262.x, m77262.y), false);
            this.f6569 = pathMeasure;
            this.f6571 = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(q.m7752(i8));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m7729(0.0f);
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
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) ? getThresholdsOrDefault(z5, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC) : getThresholdsOrDefault(z5, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private static RectF calculateDrawableBounds(View view, View view2, float f5, float f6) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF m7756 = q.m7756(view2);
        m7756.offset(f5, f6);
        return m7756;
    }

    private static ShapeAppearanceModel captureShapeAppearance(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return q.m7751(getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    private static void captureValues(TransitionValues transitionValues, View view, int i5, ShapeAppearanceModel shapeAppearanceModel) {
        if (i5 != -1) {
            transitionValues.view = q.m7755(transitionValues.view, i5);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i6 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view2.getTag(i6) instanceof View) {
                View view3 = (View) transitionValues.view.getTag(i6);
                transitionValues.view.setTag(i6, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!f1.m2808(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF m7757 = view4.getParent() == null ? q.m7757(view4) : q.m7756(view4);
        transitionValues.values.put(PROP_BOUNDS, m7757);
        transitionValues.values.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view4, m7757, shapeAppearanceModel));
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
        return new c((ProgressThresholds) q.m7753(this.fadeProgressThresholds, cVar.f6542), (ProgressThresholds) q.m7753(this.scaleProgressThresholds, cVar.f6543), (ProgressThresholds) q.m7753(this.scaleMaskProgressThresholds, cVar.f6544), (ProgressThresholds) q.m7753(this.shapeMaskProgressThresholds, cVar.f6545), null);
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
            return q.m7750(rectF2) > q.m7750(rectF);
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
        q.m7767(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        q.m7766(this, context, z5 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.pathMotionCustom) {
            return;
        }
        q.m7768(this, context, com.google.android.material.R.attr.motionPath);
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View m7754;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get(PROP_BOUNDS);
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get(PROP_SHAPE_APPEARANCE);
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(PROP_BOUNDS);
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get(PROP_SHAPE_APPEARANCE);
                if (rectF2 == null || shapeAppearanceModel2 == null) {
                    Log.w(TAG, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = transitionValues.view;
                View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.drawingViewId == view4.getId()) {
                    m7754 = (View) view4.getParent();
                    view = view4;
                } else {
                    m7754 = q.m7754(view4, this.drawingViewId);
                    view = null;
                }
                RectF m7756 = q.m7756(m7754);
                float f5 = -m7756.left;
                float f6 = -m7756.top;
                RectF calculateDrawableBounds = calculateDrawableBounds(m7754, view, f5, f6);
                rectF.offset(f5, f6);
                rectF2.offset(f5, f6);
                boolean isEntering = isEntering(rectF, rectF2);
                if (!this.appliedThemeValues) {
                    maybeApplyThemeValues(view4.getContext(), isEntering);
                }
                d dVar = new d(getPathMotion(), view2, rectF, shapeAppearanceModel, getElevationOrDefault(this.startElevation, view2), view3, rectF2, shapeAppearanceModel2, getElevationOrDefault(this.endElevation, view3), this.containerColor, this.startContainerColor, this.endContainerColor, this.scrimColor, isEntering, this.elevationShadowEnabled, com.google.android.material.transition.platform.b.m7731(this.fadeMode, isEntering), e.m7737(this.fitMode, isEntering, rectF, rectF2), buildThresholdsGroup(isEntering), this.drawDebugEnabled, null);
                dVar.setBounds(Math.round(calculateDrawableBounds.left), Math.round(calculateDrawableBounds.top), Math.round(calculateDrawableBounds.right), Math.round(calculateDrawableBounds.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(dVar));
                addListener(new b(m7754, dVar, view2, view3));
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

    @Override // android.transition.Transition
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

    @Override // android.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
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
