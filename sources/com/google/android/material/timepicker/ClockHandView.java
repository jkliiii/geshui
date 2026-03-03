package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
class ClockHandView extends View {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f6316;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final TimeInterpolator f6317;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final ValueAnimator f6318;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f6319;

    /* renamed from: ˉ, reason: contains not printable characters */
    private float f6320;

    /* renamed from: ˊ, reason: contains not printable characters */
    private float f6321;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f6322;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final int f6323;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f6324;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final List<OnRotateListener> f6325;

    /* renamed from: י, reason: contains not printable characters */
    private final int f6326;

    /* renamed from: ـ, reason: contains not printable characters */
    private final float f6327;

    /* renamed from: ٴ, reason: contains not printable characters */
    private final Paint f6328;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final RectF f6329;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final int f6330;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private float f6331;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f6332;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private OnActionUpListener f6333;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private double f6334;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f6335;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private int f6336;

    public interface OnActionUpListener {
        void onActionUp(float f5, boolean z5);
    }

    public interface OnRotateListener {
        void onRotate(float f5, boolean z5);
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m7559(float f5, float f6) {
        this.f6336 = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f5, f6) > ((float) m7562(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m7560(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f5 = width;
        float m7562 = m7562(this.f6336);
        float cos = (((float) Math.cos(this.f6334)) * m7562) + f5;
        float f6 = height;
        float sin = (m7562 * ((float) Math.sin(this.f6334))) + f6;
        this.f6328.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f6326, this.f6328);
        double sin2 = Math.sin(this.f6334);
        double cos2 = Math.cos(this.f6334);
        Double.isNaN(r7);
        Double.isNaN(r7);
        this.f6328.setStrokeWidth(this.f6330);
        canvas.drawLine(f5, f6, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.f6328);
        canvas.drawCircle(f5, f6, this.f6327, this.f6328);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private int m7561(float f5, float f6) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f6 - (getHeight() / 2), f5 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int m7562(int i5) {
        return i5 == 2 ? Math.round(this.f6335 * 0.66f) : this.f6335;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private Pair<Float, Float> m7563(float f5) {
        float m7570 = m7570();
        if (Math.abs(m7570 - f5) > 180.0f) {
            if (m7570 > 180.0f && f5 < 180.0f) {
                f5 += 360.0f;
            }
            if (m7570 < 180.0f && f5 > 180.0f) {
                m7570 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(m7570), Float.valueOf(f5));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m7564(float f5, float f6, boolean z5, boolean z6, boolean z7) {
        float m7561 = m7561(f5, f6);
        boolean z8 = false;
        boolean z9 = m7570() != m7561;
        if (z6 && z9) {
            return true;
        }
        if (!z9 && !z5) {
            return false;
        }
        if (z7 && this.f6319) {
            z8 = true;
        }
        m7576(m7561, z8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑ, reason: contains not printable characters */
    public /* synthetic */ void m7565(ValueAnimator valueAnimator) {
        m7566(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m7566(float f5, boolean z5) {
        float f6 = f5 % 360.0f;
        this.f6331 = f6;
        this.f6334 = Math.toRadians(f6 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float m7562 = m7562(this.f6336);
        float cos = width + (((float) Math.cos(this.f6334)) * m7562);
        float sin = height + (m7562 * ((float) Math.sin(this.f6334)));
        RectF rectF = this.f6329;
        int i5 = this.f6326;
        rectF.set(cos - i5, sin - i5, cos + i5, sin + i5);
        Iterator<OnRotateListener> it = this.f6325.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f6, z5);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m7560(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        if (this.f6318.isRunning()) {
            return;
        }
        m7575(m7570());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        boolean z7;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i5 = (int) (x5 - this.f6320);
                int i6 = (int) (y5 - this.f6321);
                this.f6322 = (i5 * i5) + (i6 * i6) > this.f6323;
                boolean z8 = this.f6332;
                z5 = actionMasked == 1;
                if (this.f6324) {
                    m7559(x5, y5);
                }
                z6 = z8;
            } else {
                z5 = false;
                z6 = false;
            }
            z7 = false;
        } else {
            this.f6320 = x5;
            this.f6321 = y5;
            this.f6322 = true;
            this.f6332 = false;
            z5 = false;
            z6 = false;
            z7 = true;
        }
        boolean m7564 = m7564(x5, y5, z6, z7, z5) | this.f6332;
        this.f6332 = m7564;
        if (m7564 && z5 && (onActionUpListener = this.f6333) != null) {
            onActionUpListener.onActionUp(m7561(x5, y5), this.f6322);
        }
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m7567(OnRotateListener onRotateListener) {
        this.f6325.add(onRotateListener);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    int m7568() {
        return this.f6336;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public RectF m7569() {
        return this.f6329;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public float m7570() {
        return this.f6331;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int m7571() {
        return this.f6326;
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m7572(boolean z5) {
        this.f6319 = z5;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m7573(int i5) {
        this.f6335 = i5;
        invalidate();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m7574(int i5) {
        this.f6336 = i5;
        invalidate();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m7575(float f5) {
        m7576(f5, false);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m7576(float f5, boolean z5) {
        ValueAnimator valueAnimator = this.f6318;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z5) {
            m7566(f5, false);
            return;
        }
        Pair<Float, Float> m7563 = m7563(f5);
        this.f6318.setFloatValues(((Float) m7563.first).floatValue(), ((Float) m7563.second).floatValue());
        this.f6318.setDuration(this.f6316);
        this.f6318.setInterpolator(this.f6317);
        this.f6318.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f6355.m7565(valueAnimator2);
            }
        });
        this.f6318.addListener(new a());
        this.f6318.start();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m7577(boolean z5) {
        if (this.f6324 && !z5) {
            this.f6336 = 1;
        }
        this.f6324 = z5;
        invalidate();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m7578(OnActionUpListener onActionUpListener) {
        this.f6333 = onActionUpListener;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f6318 = new ValueAnimator();
        this.f6325 = new ArrayList();
        Paint paint = new Paint();
        this.f6328 = paint;
        this.f6329 = new RectF();
        this.f6336 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i5, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f6316 = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.f6317 = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.f6335 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f6326 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.f6330 = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f6327 = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m7575(0.0f);
        this.f6323 = ViewConfiguration.get(context).getScaledTouchSlop();
        f1.m2843(this, 2);
        obtainStyledAttributes.recycle();
    }
}
