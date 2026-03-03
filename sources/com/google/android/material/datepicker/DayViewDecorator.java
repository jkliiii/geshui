package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class DayViewDecorator implements Parcelable {
    public ColorStateList getBackgroundColor(Context context, int i5, int i6, int i7, boolean z5, boolean z6) {
        return null;
    }

    public Drawable getCompoundDrawableBottom(Context context, int i5, int i6, int i7, boolean z5, boolean z6) {
        return null;
    }

    public Drawable getCompoundDrawableLeft(Context context, int i5, int i6, int i7, boolean z5, boolean z6) {
        return null;
    }

    public Drawable getCompoundDrawableRight(Context context, int i5, int i6, int i7, boolean z5, boolean z6) {
        return null;
    }

    public Drawable getCompoundDrawableTop(Context context, int i5, int i6, int i7, boolean z5, boolean z6) {
        return null;
    }

    public ColorStateList getTextColor(Context context, int i5, int i6, int i7, boolean z5, boolean z6) {
        return null;
    }

    public void initialize(Context context) {
    }

    public CharSequence getContentDescription(Context context, int i5, int i6, int i7, boolean z5, boolean z6, CharSequence charSequence) {
        return charSequence;
    }
}
