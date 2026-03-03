package x4;

import c5.i;
import c5.l;
import c5.r;
import c5.s;
import c5.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import s4.a0;
import s4.b0;
import s4.r;
import s4.v;
import s4.y;
import w4.h;
import w4.k;

/* compiled from: Http1Codec.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a implements w4.c {

    /* renamed from: ʻ, reason: contains not printable characters */
    final v f12392;

    /* renamed from: ʼ, reason: contains not printable characters */
    final v4.g f12393;

    /* renamed from: ʽ, reason: contains not printable characters */
    final c5.e f12394;

    /* renamed from: ʾ, reason: contains not printable characters */
    final c5.d f12395;

    /* renamed from: ʿ, reason: contains not printable characters */
    int f12396 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    private long f12397 = 262144;

    /* compiled from: Http1Codec.java */
    private abstract class b implements s {

        /* renamed from: ʾ, reason: contains not printable characters */
        protected final i f12398;

        /* renamed from: ʿ, reason: contains not printable characters */
        protected boolean f12399;

        /* renamed from: ˆ, reason: contains not printable characters */
        protected long f12400;

        private b() {
            this.f12398 = new i(a.this.f12394.mo5868());
            this.f12400 = 0L;
        }

        @Override // c5.s
        /* renamed from: ʼ */
        public t mo5868() {
            return this.f12398;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        protected final void m12831(boolean z5, IOException iOException) throws IOException {
            a aVar = a.this;
            int i5 = aVar.f12396;
            if (i5 == 6) {
                return;
            }
            if (i5 != 5) {
                throw new IllegalStateException("state: " + a.this.f12396);
            }
            aVar.m12823(this.f12398);
            a aVar2 = a.this;
            aVar2.f12396 = 6;
            v4.g gVar = aVar2.f12393;
            if (gVar != null) {
                gVar.m12442(!z5, aVar2, this.f12400, iOException);
            }
        }

        @Override // c5.s
        /* renamed from: י */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            try {
                long mo5869 = a.this.f12394.mo5869(cVar, j5);
                if (mo5869 > 0) {
                    this.f12400 += mo5869;
                }
                return mo5869;
            } catch (IOException e5) {
                m12831(false, e5);
                throw e5;
            }
        }
    }

    /* compiled from: Http1Codec.java */
    private final class c implements r {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final i f12402;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f12403;

        c() {
            this.f12402 = new i(a.this.f12395.mo5866());
        }

        @Override // c5.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f12403) {
                return;
            }
            this.f12403 = true;
            a.this.f12395.mo5901("0\r\n\r\n");
            a.this.m12823(this.f12402);
            a.this.f12396 = 3;
        }

        @Override // c5.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f12403) {
                return;
            }
            a.this.f12395.flush();
        }

        @Override // c5.r
        /* renamed from: ʼ */
        public t mo5866() {
            return this.f12402;
        }

        @Override // c5.r
        /* renamed from: ˈ */
        public void mo5867(c5.c cVar, long j5) throws IOException {
            if (this.f12403) {
                throw new IllegalStateException("closed");
            }
            if (j5 == 0) {
                return;
            }
            a.this.f12395.mo5876(j5);
            a.this.f12395.mo5901("\r\n");
            a.this.f12395.mo5867(cVar, j5);
            a.this.f12395.mo5901("\r\n");
        }
    }

    /* compiled from: Http1Codec.java */
    private class d extends b {

        /* renamed from: ˉ, reason: contains not printable characters */
        private final s4.s f12405;

        /* renamed from: ˊ, reason: contains not printable characters */
        private long f12406;

        /* renamed from: ˋ, reason: contains not printable characters */
        private boolean f12407;

        d(s4.s sVar) {
            super();
            this.f12406 = -1L;
            this.f12407 = true;
            this.f12405 = sVar;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private void m12832() throws IOException {
            if (this.f12406 != -1) {
                a.this.f12394.mo5884();
            }
            try {
                this.f12406 = a.this.f12394.mo5905();
                String trim = a.this.f12394.mo5884().trim();
                if (this.f12406 < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f12406 + trim + "\"");
                }
                if (this.f12406 == 0) {
                    this.f12407 = false;
                    w4.e.m12599(a.this.f12392.m11958(), this.f12405, a.this.m12829());
                    m12831(true, null);
                }
            } catch (NumberFormatException e5) {
                throw new ProtocolException(e5.getMessage());
            }
        }

        @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f12399) {
                return;
            }
            if (this.f12407 && !t4.c.m12069(this, 100, TimeUnit.MILLISECONDS)) {
                m12831(false, null);
            }
            this.f12399 = true;
        }

        @Override // x4.a.b, c5.s
        /* renamed from: י */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            if (j5 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j5);
            }
            if (this.f12399) {
                throw new IllegalStateException("closed");
            }
            if (!this.f12407) {
                return -1L;
            }
            long j6 = this.f12406;
            if (j6 == 0 || j6 == -1) {
                m12832();
                if (!this.f12407) {
                    return -1L;
                }
            }
            long mo5869 = super.mo5869(cVar, Math.min(j5, this.f12406));
            if (mo5869 != -1) {
                this.f12406 -= mo5869;
                return mo5869;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m12831(false, protocolException);
            throw protocolException;
        }
    }

    /* compiled from: Http1Codec.java */
    private final class e implements r {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final i f12409;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f12410;

        /* renamed from: ˆ, reason: contains not printable characters */
        private long f12411;

        e(long j5) {
            this.f12409 = new i(a.this.f12395.mo5866());
            this.f12411 = j5;
        }

        @Override // c5.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f12410) {
                return;
            }
            this.f12410 = true;
            if (this.f12411 > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.m12823(this.f12409);
            a.this.f12396 = 3;
        }

        @Override // c5.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f12410) {
                return;
            }
            a.this.f12395.flush();
        }

        @Override // c5.r
        /* renamed from: ʼ */
        public t mo5866() {
            return this.f12409;
        }

        @Override // c5.r
        /* renamed from: ˈ */
        public void mo5867(c5.c cVar, long j5) throws IOException {
            if (this.f12410) {
                throw new IllegalStateException("closed");
            }
            t4.c.m12057(cVar.size(), 0L, j5);
            if (j5 <= this.f12411) {
                a.this.f12395.mo5867(cVar, j5);
                this.f12411 -= j5;
                return;
            }
            throw new ProtocolException("expected " + this.f12411 + " bytes but received " + j5);
        }
    }

    /* compiled from: Http1Codec.java */
    private class f extends b {

        /* renamed from: ˉ, reason: contains not printable characters */
        private long f12413;

        f(long j5) throws IOException {
            super();
            this.f12413 = j5;
            if (j5 == 0) {
                m12831(true, null);
            }
        }

        @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f12399) {
                return;
            }
            if (this.f12413 != 0 && !t4.c.m12069(this, 100, TimeUnit.MILLISECONDS)) {
                m12831(false, null);
            }
            this.f12399 = true;
        }

        @Override // x4.a.b, c5.s
        /* renamed from: י */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            if (j5 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j5);
            }
            if (this.f12399) {
                throw new IllegalStateException("closed");
            }
            long j6 = this.f12413;
            if (j6 == 0) {
                return -1L;
            }
            long mo5869 = super.mo5869(cVar, Math.min(j6, j5));
            if (mo5869 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m12831(false, protocolException);
                throw protocolException;
            }
            long j7 = this.f12413 - mo5869;
            this.f12413 = j7;
            if (j7 == 0) {
                m12831(true, null);
            }
            return mo5869;
        }
    }

    /* compiled from: Http1Codec.java */
    private class g extends b {

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f12415;

        g() {
            super();
        }

        @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f12399) {
                return;
            }
            if (!this.f12415) {
                m12831(false, null);
            }
            this.f12399 = true;
        }

        @Override // x4.a.b, c5.s
        /* renamed from: י */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            if (j5 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j5);
            }
            if (this.f12399) {
                throw new IllegalStateException("closed");
            }
            if (this.f12415) {
                return -1L;
            }
            long mo5869 = super.mo5869(cVar, j5);
            if (mo5869 != -1) {
                return mo5869;
            }
            this.f12415 = true;
            m12831(true, null);
            return -1L;
        }
    }

    public a(v vVar, v4.g gVar, c5.e eVar, c5.d dVar) {
        this.f12392 = vVar;
        this.f12393 = gVar;
        this.f12394 = eVar;
        this.f12395 = dVar;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private String m12822() throws IOException {
        String mo5897 = this.f12394.mo5897(this.f12397);
        this.f12397 -= mo5897.length();
        return mo5897;
    }

    @Override // w4.c
    public void cancel() {
        v4.c m12434 = this.f12393.m12434();
        if (m12434 != null) {
            m12434.m12398();
        }
    }

    @Override // w4.c
    /* renamed from: ʻ */
    public r mo12586(y yVar, long j5) {
        if ("chunked".equalsIgnoreCase(yVar.m12006("Transfer-Encoding"))) {
            return m12824();
        }
        if (j5 != -1) {
            return m12826(j5);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // w4.c
    /* renamed from: ʼ */
    public void mo12587(y yVar) throws IOException {
        m12830(yVar.m12007(), w4.i.m12613(yVar, this.f12393.m12434().m12405().m11785().type()));
    }

    @Override // w4.c
    /* renamed from: ʽ */
    public void mo12588() throws IOException {
        this.f12395.flush();
    }

    @Override // w4.c
    /* renamed from: ʾ */
    public void mo12589() throws IOException {
        this.f12395.flush();
    }

    @Override // w4.c
    /* renamed from: ʿ */
    public b0 mo12590(a0 a0Var) throws IOException {
        v4.g gVar = this.f12393;
        gVar.f11773.m11860(gVar.f11772);
        String m11740 = a0Var.m11740("Content-Type");
        if (!w4.e.m12597(a0Var)) {
            return new h(m11740, 0L, l.m5954(m12827(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.m11740("Transfer-Encoding"))) {
            return new h(m11740, -1L, l.m5954(m12825(a0Var.m11734().m12011())));
        }
        long m12596 = w4.e.m12596(a0Var);
        return m12596 != -1 ? new h(m11740, m12596, l.m5954(m12827(m12596))) : new h(m11740, -1L, l.m5954(m12828()));
    }

    @Override // w4.c
    /* renamed from: ˆ */
    public a0.a mo12591(boolean z5) throws IOException {
        int i5 = this.f12396;
        if (i5 != 1 && i5 != 3) {
            throw new IllegalStateException("state: " + this.f12396);
        }
        try {
            k m12626 = k.m12626(m12822());
            a0.a m11751 = new a0.a().m11755(m12626.f12084).m11748(m12626.f12085).m11752(m12626.f12086).m11751(m12829());
            if (z5 && m12626.f12085 == 100) {
                return null;
            }
            if (m12626.f12085 == 100) {
                this.f12396 = 3;
                return m11751;
            }
            this.f12396 = 4;
            return m11751;
        } catch (EOFException e5) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f12393);
            iOException.initCause(e5);
            throw iOException;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m12823(i iVar) {
        t m5945 = iVar.m5945();
        iVar.m5946(t.f5054);
        m5945.mo5938();
        m5945.mo5939();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public r m12824() {
        if (this.f12396 == 1) {
            this.f12396 = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f12396);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public s m12825(s4.s sVar) throws IOException {
        if (this.f12396 == 4) {
            this.f12396 = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f12396);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public r m12826(long j5) {
        if (this.f12396 == 1) {
            this.f12396 = 2;
            return new e(j5);
        }
        throw new IllegalStateException("state: " + this.f12396);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public s m12827(long j5) throws IOException {
        if (this.f12396 == 4) {
            this.f12396 = 5;
            return new f(j5);
        }
        throw new IllegalStateException("state: " + this.f12396);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public s m12828() throws IOException {
        if (this.f12396 != 4) {
            throw new IllegalStateException("state: " + this.f12396);
        }
        v4.g gVar = this.f12393;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f12396 = 5;
        gVar.m12437();
        return new g();
    }

    /* renamed from: י, reason: contains not printable characters */
    public s4.r m12829() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String m12822 = m12822();
            if (m12822.length() == 0) {
                return aVar.m11887();
            }
            t4.a.f11321.mo11977(aVar, m12822);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m12830(s4.r rVar, String str) throws IOException {
        if (this.f12396 != 0) {
            throw new IllegalStateException("state: " + this.f12396);
        }
        this.f12395.mo5901(str).mo5901("\r\n");
        int m11881 = rVar.m11881();
        for (int i5 = 0; i5 < m11881; i5++) {
            this.f12395.mo5901(rVar.m11879(i5)).mo5901(": ").mo5901(rVar.m11882(i5)).mo5901("\r\n");
        }
        this.f12395.mo5901("\r\n");
        this.f12396 = 1;
    }
}
