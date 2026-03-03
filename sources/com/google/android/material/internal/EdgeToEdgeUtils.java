package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.g0;
import androidx.core.view.u4;
import com.google.android.material.color.MaterialColors;

/* loaded from: E:\78999\cookie_5123796.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(Window window, boolean z5) {
        applyEdgeToEdge(window, z5, null, null);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z5) {
        if (z5 && Build.VERSION.SDK_INT < 27) {
            return g0.m2279(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), EDGE_TO_EDGE_BAR_ALPHA);
        }
        if (z5) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z5) {
        if (z5 && Build.VERSION.SDK_INT < 23) {
            return g0.m2279(MaterialColors.getColor(context, R.attr.statusBarColor, -16777216), EDGE_TO_EDGE_BAR_ALPHA);
        }
        if (z5) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i5, boolean z5) {
        return MaterialColors.isColorLight(i5) || (i5 == 0 && z5);
    }

    public static void setLightNavigationBar(Window window, boolean z5) {
        u4.m3368(window, window.getDecorView()).m3332(z5);
    }

    public static void setLightStatusBar(Window window, boolean z5) {
        u4.m3368(window, window.getDecorView()).m3333(z5);
    }

    public static void applyEdgeToEdge(Window window, boolean z5, Integer num, Integer num2) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z6 = num == null || num.intValue() == 0;
        boolean z7 = num2 == null || num2.intValue() == 0;
        if (z6 || z7) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z6) {
                num = Integer.valueOf(color);
            }
            if (z7) {
                num2 = Integer.valueOf(color);
            }
        }
        u4.m3369(window, !z5);
        int statusBarColor = getStatusBarColor(window.getContext(), z5);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z5);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }
}
