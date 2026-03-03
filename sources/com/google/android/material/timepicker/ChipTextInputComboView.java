package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* loaded from: E:\78999\cookie_5123796.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Chip f6293;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final TextInputLayout f6294;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final EditText f6295;

    /* renamed from: ˈ, reason: contains not printable characters */
    private TextWatcher f6296;

    /* renamed from: ˉ, reason: contains not printable characters */
    private TextView f6297;

    private class b extends TextWatcherAdapter {
        private b() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f6293.setText(ChipTextInputComboView.this.m7538("00"));
                return;
            }
            String m7538 = ChipTextInputComboView.this.m7538(editable);
            Chip chip = ChipTextInputComboView.this.f6293;
            if (TextUtils.isEmpty(m7538)) {
                m7538 = ChipTextInputComboView.this.m7538("00");
            }
            chip.setText(m7538);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public String m7538(CharSequence charSequence) {
        return h.m7611(getResources(), charSequence);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m7539() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f6295.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f6293.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m7539();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        this.f6293.setChecked(z5);
        this.f6295.setVisibility(z5 ? 0 : 4);
        this.f6293.setVisibility(z5 ? 8 : 0);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.f6295, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6293.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i5, Object obj) {
        this.f6293.setTag(i5, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f6293.toggle();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m7540(InputFilter inputFilter) {
        InputFilter[] filters = this.f6295.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f6295.setFilters(inputFilterArr);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public TextInputLayout m7541() {
        return this.f6294;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m7542(androidx.core.view.a aVar) {
        f1.m2830(this.f6293, aVar);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m7543(CharSequence charSequence) {
        String m7538 = m7538(charSequence);
        this.f6293.setText(m7538);
        if (TextUtils.isEmpty(m7538)) {
            return;
        }
        this.f6295.removeTextChangedListener(this.f6296);
        this.f6295.setText(m7538);
        this.f6295.addTextChangedListener(this.f6296);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f6293 = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f6294 = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f6295 = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f6296 = bVar;
        editText.addTextChangedListener(bVar);
        m7539();
        addView(chip);
        addView(textInputLayout);
        this.f6297 = (TextView) findViewById(R.id.material_label);
        editText.setId(f1.m2880());
        f1.m2845(this.f6297, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
