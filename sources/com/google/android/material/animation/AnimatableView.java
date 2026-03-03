package com.google.android.material.animation;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface AnimatableView {

    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(Listener listener);

    void stopAnimation();
}
