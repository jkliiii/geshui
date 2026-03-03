package w4;

import c5.l;
import c5.r;
import java.io.IOException;
import java.net.ProtocolException;
import s4.a0;
import s4.t;
import s4.y;

/* compiled from: CallServerInterceptor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b implements t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final boolean f12057;

    /* compiled from: CallServerInterceptor.java */
    static final class a extends c5.g {

        /* renamed from: ʿ, reason: contains not printable characters */
        long f12058;

        a(r rVar) {
            super(rVar);
        }

        @Override // c5.g, c5.r
        /* renamed from: ˈ */
        public void mo5867(c5.c cVar, long j5) throws IOException {
            super.mo5867(cVar, j5);
            this.f12058 += j5;
        }
    }

    public b(boolean z5) {
        this.f12057 = z5;
    }

    @Override // s4.t
    /* renamed from: ʻ */
    public a0 mo11940(t.a aVar) throws IOException {
        g gVar = (g) aVar;
        c m12610 = gVar.m12610();
        v4.g m12612 = gVar.m12612();
        v4.c cVar = (v4.c) gVar.m12608();
        y mo11945 = gVar.mo11945();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.m12609().m11858(gVar.m12607());
        m12610.mo12587(mo11945);
        gVar.m12609().m11857(gVar.m12607(), mo11945);
        a0.a aVar2 = null;
        if (f.m12603(mo11945.m12009()) && mo11945.m12004() != null) {
            if ("100-continue".equalsIgnoreCase(mo11945.m12006("Expect"))) {
                m12610.mo12589();
                gVar.m12609().m11862(gVar.m12607());
                aVar2 = m12610.mo12591(true);
            }
            if (aVar2 == null) {
                gVar.m12609().m11856(gVar.m12607());
                a aVar3 = new a(m12610.mo12586(mo11945, mo11945.m12004().mo11867()));
                c5.d m5953 = l.m5953(aVar3);
                mo11945.m12004().mo11869(m5953);
                m5953.close();
                gVar.m12609().m11855(gVar.m12607(), aVar3.f12058);
            } else if (!cVar.m12403()) {
                m12612.m12437();
            }
        }
        m12610.mo12588();
        if (aVar2 == null) {
            gVar.m12609().m11862(gVar.m12607());
            aVar2 = m12610.mo12591(false);
        }
        a0 m11746 = aVar2.m11757(mo11945).m11749(m12612.m12434().m12400()).m11758(currentTimeMillis).m11756(System.currentTimeMillis()).m11746();
        int m11738 = m11746.m11738();
        if (m11738 == 100) {
            m11746 = m12610.mo12591(false).m11757(mo11945).m11749(m12612.m12434().m12400()).m11758(currentTimeMillis).m11756(System.currentTimeMillis()).m11746();
            m11738 = m11746.m11738();
        }
        gVar.m12609().m11861(gVar.m12607(), m11746);
        a0 m117462 = (this.f12057 && m11738 == 101) ? m11746.m11729().m11745(t4.c.f11325).m11746() : m11746.m11729().m11745(m12610.mo12590(m11746)).m11746();
        if ("close".equalsIgnoreCase(m117462.m11734().m12006("Connection")) || "close".equalsIgnoreCase(m117462.m11740("Connection"))) {
            m12612.m12437();
        }
        if ((m11738 != 204 && m11738 != 205) || m117462.m11731().mo11767() <= 0) {
            return m117462;
        }
        throw new ProtocolException("HTTP " + m11738 + " had non-zero Content-Length: " + m117462.m11731().mo11767());
    }
}
