package v4;

import java.io.IOException;
import s4.a0;
import s4.t;
import s4.v;
import s4.y;

/* compiled from: ConnectInterceptor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a implements t {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final v f11736;

    public a(v vVar) {
        this.f11736 = vVar;
    }

    @Override // s4.t
    /* renamed from: ʻ */
    public a0 mo11940(t.a aVar) throws IOException {
        w4.g gVar = (w4.g) aVar;
        y mo11945 = gVar.mo11945();
        g m12612 = gVar.m12612();
        return gVar.m12611(mo11945, m12612, m12612.m12436(this.f11736, aVar, !mo11945.m12009().equals("GET")), m12612.m12434());
    }
}
