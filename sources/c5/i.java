package c5;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends t {

    /* renamed from: ʿ, reason: contains not printable characters */
    private t f5020;

    public i(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f5020 = tVar;
    }

    @Override // c5.t
    /* renamed from: ʻ, reason: contains not printable characters */
    public t mo5938() {
        return this.f5020.mo5938();
    }

    @Override // c5.t
    /* renamed from: ʼ, reason: contains not printable characters */
    public t mo5939() {
        return this.f5020.mo5939();
    }

    @Override // c5.t
    /* renamed from: ʽ, reason: contains not printable characters */
    public long mo5940() {
        return this.f5020.mo5940();
    }

    @Override // c5.t
    /* renamed from: ʾ, reason: contains not printable characters */
    public t mo5941(long j5) {
        return this.f5020.mo5941(j5);
    }

    @Override // c5.t
    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean mo5942() {
        return this.f5020.mo5942();
    }

    @Override // c5.t
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo5943() throws IOException {
        this.f5020.mo5943();
    }

    @Override // c5.t
    /* renamed from: ˈ, reason: contains not printable characters */
    public t mo5944(long j5, TimeUnit timeUnit) {
        return this.f5020.mo5944(j5, timeUnit);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final t m5945() {
        return this.f5020;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final i m5946(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f5020 = tVar;
        return this;
    }
}
