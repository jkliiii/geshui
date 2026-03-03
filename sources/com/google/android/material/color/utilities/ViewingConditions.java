package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);
    private final double aw;

    /* renamed from: c, reason: collision with root package name */
    private final double f12848c;
    private final double fl;
    private final double flRoot;

    /* renamed from: n, reason: collision with root package name */
    private final double f12849n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z, reason: collision with root package name */
    private final double f12850z;

    private ViewingConditions(double d6, double d7, double d8, double d9, double d10, double d11, double[] dArr, double d12, double d13, double d14) {
        this.f12849n = d6;
        this.aw = d7;
        this.nbb = d8;
        this.ncb = d9;
        this.f12848c = d10;
        this.nc = d11;
        this.rgbD = dArr;
        this.fl = d12;
        this.flRoot = d13;
        this.f12850z = d14;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d6) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d6, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d6, double d7, double d8, boolean z5) {
        double max = Math.max(0.1d, d7);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d9 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d10 = dArr3[0] * d9;
        double d11 = dArr[1];
        double d12 = d10 + (dArr3[1] * d11);
        double d13 = dArr[2];
        double d14 = d12 + (dArr3[2] * d13);
        double[] dArr4 = dArr2[1];
        double d15 = (dArr4[0] * d9) + (dArr4[1] * d11) + (dArr4[2] * d13);
        double[] dArr5 = dArr2[2];
        double d16 = (d9 * dArr5[0]) + (d11 * dArr5[1]) + (d13 * dArr5[2]);
        double d17 = (d8 / 10.0d) + 0.8d;
        double lerp = d17 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d17 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d17 - 0.8d) * 10.0d);
        double clampDouble = MathUtils.clampDouble(0.0d, 1.0d, z5 ? 1.0d : (1.0d - (Math.exp(((-d6) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d17);
        double[] dArr6 = {(((100.0d / d14) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d15) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d16) * clampDouble) + 1.0d) - clampDouble};
        double d18 = 5.0d * d6;
        double d19 = 1.0d / (d18 + 1.0d);
        double d20 = d19 * d19 * d19 * d19;
        double d21 = 1.0d - d20;
        double cbrt = (d20 * d6) + (0.1d * d21 * d21 * Math.cbrt(d18));
        double yFromLstar = ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double pow2 = Math.pow(((dArr6[2] * cbrt) * d16) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d14) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d15) / 100.0d, 0.42d), pow2};
        double d22 = dArr7[0];
        double d23 = (d22 * 400.0d) / (d22 + 27.13d);
        double d24 = dArr7[1];
        return new ViewingConditions(yFromLstar, ((d23 * 2.0d) + ((d24 * 400.0d) / (d24 + 27.13d)) + (((400.0d * pow2) / (pow2 + 27.13d)) * 0.05d)) * pow, pow, pow, lerp, d17, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double getAw() {
        return this.aw;
    }

    double getC() {
        return this.f12848c;
    }

    double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f12849n;
    }

    public double getNbb() {
        return this.nbb;
    }

    double getNc() {
        return this.nc;
    }

    double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    double getZ() {
        return this.f12850z;
    }
}
