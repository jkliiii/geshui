package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends CheckedTextView implements androidx.core.widget.p0, androidx.core.view.c1, androidx.core.widget.r0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final h f1237;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final e f1238;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final y0 f1239;

    /* renamed from: ˈ, reason: contains not printable characters */
    private m f1240;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6919);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1240 == null) {
            this.f1240 = new m(this);
        }
        return this.f1240;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        y0 y0Var = this.f1239;
        if (y0Var != null) {
            y0Var.m1613();
        }
        e eVar = this.f1238;
        if (eVar != null) {
            eVar.m1204();
        }
        h hVar = this.f1237;
        if (hVar != null) {
            hVar.m1280();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.c0.m3572(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.c1
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1238;
        if (eVar != null) {
            return eVar.m1205();
        }
        return null;
    }

    @Override // androidx.core.view.c1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1238;
        if (eVar != null) {
            return eVar.m1206();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f1237;
        if (hVar != null) {
            return hVar.m1281();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f1237;
        if (hVar != null) {
            return hVar.m1282();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1239.m1620();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1239.m1621();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return n.m1437(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().m1422(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1238;
        if (eVar != null) {
            eVar.m1208(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        e eVar = this.f1238;
        if (eVar != null) {
            eVar.m1209(i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f1237;
        if (hVar != null) {
            hVar.m1284();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f1239;
        if (y0Var != null) {
            y0Var.m1626();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f1239;
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

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1238;
        if (eVar != null) {
            eVar.m1211(colorStateList);
        }
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1238;
        if (eVar != null) {
            eVar.m1212(mode);
        }
    }

    @Override // androidx.core.widget.p0
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f1237;
        if (hVar != null) {
            hVar.m1285(colorStateList);
        }
    }

    @Override // androidx.core.widget.p0
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1237;
        if (hVar != null) {
            hVar.m1286(mode);
        }
    }

    @Override // androidx.core.widget.r0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1239.m1634(colorStateList);
        this.f1239.m1613();
    }

    @Override // androidx.core.widget.r0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1239.m1635(mode);
        this.f1239.m1613();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        y0 y0Var = this.f1239;
        if (y0Var != null) {
            y0Var.m1627(context, i5);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i5) {
        super(a3.m1138(context), attributeSet, i5);
        y2.m1650(this, getContext());
        y0 y0Var = new y0(this);
        this.f1239 = y0Var;
        y0Var.m1623(attributeSet, i5);
        y0Var.m1613();
        e eVar = new e(this);
        this.f1238 = eVar;
        eVar.m1207(attributeSet, i5);
        h hVar = new h(this);
        this.f1237 = hVar;
        hVar.m1283(attributeSet, i5);
        getEmojiTextViewHelper().m1421(attributeSet, i5);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i5) {
        setCheckMarkDrawable(f.a.m8475(getContext(), i5));
    }
}
