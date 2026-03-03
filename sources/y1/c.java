package y1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c extends FilterInputStream {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final long f12442;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f12443;

    private c(InputStream inputStream, long j5) {
        super(inputStream);
        this.f12442 = j5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private int m12869(int i5) throws IOException {
        if (i5 >= 0) {
            this.f12443 += i5;
        } else if (this.f12442 - this.f12443 > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f12442 + ", but read: " + this.f12443);
        }
        return i5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static InputStream m12870(InputStream inputStream, long j5) {
        return new c(inputStream, j5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f12442 - this.f12443, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m12869(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i5, int i6) throws IOException {
        return m12869(super.read(bArr, i5, i6));
    }
}
