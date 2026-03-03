package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* compiled from: CutoutDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h extends MaterialShapeDrawable {

    /* renamed from: ʾ, reason: contains not printable characters */
    b f6186;

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        protected void drawStrokeShape(Canvas canvas) {
            if (this.f6186.f6187.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f6186.f6187);
            } else {
                canvas.clipRect(this.f6186.f6187, Region.Op.DIFFERENCE);
            }
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static h m7316(ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new ShapeAppearanceModel();
        }
        return m7317(new b(shapeAppearanceModel, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static h m7317(b bVar) {
        return new c(bVar);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6186 = new b(this.f6186);
        return this;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m7318() {
        return !this.f6186.f6187.isEmpty();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m7319() {
        m7320(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m7320(float f5, float f6, float f7, float f8) {
        if (f5 == this.f6186.f6187.left && f6 == this.f6186.f6187.top && f7 == this.f6186.f6187.right && f8 == this.f6186.f6187.bottom) {
            return;
        }
        this.f6186.f6187.set(f5, f6, f7, f8);
        invalidateSelf();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m7321(RectF rectF) {
        m7320(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* compiled from: CutoutDrawable.java */
    private static final class b extends MaterialShapeDrawable.MaterialShapeDrawableState {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final RectF f6187;

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h m7317 = h.m7317(this);
            m7317.invalidateSelf();
            return m7317;
        }

        private b(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel, null);
            this.f6187 = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f6187 = bVar.f6187;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.f6186 = bVar;
    }
}
