package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ShapeableDelegateV33.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d extends ShapeableDelegate {

    /* compiled from: ShapeableDelegateV33.java */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (d.this.shapePath.isEmpty()) {
                return;
            }
            outline.setPath(d.this.shapePath);
        }
    }

    d(View view) {
        m7183(view);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m7183(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(View view) {
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }
}
