package com.google.android.material.transition.platform;

import android.graphics.RectF;

/* compiled from: FitModeEvaluators.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final d f6606 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final d f6607 = new b();

    /* compiled from: FitModeEvaluators.java */
    class a implements d {
        a() {
        }

        @Override // com.google.android.material.transition.platform.d
        /* renamed from: ʻ */
        public f mo7734(float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            float m7763 = q.m7763(f8, f10, f6, f7, f5, true);
            float f12 = m7763 / f8;
            float f13 = m7763 / f10;
            return new f(f12, f13, m7763, f9 * f12, m7763, f11 * f13);
        }

        @Override // com.google.android.material.transition.platform.d
        /* renamed from: ʼ */
        public boolean mo7735(f fVar) {
            return fVar.f6611 > fVar.f6613;
        }

        @Override // com.google.android.material.transition.platform.d
        /* renamed from: ʽ */
        public void mo7736(RectF rectF, float f5, f fVar) {
            rectF.bottom -= Math.abs(fVar.f6613 - fVar.f6611) * f5;
        }
    }

    /* compiled from: FitModeEvaluators.java */
    class b implements d {
        b() {
        }

        @Override // com.google.android.material.transition.platform.d
        /* renamed from: ʻ */
        public f mo7734(float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            float m7763 = q.m7763(f9, f11, f6, f7, f5, true);
            float f12 = m7763 / f9;
            float f13 = m7763 / f11;
            return new f(f12, f13, f8 * f12, m7763, f10 * f13, m7763);
        }

        @Override // com.google.android.material.transition.platform.d
        /* renamed from: ʼ */
        public boolean mo7735(f fVar) {
            return fVar.f6610 > fVar.f6612;
        }

        @Override // com.google.android.material.transition.platform.d
        /* renamed from: ʽ */
        public void mo7736(RectF rectF, float f5, f fVar) {
            float abs = (Math.abs(fVar.f6612 - fVar.f6610) / 2.0f) * f5;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static d m7737(int i5, boolean z5, RectF rectF, RectF rectF2) {
        if (i5 == 0) {
            return m7738(z5, rectF, rectF2) ? f6606 : f6607;
        }
        if (i5 == 1) {
            return f6606;
        }
        if (i5 == 2) {
            return f6607;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m7738(boolean z5, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f5 = (height2 * width) / width2;
        float f6 = (width2 * height) / width;
        if (z5) {
            if (f5 >= height) {
                return true;
            }
        } else if (f6 >= height2) {
            return true;
        }
        return false;
    }
}
