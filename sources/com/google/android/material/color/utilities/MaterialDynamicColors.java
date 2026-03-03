package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MaterialDynamicColors {
    private static final double CONTAINER_ACCENT_TONE_DELTA = 15.0d;

    static double findDesiredChromaByTone(double d6, double d7, double d8, boolean z5) {
        Hct from = Hct.from(d6, d7, d8);
        if (from.getChroma() >= d7) {
            return d8;
        }
        Hct hct = from;
        double chroma = from.getChroma();
        double d9 = d8;
        while (hct.getChroma() < d7) {
            double d10 = d9 + (z5 ? -1.0d : 1.0d);
            Hct from2 = Hct.from(d6, d7, d10);
            if (chroma > from2.getChroma() || Math.abs(from2.getChroma() - d7) < 0.4d) {
                return d10;
            }
            if (Math.abs(from2.getChroma() - d7) < Math.abs(hct.getChroma() - d7)) {
                hct = from2;
            }
            chroma = Math.max(chroma, from2.getChroma());
            d9 = d10;
        }
        return d9;
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlActivated$131(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$134(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$135(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$136(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$137(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 0.2d : 0.12d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$138(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$139(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMinContrastDefault(new Function() { // from class: com.google.android.material.color.utilities.x1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$138((DynamicScheme) obj);
            }
        }, null, dynamicScheme, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$140(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$141(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMaxContrastDefault(new Function() { // from class: com.google.android.material.color.utilities.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$140((DynamicScheme) obj);
            }
        }, null, dynamicScheme, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlNormal$133(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$error$95(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$error$96(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, errorContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$errorContainer$90(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseOnSurface$36(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inverseOnSurface$37(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inversePrimary$62(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 40.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inversePrimary$63(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseSurface$18(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onError$98(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onError$99(DynamicScheme dynamicScheme) {
        return error();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onErrorContainer$92(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onErrorContainer$93(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimary$65(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimary$66(DynamicScheme dynamicScheme) {
        return primary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onPrimaryContainer$56(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(((Double) primaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$57(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixed$105(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$106(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$108(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 70.0d);
        }
        return Double.valueOf(30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$109(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondary$76(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondary$77(DynamicScheme dynamicScheme) {
        return secondary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onSecondaryContainer$70(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(((Double) secondaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$71(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixed$115(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$116(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$118(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 25.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$119(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurface$34(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurfaceVariant$41(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSurfaceVariant$42(DynamicScheme dynamicScheme) {
        return surfaceVariant();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiary$87(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiary$88(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onTertiaryContainer$81(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(((Double) tertiaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$82(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixed$125(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$126(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$128(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outline$44(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 60.0d : 50.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outlineVariant$46(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primary$59(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$primary$60(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, primaryContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryContainer$54(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixed$101(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 10.0d);
        }
        return Double.valueOf(90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixedDim$103(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
        }
        return Double.valueOf(80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$scrim$50(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondary$73(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$secondary$74(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, secondaryContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryContainer$68(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
        }
        double d6 = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d6, !dynamicScheme.isDark)), dynamicScheme));
        }
        return Double.valueOf(d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixed$111(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 80.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixedDim$113(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$shadow$48(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 24.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainer$28(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 12.0d : 94.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHigh$30(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 17.0d : 92.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHighest$32(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 22.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLow$26(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 96.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLowest$24(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 4.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceDim$22(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 87.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceTint$52(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceVariant$39(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiary$84(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$tertiary$85(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, tertiaryContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryContainer$79(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixed$121(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixedDim$123(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textHintInverse$151(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverse$143(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$147(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$145(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$149(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct inViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        return (!DynamicColor.tonePrefersLightForeground(hct.getTone()) || DynamicColor.toneAllowsLightForeground(inViewingConditions.getTone())) ? DynamicColor.enableLightForeground(inViewingConditions.getTone()) : DynamicColor.enableLightForeground(hct.getTone());
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        return ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    public DynamicColor background() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.a3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlActivated$131((DynamicScheme) obj);
            }
        }, null);
    }

    public DynamicColor controlHighlight() {
        return new DynamicColor(new Function() { // from class: com.google.android.material.color.utilities.z4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$134((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$135((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$136((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$137((DynamicScheme) obj);
            }
        }, null, new Function() { // from class: com.google.android.material.color.utilities.d5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$139((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$141((DynamicScheme) obj);
            }
        }, null);
    }

    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlNormal$133((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor error() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.l2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$error$95((DynamicScheme) obj);
            }
        }, new s2(this), new Function() { // from class: com.google.android.material.color.utilities.n2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5570.lambda$error$96((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor errorContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$errorContainer$90((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    public DynamicColor inverseOnSurface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseOnSurface$36((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5545.lambda$inverseOnSurface$37((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor inversePrimary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inversePrimary$62((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5592.lambda$inversePrimary$63((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor inverseSurface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.j2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseSurface$18((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.q3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onBackground() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5587.lambda$onBackground$14((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onError() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.e4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onError$98((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5556.lambda$onError$99((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onErrorContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.y1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onErrorContainer$92((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5551.lambda$onErrorContainer$93((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onPrimary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.i3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimary$65((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5563.lambda$onPrimary$66((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onPrimaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5573.lambda$onPrimaryContainer$56((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5577.lambda$onPrimaryContainer$57((DynamicScheme) obj);
            }
        }, null);
    }

    public DynamicColor onPrimaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.u3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixed$105((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5595.lambda$onPrimaryFixed$106((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onPrimaryFixedVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.k5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$108((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5568.lambda$onPrimaryFixedVariant$109((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onSecondary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.l4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondary$76((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5571.lambda$onSecondary$77((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onSecondaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5546.lambda$onSecondaryContainer$70((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5547.lambda$onSecondaryContainer$71((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onSecondaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixed$115((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5549.lambda$onSecondaryFixed$116((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onSecondaryFixedVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$118((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5555.lambda$onSecondaryFixedVariant$119((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onSurface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.y2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurface$34((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor onSurfaceVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.h4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurfaceVariant$41((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5561.lambda$onSurfaceVariant$42((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onTertiary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.r4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiary$87((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5590.lambda$onTertiary$88((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onTertiaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.p5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5582.lambda$onTertiaryContainer$81((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5594.lambda$onTertiaryContainer$82((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onTertiaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.o4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixed$125((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5581.lambda$onTertiaryFixed$126((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor onTertiaryFixedVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.j1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$128((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5565.lambda$onTertiaryFixedVariant$129((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor outline() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outline$44((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor outlineVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.x3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outlineVariant$46((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor primary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.f3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primary$59((DynamicScheme) obj);
            }
        }, new s2(this), new Function() { // from class: com.google.android.material.color.utilities.h3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5558.lambda$primary$60((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor primaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryContainer$54((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor primaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.e2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixed$101((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor primaryFixedDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.c3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixedDim$103((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.w2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor scrim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.s3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$scrim$50((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor secondary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.z3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondary$73((DynamicScheme) obj);
            }
        }, new s2(this), new Function() { // from class: com.google.android.material.color.utilities.v4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5593.lambda$secondary$74((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor secondaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryContainer$68((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor secondaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.g5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixed$111((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor secondaryFixedDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixedDim$113((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor shadow() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.u4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$shadow$48((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceBright() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.c4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainer$28((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceContainerHigh() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHigh$30((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceContainerHighest() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHighest$32((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceContainerLow() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.a4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLow$26((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceContainerLowest() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.l3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLowest$24((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceDim$22((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceTint() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.q2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceTint$52((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor surfaceVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceVariant$39((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor tertiary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiary$84((DynamicScheme) obj);
            }
        }, new s2(this), new Function() { // from class: com.google.android.material.color.utilities.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5596.lambda$tertiary$85((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor tertiaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.i5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryContainer$79((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor tertiaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixed$121((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor tertiaryFixedDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.f5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixedDim$123((DynamicScheme) obj);
            }
        }, new s2(this));
    }

    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textHintInverse$151((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverse$143((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$147((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.d3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$145((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.x4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$149((DynamicScheme) obj);
            }
        });
    }
}
