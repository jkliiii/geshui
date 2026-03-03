package c5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final t f5054 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f5055;

    /* renamed from: ʼ, reason: contains not printable characters */
    private long f5056;

    /* renamed from: ʽ, reason: contains not printable characters */
    private long f5057;

    /* renamed from: ʻ */
    public t mo5938() {
        this.f5055 = false;
        return this;
    }

    /* renamed from: ʼ */
    public t mo5939() {
        this.f5057 = 0L;
        return this;
    }

    /* renamed from: ʽ */
    public long mo5940() {
        if (this.f5055) {
            return this.f5056;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: ʾ */
    public t mo5941(long j5) {
        this.f5055 = true;
        this.f5056 = j5;
        return this;
    }

    /* renamed from: ʿ */
    public boolean mo5942() {
        return this.f5055;
    }

    /* renamed from: ˆ */
    public void mo5943() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f5055 && this.f5056 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: ˈ */
    public t mo5944(long j5, TimeUnit timeUnit) {
        if (j5 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f5057 = timeUnit.toNanos(j5);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public long m5976() {
        return this.f5057;
    }

    /* compiled from: Timeout.java */
    final class a extends t {
        a() {
        }

        @Override // c5.t
        /* renamed from: ʾ */
        public t mo5941(long j5) {
            return this;
        }

        @Override // c5.t
        /* renamed from: ˆ */
        public void mo5943() throws IOException {
        }

        @Override // c5.t
        /* renamed from: ˈ */
        public t mo5944(long j5, TimeUnit timeUnit) {
            return this;
        }
    }
}
