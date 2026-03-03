package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* compiled from: CalendarStyle.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    final a f5657;

    /* renamed from: ʼ, reason: contains not printable characters */
    final a f5658;

    /* renamed from: ʽ, reason: contains not printable characters */
    final a f5659;

    /* renamed from: ʾ, reason: contains not printable characters */
    final a f5660;

    /* renamed from: ʿ, reason: contains not printable characters */
    final a f5661;

    /* renamed from: ˆ, reason: contains not printable characters */
    final a f5662;

    /* renamed from: ˈ, reason: contains not printable characters */
    final a f5663;

    /* renamed from: ˉ, reason: contains not printable characters */
    final Paint f5664;

    b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), R.styleable.MaterialCalendar);
        this.f5657 = a.m6694(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f5663 = a.m6694(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f5658 = a.m6694(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f5659 = a.m6694(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f5660 = a.m6694(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f5661 = a.m6694(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f5662 = a.m6694(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f5664 = paint;
        paint.setColor(colorStateList.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
