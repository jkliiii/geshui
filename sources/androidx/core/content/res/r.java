package androidx.core.content.res;

/* compiled from: ViewingConditions.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class r {

    /* renamed from: ˎ, reason: contains not printable characters */
    static final r f2627;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final float f2628;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final float f2629;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final float f2630;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final float f2631;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final float f2632;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final float f2633;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final float[] f2634;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final float f2635;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final float f2636;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final float f2637;

    static {
        float[] fArr = b.f2593;
        double m2057 = b.m2057(50.0f);
        Double.isNaN(m2057);
        f2627 = m2152(fArr, (float) ((m2057 * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private r(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.f2633 = f5;
        this.f2628 = f6;
        this.f2629 = f7;
        this.f2630 = f8;
        this.f2631 = f9;
        this.f2632 = f10;
        this.f2634 = fArr;
        this.f2635 = f11;
        this.f2636 = f12;
        this.f2637 = f13;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static r m2152(float[] fArr, float f5, float f6, float f7, boolean z5) {
        float[][] fArr2 = b.f2591;
        float f8 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f9 = fArr3[0] * f8;
        float f10 = fArr[1];
        float f11 = f9 + (fArr3[1] * f10);
        float f12 = fArr[2];
        float f13 = f11 + (fArr3[2] * f12);
        float[] fArr4 = fArr2[1];
        float f14 = (fArr4[0] * f8) + (fArr4[1] * f10) + (fArr4[2] * f12);
        float[] fArr5 = fArr2[2];
        float f15 = (f8 * fArr5[0]) + (f10 * fArr5[1]) + (f12 * fArr5[2]);
        float f16 = (f7 / 10.0f) + 0.8f;
        float m2053 = ((double) f16) >= 0.9d ? b.m2053(0.59f, 0.69f, (f16 - 0.9f) * 10.0f) : b.m2053(0.525f, 0.59f, (f16 - 0.8f) * 10.0f);
        float exp = z5 ? 1.0f : (1.0f - (((float) Math.exp(((-f5) - 42.0f) / 92.0f)) * 0.2777778f)) * f16;
        double d6 = exp;
        if (d6 > 1.0d) {
            exp = 1.0f;
        } else if (d6 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp};
        float f17 = 1.0f / ((5.0f * f5) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        double d7 = f5;
        Double.isNaN(d7);
        float cbrt = (f18 * f5) + (0.1f * f19 * f19 * ((float) Math.cbrt(d7 * 5.0d)));
        float m2057 = b.m2057(f6) / fArr[1];
        double d8 = m2057;
        float sqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d8, 0.2d));
        double d9 = fArr6[0] * cbrt * f13;
        Double.isNaN(d9);
        double d10 = fArr6[1] * cbrt * f14;
        Double.isNaN(d10);
        double d11 = fArr6[2] * cbrt * f15;
        Double.isNaN(d11);
        float pow2 = (float) Math.pow(d11 / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(d9 / 100.0d, 0.42d), (float) Math.pow(d10 / 100.0d, 0.42d), pow2};
        float f20 = fArr7[0];
        float f21 = fArr7[1];
        return new r(m2057, ((((f20 * 400.0f) / (f20 + 27.13f)) * 2.0f) + ((f21 * 400.0f) / (f21 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, m2053, f16, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    float m2153() {
        return this.f2628;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    float m2154() {
        return this.f2631;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    float m2155() {
        return this.f2635;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    float m2156() {
        return this.f2636;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    float m2157() {
        return this.f2633;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    float m2158() {
        return this.f2629;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    float m2159() {
        return this.f2632;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    float m2160() {
        return this.f2630;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    float[] m2161() {
        return this.f2634;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    float m2162() {
        return this.f2637;
    }
}
