package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: GravityCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class r {

    /* compiled from: GravityCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3299(int i5, int i6, int i7, Rect rect, int i8, int i9, Rect rect2, int i10) {
            Gravity.apply(i5, i6, i7, rect, i8, i9, rect2, i10);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m3300(int i5, int i6, int i7, Rect rect, Rect rect2, int i8) {
            Gravity.apply(i5, i6, i7, rect, rect2, i8);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3301(int i5, Rect rect, Rect rect2, int i6) {
            Gravity.applyDisplay(i5, rect, rect2, i6);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m3297(int i5, int i6, int i7, Rect rect, Rect rect2, int i8) {
        a.m3300(i5, i6, i7, rect, rect2, i8);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m3298(int i5, int i6) {
        return Gravity.getAbsoluteGravity(i5, i6);
    }
}
