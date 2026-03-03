package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SchemeFidelity extends DynamicScheme {
    public SchemeFidelity(Hct hct, boolean z5, double d6) {
        super(hct, Variant.FIDELITY, z5, d6, TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma()), TonalPalette.fromHueAndChroma(hct.getHue(), Math.max(hct.getChroma() - 32.0d, hct.getChroma() * 0.5d)), TonalPalette.fromHct(DislikeAnalyzer.fixIfDisliked(new TemperatureCache(hct).getComplement())), TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma() / 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), (hct.getChroma() / 8.0d) + 4.0d));
    }
}
