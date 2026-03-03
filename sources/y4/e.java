package y4;

import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Http2.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final c5.f f12527 = c5.f.m5920("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final String[] f12528 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: ʽ, reason: contains not printable characters */
    static final String[] f12529 = new String[64];

    /* renamed from: ʾ, reason: contains not printable characters */
    static final String[] f12530 = new String[256];

    static {
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr = f12530;
            if (i6 >= strArr.length) {
                break;
            }
            strArr[i6] = t4.c.m12072("%8s", Integer.toBinaryString(i6)).replace(' ', '0');
            i6++;
        }
        String[] strArr2 = f12529;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = strArr2[1] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr2[i7];
            int i9 = iArr[0];
            String[] strArr3 = f12529;
            int i10 = i9 | i8;
            strArr3[i10] = strArr3[i9] + '|' + strArr3[i8];
            strArr3[i10 | 8] = strArr3[i9] + '|' + strArr3[i8] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f12529;
            if (i5 >= strArr4.length) {
                return;
            }
            if (strArr4[i5] == null) {
                strArr4[i5] = f12530[i5];
            }
            i5++;
        }
    }

    private e() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static String m12967(byte b6, byte b7) {
        if (b7 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (b6 != 2 && b6 != 3) {
            if (b6 == 4 || b6 == 6) {
                return b7 == 1 ? "ACK" : f12530[b7];
            }
            if (b6 != 7 && b6 != 8) {
                String[] strArr = f12529;
                String str = b7 < strArr.length ? strArr[b7] : f12530[b7];
                return (b6 != 5 || (b7 & 4) == 0) ? (b6 != 0 || (b7 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f12530[b7];
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static String m12968(boolean z5, int i5, int i6, byte b6, byte b7) {
        String[] strArr = f12528;
        String m12072 = b6 < strArr.length ? strArr[b6] : t4.c.m12072("0x%02x", Byte.valueOf(b6));
        String m12967 = m12967(b6, b7);
        Object[] objArr = new Object[5];
        objArr[0] = z5 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i5);
        objArr[2] = Integer.valueOf(i6);
        objArr[3] = m12072;
        objArr[4] = m12967;
        return t4.c.m12072("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static IllegalArgumentException m12969(String str, Object... objArr) {
        throw new IllegalArgumentException(t4.c.m12072(str, objArr));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static IOException m12970(String str, Object... objArr) throws IOException {
        throw new IOException(t4.c.m12072(str, objArr));
    }
}
