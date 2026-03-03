package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SchemeRainbow extends DynamicScheme {
    public SchemeRainbow(Hct hct, boolean z5, double d6) {
        super(hct, Variant.RAINBOW, z5, d6, TonalPalette.fromHueAndChroma(hct.getHue(), 48.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d));
    }
}
