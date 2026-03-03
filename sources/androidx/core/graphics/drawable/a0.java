package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a0 extends Drawable implements Drawable.Callback, z, y {

    /* renamed from: ˋ, reason: contains not printable characters */
    static final PorterDuff.Mode f2684 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f2685;

    /* renamed from: ʿ, reason: contains not printable characters */
    private PorterDuff.Mode f2686;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f2687;

    /* renamed from: ˈ, reason: contains not printable characters */
    d0 f2688;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f2689;

    /* renamed from: ˊ, reason: contains not printable characters */
    Drawable f2690;

    a0(d0 d0Var, Resources resources) {
        this.f2688 = d0Var;
        m2231(resources);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private d0 m2230() {
        return new d0(this.f2688);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m2231(Resources resources) {
        Drawable.ConstantState constantState;
        d0 d0Var = this.f2688;
        if (d0Var == null || (constantState = d0Var.f2693) == null) {
            return;
        }
        mo2233(constantState.newDrawable(resources));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m2232(int[] iArr) {
        if (!mo2235()) {
            return false;
        }
        d0 d0Var = this.f2688;
        ColorStateList colorStateList = d0Var.f2694;
        PorterDuff.Mode mode = d0Var.f2695;
        if (colorStateList == null || mode == null) {
            this.f2687 = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2687 || colorForState != this.f2685 || mode != this.f2686) {
                setColorFilter(colorForState, mode);
                this.f2685 = colorForState;
                this.f2686 = mode;
                this.f2687 = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2690.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        d0 d0Var = this.f2688;
        return changingConfigurations | (d0Var != null ? d0Var.getChangingConfigurations() : 0) | this.f2690.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        d0 d0Var = this.f2688;
        if (d0Var == null || !d0Var.m2241()) {
            return null;
        }
        this.f2688.f2692 = getChangingConfigurations();
        return this.f2688;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2690.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2690.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2690.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.m2201(this.f2690);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2690.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2690.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2690.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2690.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2690.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2690.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.m2203(this.f2690);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        d0 d0Var;
        ColorStateList colorStateList = (!mo2235() || (d0Var = this.f2688) == null) ? null : d0Var.f2694;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2690.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2690.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2689 && super.mutate() == this) {
            this.f2688 = m2230();
            Drawable drawable = this.f2690;
            if (drawable != null) {
                drawable.mutate();
            }
            d0 d0Var = this.f2688;
            if (d0Var != null) {
                Drawable drawable2 = this.f2690;
                d0Var.f2693 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2689 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2690;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i5) {
        return a.m2208(this.f2690, i5);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        return this.f2690.setLevel(i5);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f2690.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        a.m2205(this.f2690, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i5) {
        this.f2690.setChangingConfigurations(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2690.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z5) {
        this.f2690.setDither(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z5) {
        this.f2690.setFilterBitmap(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m2232(iArr) || this.f2690.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintList(ColorStateList colorStateList) {
        this.f2688.f2694 = colorStateList;
        m2232(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2688.f2695 = mode;
        m2232(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        return super.setVisible(z5, z6) || this.f2690.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // androidx.core.graphics.drawable.z
    /* renamed from: ʻ, reason: contains not printable characters */
    public final void mo2233(Drawable drawable) {
        Drawable drawable2 = this.f2690;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2690 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            d0 d0Var = this.f2688;
            if (d0Var != null) {
                d0Var.f2693 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.z
    /* renamed from: ʼ, reason: contains not printable characters */
    public final Drawable mo2234() {
        return this.f2690;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected boolean mo2235() {
        return true;
    }

    a0(Drawable drawable) {
        this.f2688 = m2230();
        mo2233(drawable);
    }
}
