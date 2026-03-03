package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorApi14.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a implements Interpolator {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final float[] f2910;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final float[] f2911;

    a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i5 = ((int) (length / 0.002f)) + 1;
        this.f2910 = new float[i5];
        this.f2911 = new float[i5];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < i5; i6++) {
            pathMeasure.getPosTan((i6 * length) / (i5 - 1), fArr, null);
            this.f2910[i6] = fArr[0];
            this.f2911[i6] = fArr[1];
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Path m2744(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f5, f6, f7, f8, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f2910.length - 1;
        int i5 = 0;
        while (length - i5 > 1) {
            int i6 = (i5 + length) / 2;
            if (f5 < this.f2910[i6]) {
                length = i6;
            } else {
                i5 = i6;
            }
        }
        float[] fArr = this.f2910;
        float f6 = fArr[length];
        float f7 = fArr[i5];
        float f8 = f6 - f7;
        if (f8 == 0.0f) {
            return this.f2911[i5];
        }
        float f9 = (f5 - f7) / f8;
        float[] fArr2 = this.f2911;
        float f10 = fArr2[i5];
        return f10 + (f9 * (fArr2[length] - f10));
    }

    a(float f5, float f6, float f7, float f8) {
        this(m2744(f5, f6, f7, f8));
    }
}
