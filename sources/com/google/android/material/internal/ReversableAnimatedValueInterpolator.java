package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }

    public static TimeInterpolator of(boolean z5, TimeInterpolator timeInterpolator) {
        return z5 ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        return 1.0f - this.sourceInterpolator.getInterpolation(f5);
    }
}
