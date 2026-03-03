package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g extends FilterInputStream {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final byte[] f5224;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final int f5225;

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final int f5226;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final byte f5227;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5228;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f5224 = bArr;
        int length = bArr.length;
        f5225 = length;
        f5226 = length + 2;
    }

    public g(InputStream inputStream, int i5) {
        super(inputStream);
        if (i5 >= -1 && i5 <= 8) {
            this.f5227 = (byte) i5;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i5;
        int i6 = this.f5228;
        int read = (i6 < 2 || i6 > (i5 = f5226)) ? super.read() : i6 == i5 ? this.f5227 : f5224[i6 - 2] & 255;
        if (read != -1) {
            this.f5228++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) throws IOException {
        long skip = super.skip(j5);
        if (skip > 0) {
            this.f5228 = (int) (this.f5228 + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        int i7;
        int i8 = this.f5228;
        int i9 = f5226;
        if (i8 > i9) {
            i7 = super.read(bArr, i5, i6);
        } else if (i8 == i9) {
            bArr[i5] = this.f5227;
            i7 = 1;
        } else if (i8 < 2) {
            i7 = super.read(bArr, i5, 2 - i8);
        } else {
            int min = Math.min(i9 - i8, i6);
            System.arraycopy(f5224, this.f5228 - 2, bArr, i5, min);
            i7 = min;
        }
        if (i7 > 0) {
            this.f5228 += i7;
        }
        return i7;
    }
}
