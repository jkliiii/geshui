package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* compiled from: ObjectAnimatorUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g {
    /* renamed from: ʻ, reason: contains not printable characters */
    static <T> ObjectAnimator m5364(T t5, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t5, (Property<Object, V>) property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t5, new i(property, path), 0.0f, 1.0f);
    }
}
