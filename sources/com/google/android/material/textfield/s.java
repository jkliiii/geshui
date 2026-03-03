package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d3;
import androidx.core.view.accessibility.c;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: E:\78999\cookie_5123796.dex */
class s extends LinearLayout {

    /* renamed from: ʾ, reason: contains not printable characters */
    final TextInputLayout f6211;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final FrameLayout f6212;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final CheckableImageButton f6213;

    /* renamed from: ˈ, reason: contains not printable characters */
    private ColorStateList f6214;

    /* renamed from: ˉ, reason: contains not printable characters */
    private PorterDuff.Mode f6215;

    /* renamed from: ˊ, reason: contains not printable characters */
    private View.OnLongClickListener f6216;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final CheckableImageButton f6217;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final d f6218;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f6219;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> f6220;

    /* renamed from: י, reason: contains not printable characters */
    private ColorStateList f6221;

    /* renamed from: ـ, reason: contains not printable characters */
    private PorterDuff.Mode f6222;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f6223;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private ImageView.ScaleType f6224;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private View.OnLongClickListener f6225;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private CharSequence f6226;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private final TextView f6227;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean f6228;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private EditText f6229;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private final AccessibilityManager f6230;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private c.b f6231;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private final TextWatcher f6232;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private final TextInputLayout.OnEditTextAttachedListener f6233;

