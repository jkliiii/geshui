package androidx.core.view.animation;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* compiled from: PathInterpolatorCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static PathInterpolator m2747(float f5, float f6) {
            return new PathInterpolator(f5, f6);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static PathInterpolator m2748(float f5, float f6, float f7, float f8) {
            return new PathInterpolator(f5, f6, f7, f8);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static PathInterpolator m2749(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Interpolator m2745(float f5, float f6, float f7, float f8) {
        return Build.VERSION.SDK_INT >= 21 ? a.m2748(f5, f6, f7, f8) : new androidx.core.view.animation.a(f5, f6, f7, f8);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Interpolator m2746(Path path) {
        return Build.VERSION.SDK_INT >= 21 ? a.m2749(path) : new androidx.core.view.animation.a(path);
    }
}
