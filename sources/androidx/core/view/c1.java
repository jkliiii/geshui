package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableBackgroundView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface c1 {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
