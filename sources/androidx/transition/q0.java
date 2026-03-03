package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class q0 extends p0 {
    q0() {
    }

    @Override // androidx.transition.i0, androidx.transition.r0
    /* renamed from: ʽ */
    public float mo5370(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.n0, androidx.transition.r0
    /* renamed from: ʿ */
    public void mo5383(View view, int i5, int i6, int i7, int i8) {
        view.setLeftTopRightBottom(i5, i6, i7, i8);
    }

    @Override // androidx.transition.i0, androidx.transition.r0
    /* renamed from: ˆ */
    public void mo5372(View view, float f5) {
        view.setTransitionAlpha(f5);
    }

    @Override // androidx.transition.p0, androidx.transition.r0
    /* renamed from: ˈ */
    public void mo5388(View view, int i5) {
        view.setTransitionVisibility(i5);
    }

    @Override // androidx.transition.l0, androidx.transition.r0
    /* renamed from: ˉ */
    public void mo5379(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.l0, androidx.transition.r0
    /* renamed from: ˊ */
    public void mo5380(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
