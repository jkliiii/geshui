package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.g0;

/* compiled from: CamUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final float[][] f2591 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: ʼ, reason: contains not printable characters */
    static final float[][] f2592 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: ʽ, reason: contains not printable characters */
    static final float[] f2593 = {95.047f, 100.0f, 108.883f};

    /* renamed from: ʾ, reason: contains not printable characters */
    static final float[][] f2594 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: ʻ, reason: contains not printable characters */
    static int m2050(float f5) {
        if (f5 < 1.0f) {
            return -16777216;
        }
        if (f5 > 99.0f) {
            return -1;
        }
        float f6 = (f5 + 16.0f) / 116.0f;
        float f7 = (f5 > 8.0f ? 1 : (f5 == 8.0f ? 0 : -1)) > 0 ? f6 * f6 * f6 : f5 / 903.2963f;
        float f8 = f6 * f6 * f6;
        boolean z5 = f8 > 0.008856452f;
        float f9 = z5 ? f8 : ((f6 * 116.0f) - 16.0f) / 903.2963f;
        if (!z5) {
            f8 = ((f6 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f2593;
        return g0.m2270(f9 * fArr[0], f7 * fArr[1], f8 * fArr[2]);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static float m2051(int i5) {
        return m2052(m2056(i5));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static float m2052(float f5) {
        float f6 = f5 / 100.0f;
        return f6 <= 0.008856452f ? f6 * 903.2963f : (((float) Math.cbrt(f6)) * 116.0f) - 16.0f;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static float m2053(float f5, float f6, float f7) {
        return f5 + ((f6 - f5) * f7);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static float m2054(int i5) {
        float f5 = i5 / 255.0f;
        return (f5 <= 0.04045f ? f5 / 12.92f : (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static float[] m2055(int i5) {
        float m2054 = m2054(Color.red(i5));
        float m20542 = m2054(Color.green(i5));
        float m20543 = m2054(Color.blue(i5));
        float[][] fArr = f2594;
        float[] fArr2 = fArr[0];
        float f5 = (fArr2[0] * m2054) + (fArr2[1] * m20542) + (fArr2[2] * m20543);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * m2054) + (fArr3[1] * m20542) + (fArr3[2] * m20543);
        float[] fArr4 = fArr[2];
        return new float[]{f5, f6, (m2054 * fArr4[0]) + (m20542 * fArr4[1]) + (m20543 * fArr4[2])};
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static float m2056(int i5) {
        float m2054 = m2054(Color.red(i5));
        float m20542 = m2054(Color.green(i5));
        float m20543 = m2054(Color.blue(i5));
        float[] fArr = f2594[1];
        return (m2054 * fArr[0]) + (m20542 * fArr[1]) + (m20543 * fArr[2]);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static float m2057(float f5) {
        float f6;
        if (f5 > 8.0f) {
            double d6 = f5;
            Double.isNaN(d6);
            f6 = (float) Math.pow((d6 + 16.0d) / 116.0d, 3.0d);
        } else {
            f6 = f5 / 903.2963f;
        }
        return f6 * 100.0f;
    }
}
