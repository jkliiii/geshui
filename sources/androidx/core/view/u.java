package androidx.core.view;

import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class u {

    /* compiled from: MarginLayoutParamsCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m3357(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3358(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m3359(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static boolean m3360(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m3361(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.resolveLayoutDirection(i5);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static void m3362(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.setLayoutDirection(i5);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static void m3363(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.setMarginEnd(i5);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static void m3364(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.setMarginStart(i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m3353(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m3358(marginLayoutParams);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m3354(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m3359(marginLayoutParams);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m3355(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        a.m3363(marginLayoutParams, i5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m3356(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        a.m3364(marginLayoutParams, i5);
    }
}
