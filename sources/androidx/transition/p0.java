package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class p0 extends n0 {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean f4532 = true;

    p0() {
    }

    @Override // androidx.transition.r0
    @SuppressLint({"NewApi"})
    /* renamed from: ˈ, reason: contains not printable characters */
    public void mo5388(View view, int i5) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo5388(view, i5);
        } else if (f4532) {
            try {
                view.setTransitionVisibility(i5);
            } catch (NoSuchMethodError unused) {
                f4532 = false;
            }
        }
    }
}
