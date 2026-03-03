package e1;

import android.util.Log;
import e1.h;
import e1.p;
import g1.a;
import g1.h;
import java.util.Map;
import java.util.concurrent.Executor;
import z1.a;

/* compiled from: Engine.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k implements m, h.a, p.a {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final boolean f7455 = Log.isLoggable("Engine", 2);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final s f7456;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final o f7457;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final g1.h f7458;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final b f7459;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final y f7460;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final c f7461;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final a f7462;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final e1.a f7463;

    /* compiled from: Engine.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final h.e f7464;

        /* renamed from: ʼ, reason: contains not printable characters */
        final androidx.core.util.e<h<?>> f7465 = z1.a.m13137(150, new C0103a());

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f7466;

        /* compiled from: Engine.java */
        /* renamed from: e1.k$a$a, reason: collision with other inner class name */
        class C0103a implements a.d<h<?>> {
            C0103a() {
            }

            @Override // z1.a.d
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public h<?> mo8383() {
                a aVar = a.this;
                return new h<>(aVar.f7464, aVar.f7465);
            }
        }

        a(h.e eVar) {
            this.f7464 = eVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        <R> h<R> m8382(com.bumptech.glide.d dVar, Object obj, n nVar, c1.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, c1.l<?>> map, boolean z5, boolean z6, boolean z7, c1.h hVar, h.b<R> bVar) {
            h hVar2 = (h) y1.k.m12893(this.f7465.mo2575());
            int i7 = this.f7466;
            this.f7466 = i7 + 1;
            return hVar2.m8344(dVar, obj, nVar, fVar, i5, i6, cls, cls2, gVar, jVar, map, z5, z6, z7, hVar, bVar, i7);
        }
    }

    /* compiled from: Engine.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final h1.a f7468;

        /* renamed from: ʼ, reason: contains not printable characters */
        final h1.a f7469;

        /* renamed from: ʽ, reason: contains not printable characters */
        final h1.a f7470;

        /* renamed from: ʾ, reason: contains not printable characters */
        final h1.a f7471;

        /* renamed from: ʿ, reason: contains not printable characters */
        final m f7472;

        /* renamed from: ˆ, reason: contains not printable characters */
        final p.a f7473;

        /* renamed from: ˈ, reason: contains not printable characters */
        final androidx.core.util.e<l<?>> f7474 = z1.a.m13137(150, new a());

        /* compiled from: Engine.java */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // z1.a.d
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public l<?> mo8383() {
                b bVar = b.this;
                return new l<>(bVar.f7468, bVar.f7469, bVar.f7470, bVar.f7471, bVar.f7472, bVar.f7473, bVar.f7474);
            }
        }

        b(h1.a aVar, h1.a aVar2, h1.a aVar3, h1.a aVar4, m mVar, p.a aVar5) {
            this.f7468 = aVar;
            this.f7469 = aVar2;
            this.f7470 = aVar3;
            this.f7471 = aVar4;
            this.f7472 = mVar;
            this.f7473 = aVar5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        <R> l<R> m8385(c1.f fVar, boolean z5, boolean z6, boolean z7, boolean z8) {
            return ((l) y1.k.m12893(this.f7474.mo2575())).m8397(fVar, z5, z6, z7, z8);
        }
    }

    /* compiled from: Engine.java */
    private static class c implements h.e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final a.InterfaceC0107a f7476;

        /* renamed from: ʼ, reason: contains not printable characters */
        private volatile g1.a f7477;

        c(a.InterfaceC0107a interfaceC0107a) {
            this.f7476 = interfaceC0107a;
        }

        @Override // e1.h.e
        /* renamed from: ʻ */
        public g1.a mo8355() {
            if (this.f7477 == null) {
                synchronized (this) {
                    if (this.f7477 == null) {
                        this.f7477 = this.f7476.build();
                    }
                    if (this.f7477 == null) {
                        this.f7477 = new g1.b();
                    }
                }
            }
            return this.f7477;
        }
    }

    /* compiled from: Engine.java */
    public class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final l<?> f7478;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final u1.h f7479;

        d(u1.h hVar, l<?> lVar) {
            this.f7479 = hVar;
            this.f7478 = lVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m8387() {
            synchronized (k.this) {
                this.f7478.m8401(this.f7479);
            }
        }
    }

    public k(g1.h hVar, a.InterfaceC0107a interfaceC0107a, h1.a aVar, h1.a aVar2, h1.a aVar3, h1.a aVar4, boolean z5) {
        this(hVar, interfaceC0107a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private p<?> m8370(c1.f fVar) {
        v<?> mo8672 = this.f7458.mo8672(fVar);
        if (mo8672 == null) {
            return null;
        }
        return mo8672 instanceof p ? (p) mo8672 : new p<>(mo8672, true, true, fVar, this);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private p<?> m8371(c1.f fVar) {
        p<?> m8286 = this.f7463.m8286(fVar);
        if (m8286 != null) {
            m8286.m8410();
        }
        return m8286;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private p<?> m8372(c1.f fVar) {
        p<?> m8370 = m8370(fVar);
        if (m8370 != null) {
            m8370.m8410();
            this.f7463.m8282(fVar, m8370);
        }
        return m8370;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private p<?> m8373(n nVar, boolean z5, long j5) {
        if (!z5) {
            return null;
        }
        p<?> m8371 = m8371(nVar);
        if (m8371 != null) {
            if (f7455) {
                m8374("Loaded resource from active resources", j5, nVar);
            }
            return m8371;
        }
        p<?> m8372 = m8372(nVar);
        if (m8372 == null) {
            return null;
        }
        if (f7455) {
            m8374("Loaded resource from cache", j5, nVar);
        }
        return m8372;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static void m8374(String str, long j5, c1.f fVar) {
        Log.v("Engine", str + " in " + y1.g.m12878(j5) + "ms, key: " + fVar);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private <R> d m8375(com.bumptech.glide.d dVar, Object obj, c1.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, c1.l<?>> map, boolean z5, boolean z6, c1.h hVar, boolean z7, boolean z8, boolean z9, boolean z10, u1.h hVar2, Executor executor, n nVar, long j5) {
        l<?> m8431 = this.f7456.m8431(nVar, z10);
        if (m8431 != null) {
            m8431.m8391(hVar2, executor);
            if (f7455) {
                m8374("Added to existing load", j5, nVar);
            }
            return new d(hVar2, m8431);
        }
        l<R> m8385 = this.f7459.m8385(nVar, z7, z8, z9, z10);
        h<R> m8382 = this.f7462.m8382(dVar, obj, nVar, fVar, i5, i6, cls, cls2, gVar, jVar, map, z5, z6, z10, hVar, m8385);
        this.f7456.m8432(nVar, m8385);
        m8385.m8391(hVar2, executor);
        m8385.m8402(m8382);
        if (f7455) {
            m8374("Started new load", j5, nVar);
        }
        return new d(hVar2, m8385);
    }

    @Override // e1.m
    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized void mo8376(l<?> lVar, c1.f fVar) {
        this.f7456.m8433(fVar, lVar);
    }

    @Override // e1.p.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo8377(c1.f fVar, p<?> pVar) {
        this.f7463.m8285(fVar);
        if (pVar.m8415()) {
            this.f7458.mo8671(fVar, pVar);
        } else {
            this.f7460.m8443(pVar, false);
        }
    }

    @Override // g1.h.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo8378(v<?> vVar) {
        this.f7460.m8443(vVar, true);
    }

    @Override // e1.m
    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized void mo8379(l<?> lVar, c1.f fVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.m8415()) {
                this.f7463.m8282(fVar, pVar);
            }
            this.f7456.m8433(fVar, lVar);
        } else {
            this.f7456.m8433(fVar, lVar);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public <R> d m8380(com.bumptech.glide.d dVar, Object obj, c1.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, c1.l<?>> map, boolean z5, boolean z6, c1.h hVar, boolean z7, boolean z8, boolean z9, boolean z10, u1.h hVar2, Executor executor) {
        long m12879 = f7455 ? y1.g.m12879() : 0L;
        n m8409 = this.f7457.m8409(obj, fVar, i5, i6, map, cls, cls2, hVar);
        synchronized (this) {
            p<?> m8373 = m8373(m8409, z7, m12879);
            if (m8373 == null) {
                return m8375(dVar, obj, fVar, i5, i6, cls, cls2, gVar, jVar, map, z5, z6, hVar, z7, z8, z9, z10, hVar2, executor, m8409, m12879);
            }
            hVar2.mo12178(m8373, c1.a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m8381(v<?> vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).m8416();
    }

    k(g1.h hVar, a.InterfaceC0107a interfaceC0107a, h1.a aVar, h1.a aVar2, h1.a aVar3, h1.a aVar4, s sVar, o oVar, e1.a aVar5, b bVar, a aVar6, y yVar, boolean z5) {
        this.f7458 = hVar;
        c cVar = new c(interfaceC0107a);
        this.f7461 = cVar;
        e1.a aVar7 = aVar5 == null ? new e1.a(z5) : aVar5;
        this.f7463 = aVar7;
        aVar7.m8287(this);
        this.f7457 = oVar == null ? new o() : oVar;
        this.f7456 = sVar == null ? new s() : sVar;
        this.f7459 = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f7462 = aVar6 == null ? new a(cVar) : aVar6;
        this.f7460 = yVar == null ? new y() : yVar;
        hVar.mo8670(this);
    }
}
