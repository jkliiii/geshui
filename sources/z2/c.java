package z2;

import android.util.Log;

/* compiled from: Exif.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m13153(byte[] bArr, int i5, int i6) {
        int i7;
        int i8;
        if (bArr == null) {
            return 0;
        }
        int i9 = i6 + i5;
        while (i5 + 3 < i9) {
            int i10 = i5 + 1;
            if ((bArr[i5] & 255) == 255) {
                int i11 = bArr[i10] & 255;
                if (i11 != 255) {
                    i10++;
                    if (i11 != 216 && i11 != 1) {
                        if (i11 != 217 && i11 != 218) {
                            int m13154 = m13154(bArr, i10, 2, false);
                            if (m13154 >= 2 && (i8 = i10 + m13154) <= i9) {
                                if (i11 == 225 && m13154 >= 8 && m13154(bArr, i10 + 2, 4, false) == 1165519206 && m13154(bArr, i10 + 6, 2, false) == 0) {
                                    i5 = i10 + 8;
                                    i7 = m13154 - 8;
                                    break;
                                }
                                i5 = i8;
                            } else {
                                Log.e("CameraExif", "Invalid length");
                                return 0;
                            }
                        }
                    }
                }
                i5 = i10;
            }
            i5 = i10;
        }
        i7 = 0;
        if (i7 > 8) {
            int m131542 = m13154(bArr, i5, 4, false);
            if (m131542 != 1229531648 && m131542 != 1296891946) {
                Log.e("CameraExif", "Invalid byte order");
                return 0;
            }
            boolean z5 = m131542 == 1229531648;
            int m131543 = m13154(bArr, i5 + 4, 4, z5) + 2;
            if (m131543 >= 10 && m131543 <= i7) {
                int i12 = i5 + m131543;
                int i13 = i7 - m131543;
                int m131544 = m13154(bArr, i12 - 2, 2, z5);
                while (true) {
                    int i14 = m131544 - 1;
                    if (m131544 <= 0 || i13 < 12) {
                        break;
                    }
                    if (m13154(bArr, i12, 2, z5) == 274) {
                        int m131545 = m13154(bArr, i12 + 8, 2, z5);
                        if (m131545 == 1) {
                            return 0;
                        }
                        if (m131545 == 3) {
                            return 180;
                        }
                        if (m131545 == 6) {
                            return 90;
                        }
                        if (m131545 == 8) {
                            return 270;
                        }
                        Log.i("CameraExif", "Unsupported orientation");
                        return 0;
                    }
                    i12 += 12;
                    i13 -= 12;
                    m131544 = i14;
                }
            } else {
                Log.e("CameraExif", "Invalid offset");
            }
        }
        return 0;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m13154(byte[] bArr, int i5, int i6, boolean z5) {
        int i7;
        if (z5) {
            i5 += i6 - 1;
            i7 = -1;
        } else {
            i7 = 1;
        }
        int i8 = 0;
        while (true) {
            int i9 = i6 - 1;
            if (i6 <= 0) {
                return i8;
            }
            i8 = (bArr[i5] & 255) | (i8 << 8);
            i5 += i7;
            i6 = i9;
        }
    }
}
