package u4;

import java.io.IOException;
import s4.a0;
import s4.r;
import s4.t;
import s4.w;
import s4.y;
import u4.b;

/* compiled from: CacheInterceptor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a implements t {
    public a(c cVar) {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static r m12215(r rVar, r rVar2) {
        r.a aVar = new r.a();
        int m11881 = rVar.m11881();
        for (int i5 = 0; i5 < m11881; i5++) {
            String m11879 = rVar.m11879(i5);
            String m11882 = rVar.m11882(i5);
            if ((!"Warning".equalsIgnoreCase(m11879) || !m11882.startsWith("1")) && (m12216(m11879) || !m12217(m11879) || rVar2.m11878(m11879) == null)) {
                t4.a.f11321.mo11978(aVar, m11879, m11882);
            }
        }
        int m118812 = rVar2.m11881();
        for (int i6 = 0; i6 < m118812; i6++) {
            String m118792 = rVar2.m11879(i6);
            if (!m12216(m118792) && m12217(m118792)) {
                t4.a.f11321.mo11978(aVar, m118792, rVar2.m11882(i6));
            }
        }
        return aVar.m11887();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static boolean m12216(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static boolean m12217(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static a0 m12218(a0 a0Var) {
        return (a0Var == null || a0Var.m11731() == null) ? a0Var : a0Var.m11729().m11745(null).m11746();
    }

    @Override // s4.t
    /* renamed from: ʻ */
    public a0 mo11940(t.a aVar) throws IOException {
        b m12225 = new b.a(System.currentTimeMillis(), aVar.mo11945(), null).m12225();
        y yVar = m12225.f11583;
        a0 a0Var = m12225.f11584;
        if (yVar == null && a0Var == null) {
            return new a0.a().m11757(aVar.mo11945()).m11755(w.HTTP_1_1).m11748(504).m11752("Unsatisfiable Request (only-if-cached)").m11745(t4.c.f11325).m11758(-1L).m11756(System.currentTimeMillis()).m11746();
        }
        if (yVar == null) {
            return a0Var.m11729().m11747(m12218(a0Var)).m11746();
        }
        a0 mo11944 = aVar.mo11944(yVar);
        if (a0Var != null) {
            if (mo11944.m11738() == 304) {
                a0Var.m11729().m11751(m12215(a0Var.m11736(), mo11944.m11736())).m11758(mo11944.m11733()).m11756(mo11944.m11730()).m11747(m12218(a0Var)).m11753(m12218(mo11944)).m11746();
                mo11944.m11731().close();
                throw null;
            }
            t4.c.m12059(a0Var.m11731());
        }
        return mo11944.m11729().m11747(m12218(a0Var)).m11753(m12218(mo11944)).m11746();
    }
}
