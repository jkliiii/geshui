package com.google.android.material.internal;

/* compiled from: FadeThroughUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d {
    /* renamed from: ʻ, reason: contains not printable characters */
    static void m6946(float f5, float[] fArr) {
        if (f5 <= 0.5f) {
            fArr[0] = 1.0f - (f5 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f5 * 2.0f) - 1.0f;
        }
    }
}
