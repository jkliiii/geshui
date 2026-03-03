package y4;

import c5.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import s4.a0;
import s4.b0;
import s4.r;
import s4.t;
import s4.v;
import s4.w;
import s4.y;

/* compiled from: Http2Codec.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f implements w4.c {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final List<String> f12531 = t4.c.m12077("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final List<String> f12532 = t4.c.m12077("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: ʻ, reason: contains not printable characters */
    private final t.a f12533;

    /* renamed from: ʼ, reason: contains not printable characters */
    final v4.g f12534;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final g f12535;

    /* renamed from: ʾ, reason: contains not printable characters */
    private i f12536;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final w f12537;

    /* compiled from: Http2Codec.java */
    class a extends c5.h {

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean f12538;

        /* renamed from: ˆ, reason: contains not printable characters */
        long f12539;

        a(s sVar) {
            super(sVar);
            this.f12538 = false;
            this.f12539 = 0L;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private void m12973(IOException iOException) {
            if (this.f12538) {
                return;
            }
            this.f12538 = true;
            f fVar = f.this;
            fVar.f12534.m12442(false, fVar, this.f12539, iOException);
        }

        @Override // c5.h, c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            m12973(null);
        }

        @Override // c5.s
        /* renamed from: י */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            try {
                long mo5869 = m5937().mo5869(cVar, j5);
                if (mo5869 > 0) {
                    this.f12539 += mo5869;
                }
                return mo5869;
            } catch (IOException e5) {
                m12973(e5);
                throw e5;
            }
        }
    }

    public f(v vVar, t.a aVar, v4.g gVar, g gVar2) {
        this.f12533 = aVar;
        this.f12534 = gVar;
        this.f12535 = gVar2;
        List<w> m11972 = vVar.m11972();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f12537 = m11972.contains(wVar) ? wVar : w.HTTP_2;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static List<c> m12971(y yVar) {
        r m12007 = yVar.m12007();
        ArrayList arrayList = new ArrayList(m12007.m11881() + 4);
        arrayList.add(new c(c.f12500, yVar.m12009()));
        arrayList.add(new c(c.f12501, w4.i.m12615(yVar.m12011())));
        String m12006 = yVar.m12006("Host");
        if (m12006 != null) {
            arrayList.add(new c(c.f12503, m12006));
        }
        arrayList.add(new c(c.f12502, yVar.m12011().m11904()));
        int m11881 = m12007.m11881();
        for (int i5 = 0; i5 < m11881; i5++) {
            c5.f m5920 = c5.f.m5920(m12007.m11879(i5).toLowerCase(Locale.US));
            if (!f12531.contains(m5920.mo5935())) {
                arrayList.add(new c(m5920, m12007.m11882(i5)));
            }
        }
        return arrayList;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static a0.a m12972(r rVar, w wVar) throws IOException {
        r.a aVar = new r.a();
        int m11881 = rVar.m11881();
        w4.k kVar = null;
        for (int i5 = 0; i5 < m11881; i5++) {
            String m11879 = rVar.m11879(i5);
            String m11882 = rVar.m11882(i5);
            if (m11879.equals(":status")) {
                kVar = w4.k.m12626("HTTP/1.1 " + m11882);
            } else if (!f12532.contains(m11879)) {
                t4.a.f11321.mo11978(aVar, m11879, m11882);
            }
        }
        if (kVar != null) {
            return new a0.a().m11755(wVar).m11748(kVar.f12085).m11752(kVar.f12086).m11751(aVar.m11887());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // w4.c
    public void cancel() {
        i iVar = this.f12536;
        if (iVar != null) {
            iVar.m13047(b.CANCEL);
        }
    }

    @Override // w4.c
    /* renamed from: ʻ */
    public c5.r mo12586(y yVar, long j5) {
        return this.f12536.m13049();
    }

    @Override // w4.c
    /* renamed from: ʼ */
    public void mo12587(y yVar) throws IOException {
        if (this.f12536 != null) {
            return;
        }
        i m12997 = this.f12535.m12997(m12971(yVar), yVar.m12004() != null);
        this.f12536 = m12997;
        c5.t m13053 = m12997.m13053();
        long mo11942 = this.f12533.mo11942();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m13053.mo5944(mo11942, timeUnit);
        this.f12536.m13060().mo5944(this.f12533.mo11943(), timeUnit);
    }

    @Override // w4.c
    /* renamed from: ʽ */
    public void mo12588() throws IOException {
        this.f12536.m13049().close();
    }

    @Override // w4.c
    /* renamed from: ʾ */
    public void mo12589() throws IOException {
        this.f12535.flush();
    }

    @Override // w4.c
    /* renamed from: ʿ */
    public b0 mo12590(a0 a0Var) throws IOException {
        v4.g gVar = this.f12534;
        gVar.f11773.m11860(gVar.f11772);
        return new w4.h(a0Var.m11740("Content-Type"), w4.e.m12596(a0Var), c5.l.m5954(new a(this.f12536.m13050())));
    }

    @Override // w4.c
    /* renamed from: ˆ */
    public a0.a mo12591(boolean z5) throws IOException {
        a0.a m12972 = m12972(this.f12536.m13058(), this.f12537);
        if (z5 && t4.a.f11321.mo11980(m12972) == 100) {
            return null;
        }
        return m12972;
    }
}
