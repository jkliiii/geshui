package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int i5, int i6, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i5});
        try {
            return obtainStyledAttributes.getColor(0, i6);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static float getFloatFromAttrRes(int i5, float f5, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i5});
        try {
            return obtainStyledAttributes.getFloat(0, f5);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
