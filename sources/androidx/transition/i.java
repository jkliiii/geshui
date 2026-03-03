package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class i<T> extends Property<T, Float> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Property<T, PointF> f4503;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final PathMeasure f4504;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final float f4505;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final float[] f4506;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final PointF f4507;

    /* renamed from: ˆ, reason: contains not printable characters */
    private float f4508;

    i(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f4506 = new float[2];
        this.f4507 = new PointF();
        this.f4503 = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f4504 = pathMeasure;
        this.f4505 = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Float get(T t5) {
        return Float.valueOf(this.f4508);
    }

    @Override // android.util.Property
    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void set(T t5, Float f5) {
        this.f4508 = f5.floatValue();
        this.f4504.getPosTan(this.f4505 * f5.floatValue(), this.f4506, null);
        PointF pointF = this.f4507;
        float[] fArr = this.f4506;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f4503.set(t5, pointF);
    }
}
