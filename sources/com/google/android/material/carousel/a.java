package com.google.android.material.carousel;

/* compiled from: Arrangement.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    final int f5422;

    /* renamed from: ʼ, reason: contains not printable characters */
    float f5423;

    /* renamed from: ʽ, reason: contains not printable characters */
    final int f5424;

    /* renamed from: ʾ, reason: contains not printable characters */
    final int f5425;

    /* renamed from: ʿ, reason: contains not printable characters */
    float f5426;

    /* renamed from: ˆ, reason: contains not printable characters */
    float f5427;

    /* renamed from: ˈ, reason: contains not printable characters */
    final int f5428;

    /* renamed from: ˉ, reason: contains not printable characters */
    final float f5429;

    a(int i5, float f5, float f6, float f7, int i6, float f8, int i7, float f9, int i8, float f10) {
        this.f5422 = i5;
        this.f5423 = w.a.m12443(f5, f6, f7);
        this.f5424 = i6;
        this.f5426 = f8;
        this.f5425 = i7;
        this.f5427 = f9;
        this.f5428 = i8;
        m6360(f10, f6, f7, f9);
        this.f5429 = m6358(f9);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private float m6357(float f5, int i5, float f6, int i6, int i7) {
        if (i5 <= 0) {
            f6 = 0.0f;
        }
        float f7 = i6 / 2.0f;
        return (f5 - ((i5 + f7) * f6)) / (i7 + f7);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private float m6358(float f5) {
        if (m6362()) {
            return Math.abs(f5 - this.f5427) * this.f5422;
        }
        return Float.MAX_VALUE;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static a m6359(float f5, float f6, float f7, float f8, int[] iArr, float f9, int[] iArr2, float f10, int[] iArr3) {
        a aVar = null;
        int i5 = 1;
        for (int i6 : iArr3) {
            int length = iArr2.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = iArr2[i7];
                int length2 = iArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = i9;
                    int i11 = length2;
                    int i12 = i7;
                    int i13 = length;
                    a aVar2 = new a(i5, f6, f7, f8, iArr[i9], f9, i8, f10, i6, f5);
                    if (aVar == null || aVar2.f5429 < aVar.f5429) {
                        if (aVar2.f5429 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i5++;
                    i9 = i10 + 1;
                    length2 = i11;
                    i7 = i12;
                    length = i13;
                }
                i7++;
            }
        }
        return aVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m6360(float f5, float f6, float f7, float f8) {
        float m6361 = f5 - m6361();
        int i5 = this.f5424;
        if (i5 > 0 && m6361 > 0.0f) {
            float f9 = this.f5423;
            this.f5423 = f9 + Math.min(m6361 / i5, f7 - f9);
        } else if (i5 > 0 && m6361 < 0.0f) {
            float f10 = this.f5423;
            this.f5423 = f10 + Math.max(m6361 / i5, f6 - f10);
        }
        float m6357 = m6357(f5, this.f5424, this.f5423, this.f5425, this.f5428);
        this.f5427 = m6357;
        float f11 = (this.f5423 + m6357) / 2.0f;
        this.f5426 = f11;
        int i6 = this.f5425;
        if (i6 <= 0 || m6357 == f8) {
            return;
        }
        float f12 = (f8 - m6357) * this.f5428;
        float min = Math.min(Math.abs(f12), f11 * 0.1f * i6);
        if (f12 > 0.0f) {
            this.f5426 -= min / this.f5425;
            this.f5427 += min / this.f5428;
        } else {
            this.f5426 += min / this.f5425;
            this.f5427 -= min / this.f5428;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private float m6361() {
        return (this.f5427 * this.f5428) + (this.f5426 * this.f5425) + (this.f5423 * this.f5424);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m6362() {
        int i5 = this.f5428;
        if (i5 <= 0 || this.f5424 <= 0 || this.f5425 <= 0) {
            return i5 <= 0 || this.f5424 <= 0 || this.f5427 > this.f5423;
        }
        float f5 = this.f5427;
        float f6 = this.f5426;
        return f5 > f6 && f6 > this.f5423;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f5422 + ", smallCount=" + this.f5424 + ", smallSize=" + this.f5423 + ", mediumCount=" + this.f5425 + ", mediumSize=" + this.f5426 + ", largeCount=" + this.f5428 + ", largeSize=" + this.f5427 + ", cost=" + this.f5429 + "]";
    }
}
