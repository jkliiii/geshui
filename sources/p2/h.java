package p2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h implements Closeable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final InputStream f10313;

    /* renamed from: ʿ, reason: contains not printable characters */
    private byte[] f10314;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f10315;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f10316;

    /* compiled from: StrictLineReader.java */
    class a extends ByteArrayOutputStream {
        a(int i5) {
            super(i5);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i5 = ((ByteArrayOutputStream) this).count;
            if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                i5--;
            }
            return new String(((ByteArrayOutputStream) this).buf, 0, i5);
        }
    }

    public h(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m11141() throws IOException {
        InputStream inputStream = this.f10313;
        byte[] bArr = this.f10314;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f10315 = 0;
        this.f10316 = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f10313) {
            if (this.f10314 != null) {
                this.f10314 = null;
                this.f10313.close();
            }
        }
    }

    public int readInt() throws IOException {
        String m11142 = m11142();
        try {
            return Integer.parseInt(m11142);
        } catch (NumberFormatException unused) {
            throw new IOException("expected an int but was \"" + m11142 + "\"");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002b  */
    /* renamed from: ˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m11142() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f10313
            monitor-enter(r0)
            byte[] r1 = r7.f10314     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L79
            int r1 = r7.f10315     // Catch: java.lang.Throwable -> L81
            int r2 = r7.f10316     // Catch: java.lang.Throwable -> L81
            if (r1 < r2) goto L10
            r7.m11141()     // Catch: java.lang.Throwable -> L81
        L10:
            int r1 = r7.f10315     // Catch: java.lang.Throwable -> L81
        L12:
            int r2 = r7.f10316     // Catch: java.lang.Throwable -> L81
            r3 = 10
            if (r1 == r2) goto L3b
            byte[] r2 = r7.f10314     // Catch: java.lang.Throwable -> L81
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L81
            if (r4 != r3) goto L38
            int r3 = r7.f10315     // Catch: java.lang.Throwable -> L81
            if (r1 == r3) goto L2b
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L81
            r6 = 13
            if (r5 != r6) goto L2b
            goto L2c
        L2b:
            r4 = r1
        L2c:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L81
            int r4 = r4 - r3
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L81
            int r1 = r1 + 1
            r7.f10315 = r1     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            return r5
        L38:
            int r1 = r1 + 1
            goto L12
        L3b:
            p2.h$a r1 = new p2.h$a     // Catch: java.lang.Throwable -> L81
            int r2 = r7.f10316     // Catch: java.lang.Throwable -> L81
            int r4 = r7.f10315     // Catch: java.lang.Throwable -> L81
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L81
        L47:
            byte[] r2 = r7.f10314     // Catch: java.lang.Throwable -> L81
            int r4 = r7.f10315     // Catch: java.lang.Throwable -> L81
            int r5 = r7.f10316     // Catch: java.lang.Throwable -> L81
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L81
            r2 = -1
            r7.f10316 = r2     // Catch: java.lang.Throwable -> L81
            r7.m11141()     // Catch: java.lang.Throwable -> L81
            int r2 = r7.f10315     // Catch: java.lang.Throwable -> L81
        L59:
            int r4 = r7.f10316     // Catch: java.lang.Throwable -> L81
            if (r2 == r4) goto L47
            byte[] r4 = r7.f10314     // Catch: java.lang.Throwable -> L81
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L81
            if (r5 != r3) goto L76
            int r3 = r7.f10315     // Catch: java.lang.Throwable -> L81
            if (r2 == r3) goto L6c
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L81
        L6c:
            int r2 = r2 + 1
            r7.f10315 = r2     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            return r1
        L76:
            int r2 = r2 + 1
            goto L59
        L79:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L81
            throw r1     // Catch: java.lang.Throwable -> L81
        L81:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            goto L85
        L84:
            throw r1
        L85:
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.m11142():java.lang.String");
    }

    public h(InputStream inputStream, int i5, Charset charset) {
        if (inputStream == null) {
            throw new NullPointerException("in == null");
        }
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(v2.c.f11698) && !charset.equals(v2.c.f11699)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f10313 = inputStream;
        this.f10314 = new byte[i5];
    }
}
