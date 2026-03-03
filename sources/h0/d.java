package h0;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class d implements Interpolator {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final float[] f8109;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final float f8110;

    protected d(float[] fArr) {
        this.f8109 = fArr;
        this.f8110 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f8109;
        int min = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f6 = this.f8110;
        float f7 = (f5 - (min * f6)) / f6;
        float[] fArr2 = this.f8109;
        float f8 = fArr2[min];
        return f8 + (f7 * (fArr2[min + 1] - f8));
    }
}
