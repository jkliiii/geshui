package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(Application application, ColorContrastOptions colorContrastOptions) {
        if (isContrastAvailable()) {
            application.registerActivityLifecycleCallbacks(new a(colorContrastOptions));
        }
    }

    public static void applyToActivityIfAvailable(Activity activity, ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        if (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, contrastThemeOverlayResourceId);
        }
    }

    private static int getContrastThemeOverlayResourceId(Context context, ColorContrastOptions colorContrastOptions) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (isContrastAvailable() && uiModeManager != null) {
            float contrast = uiModeManager.getContrast();
            int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
            int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
            if (contrast >= HIGH_CONTRAST_THRESHOLD) {
                return highContrastThemeOverlay == 0 ? mediumContrastThemeOverlay : highContrastThemeOverlay;
            }
            if (contrast >= MEDIUM_CONTRAST_THRESHOLD) {
                return mediumContrastThemeOverlay == 0 ? highContrastThemeOverlay : mediumContrastThemeOverlay;
            }
        }
        return 0;
    }

    public static boolean isContrastAvailable() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static Context wrapContextIfAvailable(Context context, ColorContrastOptions colorContrastOptions) {
        if (!isContrastAvailable()) {
            return context;
        }
        int contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(context, colorContrastOptions);
        return contrastThemeOverlayResourceId == 0 ? context : new ContextThemeWrapper(context, contrastThemeOverlayResourceId);
    }

    private static class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Set<Activity> f5469 = new LinkedHashSet();

        /* renamed from: ʿ, reason: contains not printable characters */
        private final ColorContrastOptions f5470;

        /* renamed from: ˆ, reason: contains not printable characters */
        private UiModeManager.ContrastChangeListener f5471;

        /* renamed from: com.google.android.material.color.ColorContrast$a$a, reason: collision with other inner class name */
        class C0080a implements UiModeManager.ContrastChangeListener {
            C0080a() {
            }

            @Override // android.app.UiModeManager.ContrastChangeListener
            public void onContrastChanged(float f5) {
                Iterator it = a.this.f5469.iterator();
                while (it.hasNext()) {
                    ((Activity) it.next()).recreate();
                }
            }
        }

        a(ColorContrastOptions colorContrastOptions) {
            this.f5470 = colorContrastOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f5469.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.f5471 == null || !this.f5469.isEmpty()) {
                return;
            }
            uiModeManager.removeContrastChangeListener(this.f5471);
            this.f5471 = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.f5469.isEmpty() && this.f5471 == null) {
                this.f5471 = new C0080a();
                uiModeManager.addContrastChangeListener(androidx.core.content.a.m1996(activity.getApplicationContext()), this.f5471);
            }
            this.f5469.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.f5470);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
