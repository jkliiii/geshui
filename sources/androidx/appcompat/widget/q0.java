package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class q0 extends l0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final SeekBar f1398;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Drawable f1399;

    /* renamed from: ˆ, reason: contains not printable characters */
    private ColorStateList f1400;

    /* renamed from: ˈ, reason: contains not printable characters */
    private PorterDuff.Mode f1401;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f1402;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f1403;

    q0(SeekBar seekBar) {
        super(seekBar);
        this.f1400 = null;
        this.f1401 = null;
        this.f1402 = false;
        this.f1403 = false;
        this.f1398 = seekBar;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m1479() {
        Drawable drawable = this.f1399;
        if (drawable != null) {
            if (this.f1402 || this.f1403) {
                Drawable m2213 = androidx.core.graphics.drawable.a.m2213(drawable.mutate());
                this.f1399 = m2213;
                if (this.f1402) {
                    androidx.core.graphics.drawable.a.m2210(m2213, this.f1400);
                }
                if (this.f1403) {
                    androidx.core.graphics.drawable.a.m2211(this.f1399, this.f1401);
                }
                if (this.f1399.isStateful()) {
                    this.f1399.setState(this.f1398.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    /* renamed from: ʽ */
    void mo1415(AttributeSet attributeSet, int i5) {
        super.mo1415(attributeSet, i5);
        Context context = this.f1398.getContext();
        int[] iArr = e.j.f7332;
        d3 m1181 = d3.m1181(context, attributeSet, iArr, i5, 0);
        SeekBar seekBar = this.f1398;
        androidx.core.view.f1.m2828(seekBar, seekBar.getContext(), iArr, attributeSet, m1181.m1199(), i5, 0);
        Drawable m1189 = m1181.m1189(e.j.f7334);
        if (m1189 != null) {
            this.f1398.setThumb(m1189);
        }
        m1483(m1181.m1188(e.j.f7336));
        int i6 = e.j.f7338;
        if (m1181.m1200(i6)) {
            this.f1401 = b2.m1146(m1181.m1192(i6, -1), this.f1401);
            this.f1403 = true;
        }
        int i7 = e.j.f7322;
        if (m1181.m1200(i7)) {
            this.f1400 = m1181.m1184(i7);
            this.f1402 = true;
        }
        m1181.m1201();
        m1479();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m1480(Canvas canvas) {
        if (this.f1399 != null) {
            int max = this.f1398.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1399.getIntrinsicWidth();
                int intrinsicHeight = this.f1399.getIntrinsicHeight();
                int i5 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i6 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1399.setBounds(-i5, -i6, i5, i6);
                float width = ((this.f1398.getWidth() - this.f1398.getPaddingLeft()) - this.f1398.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1398.getPaddingLeft(), this.f1398.getHeight() / 2);
                for (int i7 = 0; i7 <= max; i7++) {
                    this.f1399.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m1481() {
        Drawable drawable = this.f1399;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1398.getDrawableState())) {
            this.f1398.invalidateDrawable(drawable);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m1482() {
        Drawable drawable = this.f1399;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m1483(Drawable drawable) {
        Drawable drawable2 = this.f1399;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1399 = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1398);
            androidx.core.graphics.drawable.a.m2208(drawable, androidx.core.view.f1.m2834(this.f1398));
            if (drawable.isStateful()) {
                drawable.setState(this.f1398.getDrawableState());
            }
            m1479();
        }
        this.f1398.invalidate();
    }
}
