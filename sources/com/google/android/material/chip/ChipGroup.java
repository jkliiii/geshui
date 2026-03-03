package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import java.util.Set;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ChipGroup;
    private final CheckableGroup<Chip> checkableGroup;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private final int defaultCheckedId;
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private final c passThroughListener;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, int i5);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, List<Integer> list);
    }

    class a implements CheckableGroup.OnCheckedStateChangeListener {
        a() {
        }

        @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
        public void onCheckedStateChanged(Set<Integer> set) {
            if (ChipGroup.this.onCheckedStateChangeListener != null) {
                OnCheckedStateChangeListener onCheckedStateChangeListener = ChipGroup.this.onCheckedStateChangeListener;
                ChipGroup chipGroup = ChipGroup.this;
                onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.checkableGroup.getCheckedIdsSortedByChildOrder(ChipGroup.this));
            }
        }
    }

    class b implements OnCheckedStateChangeListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ OnCheckedChangeListener f5463;

        b(OnCheckedChangeListener onCheckedChangeListener) {
            this.f5463 = onCheckedChangeListener;
        }

        @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
        public void onCheckedChanged(ChipGroup chipGroup, List<Integer> list) {
            if (ChipGroup.this.checkableGroup.isSingleSelection()) {
                this.f5463.onCheckedChanged(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    private class c implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        private ViewGroup.OnHierarchyChangeListener f5465;

        private c() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(f1.m2880());
                }
                ChipGroup.this.checkableGroup.addCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5465;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.checkableGroup.removeCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5465;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ c(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof Chip) && isChildVisible(i6)) {
                i5++;
            }
        }
        return i5;
    }

    private boolean isChildVisible(int i5) {
        return getChildAt(i5).getVisibility() == 0;
    }

    public void check(int i5) {
        this.checkableGroup.check(i5);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void clearCheck() {
        this.checkableGroup.clearCheck();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.checkableGroup.getSingleCheckedId();
    }

    public List<Integer> getCheckedChipIds() {
        return this.checkableGroup.getCheckedIdsSortedByChildOrder(this);
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    int getIndexOfChip(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if ((childAt instanceof Chip) && isChildVisible(i6)) {
                if (((Chip) childAt) == view) {
                    return i5;
                }
                i5++;
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.isSelectionRequired();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.isSingleSelection();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.defaultCheckedId;
        if (i5 != -1) {
            this.checkableGroup.check(i5);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j0.m2620(accessibilityNodeInfo).m2643(j0.b.m2710(getRowCount(), isSingleLine() ? getVisibleChipCount() : -1, false, isSingleSelection() ? 1 : 2));
    }

    public void setChipSpacing(int i5) {
        setChipSpacingHorizontal(i5);
        setChipSpacingVertical(i5);
    }

    public void setChipSpacingHorizontal(int i5) {
        if (this.chipSpacingHorizontal != i5) {
            this.chipSpacingHorizontal = i5;
            setItemSpacing(i5);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i5) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i5));
    }

    public void setChipSpacingResource(int i5) {
        setChipSpacing(getResources().getDimensionPixelOffset(i5));
    }

    public void setChipSpacingVertical(int i5) {
        if (this.chipSpacingVertical != i5) {
            this.chipSpacingVertical = i5;
            setLineSpacing(i5);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i5) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i5));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i5) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(onCheckedChangeListener));
        }
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.f5465 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z5) {
        this.checkableGroup.setSelectionRequired(z5);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i5) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i5) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z5) {
        super.setSingleLine(z5);
    }

    public void setSingleSelection(boolean z5) {
        this.checkableGroup.setSingleSelection(z5);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i5) {
        setSingleLine(getResources().getBoolean(i5));
    }

    public void setSingleSelection(int i5) {
        setSingleSelection(getResources().getBoolean(i5));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        CheckableGroup<Chip> checkableGroup = new CheckableGroup<>();
        this.checkableGroup = checkableGroup;
        c cVar = new c(this, null);
        this.passThroughListener = cVar;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.ChipGroup, i5, i6, new int[0]);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(obtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(obtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(obtainStyledAttributes.getBoolean(R.styleable.ChipGroup_selectionRequired, false));
        this.defaultCheckedId = obtainStyledAttributes.getResourceId(R.styleable.ChipGroup_checkedChip, -1);
        obtainStyledAttributes.recycle();
        checkableGroup.setOnCheckedStateChangeListener(new a());
        super.setOnHierarchyChangeListener(cVar);
        f1.m2843(this, 1);
    }
}
