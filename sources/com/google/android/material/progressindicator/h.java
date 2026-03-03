package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.j;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import java.util.Arrays;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class h extends e<ObjectAnimator> {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final int[] f5951 = {533, 567, 850, 750};

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final int[] f5952 = {1267, 1000, 333, 0};

    /* renamed from: י, reason: contains not printable characters */
    private static final Property<h, Float> f5953 = new c(Float.class, "animationFraction");

    /* renamed from: ʾ, reason: contains not printable characters */
    private ObjectAnimator f5954;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ObjectAnimator f5955;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Interpolator[] f5956;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final BaseProgressIndicatorSpec f5957;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f5958;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f5959;

    /* renamed from: ˋ, reason: contains not printable characters */
    private float f5960;

    /* renamed from: ˎ, reason: contains not printable characters */
    androidx.vectordrawable.graphics.drawable.b f5961;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            h hVar = h.this;
            hVar.f5958 = (hVar.f5958 + 1) % h.this.f5957.indicatorColors.length;
            h.this.f5959 = true;
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            h.this.mo7003();
            h hVar = h.this;
            androidx.vectordrawable.graphics.drawable.b bVar = hVar.f5961;
            if (bVar != null) {
                bVar.mo5425(hVar.f5936);
            }
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class c extends Property<h, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(h hVar) {
            return Float.valueOf(hVar.m7039());
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(h hVar, Float f5) {
            hVar.m7044(f5.floatValue());
        }
    }

    public h(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f5958 = 0;
        this.f5961 = null;
        this.f5957 = linearProgressIndicatorSpec;
        this.f5956 = new Interpolator[]{j.m5444(context, R.anim.linear_indeterminate_line1_head_interpolator), j.m5444(context, R.anim.linear_indeterminate_line1_tail_interpolator), j.m5444(context, R.anim.linear_indeterminate_line2_head_interpolator), j.m5444(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public float m7039() {
        return this.f5960;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m7040() {
        if (this.f5954 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f5953, 0.0f, 1.0f);
            this.f5954 = ofFloat;
            ofFloat.setDuration(1800L);
            this.f5954.setInterpolator(null);
            this.f5954.setRepeatCount(-1);
            this.f5954.addListener(new a());
        }
        if (this.f5955 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f5953, 1.0f);
            this.f5955 = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f5955.setInterpolator(null);
            this.f5955.addListener(new b());
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m7041() {
        if (this.f5959) {
            Arrays.fill(this.f5938, MaterialColors.compositeARGBWithAlpha(this.f5957.indicatorColors[this.f5958], this.f5936.getAlpha()));
            this.f5959 = false;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m7042(int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f5937[i6] = Math.max(0.0f, Math.min(1.0f, this.f5956[i6].getInterpolation(m7019(i5, f5952[i6], f5951[i6]))));
        }
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʻ */
    public void mo7003() {
        ObjectAnimator objectAnimator = this.f5954;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʽ */
    public void mo7004() {
        m7043();
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ʾ */
    public void mo7005(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f5961 = bVar;
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˆ */
    public void mo7006() {
        ObjectAnimator objectAnimator = this.f5955;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo7003();
        if (this.f5936.isVisible()) {
            this.f5955.setFloatValues(this.f5960, 1.0f);
            this.f5955.setDuration((long) ((1.0f - this.f5960) * 1800.0f));
            this.f5955.start();
        }
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˈ */
    public void mo7007() {
        m7040();
        m7043();
        this.f5954.start();
    }

    @Override // com.google.android.material.progressindicator.e
    /* renamed from: ˉ */
    public void mo7008() {
        this.f5961 = null;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m7043() {
        this.f5958 = 0;
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(this.f5957.indicatorColors[0], this.f5936.getAlpha());
        int[] iArr = this.f5938;
        iArr[0] = compositeARGBWithAlpha;
        iArr[1] = compositeARGBWithAlpha;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m7044(float f5) {
        this.f5960 = f5;
        m7042((int) (f5 * 1800.0f));
        m7041();
        this.f5936.invalidateSelf();
    }
}
