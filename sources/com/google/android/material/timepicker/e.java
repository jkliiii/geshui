package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: MaxInputValidator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e implements InputFilter {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f6357;

    public e(int i5) {
        this.f6357 = i5;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i7, i8, charSequence.subSequence(i5, i6).toString());
            if (Integer.parseInt(sb.toString()) <= this.f6357) {
                return null;
            }
            return BuildConfig.FLAVOR;
        } catch (NumberFormatException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
