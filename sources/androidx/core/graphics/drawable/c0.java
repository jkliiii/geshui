package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c0 extends a0 {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static Method f2691;

    c0(Drawable drawable) {
        super(drawable);
        m2239();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m2239() {
        if (f2691 == null) {
            try {
                f2691 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e5) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2690.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2690.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2690;
        if (drawable != null && (method = f2691) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e5) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e5);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f5, float f6) {
        this.f2690.setHotspot(f5, f6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i5, int i6, int i7, int i8) {
        this.f2690.setHotspotBounds(i5, i6, i7, i8);
    }

    @Override // androidx.core.graphics.drawable.a0, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.a0, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTint(int i5) {
        if (mo2235()) {
            super.setTint(i5);
        } else {
            this.f2690.setTint(i5);
        }
    }

    @Override // androidx.core.graphics.drawable.a0, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintList(ColorStateList colorStateList) {
        if (mo2235()) {
            super.setTintList(colorStateList);
        } else {
            this.f2690.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.a0, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo2235()) {
            super.setTintMode(mode);
        } else {
            this.f2690.setTintMode(mode);
        }
    }

    @Override // androidx.core.graphics.drawable.a0
    /* renamed from: ʽ */
    protected boolean mo2235() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2690;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    c0(d0 d0Var, Resources resources) {
        super(d0Var, resources);
        m2239();
    }
}
