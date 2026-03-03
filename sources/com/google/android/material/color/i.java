package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

/* compiled from: ResourcesLoaderUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class i {
    /* renamed from: ʻ, reason: contains not printable characters */
    static boolean m6481(Context context, Map<Integer, Integer> map) {
        ResourcesLoader m6437 = d.m6437(context, map);
        if (m6437 == null) {
            return false;
        }
        context.getResources().addLoaders(m6437);
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static boolean m6482(int i5) {
        return 28 <= i5 && i5 <= 31;
    }
}
