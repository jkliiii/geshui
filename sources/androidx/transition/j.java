package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* compiled from: PatternPathMotion.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends h {

    /* renamed from: ʻ, reason: contains not printable characters */
    private Path f4510;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Path f4511 = new Path();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Matrix f4512 = new Matrix();

    public j(Path path) {
        m5374(path);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static float m5373(float f5, float f6) {
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // androidx.transition.h
    public Path getPath(float f5, float f6, float f7, float f8) {
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        float m5373 = m5373(f9, f10);
        double atan2 = Math.atan2(f10, f9);
        this.f4512.setScale(m5373, m5373);
        this.f4512.postRotate((float) Math.toDegrees(atan2));
        this.f4512.postTranslate(f5, f6);
        Path path = new Path();
        this.f4511.transform(this.f4512, path);
        return path;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m5374(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f5 = fArr[0];
        float f6 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f7 = fArr[0];
        float f8 = fArr[1];
        if (f7 == f5 && f8 == f6) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f4512.setTranslate(-f7, -f8);
        float f9 = f5 - f7;
        float f10 = f6 - f8;
        float m5373 = 1.0f / m5373(f9, f10);
        this.f4512.postScale(m5373, m5373);
        this.f4512.postRotate((float) Math.toDegrees(-Math.atan2(f10, f9)));
        path.transform(this.f4512, this.f4511);
        this.f4510 = path;
    }
}
