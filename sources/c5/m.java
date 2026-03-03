package c5;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: RealBufferedSink.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class m implements d {

    /* renamed from: ʾ, reason: contains not printable characters */
    public final c f5036 = new c();

    /* renamed from: ʿ, reason: contains not printable characters */
    public final r f5037;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f5038;

    m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f5037 = rVar;
    }

    @Override // c5.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f5038) {
            return;
        }
        try {
            c cVar = this.f5036;
            long j5 = cVar.f5011;
            if (j5 > 0) {
                this.f5037.mo5867(cVar, j5);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f5037.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f5038 = true;
        if (th != null) {
            u.m5981(th);
        }
    }

    @Override // c5.d, c5.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f5036;
        long j5 = cVar.f5011;
        if (j5 > 0) {
            this.f5037.mo5867(cVar, j5);
        }
        this.f5037.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f5038;
    }

    public String toString() {
        return "buffer(" + this.f5037 + ")";
    }

    @Override // c5.d
    public d write(byte[] bArr) throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        this.f5036.write(bArr);
        return m5962();
    }

    @Override // c5.d
    public d writeByte(int i5) throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        this.f5036.writeByte(i5);
        return m5962();
    }

    @Override // c5.d
    public d writeInt(int i5) throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        this.f5036.writeInt(i5);
        return m5962();
    }

    @Override // c5.d
    public d writeShort(int i5) throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        this.f5036.writeShort(i5);
        return m5962();
    }

    @Override // c5.d
    /* renamed from: ʻ */
    public c mo5872() {
        return this.f5036;
    }

    @Override // c5.r
    /* renamed from: ʼ */
    public t mo5866() {
        return this.f5037.mo5866();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public d m5962() throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        long m5914 = this.f5036.m5914();
        if (m5914 > 0) {
            this.f5037.mo5867(this.f5036, m5914);
        }
        return this;
    }

    @Override // c5.d
    /* renamed from: ʾ */
    public d mo5876(long j5) throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        this.f5036.mo5876(j5);
        return m5962();
    }

    @Override // c5.r
    /* renamed from: ˈ */
    public void mo5867(c cVar, long j5) throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        this.f5036.mo5867(cVar, j5);
        m5962();
    }

    @Override // c5.d
    /* renamed from: ᴵ */
    public d mo5901(String str) throws IOException {
        if (this.f5038) {
            throw new IllegalStateException("closed");
        }
        this.f5036.mo5901(str);
        return m5962();
    }

    @Override // c5.d
    public d write(byte[] bArr, int i5, int i6) throws IOException {
        if (!this.f5038) {
            this.f5036.write(bArr, i5, i6);
            return m5962();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f5038) {
            int write = this.f5036.write(byteBuffer);
            m5962();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
