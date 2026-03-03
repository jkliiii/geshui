package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import java.util.Map;

/* compiled from: ResourcesLoaderColorResourcesOverride.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g implements ColorResourcesOverride {

    /* compiled from: ResourcesLoaderColorResourcesOverride.java */
    private static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final g f5524 = new g();
    }

    private g() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static ColorResourcesOverride m6478() {
        return b.f5524;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (!i.m6481(context, map)) {
            return false;
        }
        ThemeUtils.applyThemeOverlay(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return i.m6481(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }
}
