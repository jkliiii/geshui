package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class n0 extends l0 {

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean f4518 = true;

    n0() {
    }

    @Override // androidx.transition.r0
    @SuppressLint({"NewApi"})
    /* renamed from: ʿ, reason: contains not printable characters */
    public void mo5383(View view, int i5, int i6, int i7, int i8) {
        if (f4518) {
            try {
                view.setLeftTopRightBottom(i5, i6, i7, i8);
            } catch (NoSuchMethodError unused) {
                f4518 = false;
            }
        }
    }
}
