package g1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import y1.k;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<String, a> f7841 = new HashMap();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final b f7842 = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    private static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Lock f7843 = new ReentrantLock();

        /* renamed from: ʼ, reason: contains not printable characters */
        int f7844;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    private static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Queue<a> f7845 = new ArrayDeque();

        b() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        a m8664() {
            a poll;
            synchronized (this.f7845) {
                poll = this.f7845.poll();
            }
            return poll == null ? new a() : poll;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m8665(a aVar) {
            synchronized (this.f7845) {
                if (this.f7845.size() < 10) {
                    this.f7845.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m8662(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f7841.get(str);
            if (aVar == null) {
                aVar = this.f7842.m8664();
                this.f7841.put(str, aVar);
            }
            aVar.f7844++;
        }
        aVar.f7843.lock();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m8663(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) k.m12893(this.f7841.get(str));
            int i5 = aVar.f7844;
            if (i5 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f7844);
            }
            int i6 = i5 - 1;
            aVar.f7844 = i6;
            if (i6 == 0) {
                a remove = this.f7841.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                this.f7842.m8665(remove);
            }
        }
        aVar.f7843.unlock();
    }
}
