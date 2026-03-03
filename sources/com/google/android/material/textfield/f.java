package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f extends t {

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f6175;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f6176;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final TimeInterpolator f6177;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final TimeInterpolator f6178;

    /* renamed from: ˊ, reason: contains not printable characters */
    private EditText f6179;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final View.OnClickListener f6180;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final View.OnFocusChangeListener f6181;

    /* renamed from: ˏ, reason: contains not printable characters */
    private AnimatorSet f6182;

    /* renamed from: ˑ, reason: contains not printable characters */
    private ValueAnimator f6183;

    /* compiled from: ClearTextEndIconDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f6242.m7386(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f6242.m7386(false);
        }
    }

    f(s sVar) {
        super(sVar);
        this.f6180 = new View.OnClickListener() { // from class: com.google.android.material.textfield.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6173.m7291(view);
            }
        };
        this.f6181 = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                this.f6174.m7295(view, z5);
            }
        };
        Context context = sVar.getContext();
        int i5 = R.attr.motionDurationShort3;
        this.f6175 = MotionUtils.resolveThemeDuration(context, i5, 100);
        this.f6176 = MotionUtils.resolveThemeDuration(sVar.getContext(), i5, 150);
        this.f6177 = MotionUtils.resolveThemeInterpolator(sVar.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f6178 = MotionUtils.resolveThemeInterpolator(sVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private ValueAnimator m7288() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f6178);
        ofFloat.setDuration(this.f6176);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f6171.m7292(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    public /* synthetic */ void m7289(ValueAnimator valueAnimator) {
        this.f6244.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m7290() {
        ValueAnimator m7288 = m7288();
        ValueAnimator m7297 = m7297(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6182 = animatorSet;
        animatorSet.playTogether(m7288, m7297);
        this.f6182.addListener(new a());
        ValueAnimator m72972 = m7297(1.0f, 0.0f);
        this.f6183 = m72972;
        m72972.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʾ, reason: contains not printable characters */
    public /* synthetic */ void m7291(View view) {
        EditText editText = this.f6179;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        m7444();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿʿ, reason: contains not printable characters */
    public /* synthetic */ void m7292(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6244.setScaleX(floatValue);
        this.f6244.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆˆ, reason: contains not printable characters */
    public /* synthetic */ void m7293() {
        m7296(true);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private boolean m7294() {
        EditText editText = this.f6179;
        return editText != null && (editText.hasFocus() || this.f6244.hasFocus()) && this.f6179.getText().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ــ, reason: contains not printable characters */
    public /* synthetic */ void m7295(View view, boolean z5) {
        m7296(m7294());
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private void m7296(boolean z5) {
        boolean z6 = this.f6242.m7406() == z5;
        if (z5 && !this.f6182.isRunning()) {
            this.f6183.cancel();
            this.f6182.start();
            if (z6) {
                this.f6182.end();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        this.f6182.cancel();
        this.f6183.start();
        if (z6) {
            this.f6183.end();
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private ValueAnimator m7297(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f6177);
        ofFloat.setDuration(this.f6175);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f6172.m7289(valueAnimator);
            }
        });
        return ofFloat;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʻ, reason: contains not printable characters */
    void mo7303(Editable editable) {
        if (this.f6242.m7438() != null) {
            return;
        }
        m7296(m7294());
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʽ, reason: contains not printable characters */
    int mo7304() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʾ, reason: contains not printable characters */
    int mo7305() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʿ, reason: contains not printable characters */
    View.OnFocusChangeListener mo7306() {
        return this.f6181;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˆ, reason: contains not printable characters */
    View.OnClickListener mo7307() {
        return this.f6180;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˈ, reason: contains not printable characters */
    View.OnFocusChangeListener mo7308() {
        return this.f6181;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: י, reason: contains not printable characters */
    public void mo7309(EditText editText) {
        this.f6179 = editText;
        this.f6241.setEndIconVisible(m7294());
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ᐧ, reason: contains not printable characters */
    void mo7310(boolean z5) {
        if (this.f6242.m7438() == null) {
            return;
        }
        m7296(z5);
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ᵎ, reason: contains not printable characters */
    void mo7311() {
        m7290();
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ᵢ, reason: contains not printable characters */
    void mo7312() {
        EditText editText = this.f6179;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6170.m7293();
                }
            });
        }
    }
}
