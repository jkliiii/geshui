package e1;

import e1.h;
import e1.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import z1.a;

/* compiled from: EngineJob.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l<R> implements h.b<R>, a.f {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private static final c f7481 = new c();

    /* renamed from: ʾ, reason: contains not printable characters */
    final e f7482;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final z1.c f7483;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final p.a f7484;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final androidx.core.util.e<l<?>> f7485;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final c f7486;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final m f7487;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final h1.a f7488;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final h1.a f7489;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final h1.a f7490;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final h1.a f7491;

    /* renamed from: י, reason: contains not printable characters */
    private final AtomicInteger f7492;

    /* renamed from: ـ, reason: contains not printable characters */
    private c1.f f7493;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f7494;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f7495;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private volatile boolean f7496;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f7497;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private boolean f7498;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean f7499;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private v<?> f7500;

    /* renamed from: ᵢ, reason: contains not printable characters */
    c1.a f7501;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f7502;

    /* renamed from: ﹳ, reason: contains not printable characters */
    q f7503;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f7504;

    /* renamed from: ﾞ, reason: contains not printable characters */
    p<?> f7505;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private h<R> f7506;

    /* compiled from: EngineJob.java */
    private class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final u1.h f7507;

        a(u1.h hVar) {
            this.f7507 = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f7507.mo12179()) {
                synchronized (l.this) {
                    if (l.this.f7482.m8406(this.f7507)) {
                        l.this.m8392(this.f7507);
                    }
                    l.this.m8395();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    private class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final u1.h f7509;

        b(u1.h hVar) {
            this.f7509 = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f7509.mo12179()) {
                synchronized (l.this) {
                    if (l.this.f7482.m8406(this.f7509)) {
                        l.this.f7505.m8410();
                        l.this.m8393(this.f7509);
                        l.this.m8401(this.f7509);
                    }
                    l.this.m8395();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    static class c {
        c() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public <R> p<R> m8403(v<R> vVar, boolean z5, c1.f fVar, p.a aVar) {
            return new p<>(vVar, z5, true, fVar, aVar);
        }
    }

    /* compiled from: EngineJob.java */
    static final class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final u1.h f7511;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Executor f7512;

        d(u1.h hVar, Executor executor) {
            this.f7511 = hVar;
            this.f7512 = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f7511.equals(((d) obj).f7511);
            }
            return false;
        }

        public int hashCode() {
            return this.f7511.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    static final class e implements Iterable<d> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final List<d> f7513;

        e() {
            this(new ArrayList(2));
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private static d m8404(u1.h hVar) {
            return new d(hVar, y1.e.m12875());
        }

        void clear() {
            this.f7513.clear();
        }

        boolean isEmpty() {
            return this.f7513.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f7513.iterator();
        }

        int size() {
            return this.f7513.size();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m8405(u1.h hVar, Executor executor) {
            this.f7513.add(new d(hVar, executor));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean m8406(u1.h hVar) {
            return this.f7513.contains(m8404(hVar));
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        e m8407() {
            return new e(new ArrayList(this.f7513));
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m8408(u1.h hVar) {
            this.f7513.remove(m8404(hVar));
        }

        e(List<d> list) {
            this.f7513 = list;
        }
    }

    l(h1.a aVar, h1.a aVar2, h1.a aVar3, h1.a aVar4, m mVar, p.a aVar5, androidx.core.util.e<l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f7481);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private h1.a m8388() {
        return this.f7495 ? this.f7490 : this.f7497 ? this.f7491 : this.f7489;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean m8389() {
        return this.f7504 || this.f7502 || this.f7496;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private synchronized void m8390() {
        if (this.f7493 == null) {
            throw new IllegalArgumentException();
        }
        this.f7482.clear();
        this.f7493 = null;
        this.f7505 = null;
        this.f7500 = null;
        this.f7504 = false;
        this.f7496 = false;
        this.f7502 = false;
        this.f7498 = false;
        this.f7506.m8346(false);
        this.f7506 = null;
        this.f7503 = null;
        this.f7501 = null;
        this.f7485.mo2574(this);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    synchronized void m8391(u1.h hVar, Executor executor) {
        this.f7483.mo13151();
        this.f7482.m8405(hVar, executor);
        boolean z5 = true;
        if (this.f7502) {
            m8396(1);
            executor.execute(new b(hVar));
        } else if (this.f7504) {
            m8396(1);
            executor.execute(new a(hVar));
        } else {
            if (this.f7496) {
                z5 = false;
            }
            y1.k.m12890(z5, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // e1.h.b
    /* renamed from: ʼ */
    public void mo8347(q qVar) {
        synchronized (this) {
            this.f7503 = qVar;
        }
        m8398();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m8392(u1.h hVar) {
        try {
            hVar.mo12177(this.f7503);
        } catch (Throwable th) {
            throw new e1.b(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e1.h.b
    /* renamed from: ʾ */
    public void mo8348(v<R> vVar, c1.a aVar, boolean z5) {
        synchronized (this) {
            this.f7500 = vVar;
            this.f7501 = aVar;
            this.f7498 = z5;
        }
        m8399();
    }

    @Override // e1.h.b
    /* renamed from: ʿ */
    public void mo8349(h<?> hVar) {
        m8388().execute(hVar);
    }

    @Override // z1.a.f
    /* renamed from: ˆ */
    public z1.c mo8343() {
        return this.f7483;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m8393(u1.h hVar) {
        try {
            hVar.mo12178(this.f7505, this.f7501, this.f7498);
        } catch (Throwable th) {
            throw new e1.b(th);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m8394() {
        if (m8389()) {
            return;
        }
        this.f7496 = true;
        this.f7506.m8341();
        this.f7487.mo8376(this, this.f7493);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m8395() {
        p<?> pVar;
        synchronized (this) {
            this.f7483.mo13151();
            y1.k.m12890(m8389(), "Not yet complete!");
            int decrementAndGet = this.f7492.decrementAndGet();
            y1.k.m12890(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f7505;
                m8390();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.m8416();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    synchronized void m8396(int i5) {
        p<?> pVar;
        y1.k.m12890(m8389(), "Not yet complete!");
        if (this.f7492.getAndAdd(i5) == 0 && (pVar = this.f7505) != null) {
            pVar.m8410();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    synchronized l<R> m8397(c1.f fVar, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f7493 = fVar;
        this.f7494 = z5;
        this.f7495 = z6;
        this.f7497 = z7;
        this.f7499 = z8;
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    void m8398() {
        synchronized (this) {
            this.f7483.mo13151();
            if (this.f7496) {
                m8390();
                return;
            }
            if (this.f7482.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f7504) {
                throw new IllegalStateException("Already failed once");
            }
            this.f7504 = true;
            c1.f fVar = this.f7493;
            e m8407 = this.f7482.m8407();
            m8396(m8407.size() + 1);
            this.f7487.mo8379(this, fVar, null);
            Iterator<d> it = m8407.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f7512.execute(new a(next.f7511));
            }
            m8395();
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m8399() {
        synchronized (this) {
            this.f7483.mo13151();
            if (this.f7496) {
                this.f7500.mo8413();
                m8390();
                return;
            }
            if (this.f7482.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f7502) {
                throw new IllegalStateException("Already have resource");
            }
            this.f7505 = this.f7486.m8403(this.f7500, this.f7494, this.f7493, this.f7484);
            this.f7502 = true;
            e m8407 = this.f7482.m8407();
            m8396(m8407.size() + 1);
            this.f7487.mo8379(this, this.f7493, this.f7505);
            Iterator<d> it = m8407.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f7512.execute(new b(next.f7511));
            }
            m8395();
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    boolean m8400() {
        return this.f7499;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    synchronized void m8401(u1.h hVar) {
        this.f7483.mo13151();
        this.f7482.m8408(hVar);
        if (this.f7482.isEmpty()) {
            m8394();
            if ((this.f7502 || this.f7504) && this.f7492.get() == 0) {
                m8390();
            }
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public synchronized void m8402(h<R> hVar) {
        this.f7506 = hVar;
        (hVar.m8340() ? this.f7488 : m8388()).execute(hVar);
    }

    l(h1.a aVar, h1.a aVar2, h1.a aVar3, h1.a aVar4, m mVar, p.a aVar5, androidx.core.util.e<l<?>> eVar, c cVar) {
        this.f7482 = new e();
        this.f7483 = z1.c.m13149();
        this.f7492 = new AtomicInteger();
        this.f7488 = aVar;
        this.f7489 = aVar2;
        this.f7490 = aVar3;
        this.f7491 = aVar4;
        this.f7487 = mVar;
        this.f7484 = aVar5;
        this.f7485 = eVar;
        this.f7486 = cVar;
    }
}
