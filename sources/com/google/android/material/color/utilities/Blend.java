package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i5, int i6, double d6) {
        Cam16 fromInt = Cam16.fromInt(i5);
        Cam16 fromInt2 = Cam16.fromInt(i6);
        double jstar = fromInt.getJstar();
        double astar = fromInt.getAstar();
        double bstar = fromInt.getBstar();
        return Cam16.fromUcs(jstar + ((fromInt2.getJstar() - jstar) * d6), astar + ((fromInt2.getAstar() - astar) * d6), bstar + ((fromInt2.getBstar() - bstar) * d6)).toInt();
    }

    public static int harmonize(int i5, int i6) {
        Hct fromInt = Hct.fromInt(i5);
        Hct fromInt2 = Hct.fromInt(i6);
        return Hct.from(MathUtils.sanitizeDegreesDouble(fromInt.getHue() + (Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5d, 15.0d) * MathUtils.rotationDirection(fromInt.getHue(), fromInt2.getHue()))), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    public static int hctHue(int i5, int i6, double d6) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i5, i6, d6)).getHue(), Cam16.fromInt(i5).getChroma(), ColorUtils.lstarFromArgb(i5)).toInt();
    }
}
