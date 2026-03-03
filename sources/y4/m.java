package y4;

import java.util.Arrays;

/* compiled from: Settings.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class m {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f12659;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int[] f12660 = new int[10];

    /* renamed from: ʻ, reason: contains not printable characters */
    void m13091() {
        this.f12659 = 0;
        Arrays.fill(this.f12660, 0);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    int m13092(int i5) {
        return this.f12660[i5];
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    int m13093() {
        if ((this.f12659 & 2) != 0) {
            return this.f12660[1];
        }
        return -1;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    int m13094() {
        if ((this.f12659 & 128) != 0) {
            return this.f12660[7];
        }
        return 65535;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    int m13095(int i5) {
        return (this.f12659 & 16) != 0 ? this.f12660[4] : i5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    int m13096(int i5) {
        return (this.f12659 & 32) != 0 ? this.f12660[5] : i5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean m13097(int i5) {
        return ((1 << i5) & this.f12659) != 0;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m13098(m mVar) {
        for (int i5 = 0; i5 < 10; i5++) {
            if (mVar.m13097(i5)) {
                m13099(i5, mVar.m13092(i5));
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    m m13099(int i5, int i6) {
        if (i5 >= 0) {
            int[] iArr = this.f12660;
            if (i5 < iArr.length) {
                this.f12659 = (1 << i5) | this.f12659;
                iArr[i5] = i6;
            }
        }
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    int m13100() {
        return Integer.bitCount(this.f12659);
    }
}
