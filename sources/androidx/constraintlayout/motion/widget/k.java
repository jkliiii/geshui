package androidx.constraintlayout.motion.widget;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k implements Comparable<k> {

    /* renamed from: ⁱ, reason: contains not printable characters */
    static String[] f1703 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: ʾ, reason: contains not printable characters */
    o.b f1704;

    /* renamed from: ˆ, reason: contains not printable characters */
    float f1706;

    /* renamed from: ˈ, reason: contains not printable characters */
    float f1707;

    /* renamed from: ˉ, reason: contains not printable characters */
    float f1708;

    /* renamed from: ˊ, reason: contains not printable characters */
    float f1709;

    /* renamed from: ˋ, reason: contains not printable characters */
    float f1710;

    /* renamed from: ˎ, reason: contains not printable characters */
    float f1711;

    /* renamed from: י, reason: contains not printable characters */
    int f1714;

    /* renamed from: ـ, reason: contains not printable characters */
    int f1715;

    /* renamed from: ٴ, reason: contains not printable characters */
    float f1716;

    /* renamed from: ᐧ, reason: contains not printable characters */
    g f1717;

    /* renamed from: ᴵ, reason: contains not printable characters */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f1718;

    /* renamed from: ᵎ, reason: contains not printable characters */
    int f1719;

    /* renamed from: ᵔ, reason: contains not printable characters */
    double[] f1720;

    /* renamed from: ᵢ, reason: contains not printable characters */
    double[] f1721;

    /* renamed from: ʿ, reason: contains not printable characters */
    int f1705 = 0;

    /* renamed from: ˏ, reason: contains not printable characters */
    float f1712 = Float.NaN;

    /* renamed from: ˑ, reason: contains not printable characters */
    float f1713 = Float.NaN;

    public k() {
        int i5 = d.f1609;
        this.f1714 = i5;
        this.f1715 = i5;
        this.f1716 = Float.NaN;
        this.f1717 = null;
        this.f1718 = new LinkedHashMap<>();
        this.f1719 = 0;
        this.f1720 = new double[18];
        this.f1721 = new double[18];
    }

    @Override // java.lang.Comparable
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.f1707, kVar.f1707);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m1788(double d6, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f5;
        float f6 = this.f1708;
        float f7 = this.f1709;
        float f8 = this.f1710;
        float f9 = this.f1711;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f14 = (float) dArr[i5];
            float f15 = (float) dArr2[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f6 = f14;
                f10 = f15;
            } else if (i6 == 2) {
                f7 = f14;
                f12 = f15;
            } else if (i6 == 3) {
                f8 = f14;
                f11 = f15;
            } else if (i6 == 4) {
                f9 = f14;
                f13 = f15;
            }
        }
        float f16 = 2.0f;
        float f17 = (f11 / 2.0f) + f10;
        float f18 = (f13 / 2.0f) + f12;
        g gVar = this.f1717;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.m1750(d6, fArr3, fArr4);
            float f19 = fArr3[0];
            float f20 = fArr3[1];
            float f21 = fArr4[0];
            float f22 = fArr4[1];
            double d7 = f19;
            double d8 = f6;
            double d9 = f7;
            double sin = Math.sin(d9);
            Double.isNaN(d8);
            Double.isNaN(d7);
            double d10 = d7 + (sin * d8);
            f5 = f8;
            double d11 = f8 / 2.0f;
            Double.isNaN(d11);
            float f23 = (float) (d10 - d11);
            double d12 = f20;
            double cos = Math.cos(d9);
            Double.isNaN(d8);
            Double.isNaN(d12);
            double d13 = d12 - (d8 * cos);
            double d14 = f9 / 2.0f;
            Double.isNaN(d14);
            double d15 = f21;
            double d16 = f10;
            double sin2 = Math.sin(d9);
            Double.isNaN(d16);
            Double.isNaN(d15);
            double d17 = d15 + (sin2 * d16);
            double cos2 = Math.cos(d9);
            double d18 = f12;
            Double.isNaN(d18);
            float f24 = (float) (d17 + (cos2 * d18));
            double d19 = f22;
            double cos3 = Math.cos(d9);
            Double.isNaN(d16);
            Double.isNaN(d19);
            double sin3 = Math.sin(d9);
            Double.isNaN(d18);
            f18 = (float) ((d19 - (d16 * cos3)) + (sin3 * d18));
            f17 = f24;
            f6 = f23;
            f7 = (float) (d13 - d14);
            f16 = 2.0f;
        } else {
            f5 = f8;
        }
        fArr[0] = f6 + (f5 / f16) + 0.0f;
        fArr[1] = f7 + (f9 / f16) + 0.0f;
        fArr2[0] = f17;
        fArr2[1] = f18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    void m1789(float f5, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z5) {
        float f6;
        boolean z6;
        float f7;
        float f8 = this.f1708;
        float f9 = this.f1709;
        float f10 = this.f1710;
        float f11 = this.f1711;
        if (iArr.length != 0 && this.f1720.length <= iArr[iArr.length - 1]) {
            int i5 = iArr[iArr.length - 1] + 1;
            this.f1720 = new double[i5];
            this.f1721 = new double[i5];
        }
        Arrays.fill(this.f1720, Double.NaN);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            double[] dArr4 = this.f1720;
            int i7 = iArr[i6];
            dArr4[i7] = dArr[i6];
            this.f1721[i7] = dArr2[i6];
        }
        float f12 = Float.NaN;
        int i8 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            double[] dArr5 = this.f1720;
            if (i8 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i8]) && (dArr3 == null || dArr3[i8] == 0.0d)) {
                f7 = f12;
            } else {
                double d6 = dArr3 != null ? dArr3[i8] : 0.0d;
                if (!Double.isNaN(this.f1720[i8])) {
                    d6 = this.f1720[i8] + d6;
                }
                f7 = f12;
                float f17 = (float) d6;
                float f18 = (float) this.f1721[i8];
                if (i8 == 1) {
                    f12 = f7;
                    f13 = f18;
                    f8 = f17;
                } else if (i8 == 2) {
                    f12 = f7;
                    f14 = f18;
                    f9 = f17;
                } else if (i8 == 3) {
                    f12 = f7;
                    f15 = f18;
                    f10 = f17;
                } else if (i8 == 4) {
                    f12 = f7;
                    f16 = f18;
                    f11 = f17;
                } else if (i8 == 5) {
                    f12 = f17;
                }
                i8++;
            }
            f12 = f7;
            i8++;
        }
        float f19 = f12;
        g gVar = this.f1717;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.m1750(f5, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d7 = f20;
            double d8 = f8;
            double d9 = f9;
            double sin = Math.sin(d9);
            Double.isNaN(d8);
            Double.isNaN(d7);
            double d10 = f10 / 2.0f;
            Double.isNaN(d10);
            float f24 = (float) ((d7 + (sin * d8)) - d10);
            double d11 = f21;
            double cos = Math.cos(d9);
            Double.isNaN(d8);
            Double.isNaN(d11);
            double d12 = d11 - (cos * d8);
            f6 = f11;
            double d13 = f11 / 2.0f;
            Double.isNaN(d13);
            float f25 = (float) (d12 - d13);
            double d14 = f22;
            double d15 = f13;
            double sin2 = Math.sin(d9);
            Double.isNaN(d15);
            Double.isNaN(d14);
            double d16 = d14 + (sin2 * d15);
            double cos2 = Math.cos(d9);
            Double.isNaN(d8);
            double d17 = f14;
            Double.isNaN(d17);
            float f26 = (float) (d16 + (cos2 * d8 * d17));
            double d18 = f23;
            double cos3 = Math.cos(d9);
            Double.isNaN(d15);
            Double.isNaN(d18);
            double sin3 = Math.sin(d9);
            Double.isNaN(d8);
            Double.isNaN(d17);
            float f27 = (float) ((d18 - (d15 * cos3)) + (d8 * sin3 * d17));
            if (dArr2.length >= 2) {
                z6 = false;
                dArr2[0] = f26;
                dArr2[1] = f27;
            } else {
                z6 = false;
            }
            if (!Float.isNaN(f19)) {
                double d19 = f19;
                double degrees = Math.toDegrees(Math.atan2(f27, f26));
                Double.isNaN(d19);
                view.setRotation((float) (d19 + degrees));
            }
            f8 = f24;
            f9 = f25;
        } else {
            f6 = f11;
            z6 = false;
            if (!Float.isNaN(f19)) {
                double d20 = 0.0f;
                double d21 = f19;
                double degrees2 = Math.toDegrees(Math.atan2(f14 + (f16 / 2.0f), f13 + (f15 / 2.0f)));
                Double.isNaN(d21);
                Double.isNaN(d20);
                view.setRotation((float) (d20 + d21 + degrees2));
            }
        }
        if (view instanceof c) {
            ((c) view).m1747(f8, f9, f10 + f8, f9 + f6);
            return;
        }
        float f28 = f8 + 0.5f;
        int i9 = (int) f28;
        float f29 = f9 + 0.5f;
        int i10 = (int) f29;
        int i11 = (int) (f28 + f10);
        int i12 = (int) (f29 + f6);
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (i13 != view.getMeasuredWidth() || i14 != view.getMeasuredHeight()) {
            z6 = true;
        }
        if (z6 || z5) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        }
        view.layout(i9, i10, i11, i12);
    }
}
