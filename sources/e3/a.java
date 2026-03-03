package e3;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: GifDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements Cloneable {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private int f7591;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private int f7592;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private int f7593;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f7594;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private int f7595;

    /* renamed from: ʿ, reason: contains not printable characters */
    public int f7596;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private boolean f7597;

    /* renamed from: ˆ, reason: contains not printable characters */
    public int f7598;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private short[] f7599;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f7600;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private byte[] f7601;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f7602;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private byte[] f7603;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f7604;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private byte[] f7605;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int[] f7606;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private byte[] f7607;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int[] f7608;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private int f7609;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int[] f7610;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private int f7611;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f7612;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private int f7613;

    /* renamed from: י, reason: contains not printable characters */
    private int f7614;

    /* renamed from: יי, reason: contains not printable characters */
    b f7615;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f7616;

    /* renamed from: ــ, reason: contains not printable characters */
    private int f7617;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f7618;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f7619;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private int f7620;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f7621;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private byte[] f7622;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f7623;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    b f7624;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f7625;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private int f7626;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f7627;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    int[] f7628;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int f7629;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private int f7630;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f7631;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private int f7632;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int f7633;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int f7634;

    public a(ByteBuffer byteBuffer) {
        this(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [short] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: ʻ, reason: contains not printable characters */
    private void m8450() {
        int i5;
        int i6;
        int i7;
        short s5;
        int i8 = this.f7629 * this.f7631;
        byte[] bArr = this.f7607;
        if (bArr == null || bArr.length < i8) {
            this.f7607 = new byte[i8];
        }
        if (this.f7599 == null) {
            this.f7599 = new short[4096];
        }
        if (this.f7603 == null) {
            this.f7603 = new byte[4096];
        }
        if (this.f7601 == null) {
            this.f7601 = new byte[4097];
        }
        int m8452 = m8452();
        int i9 = 1 << m8452;
        int i10 = i9 + 1;
        int i11 = i9 + 2;
        int i12 = m8452 + 1;
        int i13 = (1 << i12) - 1;
        for (int i14 = 0; i14 < i9; i14++) {
            this.f7599[i14] = 0;
            this.f7603[i14] = (byte) i14;
        }
        int i15 = i12;
        int i16 = i11;
        int i17 = i13;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i19 < i8) {
            if (i20 != 0) {
                i5 = i8;
                i6 = i12;
                i7 = i9;
            } else if (i21 >= i15) {
                int i27 = i22 & i17;
                i22 >>= i15;
                i21 -= i15;
                if (i27 > i16 || i27 == i10) {
                    break;
                }
                if (i27 == i9) {
                    i15 = i12;
                    i16 = i11;
                    i17 = i13;
                    i18 = -1;
                } else if (i18 == -1) {
                    this.f7601[i20] = this.f7603[i27];
                    i18 = i27;
                    i25 = i18;
                    i20++;
                    i8 = i8;
                } else {
                    i5 = i8;
                    if (i27 == i16) {
                        i6 = i12;
                        this.f7601[i20] = (byte) i25;
                        s5 = i18;
                        i20++;
                    } else {
                        i6 = i12;
                        s5 = i27;
                    }
                    while (s5 > i9) {
                        this.f7601[i20] = this.f7603[s5];
                        s5 = this.f7599[s5];
                        i20++;
                        i27 = i27;
                    }
                    int i28 = i27;
                    byte[] bArr2 = this.f7603;
                    int i29 = bArr2[s5] & 255;
                    if (i16 >= 4096) {
                        break;
                    }
                    int i30 = i20 + 1;
                    i7 = i9;
                    byte b6 = (byte) i29;
                    this.f7601[i20] = b6;
                    this.f7599[i16] = (short) i18;
                    bArr2[i16] = b6;
                    i16++;
                    if ((i16 & i17) == 0 && i16 < 4096) {
                        i15++;
                        i17 += i16;
                    }
                    i20 = i30;
                    i18 = i28;
                    i25 = i29;
                }
            } else {
                if (i23 == 0) {
                    i23 = m8455();
                    if (i23 <= 0) {
                        break;
                    } else {
                        i24 = 0;
                    }
                }
                i22 += (this.f7622[i24] & 255) << i21;
                i21 += 8;
                i24++;
                i23--;
            }
            i20--;
            int i31 = i26;
            i26 = i31 + 1;
            this.f7607[i31] = this.f7601[i20];
            i19++;
            i8 = i5;
            i12 = i6;
            i9 = i7;
        }
        this.f7630 = i26;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean m8451() {
        return this.f7594 != 0;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private int m8452() {
        int i5 = this.f7613;
        if (i5 >= this.f7609) {
            return 0;
        }
        byte[] bArr = this.f7605;
        int i6 = this.f7611;
        this.f7613 = i5 + 1;
        return bArr[i6 + i5] & 255;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private int m8453(byte[] bArr) throws IOException {
        return m8454(bArr, 0, bArr.length);
    }

    /* renamed from: י, reason: contains not printable characters */
    private int m8454(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = this.f7613;
        int i8 = this.f7609;
        if (i7 >= i8) {
            return -1;
        }
        int min = Math.min(i8 - i7, i6);
        System.arraycopy(this.f7605, this.f7611 + this.f7613, bArr, i5, min);
        this.f7613 += min;
        return min;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private int m8455() {
        int m8452 = m8452();
        this.f7591 = m8452;
        int i5 = 0;
        if (m8452 > 0) {
            while (true) {
                try {
                    int i6 = this.f7591;
                    if (i5 >= i6) {
                        break;
                    }
                    int m8454 = m8454(this.f7622, i5, i6 - i5);
                    if (m8454 == -1) {
                        break;
                    }
                    i5 += m8454;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (i5 < this.f7591) {
                this.f7594 = 1;
            }
        }
        return i5;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private int[] m8456(int i5) {
        int i6;
        int i7 = i5 * 3;
        byte[] bArr = new byte[i7];
        try {
            i6 = m8453(bArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            i6 = 0;
        }
        if (i6 < i7) {
            this.f7594 = 1;
            return null;
        }
        int[] iArr = new int[256];
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = i8 + 1;
            int i11 = i10 + 1;
            iArr[i9] = ((bArr[i8] & 255) << 16) | (-16777216) | ((bArr[i10] & 255) << 8) | (bArr[i11] & 255);
            i8 = i11 + 1;
        }
        return iArr;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m8457() {
        m8452();
        int m8452 = m8452();
        int i5 = (m8452 & 28) >> 2;
        this.f7593 = i5;
        if (i5 == 0) {
            this.f7593 = 1;
        }
        this.f7597 = (m8452 & 1) != 0;
        this.f7595 = m8462() * 10;
        this.f7617 = m8452();
        m8452();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m8458() {
        String str = BuildConfig.FLAVOR;
        for (int i5 = 0; i5 < 6; i5++) {
            str = str + ((char) m8452());
        }
        if (!str.startsWith("GIF")) {
            this.f7594 = 1;
            return;
        }
        m8460();
        if (!this.f7600 || m8451()) {
            return;
        }
        int[] m8456 = m8456(this.f7602);
        this.f7606 = m8456;
        this.f7614 = m8456[this.f7612];
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private b m8459() {
        this.f7625 = m8462();
        this.f7627 = m8462();
        this.f7629 = m8462();
        this.f7631 = m8462();
        int m8452 = m8452();
        boolean z5 = (m8452 & 128) != 0;
        this.f7619 = z5;
        this.f7621 = (m8452 & 64) != 0;
        int i5 = 2 << (m8452 & 7);
        this.f7623 = i5;
        if (z5) {
            int[] m8456 = m8456(i5);
            this.f7608 = m8456;
            this.f7610 = m8456;
        } else {
            this.f7610 = this.f7606;
            if (this.f7612 == this.f7617) {
                this.f7614 = 0;
            }
        }
        if (this.f7610 == null) {
            this.f7594 = 1;
        }
        if (m8451()) {
            return null;
        }
        m8450();
        m8465();
        if (m8451()) {
            return null;
        }
        this.f7626++;
        b bVar = new b(m8464(), this.f7595);
        m8463(bVar);
        return bVar;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m8460() {
        this.f7596 = m8462();
        this.f7598 = m8462();
        int m8452 = m8452();
        this.f7600 = (m8452 & 128) != 0;
        this.f7602 = 2 << (m8452 & 7);
        this.f7612 = m8452();
        this.f7618 = m8452();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m8461() {
        do {
            m8455();
            byte[] bArr = this.f7622;
            if (bArr[0] == 1) {
                this.f7604 = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f7591 <= 0) {
                return;
            }
        } while (!m8451());
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int m8462() {
        return m8452() | (m8452() << 8);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m8463(b bVar) {
        int i5 = this.f7593;
        if (i5 == 0) {
            this.f7624 = bVar;
        } else if (i5 == 1) {
            this.f7624 = bVar;
        } else if (i5 == 2) {
            this.f7624 = null;
        } else if (i5 != 3) {
            Log.w("Ion", "Unknown gif dispose code: " + this.f7592);
        }
        this.f7592 = this.f7593;
        this.f7632 = this.f7625;
        this.f7633 = this.f7627;
        this.f7634 = this.f7629;
        this.f7620 = this.f7631;
        this.f7616 = this.f7614;
        this.f7593 = 0;
        this.f7597 = false;
        this.f7595 = 0;
        this.f7608 = null;
        this.f7630 = Integer.MAX_VALUE;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private Bitmap m8464() {
        int i5;
        int i6 = this.f7592;
        int i7 = 0;
        if (i6 == 2) {
            if (this.f7628 == null) {
                this.f7628 = new int[this.f7596 * this.f7598];
            }
            Arrays.fill(this.f7628, !this.f7597 ? this.f7616 : 0);
        } else {
            int[] iArr = this.f7628;
            if (iArr == null) {
                int i8 = this.f7596;
                int i9 = this.f7598;
                int[] iArr2 = new int[i8 * i9];
                this.f7628 = iArr2;
                b bVar = this.f7624;
                if (bVar != null) {
                    bVar.f7635.getPixels(iArr2, 0, i8, 0, 0, i8, i9);
                } else {
                    Arrays.fill(iArr2, 0);
                }
            } else if (i6 == 3) {
                b bVar2 = this.f7624;
                if (bVar2 != null) {
                    Bitmap bitmap = bVar2.f7635;
                    int i10 = this.f7596;
                    bitmap.getPixels(iArr, 0, i10, 0, 0, i10, this.f7598);
                } else {
                    Arrays.fill(iArr, 0);
                }
            }
        }
        int i11 = 0;
        int i12 = 8;
        int i13 = 1;
        while (true) {
            int i14 = this.f7631;
            if (i7 >= i14) {
                return Bitmap.createBitmap(this.f7628, this.f7596, this.f7598, Bitmap.Config.ARGB_4444);
            }
            if (this.f7621) {
                if (i11 >= i14) {
                    i13++;
                    if (i13 == 2) {
                        i11 = 4;
                    } else if (i13 == 3) {
                        i11 = 2;
                        i12 = 4;
                    } else if (i13 == 4) {
                        i11 = 1;
                        i12 = 2;
                    }
                }
                i5 = i11 + i12;
            } else {
                i5 = i11;
                i11 = i7;
            }
            int i15 = i11 + this.f7627;
            if (i15 < this.f7598) {
                int i16 = this.f7596;
                int i17 = i15 * i16;
                int i18 = this.f7625 + i17;
                int i19 = this.f7629;
                int i20 = i18 + i19;
                if (i17 + i16 < i20) {
                    i20 = i17 + i16;
                }
                int i21 = i19 * i7;
                while (i18 < i20 && i21 < this.f7630) {
                    int i22 = i21 + 1;
                    int i23 = this.f7607[i21] & 255;
                    if (!this.f7597 || i23 != this.f7617) {
                        this.f7628[i18] = this.f7610[i23];
                    }
                    i18++;
                    i21 = i22;
                }
            }
            i7++;
            i11 = i5;
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m8465() {
        do {
            m8455();
            if (this.f7591 <= 0) {
                return;
            }
        } while (!m8451());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m8466() {
        return this.f7609;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m8467() {
        return this.f7598;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public b m8468() {
        return this.f7615;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m8469() {
        return this.f7594;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m8470() {
        return this.f7596;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public a m8471() {
        try {
            a aVar = (a) clone();
            this.f7622 = new byte[256];
            this.f7599 = null;
            this.f7603 = null;
            this.f7601 = null;
            this.f7607 = null;
            this.f7628 = null;
            return aVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public synchronized b m8472() {
        while (!m8451() && this.f7594 == 0) {
            int m8452 = m8452();
            if (m8452 != 0) {
                if (m8452 == 33) {
                    int m84522 = m8452();
                    if (m84522 == 249) {
                        m8457();
                    } else if (m84522 != 255) {
                        m8465();
                    } else {
                        m8455();
                        String str = BuildConfig.FLAVOR;
                        for (int i5 = 0; i5 < 11; i5++) {
                            str = str + ((char) this.f7622[i5]);
                        }
                        if (str.equals("NETSCAPE2.0")) {
                            m8461();
                        } else {
                            m8465();
                        }
                    }
                } else {
                    if (m8452 == 44) {
                        b m8459 = m8459();
                        this.f7615 = m8459;
                        return m8459;
                    }
                    if (m8452 == 59) {
                        this.f7594 = -1;
                        return null;
                    }
                    this.f7594 = 1;
                }
            }
        }
        this.f7594 = 1;
        return null;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m8473() {
        this.f7613 = 0;
        this.f7594 = 0;
        this.f7606 = null;
        this.f7608 = null;
        m8458();
    }

    public a(byte[] bArr, int i5, int i6) {
        this.f7604 = 1;
        this.f7622 = new byte[256];
        this.f7591 = 0;
        this.f7593 = 0;
        this.f7592 = 0;
        this.f7597 = false;
        this.f7595 = 0;
        this.f7630 = Integer.MAX_VALUE;
        this.f7605 = bArr;
        this.f7611 = i5;
        this.f7609 = i6;
        m8473();
    }
}
