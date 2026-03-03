package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d6, double d7, Hct hct) {
        this.hue = d6;
        this.chroma = d7;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d6, double d7) {
        Hct from = Hct.from(d6, d7, 50.0d);
        Hct hct = from;
        double abs = Math.abs(from.getChroma() - d7);
        for (double d8 = 1.0d; d8 < 50.0d; d8 += 1.0d) {
            if (Math.round(d7) == Math.round(hct.getChroma())) {
                return hct;
            }
            Hct from2 = Hct.from(d6, d7, 50.0d + d8);
            double abs2 = Math.abs(from2.getChroma() - d7);
            if (abs2 < abs) {
                hct = from2;
                abs = abs2;
            }
            Hct from3 = Hct.from(d6, d7, 50.0d - d8);
            double abs3 = Math.abs(from3.getChroma() - d7);
            if (abs3 < abs) {
                hct = from3;
                abs = abs3;
            }
        }
        return hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d6, double d7) {
        return new TonalPalette(d6, d7, createKeyColor(d6, d7));
    }

    public static TonalPalette fromInt(int i5) {
        return fromHct(Hct.fromInt(i5));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d6) {
        return Hct.from(this.hue, this.chroma, d6);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i5) {
        Integer num = this.cache.get(Integer.valueOf(i5));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i5).toInt());
            this.cache.put(Integer.valueOf(i5), num);
        }
        return num.intValue();
    }
}
