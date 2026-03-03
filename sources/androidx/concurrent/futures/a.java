package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractResolvableFuture.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a<V> implements ListenableFuture<V> {

    /* renamed from: ˈ, reason: contains not printable characters */
    static final boolean f1574 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final Logger f1575 = Logger.getLogger(a.class.getName());

    /* renamed from: ˊ, reason: contains not printable characters */
    static final b f1576;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Object f1577;

    /* renamed from: ʾ, reason: contains not printable characters */
    volatile Object f1578;

    /* renamed from: ʿ, reason: contains not printable characters */
    volatile e f1579;

    /* renamed from: ˆ, reason: contains not printable characters */
    volatile i f1580;

    /* compiled from: AbstractResolvableFuture.java */
    private static abstract class b {
        private b() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        abstract boolean mo1733(a<?> aVar, e eVar, e eVar2);

        /* renamed from: ʼ, reason: contains not printable characters */
        abstract boolean mo1734(a<?> aVar, Object obj, Object obj2);

        /* renamed from: ʽ, reason: contains not printable characters */
        abstract boolean mo1735(a<?> aVar, i iVar, i iVar2);

        /* renamed from: ʾ, reason: contains not printable characters */
        abstract void mo1736(i iVar, i iVar2);

        /* renamed from: ʿ, reason: contains not printable characters */
        abstract void mo1737(i iVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class c {

        /* renamed from: ʽ, reason: contains not printable characters */
        static final c f1581;

        /* renamed from: ʾ, reason: contains not printable characters */
        static final c f1582;

        /* renamed from: ʻ, reason: contains not printable characters */
        final boolean f1583;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Throwable f1584;

        static {
            if (a.f1574) {
                f1582 = null;
                f1581 = null;
            } else {
                f1582 = new c(false, null);
                f1581 = new c(true, null);
            }
        }

        c(boolean z5, Throwable th) {
            this.f1583 = z5;
            this.f1584 = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class d {

        /* renamed from: ʼ, reason: contains not printable characters */
        static final d f1585 = new d(new C0021a("Failure occurred while trying to finish a future."));

        /* renamed from: ʻ, reason: contains not printable characters */
        final Throwable f1586;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0021a extends Throwable {
            C0021a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1586 = (Throwable) a.m1719(th);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class e {

        /* renamed from: ʾ, reason: contains not printable characters */
        static final e f1587 = new e(null, null);

        /* renamed from: ʻ, reason: contains not printable characters */
        final Runnable f1588;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Executor f1589;

        /* renamed from: ʽ, reason: contains not printable characters */
        e f1590;

        e(Runnable runnable, Executor executor) {
            this.f1588 = runnable;
            this.f1589 = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class f extends b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final AtomicReferenceFieldUpdater<i, Thread> f1591;

        /* renamed from: ʼ, reason: contains not printable characters */
        final AtomicReferenceFieldUpdater<i, i> f1592;

        /* renamed from: ʽ, reason: contains not printable characters */
        final AtomicReferenceFieldUpdater<a, i> f1593;

        /* renamed from: ʾ, reason: contains not printable characters */
        final AtomicReferenceFieldUpdater<a, e> f1594;

        /* renamed from: ʿ, reason: contains not printable characters */
        final AtomicReferenceFieldUpdater<a, Object> f1595;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1591 = atomicReferenceFieldUpdater;
            this.f1592 = atomicReferenceFieldUpdater2;
            this.f1593 = atomicReferenceFieldUpdater3;
            this.f1594 = atomicReferenceFieldUpdater4;
            this.f1595 = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʻ */
        boolean mo1733(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.m1740(this.f1594, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʼ */
        boolean mo1734(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.m1740(this.f1595, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʽ */
        boolean mo1735(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.m1740(this.f1593, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʾ */
        void mo1736(i iVar, i iVar2) {
            this.f1592.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʿ */
        void mo1737(i iVar, Thread thread) {
            this.f1591.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class g<V> implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final a<V> f1596;

        /* renamed from: ʿ, reason: contains not printable characters */
        final ListenableFuture<? extends V> f1597;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1596.f1578 != this) {
                return;
            }
            if (a.f1576.mo1734(this.f1596, this, a.m1724(this.f1597))) {
                a.m1721(this.f1596);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʻ */
        boolean mo1733(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1579 != eVar) {
                    return false;
                }
                aVar.f1579 = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʼ */
        boolean mo1734(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1578 != obj) {
                    return false;
                }
                aVar.f1578 = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʽ */
        boolean mo1735(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1580 != iVar) {
                    return false;
                }
                aVar.f1580 = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʾ */
        void mo1736(i iVar, i iVar2) {
            iVar.f1600 = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        /* renamed from: ʿ */
        void mo1737(i iVar, Thread thread) {
            iVar.f1599 = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class i {

        /* renamed from: ʽ, reason: contains not printable characters */
        static final i f1598 = new i(false);

        /* renamed from: ʻ, reason: contains not printable characters */
        volatile Thread f1599;

        /* renamed from: ʼ, reason: contains not printable characters */
        volatile i f1600;

        i(boolean z5) {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m1738(i iVar) {
            a.f1576.mo1736(this, iVar);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m1739() {
            Thread thread = this.f1599;
            if (thread != null) {
                this.f1599 = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f1576.mo1737(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "ʻ"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "ʼ"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "ˆ"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "ʿ"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "ʾ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f1576 = hVar;
        if (th != null) {
            f1575.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1577 = new Object();
    }

    protected a() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1717(StringBuilder sb) {
        try {
            Object m1725 = m1725(this);
            sb.append("SUCCESS, result=[");
            sb.append(m1728(m1725));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static CancellationException m1718(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static <T> T m1719(T t5) {
        t5.getClass();
        return t5;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private e m1720(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1579;
        } while (!f1576.mo1733(this, eVar2, e.f1587));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1590;
            eVar4.f1590 = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m1721(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.m1726();
            aVar.m1729();
            e m1720 = aVar.m1720(eVar);
            while (m1720 != null) {
                eVar = m1720.f1590;
                Runnable runnable = m1720.f1588;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1596;
                    if (aVar.f1578 == gVar) {
                        if (f1576.mo1734(aVar, gVar, m1724(gVar.f1597))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m1722(runnable, m1720.f1589);
                }
                m1720 = eVar;
            }
            return;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static void m1722(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f1575.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: י, reason: contains not printable characters */
    private V m1723(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m1718("Task was cancelled.", ((c) obj).f1584);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1586);
        }
        if (obj == f1577) {
            return null;
        }
        return obj;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static Object m1724(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof a) {
            Object obj = ((a) listenableFuture).f1578;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f1583 ? cVar.f1584 != null ? new c(false, cVar.f1584) : c.f1582 : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f1574) && isCancelled) {
            return c.f1582;
        }
        try {
            Object m1725 = m1725(listenableFuture);
            return m1725 == null ? f1577 : m1725;
        } catch (CancellationException e5) {
            if (isCancelled) {
                return new c(false, e5);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e5));
        } catch (ExecutionException e6) {
            return new d(e6.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    static <V> V m1725(Future<V> future) throws ExecutionException {
        V v5;
        boolean z5 = false;
        while (true) {
            try {
                v5 = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return v5;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m1726() {
        i iVar;
        do {
            iVar = this.f1580;
        } while (!f1576.mo1735(this, iVar, i.f1598));
        while (iVar != null) {
            iVar.m1739();
            iVar = iVar.f1600;
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m1727(i iVar) {
        iVar.f1599 = null;
        while (true) {
            i iVar2 = this.f1580;
            if (iVar2 == i.f1598) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1600;
                if (iVar2.f1599 != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1600 = iVar4;
                    if (iVar3.f1599 == null) {
                        break;
                    }
                } else if (!f1576.mo1735(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private String m1728(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m1719(runnable);
        m1719(executor);
        e eVar = this.f1579;
        if (eVar != e.f1587) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1590 = eVar;
                if (f1576.mo1733(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1579;
                }
            } while (eVar != e.f1587);
        }
        m1722(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f1578;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f1574 ? new c(z5, new CancellationException("Future.cancel() was called.")) : z5 ? c.f1581 : c.f1582;
        boolean z6 = false;
        a<V> aVar = this;
        while (true) {
            if (f1576.mo1734(aVar, obj, cVar)) {
                if (z5) {
                    aVar.m1730();
                }
                m1721(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f1597;
                if (!(listenableFuture instanceof a)) {
                    listenableFuture.cancel(z5);
                    return true;
                }
                aVar = (a) listenableFuture;
                obj = aVar.f1578;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z6 = true;
            } else {
                obj = aVar.f1578;
                if (!(obj instanceof g)) {
                    return z6;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1578;
        if ((obj != null) && (!(obj instanceof g))) {
            return m1723(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1580;
            if (iVar != i.f1598) {
                i iVar2 = new i();
                do {
                    iVar2.m1738(iVar);
                    if (f1576.mo1735(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m1727(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1578;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m1723(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m1727(iVar2);
                    } else {
                        iVar = this.f1580;
                    }
                } while (iVar != i.f1598);
            }
            return m1723(this.f1578);
        }
        while (nanos > 0) {
            Object obj3 = this.f1578;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m1723(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z5 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z5) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z5) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1578 instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f1578 != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m1717(sb);
        } else {
            try {
                str = m1731();
            } catch (RuntimeException e5) {
                str = "Exception thrown from implementation: " + e5.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m1717(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᴵ, reason: contains not printable characters */
    protected String m1731() {
        Object obj = this.f1578;
        if (obj instanceof g) {
            return "setFuture=[" + m1728(((g) obj).f1597) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    protected boolean mo1732(V v5) {
        if (v5 == null) {
            v5 = (V) f1577;
        }
        if (!f1576.mo1734(this, null, v5)) {
            return false;
        }
        m1721(this);
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected void m1729() {
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    protected void m1730() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1578;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m1723(obj2);
            }
            i iVar = this.f1580;
            if (iVar != i.f1598) {
                i iVar2 = new i();
                do {
                    iVar2.m1738(iVar);
                    if (f1576.mo1735(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1578;
                            } else {
                                m1727(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m1723(obj);
                    }
                    iVar = this.f1580;
                } while (iVar != i.f1598);
            }
            return m1723(this.f1578);
        }
        throw new InterruptedException();
    }
}
