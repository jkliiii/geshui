package n2;

import android.net.Uri;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Hashtable;
import java.util.Locale;
import l2.d;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n2.d;

/* compiled from: AsyncSocketMiddleware.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o extends c0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    String f9644;

    /* renamed from: ʼ, reason: contains not printable characters */
    int f9645;

    /* renamed from: ʽ, reason: contains not printable characters */
    int f9646;

    /* renamed from: ʾ, reason: contains not printable characters */
    protected n2.a f9647;

    /* renamed from: ʿ, reason: contains not printable characters */
    boolean f9648;

    /* renamed from: ˆ, reason: contains not printable characters */
    String f9649;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f9650;

    /* renamed from: ˉ, reason: contains not printable characters */
    Hashtable<String, d> f9651;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f9652;

    /* compiled from: AsyncSocketMiddleware.java */
    class a implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ v2.b f9653;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ e f9654;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ String f9655;

        a(v2.b bVar, e eVar, String str) {
            this.f9653 = bVar;
            this.f9654 = eVar;
            this.f9655 = str;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            synchronized (o.this) {
                this.f9653.remove(this.f9654);
                o.this.m10544(this.f9655);
            }
        }
    }

    /* compiled from: AsyncSocketMiddleware.java */
    class b implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ k2.l f9657;

        b(k2.l lVar) {
            this.f9657 = lVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            this.f9657.mo9368(null);
            this.f9657.close();
        }
    }

    /* compiled from: AsyncSocketMiddleware.java */
    class c extends d.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ k2.l f9659;

        c(k2.l lVar) {
            this.f9659 = lVar;
        }

        @Override // l2.d.a, l2.d
        /* renamed from: ᵢ */
        public void mo9377(k2.s sVar, k2.q qVar) {
            super.mo9377(sVar, qVar);
            qVar.m9507();
            this.f9659.mo9368(null);
            this.f9659.close();
        }
    }

    /* compiled from: AsyncSocketMiddleware.java */
    static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f9661;

        /* renamed from: ʼ, reason: contains not printable characters */
        v2.b<d.a> f9662 = new v2.b<>();

        /* renamed from: ʽ, reason: contains not printable characters */
        v2.b<e> f9663 = new v2.b<>();

        d() {
        }
    }

    /* compiled from: AsyncSocketMiddleware.java */
    class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        k2.l f9664;

        /* renamed from: ʼ, reason: contains not printable characters */
        long f9665 = System.currentTimeMillis();

        public e(k2.l lVar) {
            this.f9664 = lVar;
        }
    }

    public o(n2.a aVar, String str, int i5) {
        this.f9646 = 300000;
        this.f9651 = new Hashtable<>();
        this.f9652 = Integer.MAX_VALUE;
        this.f9647 = aVar;
        this.f9644 = str;
        this.f9645 = i5;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private d m10538(String str) {
        d dVar = this.f9651.get(str);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        this.f9651.put(str, dVar2);
        return dVar2;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m10539(k2.l lVar) {
        lVar.mo9366(new b(lVar));
        lVar.mo9364(null);
        lVar.mo9362(new c(lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public /* synthetic */ m2.f m10540(final int i5, final d.a aVar, InetAddress[] inetAddressArr) throws Exception {
        return m2.j.m9870(inetAddressArr, new m2.w() { // from class: n2.m
            @Override // m2.w
            /* renamed from: ʻ */
            public final m2.f mo9877(Object obj) {
                return this.f9640.m10543(i5, aVar, (InetAddress) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public /* synthetic */ void m10541(d.a aVar, Uri uri, int i5, Exception exc) throws Exception {
        mo10531(aVar, uri, i5, false, aVar.f9575).mo9724(exc, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public /* synthetic */ void m10542(d.a aVar, Uri uri, int i5, Exception exc, k2.l lVar) {
        if (lVar == null) {
            return;
        }
        if (exc == null) {
            mo10531(aVar, uri, i5, false, aVar.f9575).mo9724(null, lVar);
            return;
        }
        aVar.f9584.m10511("Recycling extra socket leftover from cancelled operation");
        m10539(lVar);
        m10546(lVar, aVar.f9584);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public /* synthetic */ m2.f m10543(int i5, d.a aVar, InetAddress inetAddress) throws Exception {
        final m2.t tVar = new m2.t();
        String format = String.format(Locale.ENGLISH, "%s:%s", inetAddress, Integer.valueOf(i5));
        aVar.f9584.m10514("attempting connection to " + format);
        this.f9647.m10465().m9454(new InetSocketAddress(inetAddress, i5), new l2.b() { // from class: n2.n
            @Override // l2.b
            /* renamed from: ʻ */
            public final void mo9724(Exception exc, k2.l lVar) {
                tVar.m9904(exc, lVar);
            }
        });
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m10544(String str) {
        d dVar = this.f9651.get(str);
        if (dVar == null) {
            return;
        }
        while (!dVar.f9663.isEmpty()) {
            e peekLast = dVar.f9663.peekLast();
            k2.l lVar = peekLast.f9664;
            if (peekLast.f9665 + this.f9646 > System.currentTimeMillis()) {
                break;
            }
            dVar.f9663.pop();
            lVar.mo9368(null);
            lVar.close();
        }
        if (dVar.f9661 == 0 && dVar.f9662.isEmpty() && dVar.f9663.isEmpty()) {
            this.f9651.remove(str);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m10545(n2.e eVar) {
        Uri m10509 = eVar.m10509();
        String m10547 = m10547(m10509, m10548(m10509), eVar.m10505(), eVar.m10506());
        synchronized (this) {
            d dVar = this.f9651.get(m10547);
            if (dVar == null) {
                return;
            }
            dVar.f9661--;
            while (dVar.f9661 < this.f9652 && dVar.f9662.size() > 0) {
                d.a remove = dVar.f9662.remove();
                m2.k kVar = (m2.k) remove.f9576;
                if (!kVar.isCancelled()) {
                    kVar.mo9858(mo5707(remove));
                }
            }
            m10544(m10547);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m10546(k2.l lVar, n2.e eVar) {
        v2.b<e> bVar;
        if (lVar == null) {
            return;
        }
        Uri m10509 = eVar.m10509();
        String m10547 = m10547(m10509, m10548(m10509), eVar.m10505(), eVar.m10506());
        e eVar2 = new e(lVar);
        synchronized (this) {
            bVar = m10538(m10547).f9663;
            bVar.push(eVar2);
        }
        lVar.mo9368(new a(bVar, eVar2, m10547));
    }

    @Override // n2.c0, n2.d
    /* renamed from: ʿ */
    public void mo10480(d.g gVar) {
        if (gVar.f9583.m12369("socket-owner") != this) {
            return;
        }
        try {
            m10539(gVar.f9579);
            if (gVar.f9585 != null || !gVar.f9579.isOpen()) {
                gVar.f9584.m10514("closing out socket (exception)");
                gVar.f9579.mo9368(null);
                gVar.f9579.close();
            } else if (m10549(gVar)) {
                gVar.f9584.m10511("Recycling keep-alive socket");
                m10546(gVar.f9579, gVar.f9584);
            } else {
                gVar.f9584.m10514("closing out socket (not keep alive)");
                gVar.f9579.mo9368(null);
                gVar.f9579.close();
            }
        } finally {
            m10545(gVar.f9584);
        }
    }

    @Override // n2.c0, n2.d
    /* renamed from: ˉ */
    public m2.a mo5707(final d.a aVar) {
        String host;
        int i5;
        String str;
        final Uri m10509 = aVar.f9584.m10509();
        final int m10548 = m10548(aVar.f9584.m10509());
        if (m10548 == -1) {
            return null;
        }
        aVar.f9583.m12370("socket-owner", this);
        d m10538 = m10538(m10547(m10509, m10548, aVar.f9584.m10505(), aVar.f9584.m10506()));
        synchronized (this) {
            int i6 = m10538.f9661;
            if (i6 >= this.f9652) {
                m2.k kVar = new m2.k();
                m10538.f9662.add(aVar);
                return kVar;
            }
            boolean z5 = true;
            m10538.f9661 = i6 + 1;
            while (!m10538.f9663.isEmpty()) {
                e pop = m10538.f9663.pop();
                k2.l lVar = pop.f9664;
                if (pop.f9665 + this.f9646 < System.currentTimeMillis()) {
                    lVar.mo9368(null);
                    lVar.close();
                } else if (lVar.isOpen()) {
                    aVar.f9584.m10511("Reusing keep-alive socket");
                    aVar.f9575.mo9724(null, lVar);
                    m2.k kVar2 = new m2.k();
                    kVar2.mo9875();
                    return kVar2;
                }
            }
            if (this.f9648 && this.f9649 == null && aVar.f9584.m10505() == null) {
                aVar.f9584.m10514("Resolving domain and connecting to all available addresses");
                m2.t tVar = new m2.t();
                tVar.m9902(this.f9647.m10465().m9456(m10509.getHost()).mo9864(new m2.w() { // from class: n2.j
                    @Override // m2.w
                    /* renamed from: ʻ */
                    public final m2.f mo9877(Object obj) {
                        return this.f9629.m10540(m10548, aVar, (InetAddress[]) obj);
                    }
                }).mo9861(new m2.d() { // from class: n2.k
                    @Override // m2.d
                    /* renamed from: ʻ */
                    public final void mo9859(Exception exc) {
                        this.f9632.m10541(aVar, m10509, m10548, exc);
                    }
                })).mo9865(new m2.g() { // from class: n2.l
                    @Override // m2.g
                    /* renamed from: ʻ */
                    public final void mo8740(Exception exc, Object obj) {
                        this.f9636.m10542(aVar, m10509, m10548, exc, (k2.l) obj);
                    }
                });
                return tVar;
            }
            aVar.f9584.m10511("Connecting socket");
            if (aVar.f9584.m10505() == null && (str = this.f9649) != null) {
                aVar.f9584.m10499(str, this.f9650);
            }
            if (aVar.f9584.m10505() != null) {
                host = aVar.f9584.m10505();
                i5 = aVar.f9584.m10506();
            } else {
                host = m10509.getHost();
                i5 = m10548;
                z5 = false;
            }
            if (z5) {
                aVar.f9584.m10514("Using proxy: " + host + ":" + i5);
            }
            return this.f9647.m10465().m9453(host, i5, mo10531(aVar, m10509, m10548, z5, aVar.f9575));
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    String m10547(Uri uri, int i5, String str, int i6) {
        String str2;
        if (str != null) {
            str2 = str + ":" + i6;
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        if (str != null) {
            str2 = str + ":" + i6;
        }
        return uri.getScheme() + "//" + uri.getHost() + ":" + i5 + "?proxy=" + str2;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public int m10548(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(this.f9644)) {
            return -1;
        }
        return uri.getPort() == -1 ? this.f9645 : uri.getPort();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    protected boolean m10549(d.g gVar) {
        return v.m10567(gVar.f9580.mo10488(), gVar.f9580.mo10484()) && v.m10568(y.f9685, gVar.f9584.m10502());
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m10550(boolean z5) {
        this.f9648 = z5;
    }

    public o(n2.a aVar) {
        this(aVar, "http", 80);
    }

    /* renamed from: ᐧᐧ */
    protected l2.b mo10531(d.a aVar, Uri uri, int i5, boolean z5, l2.b bVar) {
        return bVar;
    }
}
