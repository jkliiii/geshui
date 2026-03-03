package b2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import d2.f;

/* compiled from: AnimationUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m5680(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m5681(f... fVarArr) {
        for (f fVar : fVarArr) {
            if (fVar.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m5682(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m5683(Animator animator) {
        if (animator == null || animator.isStarted()) {
            return;
        }
        animator.start();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m5684(f... fVarArr) {
        for (f fVar : fVarArr) {
            fVar.start();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m5685(f... fVarArr) {
        for (f fVar : fVarArr) {
            fVar.stop();
        }
    }
}
