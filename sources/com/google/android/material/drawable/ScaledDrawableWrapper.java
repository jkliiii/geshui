package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.f;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ScaledDrawableWrapper extends f {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(Drawable drawable, int i5, int i6) {
        super(drawable);
        this.width = i5;
        this.height = i6;
    }

    @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }
}
