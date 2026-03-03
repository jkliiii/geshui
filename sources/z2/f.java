package z2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkableInputStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class f extends InputStream {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final InputStream f12788;

    /* renamed from: ʿ, reason: contains not printable characters */
    private long f12789;

    /* renamed from: ˆ, reason: contains not printable characters */
    private long f12790;

    /* renamed from: ˈ, reason: contains not printable characters */
    private long f12791;

    /* renamed from: ˉ, reason: contains not printable characters */
    private long f12792 = -1;

    public f(InputStream inputStream) {
        this.f12788 = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m13175(long j5) {
        try {
            long j6 = this.f12790;
            long j7 = this.f12789;
            if (j6 >= j7 || j7 > this.f12791) {
                this.f12790 = j7;
                this.f12788.mark((int) (j5 - j7));
            } else {
                this.f12788.reset();
                this.f12788.mark((int) (j5 - this.f12790));
                m13176(this.f12790, this.f12789);
            }
            this.f12791 = j5;
        } catch (IOException e5) {
            throw new IllegalStateException("Unable to mark: " + e5);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m13176(long j5, long j6) throws IOException {
        while (j5 < j6) {
            long skip = this.f12788.skip(j6 - j5);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j5 += skip;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f12788.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12788.close();
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        this.f12792 = m13178(i5);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f12788.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f12788.read();
        if (read != -1) {
            this.f12789++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        m13177(this.f12792);
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        long skip = this.f12788.skip(j5);
        this.f12789 += skip;
        return skip;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m13177(long j5) throws IOException {
        if (this.f12789 > this.f12791 || j5 < this.f12790) {
            throw new IOException("Cannot reset");
        }
        this.f12788.reset();
        m13176(this.f12790, j5);
        this.f12789 = j5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public long m13178(int i5) {
        long j5 = this.f12789 + i5;
        if (this.f12791 < j5) {
            m13175(j5);
        }
        return this.f12789;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read = this.f12788.read(bArr);
        if (read != -1) {
            this.f12789 += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        int read = this.f12788.read(bArr, i5, i6);
        if (read != -1) {
            this.f12789 += read;
        }
        return read;
    }
}
