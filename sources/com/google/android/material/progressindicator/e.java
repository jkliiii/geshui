package com.google.android.material.progressindicator;

import android.animation.Animator;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class e<T extends Animator> {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected IndeterminateDrawable f5936;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final float[] f5937;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final int[] f5938;

    protected e(int i5) {
        this.f5937 = new float[i5 * 2];
        this.f5938 = new int[i5];
    }

    /* renamed from: ʻ */
    abstract void mo7003();

    /* renamed from: ʼ, reason: contains not printable characters */
    protected float m7019(int i5, int i6, int i7) {
        return (i5 - i6) / i7;
    }

    /* renamed from: ʽ */
    public abstract void mo7004();

    /* renamed from: ʾ */
    public abstract void mo7005(androidx.vectordrawable.graphics.drawable.b bVar);

    /* renamed from: ʿ, reason: contains not printable characters */
    protected void m7020(IndeterminateDrawable indeterminateDrawable) {
        this.f5936 = indeterminateDrawable;
    }

    /* renamed from: ˆ */
    abstract void mo7006();

    /* renamed from: ˈ */
    abstract void mo7007();

    /* renamed from: ˉ */
    public abstract void mo7008();
}
