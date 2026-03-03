package l1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d0 extends FilterInputStream {

    /* renamed from: ʾ, reason: contains not printable characters */
    private volatile byte[] f8944;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f8945;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f8946;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f8947;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f8948;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final f1.b f8949;

    /* compiled from: RecyclableBufferedInputStream.java */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public d0(InputStream inputStream, f1.b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private int m9595(InputStream inputStream, byte[] bArr) throws IOException {
        int i5 = this.f8947;
        if (i5 != -1) {
            int i6 = this.f8948 - i5;
            int i7 = this.f8946;
            if (i6 < i7) {
                if (i5 == 0 && i7 > bArr.length && this.f8945 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i7) {
                        i7 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f8949.mo8522(i7, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f8944 = bArr2;
                    this.f8949.put(bArr);
                    bArr = bArr2;
                } else if (i5 > 0) {
                    System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
                }
                int i8 = this.f8948 - this.f8947;
                this.f8948 = i8;
                this.f8947 = 0;
                this.f8945 = 0;
                int read = inputStream.read(bArr, i8, bArr.length - i8);
                int i9 = this.f8948;
                if (read > 0) {
                    i9 += read;
                }
                this.f8945 = i9;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f8947 = -1;
            this.f8948 = 0;
            this.f8945 = read2;
        }
        return read2;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static IOException m9596() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f8944 == null || inputStream == null) {
            throw m9596();
        }
        return (this.f8945 - this.f8948) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f8944 != null) {
            this.f8949.put(this.f8944);
            this.f8944 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        this.f8946 = Math.max(this.f8946, i5);
        this.f8947 = this.f8948;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f8944;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m9596();
        }
        if (this.f8948 >= this.f8945 && m9595(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f8944 && (bArr = this.f8944) == null) {
            throw m9596();
        }
        int i5 = this.f8945;
        int i6 = this.f8948;
        if (i5 - i6 <= 0) {
            return -1;
        }
        this.f8948 = i6 + 1;
        return bArr[i6] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f8944 == null) {
            throw new IOException("Stream is closed");
        }
        int i5 = this.f8947;
        if (-1 == i5) {
            throw new a("Mark has been invalidated, pos: " + this.f8948 + " markLimit: " + this.f8946);
        }
        this.f8948 = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j5) throws IOException {
        if (j5 < 1) {
            return 0L;
        }
        byte[] bArr = this.f8944;
        if (bArr == null) {
            throw m9596();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m9596();
        }
        int i5 = this.f8945;
        int i6 = this.f8948;
        if (i5 - i6 >= j5) {
            this.f8948 = (int) (i6 + j5);
            return j5;
        }
        long j6 = i5 - i6;
        this.f8948 = i5;
        if (this.f8947 == -1 || j5 > this.f8946) {
            long skip = inputStream.skip(j5 - j6);
            if (skip > 0) {
                this.f8947 = -1;
            }
            return j6 + skip;
        }
        if (m9595(inputStream, bArr) == -1) {
            return j6;
        }
        int i7 = this.f8945;
        int i8 = this.f8948;
        if (i7 - i8 >= j5 - j6) {
            this.f8948 = (int) ((i8 + j5) - j6);
            return j5;
        }
        long j7 = (j6 + i7) - i8;
        this.f8948 = i7;
        return j7;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public synchronized void m9597() {
        this.f8946 = this.f8944.length;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public synchronized void m9598() {
        if (this.f8944 != null) {
            this.f8949.put(this.f8944);
            this.f8944 = null;
        }
    }

    d0(InputStream inputStream, f1.b bVar, int i5) {
        super(inputStream);
        this.f8947 = -1;
        this.f8949 = bVar;
        this.f8944 = (byte[]) bVar.mo8522(i5, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i5, int i6) throws IOException {
        int i7;
        int i8;
        byte[] bArr2 = this.f8944;
        if (bArr2 == null) {
            throw m9596();
        }
        if (i6 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i9 = this.f8948;
            int i10 = this.f8945;
            if (i9 < i10) {
                int i11 = i10 - i9 >= i6 ? i6 : i10 - i9;
                System.arraycopy(bArr2, i9, bArr, i5, i11);
                this.f8948 += i11;
                if (i11 == i6 || inputStream.available() == 0) {
                    return i11;
                }
                i5 += i11;
                i7 = i6 - i11;
            } else {
                i7 = i6;
            }
            while (true) {
                if (this.f8947 == -1 && i7 >= bArr2.length) {
                    i8 = inputStream.read(bArr, i5, i7);
                    if (i8 == -1) {
                        return i7 != i6 ? i6 - i7 : -1;
                    }
                } else {
                    if (m9595(inputStream, bArr2) == -1) {
                        return i7 != i6 ? i6 - i7 : -1;
                    }
                    if (bArr2 != this.f8944 && (bArr2 = this.f8944) == null) {
                        throw m9596();
                    }
                    int i12 = this.f8945;
                    int i13 = this.f8948;
                    i8 = i12 - i13 >= i7 ? i7 : i12 - i13;
                    System.arraycopy(bArr2, i13, bArr, i5, i8);
                    this.f8948 += i8;
                }
                i7 -= i8;
                if (i7 == 0) {
                    return i6;
                }
                if (inputStream.available() == 0) {
                    return i6 - i7;
                }
                i5 += i8;
            }
        } else {
            throw m9596();
        }
    }
}
