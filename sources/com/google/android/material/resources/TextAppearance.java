package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.i;
import com.google.android.material.R;

/* loaded from: E:\78999\cookie_5123796.dex */
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;
    public final String fontFamily;
    private final int fontFamilyResourceId;
    private boolean fontResolved = false;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    private ColorStateList textColor;
    public final ColorStateList textColorHint;
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    class a extends i.f {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ TextAppearanceFontCallback f5964;

        a(TextAppearanceFontCallback textAppearanceFontCallback) {
            this.f5964 = textAppearanceFontCallback;
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: ˉ */
        public void m2128(int i5) {
            TextAppearance.this.fontResolved = true;
            this.f5964.onFontRetrievalFailed(i5);
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: ˊ */
        public void m2129(Typeface typeface) {
            TextAppearance textAppearance = TextAppearance.this;
            textAppearance.font = Typeface.create(typeface, textAppearance.textStyle);
            TextAppearance.this.fontResolved = true;
            this.f5964.onFontRetrieved(TextAppearance.this.font, false);
        }
    }

    class b extends TextAppearanceFontCallback {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Context f5966;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ TextPaint f5967;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ TextAppearanceFontCallback f5968;

        b(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
            this.f5966 = context;
            this.f5967 = textPaint;
            this.f5968 = textAppearanceFontCallback;
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i5) {
            this.f5968.onFontRetrievalFailed(i5);
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z5) {
            TextAppearance.this.updateTextPaintMeasureState(this.f5966, this.f5967, typeface);
            this.f5968.onFontRetrieved(typeface, z5);
        }
    }

    public TextAppearance(Context context, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, R.styleable.TextAppearance);
        setTextSize(obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int indexWithValue = MaterialResources.getIndexWithValue(obtainStyledAttributes, R.styleable.TextAppearance_fontFamily, R.styleable.TextAppearance_android_fontFamily);
        this.fontFamilyResourceId = obtainStyledAttributes.getResourceId(indexWithValue, 0);
        this.fontFamily = obtainStyledAttributes.getString(indexWithValue);
        this.textAllCaps = obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.hasLetterSpacing = false;
            this.letterSpacing = 0.0f;
            return;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i5, R.styleable.MaterialTextAppearance);
        int i6 = R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.hasLetterSpacing = obtainStyledAttributes2.hasValue(i6);
        this.letterSpacing = obtainStyledAttributes2.getFloat(i6, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void createFallbackFont() {
        String str;
        if (this.font == null && (str = this.fontFamily) != null) {
            this.font = Typeface.create(str, this.textStyle);
        }
        if (this.font == null) {
            int i5 = this.typeface;
            if (i5 == 1) {
                this.font = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.font = Typeface.SERIF;
            } else if (i5 != 3) {
                this.font = Typeface.DEFAULT;
            } else {
                this.font = Typeface.MONOSPACE;
            }
            this.font = Typeface.create(this.font, this.textStyle);
        }
    }

    private boolean shouldLoadFontSynchronously(Context context) {
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            return true;
        }
        int i5 = this.fontFamilyResourceId;
        return (i5 != 0 ? i.m2108(context, i5) : null) != null;
    }

    public Typeface getFallbackFont() {
        createFallbackFont();
        return this.font;
    }

    public Typeface getFont(Context context) {
        if (this.fontResolved) {
            return this.font;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m2112 = i.m2112(context, this.fontFamilyResourceId);
                this.font = m2112;
                if (m2112 != null) {
                    this.font = Typeface.create(m2112, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e5) {
                Log.d(TAG, "Error loading font " + this.fontFamily, e5);
            }
        }
        createFallbackFont();
        this.fontResolved = true;
        return this.font;
    }

    public void getFontAsync(Context context, TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            getFont(context);
        } else {
            createFallbackFont();
        }
        int i5 = this.fontFamilyResourceId;
        if (i5 == 0) {
            this.fontResolved = true;
        }
        if (this.fontResolved) {
            textAppearanceFontCallback.onFontRetrieved(this.font, true);
            return;
        }
        try {
            i.m2114(context, i5, new a(textAppearanceFontCallback), null);
        } catch (Resources.NotFoundException unused) {
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception e5) {
            Log.d(TAG, "Error loading font " + this.fontFamily, e5);
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    public ColorStateList getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
    }

    public void setTextSize(float f5) {
        this.textSize = f5;
    }

    public void updateDrawState(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f5 = this.shadowRadius;
        float f6 = this.shadowDx;
        float f7 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f5, f6, f7, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface maybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (maybeCopyWithFontWeightAdjustment != null) {
            typeface = maybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int style = this.textStyle & (typeface.getStyle() ^ (-1));
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.textSize);
        if (Build.VERSION.SDK_INT < 21 || !this.hasLetterSpacing) {
            return;
        }
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    public void getFontAsync(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new b(context, textPaint, textAppearanceFontCallback));
    }
}
