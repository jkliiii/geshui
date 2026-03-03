package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: E:\78999\cookie_5123796.dex */
public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    public static void setDefaultSystemAnimatorDurationScale(float f5) {
        defaultSystemAnimatorDurationScale = f5;
    }

    public float getSystemAnimatorDurationScale(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
