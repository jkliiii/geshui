package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: IndicatorViewController.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class v {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f6245;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f6246;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f6247;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final TimeInterpolator f6248;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final TimeInterpolator f6249;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final TimeInterpolator f6250;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Context f6251;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final TextInputLayout f6252;

    /* renamed from: ˊ, reason: contains not printable characters */
    private LinearLayout f6253;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f6254;

    /* renamed from: ˎ, reason: contains not printable characters */
    private FrameLayout f6255;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Animator f6256;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final float f6257;

    /* renamed from: י, reason: contains not printable characters */
    private int f6258;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f6259;

    /* renamed from: ٴ, reason: contains not printable characters */
    private CharSequence f6260;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f6261;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private ColorStateList f6262;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private TextView f6263;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private Typeface f6264;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private CharSequence f6265;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f6266;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f6267;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private ColorStateList f6268;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private CharSequence f6269;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f6270;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private TextView f6271;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int f6272;

    /* compiled from: IndicatorViewController.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f6273;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ TextView f6274;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ int f6275;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ TextView f6276;

        a(int i5, TextView textView, int i6, TextView textView2) {
            this.f6273 = i5;
            this.f6274 = textView;
            this.f6275 = i6;
            this.f6276 = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            v.this.f6258 = this.f6273;
            v.this.f6256 = null;
            TextView textView = this.f6274;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f6275 == 1 && v.this.f6263 != null) {
                    v.this.f6263.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f6276;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f6276.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f6276;
            if (textView != null) {
                textView.setVisibility(0);
                this.f6276.setAlpha(0.0f);
            }
        }
    }

    /* compiled from: IndicatorViewController.java */
    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f6252.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6251 = context;
        this.f6252 = textInputLayout;
        this.f6257 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        int i5 = R.attr.motionDurationShort4;
        this.f6245 = MotionUtils.resolveThemeDuration(context, i5, 217);
        this.f6246 = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium4, 167);
        this.f6247 = MotionUtils.resolveThemeDuration(context, i5, 167);
        int i6 = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        this.f6248 = MotionUtils.resolveThemeInterpolator(context, i6, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        this.f6249 = MotionUtils.resolveThemeInterpolator(context, i6, timeInterpolator);
        this.f6250 = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m7459(int i5, int i6) {
        TextView m7465;
        TextView m74652;
        if (i5 == i6) {
            return;
        }
        if (i6 != 0 && (m74652 = m7465(i6)) != null) {
            m74652.setVisibility(0);
            m74652.setAlpha(1.0f);
        }
        if (i5 != 0 && (m7465 = m7465(i5)) != null) {
            m7465.setVisibility(4);
            if (i5 == 1) {
                m7465.setText((CharSequence) null);
            }
        }
        this.f6258 = i6;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean m7460() {
        return (this.f6253 == null || this.f6252.getEditText() == null) ? false : true;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m7461(List<Animator> list, boolean z5, TextView textView, int i5, int i6, int i7) {
        if (textView == null || !z5) {
            return;
        }
        boolean z6 = false;
        if (i5 == i7 || i5 == i6) {
            ObjectAnimator m7462 = m7462(textView, i7 == i5);
            if (i5 == i7 && i6 != 0) {
                z6 = true;
            }
            if (z6) {
                m7462.setStartDelay(this.f6247);
            }
            list.add(m7462);
            if (i7 != i5 || i6 == 0) {
                return;
            }
            ObjectAnimator m7463 = m7463(textView);
            m7463.setStartDelay(this.f6247);
            list.add(m7463);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private ObjectAnimator m7462(TextView textView, boolean z5) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
        ofFloat.setDuration(z5 ? this.f6246 : this.f6247);
        ofFloat.setInterpolator(z5 ? this.f6249 : this.f6250);
        return ofFloat;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private ObjectAnimator m7463(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f6257, 0.0f);
        ofFloat.setDuration(this.f6245);
        ofFloat.setInterpolator(this.f6248);
        return ofFloat;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private void m7464(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private TextView m7465(int i5) {
        if (i5 == 1) {
            return this.f6263;
        }
        if (i5 != 2) {
            return null;
        }
        return this.f6271;
    }

    /* renamed from: יי, reason: contains not printable characters */
    private boolean m7466(TextView textView, CharSequence charSequence) {
        return f1.m2808(this.f6252) && this.f6252.isEnabled() && !(this.f6259 == this.f6258 && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private boolean m7467(int i5) {
        return (i5 != 2 || this.f6271 == null || TextUtils.isEmpty(this.f6269)) ? false : true;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m7468(ViewGroup viewGroup, int i5) {
        if (i5 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int m7469(boolean z5, int i5, int i6) {
        return z5 ? this.f6251.getResources().getDimensionPixelSize(i5) : i6;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private void m7470(int i5, int i6, boolean z5) {
        if (i5 == i6) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6256 = animatorSet;
            ArrayList arrayList = new ArrayList();
            m7461(arrayList, this.f6270, this.f6271, 2, i5, i6);
            m7461(arrayList, this.f6261, this.f6263, 1, i5, i6);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            animatorSet.addListener(new a(i6, m7465(i5), i5, m7465(i6)));
            animatorSet.start();
        } else {
            m7459(i5, i6);
        }
        this.f6252.updateEditTextBackground();
        this.f6252.updateLabelState(z5);
        this.f6252.updateTextInputBoxState();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean m7471(int i5) {
        return (i5 != 1 || this.f6263 == null || TextUtils.isEmpty(this.f6260)) ? false : true;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    boolean m7472() {
        return this.f6261;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    void m7473(TextView textView, int i5) {
        FrameLayout frameLayout;
        if (this.f6253 == null) {
            return;
        }
        if (!m7493(i5) || (frameLayout = this.f6255) == null) {
            this.f6253.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i6 = this.f6254 - 1;
        this.f6254 = i6;
        m7468(this.f6253, i6);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    boolean m7474() {
        return this.f6270;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    void m7475(int i5) {
        this.f6266 = i5;
        TextView textView = this.f6263;
        if (textView != null) {
            f1.m2833(textView, i5);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m7476(TextView textView, int i5) {
        if (this.f6253 == null && this.f6255 == null) {
            LinearLayout linearLayout = new LinearLayout(this.f6251);
            this.f6253 = linearLayout;
            linearLayout.setOrientation(0);
            this.f6252.addView(this.f6253, -1, -2);
            this.f6255 = new FrameLayout(this.f6251);
            this.f6253.addView(this.f6255, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6252.getEditText() != null) {
                m7477();
            }
        }
        if (m7493(i5)) {
            this.f6255.setVisibility(0);
            this.f6255.addView(textView);
        } else {
            this.f6253.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6253.setVisibility(0);
        this.f6254++;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m7477() {
        if (m7460()) {
            EditText editText = this.f6252.getEditText();
            boolean isFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(this.f6251);
            LinearLayout linearLayout = this.f6253;
            int i5 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
            f1.m2847(linearLayout, m7469(isFontScaleAtLeast1_3, i5, f1.m2871(editText)), m7469(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_top, this.f6251.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), m7469(isFontScaleAtLeast1_3, i5, f1.m2867(editText)), 0);
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    void m7478(boolean z5) {
        if (this.f6261 == z5) {
            return;
        }
        m7480();
        if (z5) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f6251);
            this.f6263 = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.f6263.setTextAlignment(5);
            Typeface typeface = this.f6264;
            if (typeface != null) {
                this.f6263.setTypeface(typeface);
            }
            m7481(this.f6267);
            m7479(this.f6268);
            m7489(this.f6265);
            m7475(this.f6266);
            this.f6263.setVisibility(4);
            m7476(this.f6263, 0);
        } else {
            m7500();
            m7473(this.f6263, 0);
            this.f6263 = null;
            this.f6252.updateEditTextBackground();
            this.f6252.updateTextInputBoxState();
        }
        this.f6261 = z5;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    void m7479(ColorStateList colorStateList) {
        this.f6268 = colorStateList;
        TextView textView = this.f6263;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m7480() {
        Animator animator = this.f6256;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    void m7481(int i5) {
        this.f6267 = i5;
        TextView textView = this.f6263;
        if (textView != null) {
            this.f6252.setTextAppearanceCompatWithErrorFallback(textView, i5);
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m7482(boolean z5) {
        if (this.f6270 == z5) {
            return;
        }
        m7480();
        if (z5) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f6251);
            this.f6271 = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.f6271.setTextAlignment(5);
            Typeface typeface = this.f6264;
            if (typeface != null) {
                this.f6271.setTypeface(typeface);
            }
            this.f6271.setVisibility(4);
            f1.m2833(this.f6271, 1);
            m7483(this.f6272);
            m7485(this.f6262);
            m7476(this.f6271, 1);
            this.f6271.setAccessibilityDelegate(new b());
        } else {
            m7501();
            m7473(this.f6271, 1);
            this.f6271 = null;
            this.f6252.updateEditTextBackground();
            this.f6252.updateTextInputBoxState();
        }
        this.f6270 = z5;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    void m7483(int i5) {
        this.f6272 = i5;
        TextView textView = this.f6271;
        if (textView != null) {
            androidx.core.widget.c0.m3570(textView, i5);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean m7484() {
        return m7471(this.f6259);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m7485(ColorStateList colorStateList) {
        this.f6262 = colorStateList;
        TextView textView = this.f6271;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    void m7486(Typeface typeface) {
        if (typeface != this.f6264) {
            this.f6264 = typeface;
            m7464(this.f6263, typeface);
            m7464(this.f6271, typeface);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    int m7487() {
        return this.f6266;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    CharSequence m7488() {
        return this.f6265;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    void m7489(CharSequence charSequence) {
        this.f6265 = charSequence;
        TextView textView = this.f6263;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    CharSequence m7490() {
        return this.f6260;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    int m7491() {
        TextView textView = this.f6263;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    ColorStateList m7492() {
        TextView textView = this.f6263;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    boolean m7493(int i5) {
        return i5 == 0 || i5 == 1;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    CharSequence m7494() {
        return this.f6269;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    void m7495(CharSequence charSequence) {
        m7480();
        this.f6260 = charSequence;
        this.f6263.setText(charSequence);
        int i5 = this.f6258;
        if (i5 != 1) {
            this.f6259 = 1;
        }
        m7470(i5, this.f6259, m7466(this.f6263, charSequence));
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    View m7496() {
        return this.f6271;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    int m7497() {
        TextView textView = this.f6271;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    void m7498(CharSequence charSequence) {
        m7480();
        this.f6269 = charSequence;
        this.f6271.setText(charSequence);
        int i5 = this.f6258;
        if (i5 != 2) {
            this.f6259 = 2;
        }
        m7470(i5, this.f6259, m7466(this.f6271, charSequence));
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    boolean m7499() {
        return m7467(this.f6258);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m7500() {
        this.f6260 = null;
        m7480();
        if (this.f6258 == 1) {
            if (!this.f6270 || TextUtils.isEmpty(this.f6269)) {
                this.f6259 = 0;
            } else {
                this.f6259 = 2;
            }
        }
        m7470(this.f6258, this.f6259, m7466(this.f6263, BuildConfig.FLAVOR));
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m7501() {
        m7480();
        int i5 = this.f6258;
        if (i5 == 2) {
            this.f6259 = 0;
        }
        m7470(i5, this.f6259, m7466(this.f6271, BuildConfig.FLAVOR));
    }
}
