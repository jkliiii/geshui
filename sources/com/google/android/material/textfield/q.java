package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class q extends t {

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static final boolean f6195;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f6196;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f6197;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final TimeInterpolator f6198;

    /* renamed from: ˉ, reason: contains not printable characters */
    private AutoCompleteTextView f6199;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final View.OnClickListener f6200;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final View.OnFocusChangeListener f6201;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final c.b f6202;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f6203;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f6204;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f6205;

    /* renamed from: ـ, reason: contains not printable characters */
    private long f6206;

    /* renamed from: ٴ, reason: contains not printable characters */
    private AccessibilityManager f6207;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private ValueAnimator f6208;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private ValueAnimator f6209;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.m7444();
            q.this.f6209.start();
        }
    }

    static {
        f6195 = Build.VERSION.SDK_INT >= 21;
    }

    q(s sVar) {
        super(sVar);
        this.f6200 = new View.OnClickListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6188.m7331(view);
            }
        };
        this.f6201 = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                this.f6189.m7330(view, z5);
            }
        };
        this.f6202 = new c.b() { // from class: com.google.android.material.textfield.l
            @Override // androidx.core.view.accessibility.c.b
            public final void onTouchExplorationStateChanged(boolean z5) {
                this.f6190.m7333(z5);
            }
        };
        this.f6206 = Long.MAX_VALUE;
        Context context = sVar.getContext();
        int i5 = R.attr.motionDurationShort3;
        this.f6197 = MotionUtils.resolveThemeDuration(context, i5, 67);
        this.f6196 = MotionUtils.resolveThemeDuration(sVar.getContext(), i5, 50);
        this.f6198 = MotionUtils.resolveThemeInterpolator(sVar.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private ValueAnimator m7325(int i5, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f6198);
        ofFloat.setDuration(i5);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f6191.m7329(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static AutoCompleteTextView m7326(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean m7327() {
        long currentTimeMillis = System.currentTimeMillis() - this.f6206;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m7328() {
        this.f6209 = m7325(this.f6197, 0.0f, 1.0f);
        ValueAnimator m7325 = m7325(this.f6196, 1.0f, 0.0f);
        this.f6208 = m7325;
        m7325.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆˆ, reason: contains not printable characters */
    public /* synthetic */ void m7329(ValueAnimator valueAnimator) {
        this.f6244.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈˈ, reason: contains not printable characters */
    public /* synthetic */ void m7330(View view, boolean z5) {
        this.f6203 = z5;
        m7444();
        if (z5) {
            return;
        }
        m7334(false);
        this.f6204 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉˉ, reason: contains not printable characters */
    public /* synthetic */ void m7331(View view) {
        m7341();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊˊ, reason: contains not printable characters */
    public /* synthetic */ boolean m7332(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (m7327()) {
                this.f6204 = false;
            }
            m7341();
            m7337();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋˋ, reason: contains not printable characters */
    public /* synthetic */ void m7333(boolean z5) {
        AutoCompleteTextView autoCompleteTextView = this.f6199;
        if (autoCompleteTextView == null || r.m7356(autoCompleteTextView)) {
            return;
        }
        f1.m2843(this.f6244, z5 ? 2 : 1);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private void m7334(boolean z5) {
        if (this.f6205 != z5) {
            this.f6205 = z5;
            this.f6209.cancel();
            this.f6208.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏˏ, reason: contains not printable characters */
    public /* synthetic */ void m7335() {
        m7337();
        m7334(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: ˑˑ, reason: contains not printable characters */
    private void m7336() {
        this.f6199.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f6193.m7332(view, motionEvent);
            }
        });
        if (f6195) {
            this.f6199.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.p
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f6194.m7335();
                }
            });
        }
        this.f6199.setThreshold(0);
    }

    /* renamed from: יי, reason: contains not printable characters */
    private void m7337() {
        this.f6204 = true;
        this.f6206 = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ــ, reason: contains not printable characters */
    public /* synthetic */ void m7338() {
        boolean isPopupShowing = this.f6199.isPopupShowing();
        m7334(isPopupShowing);
        this.f6204 = isPopupShowing;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m7341() {
        if (this.f6199 == null) {
            return;
        }
        if (m7327()) {
            this.f6204 = false;
        }
        if (this.f6204) {
            this.f6204 = false;
            return;
        }
        if (f6195) {
            m7334(!this.f6205);
        } else {
            this.f6205 = !this.f6205;
            m7444();
        }
        if (!this.f6205) {
            this.f6199.dismissDropDown();
        } else {
            this.f6199.requestFocus();
            this.f6199.showDropDown();
        }
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʻ */
    public void mo7303(Editable editable) {
        if (this.f6207.isTouchExplorationEnabled() && r.m7356(this.f6199) && !this.f6244.hasFocus()) {
            this.f6199.dismissDropDown();
        }
        this.f6199.post(new Runnable() { // from class: com.google.android.material.textfield.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f6192.m7338();
            }
        });
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʽ */
    int mo7304() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʾ */
    int mo7305() {
        return f6195 ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʿ */
    View.OnFocusChangeListener mo7306() {
        return this.f6201;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˆ */
    View.OnClickListener mo7307() {
        return this.f6200;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˉ, reason: contains not printable characters */
    public c.b mo7347() {
        return this.f6202;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˊ, reason: contains not printable characters */
    boolean mo7348(int i5) {
        return i5 != 0;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˋ, reason: contains not printable characters */
    boolean mo7349() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˎ, reason: contains not printable characters */
    boolean mo7350() {
        return this.f6203;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˏ, reason: contains not printable characters */
    boolean mo7351() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˑ, reason: contains not printable characters */
    boolean mo7352() {
        return this.f6205;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: י */
    public void mo7309(EditText editText) {
        this.f6199 = m7326(editText);
        m7336();
        this.f6241.setErrorIconDrawable((Drawable) null);
        if (!r.m7356(editText) && this.f6207.isTouchExplorationEnabled()) {
            f1.m2843(this.f6244, 2);
        }
        this.f6241.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ـ, reason: contains not printable characters */
    public void mo7353(View view, j0 j0Var) {
        if (!r.m7356(this.f6199)) {
            j0Var.m2641(Spinner.class.getName());
        }
        if (j0Var.m2684()) {
            j0Var.m2652(null);
        }
    }

    @Override // com.google.android.material.textfield.t
    @SuppressLint({"WrongConstant"})
    /* renamed from: ٴ, reason: contains not printable characters */
    public void mo7354(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f6207.isEnabled() || r.m7356(this.f6199)) {
            return;
        }
        boolean z5 = accessibilityEvent.getEventType() == 32768 && this.f6205 && !this.f6199.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z5) {
            m7341();
            m7337();
        }
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ᵎ */
    void mo7311() {
        m7328();
        this.f6207 = (AccessibilityManager) this.f6243.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ᵔ, reason: contains not printable characters */
    boolean mo7355() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: ᵢ */
    void mo7312() {
        AutoCompleteTextView autoCompleteTextView = this.f6199;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f6195) {
                this.f6199.setOnDismissListener(null);
            }
        }
    }
}
