package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class StateListAnimator {
    private final ArrayList<b> tuples = new ArrayList<>();
    private b lastMatch = null;
    ValueAnimator runningAnimator = null;
    private final Animator.AnimatorListener animationListener = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.runningAnimator == animator) {
                stateListAnimator.runningAnimator = null;
            }
        }
    }

    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final int[] f5845;

        /* renamed from: ʼ, reason: contains not printable characters */
        final ValueAnimator f5846;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f5845 = iArr;
            this.f5846 = valueAnimator;
        }
    }

    private void cancel() {
        ValueAnimator valueAnimator = this.runningAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.runningAnimator = null;
        }
    }

    private void start(b bVar) {
        ValueAnimator valueAnimator = bVar.f5846;
        this.runningAnimator = valueAnimator;
        valueAnimator.start();
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.animationListener);
        this.tuples.add(bVar);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.runningAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.runningAnimator = null;
        }
    }

    public void setState(int[] iArr) {
        b bVar;
        int size = this.tuples.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                bVar = null;
                break;
            }
            bVar = this.tuples.get(i5);
            if (StateSet.stateSetMatches(bVar.f5845, iArr)) {
                break;
            } else {
                i5++;
            }
        }
        b bVar2 = this.lastMatch;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            cancel();
        }
        this.lastMatch = bVar;
        if (bVar != null) {
            start(bVar);
        }
    }
}
