package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.util.h;
import com.google.android.material.R;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f extends d {

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private StateListAnimator f5819;

    /* compiled from: FloatingActionButtonImplLollipop.java */
    static class a extends MaterialShapeDrawable {
        a(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    f(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    private StateListAnimator m6901(float f5, float f6, float f7) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.f5755, m6902(f5, f7));
        stateListAnimator.addState(d.f5757, m6902(f5, f6));
        stateListAnimator.addState(d.f5756, m6902(f5, f6));
        stateListAnimator.addState(d.f5759, m6902(f5, f6));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f5787, "elevation", f5).setDuration(0L));
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 22 && i5 <= 24) {
            arrayList.add(ObjectAnimator.ofFloat(this.f5787, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, this.f5787.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f5787, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.f5752);
        stateListAnimator.addState(d.f5758, animatorSet);
        stateListAnimator.addState(d.f5760, m6902(0.0f, 0.0f));
        return stateListAnimator;
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    private Animator m6902(float f5, float f6) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f5787, "elevation", f5).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f5787, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f6).setDuration(100L));
        animatorSet.setInterpolator(d.f5752);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ʻʽ */
    void mo6847(ColorStateList colorStateList) {
        Drawable drawable = this.f5765;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        } else {
            super.mo6847(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ʻˈ */
    boolean mo6851() {
        return this.f5788.isCompatPaddingEnabled() || !m6852();
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    c m6903(int i5, ColorStateList colorStateList) {
        Context context = this.f5787.getContext();
        c cVar = new c((ShapeAppearanceModel) h.m2583(this.f5762));
        cVar.m6832(androidx.core.content.a.m1991(context, R.color.design_fab_stroke_top_outer_color), androidx.core.content.a.m1991(context, R.color.design_fab_stroke_top_inner_color), androidx.core.content.a.m1991(context, R.color.design_fab_stroke_end_inner_color), androidx.core.content.a.m1991(context, R.color.design_fab_stroke_end_outer_color));
        cVar.m6831(i5);
        cVar.m6830(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ʽʽ */
    void mo6859() {
        m6856();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ʾʾ */
    void mo6860(float f5, float f6, float f7) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f5787.refreshDrawableState();
        } else if (this.f5787.getStateListAnimator() == this.f5819) {
            StateListAnimator m6901 = m6901(f5, f6, f7);
            this.f5819 = m6901;
            this.f5787.setStateListAnimator(m6901);
        }
        if (mo6851()) {
            m6856();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ʿʿ */
    void mo6862(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.f5787.isEnabled()) {
                this.f5787.setElevation(0.0f);
                this.f5787.setTranslationZ(0.0f);
                return;
            }
            this.f5787.setElevation(this.f5770);
            if (this.f5787.isPressed()) {
                this.f5787.setTranslationZ(this.f5772);
            } else if (this.f5787.isFocused() || this.f5787.isHovered()) {
                this.f5787.setTranslationZ(this.f5771);
            } else {
                this.f5787.setTranslationZ(0.0f);
            }
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ˎˎ */
    boolean mo6870() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ˏ */
    MaterialShapeDrawable mo6871() {
        return new a((ShapeAppearanceModel) h.m2583(this.f5762));
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: י */
    public float mo6875() {
        return this.f5787.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ᵎ */
    void mo6884(Rect rect) {
        if (this.f5788.isCompatPaddingEnabled()) {
            super.mo6884(rect);
        } else if (m6852()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f5773 - this.f5787.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ﾞ */
    void mo6896(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i5) {
        Drawable drawable;
        MaterialShapeDrawable mo6871 = mo6871();
        this.f5764 = mo6871;
        mo6871.setTintList(colorStateList);
        if (mode != null) {
            this.f5764.setTintMode(mode);
        }
        this.f5764.initializeElevationOverlay(this.f5787.getContext());
        if (i5 > 0) {
            this.f5766 = m6903(i5, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) h.m2583(this.f5766), (Drawable) h.m2583(this.f5764)});
        } else {
            this.f5766 = null;
            drawable = this.f5764;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList2), drawable, null);
        this.f5765 = rippleDrawable;
        this.f5767 = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ʻˎ */
    void mo6854() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    /* renamed from: ᴵᴵ */
    void mo6883() {
    }
}
