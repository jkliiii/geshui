package androidx.core.graphics;

import android.graphics.Color;

/* compiled from: ColorUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<double[]> f2696 = new ThreadLocal<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m2269(int i5, int i6, int i7, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d6 = i5;
        Double.isNaN(d6);
        double d7 = d6 / 255.0d;
        double pow = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = i6;
        Double.isNaN(d8);
        double d9 = d8 / 255.0d;
        double pow2 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = i7;
        Double.isNaN(d10);
        double d11 = d10 / 255.0d;
        double pow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m2270(double d6, double d7, double d8) {
        double d9 = (((3.2406d * d6) + ((-1.5372d) * d7)) + ((-0.4986d) * d8)) / 100.0d;
        double d10 = ((((-0.9689d) * d6) + (1.8758d * d7)) + (0.0415d * d8)) / 100.0d;
        double d11 = (((0.0557d * d6) + ((-0.204d) * d7)) + (1.057d * d8)) / 100.0d;
        return Color.rgb(m2277((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d), 0, 255), m2277((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), m2277((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m2271(int i5, int i6, float f5) {
        float f6 = 1.0f - f5;
        return Color.argb((int) ((Color.alpha(i5) * f6) + (Color.alpha(i6) * f5)), (int) ((Color.red(i5) * f6) + (Color.red(i6) * f5)), (int) ((Color.green(i5) * f6) + (Color.green(i6) * f5)), (int) ((Color.blue(i5) * f6) + (Color.blue(i6) * f5)));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static double m2272(int i5) {
        double[] m2278 = m2278();
        m2273(i5, m2278);
        return m2278[1] / 100.0d;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m2273(int i5, double[] dArr) {
        m2269(Color.red(i5), Color.green(i5), Color.blue(i5), dArr);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static int m2274(int i5, int i6) {
        return 255 - (((255 - i6) * (255 - i5)) / 255);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static int m2275(int i5, int i6) {
        int alpha = Color.alpha(i6);
        int alpha2 = Color.alpha(i5);
        int m2274 = m2274(alpha2, alpha);
        return Color.argb(m2274, m2276(Color.red(i5), alpha2, Color.red(i6), alpha, m2274), m2276(Color.green(i5), alpha2, Color.green(i6), alpha, m2274), m2276(Color.blue(i5), alpha2, Color.blue(i6), alpha, m2274));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static int m2276(int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        return (((i5 * 255) * i6) + ((i7 * i8) * (255 - i6))) / (i9 * 255);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static int m2277(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : Math.min(i5, i7);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static double[] m2278() {
        ThreadLocal<double[]> threadLocal = f2696;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m2279(int i5, int i6) {
        if (i6 < 0 || i6 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i5 & 16777215) | (i6 << 24);
    }
}
