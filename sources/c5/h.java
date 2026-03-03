package c5;

import java.io.IOException;

/* compiled from: ForwardingSource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class h implements s {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final s f5019;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f5019 = sVar;
    }

    @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5019.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f5019.toString() + ")";
    }

    @Override // c5.s
    /* renamed from: ʼ */
    public t mo5868() {
        return this.f5019.mo5868();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final s m5937() {
        return this.f5019;
    }
}
