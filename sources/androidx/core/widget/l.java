package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: EdgeEffectCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class l {

    /* compiled from: EdgeEffectCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3633(EdgeEffect edgeEffect, float f5, float f6) {
            edgeEffect.onPull(f5, f6);
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    private static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static EdgeEffect m3634(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static float m3635(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static float m3636(EdgeEffect edgeEffect, float f5, float f6) {
            try {
                return edgeEffect.onPullDistance(f5, f6);
            } catch (Throwable unused) {
                edgeEffect.onPull(f5, f6);
                return 0.0f;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static EdgeEffect m3629(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.m3634(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static float m3630(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m3635(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m3631(EdgeEffect edgeEffect, float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.m3633(edgeEffect, f5, f6);
        } else {
            edgeEffect.onPull(f5);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static float m3632(EdgeEffect edgeEffect, float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m3636(edgeEffect, f5, f6);
        }
        m3631(edgeEffect, f5, f6);
        return f5;
    }
}
