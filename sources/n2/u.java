package n2;

import android.text.TextUtils;
import java.io.IOException;
import k2.a0;
import k2.f0;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n2.d;
import n2.v;

/* compiled from: HttpTransportMiddleware.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u extends c0 {

    /* compiled from: HttpTransportMiddleware.java */
    class a implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ l2.a f9673;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ k2.p f9674;

        a(l2.a aVar, k2.p pVar) {
            this.f9673 = aVar;
            this.f9674 = pVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            f0.m9423(this.f9673, exc);
            k2.p pVar = this.f9674;
            if (pVar != null) {
                pVar.m9471(false);
                this.f9674.m9476(0);
            }
        }
    }

    /* compiled from: HttpTransportMiddleware.java */
    class b implements a0.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        s f9676 = new s();

        /* renamed from: ʼ, reason: contains not printable characters */
        String f9677;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ d.c f9678;

        b(d.c cVar) {
            this.f9678 = cVar;
        }

        @Override // k2.a0.a
        /* renamed from: ʻ */
        public void mo9378(String str) {
            try {
                String trim = str.trim();
                if (this.f9677 == null) {
                    this.f9677 = trim;
                    return;
                }
                if (!TextUtils.isEmpty(trim)) {
                    this.f9676.m10553(trim);
                    return;
                }
                String[] split = this.f9677.split(" ", 3);
                if (split.length < 2) {
                    throw new Exception(new IOException("Not HTTP"));
                }
                this.f9678.f9580.mo10486(this.f9676);
                String str2 = split[0];
                this.f9678.f9580.mo10487(str2);
                this.f9678.f9580.mo10491(Integer.parseInt(split[1]));
                this.f9678.f9580.mo10490(split.length == 3 ? split[2] : BuildConfig.FLAVOR);
                this.f9678.f9582.mo9412(null);
                k2.l mo10483 = this.f9678.f9580.mo10483();
                if (mo10483 == null) {
                    return;
                }
                this.f9678.f9580.mo10489(!this.f9678.f9584.m10510() ? v.a.m10570(mo10483.mo9358(), null) : u.m10564(this.f9678.f9580.mo10482()) ? v.a.m10570(mo10483.mo9358(), null) : v.m10566(mo10483, y.m10579(str2), this.f9676, false));
            } catch (Exception e5) {
                this.f9678.f9582.mo9412(e5);
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static boolean m10564(int i5) {
        return (i5 >= 100 && i5 <= 199) || i5 == 204 || i5 == 304;
    }

    @Override // n2.c0, n2.d
    /* renamed from: ʽ */
    public void mo10478(d.f fVar) {
        y m10579 = y.m10579(fVar.f9577);
        if ((m10579 == null || m10579 == y.f9684 || m10579 == y.f9685) && (fVar.f9580.mo10492() instanceof r2.c)) {
            fVar.f9580.mo10492().end();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n2.c0, n2.d
    /* renamed from: ˈ */
    public boolean mo10481(d.c cVar) {
        k2.p pVar;
        k2.l lVar;
        y m10579 = y.m10579(cVar.f9577);
        if (m10579 != null && m10579 != y.f9684 && m10579 != y.f9685) {
            return super.mo10481(cVar);
        }
        e eVar = cVar.f9584;
        o2.a m10500 = eVar.m10500();
        if (m10500 != null) {
            if (m10500.length() >= 0) {
                eVar.m10502().m10557("Content-Length", String.valueOf(m10500.length()));
                cVar.f9580.mo10493(cVar.f9579);
            } else if ("close".equals(eVar.m10502().m10554("Connection"))) {
                cVar.f9580.mo10493(cVar.f9579);
            } else {
                eVar.m10502().m10557("Transfer-Encoding", "Chunked");
                cVar.f9580.mo10493(new r2.c(cVar.f9579));
            }
        }
        String m10558 = eVar.m10502().m10558(eVar.m10507().toString());
        byte[] bytes = m10558.getBytes();
        if (m10500 != null && m10500.length() >= 0 && m10500.length() + bytes.length < 1024) {
            k2.p pVar2 = new k2.p(cVar.f9580.mo10492());
            pVar2.m9471(true);
            cVar.f9580.mo10493(pVar2);
            pVar = pVar2;
            lVar = pVar2;
        } else {
            pVar = null;
            lVar = cVar.f9579;
        }
        eVar.m10514("\n" + m10558);
        f0.m9429(lVar, bytes, new a(cVar.f9581, pVar));
        b bVar = new b(cVar);
        k2.a0 a0Var = new k2.a0();
        cVar.f9579.mo9362(a0Var);
        a0Var.m9376(bVar);
        return true;
    }
}
