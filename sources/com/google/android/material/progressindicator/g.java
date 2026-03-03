package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.color.MaterialColors;
import java.util.Arrays;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class g extends e<ObjectAnimator> {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Property<g, Float> f5943 = new b(Float.class, "animationFraction");

    /* renamed from: ʾ, reason: contains not printable characters */
    private ObjectAnimator f5944;

    /* renamed from: ʿ, reason: contains not printable characters */
    private h0.b f5945;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final BaseProgressIndicatorSpec f5946;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f5947;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f5948;

    /* renamed from: ˊ, reason: contains not printable characters */
    private float f5949;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            g gVar = g.this;
            gVar.f5947 = (gVar.f5947 + 1) % g.this.f5946.indicatorColors.length;
            g.this.f5948 = true;
        }
    }

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    class b extends Property<g, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.m7026());
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(g gVar, Float f5) {
            gVar.m7031(f5.floatValue());
        }
    }

    public g(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f5947 = 1;
        this.f5946 = linearProgressIndicatorSpec;
        this.f5945 = new h0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public float m7026() {
        return this.f5949;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m7027() {
        if (this.f5944 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f5943, 0.0f, 1.0f);
            this.f5944 = ofFloat;
            ofFloat.setDuration(333L);
            this.f5944.setInterpolator(null);
            this.f5944.setRepeatCount(-1);
            this.f5944.addListener(new a());
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m7028() {
        if (!this.f5948 || this.f5937[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f5938;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = MaterialColors.compositeARGBWithAlpha(this.f5946.indicatorColors[this.f5947], this.f5936.getAlpha());
        this.f5948 = false;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m7029(int i5) {
        this.f5937[0] = 0.0f;
        float m7019 = m7019(i5, 0, 667);
        float[] fArr = this.f5937;
        float interpolation = this.f5945.getInterpolation(m7019);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f5937;
        float interpolation2 = this.f5945.getInterpolation(m7019 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f5937[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʻ */
    public void mo7003() {
        ObjectAnimator objectAnimator = this.f5944;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʽ */
    public void mo7004() {
        m7030();
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˈ */
    public void mo7007() {
        m7027();
        m7030();
        this.f5944.start();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m7030() {
        this.f5948 = true;
        this.f5947 = 1;
        Arrays.fill(this.f5938, MaterialColors.compositeARGBWithAlpha(this.f5946.indicatorColors[0], this.f5936.getAlpha()));
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m7031(float f5) {
        this.f5949 = f5;
        m7029((int) (f5 * 333.0f));
        m7028();
        this.f5936.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʾ */
    public void mo7005(androidx.vectordrawable.graphics.drawable.b bVar) {
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˆ */
    public void mo7006() {
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˉ */
    public void mo7008() {
    }
}
