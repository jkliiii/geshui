package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* compiled from: BlendModeUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c {

    /* compiled from: BlendModeUtils.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f2668;

        static {
            int[] iArr = new int[androidx.core.graphics.b.values().length];
            f2668 = iArr;
            try {
                iArr[androidx.core.graphics.b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2668[androidx.core.graphics.b.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2668[androidx.core.graphics.b.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2668[androidx.core.graphics.b.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2668[androidx.core.graphics.b.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2668[androidx.core.graphics.b.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2668[androidx.core.graphics.b.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2668[androidx.core.graphics.b.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2668[androidx.core.graphics.b.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2668[androidx.core.graphics.b.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2668[androidx.core.graphics.b.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2668[androidx.core.graphics.b.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2668[androidx.core.graphics.b.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2668[androidx.core.graphics.b.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2668[androidx.core.graphics.b.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2668[androidx.core.graphics.b.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2668[androidx.core.graphics.b.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2668[androidx.core.graphics.b.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f2668[androidx.core.graphics.b.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2668[androidx.core.graphics.b.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2668[androidx.core.graphics.b.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2668[androidx.core.graphics.b.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2668[androidx.core.graphics.b.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2668[androidx.core.graphics.b.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f2668[androidx.core.graphics.b.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2668[androidx.core.graphics.b.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2668[androidx.core.graphics.b.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f2668[androidx.core.graphics.b.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f2668[androidx.core.graphics.b.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* compiled from: BlendModeUtils.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Object m2170(androidx.core.graphics.b bVar) {
            switch (a.f2668[bVar.ordinal()]) {
                case 1:
                    return BlendMode.CLEAR;
                case 2:
                    return BlendMode.SRC;
                case 3:
                    return BlendMode.DST;
                case 4:
                    return BlendMode.SRC_OVER;
                case 5:
                    return BlendMode.DST_OVER;
                case 6:
                    return BlendMode.SRC_IN;
                case 7:
                    return BlendMode.DST_IN;
                case 8:
                    return BlendMode.SRC_OUT;
                case 9:
                    return BlendMode.DST_OUT;
                case 10:
                    return BlendMode.SRC_ATOP;
                case 11:
                    return BlendMode.DST_ATOP;
                case 12:
                    return BlendMode.XOR;
                case 13:
                    return BlendMode.PLUS;
                case 14:
                    return BlendMode.MODULATE;
                case 15:
                    return BlendMode.SCREEN;
                case 16:
                    return BlendMode.OVERLAY;
                case 17:
                    return BlendMode.DARKEN;
                case 18:
                    return BlendMode.LIGHTEN;
                case 19:
                    return BlendMode.COLOR_DODGE;
                case 20:
                    return BlendMode.COLOR_BURN;
                case 21:
                    return BlendMode.HARD_LIGHT;
                case 22:
                    return BlendMode.SOFT_LIGHT;
                case 23:
                    return BlendMode.DIFFERENCE;
                case 24:
                    return BlendMode.EXCLUSION;
                case 25:
                    return BlendMode.MULTIPLY;
                case 26:
                    return BlendMode.HUE;
                case 27:
                    return BlendMode.SATURATION;
                case 28:
                    return BlendMode.COLOR;
                case 29:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static PorterDuff.Mode m2169(androidx.core.graphics.b bVar) {
        if (bVar == null) {
            return null;
        }
        switch (a.f2668[bVar.ordinal()]) {
        }
        return null;
    }
}
