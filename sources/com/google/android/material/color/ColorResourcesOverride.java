package com.google.android.material.color;

import android.content.Context;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface ColorResourcesOverride {
    boolean applyIfPossible(Context context, Map<Integer, Integer> map);

    Context wrapContextIfPossible(Context context, Map<Integer, Integer> map);
}
