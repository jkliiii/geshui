package c2;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static Interpolator m5843(float f5, float f6, float f7, float f8) {
        return Build.VERSION.SDK_INT >= 21 ? d.m5844(f5, f6, f7, f8) : e.m5845(f5, f6, f7, f8);
    }
}
