package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* compiled from: AppCompatEditText.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k extends EditText implements androidx.core.view.c1, androidx.core.view.w0, androidx.core.widget.r0 {
    private final l mAppCompatEmojiEditTextHelper;
    private final e mBackgroundTintHelper;
    private final androidx.core.widget.o0 mDefaultOnReceiveContentListener;
    private a mSuperCaller;
    private final x0 mTextClassifierHelper;
    private final y0 mTextHelper;

    /* compiled from: AppCompatEditText.java */
    class a {
        a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public TextClassifier m1401() {
            return k.super.getTextClassifier();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m1402(TextClassifier textClassifier) {
            k.super.setTextClassifier(textClassifier);
        }
    }

    public k(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x0 x0Var;
        return (Build.VERSION.SDK_INT >= 28 || (x0Var = this.mTextClassifierHelper) == null) ? getSuperCaller().m1401() : x0Var.m1597();
    }

    void initEmojiKeyListener(l lVar) {
        KeyListener keyListener = getKeyListener();
        if (lVar.m1407(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m1406 = lVar.m1406(keyListener);
            if (m1406 == keyListener) {
                return;
            }
            super.setKeyListener(m1406);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m1408();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m2885;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m1629(this, onCreateInputConnection, editorInfo);
        InputConnection m1437 = n.m1437(onCreateInputConnection, editorInfo, this);
        if (m1437 != null && Build.VERSION.SDK_INT <= 30 && (m2885 = androidx.core.view.f1.m2885(this)) != null) {
            x.d.m12633(editorInfo, m2885);
            m1437 = x.f.m12642(this, m1437, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.m1410(m1437, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (o0.m1446(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.w0
    public androidx.core.view.c onReceiveContent(androidx.core.view.c cVar) {
        return this.mDefaultOnReceiveContentListener.mo3374(this, cVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i5) {
        if (o0.m1447(this, i5)) {
            return true;
        }
        return super.onTextContextMenuItem(i5);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.c0.m3573(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.mAppCompatEmojiEditTextHelper.m1411(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m1406(keyListener));
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
            getSuperCaller().m1402(textClassifier);
        } else {
            x0Var.m1598(textClassifier);
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6889);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public k(Context context, AttributeSet attributeSet, int i5) {
        super(a3.m1138(context), attributeSet, i5);
        y2.m1650(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.m1207(attributeSet, i5);
        y0 y0Var = new y0(this);
        this.mTextHelper = y0Var;
        y0Var.m1623(attributeSet, i5);
        y0Var.m1613();
        this.mTextClassifierHelper = new x0(this);
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.o0();
        l lVar = new l(this);
        this.mAppCompatEmojiEditTextHelper = lVar;
        lVar.m1409(attributeSet, i5);
        initEmojiKeyListener(lVar);
    }
}
