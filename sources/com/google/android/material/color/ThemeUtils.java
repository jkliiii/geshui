package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class ThemeUtils {
    private ThemeUtils() {
    }

    public static void applyThemeOverlay(Context context, int i5) {
        Resources.Theme windowDecorViewTheme;
        context.getTheme().applyStyle(i5, true);
        if (!(context instanceof Activity) || (windowDecorViewTheme = getWindowDecorViewTheme((Activity) context)) == null) {
            return;
        }
        windowDecorViewTheme.applyStyle(i5, true);
    }

    private static Resources.Theme getWindowDecorViewTheme(Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
