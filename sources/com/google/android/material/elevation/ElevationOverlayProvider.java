package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.core.graphics.g0;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(int i5) {
        return g0.m2279(i5, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f5) {
        return Math.round(calculateOverlayAlphaFraction(f5) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f5) {
        if (this.displayDensity <= 0.0f || f5 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f5 / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i5, float f5, View view) {
        return compositeOverlay(i5, f5 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayIfNeeded(int i5, float f5, View view) {
        return compositeOverlayIfNeeded(i5, f5 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f5, View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f5 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int compositeOverlay(int i5, float f5) {
        int i6;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f5);
        int alpha = Color.alpha(i5);
        int layer = MaterialColors.layer(g0.m2279(i5, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i6 = this.elevationOverlayAccentColor) != 0) {
            layer = MaterialColors.layer(layer, g0.m2279(i6, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return g0.m2279(layer, alpha);
    }

    public int compositeOverlayIfNeeded(int i5, float f5) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i5)) ? compositeOverlay(i5, f5) : i5;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f5) {
        return compositeOverlayIfNeeded(this.colorSurface, f5);
    }

    public ElevationOverlayProvider(boolean z5, int i5, int i6, int i7, float f5) {
        this.elevationOverlayEnabled = z5;
        this.elevationOverlayColor = i5;
        this.elevationOverlayAccentColor = i6;
        this.colorSurface = i7;
        this.displayDensity = f5;
    }
}
