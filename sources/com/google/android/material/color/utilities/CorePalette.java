package com.google.android.material.color.utilities;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class CorePalette {

    /* renamed from: a1, reason: collision with root package name */
    public TonalPalette f12843a1;

    /* renamed from: a2, reason: collision with root package name */
    public TonalPalette f12844a2;

    /* renamed from: a3, reason: collision with root package name */
    public TonalPalette f12845a3;
    public TonalPalette error;

    /* renamed from: n1, reason: collision with root package name */
    public TonalPalette f12846n1;

    /* renamed from: n2, reason: collision with root package name */
    public TonalPalette f12847n2;

    private CorePalette(int i5, boolean z5) {
        Hct fromInt = Hct.fromInt(i5);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z5) {
            this.f12843a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f12844a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f12845a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f12846n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f12847n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f12843a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f12844a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f12845a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f12846n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f12847n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i5) {
        return new CorePalette(i5, true);
    }

    public static CorePalette of(int i5) {
        return new CorePalette(i5, false);
    }
}
