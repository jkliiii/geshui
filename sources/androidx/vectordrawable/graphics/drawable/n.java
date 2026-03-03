package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.y;

/* compiled from: VectorDrawableCommon.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class n extends Drawable implements y {

    /* renamed from: ʾ, reason: contains not printable characters */
    Drawable f4621;

    n() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2196(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2204(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.setLevel(i5) : super.onLevelChange(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setChangingConfigurations(i5);
        } else {
            super.setChangingConfigurations(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i5, PorterDuff.Mode mode) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setColorFilter(i5, mode);
        } else {
            super.setColorFilter(i5, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setFilterBitmap(z5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f5, float f6) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2206(drawable, f5, f6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i5, int i6, int i7, int i8) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2207(drawable, i5, i6, i7, i8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
