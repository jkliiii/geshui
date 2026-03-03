package n2;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import l2.a;
import l2.d;
import n2.d;

/* compiled from: AsyncHttpClient.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    final List<n2.d> f9523 = new CopyOnWriteArrayList();

    /* renamed from: ʼ, reason: contains not printable characters */
    i f9524;

    /* renamed from: ʽ, reason: contains not printable characters */
    o f9525;

    /* renamed from: ʾ, reason: contains not printable characters */
    u f9526;

    /* renamed from: ʿ, reason: contains not printable characters */
    k2.k f9527;

    /* compiled from: AsyncHttpClient.java */
    /* renamed from: n2.a$a, reason: collision with other inner class name */
    class RunnableC0136a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ n2.e f9528;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f9529;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ g f9530;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ q2.a f9531;

        RunnableC0136a(n2.e eVar, int i5, g gVar, q2.a aVar) {
            this.f9528 = eVar;
            this.f9529 = i5;
            this.f9530 = gVar;
            this.f9531 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.m10457(this.f9528, this.f9529, this.f9530, this.f9531);
        }
    }

    /* compiled from: AsyncHttpClient.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d.g f9533;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ g f9534;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ n2.e f9535;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ q2.a f9536;

        b(d.g gVar, g gVar2, n2.e eVar, q2.a aVar) {
            this.f9533 = gVar;
            this.f9534 = gVar2;
            this.f9535 = eVar;
            this.f9536 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m2.a aVar = this.f9533.f9576;
            if (aVar != null) {
                aVar.cancel();
                k2.l lVar = this.f9533.f9579;
                if (lVar != null) {
                    lVar.close();
                }
            }
            a.this.m10460(this.f9534, new TimeoutException(), null, this.f9535, this.f9536);
        }
    }

    /* compiled from: AsyncHttpClient.java */
    class c implements l2.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f9538;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ n2.e f9539;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ g f9540;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ q2.a f9541;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ d.g f9542;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ int f9543;

        c(n2.e eVar, g gVar, q2.a aVar, d.g gVar2, int i5) {
            this.f9539 = eVar;
            this.f9540 = gVar;
            this.f9541 = aVar;
            this.f9542 = gVar2;
            this.f9543 = i5;
        }

        @Override // l2.b
        /* renamed from: ʻ */
        public void mo9724(Exception exc, k2.l lVar) {
            if (this.f9538 && lVar != null) {
                lVar.mo9362(new d.a());
                lVar.mo9366(new a.C0130a());
                lVar.close();
                throw new AssertionError("double connect callback");
            }
            this.f9538 = true;
            this.f9539.m10514("socket connected");
            if (this.f9540.isCancelled()) {
                if (lVar != null) {
                    lVar.close();
                    return;
                }
                return;
            }
            g gVar = this.f9540;
            if (gVar.f9557 != null) {
                gVar.f9556.cancel();
            }
            if (exc != null) {
                a.this.m10460(this.f9540, exc, null, this.f9539, this.f9541);
                return;
            }
            d.g gVar2 = this.f9542;
            gVar2.f9579 = lVar;
            g gVar3 = this.f9540;
            gVar3.f9555 = lVar;
            a.this.m10458(this.f9539, this.f9543, gVar3, this.f9541, gVar2);
        }
    }

    /* compiled from: AsyncHttpClient.java */
    class d extends n2.g {

        /* renamed from: ᴵ, reason: contains not printable characters */
        final /* synthetic */ g f9545;

        /* renamed from: ᵎ, reason: contains not printable characters */
        final /* synthetic */ n2.e f9546;

        /* renamed from: ᵔ, reason: contains not printable characters */
        final /* synthetic */ q2.a f9547;

        /* renamed from: ᵢ, reason: contains not printable characters */
        final /* synthetic */ d.g f9548;

        /* renamed from: ⁱ, reason: contains not printable characters */
        final /* synthetic */ int f9549;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n2.e eVar, g gVar, n2.e eVar2, q2.a aVar, d.g gVar2, int i5) {
            super(eVar);
            this.f9545 = gVar;
            this.f9546 = eVar2;
            this.f9547 = aVar;
            this.f9548 = gVar2;
            this.f9549 = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˎˎ, reason: contains not printable characters */
        public /* synthetic */ void m10469(n2.e eVar, int i5, g gVar, q2.a aVar) {
            a.this.m10456(eVar, i5, gVar, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˑˑ, reason: contains not printable characters */
        public /* synthetic */ void m10471(n2.e eVar, int i5, g gVar, q2.a aVar) {
            a.this.m10456(eVar, i5 + 1, gVar, aVar);
        }

        @Override // n2.g, k2.t
        /* renamed from: ʿʿ */
        protected void mo9511(Exception exc) {
            if (exc != null) {
                this.f9546.m10512("exception during response", exc);
            }
            if (this.f9545.isCancelled()) {
                return;
            }
            if (exc instanceof k2.b) {
                this.f9546.m10512("SSL Exception", exc);
                k2.b bVar = (k2.b) exc;
                this.f9546.m10515(bVar);
                if (bVar.m9379()) {
                    return;
                }
            }
            k2.l mo10483 = mo10483();
            if (mo10483 == null) {
                return;
            }
            super.mo9511(exc);
            if ((!mo10483.isOpen() || exc != null) && mo10484() == null && exc != null) {
                a.this.m10460(this.f9545, exc, null, this.f9546, this.f9547);
            }
            this.f9548.f9585 = exc;
            Iterator<n2.d> it = a.this.f9523.iterator();
            while (it.hasNext()) {
                it.next().mo10480(this.f9548);
            }
        }

        @Override // k2.x, k2.v
        /* renamed from: ˈ */
        public void mo9512(k2.s sVar) {
            this.f9548.f9578 = sVar;
            Iterator<n2.d> it = a.this.f9523.iterator();
            while (it.hasNext()) {
                it.next().mo10477(this.f9548);
            }
            super.mo9512(this.f9548.f9578);
            Iterator<n2.d> it2 = a.this.f9523.iterator();
            while (it2.hasNext()) {
                final n2.e mo10479 = it2.next().mo10479(this.f9548);
                if (mo10479 != null) {
                    n2.e eVar = this.f9546;
                    mo10479.f9597 = eVar.f9597;
                    mo10479.f9596 = eVar.f9596;
                    mo10479.f9595 = eVar.f9595;
                    mo10479.f9593 = eVar.f9593;
                    mo10479.f9594 = eVar.f9594;
                    a.m10461(mo10479);
                    this.f9546.m10513("Response intercepted by middleware");
                    mo10479.m10513("Request initiated by middleware intercept by middleware");
                    k2.k kVar = a.this.f9527;
                    final int i5 = this.f9549;
                    final g gVar = this.f9545;
                    final q2.a aVar = this.f9547;
                    kVar.m9462(new Runnable() { // from class: n2.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9559.m10469(mo10479, i5, gVar, aVar);
                        }
                    });
                    mo9362(new d.a());
                    return;
                }
            }
            s sVar2 = this.f9602;
            int mo10482 = mo10482();
            if ((mo10482 != 301 && mo10482 != 302 && mo10482 != 307) || !this.f9546.m10501()) {
                this.f9546.m10514("Final (post cache response) headers:\n" + toString());
                a.this.m10460(this.f9545, null, this, this.f9546, this.f9547);
                return;
            }
            String m10554 = sVar2.m10554("Location");
            try {
                Uri parse = Uri.parse(m10554);
                if (parse.getScheme() == null) {
                    parse = Uri.parse(new URL(new URL(this.f9546.m10509().toString()), m10554).toString());
                }
                final n2.e eVar2 = new n2.e(parse, this.f9546.m10503().equals("HEAD") ? "HEAD" : "GET");
                n2.e eVar3 = this.f9546;
                eVar2.f9597 = eVar3.f9597;
                eVar2.f9596 = eVar3.f9596;
                eVar2.f9595 = eVar3.f9595;
                eVar2.f9593 = eVar3.f9593;
                eVar2.f9594 = eVar3.f9594;
                a.m10461(eVar2);
                a.m10455(this.f9546, eVar2, "User-Agent");
                a.m10455(this.f9546, eVar2, "Range");
                this.f9546.m10513("Redirecting");
                eVar2.m10513("Redirected");
                k2.k kVar2 = a.this.f9527;
                final int i6 = this.f9549;
                final g gVar2 = this.f9545;
                final q2.a aVar2 = this.f9547;
                kVar2.m9462(new Runnable() { // from class: n2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9570.m10471(eVar2, i6, gVar2, aVar2);
                    }
                });
                mo9362(new d.a());
            } catch (Exception e5) {
                a.this.m10460(this.f9545, e5, this, this.f9546, this.f9547);
            }
        }

        @Override // n2.g
        /* renamed from: ˉˉ, reason: contains not printable characters */
        protected void mo10472(Exception exc) {
            if (exc != null) {
                a.this.m10460(this.f9545, exc, null, this.f9546, this.f9547);
                return;
            }
            this.f9546.m10514("request completed");
            if (this.f9545.isCancelled()) {
                return;
            }
            g gVar = this.f9545;
            if (gVar.f9557 != null && this.f9602 == null) {
                gVar.f9556.cancel();
                g gVar2 = this.f9545;
                gVar2.f9556 = a.this.f9527.m9463(gVar2.f9557, a.m10459(this.f9546));
            }
            Iterator<n2.d> it = a.this.f9523.iterator();
            while (it.hasNext()) {
                it.next().mo10478(this.f9548);
            }
        }

        @Override // n2.g
        /* renamed from: ــ, reason: contains not printable characters */
        protected void mo10473() {
            super.mo10473();
            if (this.f9545.isCancelled()) {
                return;
            }
            g gVar = this.f9545;
            if (gVar.f9557 != null) {
                gVar.f9556.cancel();
            }
            this.f9546.m10514("Received headers:\n" + toString());
            Iterator<n2.d> it = a.this.f9523.iterator();
            while (it.hasNext()) {
                it.next().mo5850(this.f9548);
            }
        }
    }

    /* compiled from: AsyncHttpClient.java */
    class e implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ n2.g f9551;

        e(n2.g gVar) {
            this.f9551 = gVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (exc != null) {
                this.f9551.mo9511(exc);
            } else {
                this.f9551.m10523();
            }
        }
    }

    /* compiled from: AsyncHttpClient.java */
    class f implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ n2.g f9553;

        f(n2.g gVar) {
            this.f9553 = gVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (exc != null) {
                this.f9553.mo9511(exc);
            } else {
                this.f9553.mo10473();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncHttpClient.java */
    class g extends m2.t<n2.f> {

        /* renamed from: י, reason: contains not printable characters */
        public k2.l f9555;

        /* renamed from: ـ, reason: contains not printable characters */
        public m2.a f9556;

        /* renamed from: ٴ, reason: contains not printable characters */
        public Runnable f9557;

        private g() {
        }

        @Override // m2.t, m2.k, m2.a
        public boolean cancel() {
            if (!super.cancel()) {
                return false;
            }
            k2.l lVar = this.f9555;
            if (lVar != null) {
                lVar.mo9362(new d.a());
                this.f9555.close();
            }
            m2.a aVar = this.f9556;
            if (aVar == null) {
                return true;
            }
            aVar.cancel();
            return true;
        }

        /* synthetic */ g(a aVar, RunnableC0136a runnableC0136a) {
            this();
        }
    }

    public a(k2.k kVar) {
        this.f9527 = kVar;
        o oVar = new o(this);
        this.f9525 = oVar;
        m10467(oVar);
        i iVar = new i(this);
        this.f9524 = iVar;
        m10467(iVar);
        u uVar = new u();
        this.f9526 = uVar;
        m10467(uVar);
        this.f9524.m10532(new b0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m10455(n2.e eVar, n2.e eVar2, String str) {
        String m10554 = eVar.m10502().m10554(str);
        if (TextUtils.isEmpty(m10554)) {
            return;
        }
        eVar2.m10502().m10557(str, m10554);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m10456(n2.e eVar, int i5, g gVar, q2.a aVar) {
        if (this.f9527.m9458()) {
            m10457(eVar, i5, gVar, aVar);
        } else {
            this.f9527.m9462(new RunnableC0136a(eVar, i5, gVar, aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m10457(n2.e eVar, int i5, g gVar, q2.a aVar) {
        if (i5 > 15) {
            m10460(gVar, new z("too many redirects"), null, eVar, aVar);
            return;
        }
        eVar.m10509();
        d.g gVar2 = new d.g();
        eVar.f9597 = System.currentTimeMillis();
        gVar2.f9584 = eVar;
        eVar.m10511("Executing request.");
        Iterator<n2.d> it = this.f9523.iterator();
        while (it.hasNext()) {
            it.next().mo5849(gVar2);
        }
        if (eVar.m10508() > 0) {
            b bVar = new b(gVar2, gVar, eVar, aVar);
            gVar.f9557 = bVar;
            gVar.f9556 = this.f9527.m9463(bVar, m10459(eVar));
        }
        gVar2.f9575 = new c(eVar, gVar, aVar, gVar2, i5);
        m10461(eVar);
        if (eVar.m10500() != null && eVar.m10502().m10554("Content-Type") == null) {
            eVar.m10502().m10557("Content-Type", eVar.m10500().mo10975());
        }
        Iterator<n2.d> it2 = this.f9523.iterator();
        while (it2.hasNext()) {
            m2.a mo5707 = it2.next().mo5707(gVar2);
            if (mo5707 != null) {
                gVar2.f9576 = mo5707;
                gVar.mo9858(mo5707);
                return;
            }
        }
        m10460(gVar, new IllegalArgumentException("invalid uri=" + eVar.m10509() + " middlewares=" + this.f9523), null, eVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m10458(n2.e eVar, int i5, g gVar, q2.a aVar, d.g gVar2) {
        d dVar = new d(eVar, gVar, eVar, aVar, gVar2, i5);
        gVar2.f9581 = new e(dVar);
        gVar2.f9582 = new f(dVar);
        gVar2.f9580 = dVar;
        dVar.m10524(gVar2.f9579);
        Iterator<n2.d> it = this.f9523.iterator();
        while (it.hasNext() && !it.next().mo10481(gVar2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧ, reason: contains not printable characters */
    public static long m10459(n2.e eVar) {
        return eVar.m10508();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m10460(g gVar, Exception exc, n2.g gVar2, n2.e eVar, q2.a aVar) {
        boolean m9906;
        gVar.f9556.cancel();
        if (exc != null) {
            eVar.m10512("Connection error", exc);
            m9906 = gVar.m9905(exc);
        } else {
            eVar.m10511("Connection successful");
            m9906 = gVar.m9906(gVar2);
        }
        if (m9906) {
            aVar.mo8595(exc, gVar2);
        } else if (gVar2 != null) {
            gVar2.mo9362(new d.a());
            gVar2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m10461(n2.e eVar) {
        if (eVar.f9593 != null) {
            return;
        }
        try {
            List<Proxy> select = ProxySelector.getDefault().select(URI.create(eVar.m10509().toString()));
            if (select.isEmpty()) {
                return;
            }
            Proxy proxy = select.get(0);
            if (proxy.type() == Proxy.Type.HTTP && (proxy.address() instanceof InetSocketAddress)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                eVar.m10499(inetSocketAddress.getHostString(), inetSocketAddress.getPort());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public m2.f<n2.f> m10462(n2.e eVar, q2.a aVar) {
        g gVar = new g(this, null);
        m10456(eVar, 0, gVar, aVar);
        return gVar;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public Collection<n2.d> m10463() {
        return this.f9523;
    }

    /* renamed from: י, reason: contains not printable characters */
    public i m10464() {
        return this.f9524;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public k2.k m10465() {
        return this.f9527;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public o m10466() {
        return this.f9525;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m10467(n2.d dVar) {
        this.f9523.add(0, dVar);
    }
}
