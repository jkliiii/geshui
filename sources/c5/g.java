package c5;

import java.io.IOException;

/* compiled from: ForwardingSink.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class g implements r {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final r f5018;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f5018 = rVar;
    }

    @Override // c5.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5018.close();
    }

    @Override // c5.r, java.io.Flushable
    public void flush() throws IOException {
        this.f5018.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f5018.toString() + ")";
    }

    @Override // c5.r
    /* renamed from: ʼ */
    public t mo5866() {
        return this.f5018.mo5866();
    }

    @Override // c5.r
    /* renamed from: ˈ */
    public void mo5867(c cVar, long j5) throws IOException {
        this.f5018.mo5867(cVar, j5);
    }
}
