package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.a;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialDividerItemDecoration extends RecyclerView.o {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(Context context, int i5) {
        this(context, null, i5);
    }

    private void drawForHorizontalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i5;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i5 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i5, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i5 = 0;
        }
        int i6 = i5 + this.insetStart;
        int i7 = height - this.insetEnd;
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = this.tempRect.right + Math.round(childAt.getTranslationX());
                this.dividerDrawable.setBounds(round - this.thickness, i6, round, i7);
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i5;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i5 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i5, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i5 = 0;
        }
        boolean z5 = f1.m2834(recyclerView) == 1;
        int i6 = i5 + (z5 ? this.insetEnd : this.insetStart);
        int i7 = width - (z5 ? this.insetStart : this.insetEnd);
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = this.tempRect.bottom + Math.round(childAt.getTranslationY());
                this.dividerDrawable.setBounds(i6, round - this.thickness, i7, round);
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
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

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(int i5) {
        this.color = i5;
        Drawable m2213 = a.m2213(this.dividerDrawable);
        this.dividerDrawable = m2213;
        a.m2209(m2213, i5);
    }

    public void setDividerColorResource(Context context, int i5) {
        setDividerColor(androidx.core.content.a.m1991(context, i5));
    }

    public void setDividerInsetEnd(int i5) {
        this.insetEnd = i5;
    }

    public void setDividerInsetEndResource(Context context, int i5) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i5));
    }

    public void setDividerInsetStart(int i5) {
        this.insetStart = i5;
    }

    public void setDividerInsetStartResource(Context context, int i5) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i5));
    }

    public void setDividerThickness(int i5) {
        this.thickness = i5;
    }

    public void setDividerThicknessResource(Context context, int i5) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i5));
    }

    public void setLastItemDecorated(boolean z5) {
        this.lastItemDecorated = z5;
    }

    public void setOrientation(int i5) {
        if (i5 == 0 || i5 == 1) {
            this.orientation = i5;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i5 + ". It should be either HORIZONTAL or VERTICAL");
    }

    protected boolean shouldDrawDivider(int i5, RecyclerView.h<?> hVar) {
        return true;
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, R.attr.materialDividerStyle, i5);
    }

    private boolean shouldDrawDivider(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        boolean z5 = adapter != null && childAdapterPosition == adapter.mo4807() - 1;
        if (childAdapterPosition != -1) {
            return (!z5 || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, (RecyclerView.h<?>) adapter);
        }
        return false;
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.tempRect = new Rect();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i5, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = obtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        obtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i6);
    }
}
