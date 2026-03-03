package p3;

import java.io.IOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: DnsResponse.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d extends p3.a {

    /* renamed from: ʿ, reason: contains not printable characters */
    private long f10343;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f10344;

    /* renamed from: ˈ, reason: contains not printable characters */
    private String f10345;

    /* renamed from: ˉ, reason: contains not printable characters */
    private p3.b f10346;

    /* renamed from: ˊ, reason: contains not printable characters */
    private byte[] f10347;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f10348;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f10349;

    /* renamed from: ˏ, reason: contains not printable characters */
    private List<o3.f> f10350;

    /* renamed from: ˑ, reason: contains not printable characters */
    private List<o3.f> f10351;

    /* renamed from: י, reason: contains not printable characters */
    private List<o3.f> f10352;

    /* compiled from: DnsResponse.java */
    private static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f10353;

        /* renamed from: ʼ, reason: contains not printable characters */
        private String f10354;

        private b() {
        }
    }

    /* compiled from: DnsResponse.java */
    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f10355;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f10356;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f10357;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f10358;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final List<o3.f> f10359;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˉ, reason: contains not printable characters */
        public void m11172(o3.f fVar) {
            if (fVar != null) {
                this.f10359.add(fVar);
            }
        }

        private c(String str, int i5, int i6) {
            this.f10355 = str;
            this.f10356 = i5;
            this.f10357 = i6;
            this.f10358 = 0;
            this.f10359 = new ArrayList();
        }
    }

    d(String str, int i5, p3.b bVar, byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("response data is empty");
        }
        this.f10345 = str;
        this.f10344 = i5;
        this.f10346 = bVar;
        this.f10347 = bArr;
        this.f10343 = new Date().getTime() / 1000;
        m11152();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private b m11151(int i5) throws IOException {
        StringBuilder sb = new StringBuilder();
        b bVar = new b();
        int i6 = 128;
        int i7 = i5;
        do {
            int m11159 = m11159(i7);
            int i8 = m11159 & 192;
            if (i8 == 192) {
                if (bVar.f10353 < 1) {
                    bVar.f10353 = (i7 + 2) - i5;
                }
                i7 = m11159(i7 + 1) | ((m11159 & 63) << 8);
            } else {
                if (i8 > 0) {
                    return null;
                }
                i7++;
                if (m11159 > 0) {
                    if (sb.length() > 0) {
                        sb.append(".");
                    }
                    int i9 = i7 + m11159;
                    sb.append(IDN.toUnicode(new String(Arrays.copyOfRange(this.f10347, i7, i9))));
                    i7 = i9;
                }
            }
            if (m11159 <= 0) {
                break;
            }
            i6--;
        } while (i6 > 0);
        bVar.f10354 = sb.toString();
        if (bVar.f10353 < 1) {
            bVar.f10353 = i7 - i5;
        }
        return bVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m11152() throws IOException {
        if (this.f10347.length < 12) {
            throw new IOException("response data too small");
        }
        m11153();
        int m11154 = m11154();
        c cVar = new c("answer", m11157(6), m11154);
        m11155(cVar);
        this.f10350 = cVar.f10359;
        int i5 = m11154 + cVar.f10358;
        c cVar2 = new c("authority", m11157(8), i5);
        m11155(cVar2);
        this.f10351 = cVar2.f10359;
        String str = "additional";
        c cVar3 = new c(str, m11157(10), i5 + cVar2.f10358);
        m11155(cVar3);
        this.f10352 = cVar3.f10359;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m11153() throws IOException {
        short m11157 = m11157(0);
        this.f10318 = m11157;
        if (m11157 != this.f10346.f10318) {
            throw new IOException("question id error");
        }
        int m11159 = m11159(2);
        if ((m11159(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f10319 = (m11159 >> 3) & 7;
        this.f10348 = (m11159 >> 2) & 1;
        this.f10320 = m11159 & 1;
        int m111592 = m11159(3);
        this.f10321 = (m111592 >> 7) & 1;
        this.f10349 = m111592 & 15;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m11154() throws IOException {
        int i5 = 12;
        for (int m11157 = m11157(4); m11157 > 0; m11157--) {
            b m11151 = m11151(i5);
            if (m11151 == null) {
                throw new IOException("read Question error");
            }
            i5 += m11151.f10353 + 4;
        }
        return i5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m11155(c cVar) throws IOException {
        int i5 = cVar.f10357;
        for (int i6 = cVar.f10356; i6 > 0; i6--) {
            b m11151 = m11151(i5);
            if (m11151 == null) {
                throw new IOException("read " + cVar.f10355 + " error");
            }
            int i7 = i5 + m11151.f10353;
            short m11157 = m11157(i7);
            int i8 = i7 + 2;
            short m111572 = m11157(i8);
            int i9 = i8 + 2;
            int m11158 = m11158(i9);
            int i10 = i9 + 4;
            short m111573 = m11157(i10);
            int i11 = i10 + 2;
            String m11156 = m11156(m11157, i11, m111573);
            if (m111572 == 1 && (m11157 == 5 || m11157 == this.f10346.m11143())) {
                cVar.m11172(new o3.f(m11156, m11157, m11158, this.f10343, this.f10344, this.f10345));
            }
            i5 = i11 + m111573;
        }
        cVar.f10358 = i5 - cVar.f10357;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private String m11156(int i5, int i6, int i7) throws IOException {
        if (i5 != 1) {
            if (i5 != 5) {
                if (i5 != 16) {
                    if (i5 == 28 && i7 == 16) {
                        StringBuilder sb = new StringBuilder();
                        int i8 = 0;
                        while (i8 < 16) {
                            sb.append(i8 > 0 ? ":" : BuildConfig.FLAVOR);
                            int i9 = i6 + i8;
                            sb.append(m11159(i9));
                            sb.append(m11159(i9 + 1));
                            i8 += 2;
                        }
                        return sb.toString();
                    }
                } else if (i7 > 0) {
                    int i10 = i7 + i6;
                    byte[] bArr = this.f10347;
                    if (i10 < bArr.length) {
                        return IDN.toUnicode(new String(Arrays.copyOfRange(bArr, i6, i10)));
                    }
                }
            } else if (i7 > 1) {
                return m11151(i6).f10354;
            }
        } else if (i7 == 4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m11159(i6));
            for (int i11 = 1; i11 < 4; i11++) {
                sb2.append(".");
                sb2.append(m11159(i6 + i11));
            }
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private short m11157(int i5) throws IOException {
        int i6 = i5 + 1;
        byte[] bArr = this.f10347;
        if (i6 < bArr.length) {
            return (short) (((bArr[i5] & 255) << 8) + (bArr[i6] & 255));
        }
        throw new IOException("read response data out of range");
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int m11158(int i5) throws IOException {
        int i6 = i5 + 3;
        byte[] bArr = this.f10347;
        if (i6 >= bArr.length) {
            throw new IOException("read response data out of range");
        }
        int i7 = (bArr[i5] & 255) << 24;
        int i8 = (bArr[i5 + 1] & 255) << 16;
        return i7 + i8 + ((bArr[i5 + 2] & 255) << 8) + (bArr[i6] & 255);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int m11159(int i5) throws IOException {
        byte[] bArr = this.f10347;
        if (i5 < bArr.length) {
            return bArr[i5] & 255;
        }
        throw new IOException("read response data out of range");
    }

    public String toString() {
        return String.format(Locale.getDefault(), "{messageId:%d, rd:%d, ra:%d, aa:%d, rCode:%d, server:%s, request:%s, answerArray:%s, authorityArray:%s, additionalArray:%s}", Short.valueOf(this.f10318), Integer.valueOf(this.f10320), Integer.valueOf(this.f10321), Integer.valueOf(this.f10348), Integer.valueOf(this.f10349), this.f10345, this.f10346, this.f10350, this.f10351, this.f10352);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    List<o3.f> m11160() {
        return this.f10350;
    }
}
