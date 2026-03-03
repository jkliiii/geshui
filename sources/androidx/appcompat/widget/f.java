package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: AppCompatButton.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends Button implements androidx.core.view.c1, androidx.core.widget.r0 {
    private m mAppCompatEmojiTextHelper;
    private final e mBackgroundTintHelper;
    private final y0 mTextHelper;

    public f(Context context) {
        this(context, null);
    }

    private m getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new m(this);
        }
        return this.mAppCompatEmojiTextHelper;
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
            return super.getAutoSizeMaxTextSize();
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
            return super.getAutoSizeMinTextSize();
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
            return super.getAutoSizeStepGranularity();
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
            return super.getAutoSizeTextAvailableSizes();
        }
        y0 y0Var = this.mTextHelper;
        return y0Var != null ? y0Var.m1618() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (p3.f1397) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
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

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m1420();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1625(z5, i5, i6, i7, i8);
        }
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
            super.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
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
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
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
            super.setAutoSizeTextTypeWithDefaults(i5);
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

    public void setSupportAllCaps(boolean z5) {
        y0 y0Var = this.mTextHelper;
        if (y0Var != null) {
            y0Var.m1630(z5);
        }
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

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6915);
    }

    public f(Context context, AttributeSet attributeSet, int i5) {
        super(a3.m1138(context), attributeSet, i5);
        y2.m1650(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.m1207(attributeSet, i5);
        y0 y0Var = new y0(this);
        this.mTextHelper = y0Var;
        y0Var.m1623(attributeSet, i5);
        y0Var.m1613();
        getEmojiTextViewHelper().m1421(attributeSet, i5);
    }
}
