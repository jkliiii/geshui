package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* compiled from: DrawingDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class d<S extends BaseProgressIndicatorSpec> {

    /* renamed from: ʻ, reason: contains not printable characters */
    S f5934;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected c f5935;

    public d(S s5) {
        this.f5934 = s5;
    }

    /* renamed from: ʻ */
    abstract void mo6986(Canvas canvas, Rect rect, float f5);

    /* renamed from: ʼ */
    abstract void mo6987(Canvas canvas, Paint paint, float f5, float f6, int i5);

    /* renamed from: ʽ */
    abstract void mo6988(Canvas canvas, Paint paint);

    /* renamed from: ʾ */
    abstract int mo6989();

    /* renamed from: ʿ */
    abstract int mo6990();

    /* renamed from: ˆ, reason: contains not printable characters */
    protected void m7017(c cVar) {
        this.f5935 = cVar;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m7018(Canvas canvas, Rect rect, float f5) {
        this.f5934.validateSpec();
        mo6986(canvas, rect, f5);
    }
}
