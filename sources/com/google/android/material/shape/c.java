package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ShapeableDelegateV22.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c extends ShapeableDelegate {

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f6072 = false;

    /* renamed from: ʼ, reason: contains not printable characters */
    private float f6073 = 0.0f;

    /* compiled from: ShapeableDelegateV22.java */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            c cVar = c.this;
            if (cVar.shapeAppearanceModel == null || cVar.maskBounds.isEmpty()) {
                return;
            }
            c cVar2 = c.this;
            RectF rectF = cVar2.maskBounds;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, cVar2.f6073);
        }
    }

    c(View view) {
        m7179(view);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private float m7178() {
        RectF rectF;
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        if (shapeAppearanceModel == null || (rectF = this.maskBounds) == null) {
            return 0.0f;
        }
        return shapeAppearanceModel.topRightCornerSize.getCornerSize(rectF);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m7179(View view) {
        view.setOutlineProvider(new a());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean m7180() {
        ShapeAppearanceModel shapeAppearanceModel;
        if (this.maskBounds.isEmpty() || (shapeAppearanceModel = this.shapeAppearanceModel) == null) {
            return false;
        }
        return shapeAppearanceModel.isRoundRect(this.maskBounds);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m7181() {
        ShapeAppearanceModel shapeAppearanceModel;
        if (!this.maskBounds.isEmpty() && (shapeAppearanceModel = this.shapeAppearanceModel) != null && this.offsetZeroCornerEdgeBoundsEnabled && !shapeAppearanceModel.isRoundRect(this.maskBounds) && m7182(this.shapeAppearanceModel)) {
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.maskBounds);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.maskBounds);
            float cornerSize3 = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.maskBounds);
            float cornerSize4 = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.maskBounds);
            if (cornerSize == 0.0f && cornerSize3 == 0.0f && cornerSize2 == cornerSize4) {
                RectF rectF = this.maskBounds;
                rectF.set(rectF.left - cornerSize2, rectF.top, rectF.right, rectF.bottom);
                this.f6073 = cornerSize2;
                return true;
            }
            if (cornerSize == 0.0f && cornerSize2 == 0.0f && cornerSize3 == cornerSize4) {
                RectF rectF2 = this.maskBounds;
                rectF2.set(rectF2.left, rectF2.top - cornerSize3, rectF2.right, rectF2.bottom);
                this.f6073 = cornerSize3;
                return true;
            }
            if (cornerSize2 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize3) {
                RectF rectF3 = this.maskBounds;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + cornerSize, rectF3.bottom);
                this.f6073 = cornerSize;
                return true;
            }
            if (cornerSize3 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize2) {
                RectF rectF4 = this.maskBounds;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + cornerSize);
                this.f6073 = cornerSize;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static boolean m7182(ShapeAppearanceModel shapeAppearanceModel) {
        return (shapeAppearanceModel.getTopLeftCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel.getTopRightCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel.getBottomLeftCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel.getBottomRightCorner() instanceof RoundedCornerTreatment);
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(View view) {
        this.f6073 = m7178();
        this.f6072 = m7180() || m7181();
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
        return !this.f6072 || this.forceCompatClippingEnabled;
    }
}
