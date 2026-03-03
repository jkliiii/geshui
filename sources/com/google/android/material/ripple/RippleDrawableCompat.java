package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.y;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* loaded from: E:\78999\cookie_5123796.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable, y {
    private b drawableState;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.drawableState;
        if (bVar.f5971) {
            bVar.f5970.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawableState.f5970.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.f5970.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.f5970.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.drawableState.f5970.setState(iArr)) {
            onStateChange = true;
        }
        boolean shouldDrawRippleCompat = RippleUtils.shouldDrawRippleCompat(iArr);
        b bVar = this.drawableState;
        if (bVar.f5971 == shouldDrawRippleCompat) {
            return onStateChange;
        }
        bVar.f5971 = shouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.drawableState.f5970.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.f5970.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.f5970.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTint(int i5) {
        this.drawableState.f5970.setTint(i5);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.f5970.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintMode(PorterDuff.Mode mode) {
        this.drawableState.f5970.setTintMode(mode);
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this(new b(new MaterialShapeDrawable(shapeAppearanceModel)));
    }

    @Override // android.graphics.drawable.Drawable
    public RippleDrawableCompat mutate() {
        this.drawableState = new b(this.drawableState);
        return this;
    }

    static final class b extends Drawable.ConstantState {

        /* renamed from: ʻ, reason: contains not printable characters */
        MaterialShapeDrawable f5970;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f5971;

        public b(MaterialShapeDrawable materialShapeDrawable) {
            this.f5970 = materialShapeDrawable;
            this.f5971 = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new b(this));
        }

        public b(b bVar) {
            this.f5970 = (MaterialShapeDrawable) bVar.f5970.getConstantState().newDrawable();
            this.f5971 = bVar.f5971;
        }
    }

    private RippleDrawableCompat(b bVar) {
        this.drawableState = bVar;
    }
}
