package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.core.util.h;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseMotionStrategy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class b implements g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f5727;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final ExtendedFloatingActionButton f5728;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final ArrayList<Animator.AnimatorListener> f5729 = new ArrayList<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final com.google.android.material.floatingactionbutton.a f5730;

    /* renamed from: ʿ, reason: contains not printable characters */
    private MotionSpec f5731;

    /* renamed from: ˆ, reason: contains not printable characters */
    private MotionSpec f5732;

    /* compiled from: BaseMotionStrategy.java */
    class a extends Property<ExtendedFloatingActionButton, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f5728.originalTextCsl.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f5) {
            int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f5728.originalTextCsl.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f5.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f5.floatValue() == 1.0f) {
                extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
            } else {
                extendedFloatingActionButton.silentlyUpdateTextColor(valueOf);
            }
        }
    }

    b(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f5728 = extendedFloatingActionButton;
        this.f5727 = extendedFloatingActionButton.getContext();
        this.f5730 = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public void onAnimationEnd() {
        this.f5730.m6816();
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public void onAnimationStart(Animator animator) {
        this.f5730.m6817(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    /* renamed from: ʻ, reason: contains not printable characters */
    public final void mo6819(Animator.AnimatorListener animatorListener) {
        this.f5729.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    /* renamed from: ʼ */
    public void mo6810() {
        this.f5730.m6816();
    }

    @Override // com.google.android.material.floatingactionbutton.g
    /* renamed from: ʽ, reason: contains not printable characters */
    public final void mo6820(MotionSpec motionSpec) {
        this.f5732 = motionSpec;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    /* renamed from: ˆ, reason: contains not printable characters */
    public MotionSpec mo6821() {
        return this.f5732;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    /* renamed from: ˈ */
    public AnimatorSet mo6807() {
        return m6824(m6825());
    }

    @Override // com.google.android.material.floatingactionbutton.g
    /* renamed from: ˉ, reason: contains not printable characters */
    public final List<Animator.AnimatorListener> mo6822() {
        return this.f5729;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void mo6823(Animator.AnimatorListener animatorListener) {
        this.f5729.remove(animatorListener);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    AnimatorSet m6824(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.hasPropertyValues("opacity")) {
            arrayList.add(motionSpec.getAnimator("opacity", this.f5728, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", this.f5728, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", this.f5728, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", this.f5728, ExtendedFloatingActionButton.WIDTH));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", this.f5728, ExtendedFloatingActionButton.HEIGHT));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", this.f5728, ExtendedFloatingActionButton.PADDING_START));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", this.f5728, ExtendedFloatingActionButton.PADDING_END));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", this.f5728, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: י, reason: contains not printable characters */
    public final MotionSpec m6825() {
        MotionSpec motionSpec = this.f5732;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.f5731 == null) {
            this.f5731 = MotionSpec.createFromResource(this.f5727, mo6805());
        }
        return (MotionSpec) h.m2583(this.f5731);
    }
}
