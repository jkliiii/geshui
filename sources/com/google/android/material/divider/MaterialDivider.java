package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    private int color;
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.color;
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i5;
        super.onDraw(canvas);
        boolean z5 = f1.m2834(this) == 1;
        int i6 = z5 ? this.insetEnd : this.insetStart;
        if (z5) {
            width = getWidth();
            i5 = this.insetStart;
        } else {
            width = getWidth();
            i5 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i6, 0, width - i5, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i6);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i7 = this.thickness;
            if (i7 > 0 && measuredHeight != i7) {
                measuredHeight = i7;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i5) {
        if (this.color != i5) {
            this.color = i5;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i5));
            invalidate();
        }
    }

    public void setDividerColorResource(int i5) {
        setDividerColor(a.m1991(getContext(), i5));
    }

    public void setDividerInsetEnd(int i5) {
        this.insetEnd = i5;
    }

    public void setDividerInsetEndResource(int i5) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i5));
    }

    public void setDividerInsetStart(int i5) {
        this.insetStart = i5;
    }

    public void setDividerInsetStartResource(int i5) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i5));
    }

    public void setDividerThickness(int i5) {
        if (this.thickness != i5) {
            this.thickness = i5;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i5) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i5));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialDivider, i5, i6, new int[0]);
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
