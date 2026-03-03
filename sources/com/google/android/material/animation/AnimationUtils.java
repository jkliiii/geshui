package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h0.a;
import h0.b;
import h0.c;

/* loaded from: E:\78999\cookie_5123796.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new c();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f5, float f6, float f7) {
        return f5 + (f7 * (f6 - f5));
    }

    public static int lerp(int i5, int i6, float f5) {
        return i5 + Math.round(f5 * (i6 - i5));
    }

    public static float lerp(float f5, float f6, float f7, float f8, float f9) {
        return f9 <= f7 ? f5 : f9 >= f8 ? f6 : lerp(f5, f6, (f9 - f7) / (f8 - f7));
    }
}
