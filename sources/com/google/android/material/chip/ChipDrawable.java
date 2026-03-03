package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.g0;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private int alpha;
    private boolean checkable;
    private Drawable checkedIcon;
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    private Drawable chipIcon;
    private float chipIconSize;
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    private ColorStateList chipSurfaceColor;
    private Drawable closeIcon;
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    private ColorFilter colorFilter;
    private ColorStateList compatRippleColor;
    private final Context context;
    private boolean currentChecked;
    private int currentChipBackgroundColor;
    private int currentChipStrokeColor;
    private int currentChipSurfaceColor;
    private int currentCompatRippleColor;
    private int currentCompositeSurfaceBackgroundColor;
    private int currentTextColor;
    private int currentTint;
    private final Paint debugPaint;
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;
    private MotionSpec showMotionSpec;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;
    private ColorStateList tint;
    private PorterDuffColorFilter tintFilter;
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;
    private static final int[] DEFAULT_STATE = {R.attr.state_enabled};
    private static final ShapeDrawable closeIconRippleMask = new ShapeDrawable(new OvalShape());

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.chipCornerRadius = -1.0f;
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = BuildConfig.FLAVOR;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        setCloseIconState(iArr);
        this.shouldDrawText = true;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            closeIconRippleMask.setTint(-1);
        }
    }

    private void applyChildDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m2208(drawable, androidx.core.graphics.drawable.a.m2201(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.closeIcon) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            androidx.core.graphics.drawable.a.m2210(drawable, this.closeIconTint);
            return;
        }
        Drawable drawable2 = this.chipIcon;
        if (drawable == drawable2 && this.hasChipIconTint) {
            androidx.core.graphics.drawable.a.m2210(drawable2, this.chipIconTint);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void calculateChipIconBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f5 = this.chipStartPadding + this.iconStartPadding;
            float currentChipIconWidth = getCurrentChipIconWidth();
            if (androidx.core.graphics.drawable.a.m2201(this) == 0) {
                float f6 = rect.left + f5;
                rectF.left = f6;
                rectF.right = f6 + currentChipIconWidth;
            } else {
                float f7 = rect.right - f5;
                rectF.right = f7;
                rectF.left = f7 - currentChipIconWidth;
            }
            float currentChipIconHeight = getCurrentChipIconHeight();
            float exactCenterY = rect.exactCenterY() - (currentChipIconHeight / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + currentChipIconHeight;
        }
    }

    private void calculateChipTouchBounds(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (showsCloseIcon()) {
            float f5 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (androidx.core.graphics.drawable.a.m2201(this) == 0) {
                rectF.right = rect.right - f5;
            } else {
                rectF.left = rect.left + f5;
            }
        }
    }

    private void calculateCloseIconBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f5 = this.chipEndPadding + this.closeIconEndPadding;
            if (androidx.core.graphics.drawable.a.m2201(this) == 0) {
                float f6 = rect.right - f5;
                rectF.right = f6;
                rectF.left = f6 - this.closeIconSize;
            } else {
                float f7 = rect.left + f5;
                rectF.left = f7;
                rectF.right = f7 + this.closeIconSize;
            }
            float exactCenterY = rect.exactCenterY();
            float f8 = this.closeIconSize;
            float f9 = exactCenterY - (f8 / 2.0f);
            rectF.top = f9;
            rectF.bottom = f9 + f8;
        }
    }

    private void calculateCloseIconTouchBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f5 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (androidx.core.graphics.drawable.a.m2201(this) == 0) {
                float f6 = rect.right;
                rectF.right = f6;
                rectF.left = f6 - f5;
            } else {
                int i5 = rect.left;
                rectF.left = i5;
                rectF.right = i5 + f5;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void calculateTextBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.text != null) {
            float calculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            float calculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
            if (androidx.core.graphics.drawable.a.m2201(this) == 0) {
                rectF.left = rect.left + calculateChipIconWidth;
                rectF.right = rect.right - calculateCloseIconWidth;
            } else {
                rectF.left = rect.left + calculateCloseIconWidth;
                rectF.right = rect.right - calculateChipIconWidth;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean canShowCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.checkable;
    }

    public static ChipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i5, int i6) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i5, i6);
        chipDrawable.loadFromAttributes(attributeSet, i5, i6);
        return chipDrawable;
    }

    public static ChipDrawable createFromResource(Context context, int i5) {
        AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i5, "chip");
        int styleAttribute = parseDrawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, parseDrawableXml, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void drawCheckedIcon(Canvas canvas, Rect rect) {
        if (showsCheckedIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas.translate(f5, f6);
            this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.checkedIcon.draw(canvas);
            canvas.translate(-f5, -f6);
        }
    }

    private void drawChipBackground(Canvas canvas, Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipBackgroundColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.chipPaint.setColorFilter(getTintColorFilter());
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawChipIcon(Canvas canvas, Rect rect) {
        if (showsChipIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas.translate(f5, f6);
            this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.chipIcon.draw(canvas);
            canvas.translate(-f5, -f6);
        }
    }

    private void drawChipStroke(Canvas canvas, Rect rect) {
        if (this.chipStrokeWidth <= 0.0f || this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipStrokeColor);
        this.chipPaint.setStyle(Paint.Style.STROKE);
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColorFilter(getTintColorFilter());
        }
        RectF rectF = this.rectF;
        float f5 = rect.left;
        float f6 = this.chipStrokeWidth;
        rectF.set(f5 + (f6 / 2.0f), rect.top + (f6 / 2.0f), rect.right - (f6 / 2.0f), rect.bottom - (f6 / 2.0f));
        float f7 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
        canvas.drawRoundRect(this.rectF, f7, f7, this.chipPaint);
    }

    private void drawChipSurface(Canvas canvas, Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipSurfaceColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawCloseIcon(Canvas canvas, Rect rect) {
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas.translate(f5, f6);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.closeIconRipple.setBounds(this.closeIcon.getBounds());
                this.closeIconRipple.jumpToCurrentState();
                this.closeIconRipple.draw(canvas);
            } else {
                this.closeIcon.draw(canvas);
            }
            canvas.translate(-f5, -f6);
        }
    }

    private void drawCompatRipple(Canvas canvas, Rect rect) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        if (!this.isShapeThemingEnabled) {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        } else {
            calculatePathForSize(new RectF(rect), this.shapePath);
            super.drawShape(canvas, this.chipPaint, this.shapePath, getBoundsAsRectF());
        }
    }

    private void drawDebug(Canvas canvas, Rect rect) {
        Paint paint = this.debugPaint;
        if (paint != null) {
            paint.setColor(g0.m2279(-16777216, 127));
            canvas.drawRect(rect, this.debugPaint);
            if (showsChipIcon() || showsCheckedIcon()) {
                calculateChipIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            if (this.text != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            }
            if (showsCloseIcon()) {
                calculateCloseIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(g0.m2279(-65536, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(g0.m2279(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void drawText(Canvas canvas, Rect rect) {
        if (this.text != null) {
            Paint.Align calculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textDrawableHelper.getTextAppearance() != null) {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
            }
            this.textDrawableHelper.getTextPaint().setTextAlign(calculateTextOriginAndAlignment);
            int i5 = 0;
            boolean z5 = Math.round(this.textDrawableHelper.getTextWidth(getText().toString())) > Math.round(this.rectF.width());
            if (z5) {
                i5 = canvas.save();
                canvas.clipRect(this.rectF);
            }
            CharSequence charSequence = this.text;
            if (z5 && this.truncateAt != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.textDrawableHelper.getTextPaint(), this.rectF.width(), this.truncateAt);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.pointF;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.textDrawableHelper.getTextPaint());
            if (z5) {
                canvas.restoreToCount(i5);
            }
        }
    }

    private float getCurrentChipIconHeight() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float f5 = this.chipIconSize;
        if (f5 <= 0.0f && drawable != null) {
            f5 = (float) Math.ceil(ViewUtils.dpToPx(this.context, 24));
            if (drawable.getIntrinsicHeight() <= f5) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f5;
    }

    private float getCurrentChipIconWidth() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float f5 = this.chipIconSize;
        return (f5 > 0.0f || drawable == null) ? f5 : drawable.getIntrinsicWidth();
    }

    private ColorFilter getTintColorFilter() {
        ColorFilter colorFilter = this.colorFilter;
        return colorFilter != null ? colorFilter : this.tintFilter;
    }

    private static boolean hasState(int[] iArr, int i5) {
        if (iArr == null) {
            return false;
        }
        for (int i6 : iArr) {
            if (i6 == i5) {
                return true;
            }
        }
        return false;
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i5, int i6) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, com.google.android.material.R.styleable.Chip, i5, i6, new int[0]);
        this.isShapeThemingEnabled = obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        setChipSurfaceColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        int i7 = com.google.android.material.R.styleable.Chip_chipCornerRadius;
        if (obtainStyledAttributes.hasValue(i7)) {
            setChipCornerRadius(obtainStyledAttributes.getDimension(i7, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_rippleColor));
        setText(obtainStyledAttributes.getText(com.google.android.material.R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        if (Build.VERSION.SDK_INT < 23) {
            textAppearance.setTextColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textColor));
        }
        setTextAppearance(textAppearance);
        int i8 = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i8 == 1) {
            setEllipsize(TextUtils.TruncateAt.START);
        } else if (i8 == 2) {
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i8 == 3) {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        setChipIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconVisible") == null) {
            setChipIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIcon));
        int i9 = com.google.android.material.R.styleable.Chip_chipIconTint;
        if (obtainStyledAttributes.hasValue(i9)) {
            setChipIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, i9));
        }
        setChipIconSize(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconVisible") == null) {
            setCloseIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIconTint));
        setCloseIconSize(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconVisible") == null) {
            setCheckedIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIcon));
        int i10 = com.google.android.material.R.styleable.Chip_checkedIconTint;
        if (obtainStyledAttributes.hasValue(i10)) {
            setCheckedIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, i10));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    private void setChipSurfaceColor(ColorStateList colorStateList) {
        if (this.chipSurfaceColor != colorStateList) {
            this.chipSurfaceColor = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean showsCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.currentChecked;
    }

    private boolean showsChipIcon() {
        return this.chipIconVisible && this.chipIcon != null;
    }

    private boolean showsCloseIcon() {
        return this.closeIconVisible && this.closeIcon != null;
    }

    private void unapplyChildDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void updateCompatRippleColor() {
        this.compatRippleColor = this.useCompatRipple ? RippleUtils.sanitizeRippleDrawableColor(this.rippleColor) : null;
    }

    @TargetApi(21)
    private void updateFrameworkCloseIconRipple() {
        this.closeIconRipple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.closeIcon, closeIconRippleMask);
    }

    float calculateChipIconWidth() {
        if (showsChipIcon() || showsCheckedIcon()) {
            return this.iconStartPadding + getCurrentChipIconWidth() + this.iconEndPadding;
        }
        return 0.0f;
    }

    float calculateCloseIconWidth() {
        if (showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }
        return 0.0f;
    }

    Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.text != null) {
            float calculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            if (androidx.core.graphics.drawable.a.m2201(this) == 0) {
                pointF.x = rect.left + calculateChipIconWidth;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - calculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - calculateTextCenterFromBaseline();
        }
        return align;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i5 = this.alpha;
        int saveLayerAlpha = i5 < 255 ? CanvasCompat.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i5) : 0;
        drawChipSurface(canvas, bounds);
        drawChipBackground(canvas, bounds);
        if (this.isShapeThemingEnabled) {
            super.draw(canvas);
        }
        drawChipStroke(canvas, bounds);
        drawCompatRipple(canvas, bounds);
        drawChipIcon(canvas, bounds);
        drawCheckedIcon(canvas, bounds);
        if (this.shouldDrawText) {
            drawText(canvas, bounds);
        }
        drawCloseIcon(canvas, bounds);
        drawDebug(canvas, bounds);
        if (this.alpha < 255) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        return this.isShapeThemingEnabled ? getTopLeftCornerResolvedSize() : this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    public Drawable getChipIcon() {
        Drawable drawable = this.chipIcon;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.m2212(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(RectF rectF) {
        calculateChipTouchBounds(getBounds(), rectF);
    }

    public Drawable getCloseIcon() {
        Drawable drawable = this.closeIcon;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.m2212(drawable);
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(RectF rectF) {
        calculateCloseIconTouchBounds(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding + this.textDrawableHelper.getTextWidth(getText().toString()) + this.textEndPadding + calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.isShapeThemingEnabled) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        } else {
            outline.setRoundRect(bounds, this.chipCornerRadius);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    boolean isShapeThemingEnabled() {
        return this.isShapeThemingEnabled;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return isStateful(this.chipSurfaceColor) || isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor) || (this.useCompatRipple && isStateful(this.compatRippleColor)) || isStateful(this.textDrawableHelper.getTextAppearance()) || canShowCheckedIcon() || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i5) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i5);
        if (showsChipIcon()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m2208(this.chipIcon, i5);
        }
        if (showsCheckedIcon()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m2208(this.checkedIcon, i5);
        }
        if (showsCloseIcon()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m2208(this.closeIcon, i5);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        boolean onLevelChange = super.onLevelChange(i5);
        if (showsChipIcon()) {
            onLevelChange |= this.chipIcon.setLevel(i5);
        }
        if (showsCheckedIcon()) {
            onLevelChange |= this.checkedIcon.setLevel(i5);
        }
        if (showsCloseIcon()) {
            onLevelChange |= this.closeIcon.setLevel(i5);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    protected void onSizeChange() {
        Delegate delegate = this.delegate.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        if (this.isShapeThemingEnabled) {
            super.onStateChange(iArr);
        }
        return onStateChange(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (this.alpha != i5) {
            this.alpha = i5;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z5) {
        if (this.checkable != z5) {
            this.checkable = z5;
            float calculateChipIconWidth = calculateChipIconWidth();
            if (!z5 && this.currentChecked) {
                this.currentChecked = false;
            }
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(int i5) {
        setCheckable(this.context.getResources().getBoolean(i5));
    }

    public void setCheckedIcon(Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i5) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i5));
    }

    public void setCheckedIconResource(int i5) {
        setCheckedIcon(f.a.m8475(this.context, i5));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        if (this.checkedIconTint != colorStateList) {
            this.checkedIconTint = colorStateList;
            if (canShowCheckedIcon()) {
                androidx.core.graphics.drawable.a.m2210(this.checkedIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(int i5) {
        setCheckedIconTint(f.a.m8474(this.context, i5));
    }

    public void setCheckedIconVisible(int i5) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i5));
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(int i5) {
        setChipBackgroundColor(f.a.m8474(this.context, i5));
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        if (this.chipCornerRadius != f5) {
            this.chipCornerRadius = f5;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f5));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i5) {
        setChipCornerRadius(this.context.getResources().getDimension(i5));
    }

    public void setChipEndPadding(float f5) {
        if (this.chipEndPadding != f5) {
            this.chipEndPadding = f5;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(int i5) {
        setChipEndPadding(this.context.getResources().getDimension(i5));
    }

    public void setChipIcon(Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.chipIcon = drawable != null ? androidx.core.graphics.drawable.a.m2213(drawable).mutate() : null;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
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
        setChipIcon(f.a.m8475(this.context, i5));
    }

    public void setChipIconSize(float f5) {
        if (this.chipIconSize != f5) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f5;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(int i5) {
        setChipIconSize(this.context.getResources().getDimension(i5));
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        this.hasChipIconTint = true;
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                androidx.core.graphics.drawable.a.m2210(this.chipIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(int i5) {
        setChipIconTint(f.a.m8474(this.context, i5));
    }

    public void setChipIconVisible(int i5) {
        setChipIconVisible(this.context.getResources().getBoolean(i5));
    }

    public void setChipMinHeight(float f5) {
        if (this.chipMinHeight != f5) {
            this.chipMinHeight = f5;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(int i5) {
        setChipMinHeight(this.context.getResources().getDimension(i5));
    }

    public void setChipStartPadding(float f5) {
        if (this.chipStartPadding != f5) {
            this.chipStartPadding = f5;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(int i5) {
        setChipStartPadding(this.context.getResources().getDimension(i5));
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(int i5) {
        setChipStrokeColor(f.a.m8474(this.context, i5));
    }

    public void setChipStrokeWidth(float f5) {
        if (this.chipStrokeWidth != f5) {
            this.chipStrokeWidth = f5;
            this.chipPaint.setStrokeWidth(f5);
            if (this.isShapeThemingEnabled) {
                super.setStrokeWidth(f5);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(int i5) {
        setChipStrokeWidth(this.context.getResources().getDimension(i5));
    }

    public void setCloseIcon(Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float calculateCloseIconWidth = calculateCloseIconWidth();
            this.closeIcon = drawable != null ? androidx.core.graphics.drawable.a.m2213(drawable).mutate() : null;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                updateFrameworkCloseIconRipple();
            }
            float calculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (calculateCloseIconWidth != calculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        if (this.closeIconContentDescription != charSequence) {
            this.closeIconContentDescription = androidx.core.text.a.m2494().m2499(charSequence);
            invalidateSelf();
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
        if (this.closeIconEndPadding != f5) {
            this.closeIconEndPadding = f5;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(int i5) {
        setCloseIconEndPadding(this.context.getResources().getDimension(i5));
    }

    public void setCloseIconResource(int i5) {
        setCloseIcon(f.a.m8475(this.context, i5));
    }

    public void setCloseIconSize(float f5) {
        if (this.closeIconSize != f5) {
            this.closeIconSize = f5;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(int i5) {
        setCloseIconSize(this.context.getResources().getDimension(i5));
    }

    public void setCloseIconStartPadding(float f5) {
        if (this.closeIconStartPadding != f5) {
            this.closeIconStartPadding = f5;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(int i5) {
        setCloseIconStartPadding(this.context.getResources().getDimension(i5));
    }

    public boolean setCloseIconState(int[] iArr) {
        if (Arrays.equals(this.closeIconStateSet, iArr)) {
            return false;
        }
        this.closeIconStateSet = iArr;
        if (showsCloseIcon()) {
            return onStateChange(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                androidx.core.graphics.drawable.a.m2210(this.closeIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(int i5) {
        setCloseIconTint(f.a.m8474(this.context, i5));
    }

    public void setCloseIconVisible(int i5) {
        setCloseIconVisible(this.context.getResources().getBoolean(i5));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = new WeakReference<>(delegate);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.truncateAt = truncateAt;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(int i5) {
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i5));
    }

    public void setIconEndPadding(float f5) {
        if (this.iconEndPadding != f5) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f5;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(int i5) {
        setIconEndPadding(this.context.getResources().getDimension(i5));
    }

    public void setIconStartPadding(float f5) {
        if (this.iconStartPadding != f5) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f5;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(int i5) {
        setIconStartPadding(this.context.getResources().getDimension(i5));
    }

    public void setMaxWidth(int i5) {
        this.maxWidth = i5;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(int i5) {
        setRippleColor(f.a.m8474(this.context, i5));
    }

    void setShouldDrawText(boolean z5) {
        this.shouldDrawText = z5;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(int i5) {
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i5));
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
        onSizeChange();
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(int i5) {
        setTextAppearance(new TextAppearance(this.context, i5));
    }

    public void setTextColor(int i5) {
        setTextColor(ColorStateList.valueOf(i5));
    }

    public void setTextEndPadding(float f5) {
        if (this.textEndPadding != f5) {
            this.textEndPadding = f5;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(int i5) {
        setTextEndPadding(this.context.getResources().getDimension(i5));
    }

    public void setTextResource(int i5) {
        setText(this.context.getResources().getString(i5));
    }

    public void setTextSize(float f5) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f5);
            this.textDrawableHelper.getTextPaint().setTextSize(f5);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f5) {
        if (this.textStartPadding != f5) {
            this.textStartPadding = f5;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(int i5) {
        setTextStartPadding(this.context.getResources().getDimension(i5));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintList(ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z5) {
        if (this.useCompatRipple != z5) {
            this.useCompatRipple = z5;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        if (showsChipIcon()) {
            visible |= this.chipIcon.setVisible(z5, z6);
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z5, z6);
        }
        if (showsCloseIcon()) {
            visible |= this.closeIcon.setVisible(z5, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setCheckedIconVisible(boolean z5) {
        if (this.checkedIconVisible != z5) {
            boolean showsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z5;
            boolean showsCheckedIcon2 = showsCheckedIcon();
            if (showsCheckedIcon != showsCheckedIcon2) {
                if (showsCheckedIcon2) {
                    applyChildDrawable(this.checkedIcon);
                } else {
                    unapplyChildDrawable(this.checkedIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipIconVisible(boolean z5) {
        if (this.chipIconVisible != z5) {
            boolean showsChipIcon = showsChipIcon();
            this.chipIconVisible = z5;
            boolean showsChipIcon2 = showsChipIcon();
            if (showsChipIcon != showsChipIcon2) {
                if (showsChipIcon2) {
                    applyChildDrawable(this.chipIcon);
                } else {
                    unapplyChildDrawable(this.chipIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setCloseIconVisible(boolean z5) {
        if (this.closeIconVisible != z5) {
            boolean showsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z5;
            boolean showsCloseIcon2 = showsCloseIcon();
            if (showsCloseIcon != showsCloseIcon2) {
                if (showsCloseIcon2) {
                    applyChildDrawable(this.closeIcon);
                } else {
                    unapplyChildDrawable(this.closeIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }

    private boolean onStateChange(int[] iArr, int[] iArr2) {
        boolean z5;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.chipSurfaceColor;
        int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList != null ? colorStateList.getColorForState(iArr, this.currentChipSurfaceColor) : 0);
        boolean z6 = true;
        if (this.currentChipSurfaceColor != compositeElevationOverlayIfNeeded) {
            this.currentChipSurfaceColor = compositeElevationOverlayIfNeeded;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.chipBackgroundColor;
        int compositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.currentChipBackgroundColor) : 0);
        if (this.currentChipBackgroundColor != compositeElevationOverlayIfNeeded2) {
            this.currentChipBackgroundColor = compositeElevationOverlayIfNeeded2;
            onStateChange = true;
        }
        int layer = MaterialColors.layer(compositeElevationOverlayIfNeeded, compositeElevationOverlayIfNeeded2);
        if ((this.currentCompositeSurfaceBackgroundColor != layer) | (getFillColor() == null)) {
            this.currentCompositeSurfaceBackgroundColor = layer;
            setFillColor(ColorStateList.valueOf(layer));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.chipStrokeColor;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.currentChipStrokeColor) : 0;
        if (this.currentChipStrokeColor != colorForState) {
            this.currentChipStrokeColor = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.compatRippleColor == null || !RippleUtils.shouldDrawRippleCompat(iArr)) ? 0 : this.compatRippleColor.getColorForState(iArr, this.currentCompatRippleColor);
        if (this.currentCompatRippleColor != colorForState2) {
            this.currentCompatRippleColor = colorForState2;
            if (this.useCompatRipple) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.textDrawableHelper.getTextAppearance() == null || this.textDrawableHelper.getTextAppearance().getTextColor() == null) ? 0 : this.textDrawableHelper.getTextAppearance().getTextColor().getColorForState(iArr, this.currentTextColor);
        if (this.currentTextColor != colorForState3) {
            this.currentTextColor = colorForState3;
            onStateChange = true;
        }
        boolean z7 = hasState(getState(), R.attr.state_checked) && this.checkable;
        if (this.currentChecked == z7 || this.checkedIcon == null) {
            z5 = false;
        } else {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.currentChecked = z7;
            if (calculateChipIconWidth != calculateChipIconWidth()) {
                onStateChange = true;
                z5 = true;
            } else {
                onStateChange = true;
                z5 = false;
            }
        }
        ColorStateList colorStateList4 = this.tint;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.currentTint) : 0;
        if (this.currentTint != colorForState4) {
            this.currentTint = colorForState4;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, this.tintMode);
        } else {
            z6 = onStateChange;
        }
        if (isStateful(this.chipIcon)) {
            z6 |= this.chipIcon.setState(iArr);
        }
        if (isStateful(this.checkedIcon)) {
            z6 |= this.checkedIcon.setState(iArr);
        }
        if (isStateful(this.closeIcon)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z6 |= this.closeIcon.setState(iArr3);
        }
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && isStateful(this.closeIconRipple)) {
            z6 |= this.closeIconRipple.setState(iArr2);
        }
        if (z6) {
            invalidateSelf();
        }
        if (z5) {
            onSizeChange();
        }
        return z6;
    }

    private static boolean isStateful(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean isStateful(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean isStateful(TextAppearance textAppearance) {
        return (textAppearance == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) ? false : true;
    }
}
