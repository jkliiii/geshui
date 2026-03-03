package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* compiled from: CalendarItemStyle.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Rect f5651;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final ColorStateList f5652;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final ColorStateList f5653;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ColorStateList f5654;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f5655;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final ShapeAppearanceModel f5656;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i5, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        androidx.core.util.h.m2580(rect.left);
        androidx.core.util.h.m2580(rect.top);
        androidx.core.util.h.m2580(rect.right);
        androidx.core.util.h.m2580(rect.bottom);
        this.f5651 = rect;
        this.f5652 = colorStateList2;
        this.f5653 = colorStateList;
        this.f5654 = colorStateList3;
        this.f5655 = i5;
        this.f5656 = shapeAppearanceModel;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static a m6694(Context context, int i5) {
        androidx.core.util.h.m2578(i5 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        obtainStyledAttributes.recycle();
        return new a(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, build, rect);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    int m6695() {
        return this.f5651.bottom;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    int m6696() {
        return this.f5651.top;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m6697(TextView textView) {
        m6698(textView, null, null);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m6698(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f5656);
        materialShapeDrawable2.setShapeAppearanceModel(this.f5656);
        if (colorStateList == null) {
            colorStateList = this.f5653;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.f5655, this.f5654);
        if (colorStateList2 == null) {
            colorStateList2 = this.f5652;
        }
        textView.setTextColor(colorStateList2);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f5652.withAlpha(30), materialShapeDrawable, materialShapeDrawable2) : materialShapeDrawable;
        Rect rect = this.f5651;
        f1.m2836(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
