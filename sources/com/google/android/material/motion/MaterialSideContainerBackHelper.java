package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f1;
import androidx.core.view.r;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    class a extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ boolean f5885;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f5886;

        a(boolean z5, int i5) {
            this.f5885 = z5;
            this.f5886 = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
            MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, this.f5885, this.f5886);
        }
    }

    public MaterialSideContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(int i5, int i6) {
        return (r.m3298(i5, f1.m2834(this.view)) & i6) == i6;
    }

    private int getEdgeMargin(boolean z5) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v5 = this.view;
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i5), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(androidx.activity.b bVar, int i5, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z5 = bVar.m366() == 0;
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i5, 3);
        float width = (this.view.getWidth() * this.view.getScaleX()) + getEdgeMargin(checkAbsoluteGravity);
        V v5 = this.view;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (checkAbsoluteGravity) {
            width = -width;
        }
        fArr[0] = width;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v5, (Property<V, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new h0.b());
        ofFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, bVar.m365()));
        ofFloat.addListener(new a(z5, i5));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void startBackProgress(androidx.activity.b bVar) {
        super.onStartBackProgress(bVar);
    }

    public void updateBackProgress(androidx.activity.b bVar, int i5) {
        if (super.onUpdateBackProgress(bVar) == null) {
            return;
        }
        updateBackProgress(bVar.m365(), bVar.m366() == 0, i5);
    }

    public void updateBackProgress(float f5, boolean z5, int i5) {
        int i6;
        float interpolateProgress = interpolateProgress(f5);
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i5, 3);
        boolean z6 = z5 == checkAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f6 = width;
        if (f6 > 0.0f) {
            float f7 = height;
            if (f7 <= 0.0f) {
                return;
            }
            float f8 = this.maxScaleXDistanceShrink / f6;
            float f9 = this.maxScaleXDistanceGrow / f6;
            float f10 = this.maxScaleYDistance / f7;
            V v5 = this.view;
            if (checkAbsoluteGravity) {
                f6 = 0.0f;
            }
            v5.setPivotX(f6);
            if (!z6) {
                f9 = -f8;
            }
            float lerp = AnimationUtils.lerp(0.0f, f9, interpolateProgress);
            float f11 = lerp + 1.0f;
            this.view.setScaleX(f11);
            float lerp2 = 1.0f - AnimationUtils.lerp(0.0f, f10, interpolateProgress);
            this.view.setScaleY(lerp2);
            V v6 = this.view;
            if (v6 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v6;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (checkAbsoluteGravity) {
                        i6 = (width - childAt.getRight()) + childAt.getWidth();
                    } else {
                        i6 = -childAt.getLeft();
                    }
                    childAt.setPivotX(i6);
                    childAt.setPivotY(-childAt.getTop());
                    float f12 = z6 ? 1.0f - lerp : 1.0f;
                    float f13 = lerp2 != 0.0f ? (f11 / lerp2) * f12 : 1.0f;
                    childAt.setScaleX(f12);
                    childAt.setScaleY(f13);
                }
            }
        }
    }
}
