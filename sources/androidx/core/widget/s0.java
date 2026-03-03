package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableImageSourceView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface s0 {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
