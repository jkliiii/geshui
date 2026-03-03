package w4;

import java.io.IOException;
import java.util.List;
import s4.a0;
import s4.l;
import s4.t;
import s4.u;
import s4.y;
import s4.z;

/* compiled from: BridgeInterceptor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a implements t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final l f12056;

    public a(l lVar) {
        this.f12056 = lVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private String m12585(List<s4.k> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                sb.append("; ");
            }
            s4.k kVar = list.get(i5);
            sb.append(kVar.m11832());
            sb.append('=');
            sb.append(kVar.m11834());
        }
        return sb.toString();
    }

    @Override // s4.t
    /* renamed from: ʻ */
    public a0 mo11940(t.a aVar) throws IOException {
        y mo11945 = aVar.mo11945();
        y.a m12010 = mo11945.m12010();
        z m12004 = mo11945.m12004();
        if (m12004 != null) {
            u mo11868 = m12004.mo11868();
            if (mo11868 != null) {
                m12010.m12014("Content-Type", mo11868.toString());
            }
            long mo11867 = m12004.mo11867();
            if (mo11867 != -1) {
                m12010.m12014("Content-Length", Long.toString(mo11867));
                m12010.m12018("Transfer-Encoding");
            } else {
                m12010.m12014("Transfer-Encoding", "chunked");
                m12010.m12018("Content-Length");
            }
        }
        boolean z5 = false;
        if (mo11945.m12006("Host") == null) {
            m12010.m12014("Host", t4.c.m12074(mo11945.m12011(), false));
        }
        if (mo11945.m12006("Connection") == null) {
            m12010.m12014("Connection", "Keep-Alive");
        }
        if (mo11945.m12006("Accept-Encoding") == null && mo11945.m12006("Range") == null) {
            m12010.m12014("Accept-Encoding", "gzip");
            z5 = true;
        }
        List<s4.k> mo11835 = this.f12056.mo11835(mo11945.m12011());
        if (!mo11835.isEmpty()) {
            m12010.m12014("Cookie", m12585(mo11835));
        }
        if (mo11945.m12006("User-Agent") == null) {
            m12010.m12014("User-Agent", t4.d.m12085());
        }
        a0 mo11944 = aVar.mo11944(m12010.m12012());
        e.m12599(this.f12056, mo11945.m12011(), mo11944.m11736());
        a0.a m11757 = mo11944.m11729().m11757(mo11945);
        if (z5 && "gzip".equalsIgnoreCase(mo11944.m11740("Content-Encoding")) && e.m12597(mo11944)) {
            c5.j jVar = new c5.j(mo11944.m11731().mo11766());
            m11757.m11751(mo11944.m11736().m11880().m11888("Content-Encoding").m11888("Content-Length").m11887());
            m11757.m11745(new h(mo11944.m11740("Content-Type"), -1L, c5.l.m5954(jVar)));
        }
        return m11757.m11746();
    }
}
