package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.d3;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{android.R.attr.state_pressed}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderlineDefault;
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private ColorStateList cursorColor;
    private ColorStateList cursorErrorColor;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final s endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final v indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private androidx.transition.d placeholderFadeIn;
    private androidx.transition.d placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private ShapeAppearanceModel shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final z startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class AccessibilityDelegate extends androidx.core.view.a {
        private final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            EditText editText = this.layout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.layout.getHint();
            CharSequence error = this.layout.getError();
            CharSequence placeholderText = this.layout.getPlaceholderText();
            int counterMaxLength = this.layout.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean z5 = !TextUtils.isEmpty(text);
            boolean z6 = !TextUtils.isEmpty(hint);
            boolean z7 = !this.layout.isHintExpanded();
            boolean z8 = !TextUtils.isEmpty(error);
            boolean z9 = z8 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z6 ? hint.toString() : BuildConfig.FLAVOR;
            this.layout.startLayout.m7527(j0Var);
            if (z5) {
                j0Var.m2670(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                j0Var.m2670(charSequence);
                if (z7 && placeholderText != null) {
                    j0Var.m2670(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                j0Var.m2670(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    j0Var.m2652(charSequence);
                } else {
                    if (z5) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    j0Var.m2670(charSequence);
                }
                j0Var.m2666(!z5);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            j0Var.m2654(counterMaxLength);
            if (z9) {
                if (!z8) {
                    error = counterOverflowDescription;
                }
                j0Var.m2648(error);
            }
            View m7496 = this.layout.indicatorViewController.m7496();
            if (m7496 != null) {
                j0Var.m2653(m7496);
            }
            this.layout.endLayout.m7419().mo7353(view, j0Var);
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.layout.endLayout.m7419().mo7354(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(TextInputLayout textInputLayout, int i5);
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.endLayout.m7410();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static class e extends androidx.customview.view.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        CharSequence f6168;

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean f6169;

        class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public e[] newArray(int i5) {
                return new e[i5];
            }
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f6168) + "}";
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            TextUtils.writeToParcel(this.f6168, parcel, i5);
            parcel.writeInt(this.f6169 ? 1 : 0);
        }

        e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6168 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6169 = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            EditText editText = this.editText;
            f1.m2847(editText, f1.m2871(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), f1.m2867(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            EditText editText2 = this.editText;
            f1.m2847(editText2, f1.m2871(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), f1.m2867(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = calculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(calculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderlineDefault.setFillColor(this.editText.isFocused() ? ColorStateList.valueOf(this.defaultStrokeColor) : ColorStateList.valueOf(this.boxStrokeColor));
            this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(RectF rectF) {
        float f5 = rectF.left;
        int i5 = this.boxLabelCutoutPaddingPx;
        rectF.left = f5 - i5;
        rectF.right += i5;
    }

    private void assignBoxBackgroundByMode() {
        int i5 = this.boxBackgroundMode;
        if (i5 == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        if (i5 == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.hintEnabled || (this.boxBackground instanceof h)) {
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            } else {
                this.boxBackground = h.m7316(this.shapeAppearanceModel);
            }
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        }
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        rect2.bottom = rect.bottom;
        int i5 = this.boxBackgroundMode;
        if (i5 == 1) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, isLayoutRtl);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, isLayoutRtl);
            return rect2;
        }
        if (i5 != 2) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, isLayoutRtl);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, isLayoutRtl);
            return rect2;
        }
        rect2.left = rect.left + this.editText.getPaddingLeft();
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f5) {
        return isSingleLineFilledTextField() ? (int) (rect2.top + f5) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f5) {
        return isSingleLineFilledTextField() ? (int) (rect.centerY() - (f5 / 2.0f)) : rect.top + this.editText.getCompoundPaddingTop();
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        if (!this.hintEnabled) {
            return 0;
        }
        int i5 = this.boxBackgroundMode;
        if (i5 == 0) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
        } else {
            if (i5 != 2) {
                return 0;
            }
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((h) this.boxBackground).m7319();
        }
    }

    private void collapseHint(boolean z5) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z5 && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.m7520(false);
        this.endLayout.m7413(false);
    }

    private androidx.transition.d createPlaceholderFadeTransition() {
        androidx.transition.d dVar = new androidx.transition.d();
        dVar.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationShort2, 87));
        dVar.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return dVar;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof h);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.boxUnderlineFocused == null || (materialShapeDrawable = this.boxUnderlineDefault) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float expansionFraction = this.collapsingTextHelper.getExpansionFraction();
            int centerX = bounds2.centerX();
            bounds.left = AnimationUtils.lerp(centerX, bounds2.left, expansionFraction);
            bounds.right = AnimationUtils.lerp(centerX, bounds2.right, expansionFraction);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void expandHint(boolean z5) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z5 && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((h) this.boxBackground).m7318()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.m7520(true);
        this.endLayout.m7413(true);
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z5) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f5 = z5 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.editText;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder().setTopLeftCornerSize(f5).setTopRightCornerSize(f5).setBottomLeftCornerSize(dimensionPixelOffset).setBottomRightCornerSize(dimensionPixelOffset).build();
        EditText editText2 = this.editText;
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        createWithElevationOverlay.setShapeAppearanceModel(build);
        createWithElevationOverlay.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return createWithElevationOverlay;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView) || r.m7356(editText)) {
            return this.boxBackground;
        }
        int color = MaterialColors.getColor(this.editText, R.attr.colorControlHighlight);
        int i5 = this.boxBackgroundMode;
        if (i5 == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (i5 == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int i5, int i6, int[][] iArr) {
        int[] iArr2 = {MaterialColors.layer(i6, i5, 0.1f), i5};
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(new ColorStateList(iArr, iArr2), materialShapeDrawable, materialShapeDrawable);
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, iArr2));
        return new LayerDrawable(new Drawable[]{materialShapeDrawable, materialShapeDrawable2});
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i5, boolean z5) {
        return i5 + ((z5 || getPrefixText() == null) ? (!z5 || getSuffixText() == null) ? this.editText.getCompoundPaddingLeft() : this.endLayout.m7424() : this.startLayout.m7512());
    }

    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int i5, boolean z5) {
        return i5 - ((z5 || getSuffixText() == null) ? (!z5 || getPrefixText() == null) ? this.editText.getCompoundPaddingRight() : this.startLayout.m7512() : this.endLayout.m7424());
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable materialShapeDrawable, int i5, int[][] iArr) {
        int color = MaterialColors.getColor(context, R.attr.colorSurface, LOG_TAG);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int layer = MaterialColors.layer(i5, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{layer, 0}));
        if (Build.VERSION.SDK_INT < 21) {
            return new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable});
        }
        materialShapeDrawable2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{layer, color});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.s.m5393(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isOnError() {
        return shouldShowError() || (this.counterView != null && this.counterOverflowed);
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextActualBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
            ((h) this.boxBackground).m7321(rectF);
        }
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z5);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (Build.VERSION.SDK_INT < 21 || autoCompleteTextView.getDropDownBackground() != null) {
                return;
            }
            int i5 = this.boxBackgroundMode;
            if (i5 == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
            } else if (i5 == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i5 = this.minEms;
        if (i5 != -1) {
            setMinEms(i5);
        } else {
            setMinWidth(this.minWidth);
        }
        int i6 = this.maxEms;
        if (i6 != -1) {
            setMaxEms(i6);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 21) {
            this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
        }
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.editText.addTextChangedListener(new a());
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (i7 >= 29) {
            updateCursorColor();
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.m7477();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.m7404();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.setText(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.placeholderEnabled == z5) {
            return;
        }
        if (z5) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z5;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.m7409() || ((this.endLayout.m7378() && isEndIconVisible()) || this.endLayout.m7438() != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        androidx.transition.s.m5393(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
        announceForAccessibility(this.placeholderText);
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null) {
            int i5 = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i5 - this.boxStrokeWidthDefaultPx, rect.right, i5);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.boxUnderlineFocused;
        if (materialShapeDrawable2 != null) {
            int i6 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i6 - this.boxStrokeWidthFocusedPx, rect.right, i6);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i5, int i6, boolean z5) {
        textView.setContentDescription(context.getString(z5 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    private void updateCursorColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.cursorColor;
        if (colorStateList2 == null) {
            colorStateList2 = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorControlActivated);
        }
        EditText editText = this.editText;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable textCursorDrawable = this.editText.getTextCursorDrawable();
        if (isOnError() && (colorStateList = this.cursorErrorColor) != null) {
            colorStateList2 = colorStateList;
        }
        androidx.core.graphics.drawable.a.m2210(textCursorDrawable, colorStateList2);
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    private void updateStrokeErrorColor(boolean z5, boolean z6) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z5) {
            this.boxStrokeColor = colorForState2;
        } else if (z6) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.m7407(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i5, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    void animateToExpansionFraction(float f5) {
        if (this.collapsingTextHelper.getExpansionFraction() == f5) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.animator.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, LABEL_SCALE_ANIMATION_DURATION));
            this.animator.addUpdateListener(new d());
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f5);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.m7412();
    }

    boolean cutoutIsOpen() {
        return cutoutEnabled() && ((h) this.boxBackground).m7318();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i5) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i5);
            return;
        }
        if (this.originalHint != null) {
            boolean z5 = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i5);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i5);
        onProvideAutofillVirtualStructure(viewStructure, i5);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i6 = 0; i6 < this.inputFrame.getChildCount(); i6++) {
            View childAt = this.inputFrame.getChildAt(i6);
            ViewStructure newChild = viewStructure.newChild(i6);
            childAt.dispatchProvideAutofillStructure(newChild, i5);
            if (childAt == this.editText) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) | false : false;
        if (this.editText != null) {
            updateLabelState(f1.m2808(this) && isEnabled());
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        return editText != null ? editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop() : super.getBaseline();
    }

    MaterialShapeDrawable getBoxBackground() {
        int i5 = this.boxBackgroundMode;
        if (i5 == 1 || i5 == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endLayout.m7418();
    }

    public Drawable getEndIconDrawable() {
        return this.endLayout.m7421();
    }

    public int getEndIconMinSize() {
        return this.endLayout.m7423();
    }

    public int getEndIconMode() {
        return this.endLayout.m7425();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.m7427();
    }

    CheckableImageButton getEndIconView() {
        return this.endLayout.m7429();
    }

    public CharSequence getError() {
        if (this.indicatorViewController.m7472()) {
            return this.indicatorViewController.m7490();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.m7487();
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.m7488();
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.m7491();
    }

    public Drawable getErrorIconDrawable() {
        return this.endLayout.m7431();
    }

    public CharSequence getHelperText() {
        if (this.indicatorViewController.m7474()) {
            return this.indicatorViewController.m7494();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.m7497();
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public LengthCounter getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.m7434();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.m7436();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.startLayout.m7509();
    }

    public ColorStateList getPrefixTextColor() {
        return this.startLayout.m7511();
    }

    public TextView getPrefixTextView() {
        return this.startLayout.m7513();
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startLayout.m7514();
    }

    public Drawable getStartIconDrawable() {
        return this.startLayout.m7515();
    }

    public int getStartIconMinSize() {
        return this.startLayout.m7516();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.m7517();
    }

    public CharSequence getSuffixText() {
        return this.endLayout.m7438();
    }

    public ColorStateList getSuffixTextColor() {
        return this.endLayout.m7439();
    }

    public TextView getSuffixTextView() {
        return this.endLayout.m7426();
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.m7405();
    }

    public boolean isEndIconVisible() {
        return this.endLayout.m7406();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.m7472();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.m7499();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.m7474();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.m7408();
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.m7518();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.m7519();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.collapsingTextHelper.setExpandedTextGravity(gravity);
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.m7404();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        setError(eVar.f6168);
        if (eVar.f6169) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        boolean z5 = i5 == 1;
        if (z5 != this.areCornerRadiiRtl) {
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            ShapeAppearanceModel build = ShapeAppearanceModel.builder().setTopLeftCorner(this.shapeAppearanceModel.getTopRightCorner()).setTopRightCorner(this.shapeAppearanceModel.getTopLeftCorner()).setBottomLeftCorner(this.shapeAppearanceModel.getBottomRightCorner()).setBottomRightCorner(this.shapeAppearanceModel.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF)).setBottomRightCornerSize(this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF)).build();
            this.areCornerRadiiRtl = z5;
            setShapeAppearanceModel(build);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        if (shouldShowError()) {
            eVar.f6168 = getError();
        }
        eVar.f6169 = this.endLayout.m7420();
        return eVar;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z5) {
        this.endLayout.m7403(z5);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.m7415();
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.m7414();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.m7521();
    }

    public void removeOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.m7430(onEndIconChangedListener);
    }

    public void setBoxBackgroundColor(int i5) {
        if (this.boxBackgroundColor != i5) {
            this.boxBackgroundColor = i5;
            this.defaultFilledBackgroundColor = i5;
            this.focusedFilledBackgroundColor = i5;
            this.hoveredFilledBackgroundColor = i5;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i5) {
        setBoxBackgroundColor(androidx.core.content.a.m1991(getContext(), i5));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i5) {
        if (i5 == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i5;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i5) {
        this.boxCollapsedPaddingTopPx = i5;
    }

    public void setBoxCornerFamily(int i5) {
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCorner(i5, this.shapeAppearanceModel.getTopLeftCornerSize()).setTopRightCorner(i5, this.shapeAppearanceModel.getTopRightCornerSize()).setBottomLeftCorner(i5, this.shapeAppearanceModel.getBottomLeftCornerSize()).setBottomRightCorner(i5, this.shapeAppearanceModel.getBottomRightCornerSize()).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f5, float f6, float f7, float f8) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.areCornerRadiiRtl = isLayoutRtl;
        float f9 = isLayoutRtl ? f6 : f5;
        if (!isLayoutRtl) {
            f5 = f6;
        }
        float f10 = isLayoutRtl ? f8 : f7;
        if (!isLayoutRtl) {
            f7 = f8;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f9 && this.boxBackground.getTopRightCornerResolvedSize() == f5 && this.boxBackground.getBottomLeftCornerResolvedSize() == f10 && this.boxBackground.getBottomRightCornerResolvedSize() == f7) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f9).setTopRightCornerSize(f5).setBottomLeftCornerSize(f10).setBottomRightCornerSize(f7).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(int i5, int i6, int i7, int i8) {
        setBoxCornerRadii(getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i6), getContext().getResources().getDimension(i8), getContext().getResources().getDimension(i7));
    }

    public void setBoxStrokeColor(int i5) {
        if (this.focusedStrokeColor != i5) {
            this.focusedStrokeColor = i5;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i5) {
        this.boxStrokeWidthDefaultPx = i5;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i5) {
        this.boxStrokeWidthFocusedPx = i5;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i5) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i5));
    }

    public void setBoxStrokeWidthResource(int i5) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i5));
    }

    public void setCounterEnabled(boolean z5) {
        if (this.counterEnabled != z5) {
            if (z5) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.m7476(this.counterView, 2);
                androidx.core.view.u.m3356((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.m7473(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z5;
        }
    }

    public void setCounterMaxLength(int i5) {
        if (this.counterMaxLength != i5) {
            if (i5 > 0) {
                this.counterMaxLength = i5;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i5) {
        if (this.counterOverflowTextAppearance != i5) {
            this.counterOverflowTextAppearance = i5;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i5) {
        if (this.counterTextAppearance != i5) {
            this.counterTextAppearance = i5;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (isOnError()) {
                updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        recursiveSetEnabled(this, z5);
        super.setEnabled(z5);
    }

    public void setEndIconActivated(boolean z5) {
        this.endLayout.m7428(z5);
    }

    public void setEndIconCheckable(boolean z5) {
        this.endLayout.m7432(z5);
    }

    public void setEndIconContentDescription(int i5) {
        this.endLayout.m7433(i5);
    }

    public void setEndIconDrawable(int i5) {
        this.endLayout.m7422(i5);
    }

    public void setEndIconMinSize(int i5) {
        this.endLayout.m7379(i5);
    }

    public void setEndIconMode(int i5) {
        this.endLayout.m7380(i5);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.m7381(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.m7382(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endLayout.m7383(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.endLayout.m7384(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.m7385(mode);
    }

    public void setEndIconVisible(boolean z5) {
        this.endLayout.m7386(z5);
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.m7472()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.m7500();
        } else {
            this.indicatorViewController.m7495(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i5) {
        this.indicatorViewController.m7475(i5);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.indicatorViewController.m7489(charSequence);
    }

    public void setErrorEnabled(boolean z5) {
        this.indicatorViewController.m7478(z5);
    }

    public void setErrorIconDrawable(int i5) {
        this.endLayout.m7387(i5);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.m7389(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.m7390(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.endLayout.m7391(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.m7392(mode);
    }

    public void setErrorTextAppearance(int i5) {
        this.indicatorViewController.m7481(i5);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.m7479(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z5) {
        if (this.expandedHintEnabled != z5) {
            this.expandedHintEnabled = z5;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.m7498(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.m7485(colorStateList);
    }

    public void setHelperTextEnabled(boolean z5) {
        this.indicatorViewController.m7482(z5);
    }

    public void setHelperTextTextAppearance(int i5) {
        this.indicatorViewController.m7483(i5);
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z5) {
        this.hintAnimationEnabled = z5;
    }

    public void setHintEnabled(boolean z5) {
        if (z5 != this.hintEnabled) {
            this.hintEnabled = z5;
            if (z5) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i5) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i5);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(LengthCounter lengthCounter) {
        this.lengthCounter = lengthCounter;
    }

    public void setMaxEms(int i5) {
        this.maxEms = i5;
        EditText editText = this.editText;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxEms(i5);
    }

    public void setMaxWidth(int i5) {
        this.maxWidth = i5;
        EditText editText = this.editText;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxWidth(i5);
    }

    public void setMaxWidthResource(int i5) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    public void setMinEms(int i5) {
        this.minEms = i5;
        EditText editText = this.editText;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinEms(i5);
    }

    public void setMinWidth(int i5) {
        this.minWidth = i5;
        EditText editText = this.editText;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinWidth(i5);
    }

    public void setMinWidthResource(int i5) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i5) {
        this.endLayout.m7393(i5);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i5) {
        this.endLayout.m7395(i5);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        this.endLayout.m7397(z5);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endLayout.m7398(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endLayout.m7399(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            f1.m2843(this.placeholderTextView, 2);
            androidx.transition.d createPlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = createPlaceholderFadeTransition;
            createPlaceholderFadeTransition.setStartDelay(67L);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i5) {
        this.placeholderTextAppearance = i5;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            androidx.core.widget.c0.m3570(textView, i5);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.startLayout.m7522(charSequence);
    }

    public void setPrefixTextAppearance(int i5) {
        this.startLayout.m7523(i5);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.startLayout.m7524(colorStateList);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == shapeAppearanceModel) {
            return;
        }
        this.shapeAppearanceModel = shapeAppearanceModel;
        applyBoxAttributes();
    }

    public void setStartIconCheckable(boolean z5) {
        this.startLayout.m7526(z5);
    }

    public void setStartIconContentDescription(int i5) {
        setStartIconContentDescription(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setStartIconDrawable(int i5) {
        setStartIconDrawable(i5 != 0 ? f.a.m8475(getContext(), i5) : null);
    }

    public void setStartIconMinSize(int i5) {
        this.startLayout.m7530(i5);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.startLayout.m7531(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startLayout.m7532(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startLayout.m7533(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.startLayout.m7534(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.startLayout.m7535(mode);
    }

    public void setStartIconVisible(boolean z5) {
        this.startLayout.m7525(z5);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.endLayout.m7400(charSequence);
    }

    public void setSuffixTextAppearance(int i5) {
        this.endLayout.m7401(i5);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.endLayout.m7402(colorStateList);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void setTextAppearanceCompatWithErrorFallback(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.c0.m3570(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = com.google.android.material.R.style.TextAppearance_AppCompat_Caption
            androidx.core.widget.c0.m3570(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.R.color.design_error
            int r4 = androidx.core.content.a.m1991(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setTextAppearanceCompatWithErrorFallback(android.widget.TextView, int):void");
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            f1.m2830(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.m7486(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    boolean shouldShowError() {
        return this.indicatorViewController.m7484();
    }

    boolean updateDummyDrawables() {
        boolean z5;
        if (this.editText == null) {
            return false;
        }
        boolean z6 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m3556 = androidx.core.widget.c0.m3556(this.editText);
            Drawable drawable = m3556[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                androidx.core.widget.c0.m3565(this.editText, drawable2, m3556[1], m3556[2], m3556[3]);
                z5 = true;
            }
            z5 = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] m35562 = androidx.core.widget.c0.m3556(this.editText);
                androidx.core.widget.c0.m3565(this.editText, null, m35562[1], m35562[2], m35562[3]);
                this.startDummyDrawable = null;
                z5 = true;
            }
            z5 = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.m7426().getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton m7416 = this.endLayout.m7416();
            if (m7416 != null) {
                measuredWidth2 = measuredWidth2 + m7416.getMeasuredWidth() + androidx.core.view.u.m3354((ViewGroup.MarginLayoutParams) m7416.getLayoutParams());
            }
            Drawable[] m35563 = androidx.core.widget.c0.m3556(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 == null || this.endDummyDrawableWidth == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m35563[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawable4;
                    androidx.core.widget.c0.m3565(this.editText, m35563[0], m35563[1], drawable5, m35563[3]);
                } else {
                    z6 = z5;
                }
            } else {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.c0.m3565(this.editText, m35563[0], m35563[1], this.endDummyDrawable, m35563[3]);
            }
        } else {
            if (this.endDummyDrawable == null) {
                return z5;
            }
            Drawable[] m35564 = androidx.core.widget.c0.m3556(this.editText);
            if (m35564[2] == this.endDummyDrawable) {
                androidx.core.widget.c0.m3565(this.editText, m35564[0], m35564[1], this.originalEditTextEndDrawable, m35564[3]);
            } else {
                z6 = z5;
            }
            this.endDummyDrawable = null;
        }
        return z6;
    }

    void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (b2.m1142(background)) {
            background = background.mutate();
        }
        if (shouldShowError()) {
            background.setColorFilter(androidx.appcompat.widget.j.m1376(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(androidx.appcompat.widget.j.m1376(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.a.m2198(background);
            this.editText.refreshDrawableState();
        }
    }

    void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            f1.m2836(this.editText, getEditTextBoxBackground());
            this.boxBackgroundApplied = true;
        }
    }

    void updateLabelState(boolean z5) {
        updateLabelState(z5, false);
    }

    void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z5 = false;
        boolean z6 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
            z5 = true;
        }
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z6, z5);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z6) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z5) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z6, z5);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor();
        }
        this.endLayout.m7411();
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i5 = this.boxStrokeWidthPx;
            if (z6 && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i5) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z5 && !z6) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z6) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    private void updateLabelState(boolean z5, boolean z6) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z7 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z8 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.indicatorViewController.m7492());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(textView.getTextColors());
        } else if (z8 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z7 || !this.expandedHintEnabled || (isEnabled() && z8)) {
            if (z6 || this.hintExpanded) {
                collapseHint(z5);
                return;
            }
            return;
        }
        if (z6 || !this.hintExpanded) {
            expandHint(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(Editable editable) {
        if (this.lengthCounter.countLength(editable) != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.endLayout.m7435(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endLayout.m7437(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.endLayout.m7388(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endLayout.m7394(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endLayout.m7396(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.startLayout.m7528(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startLayout.m7529(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v66 */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i5) {
        ?? r32;
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new v(this);
        this.lengthCounter = new LengthCounter() { // from class: com.google.android.material.textfield.h0
            @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
            public final int countLength(Editable editable) {
                return TextInputLayout.lambda$new$0(editable);
            }
        };
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setPositionInterpolator(timeInterpolator);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        int[] iArr = R.styleable.TextInputLayout;
        int i7 = R.styleable.TextInputLayout_counterTextAppearance;
        int i8 = R.styleable.TextInputLayout_counterOverflowTextAppearance;
        int i9 = R.styleable.TextInputLayout_errorTextAppearance;
        int i10 = R.styleable.TextInputLayout_helperTextTextAppearance;
        int i11 = R.styleable.TextInputLayout_hintTextAppearance;
        d3 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i5, i6, i7, i8, i9, i10, i11);
        z zVar = new z(this, obtainTintedStyledAttributes);
        this.startLayout = zVar;
        this.hintEnabled = obtainTintedStyledAttributes.m1182(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(obtainTintedStyledAttributes.m1197(R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = obtainTintedStyledAttributes.m1182(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = obtainTintedStyledAttributes.m1182(R.styleable.TextInputLayout_expandedHintEnabled, true);
        int i12 = R.styleable.TextInputLayout_android_minEms;
        if (obtainTintedStyledAttributes.m1200(i12)) {
            setMinEms(obtainTintedStyledAttributes.m1192(i12, -1));
        } else {
            int i13 = R.styleable.TextInputLayout_android_minWidth;
            if (obtainTintedStyledAttributes.m1200(i13)) {
                setMinWidth(obtainTintedStyledAttributes.m1187(i13, -1));
            }
        }
        int i14 = R.styleable.TextInputLayout_android_maxEms;
        if (obtainTintedStyledAttributes.m1200(i14)) {
            setMaxEms(obtainTintedStyledAttributes.m1192(i14, -1));
        } else {
            int i15 = R.styleable.TextInputLayout_android_maxWidth;
            if (obtainTintedStyledAttributes.m1200(i15)) {
                setMaxWidth(obtainTintedStyledAttributes.m1187(i15, -1));
            }
        }
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i5, i6).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = obtainTintedStyledAttributes.m1186(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxStrokeWidthDefaultPx = obtainTintedStyledAttributes.m1187(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = obtainTintedStyledAttributes.m1187(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float m1185 = obtainTintedStyledAttributes.m1185(R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float m11852 = obtainTintedStyledAttributes.m1185(R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float m11853 = obtainTintedStyledAttributes.m1185(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float m11854 = obtainTintedStyledAttributes.m1185(R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (m1185 >= 0.0f) {
            builder.setTopLeftCornerSize(m1185);
        }
        if (m11852 >= 0.0f) {
            builder.setTopRightCornerSize(m11852);
        }
        if (m11853 >= 0.0f) {
            builder.setBottomRightCornerSize(m11853);
        }
        if (m11854 >= 0.0f) {
            builder.setBottomLeftCornerSize(m11854);
        }
        this.shapeAppearanceModel = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList m8474 = f.a.m8474(context2, R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = m8474.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = m8474.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        int i16 = R.styleable.TextInputLayout_android_textColorHint;
        if (obtainTintedStyledAttributes.m1200(i16)) {
            ColorStateList m1184 = obtainTintedStyledAttributes.m1184(i16);
            this.focusedTextColor = m1184;
            this.defaultHintTextColor = m1184;
        }
        int i17 = R.styleable.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, i17);
        this.focusedStrokeColor = obtainTintedStyledAttributes.m1183(i17, 0);
        this.defaultStrokeColor = androidx.core.content.a.m1991(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = androidx.core.content.a.m1991(context2, R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = androidx.core.content.a.m1991(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList2 != null) {
            setBoxStrokeColorStateList(colorStateList2);
        }
        int i18 = R.styleable.TextInputLayout_boxStrokeErrorColor;
        if (obtainTintedStyledAttributes.m1200(i18)) {
            setBoxStrokeErrorColor(MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, i18));
        }
        if (obtainTintedStyledAttributes.m1195(i11, -1) != -1) {
            r32 = 0;
            setHintTextAppearance(obtainTintedStyledAttributes.m1195(i11, 0));
        } else {
            r32 = 0;
        }
        this.cursorColor = obtainTintedStyledAttributes.m1184(R.styleable.TextInputLayout_cursorColor);
        this.cursorErrorColor = obtainTintedStyledAttributes.m1184(R.styleable.TextInputLayout_cursorErrorColor);
        int m1195 = obtainTintedStyledAttributes.m1195(i9, r32);
        CharSequence m1197 = obtainTintedStyledAttributes.m1197(R.styleable.TextInputLayout_errorContentDescription);
        int m1192 = obtainTintedStyledAttributes.m1192(R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean m1182 = obtainTintedStyledAttributes.m1182(R.styleable.TextInputLayout_errorEnabled, r32);
        int m11952 = obtainTintedStyledAttributes.m1195(i10, r32);
        boolean m11822 = obtainTintedStyledAttributes.m1182(R.styleable.TextInputLayout_helperTextEnabled, r32);
        CharSequence m11972 = obtainTintedStyledAttributes.m1197(R.styleable.TextInputLayout_helperText);
        int m11953 = obtainTintedStyledAttributes.m1195(R.styleable.TextInputLayout_placeholderTextAppearance, r32);
        CharSequence m11973 = obtainTintedStyledAttributes.m1197(R.styleable.TextInputLayout_placeholderText);
        boolean m11823 = obtainTintedStyledAttributes.m1182(R.styleable.TextInputLayout_counterEnabled, r32);
        setCounterMaxLength(obtainTintedStyledAttributes.m1192(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = obtainTintedStyledAttributes.m1195(i7, 0);
        this.counterOverflowTextAppearance = obtainTintedStyledAttributes.m1195(i8, 0);
        setBoxBackgroundMode(obtainTintedStyledAttributes.m1192(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(m1197);
        setErrorAccessibilityLiveRegion(m1192);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(m11952);
        setErrorTextAppearance(m1195);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(m11973);
        setPlaceholderTextAppearance(m11953);
        int i19 = R.styleable.TextInputLayout_errorTextColor;
        if (obtainTintedStyledAttributes.m1200(i19)) {
            setErrorTextColor(obtainTintedStyledAttributes.m1184(i19));
        }
        int i20 = R.styleable.TextInputLayout_helperTextTextColor;
        if (obtainTintedStyledAttributes.m1200(i20)) {
            setHelperTextColor(obtainTintedStyledAttributes.m1184(i20));
        }
        int i21 = R.styleable.TextInputLayout_hintTextColor;
        if (obtainTintedStyledAttributes.m1200(i21)) {
            setHintTextColor(obtainTintedStyledAttributes.m1184(i21));
        }
        int i22 = R.styleable.TextInputLayout_counterTextColor;
        if (obtainTintedStyledAttributes.m1200(i22)) {
            setCounterTextColor(obtainTintedStyledAttributes.m1184(i22));
        }
        int i23 = R.styleable.TextInputLayout_counterOverflowTextColor;
        if (obtainTintedStyledAttributes.m1200(i23)) {
            setCounterOverflowTextColor(obtainTintedStyledAttributes.m1184(i23));
        }
        int i24 = R.styleable.TextInputLayout_placeholderTextColor;
        if (obtainTintedStyledAttributes.m1200(i24)) {
            setPlaceholderTextColor(obtainTintedStyledAttributes.m1184(i24));
        }
        s sVar = new s(this, obtainTintedStyledAttributes);
        this.endLayout = sVar;
        boolean m11824 = obtainTintedStyledAttributes.m1182(R.styleable.TextInputLayout_android_enabled, true);
        obtainTintedStyledAttributes.m1201();
        f1.m2843(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            f1.m2844(this, 1);
        }
        frameLayout.addView(zVar);
        frameLayout.addView(sVar);
        addView(frameLayout);
        setEnabled(m11824);
        setHelperTextEnabled(m11822);
        setErrorEnabled(m1182);
        setCounterEnabled(m11823);
        setHelperText(m11972);
    }

    void updateCounter(Editable editable) {
        int countLength = this.lengthCounter.countLength(editable);
        boolean z5 = this.counterOverflowed;
        int i5 = this.counterMaxLength;
        if (i5 == -1) {
            this.counterView.setText(String.valueOf(countLength));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = countLength > i5;
            updateCounterContentDescription(getContext(), this.counterView, countLength, this.counterMaxLength, this.counterOverflowed);
            if (z5 != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(androidx.core.text.a.m2494().m2501(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(countLength), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z5 == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(int i5) {
        setHint(i5 != 0 ? getResources().getText(i5) : null);
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.updateLabelState(!r0.restoringSavedState);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.counterEnabled) {
                textInputLayout.updateCounter(editable);
            }
            if (TextInputLayout.this.placeholderEnabled) {
                TextInputLayout.this.updatePlaceholderText(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }
}
