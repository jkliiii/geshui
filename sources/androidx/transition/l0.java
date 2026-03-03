package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l0 extends i0 {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static boolean f4513 = true;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static boolean f4514 = true;

    l0() {
    }

    @Override // androidx.transition.r0
    @SuppressLint({"NewApi"})
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo5379(View view, Matrix matrix) {
        if (f4513) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4513 = false;
            }
        }
    }

    @Override // androidx.transition.r0
    @SuppressLint({"NewApi"})
    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo5380(View view, Matrix matrix) {
        if (f4514) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4514 = false;
            }
        }
    }
}
