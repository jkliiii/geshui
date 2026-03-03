package y1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d extends InputStream {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final Queue<d> f12444 = l.m12900(0);

    /* renamed from: ʾ, reason: contains not printable characters */
    private InputStream f12445;

    /* renamed from: ʿ, reason: contains not printable characters */
    private IOException f12446;

    d() {
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static d m12871(InputStream inputStream) {
        d poll;
        Queue<d> queue = f12444;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.m12874(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f12445.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12445.close();
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        this.f12445.mark(i5);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f12445.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f12445.read();
        } catch (IOException e5) {
            this.f12446 = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f12445.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        try {
            return this.f12445.skip(j5);
        } catch (IOException e5) {
            this.f12446 = e5;
            throw e5;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public IOException m12872() {
        return this.f12446;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m12873() {
        this.f12446 = null;
        this.f12445 = null;
        Queue<d> queue = f12444;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m12874(InputStream inputStream) {
        this.f12445 = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f12445.read(bArr);
        } catch (IOException e5) {
            this.f12446 = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        try {
            return this.f12445.read(bArr, i5, i6);
        } catch (IOException e5) {
            this.f12446 = e5;
            throw e5;
        }
    }
}
