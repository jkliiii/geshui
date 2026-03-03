package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.material.R;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";
    private androidx.activity.b backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;
    private final TimeInterpolator progressInterpolator;
    protected final V view;

    public MaterialBackAnimationHelper(V v5) {
        this.view = v5;
        Context context = v5.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardDecelerateInterpolator, androidx.core.view.animation.b.m2745(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, HIDE_DURATION_MAX_DEFAULT);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, HIDE_DURATION_MIN_DEFAULT);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    protected float interpolateProgress(float f5) {
        return this.progressInterpolator.getInterpolation(f5);
    }

    protected androidx.activity.b onCancelBackProgress() {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = this.backEvent;
        this.backEvent = null;
        return bVar;
    }

    public androidx.activity.b onHandleBackInvoked() {
        androidx.activity.b bVar = this.backEvent;
        this.backEvent = null;
        return bVar;
    }

    protected void onStartBackProgress(androidx.activity.b bVar) {
        this.backEvent = bVar;
    }

    protected androidx.activity.b onUpdateBackProgress(androidx.activity.b bVar) {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = this.backEvent;
        this.backEvent = bVar;
        return bVar2;
    }
}
