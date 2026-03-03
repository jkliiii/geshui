package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* compiled from: AnimatorTracker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private Animator f5726;

    a() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m6815() {
        Animator animator = this.f5726;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m6816() {
        this.f5726 = null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m6817(Animator animator) {
        m6815();
        this.f5726 = animator;
    }
}
