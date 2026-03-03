package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.x;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MaterialSharedAxis extends h<VisibilityAnimatorProvider> {
    private static final int DEFAULT_THEMED_DURATION_ATTR = R.attr.motionDurationLong1;
    private static final int DEFAULT_THEMED_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    private final int axis;
    private final boolean forward;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public MaterialSharedAxis(int i5, boolean z5) {
        super(createPrimaryAnimatorProvider(i5, z5), createSecondaryAnimatorProvider());
        this.axis = i5;
        this.forward = z5;
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i5, boolean z5) {
        if (i5 == 0) {
            return new SlideDistanceProvider(z5 ? 8388613 : 8388611);
        }
        if (i5 == 1) {
            return new SlideDistanceProvider(z5 ? 80 : 48);
        }
        if (i5 == 2) {
            return new ScaleProvider(z5);
        }
        throw new IllegalArgumentException("Invalid axis: " + i5);
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.h
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.h
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.axis;
    }

    @Override // com.google.android.material.transition.h
    int getDurationThemeAttrResId(boolean z5) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.h
    int getEasingThemeAttrResId(boolean z5) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.h
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.h
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.forward;
    }

    @Override // com.google.android.material.transition.h, androidx.transition.s0
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return super.onAppear(viewGroup, view, xVar, xVar2);
    }

    @Override // com.google.android.material.transition.h, androidx.transition.s0
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return super.onDisappear(viewGroup, view, xVar, xVar2);
    }

    @Override // com.google.android.material.transition.h
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.h
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
