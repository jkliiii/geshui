package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final Function<DynamicScheme, Double> chroma;
    private final HashMap<DynamicScheme, Hct> hctCache = new HashMap<>();
    public final Function<DynamicScheme, Double> hue;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaConstraint> toneDeltaConstraint;
    public final Function<DynamicScheme, Double> toneMaxContrast;
    public final Function<DynamicScheme, Double> toneMinContrast;

    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f5525;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            f5525 = iArr;
            try {
                iArr[TonePolarity.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5525[TonePolarity.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5525[TonePolarity.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DynamicColor(Function<DynamicScheme, Double> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, Double> function3, Function<DynamicScheme, Double> function4, Function<DynamicScheme, DynamicColor> function5, Function<DynamicScheme, Double> function6, Function<DynamicScheme, Double> function7, Function<DynamicScheme, ToneDeltaConstraint> function8) {
        this.hue = function;
        this.chroma = function2;
        this.tone = function3;
        this.opacity = function4;
        this.background = function5;
        this.toneMinContrast = function6;
        this.toneMaxContrast = function7;
        this.toneDeltaConstraint = function8;
    }

    public static double calculateDynamicTone(DynamicScheme dynamicScheme, Function<DynamicScheme, Double> function, Function<DynamicColor, Double> function2, BiFunction<Double, Double, Double> biFunction, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, ToneDeltaConstraint> function4, Function<Double, Double> function5, Function<Double, Double> function6) {
        double doubleValue = ((Double) function.apply(dynamicScheme)).doubleValue();
        DynamicColor dynamicColor = function3 == null ? null : (DynamicColor) function3.apply(dynamicScheme);
        if (dynamicColor == null) {
            return doubleValue;
        }
        double ratioOfTones = Contrast.ratioOfTones(doubleValue, ((Double) dynamicColor.tone.apply(dynamicScheme)).doubleValue());
        double doubleValue2 = ((Double) function2.apply(dynamicColor)).doubleValue();
        double doubleValue3 = ((Double) biFunction.apply(Double.valueOf(ratioOfTones), Double.valueOf(doubleValue2))).doubleValue();
        double ratioOfTones2 = Contrast.ratioOfTones(doubleValue2, doubleValue3);
        double d6 = 1.0d;
        if (function5 != null && function5.apply(Double.valueOf(ratioOfTones)) != null) {
            d6 = ((Double) function5.apply(Double.valueOf(ratioOfTones))).doubleValue();
        }
        double clampDouble = MathUtils.clampDouble(d6, (function6 == null || function6.apply(Double.valueOf(ratioOfTones)) == null) ? 21.0d : ((Double) function6.apply(Double.valueOf(ratioOfTones))).doubleValue(), ratioOfTones2);
        if (clampDouble != ratioOfTones2) {
            doubleValue3 = contrastingTone(doubleValue2, clampDouble);
        }
        Function<DynamicScheme, DynamicColor> function7 = dynamicColor.background;
        return ensureToneDelta((function7 == null || function7.apply(dynamicScheme) == null) ? enableLightForeground(doubleValue3) : doubleValue3, doubleValue, dynamicScheme, function4, function2);
    }

    public static double contrastingTone(double d6, double d7) {
        double lighterUnsafe = Contrast.lighterUnsafe(d6, d7);
        double darkerUnsafe = Contrast.darkerUnsafe(d6, d7);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d6);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d6);
        if (tonePrefersLightForeground(d6)) {
            return (ratioOfTones >= d7 || ratioOfTones >= ratioOfTones2 || ((Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d7 ? 1 : (ratioOfTones == d7 ? 0 : -1)) < 0 && (ratioOfTones2 > d7 ? 1 : (ratioOfTones2 == d7 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        return (ratioOfTones2 >= d7 || ratioOfTones2 >= ratioOfTones) ? darkerUnsafe : lighterUnsafe;
    }

    public static double enableLightForeground(double d6) {
        if (!tonePrefersLightForeground(d6) || toneAllowsLightForeground(d6)) {
            return d6;
        }
        return 49.0d;
    }

    static double ensureToneDelta(double d6, double d7, DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function, Function<DynamicColor, Double> function2) {
        ToneDeltaConstraint toneDeltaConstraint = function == null ? null : (ToneDeltaConstraint) function.apply(dynamicScheme);
        if (toneDeltaConstraint == null) {
            return d6;
        }
        double d8 = toneDeltaConstraint.delta;
        double doubleValue = ((Double) function2.apply(toneDeltaConstraint.keepAway)).doubleValue();
        double abs = Math.abs(d6 - doubleValue);
        if (abs >= d8) {
            return d6;
        }
        int i5 = a.f5525[toneDeltaConstraint.keepAwayPolarity.ordinal()];
        boolean z5 = true;
        if (i5 == 1) {
            return MathUtils.clampDouble(0.0d, 100.0d, doubleValue + d8);
        }
        if (i5 == 2) {
            return MathUtils.clampDouble(0.0d, 100.0d, doubleValue - d8);
        }
        if (i5 != 3) {
            return d6;
        }
        boolean z6 = d7 > ((Double) toneDeltaConstraint.keepAway.tone.apply(dynamicScheme)).doubleValue();
        double abs2 = Math.abs(abs - d8);
        if (!z6 ? d6 >= abs2 : d6 + abs2 > 100.0d) {
            z5 = false;
        }
        return z5 ? d6 + abs2 : d6 - abs2;
    }

    public static DynamicColor fromArgb(int i5) {
        final Hct fromInt = Hct.fromInt(i5);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i5);
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$0(fromInt2, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$1(fromInt, (DynamicScheme) obj);
            }
        });
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2) {
        return fromPalette(function, function2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$2(int i5, DynamicScheme dynamicScheme) {
        return TonalPalette.fromInt(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$3(int i5, DynamicScheme dynamicScheme) {
        return TonalPalette.fromInt(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$4(int i5, DynamicScheme dynamicScheme) {
        return TonalPalette.fromInt(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$5(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getHue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$6(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getChroma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$7(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMinContrastDefault(function, function2, dynamicScheme, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$8(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMaxContrastDefault(function, function2, dynamicScheme, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$10(double d6, Double d7, Double d8) {
        return Double.valueOf(d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$12(double d6, Double d7) {
        return Double.valueOf(d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$13(double d6, Double d7) {
        return Double.valueOf(d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$9(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return Double.valueOf(dynamicColor.getTone(dynamicScheme));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMaxContrastDefault$17(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return (Double) dynamicColor.toneMaxContrast.apply(dynamicScheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMaxContrastDefault$18(Function function, DynamicScheme dynamicScheme, Double d6, Double d7) {
        return function != null && function.apply(dynamicScheme) != null && ((DynamicColor) function.apply(dynamicScheme)).background != null && ((DynamicColor) function.apply(dynamicScheme)).background.apply(dynamicScheme) != null ? Double.valueOf(contrastingTone(d7.doubleValue(), 7.0d)) : Double.valueOf(contrastingTone(d7.doubleValue(), Math.max(7.0d, d6.doubleValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$14(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return (Double) dynamicColor.toneMinContrast.apply(dynamicScheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$15(Function function, DynamicScheme dynamicScheme, Function function2, Double d6, Double d7) {
        double doubleValue = ((Double) function.apply(dynamicScheme)).doubleValue();
        if (d6.doubleValue() >= 7.0d) {
            doubleValue = contrastingTone(d7.doubleValue(), 4.5d);
        } else if (d6.doubleValue() >= 3.0d) {
            doubleValue = contrastingTone(d7.doubleValue(), 3.0d);
        } else {
            if ((function2 == null || function2.apply(dynamicScheme) == null || ((DynamicColor) function2.apply(dynamicScheme)).background == null || ((DynamicColor) function2.apply(dynamicScheme)).background.apply(dynamicScheme) == null) ? false : true) {
                doubleValue = contrastingTone(d7.doubleValue(), d6.doubleValue());
            }
        }
        return Double.valueOf(doubleValue);
    }

    public static boolean toneAllowsLightForeground(double d6) {
        return Math.round(d6) <= 49;
    }

    public static double toneMaxContrastDefault(Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$toneMaxContrastDefault$17(dynamicScheme, (DynamicColor) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.lambda$toneMaxContrastDefault$18(function2, dynamicScheme, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, null);
    }

    public static double toneMinContrastDefault(final Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$toneMinContrastDefault$14(dynamicScheme, (DynamicColor) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.lambda$toneMinContrastDefault$15(function, dynamicScheme, function2, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, new Function() { // from class: com.google.android.material.color.utilities.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$toneMinContrastDefault$16((Double) obj);
            }
        });
    }

    public static boolean tonePrefersLightForeground(double d6) {
        return Math.round(d6) < 60;
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        int i5 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i5;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(((Double) function.apply(dynamicScheme)).doubleValue() * 255.0d)) << 24) | (i5 & 16777215);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct from = Hct.from(((Double) this.hue.apply(dynamicScheme)).doubleValue(), ((Double) this.chroma.apply(dynamicScheme)).doubleValue(), getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, from);
        return from;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0 A[PHI: r11
  0x00d0: PHI (r11v2 double) = (r11v1 double), (r11v5 double) binds: [B:15:0x0059, B:32:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double getTone(final com.google.android.material.color.utilities.DynamicScheme r16) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.DynamicColor.getTone(com.google.android.material.color.utilities.DynamicScheme):double");
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, DynamicColor> function3) {
        return fromPalette(function, function2, function3, null);
    }

    public static DynamicColor fromPalette(final Function<DynamicScheme, TonalPalette> function, final Function<DynamicScheme, Double> function2, final Function<DynamicScheme, DynamicColor> function3, final Function<DynamicScheme, ToneDeltaConstraint> function4) {
        return new DynamicColor(new Function() { // from class: com.google.android.material.color.utilities.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$5(function, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$6(function, (DynamicScheme) obj);
            }
        }, function2, null, function3, new Function() { // from class: com.google.android.material.color.utilities.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$7(function2, function3, function4, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$8(function2, function3, function4, (DynamicScheme) obj);
            }
        }, function4);
    }

    public static DynamicColor fromArgb(final int i5, Function<DynamicScheme, Double> function) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$2(i5, (DynamicScheme) obj);
            }
        }, function);
    }

    public static DynamicColor fromArgb(final int i5, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$3(i5, (DynamicScheme) obj);
            }
        }, function, function2);
    }

    public static DynamicColor fromArgb(final int i5, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$4(i5, (DynamicScheme) obj);
            }
        }, function, function2, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$16(Double d6) {
        return d6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$getTone$11(DynamicColor dynamicColor, DynamicScheme dynamicScheme) {
        return dynamicColor;
    }
}
