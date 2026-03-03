package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: TimePickerTextInputKeyController.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ChipTextInputComboView f6379;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final ChipTextInputComboView f6380;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final h f6381;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f6382 = false;

    k(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, h hVar) {
        this.f6379 = chipTextInputComboView;
        this.f6380 = chipTextInputComboView2;
        this.f6381 = hVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m7636(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m7637(int i5) {
        this.f6380.setChecked(i5 == 12);
        this.f6379.setChecked(i5 == 10);
        this.f6381.f6367 = i5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean m7638(int i5, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i5 >= 7 && i5 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            m7637(12);
            return true;
        }
        m7636(editText);
        return false;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m7639(int i5, KeyEvent keyEvent, EditText editText) {
        if (i5 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            m7637(10);
            return true;
        }
        m7636(editText);
        return false;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
        boolean z5 = i5 == 5;
        if (z5) {
            m7637(12);
        }
        return z5;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (this.f6382) {
            return false;
        }
        this.f6382 = true;
        EditText editText = (EditText) view;
        boolean m7639 = this.f6381.f6367 == 12 ? m7639(i5, keyEvent, editText) : m7638(i5, keyEvent, editText);
        this.f6382 = false;
        return m7639;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m7640() {
        TextInputLayout m7541 = this.f6379.m7541();
        TextInputLayout m75412 = this.f6380.m7541();
        EditText editText = m7541.getEditText();
        EditText editText2 = m75412.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }
}
