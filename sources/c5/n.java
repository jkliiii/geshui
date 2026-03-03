package c5;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class n implements e {

    /* renamed from: ʾ, reason: contains not printable characters */
    public final c f5039 = new c();

    /* renamed from: ʿ, reason: contains not printable characters */
    public final s f5040;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f5041;

    n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f5040 = sVar;
    }

    @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f5041) {
            return;
        }
        this.f5041 = true;
        this.f5040.close();
        this.f5039.m5911();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f5041;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.f5039;
        if (cVar.f5011 == 0 && this.f5040.mo5869(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f5039.read(byteBuffer);
    }

    @Override // c5.e
    public byte readByte() throws IOException {
        mo5899(1L);
        return this.f5039.readByte();
    }

    @Override // c5.e
    public void readFully(byte[] bArr) throws IOException {
        try {
            mo5899(bArr.length);
            this.f5039.readFully(bArr);
        } catch (EOFException e5) {
            int i5 = 0;
            while (true) {
                c cVar = this.f5039;
                long j5 = cVar.f5011;
                if (j5 <= 0) {
                    throw e5;
                }
                int read = cVar.read(bArr, i5, (int) j5);
                if (read == -1) {
                    throw new AssertionError();
                }
                i5 += read;
            }
        }
    }

    @Override // c5.e
    public int readInt() throws IOException {
        mo5899(4L);
        return this.f5039.readInt();
    }

    @Override // c5.e
    public short readShort() throws IOException {
        mo5899(2L);
        return this.f5039.readShort();
    }

    @Override // c5.e
    public void skip(long j5) throws IOException {
        if (this.f5041) {
            throw new IllegalStateException("closed");
        }
        while (j5 > 0) {
            c cVar = this.f5039;
            if (cVar.f5011 == 0 && this.f5040.mo5869(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j5, this.f5039.size());
            this.f5039.skip(min);
            j5 -= min;
        }
    }

    public String toString() {
        return "buffer(" + this.f5040 + ")";
    }

    @Override // c5.e, c5.d
    /* renamed from: ʻ */
    public c mo5872() {
        return this.f5039;
    }

    @Override // c5.s
    /* renamed from: ʼ */
    public t mo5868() {
        return this.f5040.mo5868();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public long m5963(byte b6, long j5, long j6) throws IOException {
        if (this.f5041) {
            throw new IllegalStateException("closed");
        }
        if (j5 < 0 || j6 < j5) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j5), Long.valueOf(j6)));
        }
        while (j5 < j6) {
            long m5902 = this.f5039.m5902(b6, j5, j6);
            if (m5902 == -1) {
                c cVar = this.f5039;
                long j7 = cVar.f5011;
                if (j7 >= j6 || this.f5040.mo5869(cVar, 8192L) == -1) {
                    break;
                }
                j5 = Math.max(j5, j7);
            } else {
                return m5902;
            }
        }
        return -1L;
    }

    @Override // c5.e
    /* renamed from: ʿ */
    public f mo5878(long j5) throws IOException {
        mo5899(j5);
        return this.f5039.mo5878(j5);
    }

    @Override // c5.e
    /* renamed from: ˆ */
    public boolean mo5880(long j5, f fVar) throws IOException {
        return m5964(j5, fVar, 0, fVar.mo5930());
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m5964(long j5, f fVar, int i5, int i6) throws IOException {
        if (this.f5041) {
            throw new IllegalStateException("closed");
        }
        if (j5 < 0 || i5 < 0 || i6 < 0 || fVar.mo5930() - i5 < i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            long j6 = i7 + j5;
            if (!m5965(1 + j6) || this.f5039.m5900(j6) != fVar.mo5924(i5 + i7)) {
                return false;
            }
        }
        return true;
    }

    @Override // c5.e
    /* renamed from: ˊ */
    public String mo5884() throws IOException {
        return mo5897(Long.MAX_VALUE);
    }

    @Override // c5.e
    /* renamed from: ˋ */
    public byte[] mo5886() throws IOException {
        this.f5039.m5889(this.f5040);
        return this.f5039.mo5886();
    }

    @Override // c5.e
    /* renamed from: ˎ */
    public int mo5888() throws IOException {
        mo5899(4L);
        return this.f5039.mo5888();
    }

    @Override // c5.e
    /* renamed from: ˏ */
    public boolean mo5890() throws IOException {
        if (this.f5041) {
            throw new IllegalStateException("closed");
        }
        return this.f5039.mo5890() && this.f5040.mo5869(this.f5039, 8192L) == -1;
    }

    @Override // c5.e
    /* renamed from: ˑ */
    public byte[] mo5892(long j5) throws IOException {
        mo5899(j5);
        return this.f5039.mo5892(j5);
    }

    @Override // c5.s
    /* renamed from: י */
    public long mo5869(c cVar, long j5) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j5 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j5);
        }
        if (this.f5041) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f5039;
        if (cVar2.f5011 == 0 && this.f5040.mo5869(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f5039.mo5869(cVar, Math.min(j5, this.f5039.f5011));
    }

    @Override // c5.e
    /* renamed from: ـ */
    public short mo5895() throws IOException {
        mo5899(2L);
        return this.f5039.mo5895();
    }

    @Override // c5.e
    /* renamed from: ٴ */
    public String mo5897(long j5) throws IOException {
        if (j5 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j5);
        }
        long j6 = j5 == Long.MAX_VALUE ? Long.MAX_VALUE : j5 + 1;
        long m5963 = m5963((byte) 10, 0L, j6);
        if (m5963 != -1) {
            return this.f5039.m5896(m5963);
        }
        if (j6 < Long.MAX_VALUE && m5965(j6) && this.f5039.m5900(j6 - 1) == 13 && m5965(1 + j6) && this.f5039.m5900(j6) == 10) {
            return this.f5039.m5896(j6);
        }
        c cVar = new c();
        c cVar2 = this.f5039;
        cVar2.m5915(cVar, 0L, Math.min(32L, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f5039.size(), j5) + " content=" + cVar.m5875().mo5925() + (char) 8230);
    }

    @Override // c5.e
    /* renamed from: ᐧ */
    public void mo5899(long j5) throws IOException {
        if (!m5965(j5)) {
            throw new EOFException();
        }
    }

    @Override // c5.e
    /* renamed from: ᵎ */
    public long mo5903(byte b6) throws IOException {
        return m5963(b6, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // c5.e
    /* renamed from: ᵔ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo5905() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.mo5899(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.m5965(r3)
            if (r3 == 0) goto L4a
            c5.c r3 = r6.f5039
            long r4 = (long) r1
            byte r3 = r3.m5900(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            c5.c r0 = r6.f5039
            long r0 = r0.mo5905()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.n.mo5905():long");
    }

    @Override // c5.e
    /* renamed from: ᵢ */
    public String mo5907(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f5039.m5889(this.f5040);
        return this.f5039.mo5907(charset);
    }

    @Override // c5.e
    /* renamed from: ⁱ */
    public InputStream mo5909() {
        return new a();
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public boolean m5965(long j5) throws IOException {
        c cVar;
        if (j5 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j5);
        }
        if (this.f5041) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.f5039;
            if (cVar.f5011 >= j5) {
                return true;
            }
        } while (this.f5040.mo5869(cVar, 8192L) != -1);
        return false;
    }

    /* compiled from: RealBufferedSource.java */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            n nVar = n.this;
            if (nVar.f5041) {
                throw new IOException("closed");
            }
            return (int) Math.min(nVar.f5039.f5011, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            n nVar = n.this;
            if (nVar.f5041) {
                throw new IOException("closed");
            }
            c cVar = nVar.f5039;
            if (cVar.f5011 == 0 && nVar.f5040.mo5869(cVar, 8192L) == -1) {
                return -1;
            }
            return n.this.f5039.readByte() & 255;
        }

        public String toString() {
            return n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) throws IOException {
            if (!n.this.f5041) {
                u.m5978(bArr.length, i5, i6);
                n nVar = n.this;
                c cVar = nVar.f5039;
                if (cVar.f5011 == 0 && nVar.f5040.mo5869(cVar, 8192L) == -1) {
                    return -1;
                }
                return n.this.f5039.read(bArr, i5, i6);
            }
            throw new IOException("closed");
        }
    }
}
