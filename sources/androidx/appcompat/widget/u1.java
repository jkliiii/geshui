package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u1 extends ToggleButton implements androidx.core.view.c1, androidx.core.widget.r0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final e f1465;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final y0 f1466;

    /* renamed from: ˆ, reason: contains not printable characters */
    private m f1467;

    public u1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1467 == null) {
            this.f1467 = new m(this);
        }
        return this.f1467;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1465;
        if (eVar != null) {
            eVar.m1204();
        }
        y0 y0Var = this.f1466;
        if (y0Var != null) {
            y0Var.m1613();
        }
    }

    @Override // androidx.core.view.c1
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1465;
        if (eVar != null) {
            return eVar.m1205();
        }
        return null;
    }

    @Override // androidx.core.view.c1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1465;
        if (eVar != null) {
            return eVar.m1206();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1466.m1620();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1466.m1621();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().m1422(z5);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1465;
        if (eVar != null) {
            eVar.m1208(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        e eVar = this.f1465;
        if (eVar != null) {
            eVar.m1209(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f1466;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f1466;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().m1423(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1419(inputFilterArr));
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1465;
        if (eVar != null) {
            eVar.m1211(colorStateList);
        }
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1465;
        if (eVar != null) {
            eVar.m1212(mode);
        }
    }

    @Override // androidx.core.widget.r0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1466.m1634(colorStateList);
        this.f1466.m1613();
    }

    @Override // androidx.core.widget.r0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1466.m1635(mode);
        this.f1466.m1613();
    }

    public u1(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        y2.m1650(this, getContext());
        e eVar = new e(this);
        this.f1465 = eVar;
        eVar.m1207(attributeSet, i5);
        y0 y0Var = new y0(this);
        this.f1466 = y0Var;
        y0Var.m1623(attributeSet, i5);
        getEmojiTextViewHelper().m1421(attributeSet, i5);
    }
}
