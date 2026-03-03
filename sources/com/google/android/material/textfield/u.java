package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.f1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import java.util.Arrays;

/* compiled from: IconHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class u {
    /* renamed from: ʻ, reason: contains not printable characters */
    static void m7445(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.m2213(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                androidx.core.graphics.drawable.a.m2210(drawable, colorStateList);
            } else {
                androidx.core.graphics.drawable.a.m2210(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m7447(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                androidx.core.graphics.drawable.a.m2211(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static ImageView.ScaleType m7446(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 5 ? i5 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int[] m7447(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static void m7448(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m7447(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = androidx.core.graphics.drawable.a.m2213(drawable).mutate();
        androidx.core.graphics.drawable.a.m2210(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static void m7449(CheckableImageButton checkableImageButton) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21 || i5 > 22) {
            return;
        }
        checkableImageButton.setBackground(RippleUtils.createOvalRippleLollipop(checkableImageButton.getContext(), (int) ViewUtils.dpToPx(checkableImageButton.getContext(), 4)));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m7450(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m2897 = f1.m2897(checkableImageButton);
        boolean z5 = onLongClickListener != null;
        boolean z6 = m2897 || z5;
        checkableImageButton.setFocusable(z6);
        checkableImageButton.setClickable(m2897);
        checkableImageButton.setPressable(m2897);
        checkableImageButton.setLongClickable(z5);
        f1.m2843(checkableImageButton, z6 ? 1 : 2);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static void m7451(CheckableImageButton checkableImageButton, int i5) {
        checkableImageButton.setMinimumWidth(i5);
        checkableImageButton.setMinimumHeight(i5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static void m7452(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m7450(checkableImageButton, onLongClickListener);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m7453(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m7450(checkableImageButton, onLongClickListener);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static void m7454(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
