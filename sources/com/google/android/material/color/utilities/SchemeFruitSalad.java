package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SchemeFruitSalad extends DynamicScheme {
    public SchemeFruitSalad(Hct hct, boolean z5, double d6) {
        super(hct, Variant.FRUIT_SALAD, z5, d6, TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() - 50.0d), 48.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() - 50.0d), 36.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 36.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 10.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d));
    }
}
