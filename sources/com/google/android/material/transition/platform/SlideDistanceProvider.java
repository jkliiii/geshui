package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f1;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance = -1;
    private int slideEdge;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6595;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6596;

        a(View view, float f5) {
            this.f6595 = view;
            this.f6596 = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6595.setTranslationX(this.f6596);
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6597;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6598;

        b(View view, float f5) {
            this.f6597 = view;
            this.f6598 = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6597.setTranslationY(this.f6598);
        }
    }

    public SlideDistanceProvider(int i5) {
        this.slideEdge = i5;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i5, int i6) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i5 == 3) {
            return createTranslationXAnimator(view2, i6 + translationX, translationX, translationX);
        }
        if (i5 == 5) {
            return createTranslationXAnimator(view2, translationX - i6, translationX, translationX);
        }
        if (i5 == 48) {
            return createTranslationYAnimator(view2, translationY - i6, translationY, translationY);
        }
        if (i5 == 80) {
            return createTranslationYAnimator(view2, i6 + translationY, translationY, translationY);
        }
        if (i5 == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? i6 + translationX : translationX - i6, translationX, translationX);
        }
        if (i5 == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? translationX - i6 : i6 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i5);
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i5, int i6) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i5 == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - i6, translationX);
        }
        if (i5 == 5) {
            return createTranslationXAnimator(view2, translationX, i6 + translationX, translationX);
        }
        if (i5 == 48) {
            return createTranslationYAnimator(view2, translationY, i6 + translationY, translationY);
        }
        if (i5 == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - i6, translationY);
        }
        if (i5 == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - i6 : i6 + translationX, translationX);
        }
        if (i5 == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? i6 + translationX : translationX - i6, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i5);
    }

    private static Animator createTranslationXAnimator(View view, float f5, float f6, float f7) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f6));
        ofPropertyValuesHolder.addListener(new a(view, f7));
        return ofPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(View view, float f5, float f6, float f7) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f5, f6));
        ofPropertyValuesHolder.addListener(new b(view, f7));
        return ofPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i5 = this.slideDistance;
        return i5 != -1 ? i5 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        return f1.m2834(view) == 1;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.slideDistance = i5;
    }

    public void setSlideEdge(int i5) {
        this.slideEdge = i5;
    }
}
