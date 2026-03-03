package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean f4480 = true;

    /* renamed from: ʻ, reason: contains not printable characters */
    static a0 m5341(ViewGroup viewGroup) {
        return new z(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m5342(ViewGroup viewGroup, boolean z5) {
        if (f4480) {
            try {
                viewGroup.suppressLayout(z5);
            } catch (NoSuchMethodError unused) {
                f4480 = false;
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m5343(ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z5);
        } else {
            m5342(viewGroup, z5);
        }
    }
}
