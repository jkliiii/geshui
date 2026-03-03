package s4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import s4.x;

/* compiled from: Dispatcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class m {

    /* renamed from: ʽ, reason: contains not printable characters */
    @Nullable
    private Runnable f11111;

    /* renamed from: ʾ, reason: contains not printable characters */
    @Nullable
    private ExecutorService f11112;

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f11109 = 64;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f11110 = 5;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Deque<x.b> f11113 = new ArrayDeque();

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Deque<x.b> f11114 = new ArrayDeque();

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Deque<x> f11115 = new ArrayDeque();

    /* renamed from: ʽ, reason: contains not printable characters */
    private <T> void m11837(Deque<T> deque, T t5) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t5)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f11111;
        }
        if (m11838() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m11838() {
        int i5;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<x.b> it = this.f11113.iterator();
            while (it.hasNext()) {
                x.b next = it.next();
                if (this.f11114.size() >= this.f11109) {
                    break;
                }
                if (m11839(next) < this.f11110) {
                    it.remove();
                    arrayList.add(next);
                    this.f11114.add(next);
                }
            }
            z5 = m11843() > 0;
        }
        int size = arrayList.size();
        for (i5 = 0; i5 < size; i5++) {
            ((x.b) arrayList.get(i5)).m12001(m11841());
        }
        return z5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private int m11839(x.b bVar) {
        int i5 = 0;
        for (x.b bVar2 : this.f11114) {
            if (!bVar2.m12002().f11222 && bVar2.m12003().equals(bVar.m12003())) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m11840(x.b bVar) {
        synchronized (this) {
            this.f11113.add(bVar);
        }
        m11838();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized ExecutorService m11841() {
        if (this.f11112 == null) {
            this.f11112 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), t4.c.m12058("OkHttp Dispatcher", false));
        }
        return this.f11112;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m11842(x.b bVar) {
        m11837(this.f11114, bVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public synchronized int m11843() {
        return this.f11114.size() + this.f11115.size();
    }
}
