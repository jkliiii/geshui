package f3;

import android.text.TextUtils;
import k2.s;
import n2.v;
import x2.b0;
import x2.x;

/* compiled from: HttpLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e extends j {

    /* compiled from: HttpLoader.java */
    class a implements q2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ m2.g f7728;

        a(m2.g gVar) {
            this.f7728 = gVar;
        }

        @Override // q2.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo8595(Exception exc, n2.f fVar) {
            long j5;
            b0 b0Var;
            x2.h hVar;
            n2.e eVar;
            b0 b0Var2 = b0.LOADED_FROM_NETWORK;
            if (fVar != null) {
                n2.e mo10520 = fVar.mo10520();
                x2.h hVar2 = new x2.h(fVar.mo10482(), fVar.mo10485(), fVar.mo10484());
                j5 = v.m10565(hVar2.m12700());
                String m10554 = fVar.mo10484().m10554("X-Served-From");
                if (TextUtils.equals(m10554, "cache")) {
                    b0Var2 = b0.LOADED_FROM_CACHE;
                } else if (TextUtils.equals(m10554, "conditional-cache")) {
                    b0Var2 = b0.LOADED_FROM_CONDITIONAL_CACHE;
                }
                b0Var = b0Var2;
                eVar = mo10520;
                hVar = hVar2;
            } else {
                j5 = -1;
                b0Var = b0Var2;
                hVar = null;
                eVar = null;
            }
            this.f7728.mo8740(exc, new x.a(fVar, j5, b0Var, hVar, eVar));
        }
    }

    @Override // f3.j, x2.x
    /* renamed from: ʼ */
    public m2.f<s> mo8591(x2.l lVar, n2.e eVar, m2.g<x.a> gVar) {
        if (eVar.m10509().getScheme() == null || !eVar.m10509().getScheme().startsWith("http")) {
            return null;
        }
        return lVar.m12721().m10462(eVar, new a(gVar));
    }
}
