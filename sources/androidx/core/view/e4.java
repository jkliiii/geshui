package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e4 {

    /* compiled from: ViewGroupCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2799(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2800(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m2801(ViewGroup viewGroup, boolean z5) {
            viewGroup.setTransitionGroup(z5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m2798(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m2800(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(u.b.f11385);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && f1.m2879(viewGroup) == null) ? false : true;
    }
}
