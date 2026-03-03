package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    private AnimatorSet currentAnimation;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.currentAnimation = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    protected abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z5, boolean z6);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean onExpandedStateChange(View view, View view2, boolean z5, boolean z6) {
        AnimatorSet animatorSet = this.currentAnimation;
        boolean z7 = animatorSet != null;
        if (z7) {
            animatorSet.cancel();
        }
        AnimatorSet onCreateExpandedStateChangeAnimation = onCreateExpandedStateChangeAnimation(view, view2, z5, z7);
        this.currentAnimation = onCreateExpandedStateChangeAnimation;
        onCreateExpandedStateChangeAnimation.addListener(new a());
        this.currentAnimation.start();
        if (!z6) {
            this.currentAnimation.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
