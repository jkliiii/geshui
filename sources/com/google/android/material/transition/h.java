package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.s0;
import androidx.transition.x;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MaterialVisibility.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class h<P extends VisibilityAnimatorProvider> extends s0 {
    private final List<VisibilityAnimatorProvider> additionalAnimatorProviders = new ArrayList();
    private final P primaryAnimatorProvider;
    private VisibilityAnimatorProvider secondaryAnimatorProvider;

    protected h(P p5, VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.primaryAnimatorProvider = p5;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z5) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator createAppear = z5 ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (createAppear != null) {
            list.add(createAppear);
        }
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z5);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z5);
        Iterator<VisibilityAnimatorProvider> it = this.additionalAnimatorProviders.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z5);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z5);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(Context context, boolean z5) {
        k.m7702(this, context, getDurationThemeAttrResId(z5));
        k.m7703(this, context, getEasingThemeAttrResId(z5), getDefaultEasingInterpolator(z5));
    }

    public void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.additionalAnimatorProviders.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    TimeInterpolator getDefaultEasingInterpolator(boolean z5) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    int getDurationThemeAttrResId(boolean z5) {
        return 0;
    }

    int getEasingThemeAttrResId(boolean z5) {
        return 0;
    }

    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // androidx.transition.s0
    public Animator onAppear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // androidx.transition.s0
    public Animator onDisappear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.additionalAnimatorProviders.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }
}
