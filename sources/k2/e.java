package k2;

import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import l2.d;
import org.apache.http.conn.ssl.AbstractVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

/* compiled from: AsyncSSLSocketWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e implements w2.a, k2.c {

    /* renamed from: ⁱ, reason: contains not printable characters */
    static SSLContext f8723;

    /* renamed from: ﹳ, reason: contains not printable characters */
    static SSLContext f8724;

    /* renamed from: ﹶ, reason: contains not printable characters */
    static TrustManager[] f8725;

    /* renamed from: ﾞ, reason: contains not printable characters */
    static HostnameVerifier f8726;

    /* renamed from: ʻ, reason: contains not printable characters */
    l f8727;

    /* renamed from: ʼ, reason: contains not printable characters */
    p f8728;

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean f8729;

    /* renamed from: ʾ, reason: contains not printable characters */
    SSLEngine f8730;

    /* renamed from: ʿ, reason: contains not printable characters */
    boolean f8731;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f8732;

    /* renamed from: ˈ, reason: contains not printable characters */
    private String f8733;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f8734;

    /* renamed from: ˊ, reason: contains not printable characters */
    HostnameVerifier f8735;

    /* renamed from: ˋ, reason: contains not printable characters */
    h f8736;

    /* renamed from: ˎ, reason: contains not printable characters */
    X509Certificate[] f8737;

    /* renamed from: ˏ, reason: contains not printable characters */
    l2.g f8738;

    /* renamed from: ˑ, reason: contains not printable characters */
    l2.d f8739;

    /* renamed from: י, reason: contains not printable characters */
    TrustManager[] f8740;

    /* renamed from: ـ, reason: contains not printable characters */
    boolean f8741;

    /* renamed from: ٴ, reason: contains not printable characters */
    boolean f8742;

    /* renamed from: ᐧ, reason: contains not printable characters */
    Exception f8743;

    /* renamed from: ᴵ, reason: contains not printable characters */
    final q f8744 = new q();

    /* renamed from: ᵎ, reason: contains not printable characters */
    final l2.d f8745;

    /* renamed from: ᵔ, reason: contains not printable characters */
    q f8746;

    /* renamed from: ᵢ, reason: contains not printable characters */
    l2.a f8747;

    /* compiled from: AsyncSSLSocketWrapper.java */
    static class c implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ h f8748;

        c(h hVar) {
            this.f8748 = hVar;
        }

        @Override // l2.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo9412(Exception exc) {
            if (exc != null) {
                this.f8748.mo9414(exc, null);
            } else {
                this.f8748.mo9414(new SSLException("socket closed during handshake"), null);
            }
        }
    }

    /* compiled from: AsyncSSLSocketWrapper.java */
    class d implements l2.g {
        d() {
        }

        @Override // l2.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo9413() {
            l2.g gVar = e.this.f8738;
            if (gVar != null) {
                gVar.mo9413();
            }
        }
    }

    /* compiled from: AsyncSSLSocketWrapper.java */
    /* renamed from: k2.e$e, reason: collision with other inner class name */
    class C0125e implements l2.a {
        C0125e() {
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            l2.a aVar;
            e eVar = e.this;
            if (eVar.f8742) {
                return;
            }
            eVar.f8742 = true;
            eVar.f8743 = exc;
            if (eVar.f8744.m9499() || (aVar = e.this.f8747) == null) {
                return;
            }
            aVar.mo9412(exc);
        }
    }

    /* compiled from: AsyncSSLSocketWrapper.java */
    class f implements l2.d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final v2.a f8751 = new v2.a().m12315(8192);

        /* renamed from: ʼ, reason: contains not printable characters */
        final q f8752 = new q();

        f() {
        }

        @Override // l2.d
        /* renamed from: ᵢ */
        public void mo9377(s sVar, q qVar) {
            e eVar = e.this;
            if (eVar.f8729) {
                return;
            }
            try {
                try {
                    eVar.f8729 = true;
                    qVar.m9489(this.f8752);
                    if (this.f8752.m9499()) {
                        this.f8752.m9483(this.f8752.m9493());
                    }
                    ByteBuffer byteBuffer = q.f8841;
                    while (true) {
                        if (byteBuffer.remaining() == 0 && this.f8752.m9484() > 0) {
                            byteBuffer = this.f8752.m9502();
                        }
                        int remaining = byteBuffer.remaining();
                        int m9500 = e.this.f8744.m9500();
                        ByteBuffer m12311 = this.f8751.m12311();
                        SSLEngineResult unwrap = e.this.f8730.unwrap(byteBuffer, m12311);
                        e eVar2 = e.this;
                        eVar2.m9408(eVar2.f8744, m12311);
                        this.f8751.m12316(e.this.f8744.m9500() - m9500);
                        if (unwrap.getStatus() != SSLEngineResult.Status.BUFFER_OVERFLOW) {
                            if (unwrap.getStatus() != SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                                e.this.m9404(unwrap.getHandshakeStatus());
                                if (byteBuffer.remaining() != remaining && m9500 == e.this.f8744.m9500()) {
                                    this.f8752.m9486(byteBuffer);
                                    break;
                                }
                            } else {
                                this.f8752.m9486(byteBuffer);
                                if (this.f8752.m9484() <= 1) {
                                    break;
                                }
                                this.f8752.m9486(this.f8752.m9493());
                                byteBuffer = q.f8841;
                            }
                        } else {
                            v2.a aVar = this.f8751;
                            aVar.m12315(aVar.m12313() * 2);
                        }
                        remaining = -1;
                        e.this.m9404(unwrap.getHandshakeStatus());
                        if (byteBuffer.remaining() != remaining) {
                        }
                    }
                    e.this.m9407();
                } catch (SSLException e5) {
                    e.this.m9399(e5);
                }
            } finally {
                e.this.f8729 = false;
            }
        }
    }

    /* compiled from: AsyncSSLSocketWrapper.java */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.g gVar = e.this.f8738;
            if (gVar != null) {
                gVar.mo9413();
            }
        }
    }

    /* compiled from: AsyncSSLSocketWrapper.java */
    public interface h {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo9414(Exception exc, k2.c cVar);
    }

    static {
        try {
            f8723 = SSLContext.getInstance("Default");
        } catch (Exception e5) {
            try {
                f8723 = SSLContext.getInstance("TLS");
                f8723.init(null, new TrustManager[]{new a()}, null);
            } catch (Exception e6) {
                e5.printStackTrace();
                e6.printStackTrace();
            }
        }
        try {
            f8724 = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArr = {new b()};
            f8725 = trustManagerArr;
            f8724.init(null, trustManagerArr, null);
            f8726 = new HostnameVerifier() { // from class: k2.d
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return e.m9406(str, sSLSession);
                }
            };
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    private e(l lVar, String str, int i5, SSLEngine sSLEngine, TrustManager[] trustManagerArr, HostnameVerifier hostnameVerifier, boolean z5) {
        f fVar = new f();
        this.f8745 = fVar;
        this.f8746 = new q();
        this.f8727 = lVar;
        this.f8735 = hostnameVerifier;
        this.f8741 = z5;
        this.f8740 = trustManagerArr;
        this.f8730 = sSLEngine;
        this.f8733 = str;
        this.f8732 = i5;
        sSLEngine.setUseClientMode(z5);
        p pVar = new p(lVar);
        this.f8728 = pVar;
        pVar.mo9364(new d());
        this.f8727.mo9366(new C0125e());
        this.f8727.mo9362(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m9399(Exception exc) {
        h hVar = this.f8736;
        if (hVar == null) {
            l2.a m9411 = m9411();
            if (m9411 != null) {
                m9411.mo9412(exc);
                return;
            }
            return;
        }
        this.f8736 = null;
        this.f8727.mo9362(new d.a());
        this.f8727.end();
        this.f8727.mo9368(null);
        this.f8727.close();
        hVar.mo9414(exc, null);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static SSLContext m9403() {
        return f8723;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m9404(SSLEngineResult.HandshakeStatus handshakeStatus) {
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
            this.f8730.getDelegatedTask().run();
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            mo9361(this.f8746);
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            this.f8745.mo9377(this, new q());
        }
        try {
            if (this.f8731) {
                return;
            }
            if (this.f8730.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING || this.f8730.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                if (this.f8741) {
                    boolean z5 = false;
                    try {
                        this.f8737 = (X509Certificate[]) this.f8730.getSession().getPeerCertificates();
                        String str = this.f8733;
                        if (str != null) {
                            HostnameVerifier hostnameVerifier = this.f8735;
                            if (hostnameVerifier == null) {
                                new StrictHostnameVerifier().verify(this.f8733, AbstractVerifier.getCNs(this.f8737[0]), AbstractVerifier.getDNSSubjectAlts(this.f8737[0]));
                            } else if (!hostnameVerifier.verify(str, this.f8730.getSession())) {
                                throw new SSLException("hostname <" + this.f8733 + "> has been denied");
                            }
                        }
                        e = null;
                        z5 = true;
                    } catch (SSLException e5) {
                        e = e5;
                    }
                    this.f8731 = true;
                    if (!z5) {
                        k2.b bVar = new k2.b(e);
                        m9399(bVar);
                        if (!bVar.m9379()) {
                            throw bVar;
                        }
                    }
                } else {
                    this.f8731 = true;
                }
                this.f8736.mo9414(null, this);
                this.f8736 = null;
                this.f8727.mo9368(null);
                mo9358().m9462(new g());
                m9407();
            }
        } catch (Exception e6) {
            m9399(e6);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static void m9405(l lVar, String str, int i5, SSLEngine sSLEngine, TrustManager[] trustManagerArr, HostnameVerifier hostnameVerifier, boolean z5, h hVar) {
        e eVar = new e(lVar, str, i5, sSLEngine, trustManagerArr, hostnameVerifier, z5);
        eVar.f8736 = hVar;
        lVar.mo9368(new c(hVar));
        try {
            eVar.f8730.beginHandshake();
            eVar.m9404(eVar.f8730.getHandshakeStatus());
        } catch (SSLException e5) {
            eVar.m9399(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static /* synthetic */ boolean m9406(String str, SSLSession sSLSession) {
        return true;
    }

    @Override // k2.s
    public void close() {
        this.f8727.close();
    }

    @Override // k2.u
    public void end() {
        this.f8727.end();
    }

    @Override // k2.u
    public boolean isOpen() {
        return this.f8727.isOpen();
    }

    @Override // k2.l, k2.s, k2.u
    /* renamed from: ʻ */
    public k mo9358() {
        return this.f8727.mo9358();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public void m9407() {
        l2.a aVar;
        f0.m9422(this, this.f8744);
        if (!this.f8742 || this.f8744.m9499() || (aVar = this.f8747) == null) {
            return;
        }
        aVar.mo9412(this.f8743);
    }

    @Override // k2.s
    /* renamed from: ʽ */
    public void mo9359() {
        this.f8727.mo9359();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    @Override // k2.u
    /* renamed from: ˋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9361(k2.q r7) {
        /*
            r6 = this;
            boolean r0 = r6.f8734
            if (r0 == 0) goto L5
            return
        L5:
            k2.p r0 = r6.f8728
            int r0 = r0.m9474()
            if (r0 <= 0) goto Le
            return
        Le:
            r0 = 1
            r6.f8734 = r0
            int r0 = r7.m9500()
            int r0 = r6.m9410(r0)
            java.nio.ByteBuffer r0 = k2.q.m9480(r0)
            r1 = 0
            r2 = r1
        L1f:
            boolean r3 = r6.f8731
            if (r3 == 0) goto L2b
            int r3 = r7.m9500()
            if (r3 != 0) goto L2b
            goto L9a
        L2b:
            int r3 = r7.m9500()
            java.nio.ByteBuffer[] r4 = r7.m9494()     // Catch: javax.net.ssl.SSLException -> L7e
            javax.net.ssl.SSLEngine r5 = r6.f8730     // Catch: javax.net.ssl.SSLException -> L7e
            javax.net.ssl.SSLEngineResult r2 = r5.wrap(r4, r0)     // Catch: javax.net.ssl.SSLException -> L7e
            r7.m9485(r4)     // Catch: javax.net.ssl.SSLException -> L7e
            r0.flip()     // Catch: javax.net.ssl.SSLException -> L7e
            k2.q r4 = r6.f8746     // Catch: javax.net.ssl.SSLException -> L7e
            r4.m9483(r0)     // Catch: javax.net.ssl.SSLException -> L7e
            k2.q r4 = r6.f8746     // Catch: javax.net.ssl.SSLException -> L7e
            int r4 = r4.m9500()     // Catch: javax.net.ssl.SSLException -> L7e
            if (r4 <= 0) goto L53
            k2.p r4 = r6.f8728     // Catch: javax.net.ssl.SSLException -> L7e
            k2.q r5 = r6.f8746     // Catch: javax.net.ssl.SSLException -> L7e
            r4.mo9361(r5)     // Catch: javax.net.ssl.SSLException -> L7e
        L53:
            int r0 = r0.capacity()     // Catch: javax.net.ssl.SSLException -> L7e
            javax.net.ssl.SSLEngineResult$Status r4 = r2.getStatus()     // Catch: javax.net.ssl.SSLException -> L7b
            javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: javax.net.ssl.SSLException -> L7b
            if (r4 != r5) goto L67
            int r0 = r0 * 2
            java.nio.ByteBuffer r0 = k2.q.m9480(r0)     // Catch: javax.net.ssl.SSLException -> L7b
            r3 = -1
            goto L82
        L67:
            int r0 = r7.m9500()     // Catch: javax.net.ssl.SSLException -> L7b
            int r0 = r6.m9410(r0)     // Catch: javax.net.ssl.SSLException -> L7b
            java.nio.ByteBuffer r0 = k2.q.m9480(r0)     // Catch: javax.net.ssl.SSLException -> L7b
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r2.getHandshakeStatus()     // Catch: javax.net.ssl.SSLException -> L7e
            r6.m9404(r4)     // Catch: javax.net.ssl.SSLException -> L7e
            goto L82
        L7b:
            r4 = move-exception
            r0 = r1
            goto L7f
        L7e:
            r4 = move-exception
        L7f:
            r6.m9399(r4)
        L82:
            int r4 = r7.m9500()
            if (r3 != r4) goto L92
            if (r2 == 0) goto L9a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r2.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            if (r3 != r4) goto L9a
        L92:
            k2.p r3 = r6.f8728
            int r3 = r3.m9474()
            if (r3 == 0) goto L1f
        L9a:
            r7 = 0
            r6.f8734 = r7
            k2.q.m9482(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.e.mo9361(k2.q):void");
    }

    @Override // k2.s
    /* renamed from: ˎ */
    public void mo9362(l2.d dVar) {
        this.f8739 = dVar;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m9408(q qVar, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        if (byteBuffer.hasRemaining()) {
            qVar.m9483(byteBuffer);
        } else {
            q.m9482(byteBuffer);
        }
    }

    @Override // k2.u
    /* renamed from: י */
    public void mo9364(l2.g gVar) {
        this.f8738 = gVar;
    }

    @Override // k2.s
    /* renamed from: ـ */
    public void mo9365() {
        this.f8727.mo9365();
        m9407();
    }

    @Override // w2.a
    /* renamed from: ٴ, reason: contains not printable characters */
    public l mo9409() {
        return this.f8727;
    }

    @Override // k2.s
    /* renamed from: ᐧ */
    public void mo9366(l2.a aVar) {
        this.f8747 = aVar;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    int m9410(int i5) {
        int i6 = (i5 * 3) / 2;
        if (i6 == 0) {
            return 8192;
        }
        return i6;
    }

    @Override // k2.u
    /* renamed from: ᴵᴵ */
    public void mo9368(l2.a aVar) {
        this.f8727.mo9368(aVar);
    }

    @Override // k2.s
    /* renamed from: ᵔ */
    public boolean mo9370() {
        return this.f8727.mo9370();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public l2.a m9411() {
        return this.f8747;
    }

    @Override // k2.s
    /* renamed from: ⁱ */
    public String mo9372() {
        return null;
    }

    @Override // k2.s
    /* renamed from: ﾞ */
    public l2.d mo9375() {
        return this.f8739;
    }

    /* compiled from: AsyncSSLSocketWrapper.java */
    static class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                if (x509Certificate != null && x509Certificate.getCriticalExtensionOIDs() != null) {
                    x509Certificate.getCriticalExtensionOIDs().remove("2.5.29.15");
                }
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }

    /* compiled from: AsyncSSLSocketWrapper.java */
    static class b implements X509TrustManager {
        b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }
}