    /* compiled from: EndCompoundLayout.java */
    class a extends TextWatcherAdapter {
        a() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            s.this.m7419().mo7303(editable);
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            s.this.m7419().mo7443(charSequence, i5, i6, i7);
        }
    }

    /* compiled from: EndCompoundLayout.java */
    class b implements TextInputLayout.OnEditTextAttachedListener {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(TextInputLayout textInputLayout) {
            if (s.this.f6229 == textInputLayout.getEditText()) {
                return;
            }
            if (s.this.f6229 != null) {
                s.this.f6229.removeTextChangedListener(s.this.f6232);
                if (s.this.f6229.getOnFocusChangeListener() == s.this.m7419().mo7306()) {
                    s.this.f6229.setOnFocusChangeListener(null);
                }
            }
            s.this.f6229 = textInputLayout.getEditText();
            if (s.this.f6229 != null) {
                s.this.f6229.addTextChangedListener(s.this.f6232);
            }
            s.this.m7419().mo7309(s.this.f6229);
            s sVar = s.this;
            sVar.m7358(sVar.m7419());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.this.m7373();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.m7376();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    private static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final SparseArray<t> f6237 = new SparseArray<>();

        /* renamed from: ʼ, reason: contains not printable characters */
        private final s f6238;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f6239;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int f6240;

        d(s sVar, d3 d3Var) {
            this.f6238 = sVar;
            this.f6239 = d3Var.m1195(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.f6240 = d3Var.m1195(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private t m7441(int i5) {
            if (i5 == -1) {
                return new g(this.f6238);
            }
            if (i5 == 0) {
                return new w(this.f6238);
            }
            if (i5 == 1) {
                return new y(this.f6238, this.f6240);
            }
            if (i5 == 2) {
                return new f(this.f6238);
            }
            if (i5 == 3) {
                return new q(this.f6238);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        t m7442(int i5) {
            t tVar = this.f6237.get(i5);
            if (tVar != null) {
                return tVar;
            }
            t m7441 = m7441(i5);
            this.f6237.append(i5, m7441);
            return m7441;
        }
    }

    s(TextInputLayout textInputLayout, d3 d3Var) {
        super(textInputLayout.getContext());
        this.f6219 = 0;
        this.f6220 = new LinkedHashSet<>();
        this.f6232 = new a();
        b bVar = new b();
        this.f6233 = bVar;
        this.f6230 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6211 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6212 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m7374 = m7374(this, from, R.id.text_input_error_icon);
        this.f6213 = m7374;
        CheckableImageButton m73742 = m7374(frameLayout, from, R.id.text_input_end_icon);
        this.f6217 = m73742;
        this.f6218 = new d(this, d3Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f6227 = appCompatTextView;
        m7360(d3Var);
        m7368(d3Var);
        m7371(d3Var);
        frameLayout.addView(m73742);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(m7374);
        textInputLayout.addOnEditTextAttachedListener(bVar);
        addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻٴ, reason: contains not printable characters */
    public void m7358(t tVar) {
        if (this.f6229 == null) {
            return;
        }
        if (tVar.mo7306() != null) {
            this.f6229.setOnFocusChangeListener(tVar.mo7306());
        }
        if (tVar.mo7308() != null) {
            this.f6217.setOnFocusChangeListener(tVar.mo7308());
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private void m7360(d3 d3Var) {
        int i5 = R.styleable.TextInputLayout_errorIconTint;
        if (d3Var.m1200(i5)) {
            this.f6214 = MaterialResources.getColorStateList(getContext(), d3Var, i5);
        }
        int i6 = R.styleable.TextInputLayout_errorIconTintMode;
        if (d3Var.m1200(i6)) {
            this.f6215 = ViewUtils.parseTintMode(d3Var.m1192(i6, -1), null);
        }
        int i7 = R.styleable.TextInputLayout_errorIconDrawable;
        if (d3Var.m1200(i7)) {
            m7388(d3Var.m1188(i7));
        }
        this.f6213.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        f1.m2843(this.f6213, 2);
        this.f6213.setClickable(false);
        this.f6213.setPressable(false);
        this.f6213.setFocusable(false);
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private void m7361(t tVar) {
        tVar.mo7311();
        this.f6231 = tVar.mo7347();
        m7373();
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private void m7362(t tVar) {
        m7376();
        this.f6231 = null;
        tVar.mo7312();
    }

    /* renamed from: ʼʿ, reason: contains not printable characters */
    private void m7363(boolean z5) {
        if (!z5 || m7421() == null) {
            u.m7445(this.f6211, this.f6217, this.f6221, this.f6222);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.m2213(m7421()).mutate();
        androidx.core.graphics.drawable.a.m2209(mutate, this.f6211.getErrorCurrentTextColors());
        this.f6217.setImageDrawable(mutate);
    }

    /* renamed from: ʼˈ, reason: contains not printable characters */
    private void m7364() {
        this.f6212.setVisibility((this.f6217.getVisibility() != 0 || m7409()) ? 8 : 0);
        setVisibility(m7406() || m7409() || ((this.f6226 == null || this.f6228) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    /* renamed from: ʼˉ, reason: contains not printable characters */
    private void m7365() {
        this.f6213.setVisibility(m7431() != null && this.f6211.isErrorEnabled() && this.f6211.shouldShowError() ? 0 : 8);
        m7364();
        m7404();
        if (m7378()) {
            return;
        }
        this.f6211.updateDummyDrawables();
    }

    /* renamed from: ʼˋ, reason: contains not printable characters */
    private void m7366() {
        int visibility = this.f6227.getVisibility();
        int i5 = (this.f6226 == null || this.f6228) ? 8 : 0;
        if (visibility != i5) {
            m7419().mo7310(i5 == 0);
        }
        m7364();
        this.f6227.setVisibility(i5);
        this.f6211.updateDummyDrawables();
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m7368(d3 d3Var) {
        int i5 = R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!d3Var.m1200(i5)) {
            int i6 = R.styleable.TextInputLayout_endIconTint;
            if (d3Var.m1200(i6)) {
                this.f6221 = MaterialResources.getColorStateList(getContext(), d3Var, i6);
            }
            int i7 = R.styleable.TextInputLayout_endIconTintMode;
            if (d3Var.m1200(i7)) {
                this.f6222 = ViewUtils.parseTintMode(d3Var.m1192(i7, -1), null);
            }
        }
        int i8 = R.styleable.TextInputLayout_endIconMode;
        if (d3Var.m1200(i8)) {
            m7380(d3Var.m1192(i8, 0));
            int i9 = R.styleable.TextInputLayout_endIconContentDescription;
            if (d3Var.m1200(i9)) {
                m7435(d3Var.m1197(i9));
            }
            m7432(d3Var.m1182(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (d3Var.m1200(i5)) {
            int i10 = R.styleable.TextInputLayout_passwordToggleTint;
            if (d3Var.m1200(i10)) {
                this.f6221 = MaterialResources.getColorStateList(getContext(), d3Var, i10);
            }
            int i11 = R.styleable.TextInputLayout_passwordToggleTintMode;
            if (d3Var.m1200(i11)) {
                this.f6222 = ViewUtils.parseTintMode(d3Var.m1192(i11, -1), null);
            }
            m7380(d3Var.m1182(i5, false) ? 1 : 0);
            m7435(d3Var.m1197(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        m7379(d3Var.m1187(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i12 = R.styleable.TextInputLayout_endIconScaleType;
        if (d3Var.m1200(i12)) {
            m7383(u.m7446(d3Var.m1192(i12, -1)));
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m7371(d3 d3Var) {
        this.f6227.setVisibility(8);
        this.f6227.setId(R.id.textinput_suffix_text);
        this.f6227.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        f1.m2833(this.f6227, 1);
        m7401(d3Var.m1195(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i5 = R.styleable.TextInputLayout_suffixTextColor;
        if (d3Var.m1200(i5)) {
            m7402(d3Var.m1184(i5));
        }
        m7400(d3Var.m1197(R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public void m7373() {
        if (this.f6231 == null || this.f6230 == null || !f1.m2903(this)) {
            return;
        }
        androidx.core.view.accessibility.c.m2602(this.f6230, this.f6231);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private CheckableImageButton m7374(ViewGroup viewGroup, LayoutInflater layoutInflater, int i5) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i5);
        u.m7449(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            androidx.core.view.u.m3356((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m7375(int i5) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.f6220.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.f6211, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: יי, reason: contains not printable characters */
    public void m7376() {
        AccessibilityManager accessibilityManager;
        c.b bVar = this.f6231;
        if (bVar == null || (accessibilityManager = this.f6230) == null) {
            return;
        }
        androidx.core.view.accessibility.c.m2603(accessibilityManager, bVar);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int m7377(t tVar) {
        int i5 = this.f6218.f6239;
        return i5 == 0 ? tVar.mo7305() : i5;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    boolean m7378() {
        return this.f6219 != 0;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    void m7379(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i5 != this.f6223) {
            this.f6223 = i5;
            u.m7451(this.f6217, i5);
            u.m7451(this.f6213, i5);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void m7380(int i5) {
        if (this.f6219 == i5) {
            return;
        }
        m7362(m7419());
        int i6 = this.f6219;
        this.f6219 = i5;
        m7375(i6);
        m7386(i5 != 0);
        t m7419 = m7419();
        m7422(m7377(m7419));
        m7433(m7419.mo7304());
        m7432(m7419.mo7351());
        if (!m7419.mo7348(this.f6211.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f6211.getBoxBackgroundMode() + " is not supported by the end icon mode " + i5);
        }
        m7361(m7419);
        m7381(m7419.mo7307());
        EditText editText = this.f6229;
        if (editText != null) {
            m7419.mo7309(editText);
            m7358(m7419);
        }
        u.m7445(this.f6211, this.f6217, this.f6221, this.f6222);
        m7417(true);
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    void m7381(View.OnClickListener onClickListener) {
        u.m7452(this.f6217, onClickListener, this.f6225);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    void m7382(View.OnLongClickListener onLongClickListener) {
        this.f6225 = onLongClickListener;
        u.m7453(this.f6217, onLongClickListener);
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    void m7383(ImageView.ScaleType scaleType) {
        this.f6224 = scaleType;
        u.m7454(this.f6217, scaleType);
        u.m7454(this.f6213, scaleType);
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    void m7384(ColorStateList colorStateList) {
        if (this.f6221 != colorStateList) {
            this.f6221 = colorStateList;
            u.m7445(this.f6211, this.f6217, colorStateList, this.f6222);
        }
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    void m7385(PorterDuff.Mode mode) {
        if (this.f6222 != mode) {
            this.f6222 = mode;
            u.m7445(this.f6211, this.f6217, this.f6221, mode);
        }
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    void m7386(boolean z5) {
        if (m7406() != z5) {
            this.f6217.setVisibility(z5 ? 0 : 8);
            m7364();
            m7404();
            this.f6211.updateDummyDrawables();
        }
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    void m7387(int i5) {
        m7388(i5 != 0 ? f.a.m8475(getContext(), i5) : null);
        m7414();
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    void m7388(Drawable drawable) {
        this.f6213.setImageDrawable(drawable);
        m7365();
        u.m7445(this.f6211, this.f6213, this.f6214, this.f6215);
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    void m7389(View.OnClickListener onClickListener) {
        u.m7452(this.f6213, onClickListener, this.f6216);
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    void m7390(View.OnLongClickListener onLongClickListener) {
        this.f6216 = onLongClickListener;
        u.m7453(this.f6213, onLongClickListener);
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    void m7391(ColorStateList colorStateList) {
        if (this.f6214 != colorStateList) {
            this.f6214 = colorStateList;
            u.m7445(this.f6211, this.f6213, colorStateList, this.f6215);
        }
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    void m7392(PorterDuff.Mode mode) {
        if (this.f6215 != mode) {
            this.f6215 = mode;
            u.m7445(this.f6211, this.f6213, this.f6214, mode);
        }
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    void m7393(int i5) {
        m7394(i5 != 0 ? getResources().getText(i5) : null);
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    void m7394(CharSequence charSequence) {
        this.f6217.setContentDescription(charSequence);
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    void m7395(int i5) {
        m7396(i5 != 0 ? f.a.m8475(getContext(), i5) : null);
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    void m7396(Drawable drawable) {
        this.f6217.setImageDrawable(drawable);
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    void m7397(boolean z5) {
        if (z5 && this.f6219 != 1) {
            m7380(1);
        } else {
            if (z5) {
                return;
            }
            m7380(0);
        }
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    void m7398(ColorStateList colorStateList) {
        this.f6221 = colorStateList;
        u.m7445(this.f6211, this.f6217, colorStateList, this.f6222);
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    void m7399(PorterDuff.Mode mode) {
        this.f6222 = mode;
        u.m7445(this.f6211, this.f6217, this.f6221, mode);
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    void m7400(CharSequence charSequence) {
        this.f6226 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6227.setText(charSequence);
        m7366();
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    void m7401(int i5) {
        androidx.core.widget.c0.m3570(this.f6227, i5);
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    void m7402(ColorStateList colorStateList) {
        this.f6227.setTextColor(colorStateList);
    }

    /* renamed from: ʼˆ, reason: contains not printable characters */
    void m7403(boolean z5) {
        if (this.f6219 == 1) {
            this.f6217.performClick();
            if (z5) {
                this.f6217.jumpDrawablesToCurrentState();
            }
        }
    }

    /* renamed from: ʼˊ, reason: contains not printable characters */
    void m7404() {
        if (this.f6211.editText == null) {
            return;
        }
        f1.m2847(this.f6227, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f6211.editText.getPaddingTop(), (m7406() || m7409()) ? 0 : f1.m2867(this.f6211.editText), this.f6211.editText.getPaddingBottom());
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    boolean m7405() {
        return this.f6217.isCheckable();
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    boolean m7406() {
        return this.f6212.getVisibility() == 0 && this.f6217.getVisibility() == 0;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m7407(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f6220.add(onEndIconChangedListener);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    boolean m7408() {
        return this.f6219 == 1;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    boolean m7409() {
        return this.f6213.getVisibility() == 0;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m7410() {
        this.f6217.performClick();
        this.f6217.jumpDrawablesToCurrentState();
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m7411() {
        m7365();
        m7414();
        m7415();
        if (m7419().mo7355()) {
            m7363(this.f6211.shouldShowError());
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m7412() {
        this.f6220.clear();
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    void m7413(boolean z5) {
        this.f6228 = z5;
        m7366();
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    void m7414() {
        u.m7448(this.f6211, this.f6213, this.f6214);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m7415() {
        u.m7448(this.f6211, this.f6217, this.f6221);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    CheckableImageButton m7416() {
        if (m7409()) {
            return this.f6213;
        }
        if (m7378() && m7406()) {
            return this.f6217;
        }
        return null;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    void m7417(boolean z5) {
        boolean z6;
        boolean isActivated;
        boolean isChecked;
        t m7419 = m7419();
        boolean z7 = true;
        if (!m7419.mo7351() || (isChecked = this.f6217.isChecked()) == m7419.mo7352()) {
            z6 = false;
        } else {
            this.f6217.setChecked(!isChecked);
            z6 = true;
        }
        if (!m7419.mo7349() || (isActivated = this.f6217.isActivated()) == m7419.mo7350()) {
            z7 = z6;
        } else {
            m7428(!isActivated);
        }
        if (z5 || z7) {
            m7415();
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    CharSequence m7418() {
        return this.f6217.getContentDescription();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    t m7419() {
        return this.f6218.m7442(this.f6219);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    boolean m7420() {
        return m7378() && this.f6217.isChecked();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    Drawable m7421() {
        return this.f6217.getDrawable();
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    void m7422(int i5) {
        m7437(i5 != 0 ? f.a.m8475(getContext(), i5) : null);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    int m7423() {
        return this.f6223;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    int m7424() {
        return f1.m2867(this) + f1.m2867(this.f6227) + ((m7406() || m7409()) ? this.f6217.getMeasuredWidth() + androidx.core.view.u.m3354((ViewGroup.MarginLayoutParams) this.f6217.getLayoutParams()) : 0);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    int m7425() {
        return this.f6219;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    TextView m7426() {
        return this.f6227;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    ImageView.ScaleType m7427() {
        return this.f6224;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    void m7428(boolean z5) {
        this.f6217.setActivated(z5);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    CheckableImageButton m7429() {
        return this.f6217;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    void m7430(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f6220.remove(onEndIconChangedListener);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    Drawable m7431() {
        return this.f6213.getDrawable();
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    void m7432(boolean z5) {
        this.f6217.setCheckable(z5);
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    void m7433(int i5) {
        m7435(i5 != 0 ? getResources().getText(i5) : null);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    CharSequence m7434() {
        return this.f6217.getContentDescription();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    void m7435(CharSequence charSequence) {
        if (m7418() != charSequence) {
            this.f6217.setContentDescription(charSequence);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    Drawable m7436() {
        return this.f6217.getDrawable();
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    void m7437(Drawable drawable) {
        this.f6217.setImageDrawable(drawable);
        if (drawable != null) {
            u.m7445(this.f6211, this.f6217, this.f6221, this.f6222);
            m7415();
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    CharSequence m7438() {
        return this.f6226;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    ColorStateList m7439() {
        return this.f6227.getTextColors();
    }
}
