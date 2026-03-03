package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.a0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: E:\78999\cookie_5123796.dex */
public class AppCompatTextView extends TextView implements androidx.core.view.c1, androidx.core.widget.r0 {
    private final e mBackgroundTintHelper;
    private m mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<androidx.core.text.a0> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final x0 mTextClassifierHelper;
    private final y0 mTextHelper;

    private interface a {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo1052(int[] iArr, int i5);

        /* renamed from: ʼ, reason: contains not printable characters */
        void mo1053(TextClassifier textClassifier);

        /* renamed from: ʽ, reason: contains not printable characters */
        int[] mo1054();

        /* renamed from: ʾ, reason: contains not printable characters */
        void mo1055(int i5);

        /* renamed from: ʿ, reason: contains not printable characters */
        TextClassifier mo1056();

        /* renamed from: ˆ, reason: contains not printable characters */
        int mo1057();

        /* renamed from: ˈ, reason: contains not printable characters */
        void mo1058(int i5, int i6, int i7, int i8);

        /* renamed from: ˉ, reason: contains not printable characters */
        int mo1059();

        /* renamed from: ˊ, reason: contains not printable characters */
        int mo1060();

        /* renamed from: ˋ, reason: contains not printable characters */
        void mo1061(int i5);

        /* renamed from: ˎ, reason: contains not printable characters */
        int mo1062();

        /* renamed from: ˏ, reason: contains not printable characters */
        void mo1063(int i5);
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ʾ */
        public void mo1055(int i5) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i5);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˋ */
        public void mo1061(int i5) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i5);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<androidx.core.text.a0> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.c0.m3569(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private m getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new m(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1204();
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1613();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p3.f1397) {
            return getSuperCaller().mo1057();
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            return y0Var.m1615();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p3.f1397) {
            return getSuperCaller().mo1060();
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            return y0Var.m1616();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p3.f1397) {
            return getSuperCaller().mo1062();
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            return y0Var.m1617();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p3.f1397) {
            return getSuperCaller().mo1054();
        }
        y0 y0Var = this.mTextHelper;
        return y0Var != null ? y0Var.m1618() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (p3.f1397) {
            return getSuperCaller().mo1059() == 1 ? 1 : 0;
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            return y0Var.m1619();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.c0.m3572(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.c0.m3557(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.c0.m3558(this);
    }

    a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                this.mSuperCaller = new c();
            } else if (i5 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    @Override // androidx.core.view.c1
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.m1205();
        }
        return null;
    }

    @Override // androidx.core.view.c1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.m1206();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m1620();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m1621();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x0 x0Var;
        return (Build.VERSION.SDK_INT >= 28 || (x0Var = this.mTextClassifierHelper) == null) ? getSuperCaller().mo1056() : x0Var.m1597();
    }

    public a0.a getTextMetricsParamsCompat() {
        return androidx.core.widget.c0.m3562(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m1420();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m1629(this, onCreateInputConnection, editorInfo);
        return n.m1437(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1625(z5, i5, i6, i7, i8);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i5, i6);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        y0 y0Var = this.mTextHelper;
        if ((y0Var == null || p3.f1397 || !y0Var.m1622()) ? false : true) {
            this.mTextHelper.m1614();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().m1422(z5);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        if (p3.f1397) {
            getSuperCaller().mo1058(i5, i6, i7, i8);
            return;
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1631(i5, i6, i7, i8);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i5) throws IllegalArgumentException {
        if (p3.f1397) {
            getSuperCaller().mo1052(iArr, i5);
            return;
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1632(iArr, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i5) {
        if (p3.f1397) {
            getSuperCaller().mo1063(i5);
            return;
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1633(i5);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1208(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1209(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.c0.m3573(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().m1423(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1419(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1061(i5);
        } else {
            androidx.core.widget.c0.m3566(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1055(i5);
        } else {
            androidx.core.widget.c0.m3567(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i5) {
        androidx.core.widget.c0.m3568(this, i5);
    }

    public void setPrecomputedText(androidx.core.text.a0 a0Var) {
        androidx.core.widget.c0.m3569(this, a0Var);
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1211(colorStateList);
        }
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1212(mode);
        }
    }

    @Override // androidx.core.widget.r0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m1634(colorStateList);
        this.mTextHelper.m1613();
    }

    @Override // androidx.core.widget.r0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m1635(mode);
        this.mTextHelper.m1613();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1627(context, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x0 x0Var;
        if (Build.VERSION.SDK_INT >= 28 || (x0Var = this.mTextClassifierHelper) == null) {
            getSuperCaller().mo1053(textClassifier);
        } else {
            x0Var.m1598(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.a0> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a0.a aVar) {
        androidx.core.widget.c0.m3571(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i5, float f5) {
        if (p3.f1397) {
            super.setTextSize(i5, f5);
            return;
        }
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1628(i5, f5);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i5) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface m2318 = (typeface == null || i5 <= 0) ? null : androidx.core.graphics.m0.m2318(getContext(), typeface, i5);
        this.mIsSetTypefaceProcessing = true;
        if (m2318 != null) {
            typeface = m2318;
        }
        try {
            super.setTypeface(typeface, i5);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i5) {
        super(a3.m1138(context), attributeSet, i5);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        y2.m1650(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.m1207(attributeSet, i5);
        y0 y0Var = new y0(this);
        this.mTextHelper = y0Var;
        y0Var.m1623(attributeSet, i5);
        y0Var.m1613();
        this.mTextClassifierHelper = new x0(this);
        getEmojiTextViewHelper().m1421(attributeSet, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i5 != 0 ? f.a.m8475(context, i5) : null, i6 != 0 ? f.a.m8475(context, i6) : null, i7 != 0 ? f.a.m8475(context, i7) : null, i8 != 0 ? f.a.m8475(context, i8) : null);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i5 != 0 ? f.a.m8475(context, i5) : null, i6 != 0 ? f.a.m8475(context, i6) : null, i7 != 0 ? f.a.m8475(context, i7) : null, i8 != 0 ? f.a.m8475(context, i8) : null);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ʻ */
        public void mo1052(int[] iArr, int i5) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ʼ */
        public void mo1053(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ʽ */
        public int[] mo1054() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ʿ */
        public TextClassifier mo1056() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˆ */
        public int mo1057() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˈ */
        public void mo1058(int i5, int i6, int i7, int i8) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˉ */
        public int mo1059() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˊ */
        public int mo1060() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˎ */
        public int mo1062() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˏ */
        public void mo1063(int i5) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i5);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ʾ */
        public void mo1055(int i5) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        /* renamed from: ˋ */
        public void mo1061(int i5) {
        }
    }
}
