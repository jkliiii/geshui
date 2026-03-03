package k2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncSemaphore.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    Semaphore f8758 = new Semaphore(0);

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m9419() throws InterruptedException {
        e0 m9415 = e0.m9415(Thread.currentThread());
        f fVar = m9415.f8756;
        m9415.f8756 = this;
        Semaphore semaphore = m9415.f8757;
        try {
            if (this.f8758.tryAcquire()) {
                return;
            }
            while (true) {
                Runnable remove = m9415.remove();
                if (remove == null) {
                    semaphore.acquire(Math.max(1, semaphore.availablePermits()));
                    if (this.f8758.tryAcquire()) {
                        return;
                    }
                } else {
                    remove.run();
                }
            }
        } finally {
            m9415.f8756 = fVar;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m9420() {
        this.f8758.release();
        e0.m9416(this);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m9421(long j5, TimeUnit timeUnit) throws InterruptedException {
        long convert = TimeUnit.MILLISECONDS.convert(j5, timeUnit);
        e0 m9415 = e0.m9415(Thread.currentThread());
        f fVar = m9415.f8756;
        m9415.f8756 = this;
        Semaphore semaphore = m9415.f8757;
        try {
            if (this.f8758.tryAcquire()) {
                return true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                Runnable remove = m9415.remove();
                if (remove != null) {
                    remove.run();
                } else {
                    if (!semaphore.tryAcquire(Math.max(1, semaphore.availablePermits()), convert, TimeUnit.MILLISECONDS)) {
                        return false;
                    }
                    if (this.f8758.tryAcquire()) {
                        return true;
                    }
                    if (System.currentTimeMillis() - currentTimeMillis >= convert) {
                        return false;
                    }
                }
            }
        } finally {
            m9415.f8756 = fVar;
        }
    }
}
