package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.color.MaterialColors;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b extends e<ObjectAnimator> {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final int[] f5917 = {0, 1350, 2700, 4050};

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final int[] f5918 = {667, 2017, 3367, 4717};

    /* renamed from: י, reason: contains not printable characters */
    private static final int[] f5919 = {1000, 2350, 3700, 5050};

    /* renamed from: ـ, reason: contains not printable characters */
    private static final Property<b, Float> f5920 = new c(Float.class, "animationFraction");

    /* renamed from: ٴ, reason: contains not printable characters */
    private static final Property<b, Float> f5921 = new d(Float.class, "completeEndFraction");

    /* renamed from: ʾ, reason: contains not printable characters */
    private ObjectAnimator f5922;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ObjectAnimator f5923;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final h0.b f5924;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final BaseProgressIndicatorSpec f5925;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f5926;

    /* renamed from: ˊ, reason: contains not printable characters */
    private float f5927;

    /* renamed from: ˋ, reason: contains not printable characters */
    private float f5928;

    /* renamed from: ˎ, reason: contains not printable characters */
    androidx.vectordrawable.graphics.drawable.b f5929;

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            b bVar = b.this;
            bVar.f5926 = (bVar.f5926 + 4) % b.this.f5925.indicatorColors.length;
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* renamed from: com.google.android.material.progressindicator.b$b, reason: collision with other inner class name */
    class C0084b extends AnimatorListenerAdapter {
        C0084b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            b.this.mo7003();
            b bVar = b.this;
            androidx.vectordrawable.graphics.drawable.b bVar2 = bVar.f5929;
            if (bVar2 != null) {
                bVar2.mo5425(bVar.f5936);
            }
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    class c extends Property<b, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(b bVar) {
            return Float.valueOf(bVar.m6997());
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(b bVar, Float f5) {
            bVar.m7010(f5.floatValue());
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    class d extends Property<b, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(b bVar) {
            return Float.valueOf(bVar.m6998());
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(b bVar, Float f5) {
            bVar.m7001(f5.floatValue());
        }
    }

    public b(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f5926 = 0;
        this.f5929 = null;
        this.f5925 = circularProgressIndicatorSpec;
        this.f5924 = new h0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ـ, reason: contains not printable characters */
    public float m6997() {
        return this.f5927;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ٴ, reason: contains not printable characters */
    public float m6998() {
        return this.f5928;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m6999() {
        if (this.f5922 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f5920, 0.0f, 1.0f);
            this.f5922 = ofFloat;
            ofFloat.setDuration(5400L);
            this.f5922.setInterpolator(null);
            this.f5922.setRepeatCount(-1);
            this.f5922.addListener(new a());
        }
        if (this.f5923 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f5921, 0.0f, 1.0f);
            this.f5923 = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f5923.setInterpolator(this.f5924);
            this.f5923.addListener(new C0084b());
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m7000(int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            float m7019 = m7019(i5, f5919[i6], 333);
            if (m7019 >= 0.0f && m7019 <= 1.0f) {
                int i7 = i6 + this.f5926;
                int[] iArr = this.f5925.indicatorColors;
                int length = i7 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(iArr[length], this.f5936.getAlpha());
                int compositeARGBWithAlpha2 = MaterialColors.compositeARGBWithAlpha(this.f5925.indicatorColors[length2], this.f5936.getAlpha());
                this.f5938[0] = ArgbEvaluatorCompat.getInstance().evaluate(this.f5924.getInterpolation(m7019), Integer.valueOf(compositeARGBWithAlpha), Integer.valueOf(compositeARGBWithAlpha2)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m7001(float f5) {
        this.f5928 = f5;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m7002(int i5) {
        float[] fArr = this.f5937;
        float f5 = this.f5927;
        fArr[0] = (f5 * 1520.0f) - 20.0f;
        fArr[1] = f5 * 1520.0f;
        for (int i6 = 0; i6 < 4; i6++) {
            float m7019 = m7019(i5, f5917[i6], 667);
            float[] fArr2 = this.f5937;
            fArr2[1] = fArr2[1] + (this.f5924.getInterpolation(m7019) * 250.0f);
            float m70192 = m7019(i5, f5918[i6], 667);
            float[] fArr3 = this.f5937;
            fArr3[0] = fArr3[0] + (this.f5924.getInterpolation(m70192) * 250.0f);
        }
        float[] fArr4 = this.f5937;
        float f6 = fArr4[0];
        float f7 = fArr4[1];
        float f8 = f6 + ((f7 - f6) * this.f5928);
        fArr4[0] = f8;
        fArr4[0] = f8 / 360.0f;
        fArr4[1] = f7 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʻ, reason: contains not printable characters */
    void mo7003() {
        ObjectAnimator objectAnimator = this.f5922;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo7004() {
        m7009();
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo7005(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f5929 = bVar;
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˆ, reason: contains not printable characters */
    void mo7006() {
        ObjectAnimator objectAnimator = this.f5923;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f5936.isVisible()) {
            this.f5923.start();
        } else {
            mo7003();
        }
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˈ, reason: contains not printable characters */
    void mo7007() {
        m6999();
        m7009();
        this.f5922.start();
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo7008() {
        this.f5929 = null;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m7009() {
        this.f5926 = 0;
        this.f5938[0] = MaterialColors.compositeARGBWithAlpha(this.f5925.indicatorColors[0], this.f5936.getAlpha());
        this.f5928 = 0.0f;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m7010(float f5) {
        this.f5927 = f5;
        int i5 = (int) (f5 * 5400.0f);
        m7002(i5);
        m7000(i5);
        this.f5936.invalidateSelf();
    }
}
