package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c extends OutputStream {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final OutputStream f5217;

    /* renamed from: ʿ, reason: contains not printable characters */
    private byte[] f5218;

    /* renamed from: ˆ, reason: contains not printable characters */
    private f1.b f5219;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f5220;

    public c(OutputStream outputStream, f1.b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m6142() throws IOException {
        int i5 = this.f5220;
        if (i5 > 0) {
            this.f5217.write(this.f5218, 0, i5);
            this.f5220 = 0;
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m6143() throws IOException {
        if (this.f5220 == this.f5218.length) {
            m6142();
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m6144() {
        byte[] bArr = this.f5218;
        if (bArr != null) {
            this.f5219.put(bArr);
            this.f5218 = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f5217.close();
            m6144();
        } catch (Throwable th) {
            this.f5217.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m6142();
        this.f5217.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        byte[] bArr = this.f5218;
        int i6 = this.f5220;
        this.f5220 = i6 + 1;
        bArr[i6] = (byte) i5;
        m6143();
    }

    c(OutputStream outputStream, f1.b bVar, int i5) {
        this.f5217 = outputStream;
        this.f5219 = bVar;
        this.f5218 = (byte[]) bVar.mo8522(i5, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = 0;
        do {
            int i8 = i6 - i7;
            int i9 = i5 + i7;
            int i10 = this.f5220;
            if (i10 == 0 && i8 >= this.f5218.length) {
                this.f5217.write(bArr, i9, i8);
                return;
            }
            int min = Math.min(i8, this.f5218.length - i10);
            System.arraycopy(bArr, i9, this.f5218, this.f5220, min);
            this.f5220 += min;
            i7 += min;
            m6143();
        } while (i7 < i6);
    }
}
