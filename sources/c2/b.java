package c2;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* compiled from: KeyFrameInterpolator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements Interpolator {

    /* renamed from: ʻ, reason: contains not printable characters */
    private TimeInterpolator f4988;

    /* renamed from: ʼ, reason: contains not printable characters */
    private float[] f4989;

    public b(TimeInterpolator timeInterpolator, float... fArr) {
        this.f4988 = timeInterpolator;
        this.f4989 = fArr;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static b m5840(float... fArr) {
        b bVar = new b(a.m5839(), new float[0]);
        bVar.m5842(fArr);
        return bVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static b m5841(float f5, float f6, float f7, float f8, float... fArr) {
        b bVar = new b(c.m5843(f5, f6, f7, f8), new float[0]);
        bVar.m5842(fArr);
        return bVar;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (this.f4989.length > 1) {
            int i5 = 0;
            while (true) {
                float[] fArr = this.f4989;
                if (i5 >= fArr.length - 1) {
                    break;
                }
                float f6 = fArr[i5];
                i5++;
                float f7 = fArr[i5];
                float f8 = f7 - f6;
                if (f5 >= f6 && f5 <= f7) {
                    return f6 + (this.f4988.getInterpolation((f5 - f6) / f8) * f8);
                }
            }
        }
        return this.f4988.getInterpolation(f5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m5842(float... fArr) {
        this.f4989 = fArr;
    }
}
