package k2;

import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

/* compiled from: ThreadQueue.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e0 extends LinkedList<Runnable> {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final WeakHashMap<Thread, e0> f8755 = new WeakHashMap<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    f f8756;

    /* renamed from: ʿ, reason: contains not printable characters */
    Semaphore f8757 = new Semaphore(0);

    e0() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static e0 m9415(Thread thread) {
        e0 e0Var;
        WeakHashMap<Thread, e0> weakHashMap = f8755;
        synchronized (weakHashMap) {
            e0Var = weakHashMap.get(thread);
            if (e0Var == null) {
                e0Var = new e0();
                weakHashMap.put(thread, e0Var);
            }
        }
        return e0Var;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static void m9416(f fVar) {
        WeakHashMap<Thread, e0> weakHashMap = f8755;
        synchronized (weakHashMap) {
            for (e0 e0Var : weakHashMap.values()) {
                if (e0Var.f8756 == fVar) {
                    e0Var.f8757.release();
                }
            }
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean add(Runnable runnable) {
        boolean add;
        synchronized (this) {
            add = super.add(runnable);
        }
        return add;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Runnable remove() {
        synchronized (this) {
            if (isEmpty()) {
                return null;
            }
            return (Runnable) super.remove();
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this) {
            remove = super.remove(obj);
        }
        return remove;
    }
}
