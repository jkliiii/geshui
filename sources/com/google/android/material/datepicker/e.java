package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateFormatTextWatcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class e extends TextWatcherAdapter {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final TextInputLayout f5669;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final String f5670;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final DateFormat f5671;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final CalendarConstraints f5672;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final String f5673;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final Runnable f5674;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Runnable f5675;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f5676 = 0;

    e(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f5670 = str;
        this.f5671 = dateFormat;
        this.f5669 = textInputLayout;
        this.f5672 = calendarConstraints;
        this.f5673 = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f5674 = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5665.m6703(str);
            }
        };
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private Runnable m6701(final long j5) {
        return new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f5667.m6702(j5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public /* synthetic */ void m6702(long j5) {
        this.f5669.setError(String.format(this.f5673, m6704(j.m6712(j5))));
        mo6682();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿ, reason: contains not printable characters */
    public /* synthetic */ void m6703(String str) {
        TextInputLayout textInputLayout = this.f5669;
        DateFormat dateFormat = this.f5671;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), m6704(str)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), m6704(dateFormat.format(new Date(w.m6784().getTimeInMillis())))));
        mo6682();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private String m6704(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f5670.length() && editable.length() >= this.f5676) {
            char charAt = this.f5670.charAt(editable.length());
            if (Character.isDigit(charAt)) {
                return;
            }
            editable.append(charAt);
        }
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        this.f5676 = charSequence.length();
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        this.f5669.removeCallbacks(this.f5674);
        this.f5669.removeCallbacks(this.f5675);
        this.f5669.setError(null);
        mo6683(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f5670.length()) {
            return;
        }
        try {
            Date parse = this.f5671.parse(charSequence.toString());
            this.f5669.setError(null);
            long time = parse.getTime();
            if (this.f5672.getDateValidator().isValid(time) && this.f5672.isWithinBounds(time)) {
                mo6683(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable m6701 = m6701(time);
            this.f5675 = m6701;
            m6705(this.f5669, m6701);
        } catch (ParseException unused) {
            m6705(this.f5669, this.f5674);
        }
    }

    /* renamed from: ˆ */
    abstract void mo6682();

    /* renamed from: ˈ */
    abstract void mo6683(Long l5);

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m6705(View view, Runnable runnable) {
        view.post(runnable);
    }
}
