package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final PointerIcon f2915;

    /* compiled from: PointerIconCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static PointerIcon m2755(Bitmap bitmap, float f5, float f6) {
            return PointerIcon.create(bitmap, f5, f6);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static PointerIcon m2756(Context context, int i5) {
            return PointerIcon.getSystemIcon(context, i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static PointerIcon m2757(Resources resources, int i5) {
            return PointerIcon.load(resources, i5);
        }
    }

    private b1(PointerIcon pointerIcon) {
        this.f2915 = pointerIcon;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static b1 m2753(Context context, int i5) {
        return Build.VERSION.SDK_INT >= 24 ? new b1(a.m2756(context, i5)) : new b1(null);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public Object m2754() {
        return this.f2915;
    }
}
