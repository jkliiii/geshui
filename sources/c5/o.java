package c5;

import javax.annotation.Nullable;

/* compiled from: Segment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class o {

    /* renamed from: ʻ, reason: contains not printable characters */
    final byte[] f5043;

    /* renamed from: ʼ, reason: contains not printable characters */
    int f5044;

    /* renamed from: ʽ, reason: contains not printable characters */
    int f5045;

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean f5046;

    /* renamed from: ʿ, reason: contains not printable characters */
    boolean f5047;

    /* renamed from: ˆ, reason: contains not printable characters */
    o f5048;

    /* renamed from: ˈ, reason: contains not printable characters */
    o f5049;

    o() {
        this.f5043 = new byte[8192];
        this.f5047 = true;
        this.f5046 = false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m5966() {
        o oVar = this.f5049;
        if (oVar == this) {
            throw new IllegalStateException();
        }
        if (oVar.f5047) {
            int i5 = this.f5045 - this.f5044;
            if (i5 > (8192 - oVar.f5045) + (oVar.f5046 ? 0 : oVar.f5044)) {
                return;
            }
            m5971(oVar, i5);
            m5967();
            p.m5972(this);
        }
    }

    @Nullable
    /* renamed from: ʼ, reason: contains not printable characters */
    public final o m5967() {
        o oVar = this.f5048;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f5049;
        oVar3.f5048 = oVar;
        this.f5048.f5049 = oVar3;
        this.f5048 = null;
        this.f5049 = null;
        return oVar2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final o m5968(o oVar) {
        oVar.f5049 = this;
        oVar.f5048 = this.f5048;
        this.f5048.f5049 = oVar;
        this.f5048 = oVar;
        return oVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    final o m5969() {
        this.f5046 = true;
        return new o(this.f5043, this.f5044, this.f5045, true, false);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final o m5970(int i5) {
        o m5973;
        if (i5 <= 0 || i5 > this.f5045 - this.f5044) {
            throw new IllegalArgumentException();
        }
        if (i5 >= 1024) {
            m5973 = m5969();
        } else {
            m5973 = p.m5973();
            System.arraycopy(this.f5043, this.f5044, m5973.f5043, 0, i5);
        }
        m5973.f5045 = m5973.f5044 + i5;
        this.f5044 += i5;
        this.f5049.m5968(m5973);
        return m5973;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final void m5971(o oVar, int i5) {
        if (!oVar.f5047) {
            throw new IllegalArgumentException();
        }
        int i6 = oVar.f5045;
        if (i6 + i5 > 8192) {
            if (oVar.f5046) {
                throw new IllegalArgumentException();
            }
            int i7 = oVar.f5044;
            if ((i6 + i5) - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = oVar.f5043;
            System.arraycopy(bArr, i7, bArr, 0, i6 - i7);
            oVar.f5045 -= oVar.f5044;
            oVar.f5044 = 0;
        }
        System.arraycopy(this.f5043, this.f5044, oVar.f5043, oVar.f5045, i5);
        oVar.f5045 += i5;
        this.f5044 += i5;
    }

    o(byte[] bArr, int i5, int i6, boolean z5, boolean z6) {
        this.f5043 = bArr;
        this.f5044 = i5;
        this.f5045 = i6;
        this.f5046 = z5;
        this.f5047 = z6;
    }
}
