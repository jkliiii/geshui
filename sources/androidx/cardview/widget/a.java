package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: CardView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final i IMPL;
    private final h mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* compiled from: CardView.java */
    /* renamed from: androidx.cardview.widget.a$a, reason: collision with other inner class name */
    class C0019a implements h {

        /* renamed from: ʻ, reason: contains not printable characters */
        private Drawable f1541;

        C0019a() {
        }

        @Override // androidx.cardview.widget.h
        public void setShadowPadding(int i5, int i6, int i7, int i8) {
            a.this.mShadowBounds.set(i5, i6, i7, i8);
            a aVar = a.this;
            Rect rect = aVar.mContentPadding;
            a.super.setPadding(i5 + rect.left, i6 + rect.top, i7 + rect.right, i8 + rect.bottom);
        }

        @Override // androidx.cardview.widget.h
        /* renamed from: ʻ, reason: contains not printable characters */
        public View mo1659() {
            return a.this;
        }

        @Override // androidx.cardview.widget.h
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo1660(int i5, int i6) {
            a aVar = a.this;
            if (i5 > aVar.mUserSetMinWidth) {
                a.super.setMinimumWidth(i5);
            }
            a aVar2 = a.this;
            if (i6 > aVar2.mUserSetMinHeight) {
                a.super.setMinimumHeight(i6);
            }
        }

        @Override // androidx.cardview.widget.h
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo1661(Drawable drawable) {
            this.f1541 = drawable;
            a.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.h
        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean mo1662() {
            return a.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.h
        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean mo1663() {
            return a.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.h
        /* renamed from: ˆ, reason: contains not printable characters */
        public Drawable mo1664() {
            return this.f1541;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            IMPL = new f();
        } else {
            IMPL = new b();
        }
        IMPL.mo1665();
    }

    public a(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo1672(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo1675(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.mo1671(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo1677(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        if (IMPL instanceof f) {
            super.onMeasure(i5, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1679(this.mCardViewDelegate)), View.MeasureSpec.getSize(i5)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i6);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1678(this.mCardViewDelegate)), View.MeasureSpec.getSize(i6)), mode2);
        }
        super.onMeasure(i5, i6);
    }

    public void setCardBackgroundColor(int i5) {
        IMPL.mo1683(this.mCardViewDelegate, ColorStateList.valueOf(i5));
    }

    public void setCardElevation(float f5) {
        IMPL.mo1681(this.mCardViewDelegate, f5);
    }

    public void setContentPadding(int i5, int i6, int i7, int i8) {
        this.mContentPadding.set(i5, i6, i7, i8);
        IMPL.mo1676(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f5) {
        IMPL.mo1684(this.mCardViewDelegate, f5);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i5) {
        this.mUserSetMinHeight = i5;
        super.setMinimumHeight(i5);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i5) {
        this.mUserSetMinWidth = i5;
        super.setMinimumWidth(i5);
    }

    public void setPreventCornerOverlap(boolean z5) {
        if (z5 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z5;
            IMPL.mo1682(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f5) {
        IMPL.mo1674(this.mCardViewDelegate, f5);
    }

    public void setUseCompatPadding(boolean z5) {
        if (this.mCompatPadding != z5) {
            this.mCompatPadding = z5;
            IMPL.mo1680(this.mCardViewDelegate);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a.f8900);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.mo1683(this.mCardViewDelegate, colorStateList);
    }

    public a(Context context, AttributeSet attributeSet, int i5) {
        int color;
        ColorStateList valueOf;
        super(context, attributeSet, i5);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C0019a c0019a = new C0019a();
        this.mCardViewDelegate = c0019a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.e.f8907, i5, l.d.f8906);
        int i6 = l.e.f8910;
        if (obtainStyledAttributes.hasValue(i6)) {
            valueOf = obtainStyledAttributes.getColorStateList(i6);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(l.b.f8902);
            } else {
                color = getResources().getColor(l.b.f8901);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(l.e.f8911, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(l.e.f8912, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(l.e.f8913, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(l.e.f8915, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(l.e.f8914, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(l.e.f8916, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(l.e.f8918, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(l.e.f8920, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(l.e.f8919, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(l.e.f8917, dimensionPixelSize);
        float f5 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(l.e.f8908, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(l.e.f8909, 0);
        obtainStyledAttributes.recycle();
        IMPL.mo1673(c0019a, context, colorStateList, dimension, dimension2, f5);
    }

    @Override // android.view.View
    public void setPadding(int i5, int i6, int i7, int i8) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i5, int i6, int i7, int i8) {
    }
}
