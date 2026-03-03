package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class ToneDeltaConstraint {
    public final double delta;
    public final DynamicColor keepAway;
    public final TonePolarity keepAwayPolarity;

    public ToneDeltaConstraint(double d6, DynamicColor dynamicColor, TonePolarity tonePolarity) {
        this.delta = d6;
        this.keepAway = dynamicColor;
        this.keepAwayPolarity = tonePolarity;
    }
}
