package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.MaterialContainerTransform;

/* compiled from: MaskEvaluator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Path f6509 = new Path();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Path f6510 = new Path();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Path f6511 = new Path();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ShapeAppearancePathProvider f6512 = ShapeAppearancePathProvider.getInstance();

    /* renamed from: ʿ, reason: contains not printable characters */
    private ShapeAppearanceModel f6513;

    g() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m7682(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f6509);
        } else {
            canvas.clipPath(this.f6510);
            canvas.clipPath(this.f6511, Region.Op.UNION);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m7683(float f5, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel m7701 = k.m7701(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f5);
        this.f6513 = m7701;
        this.f6512.calculatePath(m7701, 1.0f, rectF2, this.f6510);
        this.f6512.calculatePath(this.f6513, 1.0f, rectF3, this.f6511);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f6509.op(this.f6510, this.f6511, Path.Op.UNION);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    ShapeAppearanceModel m7684() {
        return this.f6513;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    Path m7685() {
        return this.f6509;
    }
}
