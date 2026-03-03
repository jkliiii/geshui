package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l implements ViewOverlayImpl {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ViewOverlay f5876;

    l(View view) {
        this.f5876 = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable) {
        this.f5876.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable) {
        this.f5876.remove(drawable);
    }
}
