package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialCardView extends androidx.cardview.widget.a implements Checkable, Shapeable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;
    private static final String LOG_TAG = "MaterialCardView";
    private final c cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private OnCheckedChangeListener onCheckedChangeListener;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DRAGGED_STATE_SET = {com.google.android.material.R.attr.state_dragged};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView materialCardView, boolean z5);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private void forceRippleRedrawIfNeeded() {
        if (Build.VERSION.SDK_INT > 26) {
            this.cardViewHelper.m6327();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.cardViewHelper.m6329().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.a
    public ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.m6331();
    }

    public ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.m6333();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.cardViewHelper.m6335();
    }

    public int getCheckedIconGravity() {
        return this.cardViewHelper.m6336();
    }

    public int getCheckedIconMargin() {
        return this.cardViewHelper.m6338();
    }

    public int getCheckedIconSize() {
        return this.cardViewHelper.m6340();
    }

    public ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.m6342();
    }

    @Override // androidx.cardview.widget.a
    public int getContentPaddingBottom() {
        return this.cardViewHelper.m6309().bottom;
    }

    @Override // androidx.cardview.widget.a
    public int getContentPaddingLeft() {
        return this.cardViewHelper.m6309().left;
    }

    @Override // androidx.cardview.widget.a
    public int getContentPaddingRight() {
        return this.cardViewHelper.m6309().right;
    }

    @Override // androidx.cardview.widget.a
    public int getContentPaddingTop() {
        return this.cardViewHelper.m6309().top;
    }

    public float getProgress() {
        return this.cardViewHelper.m6348();
    }

    @Override // androidx.cardview.widget.a
    public float getRadius() {
        return this.cardViewHelper.m6345();
    }

    public ColorStateList getRippleColor() {
        return this.cardViewHelper.m6350();
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.cardViewHelper.m6352();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.cardViewHelper.m6353();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.m6339();
    }

    public int getStrokeWidth() {
        return this.cardViewHelper.m6341();
    }

    public boolean isCheckable() {
        c cVar = this.cardViewHelper;
        return cVar != null && cVar.m6322();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isDragged() {
        return this.dragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.cardViewHelper.m6329());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isDragged()) {
            View.mergeDrawableStates(onCreateDrawableState, DRAGGED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.a, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        this.cardViewHelper.m6323(getMeasuredWidth(), getMeasuredHeight());
    }

    void setAncestorContentPadding(int i5, int i6, int i7, int i8) {
        super.setContentPadding(i5, i6, i7, i8);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            if (!this.cardViewHelper.m6321()) {
                Log.i(LOG_TAG, "Setting a custom background is not supported.");
                this.cardViewHelper.m6326(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.a
    public void setCardBackgroundColor(int i5) {
        this.cardViewHelper.m6325(ColorStateList.valueOf(i5));
    }

    @Override // androidx.cardview.widget.a
    public void setCardElevation(float f5) {
        super.setCardElevation(f5);
        this.cardViewHelper.m6317();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.m6330(colorStateList);
    }

    public void setCheckable(boolean z5) {
        this.cardViewHelper.m6328(z5);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (this.checked != z5) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.cardViewHelper.m6334(drawable);
    }

    public void setCheckedIconGravity(int i5) {
        if (this.cardViewHelper.m6336() != i5) {
            this.cardViewHelper.m6343(i5);
        }
    }

    public void setCheckedIconMargin(int i5) {
        this.cardViewHelper.m6346(i5);
    }

    public void setCheckedIconMarginResource(int i5) {
        if (i5 != -1) {
            this.cardViewHelper.m6346(getResources().getDimensionPixelSize(i5));
        }
    }

    public void setCheckedIconResource(int i5) {
        this.cardViewHelper.m6334(f.a.m8475(getContext(), i5));
    }

    public void setCheckedIconSize(int i5) {
        this.cardViewHelper.m6347(i5);
    }

    public void setCheckedIconSizeResource(int i5) {
        if (i5 != 0) {
            this.cardViewHelper.m6347(getResources().getDimensionPixelSize(i5));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.cardViewHelper.m6349(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z5) {
        super.setClickable(z5);
        c cVar = this.cardViewHelper;
        if (cVar != null) {
            cVar.m6315();
        }
    }

    @Override // androidx.cardview.widget.a
    public void setContentPadding(int i5, int i6, int i7, int i8) {
        this.cardViewHelper.m6314(i5, i6, i7, i8);
    }

    public void setDragged(boolean z5) {
        if (this.dragged != z5) {
            this.dragged = z5;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.a
    public void setMaxCardElevation(float f5) {
        super.setMaxCardElevation(f5);
        this.cardViewHelper.m6318();
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.a
    public void setPreventCornerOverlap(boolean z5) {
        super.setPreventCornerOverlap(z5);
        this.cardViewHelper.m6318();
        this.cardViewHelper.m6316();
    }

    public void setProgress(float f5) {
        this.cardViewHelper.m6351(f5);
    }

    @Override // androidx.cardview.widget.a
    public void setRadius(float f5) {
        super.setRadius(f5);
        this.cardViewHelper.m6337(f5);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.cardViewHelper.m6310(colorStateList);
    }

    public void setRippleColorResource(int i5) {
        this.cardViewHelper.m6310(f.a.m8474(getContext(), i5));
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(shapeAppearanceModel.isRoundRect(getBoundsAsRectF()));
        }
        this.cardViewHelper.m6311(shapeAppearanceModel);
    }

    public void setStrokeColor(int i5) {
        setStrokeColor(ColorStateList.valueOf(i5));
    }

    public void setStrokeWidth(int i5) {
        this.cardViewHelper.m6313(i5);
        invalidate();
    }

    @Override // androidx.cardview.widget.a
    public void setUseCompatPadding(boolean z5) {
        super.setUseCompatPadding(z5);
        this.cardViewHelper.m6318();
        this.cardViewHelper.m6316();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            this.cardViewHelper.m6344(this.checked, true);
            OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.checked);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.m6325(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.cardViewHelper.m6312(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.checked = false;
        this.dragged = false;
        this.isParentCardViewDoneInitializing = true;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, com.google.android.material.R.styleable.MaterialCardView, i5, i6, new int[0]);
        c cVar = new c(this, attributeSet, i5, i6);
        this.cardViewHelper = cVar;
        cVar.m6325(super.getCardBackgroundColor());
        cVar.m6314(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.m6324(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
