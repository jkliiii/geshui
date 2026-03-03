package com.google.android.material.carousel;

import android.view.View;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class CarouselStrategy {
    static float getChildMaskPercentage(float f5, float f6, float f7) {
        return 1.0f - ((f5 - f7) / (f6 - f7));
    }

    boolean isContained() {
        return true;
    }

    abstract e onFirstChildMeasuredWithMargins(b bVar, View view);
}
