package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
class ClockFaceView extends g implements ClockHandView.OnRotateListener {

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private final ClockHandView f6299;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private final RectF f6300;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private final Rect f6301;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private final SparseArray<TextView> f6302;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private final int[] f6303;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private final androidx.core.view.a f6304;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private final int f6305;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private final float[] f6306;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private final int f6307;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private final int f6308;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private final int f6309;

    /* renamed from: יי, reason: contains not printable characters */
    private float f6310;

    /* renamed from: ــ, reason: contains not printable characters */
    private final Rect f6311;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private final ColorStateList f6312;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private String[] f6313;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo7557(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f6299.m7571()) - ClockFaceView.this.f6305);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                j0Var.m2671((View) ClockFaceView.this.f6302.get(intValue - 1));
            }
            j0Var.m2644(j0.c.m2711(0, 1, intValue, 1, false, view.isSelected()));
            j0Var.m2642(true);
            j0Var.m2662(j0.a.f2869);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            if (i5 != 16) {
                return super.performAccessibilityAction(view, i5, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f6301);
            float centerX = ClockFaceView.this.f6301.centerX();
            float centerY = ClockFaceView.this.f6301.centerY();
            ClockFaceView.this.f6299.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.f6299.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m7547() {
        RectF m7569 = this.f6299.m7569();
        TextView m7551 = m7551(m7569);
        for (int i5 = 0; i5 < this.f6302.size(); i5++) {
            TextView textView = this.f6302.get(i5);
            if (textView != null) {
                textView.setSelected(textView == m7551);
                textView.getPaint().setShader(m7549(m7569, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private RadialGradient m7549(RectF rectF, TextView textView) {
        textView.getHitRect(this.f6301);
        this.f6300.set(this.f6301);
        textView.getLineBounds(0, this.f6311);
        RectF rectF2 = this.f6300;
        Rect rect = this.f6311;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f6300)) {
            return new RadialGradient(rectF.centerX() - this.f6300.left, rectF.centerY() - this.f6300.top, rectF.width() * 0.5f, this.f6303, this.f6306, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private static float m7550(float f5, float f6, float f7) {
        return Math.max(Math.max(f5, f6), f7);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private TextView m7551(RectF rectF) {
        float f5 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i5 = 0; i5 < this.f6302.size(); i5++) {
            TextView textView2 = this.f6302.get(i5);
            if (textView2 != null) {
                textView2.getHitRect(this.f6301);
                this.f6300.set(this.f6301);
                this.f6300.union(rectF);
                float width = this.f6300.width() * this.f6300.height();
                if (width < f5) {
                    textView = textView2;
                    f5 = width;
                }
            }
        }
        return textView;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private void m7552(int i5) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f6302.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < Math.max(this.f6313.length, size); i6++) {
            TextView textView = this.f6302.get(i6);
            if (i6 >= this.f6313.length) {
                removeView(textView);
                this.f6302.remove(i6);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.f6302.put(i6, textView);
                    addView(textView);
                }
                textView.setText(this.f6313[i6]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i6));
                int i7 = (i6 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i7));
                if (i7 > 1) {
                    z5 = true;
                }
                f1.m2830(textView, this.f6304);
                textView.setTextColor(this.f6312);
                if (i5 != 0) {
                    textView.setContentDescription(getResources().getString(i5, this.f6313[i6]));
                }
            }
        }
        this.f6299.m7577(z5);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j0.m2620(accessibilityNodeInfo).m2643(j0.b.m2710(1, this.f6313.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        m7547();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m7550 = (int) (this.f6309 / m7550(this.f6308 / displayMetrics.heightPixels, this.f6307 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m7550, 1073741824);
        setMeasuredDimension(m7550, m7550);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f5, boolean z5) {
        if (Math.abs(this.f6310 - f5) > 0.001f) {
            this.f6310 = f5;
            m7547();
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public void m7553(String[] strArr, int i5) {
        this.f6313 = strArr;
        m7552(i5);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    void m7554(int i5) {
        this.f6299.m7574(i5);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    int m7555() {
        return this.f6299.m7568();
    }

    @Override // com.google.android.material.timepicker.g
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected void mo7556() {
        super.mo7556();
        for (int i5 = 0; i5 < this.f6302.size(); i5++) {
            this.f6302.get(i5).setVisibility(0);
        }
    }

    @Override // com.google.android.material.timepicker.g
    /* renamed from: ﾞ, reason: contains not printable characters */
    public void mo7557(int i5) {
        if (i5 != m7610()) {
            super.mo7557(i5);
            this.f6299.m7573(m7610());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f6301 = new Rect();
        this.f6300 = new RectF();
        this.f6311 = new Rect();
        this.f6302 = new SparseArray<>();
        this.f6306 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i5, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.f6312 = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f6299 = clockHandView;
        this.f6305 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.f6303 = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.m7567(this);
        int defaultColor = f.a.m8474(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f6304 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        m7553(strArr, 0);
        this.f6308 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f6307 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f6309 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
