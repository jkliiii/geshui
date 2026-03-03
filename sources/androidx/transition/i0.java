package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class i0 extends r0 {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static boolean f4509 = true;

    i0() {
    }

    @Override // androidx.transition.r0
    @SuppressLint({"NewApi"})
    /* renamed from: ʽ, reason: contains not printable characters */
    public float mo5370(View view) {
        if (f4509) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f4509 = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.r0
    @SuppressLint({"NewApi"})
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo5372(View view, float f5) {
        if (f4509) {
            try {
                view.setTransitionAlpha(f5);
                return;
            } catch (NoSuchMethodError unused) {
                f4509 = false;
            }
        }
        view.setAlpha(f5);
    }

    @Override // androidx.transition.r0
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo5369(View view) {
    }

    @Override // androidx.transition.r0
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo5371(View view) {
    }
}
