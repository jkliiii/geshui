package y1;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* compiled from: LogTime.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final double f12451 = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: ʻ, reason: contains not printable characters */
    public static double m12878(long j5) {
        double m12879 = m12879() - j5;
        double d6 = f12451;
        Double.isNaN(m12879);
        return m12879 * d6;
    }

    @TargetApi(17)
    /* renamed from: ʼ, reason: contains not printable characters */
    public static long m12879() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
