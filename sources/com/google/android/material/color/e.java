package com.google.android.material.color;

import android.os.Build;

/* compiled from: ColorResourcesOverride.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final /* synthetic */ class e {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static ColorResourcesOverride m6438() {
        int i5 = Build.VERSION.SDK_INT;
        if (30 <= i5 && i5 <= 33) {
            return g.m6478();
        }
        if (i5 >= 34) {
            return g.m6478();
        }
        return null;
    }
}
