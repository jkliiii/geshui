package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* renamed from: j, reason: collision with root package name */
    private final double f12839j;
    private final double jstar;

    /* renamed from: m, reason: collision with root package name */
    private final double f12840m;

    /* renamed from: q, reason: collision with root package name */
    private final double f12841q;

    /* renamed from: s, reason: collision with root package name */
    private final double f12842s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    private Cam16(double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.hue = d6;
        this.chroma = d7;
        this.f12839j = d8;
        this.f12841q = d9;
        this.f12840m = d10;
        this.f12842s = d11;
        this.jstar = d12;
        this.astar = d13;
        this.bstar = d14;
    }

    public static Cam16 fromInt(int i5) {
        return fromIntInViewingConditions(i5, ViewingConditions.DEFAULT);
    }

    static Cam16 fromIntInViewingConditions(int i5, ViewingConditions viewingConditions) {
        double linearized = ColorUtils.linearized((16711680 & i5) >> 16);
        double linearized2 = ColorUtils.linearized((65280 & i5) >> 8);
        double linearized3 = ColorUtils.linearized(i5 & 255);
        return fromXyzInViewingConditions((0.41233895d * linearized) + (0.35762064d * linearized2) + (0.18051042d * linearized3), (0.2126d * linearized) + (0.7152d * linearized2) + (0.0722d * linearized3), (linearized * 0.01932141d) + (linearized2 * 0.11916382d) + (linearized3 * 0.95034478d), viewingConditions);
    }

    static Cam16 fromJch(double d6, double d7, double d8) {
        return fromJchInViewingConditions(d6, d7, d8, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double d6, double d7, double d8, ViewingConditions viewingConditions) {
        double d9 = d6 / 100.0d;
        double c6 = (4.0d / viewingConditions.getC()) * Math.sqrt(d9) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double flRoot = d7 * viewingConditions.getFlRoot();
        double sqrt = Math.sqrt(((d7 / Math.sqrt(d9)) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d8);
        double d10 = (1.7000000000000002d * d6) / ((0.007d * d6) + 1.0d);
        double log1p = 43.859649122807014d * Math.log1p(flRoot * 0.0228d);
        return new Cam16(d8, d7, d6, c6, flRoot, sqrt, d10, Math.cos(radians) * log1p, Math.sin(radians) * log1p);
    }

    public static Cam16 fromUcs(double d6, double d7, double d8) {
        return fromUcsInViewingConditions(d6, d7, d8, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d6, double d7, double d8, ViewingConditions viewingConditions) {
        double expm1 = (Math.expm1(Math.hypot(d7, d8) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double atan2 = Math.atan2(d8, d7) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return fromJchInViewingConditions(d6 / (1.0d - ((d6 - 100.0d) * 0.007d)), expm1, atan2, viewingConditions);
    }

    static Cam16 fromXyzInViewingConditions(double d6, double d7, double d8, ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[0] * d6) + (dArr2[1] * d7) + (dArr2[2] * d8);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[0] * d6) + (dArr3[1] * d7) + (dArr3[2] * d8);
        double[] dArr4 = dArr[2];
        double d11 = (dArr4[0] * d6) + (dArr4[1] * d7) + (dArr4[2] * d8);
        double d12 = viewingConditions.getRgbD()[0] * d9;
        double d13 = viewingConditions.getRgbD()[1] * d10;
        double d14 = viewingConditions.getRgbD()[2] * d11;
        double pow = Math.pow((viewingConditions.getFl() * Math.abs(d12)) / 100.0d, 0.42d);
        double pow2 = Math.pow((viewingConditions.getFl() * Math.abs(d13)) / 100.0d, 0.42d);
        double pow3 = Math.pow((viewingConditions.getFl() * Math.abs(d14)) / 100.0d, 0.42d);
        double signum = ((Math.signum(d12) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d13) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d14) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d15 = (((signum * 11.0d) + ((-12.0d) * signum2)) + signum3) / 11.0d;
        double d16 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d17 = signum2 * 20.0d;
        double d18 = (((signum * 20.0d) + d17) + (21.0d * signum3)) / 20.0d;
        double d19 = (((signum * 40.0d) + d17) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d16, d15));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d20 = degrees;
        double radians = Math.toRadians(d20);
        double pow4 = Math.pow((d19 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d21 = pow4 / 100.0d;
        double c6 = (4.0d / viewingConditions.getC()) * Math.sqrt(d21) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double pow5 = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d20 < 20.14d ? d20 + 360.0d : d20) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.getNc()) * viewingConditions.getNcb()) * Math.hypot(d15, d16)) / (d18 + 0.305d), 0.9d);
        double sqrt = Math.sqrt(d21) * pow5;
        double flRoot = sqrt * viewingConditions.getFlRoot();
        double log1p = Math.log1p(flRoot * 0.0228d) * 43.859649122807014d;
        return new Cam16(d20, sqrt, pow4, c6, flRoot, Math.sqrt((pow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d, (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d), log1p * Math.cos(radians), log1p * Math.sin(radians));
    }

    double distance(Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((jstar * jstar) + (astar * astar) + (bstar * bstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f12839j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f12840m;
    }

    public double getQ() {
        return this.f12841q;
    }

    public double getS() {
        return this.f12842s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    int viewed(ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2]);
    }

    double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double pow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double cos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double aw = viewingConditions.getAw() * Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ());
        double nc = cos * 3846.153846153846d * viewingConditions.getNc() * viewingConditions.getNcb();
        double nbb = aw / viewingConditions.getNbb();
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d6 = (((0.305d + nbb) * 23.0d) * pow) / (((nc * 23.0d) + ((11.0d * pow) * cos2)) + ((pow * 108.0d) * sin));
        double d7 = cos2 * d6;
        double d8 = d6 * sin;
        double d9 = nbb * 460.0d;
        double d10 = (((451.0d * d7) + d9) + (288.0d * d8)) / 1403.0d;
        double d11 = ((d9 - (891.0d * d7)) - (261.0d * d8)) / 1403.0d;
        double d12 = ((d9 - (d7 * 220.0d)) - (d8 * 6300.0d)) / 1403.0d;
        double signum = Math.signum(d10) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d10) * 27.13d) / (400.0d - Math.abs(d10))), 2.380952380952381d);
        double signum2 = Math.signum(d11) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d11) * 27.13d) / (400.0d - Math.abs(d11))), 2.380952380952381d);
        double signum3 = Math.signum(d12) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d12) * 27.13d) / (400.0d - Math.abs(d12))), 2.380952380952381d);
        double d13 = signum / viewingConditions.getRgbD()[0];
        double d14 = signum2 / viewingConditions.getRgbD()[1];
        double d15 = signum3 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d16 = (dArr3[0] * d13) + (dArr3[1] * d14) + (dArr3[2] * d15);
        double[] dArr4 = dArr2[1];
        double d17 = (dArr4[0] * d13) + (dArr4[1] * d14) + (dArr4[2] * d15);
        double[] dArr5 = dArr2[2];
        double d18 = (d13 * dArr5[0]) + (d14 * dArr5[1]) + (d15 * dArr5[2]);
        if (dArr == null) {
            return new double[]{d16, d17, d18};
        }
        dArr[0] = d16;
        dArr[1] = d17;
        dArr[2] = d18;
        return dArr;
    }
}
