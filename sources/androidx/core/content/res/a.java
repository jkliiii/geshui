package androidx.core.content.res;

import androidx.core.graphics.g0;

/* compiled from: CamColor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final float f2582;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final float f2583;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final float f2584;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final float f2585;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final float f2586;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final float f2587;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final float f2588;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final float f2589;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final float f2590;

    a(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f2582 = f5;
        this.f2583 = f6;
        this.f2584 = f7;
        this.f2585 = f8;
        this.f2586 = f9;
        this.f2587 = f10;
        this.f2588 = f11;
        this.f2589 = f12;
        this.f2590 = f13;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static a m2034(float f5, float f6, float f7) {
        float f8 = 100.0f;
        float f9 = 1000.0f;
        a aVar = null;
        float f10 = 1000.0f;
        float f11 = 0.0f;
        while (Math.abs(f11 - f8) > 0.01f) {
            float f12 = ((f8 - f11) / 2.0f) + f11;
            int m2049 = m2037(f12, f6, f5).m2049();
            float m2051 = b.m2051(m2049);
            float abs = Math.abs(f7 - m2051);
            if (abs < 0.2f) {
                a m2035 = m2035(m2049);
                float m2041 = m2035.m2041(m2037(m2035.m2046(), m2035.m2044(), f5));
                if (m2041 <= 1.0f) {
                    aVar = m2035;
                    f9 = abs;
                    f10 = m2041;
                }
            }
            if (f9 == 0.0f && f10 == 0.0f) {
                break;
            }
            if (m2051 < f7) {
                f11 = f12;
            } else {
                f8 = f12;
            }
        }
        return aVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static a m2035(int i5) {
        return m2036(i5, r.f2627);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static a m2036(int i5, r rVar) {
        float[] m2055 = b.m2055(i5);
        float[][] fArr = b.f2591;
        float f5 = m2055[0];
        float[] fArr2 = fArr[0];
        float f6 = fArr2[0] * f5;
        float f7 = m2055[1];
        float f8 = f6 + (fArr2[1] * f7);
        float f9 = m2055[2];
        float f10 = f8 + (fArr2[2] * f9);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[0] * f5) + (fArr3[1] * f7) + (fArr3[2] * f9);
        float[] fArr4 = fArr[2];
        float f12 = (f5 * fArr4[0]) + (f7 * fArr4[1]) + (f9 * fArr4[2]);
        float f13 = rVar.m2161()[0] * f10;
        float f14 = rVar.m2161()[1] * f11;
        float f15 = rVar.m2161()[2] * f12;
        double m2155 = rVar.m2155() * Math.abs(f13);
        Double.isNaN(m2155);
        float pow = (float) Math.pow(m2155 / 100.0d, 0.42d);
        double m21552 = rVar.m2155() * Math.abs(f14);
        Double.isNaN(m21552);
        float pow2 = (float) Math.pow(m21552 / 100.0d, 0.42d);
        double m21553 = rVar.m2155() * Math.abs(f15);
        Double.isNaN(m21553);
        float pow3 = (float) Math.pow(m21553 / 100.0d, 0.42d);
        float signum = ((Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d6 = signum;
        Double.isNaN(d6);
        double d7 = signum2;
        Double.isNaN(d7);
        double d8 = signum3;
        Double.isNaN(d8);
        float f16 = ((float) (((d6 * 11.0d) + (d7 * (-12.0d))) + d8)) / 11.0f;
        double d9 = signum + signum2;
        Double.isNaN(d8);
        Double.isNaN(d9);
        float f17 = ((float) (d9 - (d8 * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = (((signum * 20.0f) + f18) + (21.0f * signum3)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (3.1415927f * f21) / 180.0f;
        float pow4 = ((float) Math.pow((f20 * rVar.m2158()) / rVar.m2153(), rVar.m2154() * rVar.m2162())) * 100.0f;
        float m2156 = rVar.m2156() * (4.0f / rVar.m2154()) * ((float) Math.sqrt(pow4 / 100.0f)) * (rVar.m2153() + 4.0f);
        Double.isNaN(((double) f21) < 20.14d ? 360.0f + f21 : f21);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.m2157()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((r9 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.m2159()) * rVar.m2160()) * ((float) Math.sqrt((f16 * f16) + (f17 * f17)))) / (f19 + 0.305f), 0.9d));
        double d10 = pow4;
        Double.isNaN(d10);
        float sqrt = pow5 * ((float) Math.sqrt(d10 / 100.0d));
        float m21562 = sqrt * rVar.m2156();
        float sqrt2 = ((float) Math.sqrt((pow5 * rVar.m2154()) / (rVar.m2153() + 4.0f))) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m21562) + 1.0f)) * 43.85965f;
        double d11 = f22;
        return new a(f21, sqrt, pow4, m2156, m21562, sqrt2, f23, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static a m2037(float f5, float f6, float f7) {
        return m2038(f5, f6, f7, r.f2627);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static a m2038(float f5, float f6, float f7, r rVar) {
        float m2154 = 4.0f / rVar.m2154();
        double d6 = f5;
        Double.isNaN(d6);
        float sqrt = m2154 * ((float) Math.sqrt(d6 / 100.0d)) * (rVar.m2153() + 4.0f) * rVar.m2156();
        float m2156 = f6 * rVar.m2156();
        float sqrt2 = ((float) Math.sqrt(((f6 / ((float) Math.sqrt(r4))) * rVar.m2154()) / (rVar.m2153() + 4.0f))) * 50.0f;
        float f8 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        double d7 = m2156;
        Double.isNaN(d7);
        float log = ((float) Math.log((d7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f7) / 180.0f;
        return new a(f7, f6, f5, sqrt, m2156, sqrt2, f8, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    static int m2039(float f5, float f6, float f7) {
        return m2040(f5, f6, f7, r.f2627);
    }

    /* renamed from: י, reason: contains not printable characters */
    static int m2040(float f5, float f6, float f7, r rVar) {
        if (f6 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
            return b.m2050(f7);
        }
        float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
        float f8 = f6;
        a aVar = null;
        float f9 = 0.0f;
        boolean z5 = true;
        while (Math.abs(f9 - f6) >= 0.4f) {
            a m2034 = m2034(min, f8, f7);
            if (!z5) {
                if (m2034 == null) {
                    f6 = f8;
                } else {
                    f9 = f8;
                    aVar = m2034;
                }
                f8 = ((f6 - f9) / 2.0f) + f9;
            } else {
                if (m2034 != null) {
                    return m2034.m2048(rVar);
                }
                f8 = ((f6 - f9) / 2.0f) + f9;
                z5 = false;
            }
        }
        return aVar == null ? b.m2050(f7) : aVar.m2048(rVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    float m2041(a aVar) {
        float m2047 = m2047() - aVar.m2047();
        float m2042 = m2042() - aVar.m2042();
        float m2043 = m2043() - aVar.m2043();
        return (float) (Math.pow(Math.sqrt((m2047 * m2047) + (m2042 * m2042) + (m2043 * m2043)), 0.63d) * 1.41d);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    float m2042() {
        return this.f2589;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    float m2043() {
        return this.f2590;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    float m2044() {
        return this.f2583;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    float m2045() {
        return this.f2582;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    float m2046() {
        return this.f2584;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    float m2047() {
        return this.f2588;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    int m2048(r rVar) {
        float f5;
        if (m2044() == 0.0d || m2046() == 0.0d) {
            f5 = 0.0f;
        } else {
            float m2044 = m2044();
            double m2046 = m2046();
            Double.isNaN(m2046);
            f5 = m2044 / ((float) Math.sqrt(m2046 / 100.0d));
        }
        double d6 = f5;
        double pow = Math.pow(1.64d - Math.pow(0.29d, rVar.m2157()), 0.73d);
        Double.isNaN(d6);
        float pow2 = (float) Math.pow(d6 / pow, 1.1111111111111112d);
        double m2045 = (m2045() * 3.1415927f) / 180.0f;
        Double.isNaN(m2045);
        float cos = ((float) (Math.cos(2.0d + m2045) + 3.8d)) * 0.25f;
        float m2153 = rVar.m2153();
        double m20462 = m2046();
        Double.isNaN(m20462);
        double m2154 = rVar.m2154();
        Double.isNaN(m2154);
        double d7 = 1.0d / m2154;
        double m2162 = rVar.m2162();
        Double.isNaN(m2162);
        float pow3 = m2153 * ((float) Math.pow(m20462 / 100.0d, d7 / m2162));
        float m2159 = cos * 3846.1538f * rVar.m2159() * rVar.m2160();
        float m2158 = pow3 / rVar.m2158();
        float sin = (float) Math.sin(m2045);
        float cos2 = (float) Math.cos(m2045);
        float f6 = (((0.305f + m2158) * 23.0f) * pow2) / (((m2159 * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = m2158 * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        Double.isNaN(Math.abs(f10));
        Double.isNaN(Math.abs(f10));
        float signum = Math.signum(f10) * (100.0f / rVar.m2155()) * ((float) Math.pow((float) Math.max(0.0d, (r6 * 27.13d) / (400.0d - r11)), 2.380952380952381d));
        Double.isNaN(Math.abs(f11));
        Double.isNaN(Math.abs(f11));
        float signum2 = Math.signum(f11) * (100.0f / rVar.m2155()) * ((float) Math.pow((float) Math.max(0.0d, (r11 * 27.13d) / (400.0d - r9)), 2.380952380952381d));
        Double.isNaN(Math.abs(f12));
        Double.isNaN(Math.abs(f12));
        float signum3 = Math.signum(f12) * (100.0f / rVar.m2155()) * ((float) Math.pow((float) Math.max(0.0d, (r9 * 27.13d) / (400.0d - r11)), 2.380952380952381d));
        float f13 = signum / rVar.m2161()[0];
        float f14 = signum2 / rVar.m2161()[1];
        float f15 = signum3 / rVar.m2161()[2];
        float[][] fArr = b.f2592;
        float[] fArr2 = fArr[0];
        float f16 = (fArr2[0] * f13) + (fArr2[1] * f14) + (fArr2[2] * f15);
        float[] fArr3 = fArr[1];
        float f17 = (fArr3[0] * f13) + (fArr3[1] * f14) + (fArr3[2] * f15);
        float[] fArr4 = fArr[2];
        return g0.m2270(f16, f17, (f13 * fArr4[0]) + (f14 * fArr4[1]) + (f15 * fArr4[2]));
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    int m2049() {
        return m2048(r.f2627);
    }
}
