package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.s0;
import androidx.transition.x;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class Hold extends s0 {
    @Override // androidx.transition.s0
    public Animator onAppear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.s0
    public Animator onDisappear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
