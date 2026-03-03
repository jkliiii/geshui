package c5;

import java.io.UnsupportedEncodingException;

/* compiled from: Base64.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final byte[] f5007 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final byte[] f5008 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m5870(byte[] bArr) {
        return m5871(bArr, f5007);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m5871(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int i7 = i5 + 1;
            bArr3[i5] = bArr2[(bArr[i6] & 255) >> 2];
            int i8 = i7 + 1;
            int i9 = i6 + 1;
            bArr3[i7] = bArr2[((bArr[i6] & 3) << 4) | ((bArr[i9] & 255) >> 4)];
            int i10 = i8 + 1;
            int i11 = (bArr[i9] & 15) << 2;
            int i12 = i6 + 2;
            bArr3[i8] = bArr2[i11 | ((bArr[i12] & 255) >> 6)];
            i5 = i10 + 1;
            bArr3[i10] = bArr2[bArr[i12] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i13 = i5 + 1;
            bArr3[i5] = bArr2[(bArr[length] & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i14] = 61;
            bArr3[i14 + 1] = 61;
        } else if (length2 == 2) {
            int i15 = i5 + 1;
            bArr3[i5] = bArr2[(bArr[length] & 255) >> 2];
            int i16 = i15 + 1;
            int i17 = (bArr[length] & 3) << 4;
            int i18 = length + 1;
            bArr3[i15] = bArr2[((bArr[i18] & 255) >> 4) | i17];
            bArr3[i16] = bArr2[(bArr[i18] & 15) << 2];
            bArr3[i16 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }
}
