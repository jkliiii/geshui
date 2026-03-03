package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import com.google.android.material.color.DynamicColorsOptions;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public class DynamicColors {
    private static final c DEFAULT_DEVICE_SUPPORT_CONDITION;
    private static final Map<String, c> DYNAMIC_COLOR_SUPPORTED_BRANDS;
    private static final Map<String, c> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = {R.attr.dynamicColorThemeOverlay};

    @SuppressLint({"PrivateApi"})
    private static final c SAMSUNG_DEVICE_SUPPORT_CONDITION;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;

    public interface OnAppliedCallback {
        void onApplied(Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(Activity activity, int i5);
    }

    class a implements c {
        a() {
        }

        @Override // com.google.android.material.color.DynamicColors.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo6433() {
            return true;
        }
    }

    class b implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private Long f5473;

        b() {
        }

        @Override // com.google.android.material.color.DynamicColors.c
        /* renamed from: ʻ */
        public boolean mo6433() {
            if (this.f5473 == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    this.f5473 = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                } catch (Exception unused) {
                    this.f5473 = -1L;
                }
            }
            return this.f5473.longValue() >= 40100;
        }
    }

    private interface c {
        /* renamed from: ʻ */
        boolean mo6433();
    }

    static {
        a aVar = new a();
        DEFAULT_DEVICE_SUPPORT_CONDITION = aVar;
        b bVar = new b();
        SAMSUNG_DEVICE_SUPPORT_CONDITION = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", aVar);
        hashMap.put("google", aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put("lge", aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put("samsung", bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("wingtech", aVar);
        hashMap.put("xiaomi", aVar);
        DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        DYNAMIC_COLOR_SUPPORTED_BRANDS = Collections.unmodifiableMap(hashMap2);
    }

    private DynamicColors() {
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    public static void applyToActivitiesIfAvailable(Application application) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(Activity activity) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().build());
    }

    private static int getDefaultThemeOverlay(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static float getSystemContrast(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }

    @SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (androidx.core.os.a.m2404()) {
            return true;
        }
        Map<String, c> map = DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        c cVar = map.get(str.toLowerCase(locale));
        if (cVar == null) {
            cVar = DYNAMIC_COLOR_SUPPORTED_BRANDS.get(Build.BRAND.toLowerCase(locale));
        }
        return cVar != null && cVar.mo6433();
    }

    public static Context wrapContextIfAvailable(Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity, int i5) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setThemeOverlay(i5).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, int i5) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i5).build());
    }

    public static void applyToActivityIfAvailable(Activity activity, DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int defaultThemeOverlay = dynamicColorsOptions.getContentBasedSeedColor() == null ? dynamicColorsOptions.getThemeOverlay() == 0 ? getDefaultThemeOverlay(activity) : dynamicColorsOptions.getThemeOverlay() : 0;
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, defaultThemeOverlay)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(activity), getSystemContrast(activity));
                    ColorResourcesOverride m6438 = e.m6438();
                    if (m6438 == null || !m6438.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    ThemeUtils.applyThemeOverlay(activity, defaultThemeOverlay);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    public static Context wrapContextIfAvailable(Context context, int i5) {
        return wrapContextIfAvailable(context, new DynamicColorsOptions.Builder().setThemeOverlay(i5).build());
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity, Precondition precondition) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    public static Context wrapContextIfAvailable(Context context, DynamicColorsOptions dynamicColorsOptions) {
        if (!isDynamicColorAvailable()) {
            return context;
        }
        int themeOverlay = dynamicColorsOptions.getThemeOverlay();
        if (themeOverlay == 0) {
            themeOverlay = getDefaultThemeOverlay(context);
        }
        if (themeOverlay == 0) {
            return context;
        }
        if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
            SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(context), getSystemContrast(context));
            ColorResourcesOverride m6438 = e.m6438();
            if (m6438 != null) {
                return m6438.wrapContextIfPossible(context, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent));
            }
        }
        return new ContextThemeWrapper(context, themeOverlay);
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, int i5, Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i5).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(Application application, DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new d(dynamicColorsOptions));
    }

    private static class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final DynamicColorsOptions f5474;

        d(DynamicColorsOptions dynamicColorsOptions) {
            this.f5474 = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            DynamicColors.applyToActivityIfAvailable(activity, this.f5474);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
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
