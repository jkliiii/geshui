package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.g0;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int i5, int i6) {
        return g0.m2279(i5, (Color.alpha(i5) * i6) / 255);
    }

    public static int getColor(View view, int i5) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i5));
    }

    private static int getColorRole(int i5, int i6) {
        Hct fromInt = Hct.fromInt(i5);
        fromInt.setTone(i6);
        return fromInt.toInt();
    }

    public static ColorRoles getColorRoles(Context context, int i5) {
        return getColorRoles(i5, isLightTheme(context));
    }

    public static ColorStateList getColorStateList(Context context, int i5, ColorStateList colorStateList) {
        TypedValue resolve = MaterialAttributes.resolve(context, i5);
        ColorStateList resolveColorStateList = resolve != null ? resolveColorStateList(context, resolve) : null;
        return resolveColorStateList == null ? colorStateList : resolveColorStateList;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int i5) {
        TypedValue resolve = MaterialAttributes.resolve(context, i5);
        if (resolve == null) {
            return null;
        }
        int i6 = resolve.resourceId;
        if (i6 != 0) {
            return androidx.core.content.a.m1992(context, i6);
        }
        int i7 = resolve.data;
        if (i7 != 0) {
            return ColorStateList.valueOf(i7);
        }
        return null;
    }

    public static int getSurfaceContainerFromSeed(Context context, int i5) {
        return getColorRole(i5, isLightTheme(context) ? 94 : 12, 6);
    }

    public static int getSurfaceContainerHighFromSeed(Context context, int i5) {
        return getColorRole(i5, isLightTheme(context) ? 92 : 17, 6);
    }

    public static int harmonize(int i5, int i6) {
        return Blend.harmonize(i5, i6);
    }

    public static int harmonizeWithPrimary(Context context, int i5) {
        return harmonize(i5, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(int i5) {
        return i5 != 0 && g0.m2272(i5) > 0.5d;
    }

    static boolean isLightTheme(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
    }

    public static int layer(View view, int i5, int i6) {
        return layer(view, i5, i6, 1.0f);
    }

    private static int resolveColor(Context context, TypedValue typedValue) {
        int i5 = typedValue.resourceId;
        return i5 != 0 ? androidx.core.content.a.m1991(context, i5) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(Context context, TypedValue typedValue) {
        int i5 = typedValue.resourceId;
        return i5 != 0 ? androidx.core.content.a.m1992(context, i5) : ColorStateList.valueOf(typedValue.data);
    }

    public static ColorRoles getColorRoles(int i5, boolean z5) {
        return z5 ? new ColorRoles(getColorRole(i5, 40), getColorRole(i5, 100), getColorRole(i5, 90), getColorRole(i5, 10)) : new ColorRoles(getColorRole(i5, 80), getColorRole(i5, 20), getColorRole(i5, 30), getColorRole(i5, 90));
    }

    public static int layer(View view, int i5, int i6, float f5) {
        return layer(getColor(view, i5), getColor(view, i6), f5);
    }

    public static int getColor(Context context, int i5, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i5, str));
    }

    private static int getColorRole(int i5, int i6, int i7) {
        Hct fromInt = Hct.fromInt(getColorRole(i5, i6));
        fromInt.setChroma(i7);
        return fromInt.toInt();
    }

    public static int layer(int i5, int i6, float f5) {
        return layer(i5, g0.m2279(i6, Math.round(Color.alpha(i6) * f5)));
    }

    public static int getColor(View view, int i5, int i6) {
        return getColor(view.getContext(), i5, i6);
    }

    public static int getColor(Context context, int i5, int i6) {
        TypedValue resolve = MaterialAttributes.resolve(context, i5);
        return resolve != null ? resolveColor(context, resolve) : i6;
    }

    public static int layer(int i5, int i6) {
        return g0.m2275(i6, i5);
    }
}
