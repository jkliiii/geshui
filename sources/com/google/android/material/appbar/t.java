package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.ThemeEnforcement;

/* compiled from: ViewUtilsLollipop.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final int[] f5278 = {R.attr.stateListAnimator};

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m6207(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m6208(View view, float f5) {
        int integer = view.getResources().getInteger(com.google.android.material.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j5 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.google.android.material.R.attr.state_liftable, -com.google.android.material.R.attr.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j5));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f5).setDuration(j5));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m6209(View view, AttributeSet attributeSet, int i5, int i6) {
        Context context = view.getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, f5278, i5, i6, new int[0]);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, obtainStyledAttributes.getResourceId(0, 0)));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
