package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: Encoding.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f {
    /* renamed from: ʻ, reason: contains not printable characters */
    static int m4571(int i5) {
        return (((i5 + 8) - 1) & (-8)) / 8;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static byte[] m4572(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static RuntimeException m4573(String str) {
        return new IllegalStateException(str);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static byte[] m4574(InputStream inputStream, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int read = inputStream.read(bArr, i6, i5 - i6);
            if (read < 0) {
                throw m4573("Not enough bytes to read: " + i5);
            }
            i6 += read;
        }
        return bArr;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static byte[] m4575(InputStream inputStream, int i5, int i6) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int i8 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i5) {
                int read = inputStream.read(bArr2);
                if (read < 0) {
                    throw m4573("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i8 += inflater.inflate(bArr, i8, i6 - i8);
                    i7 += read;
                } catch (DataFormatException e5) {
                    throw m4573(e5.getMessage());
                }
            }
            if (i7 == i5) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw m4573("Inflater did not finish");
            }
            throw m4573("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i7);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static String m4576(InputStream inputStream, int i5) throws IOException {
        return new String(m4574(inputStream, i5), StandardCharsets.UTF_8);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static long m4577(InputStream inputStream, int i5) throws IOException {
        byte[] m4574 = m4574(inputStream, i5);
        long j5 = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            j5 += (m4574[i6] & 255) << (i6 * 8);
        }
        return j5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static int m4578(InputStream inputStream) throws IOException {
        return (int) m4577(inputStream, 2);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static long m4579(InputStream inputStream) throws IOException {
        return m4577(inputStream, 4);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static int m4580(InputStream inputStream) throws IOException {
        return (int) m4577(inputStream, 1);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static int m4581(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m4582(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    static void m4583(OutputStream outputStream, byte[] bArr) throws IOException {
        m4587(outputStream, bArr.length);
        byte[] m4572 = m4572(bArr);
        m4587(outputStream, m4572.length);
        outputStream.write(m4572);
    }

    /* renamed from: י, reason: contains not printable characters */
    static void m4584(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static void m4585(OutputStream outputStream, long j5, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = (byte) ((j5 >> (i6 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    static void m4586(OutputStream outputStream, int i5) throws IOException {
        m4585(outputStream, i5, 2);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    static void m4587(OutputStream outputStream, long j5) throws IOException {
        m4585(outputStream, j5, 4);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    static void m4588(OutputStream outputStream, int i5) throws IOException {
        m4585(outputStream, i5, 1);
    }
}
