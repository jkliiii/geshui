package s4;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import s4.a0;
import s4.o;
import s4.r;

/* compiled from: OkHttpClient.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v implements Cloneable {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    final int f11157;

    /* renamed from: ʾ, reason: contains not printable characters */
    final m f11158;

    /* renamed from: ʿ, reason: contains not printable characters */
    @Nullable
    final Proxy f11159;

    /* renamed from: ˆ, reason: contains not printable characters */
    final List<w> f11160;

    /* renamed from: ˈ, reason: contains not printable characters */
    final List<j> f11161;

    /* renamed from: ˉ, reason: contains not printable characters */
    final List<t> f11162;

    /* renamed from: ˊ, reason: contains not printable characters */
    final List<t> f11163;

    /* renamed from: ˋ, reason: contains not printable characters */
    final o.c f11164;

    /* renamed from: ˎ, reason: contains not printable characters */
    final ProxySelector f11165;

    /* renamed from: ˏ, reason: contains not printable characters */
    final l f11166;

    /* renamed from: ˑ, reason: contains not printable characters */
    final SocketFactory f11167;

    /* renamed from: י, reason: contains not printable characters */
    final SSLSocketFactory f11168;

    /* renamed from: ـ, reason: contains not printable characters */
    final b5.c f11169;

    /* renamed from: ٴ, reason: contains not printable characters */
    final HostnameVerifier f11170;

    /* renamed from: ᐧ, reason: contains not printable characters */
    final f f11171;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    final int f11172;

    /* renamed from: ᴵ, reason: contains not printable characters */
    final s4.b f11173;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    final int f11174;

    /* renamed from: ᵎ, reason: contains not printable characters */
    final s4.b f11175;

    /* renamed from: ᵔ, reason: contains not printable characters */
    final i f11176;

    /* renamed from: ᵢ, reason: contains not printable characters */
    final n f11177;

    /* renamed from: ⁱ, reason: contains not printable characters */
    final boolean f11178;

    /* renamed from: ﹳ, reason: contains not printable characters */
    final boolean f11179;

    /* renamed from: ﹶ, reason: contains not printable characters */
    final boolean f11180;

    /* renamed from: ﾞ, reason: contains not printable characters */
    final int f11181;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    final int f11182;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    static final List<w> f11156 = t4.c.m12077(w.HTTP_2, w.HTTP_1_1);

    /* renamed from: ʼʼ, reason: contains not printable characters */
    static final List<j> f11155 = t4.c.m12077(j.f11084, j.f11086);

    /* compiled from: OkHttpClient.java */
    class a extends t4.a {
        a() {
        }

        @Override // t4.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo11977(r.a aVar, String str) {
            aVar.m11885(str);
        }

        @Override // t4.a
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo11978(r.a aVar, String str, String str2) {
            aVar.m11886(str, str2);
        }

        @Override // t4.a
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo11979(j jVar, SSLSocket sSLSocket, boolean z5) {
            jVar.m11812(sSLSocket, z5);
        }

        @Override // t4.a
        /* renamed from: ʾ, reason: contains not printable characters */
        public int mo11980(a0.a aVar) {
            return aVar.f10896;
        }

        @Override // t4.a
        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean mo11981(i iVar, v4.c cVar) {
            return iVar.m11807(cVar);
        }

        @Override // t4.a
        /* renamed from: ˆ, reason: contains not printable characters */
        public Socket mo11982(i iVar, s4.a aVar, v4.g gVar) {
            return iVar.m11808(aVar, gVar);
        }

        @Override // t4.a
        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean mo11983(s4.a aVar, s4.a aVar2) {
            return aVar.m11720(aVar2);
        }

        @Override // t4.a
        /* renamed from: ˉ, reason: contains not printable characters */
        public v4.c mo11984(i iVar, s4.a aVar, v4.g gVar, c0 c0Var) {
            return iVar.m11809(aVar, gVar, c0Var);
        }

        @Override // t4.a
        /* renamed from: ˊ, reason: contains not printable characters */
        public void mo11985(i iVar, v4.c cVar) {
            iVar.m11810(cVar);
        }

        @Override // t4.a
        /* renamed from: ˋ, reason: contains not printable characters */
        public v4.d mo11986(i iVar) {
            return iVar.f11078;
        }

        @Override // t4.a
        @Nullable
        /* renamed from: ˎ, reason: contains not printable characters */
        public IOException mo11987(d dVar, @Nullable IOException iOException) {
            return ((x) dVar).m11998(iOException);
        }
    }

    /* compiled from: OkHttpClient.java */
    public static final class b {

        /* renamed from: ʼ, reason: contains not printable characters */
        @Nullable
        Proxy f11184;

        /* renamed from: ˉ, reason: contains not printable characters */
        ProxySelector f11190;

        /* renamed from: ˊ, reason: contains not printable characters */
        l f11191;

        /* renamed from: ˋ, reason: contains not printable characters */
        SocketFactory f11192;

        /* renamed from: ˎ, reason: contains not printable characters */
        @Nullable
        SSLSocketFactory f11193;

        /* renamed from: ˏ, reason: contains not printable characters */
        @Nullable
        b5.c f11194;

        /* renamed from: ˑ, reason: contains not printable characters */
        HostnameVerifier f11195;

        /* renamed from: י, reason: contains not printable characters */
        f f11196;

        /* renamed from: ـ, reason: contains not printable characters */
        s4.b f11197;

        /* renamed from: ٴ, reason: contains not printable characters */
        s4.b f11198;

        /* renamed from: ᐧ, reason: contains not printable characters */
        i f11199;

        /* renamed from: ᴵ, reason: contains not printable characters */
        n f11200;

        /* renamed from: ᵎ, reason: contains not printable characters */
        boolean f11201;

        /* renamed from: ᵔ, reason: contains not printable characters */
        boolean f11202;

        /* renamed from: ᵢ, reason: contains not printable characters */
        boolean f11203;

        /* renamed from: ⁱ, reason: contains not printable characters */
        int f11204;

        /* renamed from: ﹳ, reason: contains not printable characters */
        int f11205;

        /* renamed from: ﹶ, reason: contains not printable characters */
        int f11206;

        /* renamed from: ﾞ, reason: contains not printable characters */
        int f11207;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        int f11208;

        /* renamed from: ʿ, reason: contains not printable characters */
        final List<t> f11187 = new ArrayList();

        /* renamed from: ˆ, reason: contains not printable characters */
        final List<t> f11188 = new ArrayList();

        /* renamed from: ʻ, reason: contains not printable characters */
        m f11183 = new m();

        /* renamed from: ʽ, reason: contains not printable characters */
        List<w> f11185 = v.f11156;

        /* renamed from: ʾ, reason: contains not printable characters */
        List<j> f11186 = v.f11155;

        /* renamed from: ˈ, reason: contains not printable characters */
        o.c f11189 = o.m11844(o.f11117);

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f11190 = proxySelector;
            if (proxySelector == null) {
                this.f11190 = new a5.a();
            }
            this.f11191 = l.f11108;
            this.f11192 = SocketFactory.getDefault();
            this.f11195 = b5.d.f4876;
            this.f11196 = f.f10943;
            s4.b bVar = s4.b.f10906;
            this.f11197 = bVar;
            this.f11198 = bVar;
            this.f11199 = new i();
            this.f11200 = n.f11116;
            this.f11201 = true;
            this.f11202 = true;
            this.f11203 = true;
            this.f11204 = 0;
            this.f11205 = 10000;
            this.f11206 = 10000;
            this.f11207 = 10000;
            this.f11208 = 0;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public v m11988() {
            return new v(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public b m11989(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f11200 = nVar;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public b m11990(boolean z5) {
            this.f11202 = z5;
            return this;
        }
    }

    static {
        t4.a.f11321 = new a();
    }

    public v() {
        this(new b());
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private static SSLSocketFactory m11949(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo13213 = z4.k.m13239().mo13213();
            mo13213.init(null, new TrustManager[]{x509TrustManager}, null);
            return mo13213.getSocketFactory();
        } catch (GeneralSecurityException e5) {
            throw t4.c.m12051("No System TLS", e5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public s4.b m11950() {
        return this.f11175;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public SSLSocketFactory m11951() {
        return this.f11168;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m11952() {
        return this.f11181;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public int m11953() {
        return this.f11174;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public f m11954() {
        return this.f11171;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m11955() {
        return this.f11182;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public i m11956() {
        return this.f11176;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public List<j> m11957() {
        return this.f11161;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public l m11958() {
        return this.f11166;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public m m11959() {
        return this.f11158;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public n m11960() {
        return this.f11177;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public o.c m11961() {
        return this.f11164;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m11962() {
        return this.f11179;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m11963() {
        return this.f11178;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public HostnameVerifier m11964() {
        return this.f11170;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public List<t> m11965() {
        return this.f11162;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    u4.c m11966() {
        return null;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public boolean m11967() {
        return this.f11180;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public List<t> m11968() {
        return this.f11163;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public SocketFactory m11969() {
        return this.f11167;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public d m11970(y yVar) {
        return x.m11994(this, yVar, false);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public int m11971() {
        return this.f11157;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public List<w> m11972() {
        return this.f11160;
    }

    @Nullable
    /* renamed from: ﹳ, reason: contains not printable characters */
    public Proxy m11973() {
        return this.f11159;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public s4.b m11974() {
        return this.f11173;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public ProxySelector m11975() {
        return this.f11165;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public int m11976() {
        return this.f11172;
    }

    v(b bVar) {
        boolean z5;
        this.f11158 = bVar.f11183;
        this.f11159 = bVar.f11184;
        this.f11160 = bVar.f11185;
        List<j> list = bVar.f11186;
        this.f11161 = list;
        this.f11162 = t4.c.m12076(bVar.f11187);
        this.f11163 = t4.c.m12076(bVar.f11188);
        this.f11164 = bVar.f11189;
        this.f11165 = bVar.f11190;
        this.f11166 = bVar.f11191;
        this.f11167 = bVar.f11192;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z5 = z5 || it.next().m11815();
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f11193;
        if (sSLSocketFactory == null && z5) {
            X509TrustManager m12075 = t4.c.m12075();
            this.f11168 = m11949(m12075);
            this.f11169 = b5.c.m5713(m12075);
        } else {
            this.f11168 = sSLSocketFactory;
            this.f11169 = bVar.f11194;
        }
        if (this.f11168 != null) {
            z4.k.m13239().mo13223(this.f11168);
        }
        this.f11170 = bVar.f11195;
        this.f11171 = bVar.f11196.m11797(this.f11169);
        this.f11173 = bVar.f11197;
        this.f11175 = bVar.f11198;
        this.f11176 = bVar.f11199;
        this.f11177 = bVar.f11200;
        this.f11178 = bVar.f11201;
        this.f11179 = bVar.f11202;
        this.f11180 = bVar.f11203;
        this.f11181 = bVar.f11204;
        this.f11182 = bVar.f11205;
        this.f11172 = bVar.f11206;
        this.f11174 = bVar.f11207;
        this.f11157 = bVar.f11208;
        if (this.f11162.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f11162);
        }
        if (this.f11163.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f11163);
        }
    }
}
