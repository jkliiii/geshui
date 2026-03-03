package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class y extends t {

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f6280;

    /* renamed from: ˆ, reason: contains not printable characters */
    private EditText f6281;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final View.OnClickListener f6282;

    y(s sVar, int i5) {
        super(sVar);
        this.f6280 = R.drawable.design_password_eye;
        this.f6282 = new View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6279.m7505(view);
            }
        };
        if (i5 != 0) {
            this.f6280 = i5;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean m7503() {
        EditText editText = this.f6281;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static boolean m7504(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞ, reason: contains not printable characters */
    public /* synthetic */ void m7505(View view) {
        EditText editText = this.f6281;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (m7503()) {
            this.f6281.setTransformationMethod(null);
        } else {
            this.f6281.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f6281.setSelection(selectionEnd);
        }
        m7444();
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʼ */
    void mo7443(CharSequence charSequence, int i5, int i6, int i7) {
        m7444();
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʽ */
    int mo7304() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ʾ */
    int mo7305() {
        return this.f6280;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˆ */
    View.OnClickListener mo7307() {
        return this.f6282;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˏ */
    boolean mo7351() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ˑ */
    boolean mo7352() {
        return !m7503();
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: י */
    void mo7309(EditText editText) {
        this.f6281 = editText;
        m7444();
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ᵎ */
    void mo7311() {
        if (m7504(this.f6281)) {
            this.f6281.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.t
    /* renamed from: ᵢ */
    void mo7312() {
        EditText editText = this.f6281;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
