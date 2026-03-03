package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.d3;
import com.google.android.material.R;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i5) {
        int resourceId;
        ColorStateList m8474;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (m8474 = f.a.m8474(context, resourceId)) == null) ? typedArray.getColorStateList(i5) : m8474;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return Build.VERSION.SDK_INT >= 22 ? typedValue.getComplexUnit() : (typedValue.data >> 0) & 15;
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i5, int i6) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i5, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i5, i6);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i6);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i5) {
        int resourceId;
        Drawable m8475;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (m8475 = f.a.m8475(context, resourceId)) == null) ? typedArray.getDrawable(i5) : m8475;
    }

    public static float getFontScale(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int getIndexWithValue(TypedArray typedArray, int i5, int i6) {
        return typedArray.hasValue(i5) ? i5 : i6;
    }

    public static TextAppearance getTextAppearance(Context context, TypedArray typedArray, int i5) {
        int resourceId;
        if (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static int getUnscaledTextSize(Context context, int i5, int i6) {
        if (i5 == 0) {
            return i6;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, R.styleable.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(R.styleable.TextAppearance_android_textSize, typedValue);
        obtainStyledAttributes.recycle();
        return !value ? i6 : getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static boolean isFontScaleAtLeast1_3(Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_2_0;
    }

    public static ColorStateList getColorStateList(Context context, d3 d3Var, int i5) {
        int m1195;
        ColorStateList m8474;
        return (!d3Var.m1200(i5) || (m1195 = d3Var.m1195(i5, 0)) == 0 || (m8474 = f.a.m8474(context, m1195)) == null) ? d3Var.m1184(i5) : m8474;
    }
}
