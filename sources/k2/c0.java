package k2;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SelectorWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c0 implements Closeable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private Selector f8719;

    /* renamed from: ʿ, reason: contains not printable characters */
    public AtomicBoolean f8720 = new AtomicBoolean(false);

    /* renamed from: ˆ, reason: contains not printable characters */
    Semaphore f8721 = new Semaphore(0);

    public c0(Selector selector) {
        this.f8719 = selector;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8719.close();
    }

    public boolean isOpen() {
        return this.f8719.isOpen();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public Selector m9388() {
        return this.f8719;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public Set<SelectionKey> m9389() {
        return this.f8719.keys();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public boolean m9390() {
        for (int i5 = 0; i5 < 100; i5++) {
            try {
                this.f8721.tryAcquire(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m9391() {
        boolean z5 = !this.f8721.tryAcquire();
        this.f8719.wakeup();
        if (z5) {
            return;
        }
        if (this.f8720.getAndSet(true)) {
            this.f8719.wakeup();
            return;
        }
        try {
            m9390();
            this.f8719.wakeup();
        } finally {
            this.f8720.set(false);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m9392() throws IOException {
        m9393(0L);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m9393(long j5) throws IOException {
        try {
            this.f8721.drainPermits();
            this.f8719.select(j5);
        } finally {
            this.f8721.release(Integer.MAX_VALUE);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public int m9394() throws IOException {
        return this.f8719.selectNow();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public Set<SelectionKey> m9395() {
        return this.f8719.selectedKeys();
    }
}
