package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d0 implements e0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ViewOverlay f4485;

    d0(View view) {
        this.f4485 = view.getOverlay();
    }

    @Override // androidx.transition.e0
    public void add(Drawable drawable) {
        this.f4485.add(drawable);
    }

    @Override // androidx.transition.e0
    public void remove(Drawable drawable) {
        this.f4485.remove(drawable);
    }
}
