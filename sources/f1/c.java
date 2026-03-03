package f1;

import f1.m;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class c<T extends m> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Queue<T> f7666 = y1.l.m12900(20);

    c() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    abstract T mo8523();

    /* renamed from: ʼ, reason: contains not printable characters */
    T m8524() {
        T poll = this.f7666.poll();
        return poll == null ? (T) mo8523() : poll;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m8525(T t5) {
        if (this.f7666.size() < 20) {
            this.f7666.offer(t5);
        }
    }
}
