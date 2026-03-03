package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d0 extends Drawable.ConstantState {

    /* renamed from: ʻ, reason: contains not printable characters */
    int f2692;

    /* renamed from: ʼ, reason: contains not printable characters */
    Drawable.ConstantState f2693;

    /* renamed from: ʽ, reason: contains not printable characters */
    ColorStateList f2694;

    /* renamed from: ʾ, reason: contains not printable characters */
    PorterDuff.Mode f2695;

    d0(d0 d0Var) {
        this.f2694 = null;
        this.f2695 = a0.f2684;
        if (d0Var != null) {
            this.f2692 = d0Var.f2692;
            this.f2693 = d0Var.f2693;
            this.f2694 = d0Var.f2694;
            this.f2695 = d0Var.f2695;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i5 = this.f2692;
        Drawable.ConstantState constantState = this.f2693;
        return i5 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean m2241() {
        return this.f2693 != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new c0(this, resources) : new a0(this, resources);
    }
}
