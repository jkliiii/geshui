package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    private static final String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final String RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.RadioButton";
    private static final String TAG = "Chip";
    private CharSequence accessibilityClassName;
    private ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final TextAppearanceFontCallback fontCallback;
    private InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;
    private int minTouchTargetSize;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListenerInternal;
    private View.OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    private RippleDrawable ripple;
    private final c touchHelper;
    private boolean touchHelperEnabled;
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Chip_Action;
    private static final Rect EMPTY_BOUNDS = new Rect();
    private static final int[] SELECTED_STATE = {android.R.attr.state_selected};
    private static final int[] CHECKABLE_STATE_SET = {android.R.attr.state_checkable};

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.chipDrawable != null) {
                Chip.this.chipDrawable.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends a0.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // a0.a
        /* renamed from: ʻʻ */
        protected void mo24(int i5, j0 j0Var) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i5 != 1) {
                j0Var.m2645(BuildConfig.FLAVOR);
                j0Var.m2703(Chip.EMPTY_BOUNDS);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                j0Var.m2645(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i6 = R.string.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                j0Var.m2645(context.getString(i6, objArr).trim());
            }
            j0Var.m2703(Chip.this.getCloseIconTouchBoundsInt());
            j0Var.m2662(j0.a.f2869);
            j0Var.m2647(Chip.this.isEnabled());
        }

        @Override // a0.a
        /* renamed from: ʽʽ */
        protected void mo27(int i5, boolean z5) {
            if (i5 == 1) {
                Chip.this.closeIconFocused = z5;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // a0.a
        /* renamed from: ـ */
        protected int mo34(float f5, float f6) {
            return (Chip.this.hasCloseIcon() && Chip.this.getCloseIconTouchBounds().contains(f5, f6)) ? 1 : 0;
        }

        @Override // a0.a
        /* renamed from: ٴ */
        protected void mo35(List<Integer> list) {
            list.add(0);
            if (Chip.this.hasCloseIcon() && Chip.this.isCloseIconVisible() && Chip.this.onCloseIconClickListener != null) {
                list.add(1);
            }
        }

        @Override // a0.a
        /* renamed from: ᴵᴵ */
        protected void mo38(j0 j0Var) {
            j0Var.m2639(Chip.this.isCheckable());
            j0Var.m2642(Chip.this.isClickable());
            j0Var.m2641(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                j0Var.m2670(text);
            } else {
                j0Var.m2645(text);
            }
        }

        @Override // a0.a
        /* renamed from: ﾞ */
        protected boolean mo42(int i5, int i6, Bundle bundle) {
            if (i6 != 16) {
                return false;
            }
            if (i5 == 0) {
                return Chip.this.performClick();
            }
            if (i5 == 1) {
                return Chip.this.performCloseIconClick();
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void applyChipDrawable(ChipDrawable chipDrawable) {
        chipDrawable.setDelegate(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] createCloseIconDrawableState() {
        ?? isEnabled = isEnabled();
        int i5 = isEnabled;
        if (this.closeIconFocused) {
            i5 = isEnabled + 1;
        }
        int i6 = i5;
        if (this.closeIconHovered) {
            i6 = i5 + 1;
        }
        int i7 = i6;
        if (this.closeIconPressed) {
            i7 = i6 + 1;
        }
        int i8 = i7;
        if (isChecked()) {
            i8 = i7 + 1;
        }
        int[] iArr = new int[i8];
        int i9 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i9 = 1;
        }
        if (this.closeIconFocused) {
            iArr[i9] = 16842908;
            i9++;
        }
        if (this.closeIconHovered) {
            iArr[i9] = 16843623;
            i9++;
        }
        if (this.closeIconPressed) {
            iArr[i9] = 16842919;
            i9++;
        }
        if (isChecked()) {
            iArr[i9] = 16842913;
        }
        return iArr;
    }

    private void ensureChipDrawableHasCallback() {
        if (getBackgroundDrawable() == this.insetBackgroundDrawable && this.chipDrawable.getCallback() == null) {
            this.chipDrawable.setCallback(this.insetBackgroundDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.rectF.setEmpty();
        if (hasCloseIcon() && this.onCloseIconClickListener != null) {
            this.chipDrawable.getCloseIconTouchBounds(this.rectF);
        }
        return this.rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.rect;
    }

    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getTextAppearance();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasCloseIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return (chipDrawable == null || chipDrawable.getCloseIcon() == null) ? false : true;
    }

    private void initMinTouchTarget(Context context, AttributeSet attributeSet, int i5) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Chip, i5, DEF_STYLE_RES, new int[0]);
        this.ensureMinTouchTargetSize = obtainStyledAttributes.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.minTouchTargetSize = (int) Math.ceil(obtainStyledAttributes.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        obtainStyledAttributes.recycle();
    }

    private void initOutlineProvider() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void insetChipBackgroundDrawable(int i5, int i6, int i7, int i8) {
        this.insetBackgroundDrawable = new InsetDrawable((Drawable) this.chipDrawable, i5, i6, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(CompoundButton compoundButton, boolean z5) {
        MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener = this.onCheckedChangeListenerInternal;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z5);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = this.onCheckedChangeListener;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged(compoundButton, z5);
        }
    }

    private void removeBackgroundInset() {
        if (this.insetBackgroundDrawable != null) {
            this.insetBackgroundDrawable = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            updateBackgroundDrawable();
        }
    }

    private void setCloseIconHovered(boolean z5) {
        if (this.closeIconHovered != z5) {
            this.closeIconHovered = z5;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z5) {
        if (this.closeIconPressed != z5) {
            this.closeIconPressed = z5;
            refreshDrawableState();
        }
    }

    private void unapplyChipDrawable(ChipDrawable chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.setDelegate(null);
        }
    }

    private void updateAccessibilityDelegate() {
        if (hasCloseIcon() && isCloseIconVisible() && this.onCloseIconClickListener != null) {
            f1.m2830(this, this.touchHelper);
            this.touchHelperEnabled = true;
        } else {
            f1.m2830(this, null);
            this.touchHelperEnabled = false;
        }
    }

    private void updateBackgroundDrawable() {
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            updateFrameworkRippleBackground();
            return;
        }
        this.chipDrawable.setUseCompatRipple(true);
        f1.m2836(this, getBackgroundDrawable());
        updatePaddingInternal();
        ensureChipDrawableHasCallback();
    }

    private void updateFrameworkRippleBackground() {
        this.ripple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.chipDrawable.getRippleColor()), getBackgroundDrawable(), null);
        this.chipDrawable.setUseCompatRipple(false);
        f1.m2836(this, this.ripple);
        updatePaddingInternal();
    }

    private void updatePaddingInternal() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.chipDrawable) == null) {
            return;
        }
        int chipEndPadding = (int) (chipDrawable.getChipEndPadding() + this.chipDrawable.getTextEndPadding() + this.chipDrawable.calculateCloseIconWidth());
        int chipStartPadding = (int) (this.chipDrawable.getChipStartPadding() + this.chipDrawable.getTextStartPadding() + this.chipDrawable.calculateChipIconWidth());
        if (this.insetBackgroundDrawable != null) {
            Rect rect = new Rect();
            this.insetBackgroundDrawable.getPadding(rect);
            chipStartPadding += rect.left;
            chipEndPadding += rect.right;
        }
        f1.m2847(this, chipStartPadding, getPaddingTop(), chipEndPadding, getPaddingBottom());
    }

    private void updateTextPaintDrawState() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.updateDrawState(getContext(), paint, this.fontCallback);
        }
    }

    private void validateAttributes(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "background") != null) {
            Log.w(TAG, "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue(NAMESPACE_ANDROID, "singleLine", true) || attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "lines", 1) != 1 || attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "minLines", 1) != 1 || attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "gravity", 8388627) != 8388627) {
            Log.w(TAG, "Chip text must be vertically center and start aligned");
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.touchHelperEnabled ? super.dispatchHoverEvent(motionEvent) : this.touchHelper.m30(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.touchHelperEnabled) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.touchHelper.m31(keyEvent) || this.touchHelper.m33() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.chipDrawable;
        if ((chipDrawable == null || !chipDrawable.isCloseIconStateful()) ? false : this.chipDrawable.setCloseIconState(createCloseIconDrawableState())) {
            invalidate();
        }
    }

    public boolean ensureAccessibleTouchTarget(int i5) {
        this.minTouchTargetSize = i5;
        if (!shouldEnsureMinTouchTargetSize()) {
            if (this.insetBackgroundDrawable != null) {
                removeBackgroundInset();
            } else {
                updateBackgroundDrawable();
            }
            return false;
        }
        int max = Math.max(0, i5 - this.chipDrawable.getIntrinsicHeight());
        int max2 = Math.max(0, i5 - this.chipDrawable.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.insetBackgroundDrawable != null) {
                removeBackgroundInset();
            } else {
                updateBackgroundDrawable();
            }
            return false;
        }
        int i6 = max2 > 0 ? max2 / 2 : 0;
        int i7 = max > 0 ? max / 2 : 0;
        if (this.insetBackgroundDrawable != null) {
            Rect rect = new Rect();
            this.insetBackgroundDrawable.getPadding(rect);
            if (rect.top == i7 && rect.bottom == i7 && rect.left == i6 && rect.right == i6) {
                updateBackgroundDrawable();
                return true;
            }
        }
        if (getMinHeight() != i5) {
            setMinHeight(i5);
        }
        if (getMinWidth() != i5) {
            setMinWidth(i5);
        }
        insetChipBackgroundDrawable(i6, i7, i6, i7);
        updateBackgroundDrawable();
        return true;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.accessibilityClassName)) {
            return this.accessibilityClassName;
        }
        if (!isCheckable()) {
            return isClickable() ? BUTTON_ACCESSIBILITY_CLASS_NAME : GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME;
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).isSingleSelection()) ? RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME : BUTTON_ACCESSIBILITY_CLASS_NAME;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.insetBackgroundDrawable;
        return insetDrawable == null ? this.chipDrawable : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIcon();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIconTint();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipBackgroundColor();
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.getChipCornerRadius());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.chipDrawable;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipEndPadding();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipIcon();
        }
        return null;
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconSize();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconTint();
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipMinHeight();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeColor();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeWidth();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIcon();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconContentDescription();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconSize();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconTint();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getEllipsize();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.touchHelperEnabled && (this.touchHelper.m33() == 1 || this.touchHelper.m32() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getHideMotionSpec();
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getIconEndPadding();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getIconStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getRippleColor();
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.chipDrawable.getShapeAppearanceModel();
    }

    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getShowMotionSpec();
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getTextEndPadding();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getTextStartPadding();
        }
        return 0.0f;
    }

    public boolean isCheckable() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isCheckable();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isCloseIconVisible();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.chipDrawable);
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, SELECTED_STATE);
        }
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z5, int i5, Rect rect) {
        super.onFocusChanged(z5, i5, rect);
        if (this.touchHelperEnabled) {
            this.touchHelper.m41(z5, i5, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            j0.m2620(accessibilityNodeInfo).m2644(j0.c.m2711(chipGroup.getRowIndex(this), 1, chipGroup.isSingleLine() ? chipGroup.getIndexOfChip(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i5) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i5);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        if (this.lastLayoutDirection != i5) {
            this.lastLayoutDirection = i5;
            updatePaddingInternal();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.closeIconPressed
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r3)
            goto L3e
        L2b:
            boolean r0 = r5.closeIconPressed
            if (r0 == 0) goto L34
            r5.performCloseIconClick()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = 0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performCloseIconClick() {
        boolean z5 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.onCloseIconClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z5 = true;
        }
        if (this.touchHelperEnabled) {
            this.touchHelper.m29(1, 1);
        }
        return z5;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.accessibilityClassName = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.ripple) {
            super.setBackground(drawable);
        } else {
            Log.w(TAG, "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        Log.w(TAG, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.ripple) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(TAG, "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i5) {
        Log.w(TAG, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w(TAG, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w(TAG, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckable(z5);
        }
    }

    public void setCheckableResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckableResource(i5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            this.deferredCheckedValue = z5;
        } else if (chipDrawable.isCheckable()) {
            super.setChecked(z5);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIcon(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i5) {
        setCheckedIconVisible(i5);
    }

    public void setCheckedIconResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconResource(i5);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTint(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTintResource(i5);
        }
    }

    public void setCheckedIconVisible(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(i5);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColor(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColorResource(i5);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadius(f5);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadiusResource(i5);
        }
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.chipDrawable;
        if (chipDrawable2 != chipDrawable) {
            unapplyChipDrawable(chipDrawable2);
            this.chipDrawable = chipDrawable;
            chipDrawable.setShouldDrawText(false);
            applyChipDrawable(this.chipDrawable);
            ensureAccessibleTouchTarget(this.minTouchTargetSize);
        }
    }

    public void setChipEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPadding(f5);
        }
    }

    public void setChipEndPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPaddingResource(i5);
        }
    }

    public void setChipIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIcon(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i5) {
        setChipIconVisible(i5);
    }

    public void setChipIconResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconResource(i5);
        }
    }

    public void setChipIconSize(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSize(f5);
        }
    }

    public void setChipIconSizeResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSizeResource(i5);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTint(colorStateList);
        }
    }

    public void setChipIconTintResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTintResource(i5);
        }
    }

    public void setChipIconVisible(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(i5);
        }
    }

    public void setChipMinHeight(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeight(f5);
        }
    }

    public void setChipMinHeightResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeightResource(i5);
        }
    }

    public void setChipStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPadding(f5);
        }
    }

    public void setChipStartPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPaddingResource(i5);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColor(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColorResource(i5);
        }
    }

    public void setChipStrokeWidth(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidth(f5);
        }
    }

    public void setChipStrokeWidthResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidthResource(i5);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i5) {
        setText(getResources().getString(i5));
    }

    public void setCloseIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIcon(drawable);
        }
        updateAccessibilityDelegate();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconContentDescription(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i5) {
        setCloseIconVisible(i5);
    }

    public void setCloseIconEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPadding(f5);
        }
    }

    public void setCloseIconEndPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPaddingResource(i5);
        }
    }

    public void setCloseIconResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconResource(i5);
        }
        updateAccessibilityDelegate();
    }

    public void setCloseIconSize(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSize(f5);
        }
    }

    public void setCloseIconSizeResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSizeResource(i5);
        }
    }

    public void setCloseIconStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPadding(f5);
        }
    }

    public void setCloseIconStartPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPaddingResource(i5);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTint(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTintResource(i5);
        }
    }

    public void setCloseIconVisible(int i5) {
        setCloseIconVisible(getResources().getBoolean(i5));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setElevation(f5);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.chipDrawable == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setEllipsize(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.ensureMinTouchTargetSize = z5;
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
    }

    @Override // android.widget.TextView
    public void setGravity(int i5) {
        if (i5 != 8388627) {
            Log.w(TAG, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i5);
        }
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpec(motionSpec);
        }
    }

    public void setHideMotionSpecResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpecResource(i5);
        }
    }

    public void setIconEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPadding(f5);
        }
    }

    public void setIconEndPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPaddingResource(i5);
        }
    }

    public void setIconStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPadding(f5);
        }
    }

    public void setIconStartPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPaddingResource(i5);
        }
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    public void setInternalOnCheckedChangeListener(MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.onCheckedChangeListenerInternal = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        if (this.chipDrawable == null) {
            return;
        }
        super.setLayoutDirection(i5);
    }

    @Override // android.widget.TextView
    public void setLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i5) {
        super.setMaxWidth(i5);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setMaxWidth(i5);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i5);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.onCloseIconClickListener = onClickListener;
        updateAccessibilityDelegate();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setRippleColor(colorStateList);
        }
        if (this.chipDrawable.getUseCompatRipple()) {
            return;
        }
        updateFrameworkRippleBackground();
    }

    public void setRippleColorResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setRippleColorResource(i5);
            if (this.chipDrawable.getUseCompatRipple()) {
                return;
            }
            updateFrameworkRippleBackground();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.chipDrawable.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpec(motionSpec);
        }
    }

    public void setShowMotionSpecResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpecResource(i5);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z5);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(chipDrawable.shouldDrawText() ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.chipDrawable;
        if (chipDrawable2 != null) {
            chipDrawable2.setText(charSequence);
        }
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearance(textAppearance);
        }
        updateTextPaintDrawState();
    }

    public void setTextAppearanceResource(int i5) {
        setTextAppearance(getContext(), i5);
    }

    public void setTextEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPadding(f5);
        }
    }

    public void setTextEndPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPaddingResource(i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i5, float f5) {
        super.setTextSize(i5, f5);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextSize(TypedValue.applyDimension(i5, f5, getResources().getDisplayMetrics()));
        }
        updateTextPaintDrawState();
    }

    public void setTextStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPadding(f5);
        }
    }

    public void setTextStartPaddingResource(int i5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPaddingResource(i5);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconVisible(z5);
        }
        updateAccessibilityDelegate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.rect = new Rect();
        this.rectF = new RectF();
        this.fontCallback = new a();
        Context context2 = getContext();
        validateAttributes(attributeSet);
        ChipDrawable createFromAttributes = ChipDrawable.createFromAttributes(context2, attributeSet, i5, i6);
        initMinTouchTarget(context2, attributeSet, i5);
        setChipDrawable(createFromAttributes);
        createFromAttributes.setElevation(f1.m2904(this));
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.Chip, i5, i6, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.Chip_android_textColor));
        }
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.Chip_shapeAppearance);
        obtainStyledAttributes.recycle();
        this.touchHelper = new c(this);
        updateAccessibilityDelegate();
        if (!hasValue) {
            initOutlineProvider();
        }
        setChecked(this.deferredCheckedValue);
        setText(createFromAttributes.getText());
        setEllipsize(createFromAttributes.getEllipsize());
        updateTextPaintDrawState();
        if (!this.chipDrawable.shouldDrawText()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        updatePaddingInternal();
        if (shouldEnsureMinTouchTargetSize()) {
            setMinHeight(this.minTouchTargetSize);
        }
        this.lastLayoutDirection = f1.m2834(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                this.f5467.lambda$new$0(compoundButton, z5);
            }
        });
    }

    public void setCheckedIconVisible(boolean z5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(z5);
        }
    }

    public void setChipIconVisible(boolean z5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(z5);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i5);
        }
        updateTextPaintDrawState();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i5) {
        super.setTextAppearance(i5);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i5);
        }
        updateTextPaintDrawState();
    }

    class a extends TextAppearanceFontCallback {
        a() {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z5) {
            Chip chip = Chip.this;
            chip.setText(chip.chipDrawable.shouldDrawText() ? Chip.this.chipDrawable.getText() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i5) {
        }
    }
}
