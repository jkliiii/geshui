package b1;

import android.graphics.Bitmap;
import android.util.Log;
import b1.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e implements a {

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static final String f4832 = "e";

    /* renamed from: ʻ, reason: contains not printable characters */
    private int[] f4833;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int[] f4834;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final a.InterfaceC0069a f4835;

    /* renamed from: ʾ, reason: contains not printable characters */
    private ByteBuffer f4836;

    /* renamed from: ʿ, reason: contains not printable characters */
    private byte[] f4837;

    /* renamed from: ˆ, reason: contains not printable characters */
    private short[] f4838;

    /* renamed from: ˈ, reason: contains not printable characters */
    private byte[] f4839;

    /* renamed from: ˉ, reason: contains not printable characters */
    private byte[] f4840;

    /* renamed from: ˊ, reason: contains not printable characters */
    private byte[] f4841;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int[] f4842;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f4843;

    /* renamed from: ˏ, reason: contains not printable characters */
    private c f4844;

    /* renamed from: ˑ, reason: contains not printable characters */
    private Bitmap f4845;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f4846;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f4847;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f4848;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f4849;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f4850;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private Boolean f4851;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private Bitmap.Config f4852;

    public e(a.InterfaceC0069a interfaceC0069a, c cVar, ByteBuffer byteBuffer, int i5) {
        this(interfaceC0069a);
        m5679(cVar, byteBuffer, i5);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int m5670(int i5, int i6, int i7) {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = i5; i13 < this.f4848 + i5; i13++) {
            byte[] bArr = this.f4841;
            if (i13 >= bArr.length || i13 >= i6) {
                break;
            }
            int i14 = this.f4833[bArr[i13] & 255];
            if (i14 != 0) {
                i8 += (i14 >> 24) & 255;
                i9 += (i14 >> 16) & 255;
                i10 += (i14 >> 8) & 255;
                i11 += i14 & 255;
                i12++;
            }
        }
        int i15 = i5 + i7;
        for (int i16 = i15; i16 < this.f4848 + i15; i16++) {
            byte[] bArr2 = this.f4841;
            if (i16 >= bArr2.length || i16 >= i6) {
                break;
            }
            int i17 = this.f4833[bArr2[i16] & 255];
            if (i17 != 0) {
                i8 += (i17 >> 24) & 255;
                i9 += (i17 >> 16) & 255;
                i10 += (i17 >> 8) & 255;
                i11 += i17 & 255;
                i12++;
            }
        }
        if (i12 == 0) {
            return 0;
        }
        return ((i8 / i12) << 24) | ((i9 / i12) << 16) | ((i10 / i12) << 8) | (i11 / i12);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m5671(b bVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f4842;
        int i10 = bVar.f4807;
        int i11 = this.f4848;
        int i12 = i10 / i11;
        int i13 = bVar.f4805 / i11;
        int i14 = bVar.f4806 / i11;
        int i15 = bVar.f4804 / i11;
        boolean z5 = this.f4843 == 0;
        int i16 = this.f4850;
        int i17 = this.f4849;
        byte[] bArr = this.f4841;
        int[] iArr2 = this.f4833;
        Boolean bool = this.f4851;
        int i18 = 8;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1;
        while (i20 < i12) {
            Boolean bool2 = bool;
            if (bVar.f4808) {
                if (i19 >= i12) {
                    int i22 = i21 + 1;
                    i5 = i12;
                    if (i22 == 2) {
                        i21 = i22;
                        i19 = 4;
                    } else if (i22 == 3) {
                        i21 = i22;
                        i19 = 2;
                        i18 = 4;
                    } else if (i22 != 4) {
                        i21 = i22;
                    } else {
                        i21 = i22;
                        i19 = 1;
                        i18 = 2;
                    }
                } else {
                    i5 = i12;
                }
                i6 = i19 + i18;
            } else {
                i5 = i12;
                i6 = i19;
                i19 = i20;
            }
            int i23 = i19 + i13;
            boolean z6 = i11 == 1;
            if (i23 < i17) {
                int i24 = i23 * i16;
                int i25 = i24 + i15;
                int i26 = i25 + i14;
                int i27 = i24 + i16;
                if (i27 < i26) {
                    i26 = i27;
                }
                i7 = i6;
                int i28 = i20 * i11 * bVar.f4806;
                if (z6) {
                    int i29 = i25;
                    while (i29 < i26) {
                        int i30 = i13;
                        int i31 = iArr2[bArr[i28] & 255];
                        if (i31 != 0) {
                            iArr[i29] = i31;
                        } else if (z5 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i28 += i11;
                        i29++;
                        i13 = i30;
                    }
                } else {
                    i9 = i13;
                    int i32 = ((i26 - i25) * i11) + i28;
                    int i33 = i25;
                    while (true) {
                        i8 = i14;
                        if (i33 < i26) {
                            int m5670 = m5670(i28, i32, bVar.f4806);
                            if (m5670 != 0) {
                                iArr[i33] = m5670;
                            } else if (z5 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i28 += i11;
                            i33++;
                            i14 = i8;
                        }
                    }
                    bool = bool2;
                    i20++;
                    i13 = i9;
                    i12 = i5;
                    i14 = i8;
                    i19 = i7;
                }
            } else {
                i7 = i6;
            }
            i9 = i13;
            i8 = i14;
            bool = bool2;
            i20++;
            i13 = i9;
            i12 = i5;
            i14 = i8;
            i19 = i7;
        }
        Boolean bool3 = bool;
        if (this.f4851 == null) {
            this.f4851 = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m5672(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f4842;
        int i5 = bVar2.f4807;
        int i6 = bVar2.f4805;
        int i7 = bVar2.f4806;
        int i8 = bVar2.f4804;
        boolean z5 = this.f4843 == 0;
        int i9 = this.f4850;
        byte[] bArr = this.f4841;
        int[] iArr2 = this.f4833;
        int i10 = 0;
        byte b6 = -1;
        while (i10 < i5) {
            int i11 = (i10 + i6) * i9;
            int i12 = i11 + i8;
            int i13 = i12 + i7;
            int i14 = i11 + i9;
            if (i14 < i13) {
                i13 = i14;
            }
            int i15 = bVar2.f4806 * i10;
            int i16 = i12;
            while (i16 < i13) {
                byte b7 = bArr[i15];
                int i17 = i5;
                int i18 = b7 & 255;
                if (i18 != b6) {
                    int i19 = iArr2[i18];
                    if (i19 != 0) {
                        iArr[i16] = i19;
                    } else {
                        b6 = b7;
                    }
                }
                i15++;
                i16++;
                i5 = i17;
            }
            i10++;
            bVar2 = bVar;
        }
        Boolean bool = this.f4851;
        this.f4851 = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f4851 == null && z5 && b6 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* renamed from: ˏ, reason: contains not printable characters */
    private void m5673(b bVar) {
        int i5;
        int i6;
        short s5;
        e eVar = this;
        if (bVar != null) {
            eVar.f4836.position(bVar.f4813);
        }
        if (bVar == null) {
            c cVar = eVar.f4844;
            i5 = cVar.f4820;
            i6 = cVar.f4821;
        } else {
            i5 = bVar.f4806;
            i6 = bVar.f4807;
        }
        int i7 = i5 * i6;
        byte[] bArr = eVar.f4841;
        if (bArr == null || bArr.length < i7) {
            eVar.f4841 = eVar.f4835.mo5644(i7);
        }
        byte[] bArr2 = eVar.f4841;
        if (eVar.f4838 == null) {
            eVar.f4838 = new short[4096];
        }
        short[] sArr = eVar.f4838;
        if (eVar.f4839 == null) {
            eVar.f4839 = new byte[4096];
        }
        byte[] bArr3 = eVar.f4839;
        if (eVar.f4840 == null) {
            eVar.f4840 = new byte[4097];
        }
        byte[] bArr4 = eVar.f4840;
        int m5676 = m5676();
        int i8 = 1 << m5676;
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = m5676 + 1;
        int i12 = (1 << i11) - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i8; i14++) {
            sArr[i14] = 0;
            bArr3[i14] = (byte) i14;
        }
        byte[] bArr5 = eVar.f4837;
        int i15 = i11;
        int i16 = i10;
        int i17 = i12;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            if (i13 >= i7) {
                break;
            }
            if (i18 == 0) {
                i18 = m5675();
                if (i18 <= 0) {
                    eVar.f4847 = 3;
                    break;
                }
                i19 = 0;
            }
            i21 += (bArr5[i19] & 255) << i20;
            i19++;
            i18--;
            int i26 = i20 + 8;
            int i27 = i16;
            int i28 = i15;
            int i29 = i23;
            int i30 = i11;
            int i31 = i24;
            while (true) {
                if (i26 < i28) {
                    i23 = i29;
                    i16 = i27;
                    i20 = i26;
                    eVar = this;
                    i24 = i31;
                    i11 = i30;
                    i15 = i28;
                    break;
                }
                int i32 = i10;
                int i33 = i21 & i17;
                i21 >>= i28;
                i26 -= i28;
                if (i33 == i8) {
                    i17 = i12;
                    i28 = i30;
                    i27 = i32;
                    i10 = i27;
                    i29 = -1;
                } else {
                    if (i33 == i9) {
                        i20 = i26;
                        i24 = i31;
                        i16 = i27;
                        i11 = i30;
                        i10 = i32;
                        i23 = i29;
                        i15 = i28;
                        eVar = this;
                        break;
                    }
                    if (i29 == -1) {
                        bArr2[i22] = bArr3[i33];
                        i22++;
                        i13++;
                        i29 = i33;
                        i31 = i29;
                        i10 = i32;
                        i26 = i26;
                    } else {
                        if (i33 >= i27) {
                            bArr4[i25] = (byte) i31;
                            i25++;
                            s5 = i29;
                        } else {
                            s5 = i33;
                        }
                        while (s5 >= i8) {
                            bArr4[i25] = bArr3[s5];
                            i25++;
                            s5 = sArr[s5];
                        }
                        i31 = bArr3[s5] & 255;
                        byte b6 = (byte) i31;
                        bArr2[i22] = b6;
                        while (true) {
                            i22++;
                            i13++;
                            if (i25 <= 0) {
                                break;
                            }
                            i25--;
                            bArr2[i22] = bArr4[i25];
                        }
                        byte[] bArr6 = bArr4;
                        if (i27 < 4096) {
                            sArr[i27] = (short) i29;
                            bArr3[i27] = b6;
                            i27++;
                            if ((i27 & i17) == 0 && i27 < 4096) {
                                i28++;
                                i17 += i27;
                            }
                        }
                        i29 = i33;
                        i10 = i32;
                        i26 = i26;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i22, i7, (byte) 0);
    }

    /* renamed from: י, reason: contains not printable characters */
    private Bitmap m5674() {
        Boolean bool = this.f4851;
        Bitmap mo5642 = this.f4835.mo5642(this.f4850, this.f4849, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f4852);
        mo5642.setHasAlpha(true);
        return mo5642;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private int m5675() {
        int m5676 = m5676();
        if (m5676 <= 0) {
            return m5676;
        }
        ByteBuffer byteBuffer = this.f4836;
        byteBuffer.get(this.f4837, 0, Math.min(m5676, byteBuffer.remaining()));
        return m5676;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private int m5676() {
        return this.f4836.get() & 255;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private Bitmap m5677(b bVar, b bVar2) {
        int i5;
        int i6;
        Bitmap bitmap;
        int[] iArr = this.f4842;
        int i7 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f4845;
            if (bitmap2 != null) {
                this.f4835.mo5647(bitmap2);
            }
            this.f4845 = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f4810 == 3 && this.f4845 == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i6 = bVar2.f4810) > 0) {
            if (i6 == 2) {
                if (!bVar.f4809) {
                    c cVar = this.f4844;
                    int i8 = cVar.f4826;
                    if (bVar.f4814 == null || cVar.f4824 != bVar.f4811) {
                        i7 = i8;
                    }
                }
                int i9 = bVar2.f4807;
                int i10 = this.f4848;
                int i11 = i9 / i10;
                int i12 = bVar2.f4805 / i10;
                int i13 = bVar2.f4806 / i10;
                int i14 = bVar2.f4804 / i10;
                int i15 = this.f4850;
                int i16 = (i12 * i15) + i14;
                int i17 = (i11 * i15) + i16;
                while (i16 < i17) {
                    int i18 = i16 + i13;
                    for (int i19 = i16; i19 < i18; i19++) {
                        iArr[i19] = i7;
                    }
                    i16 += this.f4850;
                }
            } else if (i6 == 3 && (bitmap = this.f4845) != null) {
                int i20 = this.f4850;
                bitmap.getPixels(iArr, 0, i20, 0, 0, i20, this.f4849);
            }
        }
        m5673(bVar);
        if (bVar.f4808 || this.f4848 != 1) {
            m5671(bVar);
        } else {
            m5672(bVar);
        }
        if (this.f4846 && ((i5 = bVar.f4810) == 0 || i5 == 1)) {
            if (this.f4845 == null) {
                this.f4845 = m5674();
            }
            Bitmap bitmap3 = this.f4845;
            int i21 = this.f4850;
            bitmap3.setPixels(iArr, 0, i21, 0, 0, i21, this.f4849);
        }
        Bitmap m5674 = m5674();
        int i22 = this.f4850;
        m5674.setPixels(iArr, 0, i22, 0, 0, i22, this.f4849);
        return m5674;
    }

    @Override // b1.a
    public void clear() {
        this.f4844 = null;
        byte[] bArr = this.f4841;
        if (bArr != null) {
            this.f4835.mo5643(bArr);
        }
        int[] iArr = this.f4842;
        if (iArr != null) {
            this.f4835.mo5645(iArr);
        }
        Bitmap bitmap = this.f4845;
        if (bitmap != null) {
            this.f4835.mo5647(bitmap);
        }
        this.f4845 = null;
        this.f4836 = null;
        this.f4851 = null;
        byte[] bArr2 = this.f4837;
        if (bArr2 != null) {
            this.f4835.mo5643(bArr2);
        }
    }

    @Override // b1.a
    public ByteBuffer getData() {
        return this.f4836;
    }

    @Override // b1.a
    /* renamed from: ʻ */
    public int mo5634() {
        return this.f4843;
    }

    @Override // b1.a
    /* renamed from: ʼ */
    public synchronized Bitmap mo5635() {
        if (this.f4844.f4817 <= 0 || this.f4843 < 0) {
            String str = f4832;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f4844.f4817 + ", framePointer=" + this.f4843);
            }
            this.f4847 = 1;
        }
        int i5 = this.f4847;
        if (i5 != 1 && i5 != 2) {
            this.f4847 = 0;
            if (this.f4837 == null) {
                this.f4837 = this.f4835.mo5644(255);
            }
            b bVar = this.f4844.f4819.get(this.f4843);
            int i6 = this.f4843 - 1;
            b bVar2 = i6 >= 0 ? this.f4844.f4819.get(i6) : null;
            int[] iArr = bVar.f4814;
            if (iArr == null) {
                iArr = this.f4844.f4815;
            }
            this.f4833 = iArr;
            if (iArr == null) {
                String str2 = f4832;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f4843);
                }
                this.f4847 = 1;
                return null;
            }
            if (bVar.f4809) {
                System.arraycopy(iArr, 0, this.f4834, 0, iArr.length);
                int[] iArr2 = this.f4834;
                this.f4833 = iArr2;
                iArr2[bVar.f4811] = 0;
                if (bVar.f4810 == 2 && this.f4843 == 0) {
                    this.f4851 = Boolean.TRUE;
                }
            }
            return m5677(bVar, bVar2);
        }
        String str3 = f4832;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f4847);
        }
        return null;
    }

    @Override // b1.a
    /* renamed from: ʽ */
    public void mo5636() {
        this.f4843 = (this.f4843 + 1) % this.f4844.f4817;
    }

    @Override // b1.a
    /* renamed from: ʾ */
    public int mo5637() {
        return this.f4844.f4817;
    }

    @Override // b1.a
    /* renamed from: ʿ */
    public int mo5638() {
        int i5;
        if (this.f4844.f4817 <= 0 || (i5 = this.f4843) < 0) {
            return 0;
        }
        return m5678(i5);
    }

    @Override // b1.a
    /* renamed from: ˆ */
    public int mo5639() {
        return this.f4836.limit() + this.f4841.length + (this.f4842.length * 4);
    }

    @Override // b1.a
    /* renamed from: ˈ */
    public void mo5640(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f4852 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // b1.a
    /* renamed from: ˉ */
    public void mo5641() {
        this.f4843 = -1;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public int m5678(int i5) {
        if (i5 >= 0) {
            c cVar = this.f4844;
            if (i5 < cVar.f4817) {
                return cVar.f4819.get(i5).f4812;
            }
        }
        return -1;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public synchronized void m5679(c cVar, ByteBuffer byteBuffer, int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i5);
        }
        int highestOneBit = Integer.highestOneBit(i5);
        this.f4847 = 0;
        this.f4844 = cVar;
        this.f4843 = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4836 = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f4836.order(ByteOrder.LITTLE_ENDIAN);
        this.f4846 = false;
        Iterator<b> it = cVar.f4819.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f4810 == 3) {
                this.f4846 = true;
                break;
            }
        }
        this.f4848 = highestOneBit;
        int i6 = cVar.f4820;
        this.f4850 = i6 / highestOneBit;
        int i7 = cVar.f4821;
        this.f4849 = i7 / highestOneBit;
        this.f4841 = this.f4835.mo5644(i6 * i7);
        this.f4842 = this.f4835.mo5646(this.f4850 * this.f4849);
    }

    public e(a.InterfaceC0069a interfaceC0069a) {
        this.f4834 = new int[256];
        this.f4852 = Bitmap.Config.ARGB_8888;
        this.f4835 = interfaceC0069a;
        this.f4844 = new c();
    }
}
