package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface VisibilityAnimatorProvider {
    Animator createAppear(ViewGroup viewGroup, View view);

    Animator createDisappear(ViewGroup viewGroup, View view);
}
