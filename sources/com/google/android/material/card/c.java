package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

/* compiled from: MaterialCardViewHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c {

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private static final Drawable f5384;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static final double f5385 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: ʻ, reason: contains not printable characters */
    private final MaterialCardView f5386;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final MaterialShapeDrawable f5388;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final MaterialShapeDrawable f5389;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5390;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f5391;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f5392;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f5393;

    /* renamed from: ˊ, reason: contains not printable characters */
    private Drawable f5394;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Drawable f5395;

    /* renamed from: ˎ, reason: contains not printable characters */
    private ColorStateList f5396;

    /* renamed from: ˏ, reason: contains not printable characters */
    private ColorStateList f5397;

    /* renamed from: ˑ, reason: contains not printable characters */
    private ShapeAppearanceModel f5398;

    /* renamed from: י, reason: contains not printable characters */
    private ColorStateList f5399;

    /* renamed from: ـ, reason: contains not printable characters */
    private Drawable f5400;

    /* renamed from: ٴ, reason: contains not printable characters */
    private LayerDrawable f5401;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private MaterialShapeDrawable f5402;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private MaterialShapeDrawable f5403;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f5405;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private ValueAnimator f5406;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final TimeInterpolator f5407;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private final int f5408;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private final int f5409;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Rect f5387 = new Rect();

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean f5404 = false;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private float f5410 = 0.0f;

    /* compiled from: MaterialCardViewHelper.java */
    class a extends InsetDrawable {
        a(Drawable drawable, int i5, int i6, int i7, int i8) {
            super(drawable, i5, i6, i7, i8);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f5384 = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i5, int i6) {
        this.f5386 = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i5, i6);
        this.f5388 = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i5, R.style.CardView);
        int i7 = R.styleable.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i7)) {
            builder.setAllCornerSizes(obtainStyledAttributes.getDimension(i7, 0.0f));
        }
        this.f5389 = new MaterialShapeDrawable();
        m6311(builder.build());
        this.f5407 = MotionUtils.resolveThemeInterpolator(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f5408 = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f5409 = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private boolean m6291() {
        return this.f5386.getPreventCornerOverlap() && !m6302();
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private boolean m6292() {
        return this.f5386.getPreventCornerOverlap() && m6302() && this.f5386.getUseCompatPadding();
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private void m6293(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f5386.getForeground() instanceof InsetDrawable)) {
            this.f5386.setForeground(m6296(drawable));
        } else {
            ((InsetDrawable) this.f5386.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    private void m6294() {
        Drawable drawable;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = this.f5400) != null) {
            ((RippleDrawable) drawable).setColor(this.f5396);
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f5402;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(this.f5396);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private float m6295() {
        return Math.max(Math.max(m6297(this.f5398.getTopLeftCorner(), this.f5388.getTopLeftCornerResolvedSize()), m6297(this.f5398.getTopRightCorner(), this.f5388.getTopRightCornerResolvedSize())), Math.max(m6297(this.f5398.getBottomRightCorner(), this.f5388.getBottomRightCornerResolvedSize()), m6297(this.f5398.getBottomLeftCorner(), this.f5388.getBottomLeftCornerResolvedSize())));
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private Drawable m6296(Drawable drawable) {
        int ceil;
        int i5;
        if ((Build.VERSION.SDK_INT < 21) || this.f5386.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(m6300());
            ceil = (int) Math.ceil(m6299());
            i5 = ceil2;
        } else {
            ceil = 0;
            i5 = 0;
        }
        return new a(drawable, ceil, i5, ceil, i5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private float m6297(CornerTreatment cornerTreatment, float f5) {
        if (!(cornerTreatment instanceof RoundedCornerTreatment)) {
            if (cornerTreatment instanceof CutCornerTreatment) {
                return f5 / 2.0f;
            }
            return 0.0f;
        }
        double d6 = 1.0d - f5385;
        double d7 = f5;
        Double.isNaN(d7);
        return (float) (d6 * d7);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean m6298() {
        return (this.f5392 & 80) == 80;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private float m6299() {
        return this.f5386.getMaxCardElevation() + (m6292() ? m6295() : 0.0f);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private float m6300() {
        return (this.f5386.getMaxCardElevation() * 1.5f) + (m6292() ? m6295() : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆˆ, reason: contains not printable characters */
    public /* synthetic */ void m6301(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5395.setAlpha((int) (255.0f * floatValue));
        this.f5410 = floatValue;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean m6302() {
        return Build.VERSION.SDK_INT >= 21 && this.f5388.isRoundRect();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private Drawable m6303() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        MaterialShapeDrawable m6305 = m6305();
        this.f5402 = m6305;
        m6305.setFillColor(this.f5396);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.f5402);
        return stateListDrawable;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private Drawable m6304() {
        if (!RippleUtils.USE_FRAMEWORK_RIPPLE) {
            return m6303();
        }
        this.f5403 = m6305();
        return new RippleDrawable(this.f5396, null, this.f5403);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private MaterialShapeDrawable m6305() {
        return new MaterialShapeDrawable(this.f5398);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean m6306() {
        return (this.f5392 & 8388613) == 8388613;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private Drawable m6307() {
        if (this.f5400 == null) {
            this.f5400 = m6304();
        }
        if (this.f5401 == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f5400, this.f5389, this.f5395});
            this.f5401 = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f5401;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private float m6308() {
        if (!this.f5386.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 21 && !this.f5386.getUseCompatPadding()) {
            return 0.0f;
        }
        double d6 = 1.0d - f5385;
        double cardViewRadius = this.f5386.getCardViewRadius();
        Double.isNaN(cardViewRadius);
        return (float) (d6 * cardViewRadius);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    Rect m6309() {
        return this.f5387;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    void m6310(ColorStateList colorStateList) {
        this.f5396 = colorStateList;
        m6294();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void m6311(ShapeAppearanceModel shapeAppearanceModel) {
        this.f5398 = shapeAppearanceModel;
        this.f5388.setShapeAppearanceModel(shapeAppearanceModel);
        this.f5388.setShadowBitmapDrawingEnable(!r0.isRoundRect());
        MaterialShapeDrawable materialShapeDrawable = this.f5389;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f5403;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f5402;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    void m6312(ColorStateList colorStateList) {
        if (this.f5399 == colorStateList) {
            return;
        }
        this.f5399 = colorStateList;
        m6319();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    void m6313(int i5) {
        if (i5 == this.f5393) {
            return;
        }
        this.f5393 = i5;
        m6319();
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    void m6314(int i5, int i6, int i7, int i8) {
        this.f5387.set(i5, i6, i7, i8);
        m6316();
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    void m6315() {
        Drawable drawable = this.f5394;
        Drawable m6307 = this.f5386.isClickable() ? m6307() : this.f5389;
        this.f5394 = m6307;
        if (drawable != m6307) {
            m6293(m6307);
        }
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    void m6316() {
        int m6295 = (int) ((m6291() || m6292() ? m6295() : 0.0f) - m6308());
        MaterialCardView materialCardView = this.f5386;
        Rect rect = this.f5387;
        materialCardView.setAncestorContentPadding(rect.left + m6295, rect.top + m6295, rect.right + m6295, rect.bottom + m6295);
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    void m6317() {
        this.f5388.setElevation(this.f5386.getCardElevation());
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    void m6318() {
        if (!m6321()) {
            this.f5386.setBackgroundInternal(m6296(this.f5388));
        }
        this.f5386.setForeground(m6296(this.f5394));
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    void m6319() {
        this.f5389.setStroke(this.f5393, this.f5399);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m6320(boolean z5) {
        float f5 = z5 ? 1.0f : 0.0f;
        float f6 = z5 ? 1.0f - this.f5410 : this.f5410;
        ValueAnimator valueAnimator = this.f5406;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5406 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5410, f5);
        this.f5406 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f5383.m6301(valueAnimator2);
            }
        });
        this.f5406.setInterpolator(this.f5407);
        this.f5406.setDuration((long) ((z5 ? this.f5408 : this.f5409) * f6));
        this.f5406.start();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    boolean m6321() {
        return this.f5404;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    boolean m6322() {
        return this.f5405;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    void m6323(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if (this.f5401 != null) {
            int i10 = 0;
            if ((Build.VERSION.SDK_INT < 21) || this.f5386.getUseCompatPadding()) {
                int ceil = (int) Math.ceil(m6300() * 2.0f);
                i10 = (int) Math.ceil(m6299() * 2.0f);
                i7 = ceil;
            } else {
                i7 = 0;
            }
            int i11 = m6306() ? ((i5 - this.f5390) - this.f5391) - i10 : this.f5390;
            int i12 = m6298() ? this.f5390 : ((i6 - this.f5390) - this.f5391) - i7;
            int i13 = m6306() ? this.f5390 : ((i5 - this.f5390) - this.f5391) - i10;
            int i14 = m6298() ? ((i6 - this.f5390) - this.f5391) - i7 : this.f5390;
            if (f1.m2834(this.f5386) == 1) {
                i9 = i13;
                i8 = i11;
            } else {
                i8 = i13;
                i9 = i11;
            }
            this.f5401.setLayerInset(2, i9, i14, i8, i12);
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    void m6324(TypedArray typedArray) {
        ColorStateList colorStateList = MaterialResources.getColorStateList(this.f5386.getContext(), typedArray, R.styleable.MaterialCardView_strokeColor);
        this.f5399 = colorStateList;
        if (colorStateList == null) {
            this.f5399 = ColorStateList.valueOf(-1);
        }
        this.f5393 = typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z5 = typedArray.getBoolean(R.styleable.MaterialCardView_android_checkable, false);
        this.f5405 = z5;
        this.f5386.setLongClickable(z5);
        this.f5397 = MaterialResources.getColorStateList(this.f5386.getContext(), typedArray, R.styleable.MaterialCardView_checkedIconTint);
        m6334(MaterialResources.getDrawable(this.f5386.getContext(), typedArray, R.styleable.MaterialCardView_checkedIcon));
        m6347(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconSize, 0));
        m6346(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.f5392 = typedArray.getInteger(R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(this.f5386.getContext(), typedArray, R.styleable.MaterialCardView_rippleColor);
        this.f5396 = colorStateList2;
        if (colorStateList2 == null) {
            this.f5396 = ColorStateList.valueOf(MaterialColors.getColor(this.f5386, R.attr.colorControlHighlight));
        }
        m6330(MaterialResources.getColorStateList(this.f5386.getContext(), typedArray, R.styleable.MaterialCardView_cardForegroundColor));
        m6294();
        m6317();
        m6319();
        this.f5386.setBackgroundInternal(m6296(this.f5388));
        Drawable m6307 = this.f5386.isClickable() ? m6307() : this.f5389;
        this.f5394 = m6307;
        this.f5386.setForeground(m6296(m6307));
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m6325(ColorStateList colorStateList) {
        this.f5388.setFillColor(colorStateList);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    void m6326(boolean z5) {
        this.f5404 = z5;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void m6327() {
        Drawable drawable = this.f5400;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i5 = bounds.bottom;
            this.f5400.setBounds(bounds.left, bounds.top, bounds.right, i5 - 1);
            this.f5400.setBounds(bounds.left, bounds.top, bounds.right, i5);
        }
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    void m6328(boolean z5) {
        this.f5405 = z5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    MaterialShapeDrawable m6329() {
        return this.f5388;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m6330(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f5389;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    ColorStateList m6331() {
        return this.f5388.getFillColor();
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public void m6332(boolean z5) {
        m6344(z5, false);
    }

    /* renamed from: י, reason: contains not printable characters */
    ColorStateList m6333() {
        return this.f5389.getFillColor();
    }

    /* renamed from: יי, reason: contains not printable characters */
    void m6334(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.m2213(drawable).mutate();
            this.f5395 = mutate;
            androidx.core.graphics.drawable.a.m2210(mutate, this.f5397);
            m6332(this.f5386.isChecked());
        } else {
            this.f5395 = f5384;
        }
        LayerDrawable layerDrawable = this.f5401;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f5395);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    Drawable m6335() {
        return this.f5395;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    int m6336() {
        return this.f5392;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    void m6337(float f5) {
        m6311(this.f5398.withCornerSize(f5));
        this.f5394.invalidateSelf();
        if (m6292() || m6291()) {
            m6316();
        }
        if (m6292()) {
            m6318();
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    int m6338() {
        return this.f5390;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    ColorStateList m6339() {
        return this.f5399;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    int m6340() {
        return this.f5391;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    int m6341() {
        return this.f5393;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    ColorStateList m6342() {
        return this.f5397;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    void m6343(int i5) {
        this.f5392 = i5;
        m6323(this.f5386.getMeasuredWidth(), this.f5386.getMeasuredHeight());
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public void m6344(boolean z5, boolean z6) {
        Drawable drawable = this.f5395;
        if (drawable != null) {
            if (z6) {
                m6320(z5);
            } else {
                drawable.setAlpha(z5 ? 255 : 0);
                this.f5410 = z5 ? 1.0f : 0.0f;
            }
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    float m6345() {
        return this.f5388.getTopLeftCornerResolvedSize();
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    void m6346(int i5) {
        this.f5390 = i5;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    void m6347(int i5) {
        this.f5391 = i5;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    float m6348() {
        return this.f5388.getInterpolation();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    void m6349(ColorStateList colorStateList) {
        this.f5397 = colorStateList;
        Drawable drawable = this.f5395;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2210(drawable, colorStateList);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    ColorStateList m6350() {
        return this.f5396;
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    void m6351(float f5) {
        this.f5388.setInterpolation(f5);
        MaterialShapeDrawable materialShapeDrawable = this.f5389;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f5);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f5403;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f5);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    ShapeAppearanceModel m6352() {
        return this.f5398;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    int m6353() {
        ColorStateList colorStateList = this.f5399;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
