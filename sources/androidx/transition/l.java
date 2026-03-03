package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* compiled from: PropertyValuesHolderUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l {
    /* renamed from: ʻ, reason: contains not printable characters */
    static PropertyValuesHolder m5378(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new i(property, path), 0.0f, 1.0f);
    }
}
