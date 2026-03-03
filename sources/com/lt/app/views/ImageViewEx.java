package com.lt.app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.q;
import g3.l;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ImageViewEx extends q {

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f6736;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f6737;

    public ImageViewEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6736 = -1;
        this.f6737 = 0;
        m8013(context, attributeSet, 0, 0);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m8013(Context context, AttributeSet attributeSet, int i5, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f7920, i5, i6);
        this.f6736 = obtainStyledAttributes.getInt(1, this.f6736);
        this.f6737 = obtainStyledAttributes.getInt(0, this.f6737);
        obtainStyledAttributes.recycle();
        setCropType(this.f6736);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        float f5;
        int i8;
        int i9;
        int i10;
        float f6;
        int i11;
        float f7;
        Drawable drawable = getDrawable();
        if (drawable == null || this.f6736 <= -1) {
            super.onMeasure(i5, i6);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f8 = 0.0f;
        int i12 = 0;
        if (this.f6736 <= 1) {
            i7 = View.MeasureSpec.getSize(i5);
            if (getLayoutParams().width == -2 && intrinsicWidth < i7) {
                i7 = intrinsicWidth;
            }
            f5 = i7 / intrinsicWidth;
            i8 = (int) (intrinsicHeight * f5);
        } else {
            i7 = 0;
            f5 = 0.0f;
            i8 = 0;
        }
        if (this.f6736 >= 1) {
            int size = View.MeasureSpec.getSize(i6);
            if (getLayoutParams().height == -2 && intrinsicHeight < size) {
                size = intrinsicHeight;
            }
            float f9 = size / intrinsicHeight;
            i10 = (int) (intrinsicWidth * f9);
            int i13 = size;
            f8 = f9;
            i9 = i13;
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (f5 > f8) {
            i9 = getMaxHeight();
            int i14 = getLayoutParams().height;
            if (i14 >= -1) {
                if (i14 == -1) {
                    i14 = View.MeasureSpec.getSize(i6);
                }
                if (i14 < i9) {
                    i9 = i14;
                }
            }
            if (i8 <= i9) {
                i9 = i8;
            }
            int i15 = this.f6737;
            if (i15 >= 2) {
                f7 = (i9 - i8) * 0.5f;
            } else if (i15 == 1) {
                f7 = (i9 - i8) * 1.0f;
            }
            i11 = (int) (f7 + 0.5f);
            Matrix imageMatrix = getImageMatrix();
            imageMatrix.setScale(f5, f5);
            imageMatrix.postTranslate(i12, i11);
            setImageMatrix(imageMatrix);
            setMeasuredDimension(i7, i9);
        }
        i7 = getMaxWidth();
        int i16 = getLayoutParams().width;
        if (i16 >= -1) {
            if (i16 == -1) {
                i16 = View.MeasureSpec.getSize(i5);
            }
            if (i16 < i7) {
                i7 = i16;
            }
        }
        if (i10 <= i7) {
            i7 = i10;
        }
        int i17 = this.f6737;
        if (i17 <= 2) {
            f6 = (i7 - i10) * 0.5f;
        } else {
            if (i17 == 4) {
                f6 = (i7 - i10) * 1.0f;
            }
            f5 = f8;
        }
        i12 = (int) (f6 + 0.5f);
        f5 = f8;
        i11 = 0;
        Matrix imageMatrix2 = getImageMatrix();
        imageMatrix2.setScale(f5, f5);
        imageMatrix2.postTranslate(i12, i11);
        setImageMatrix(imageMatrix2);
        setMeasuredDimension(i7, i9);
    }

    public void setCropAlign(int i5) {
        this.f6737 = i5;
    }

    public void setCropType(int i5) {
        this.f6736 = i5;
        if (i5 > -1) {
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }
}
