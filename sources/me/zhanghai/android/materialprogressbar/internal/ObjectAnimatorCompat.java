package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.util.Property;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ObjectAnimatorCompat {
    private ObjectAnimatorCompat() {
    }

    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofArgb(obj, str, iArr) : ObjectAnimatorCompatBase.ofArgb(obj, str, iArr);
    }

    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofFloat(obj, str, str2, path) : ObjectAnimatorCompatBase.ofFloat(obj, str, str2, path);
    }

    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofInt(obj, str, str2, path) : ObjectAnimatorCompatBase.ofInt(obj, str, str2, path);
    }

    public static <T> ObjectAnimator ofArgb(T t5, Property<T, Integer> property, int... iArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofArgb(t5, property, iArr);
        }
        return ObjectAnimatorCompatBase.ofArgb(t5, property, iArr);
    }

    public static <T> ObjectAnimator ofFloat(T t5, Property<T, Float> property, Property<T, Float> property2, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofFloat(t5, property, property2, path);
        }
        return ObjectAnimatorCompatBase.ofFloat(t5, property, property2, path);
    }

    public static <T> ObjectAnimator ofInt(T t5, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofInt(t5, property, property2, path);
        }
        return ObjectAnimatorCompatBase.ofInt(t5, property, property2, path);
    }
}
