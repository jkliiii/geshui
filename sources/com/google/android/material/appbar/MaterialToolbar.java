package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Boolean logoAdjustViewBounds;
    private ImageView.ScaleType logoScaleType;
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> calculateTitleBoundLimits(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i5 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void initBackground(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(f1.m2904(this));
            f1.m2836(this, materialShapeDrawable);
        }
    }

    private void layoutTitleCenteredHorizontally(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i5 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i6 = measuredWidth2 + i5;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i5, 0), Math.max(i6 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i5 += max;
            i6 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i6 - i5, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i5, view.getTop(), i6, view.getBottom());
    }

    private void maybeCenterTitleViews() {
        if (this.titleCentered || this.subtitleCentered) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView == null && subtitleTextView == null) {
                return;
            }
            Pair<Integer, Integer> calculateTitleBoundLimits = calculateTitleBoundLimits(titleTextView, subtitleTextView);
            if (this.titleCentered && titleTextView != null) {
                layoutTitleCenteredHorizontally(titleTextView, calculateTitleBoundLimits);
            }
            if (!this.subtitleCentered || subtitleTextView == null) {
                return;
            }
            layoutTitleCenteredHorizontally(subtitleTextView, calculateTitleBoundLimits);
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        Drawable m2213 = androidx.core.graphics.drawable.a.m2213(drawable.mutate());
        androidx.core.graphics.drawable.a.m2209(m2213, this.navigationIconTint.intValue());
        return m2213;
    }

    private void updateLogoImageView() {
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.logoAdjustViewBounds;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.logoScaleType;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    public void clearNavigationIconTint() {
        this.navigationIconTint = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            androidx.core.graphics.drawable.a.m2210(androidx.core.graphics.drawable.a.m2213(navigationIcon.mutate()), null);
            setNavigationIcon(navigationIcon);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    public Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i5) {
        Menu menu = getMenu();
        boolean z5 = menu instanceof androidx.appcompat.view.menu.g;
        if (z5) {
            ((androidx.appcompat.view.menu.g) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i5);
        if (z5) {
            ((androidx.appcompat.view.menu.g) menu).startDispatchingItemsChanged();
        }
    }

    public boolean isLogoAdjustViewBounds() {
        Boolean bool = this.logoAdjustViewBounds;
        return bool != null && bool.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.subtitleCentered;
    }

    public boolean isTitleCentered() {
        return this.titleCentered;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        maybeCenterTitleViews();
        updateLogoImageView();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation(this, f5);
    }

    public void setLogoAdjustViewBounds(boolean z5) {
        Boolean bool = this.logoAdjustViewBounds;
        if (bool == null || bool.booleanValue() != z5) {
            this.logoAdjustViewBounds = Boolean.valueOf(z5);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.logoScaleType != scaleType) {
            this.logoScaleType = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int i5) {
        this.navigationIconTint = Integer.valueOf(i5);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z5) {
        if (this.subtitleCentered != z5) {
            this.subtitleCentered = z5;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z5) {
        if (this.titleCentered != z5) {
            this.titleCentered = z5;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialToolbar, i5, i6, new int[0]);
        int i7 = R.styleable.MaterialToolbar_navigationIconTint;
        if (obtainStyledAttributes.hasValue(i7)) {
            setNavigationIconTint(obtainStyledAttributes.getColor(i7, -1));
        }
        this.titleCentered = obtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_titleCentered, false);
        this.subtitleCentered = obtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_subtitleCentered, false);
        int i8 = obtainStyledAttributes.getInt(R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i8 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = LOGO_SCALE_TYPE_ARRAY;
            if (i8 < scaleTypeArr.length) {
                this.logoScaleType = scaleTypeArr[i8];
            }
        }
        int i9 = R.styleable.MaterialToolbar_logoAdjustViewBounds;
        if (obtainStyledAttributes.hasValue(i9)) {
            this.logoAdjustViewBounds = Boolean.valueOf(obtainStyledAttributes.getBoolean(i9, false));
        }
        obtainStyledAttributes.recycle();
        initBackground(context2);
    }
}
