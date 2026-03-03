package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d3;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: E:\78999\cookie_5123796.dex */
class z extends LinearLayout {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final TextInputLayout f6283;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final TextView f6284;

    /* renamed from: ˆ, reason: contains not printable characters */
    private CharSequence f6285;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final CheckableImageButton f6286;

    /* renamed from: ˉ, reason: contains not printable characters */
    private ColorStateList f6287;

    /* renamed from: ˊ, reason: contains not printable characters */
    private PorterDuff.Mode f6288;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f6289;

    /* renamed from: ˎ, reason: contains not printable characters */
    private ImageView.ScaleType f6290;

    /* renamed from: ˏ, reason: contains not printable characters */
    private View.OnLongClickListener f6291;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f6292;

    z(TextInputLayout textInputLayout, d3 d3Var) {
        super(textInputLayout.getContext());
        this.f6283 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f6286 = checkableImageButton;
        u.m7449(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f6284 = appCompatTextView;
        m7508(d3Var);
        m7507(d3Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m7506() {
        int i5 = (this.f6285 == null || this.f6292) ? 8 : 0;
        setVisibility(this.f6286.getVisibility() == 0 || i5 == 0 ? 0 : 8);
        this.f6284.setVisibility(i5);
        this.f6283.updateDummyDrawables();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m7507(d3 d3Var) {
        this.f6284.setVisibility(8);
        this.f6284.setId(R.id.textinput_prefix_text);
        this.f6284.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        f1.m2833(this.f6284, 1);
        m7523(d3Var.m1195(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i5 = R.styleable.TextInputLayout_prefixTextColor;
        if (d3Var.m1200(i5)) {
            m7524(d3Var.m1184(i5));
        }
        m7522(d3Var.m1197(R.styleable.TextInputLayout_prefixText));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m7508(d3 d3Var) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            androidx.core.view.u.m3355((ViewGroup.MarginLayoutParams) this.f6286.getLayoutParams(), 0);
        }
        m7531(null);
        m7532(null);
        int i5 = R.styleable.TextInputLayout_startIconTint;
        if (d3Var.m1200(i5)) {
            this.f6287 = MaterialResources.getColorStateList(getContext(), d3Var, i5);
        }
        int i6 = R.styleable.TextInputLayout_startIconTintMode;
        if (d3Var.m1200(i6)) {
            this.f6288 = ViewUtils.parseTintMode(d3Var.m1192(i6, -1), null);
        }
        int i7 = R.styleable.TextInputLayout_startIconDrawable;
        if (d3Var.m1200(i7)) {
            m7529(d3Var.m1188(i7));
            int i8 = R.styleable.TextInputLayout_startIconContentDescription;
            if (d3Var.m1200(i8)) {
                m7528(d3Var.m1197(i8));
            }
            m7526(d3Var.m1182(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        m7530(d3Var.m1187(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i9 = R.styleable.TextInputLayout_startIconScaleType;
        if (d3Var.m1200(i9)) {
            m7533(u.m7446(d3Var.m1192(i9, -1)));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        m7510();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    CharSequence m7509() {
        return this.f6285;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    void m7510() {
        EditText editText = this.f6283.editText;
        if (editText == null) {
            return;
        }
        f1.m2847(this.f6284, m7519() ? 0 : f1.m2871(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    ColorStateList m7511() {
        return this.f6284.getTextColors();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    int m7512() {
        return f1.m2871(this) + f1.m2871(this.f6284) + (m7519() ? this.f6286.getMeasuredWidth() + androidx.core.view.u.m3353((ViewGroup.MarginLayoutParams) this.f6286.getLayoutParams()) : 0);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    TextView m7513() {
        return this.f6284;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    CharSequence m7514() {
        return this.f6286.getContentDescription();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    Drawable m7515() {
        return this.f6286.getDrawable();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m7516() {
        return this.f6289;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    ImageView.ScaleType m7517() {
        return this.f6290;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    boolean m7518() {
        return this.f6286.isCheckable();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean m7519() {
        return this.f6286.getVisibility() == 0;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m7520(boolean z5) {
        this.f6292 = z5;
        m7506();
    }

    /* renamed from: י, reason: contains not printable characters */
    void m7521() {
        u.m7448(this.f6283, this.f6286, this.f6287);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m7522(CharSequence charSequence) {
        this.f6285 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6284.setText(charSequence);
        m7506();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m7523(int i5) {
        androidx.core.widget.c0.m3570(this.f6284, i5);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m7524(ColorStateList colorStateList) {
        this.f6284.setTextColor(colorStateList);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    void m7525(boolean z5) {
        if (m7519() != z5) {
            this.f6286.setVisibility(z5 ? 0 : 8);
            m7510();
            m7506();
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m7526(boolean z5) {
        this.f6286.setCheckable(z5);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    void m7527(j0 j0Var) {
        if (this.f6284.getVisibility() != 0) {
            j0Var.m2671(this.f6286);
        } else {
            j0Var.m2653(this.f6284);
            j0Var.m2671(this.f6284);
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m7528(CharSequence charSequence) {
        if (m7514() != charSequence) {
            this.f6286.setContentDescription(charSequence);
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m7529(Drawable drawable) {
        this.f6286.setImageDrawable(drawable);
        if (drawable != null) {
            u.m7445(this.f6283, this.f6286, this.f6287, this.f6288);
            m7525(true);
            m7521();
        } else {
            m7525(false);
            m7531(null);
            m7532(null);
            m7528(null);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m7530(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i5 != this.f6289) {
            this.f6289 = i5;
            u.m7451(this.f6286, i5);
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m7531(View.OnClickListener onClickListener) {
        u.m7452(this.f6286, onClickListener, this.f6291);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    void m7532(View.OnLongClickListener onLongClickListener) {
        this.f6291 = onLongClickListener;
        u.m7453(this.f6286, onLongClickListener);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m7533(ImageView.ScaleType scaleType) {
        this.f6290 = scaleType;
        u.m7454(this.f6286, scaleType);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m7534(ColorStateList colorStateList) {
        if (this.f6287 != colorStateList) {
            this.f6287 = colorStateList;
            u.m7445(this.f6283, this.f6286, colorStateList, this.f6288);
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    void m7535(PorterDuff.Mode mode) {
        if (this.f6288 != mode) {
            this.f6288 = mode;
            u.m7445(this.f6283, this.f6286, this.f6287, mode);
        }
    }
}
