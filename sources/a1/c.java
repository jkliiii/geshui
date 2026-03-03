package a1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c implements Closeable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final InputStream f83;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Charset f84;

    /* renamed from: ˆ, reason: contains not printable characters */
    private byte[] f85;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f86;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f87;

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
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i5, c.this.f84.name());
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m175() throws IOException {
        InputStream inputStream = this.f83;
        byte[] bArr = this.f85;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f86 = 0;
        this.f87 = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f83) {
            if (this.f85 != null) {
                this.f85 = null;
                this.f83.close();
            }
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public boolean m176() {
        return this.f87 == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002b  */
    /* renamed from: ﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m177() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f83
            monitor-enter(r0)
            byte[] r1 = r7.f85     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7f
            int r1 = r7.f86     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f87     // Catch: java.lang.Throwable -> L87
            if (r1 < r2) goto L10
            r7.m175()     // Catch: java.lang.Throwable -> L87
        L10:
            int r1 = r7.f86     // Catch: java.lang.Throwable -> L87
        L12:
            int r2 = r7.f87     // Catch: java.lang.Throwable -> L87
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.f85     // Catch: java.lang.Throwable -> L87
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L87
            if (r4 != r3) goto L3e
            int r3 = r7.f86     // Catch: java.lang.Throwable -> L87
            if (r1 == r3) goto L2b
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L87
            r6 = 13
            if (r5 != r6) goto L2b
            goto L2c
        L2b:
            r4 = r1
        L2c:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L87
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f84     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + 1
            r7.f86 = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r5
        L3e:
            int r1 = r1 + 1
            goto L12
        L41:
            a1.c$a r1 = new a1.c$a     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f87     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f86     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
        L4d:
            byte[] r2 = r7.f85     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f86     // Catch: java.lang.Throwable -> L87
            int r5 = r7.f87     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L87
            r2 = -1
            r7.f87 = r2     // Catch: java.lang.Throwable -> L87
            r7.m175()     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f86     // Catch: java.lang.Throwable -> L87
        L5f:
            int r4 = r7.f87     // Catch: java.lang.Throwable -> L87
            if (r2 == r4) goto L4d
            byte[] r4 = r7.f85     // Catch: java.lang.Throwable -> L87
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L87
            if (r5 != r3) goto L7c
            int r3 = r7.f86     // Catch: java.lang.Throwable -> L87
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L87
        L72:
            int r2 = r2 + 1
            r7.f86 = r2     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r1
        L7c:
            int r2 = r2 + 1
            goto L5f
        L7f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            throw r1     // Catch: java.lang.Throwable -> L87
        L87:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            goto L8b
        L8a:
            throw r1
        L8b:
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c.m177():java.lang.String");
    }

    public c(InputStream inputStream, int i5, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f89)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f83 = inputStream;
        this.f84 = charset;
        this.f85 = new byte[i5];
    }
}
