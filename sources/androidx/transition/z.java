package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class z implements a0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ViewGroupOverlay f4587;

    z(ViewGroup viewGroup) {
        this.f4587 = viewGroup.getOverlay();
    }

    @Override // androidx.transition.e0
    public void add(Drawable drawable) {
        this.f4587.add(drawable);
    }

    @Override // androidx.transition.e0
    public void remove(Drawable drawable) {
        this.f4587.remove(drawable);
    }

    @Override // androidx.transition.a0
    /* renamed from: ʻ */
    public void mo5317(View view) {
        this.f4587.add(view);
    }

    @Override // androidx.transition.a0
    /* renamed from: ʼ */
    public void mo5318(View view) {
        this.f4587.remove(view);
    }
}
