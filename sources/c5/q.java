package c5;

import java.util.Arrays;

/* compiled from: SegmentedByteString.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class q extends f {

    /* renamed from: ˊ, reason: contains not printable characters */
    final transient byte[][] f5052;

    /* renamed from: ˋ, reason: contains not printable characters */
    final transient int[] f5053;

    q(c cVar, int i5) {
        super(null);
        u.m5978(cVar.f5011, 0L, i5);
        o oVar = cVar.f5010;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            int i9 = oVar.f5045;
            int i10 = oVar.f5044;
            if (i9 == i10) {
                throw new AssertionError("s.limit == s.pos");
            }
            i7 += i9 - i10;
            i8++;
            oVar = oVar.f5048;
        }
        this.f5052 = new byte[i8][];
        this.f5053 = new int[i8 * 2];
        o oVar2 = cVar.f5010;
        int i11 = 0;
        while (i6 < i5) {
            byte[][] bArr = this.f5052;
            bArr[i11] = oVar2.f5043;
            int i12 = oVar2.f5045;
            int i13 = oVar2.f5044;
            i6 += i12 - i13;
            if (i6 > i5) {
                i6 = i5;
            }
            int[] iArr = this.f5053;
            iArr[i11] = i6;
            iArr[bArr.length + i11] = i13;
            oVar2.f5046 = true;
            i11++;
            oVar2 = oVar2.f5048;
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int m5974(int i5) {
        int binarySearch = Arrays.binarySearch(this.f5053, 0, this.f5052.length, i5 + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private f m5975() {
        return new f(mo5934());
    }

    @Override // c5.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.mo5930() == mo5930() && mo5926(0, fVar, 0, mo5930())) {
                return true;
            }
        }
        return false;
    }

    @Override // c5.f
    public int hashCode() {
        int i5 = this.f5016;
        if (i5 != 0) {
            return i5;
        }
        int length = this.f5052.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        while (i6 < length) {
            byte[] bArr = this.f5052[i6];
            int[] iArr = this.f5053;
            int i9 = iArr[length + i6];
            int i10 = iArr[i6];
            int i11 = (i10 - i7) + i9;
            while (i9 < i11) {
                i8 = (i8 * 31) + bArr[i9];
                i9++;
            }
            i6++;
            i7 = i10;
        }
        this.f5016 = i8;
        return i8;
    }

    @Override // c5.f
    public String toString() {
        return m5975().toString();
    }

    @Override // c5.f
    /* renamed from: ʻ */
    public String mo5922() {
        return m5975().mo5922();
    }

    @Override // c5.f
    /* renamed from: ˉ */
    public byte mo5924(int i5) {
        u.m5978(this.f5053[this.f5052.length - 1], i5, 1L);
        int m5974 = m5974(i5);
        int i6 = m5974 == 0 ? 0 : this.f5053[m5974 - 1];
        int[] iArr = this.f5053;
        byte[][] bArr = this.f5052;
        return bArr[m5974][(i5 - i6) + iArr[bArr.length + m5974]];
    }

    @Override // c5.f
    /* renamed from: ˊ */
    public String mo5925() {
        return m5975().mo5925();
    }

    @Override // c5.f
    /* renamed from: ˎ */
    public boolean mo5926(int i5, f fVar, int i6, int i7) {
        if (i5 < 0 || i5 > mo5930() - i7) {
            return false;
        }
        int m5974 = m5974(i5);
        while (i7 > 0) {
            int i8 = m5974 == 0 ? 0 : this.f5053[m5974 - 1];
            int min = Math.min(i7, ((this.f5053[m5974] - i8) + i8) - i5);
            int[] iArr = this.f5053;
            byte[][] bArr = this.f5052;
            if (!fVar.mo5927(i6, bArr[m5974], (i5 - i8) + iArr[bArr.length + m5974], min)) {
                return false;
            }
            i5 += min;
            i6 += min;
            i7 -= min;
            m5974++;
        }
        return true;
    }

    @Override // c5.f
    /* renamed from: ˏ */
    public boolean mo5927(int i5, byte[] bArr, int i6, int i7) {
        if (i5 < 0 || i5 > mo5930() - i7 || i6 < 0 || i6 > bArr.length - i7) {
            return false;
        }
        int m5974 = m5974(i5);
        while (i7 > 0) {
            int i8 = m5974 == 0 ? 0 : this.f5053[m5974 - 1];
            int min = Math.min(i7, ((this.f5053[m5974] - i8) + i8) - i5);
            int[] iArr = this.f5053;
            byte[][] bArr2 = this.f5052;
            if (!u.m5977(bArr2[m5974], (i5 - i8) + iArr[bArr2.length + m5974], bArr, i6, min)) {
                return false;
            }
            i5 += min;
            i6 += min;
            i7 -= min;
            m5974++;
        }
        return true;
    }

    @Override // c5.f
    /* renamed from: ˑ */
    public f mo5928() {
        return m5975().mo5928();
    }

    @Override // c5.f
    /* renamed from: י */
    public f mo5929() {
        return m5975().mo5929();
    }

    @Override // c5.f
    /* renamed from: ـ */
    public int mo5930() {
        return this.f5053[this.f5052.length - 1];
    }

    @Override // c5.f
    /* renamed from: ᐧ */
    public f mo5932(int i5, int i6) {
        return m5975().mo5932(i5, i6);
    }

    @Override // c5.f
    /* renamed from: ᴵ */
    public f mo5933() {
        return m5975().mo5933();
    }

    @Override // c5.f
    /* renamed from: ᵎ */
    public byte[] mo5934() {
        int[] iArr = this.f5053;
        byte[][] bArr = this.f5052;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int[] iArr2 = this.f5053;
            int i7 = iArr2[length + i5];
            int i8 = iArr2[i5];
            System.arraycopy(this.f5052[i5], i7, bArr2, i6, i8 - i6);
            i5++;
            i6 = i8;
        }
        return bArr2;
    }

    @Override // c5.f
    /* renamed from: ᵔ */
    public String mo5935() {
        return m5975().mo5935();
    }

    @Override // c5.f
    /* renamed from: ᵢ */
    void mo5936(c cVar) {
        int length = this.f5052.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int[] iArr = this.f5053;
            int i7 = iArr[length + i5];
            int i8 = iArr[i5];
            o oVar = new o(this.f5052[i5], i7, (i7 + i8) - i6, true, false);
            o oVar2 = cVar.f5010;
            if (oVar2 == null) {
                oVar.f5049 = oVar;
                oVar.f5048 = oVar;
                cVar.f5010 = oVar;
            } else {
                oVar2.f5049.m5968(oVar);
            }
            i5++;
            i6 = i8;
        }
        cVar.f5011 += i6;
    }
}
