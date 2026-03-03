package c5;

import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class u {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final Charset f5058 = Charset.forName("UTF-8");

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m5977(byte[] bArr, int i5, byte[] bArr2, int i6, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (bArr[i8 + i5] != bArr2[i8 + i6]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m5978(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7)));
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m5979(int i5) {
        return ((i5 & 255) << 24) | (((-16777216) & i5) >>> 24) | ((16711680 & i5) >>> 8) | ((65280 & i5) << 8);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static short m5980(short s5) {
        int i5 = s5 & 65535;
        return (short) (((i5 & 255) << 8) | ((65280 & i5) >>> 8));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m5981(Throwable th) {
        m5982(th);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static <T extends Throwable> void m5982(Throwable th) throws Throwable {
        throw th;
    }
}
