package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.platform.MaterialContainerTransform;

/* compiled from: MaskEvaluator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Path f6614 = new Path();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Path f6615 = new Path();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Path f6616 = new Path();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ShapeAppearancePathProvider f6617 = ShapeAppearancePathProvider.getInstance();

    /* renamed from: ʿ, reason: contains not printable characters */
    private ShapeAppearanceModel f6618;

    g() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m7739(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f6614);
        } else {
            canvas.clipPath(this.f6615);
            canvas.clipPath(this.f6616, Region.Op.UNION);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m7740(float f5, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel m7765 = q.m7765(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f5);
        this.f6618 = m7765;
        this.f6617.calculatePath(m7765, 1.0f, rectF2, this.f6615);
        this.f6617.calculatePath(this.f6618, 1.0f, rectF3, this.f6616);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f6614.op(this.f6615, this.f6616, Path.Op.UNION);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    ShapeAppearanceModel m7741() {
        return this.f6618;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    Path m7742() {
        return this.f6614;
    }
}
