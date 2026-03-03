package okhttp3.internal.publicsuffix;

import c5.e;
import c5.j;
import c5.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import t4.c;
import z4.k;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class PublicSuffixDatabase {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final byte[] f10129 = {42};

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final String[] f10130 = new String[0];

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final String[] f10131 = {"*"};

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final PublicSuffixDatabase f10132 = new PublicSuffixDatabase();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final AtomicBoolean f10133 = new AtomicBoolean(false);

    /* renamed from: ʼ, reason: contains not printable characters */
    private final CountDownLatch f10134 = new CountDownLatch(1);

    /* renamed from: ʽ, reason: contains not printable characters */
    private byte[] f10135;

    /* renamed from: ʾ, reason: contains not printable characters */
    private byte[] f10136;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m11010(byte[] bArr, byte[][] bArr2, int i5) {
        int i6;
        boolean z5;
        int i7;
        int i8;
        int length = bArr.length;
        int i9 = 0;
        while (i9 < length) {
            int i10 = (i9 + length) / 2;
            while (i10 > -1 && bArr[i10] != 10) {
                i10--;
            }
            int i11 = i10 + 1;
            int i12 = 1;
            while (true) {
                i6 = i11 + i12;
                if (bArr[i6] == 10) {
                    break;
                }
                i12++;
            }
            int i13 = i6 - i11;
            int i14 = i5;
            boolean z6 = false;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (z6) {
                    i7 = 46;
                    z5 = false;
                } else {
                    z5 = z6;
                    i7 = bArr2[i14][i15] & 255;
                }
                i8 = i7 - (bArr[i11 + i16] & 255);
                if (i8 == 0) {
                    i16++;
                    i15++;
                    if (i16 == i13) {
                        break;
                    }
                    if (bArr2[i14].length != i15) {
                        z6 = z5;
                    } else {
                        if (i14 == bArr2.length - 1) {
                            break;
                        }
                        i14++;
                        z6 = true;
                        i15 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i8 >= 0) {
                if (i8 <= 0) {
                    int i17 = i13 - i16;
                    int length2 = bArr2[i14].length - i15;
                    while (true) {
                        i14++;
                        if (i14 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i14].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            return new String(bArr, i11, i13, c.f11332);
                        }
                    }
                }
                i9 = i6 + 1;
            }
            length = i11 - 1;
        }
        return null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private String[] m11011(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i5 = 0;
        if (this.f10133.get() || !this.f10133.compareAndSet(false, true)) {
            try {
                this.f10134.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m11014();
        }
        synchronized (this) {
            if (this.f10135 == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i6 = 0; i6 < strArr.length; i6++) {
            bArr[i6] = strArr[i6].getBytes(c.f11332);
        }
        int i7 = 0;
        while (true) {
            str = null;
            if (i7 >= length) {
                str2 = null;
                break;
            }
            str2 = m11010(this.f10135, bArr, i7);
            if (str2 != null) {
                break;
            }
            i7++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i8 = 0; i8 < bArr2.length - 1; i8++) {
                bArr2[i8] = f10129;
                str3 = m11010(this.f10135, bArr2, i8);
                if (str3 != null) {
                    break;
                }
            }
            str3 = null;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            while (true) {
                if (i5 >= length - 1) {
                    break;
                }
                String m11010 = m11010(this.f10136, bArr, i5);
                if (m11010 != null) {
                    str = m11010;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return f10131;
        }
        String[] split = str2 != null ? str2.split("\\.") : f10130;
        String[] split2 = str3 != null ? str3.split("\\.") : f10130;
        return split.length > split2.length ? split : split2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static PublicSuffixDatabase m11012() {
        return f10132;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m11013() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        e m5954 = l.m5954(new j(l.m5958(resourceAsStream)));
        try {
            byte[] bArr = new byte[m5954.readInt()];
            m5954.readFully(bArr);
            byte[] bArr2 = new byte[m5954.readInt()];
            m5954.readFully(bArr2);
            synchronized (this) {
                this.f10135 = bArr;
                this.f10136 = bArr2;
            }
            this.f10134.countDown();
        } finally {
            c.m12059(m5954);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m11014() {
        boolean z5 = false;
        while (true) {
            try {
                try {
                    m11013();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z5 = true;
                } catch (IOException e5) {
                    k.m13239().mo13216(5, "Failed to read public suffix list", e5);
                    if (z5) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public String m11015(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] m11011 = m11011(split);
        if (split.length == m11011.length && m11011[0].charAt(0) != '!') {
            return null;
        }
        if (m11011[0].charAt(0) == '!') {
            length = split.length;
            length2 = m11011.length;
        } else {
            length = split.length;
            length2 = m11011.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i5 = length - length2; i5 < split2.length; i5++) {
            sb.append(split2[i5]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
