package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c {

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static final boolean f5361;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static final boolean f5362;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final MaterialButton f5363;

    /* renamed from: ʼ, reason: contains not printable characters */
    private ShapeAppearanceModel f5364;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f5365;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f5366;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5367;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f5368;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f5369;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f5370;

    /* renamed from: ˊ, reason: contains not printable characters */
    private PorterDuff.Mode f5371;

    /* renamed from: ˋ, reason: contains not printable characters */
    private ColorStateList f5372;

    /* renamed from: ˎ, reason: contains not printable characters */
    private ColorStateList f5373;

    /* renamed from: ˏ, reason: contains not printable characters */
    private ColorStateList f5374;

    /* renamed from: ˑ, reason: contains not printable characters */
    private Drawable f5375;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f5379;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private LayerDrawable f5381;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f5382;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f5376 = false;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f5377 = false;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f5378 = false;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f5380 = true;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f5361 = i5 >= 21;
        f5362 = i5 >= 21 && i5 <= 22;
    }

    c(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.f5363 = materialButton;
        this.f5364 = shapeAppearanceModel;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Drawable m6251() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f5364);
        materialShapeDrawable.initializeElevationOverlay(this.f5363.getContext());
        androidx.core.graphics.drawable.a.m2210(materialShapeDrawable, this.f5372);
        PorterDuff.Mode mode = this.f5371;
        if (mode != null) {
            androidx.core.graphics.drawable.a.m2211(materialShapeDrawable, mode);
        }
        materialShapeDrawable.setStroke(this.f5370, this.f5373);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f5364);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.f5370, this.f5376 ? MaterialColors.getColor(this.f5363, R.attr.colorSurface) : 0);
        if (f5361) {
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f5364);
            this.f5375 = materialShapeDrawable3;
            androidx.core.graphics.drawable.a.m2209(materialShapeDrawable3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f5374), m6256(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.f5375);
            this.f5381 = rippleDrawable;
            return rippleDrawable;
        }
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.f5364);
        this.f5375 = rippleDrawableCompat;
        androidx.core.graphics.drawable.a.m2210(rippleDrawableCompat, RippleUtils.sanitizeRippleDrawableColor(this.f5374));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.f5375});
        this.f5381 = layerDrawable;
        return m6256(layerDrawable);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m6252(int i5, int i6) {
        int m2871 = f1.m2871(this.f5363);
        int paddingTop = this.f5363.getPaddingTop();
        int m2867 = f1.m2867(this.f5363);
        int paddingBottom = this.f5363.getPaddingBottom();
        int i7 = this.f5367;
        int i8 = this.f5368;
        this.f5368 = i6;
        this.f5367 = i5;
        if (!this.f5377) {
            m6258();
        }
        f1.m2847(this.f5363, m2871, (paddingTop + i5) - i7, m2867, (paddingBottom + i6) - i8);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m6253(ShapeAppearanceModel shapeAppearanceModel) {
        if (f5362 && !this.f5377) {
            int m2871 = f1.m2871(this.f5363);
            int paddingTop = this.f5363.getPaddingTop();
            int m2867 = f1.m2867(this.f5363);
            int paddingBottom = this.f5363.getPaddingBottom();
            m6258();
            f1.m2847(this.f5363, m2871, paddingTop, m2867, paddingBottom);
            return;
        }
        if (m6267() != null) {
            m6267().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (m6257() != null) {
            m6257().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (m6265() != null) {
            m6265().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private MaterialShapeDrawable m6254(boolean z5) {
        LayerDrawable layerDrawable = this.f5381;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f5361 ? (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f5381.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0) : (MaterialShapeDrawable) this.f5381.getDrawable(!z5 ? 1 : 0);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private void m6255() {
        MaterialShapeDrawable m6267 = m6267();
        MaterialShapeDrawable m6257 = m6257();
        if (m6267 != null) {
            m6267.setStroke(this.f5370, this.f5373);
            if (m6257 != null) {
                m6257.setStroke(this.f5370, this.f5376 ? MaterialColors.getColor(this.f5363, R.attr.colorSurface) : 0);
            }
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private InsetDrawable m6256(Drawable drawable) {
        return new InsetDrawable(drawable, this.f5365, this.f5367, this.f5366, this.f5368);
    }

    /* renamed from: י, reason: contains not printable characters */
    private MaterialShapeDrawable m6257() {
        return m6254(true);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private void m6258() {
        this.f5363.setInternalBackground(m6251());
        MaterialShapeDrawable m6267 = m6267();
        if (m6267 != null) {
            m6267.setElevation(this.f5382);
            m6267.setState(this.f5363.getDrawableState());
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    void m6259(int i5) {
        if (this.f5370 != i5) {
            this.f5370 = i5;
            m6255();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    int m6260() {
        return this.f5369;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    void m6261(PorterDuff.Mode mode) {
        if (this.f5371 != mode) {
            this.f5371 = mode;
            if (m6267() == null || this.f5371 == null) {
                return;
            }
            androidx.core.graphics.drawable.a.m2211(m6267(), this.f5371);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m6262() {
        return this.f5368;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    void m6263(ColorStateList colorStateList) {
        if (this.f5372 != colorStateList) {
            this.f5372 = colorStateList;
            if (m6267() != null) {
                androidx.core.graphics.drawable.a.m2210(m6267(), this.f5372);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m6264() {
        return this.f5367;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Shapeable m6265() {
        LayerDrawable layerDrawable = this.f5381;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f5381.getNumberOfLayers() > 2 ? (Shapeable) this.f5381.getDrawable(2) : (Shapeable) this.f5381.getDrawable(1);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    void m6266(boolean z5) {
        this.f5380 = z5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    MaterialShapeDrawable m6267() {
        return m6254(false);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    ColorStateList m6268() {
        return this.f5374;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    void m6269(int i5, int i6) {
        Drawable drawable = this.f5375;
        if (drawable != null) {
            drawable.setBounds(this.f5365, this.f5367, i6 - this.f5366, i5 - this.f5368);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    ShapeAppearanceModel m6270() {
        return this.f5364;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    ColorStateList m6271() {
        return this.f5373;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    int m6272() {
        return this.f5370;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    ColorStateList m6273() {
        return this.f5372;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    PorterDuff.Mode m6274() {
        return this.f5371;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    boolean m6275() {
        return this.f5377;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    boolean m6276() {
        return this.f5379;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    boolean m6277() {
        return this.f5380;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    void m6278(boolean z5) {
        this.f5376 = z5;
        m6255();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m6279(TypedArray typedArray) {
        this.f5365 = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.f5366 = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.f5367 = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.f5368 = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        int i5 = R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i5)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i5, -1);
            this.f5369 = dimensionPixelSize;
            m6288(this.f5364.withCornerSize(dimensionPixelSize));
            this.f5378 = true;
        }
        this.f5370 = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.f5371 = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f5372 = MaterialResources.getColorStateList(this.f5363.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.f5373 = MaterialResources.getColorStateList(this.f5363.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.f5374 = MaterialResources.getColorStateList(this.f5363.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.f5379 = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.f5382 = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        this.f5380 = typedArray.getBoolean(R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int m2871 = f1.m2871(this.f5363);
        int paddingTop = this.f5363.getPaddingTop();
        int m2867 = f1.m2867(this.f5363);
        int paddingBottom = this.f5363.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            m6282();
        } else {
            m6258();
        }
        f1.m2847(this.f5363, m2871 + this.f5365, paddingTop + this.f5367, m2867 + this.f5366, paddingBottom + this.f5368);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    void m6280(ColorStateList colorStateList) {
        if (this.f5373 != colorStateList) {
            this.f5373 = colorStateList;
            m6255();
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m6281(int i5) {
        if (m6267() != null) {
            m6267().setTint(i5);
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m6282() {
        this.f5377 = true;
        this.f5363.setSupportBackgroundTintList(this.f5372);
        this.f5363.setSupportBackgroundTintMode(this.f5371);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m6283(boolean z5) {
        this.f5379 = z5;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m6284(int i5) {
        if (this.f5378 && this.f5369 == i5) {
            return;
        }
        this.f5369 = i5;
        this.f5378 = true;
        m6288(this.f5364.withCornerSize(i5));
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m6285(int i5) {
        m6252(this.f5367, i5);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m6286(int i5) {
        m6252(i5, this.f5368);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m6287(ColorStateList colorStateList) {
        if (this.f5374 != colorStateList) {
            this.f5374 = colorStateList;
            boolean z5 = f5361;
            if (z5 && (this.f5363.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f5363.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            } else {
                if (z5 || !(this.f5363.getBackground() instanceof RippleDrawableCompat)) {
                    return;
                }
                ((RippleDrawableCompat) this.f5363.getBackground()).setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    void m6288(ShapeAppearanceModel shapeAppearanceModel) {
        this.f5364 = shapeAppearanceModel;
        m6253(shapeAppearanceModel);
    }
}
