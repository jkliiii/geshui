package com.google.android.material.transition;

import android.graphics.RectF;

/* compiled from: FitModeEvaluators.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final d f6501 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final d f6502 = new b();

    /* compiled from: FitModeEvaluators.java */
    class a implements d {
        a() {
        }

        @Override // com.google.android.material.transition.d
        /* renamed from: ʻ */
        public f mo7677(float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            float m7699 = k.m7699(f8, f10, f6, f7, f5, true);
            float f12 = m7699 / f8;
            float f13 = m7699 / f10;
            return new f(f12, f13, m7699, f9 * f12, m7699, f11 * f13);
        }

        @Override // com.google.android.material.transition.d
        /* renamed from: ʼ */
        public void mo7678(RectF rectF, float f5, f fVar) {
            rectF.bottom -= Math.abs(fVar.f6508 - fVar.f6506) * f5;
        }

        @Override // com.google.android.material.transition.d
        /* renamed from: ʽ */
        public boolean mo7679(f fVar) {
            return fVar.f6506 > fVar.f6508;
        }
    }

    /* compiled from: FitModeEvaluators.java */
    class b implements d {
        b() {
        }

        @Override // com.google.android.material.transition.d
        /* renamed from: ʻ */
        public f mo7677(float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            float m7699 = k.m7699(f9, f11, f6, f7, f5, true);
            float f12 = m7699 / f9;
            float f13 = m7699 / f11;
            return new f(f12, f13, f8 * f12, m7699, f10 * f13, m7699);
        }

        @Override // com.google.android.material.transition.d
        /* renamed from: ʼ */
        public void mo7678(RectF rectF, float f5, f fVar) {
            float abs = (Math.abs(fVar.f6507 - fVar.f6505) / 2.0f) * f5;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.d
        /* renamed from: ʽ */
        public boolean mo7679(f fVar) {
            return fVar.f6505 > fVar.f6507;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static d m7680(int i5, boolean z5, RectF rectF, RectF rectF2) {
        if (i5 == 0) {
            return m7681(z5, rectF, rectF2) ? f6501 : f6502;
        }
        if (i5 == 1) {
            return f6501;
        }
        if (i5 == 2) {
            return f6502;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m7681(boolean z5, RectF rectF, RectF rectF2) {
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
