package m2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m2.t;

/* compiled from: SimpleFuture.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t<T> extends k implements f {

    /* renamed from: ˊ, reason: contains not printable characters */
    private k2.f f9137;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Exception f9138;

    /* renamed from: ˎ, reason: contains not printable characters */
    private T f9139;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f9140;

    /* renamed from: ˑ, reason: contains not printable characters */
    private a<T> f9141;

    /* compiled from: SimpleFuture.java */
    protected interface a<T> {
        /* renamed from: ʻ */
        void mo9876(Exception exc, T t5, b bVar);
    }

    /* compiled from: SimpleFuture.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        Exception f9142;

        /* renamed from: ʼ, reason: contains not printable characters */
        Object f9143;

        /* renamed from: ʽ, reason: contains not printable characters */
        a f9144;

        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: ʻ, reason: contains not printable characters */
        void m9910() {
            while (true) {
                a aVar = this.f9144;
                if (aVar == 0) {
                    return;
                }
                Exception exc = this.f9142;
                Object obj = this.f9143;
                this.f9144 = null;
                this.f9142 = null;
                this.f9143 = null;
                aVar.mo9876(exc, obj, this);
            }
        }
    }

    public t() {
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private a<T> m9878() {
        a<T> aVar = this.f9141;
        this.f9141 = null;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static /* synthetic */ void m9879(t tVar, e eVar, Exception exc, Object obj, b bVar) {
        if (exc == null) {
            tVar.m9895(exc, obj, bVar);
            return;
        }
        try {
            tVar.m9886(eVar.mo9860(exc), bVar);
        } catch (Exception e5) {
            tVar.m9895(e5, null, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static /* synthetic */ f m9880(d dVar, Exception exc) throws Exception {
        dVar.mo9859(exc);
        return new t(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʾʾ, reason: contains not printable characters */
    public /* synthetic */ void m9881(t tVar, Exception exc, Object obj, b bVar) {
        tVar.m9895(m9895(exc, obj, bVar) ? null : new CancellationException(), obj, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆˆ, reason: contains not printable characters */
    public static /* synthetic */ void m9883(u uVar, t tVar, Exception e5, Object obj, b bVar) {
        if (e5 == null) {
            try {
                uVar.mo9866(obj);
            } catch (Exception e6) {
                e5 = e6;
            }
        }
        tVar.m9895(e5, obj, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static /* synthetic */ f m9884(v vVar, Object obj) throws Exception {
        return new t(vVar.mo9431(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉˉ, reason: contains not printable characters */
    public static /* synthetic */ void m9885(t tVar, w wVar, Exception exc, Object obj, b bVar) {
        if (exc != null) {
            tVar.m9895(exc, null, bVar);
            return;
        }
        try {
            tVar.m9886(wVar.mo9877(obj), bVar);
        } catch (Exception e5) {
            tVar.m9895(e5, null, bVar);
        }
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private f<T> m9886(f<T> fVar, b bVar) {
        mo9858(fVar);
        final t tVar = new t();
        if (fVar instanceof t) {
            ((t) fVar).m9903(bVar, new a() { // from class: m2.p
                @Override // m2.t.a
                /* renamed from: ʻ */
                public final void mo9876(Exception exc, Object obj, t.b bVar2) {
                    this.f9129.m9881(tVar, exc, obj, bVar2);
                }
            });
        } else {
            fVar.mo9865(new g() { // from class: m2.q
                @Override // m2.g
                /* renamed from: ʻ */
                public final void mo8740(Exception exc, Object obj) {
                    this.f9131.m9888(tVar, exc, obj);
                }
            });
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ــ, reason: contains not printable characters */
    public /* synthetic */ void m9888(t tVar, Exception exc, Object obj) {
        tVar.m9905(m9895(exc, obj, null) ? null : new CancellationException());
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private T m9891() throws ExecutionException {
        if (this.f9138 == null) {
            return this.f9139;
        }
        throw new ExecutionException(this.f9138);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m9893(b bVar, a<T> aVar) {
        boolean z5;
        if (this.f9140 || aVar == null) {
            return;
        }
        if (bVar == null) {
            bVar = new b();
            z5 = true;
        } else {
            z5 = false;
        }
        bVar.f9144 = aVar;
        bVar.f9142 = this.f9138;
        bVar.f9143 = this.f9139;
        if (z5) {
            bVar.m9910();
        }
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private boolean m9895(Exception exc, T t5, b bVar) {
        synchronized (this) {
            if (!super.mo9875()) {
                return false;
            }
            this.f9139 = t5;
            this.f9138 = exc;
            m9901();
            m9893(bVar, m9878());
            return true;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean m9899(boolean z5) {
        a<T> m9878;
        if (!super.cancel()) {
            return false;
        }
        synchronized (this) {
            this.f9138 = new CancellationException();
            m9901();
            m9878 = m9878();
            this.f9140 = z5;
        }
        m9893(null, m9878);
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z5) {
        return cancel();
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        synchronized (this) {
            if (!isCancelled() && !isDone()) {
                m9908().m9419();
                return m9891();
            }
            return m9891();
        }
    }

    @Override // m2.f
    /* renamed from: ʽ */
    public f<T> mo9861(final d dVar) {
        return m9909(new e() { // from class: m2.o
            @Override // m2.e
            /* renamed from: ʻ */
            public final f mo9860(Exception exc) {
                return t.m9880(dVar, exc);
            }
        });
    }

    @Override // m2.f
    /* renamed from: ʾ */
    public <R> f<R> mo9862(final v<R, T> vVar) {
        return mo9864(new w() { // from class: m2.n
            @Override // m2.w
            /* renamed from: ʻ, reason: contains not printable characters */
            public final f mo9877(Object obj) {
                return t.m9884(vVar, obj);
            }
        });
    }

    @Override // m2.f
    /* renamed from: ʿ */
    public f<T> mo9863(final u<T> uVar) {
        final t tVar = new t();
        tVar.mo9858(this);
        m9903(null, new a() { // from class: m2.s
            @Override // m2.t.a
            /* renamed from: ʻ */
            public final void mo9876(Exception exc, Object obj, t.b bVar) {
                t.m9883(uVar, tVar, exc, obj, bVar);
            }
        });
        return tVar;
    }

    @Override // m2.k, m2.c
    /* renamed from: ˆ */
    public boolean mo9858(m2.a aVar) {
        return super.mo9858(aVar);
    }

    @Override // m2.f
    /* renamed from: ˈ */
    public <R> f<R> mo9864(final w<R, T> wVar) {
        final t tVar = new t();
        tVar.mo9858(this);
        m9903(null, new a() { // from class: m2.m
            @Override // m2.t.a
            /* renamed from: ʻ */
            public final void mo9876(Exception exc, Object obj, t.b bVar) {
                t.m9885(this.f9125, wVar, exc, obj, bVar);
            }
        });
        return tVar;
    }

    @Override // m2.f
    /* renamed from: ˉ */
    public void mo9865(final g<T> gVar) {
        if (gVar == null) {
            m9903(null, null);
        } else {
            m9903(null, new a() { // from class: m2.l
                @Override // m2.t.a
                /* renamed from: ʻ, reason: contains not printable characters */
                public final void mo9876(Exception exc, Object obj, t.b bVar) {
                    gVar.mo8740(exc, obj);
                }
            });
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public t<T> m9900() {
        super.m9874();
        this.f9139 = null;
        this.f9138 = null;
        this.f9137 = null;
        this.f9141 = null;
        this.f9140 = false;
        return this;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    void m9901() {
        k2.f fVar = this.f9137;
        if (fVar != null) {
            fVar.m9420();
            this.f9137 = null;
        }
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public f<T> m9902(f<T> fVar) {
        return m9886(fVar, null);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m9903(b bVar, a<T> aVar) {
        synchronized (this) {
            this.f9141 = aVar;
            if (isDone() || isCancelled()) {
                m9893(bVar, m9878());
            }
        }
    }

    @Override // m2.k
    /* renamed from: י */
    public boolean mo9875() {
        return m9906(null);
    }

    /* renamed from: יי, reason: contains not printable characters */
    public boolean m9904(Exception exc, T t5) {
        return m9895(exc, t5, null);
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public boolean m9905(Exception exc) {
        return m9895(exc, null, null);
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean m9906(T t5) {
        return m9895(null, t5, null);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public boolean m9907() {
        return m9899(true);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    k2.f m9908() {
        if (this.f9137 == null) {
            this.f9137 = new k2.f();
        }
        return this.f9137;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public f<T> m9909(final e<T> eVar) {
        final t tVar = new t();
        tVar.mo9858(this);
        m9903(null, new a() { // from class: m2.r
            @Override // m2.t.a
            /* renamed from: ʻ */
            public final void mo9876(Exception exc, Object obj, t.b bVar) {
                t.m9879(this.f9133, eVar, exc, obj, bVar);
            }
        });
        return tVar;
    }

    public t(T t5) {
        m9906(t5);
    }

    @Override // m2.k, m2.a
    public boolean cancel() {
        return m9899(this.f9140);
    }

    @Override // java.util.concurrent.Future
    public T get(long j5, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        synchronized (this) {
            if (!isCancelled() && !isDone()) {
                k2.f m9908 = m9908();
                if (m9908.m9421(j5, timeUnit)) {
                    return m9891();
                }
                throw new TimeoutException();
            }
            return m9891();
        }
    }
}
