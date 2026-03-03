package v4;

import c5.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import s4.a0;
import s4.c0;
import s4.h;
import s4.i;
import s4.j;
import s4.o;
import s4.q;
import s4.s;
import s4.t;
import s4.v;
import s4.w;
import s4.y;
import y4.g;
import z4.k;

/* compiled from: RealConnection.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c extends g.j implements h {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final i f11741;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final c0 f11742;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Socket f11743;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Socket f11744;

    /* renamed from: ˆ, reason: contains not printable characters */
    private q f11745;

    /* renamed from: ˈ, reason: contains not printable characters */
    private w f11746;

    /* renamed from: ˉ, reason: contains not printable characters */
    private y4.g f11747;

    /* renamed from: ˊ, reason: contains not printable characters */
    private c5.e f11748;

    /* renamed from: ˋ, reason: contains not printable characters */
    private c5.d f11749;

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean f11750;

    /* renamed from: ˏ, reason: contains not printable characters */
    public int f11751;

    /* renamed from: ˑ, reason: contains not printable characters */
    public int f11752 = 1;

    /* renamed from: י, reason: contains not printable characters */
    public final List<Reference<g>> f11753 = new ArrayList();

    /* renamed from: ـ, reason: contains not printable characters */
    public long f11754 = Long.MAX_VALUE;

    public c(i iVar, c0 c0Var) {
        this.f11741 = iVar;
        this.f11742 = c0Var;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m12389(int i5, int i6, s4.d dVar, o oVar) throws IOException {
        Proxy m11785 = this.f11742.m11785();
        this.f11743 = (m11785.type() == Proxy.Type.DIRECT || m11785.type() == Proxy.Type.HTTP) ? this.f11742.m11784().m11726().createSocket() : new Socket(m11785);
        oVar.m11850(dVar, this.f11742.m11787(), m11785);
        this.f11743.setSoTimeout(i6);
        try {
            k.m13239().mo13212(this.f11743, this.f11742.m11787(), i5);
            try {
                this.f11748 = l.m5954(l.m5960(this.f11743));
                this.f11749 = l.m5953(l.m5957(this.f11743));
            } catch (NullPointerException e5) {
                if ("throw with null exception".equals(e5.getMessage())) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e6) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f11742.m11787());
            connectException.initCause(e6);
            throw connectException;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m12390(b bVar) throws IOException {
        s4.a m11784 = this.f11742.m11784();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) m11784.m11727().createSocket(this.f11743, m11784.m11728().m11912(), m11784.m11728().m11918(), true);
                try {
                    j m12387 = bVar.m12387(sSLSocket2);
                    if (m12387.m11816()) {
                        k.m13239().mo13203(sSLSocket2, m11784.m11728().m11912(), m11784.m11722());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    q m11872 = q.m11872(session);
                    if (m11784.m11721().verify(m11784.m11728().m11912(), session)) {
                        m11784.m11717().m11795(m11784.m11728().m11912(), m11872.m11874());
                        String mo13204 = m12387.m11816() ? k.m13239().mo13204(sSLSocket2) : null;
                        this.f11744 = sSLSocket2;
                        this.f11748 = l.m5954(l.m5960(sSLSocket2));
                        this.f11749 = l.m5953(l.m5957(this.f11744));
                        this.f11745 = m11872;
                        this.f11746 = mo13204 != null ? w.m11991(mo13204) : w.HTTP_1_1;
                        k.m13239().mo13226(sSLSocket2);
                        return;
                    }
                    List<Certificate> m11874 = m11872.m11874();
                    if (m11874.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + m11784.m11728().m11912() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) m11874.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + m11784.m11728().m11912() + " not verified:\n    certificate: " + s4.f.m11792(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + b5.d.m5714(x509Certificate));
                } catch (AssertionError e5) {
                    e = e5;
                    if (!t4.c.m12083(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        k.m13239().mo13226(sSLSocket);
                    }
                    t4.c.m12061(sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e6) {
            e = e6;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m12391(int i5, int i6, int i7, s4.d dVar, o oVar) throws IOException {
        y m12393 = m12393();
        s m12011 = m12393.m12011();
        for (int i8 = 0; i8 < 21; i8++) {
            m12389(i5, i6, dVar, oVar);
            m12393 = m12392(i6, i7, m12393, m12011);
            if (m12393 == null) {
                return;
            }
            t4.c.m12061(this.f11743);
            this.f11743 = null;
            this.f11749 = null;
            this.f11748 = null;
            oVar.m11848(dVar, this.f11742.m11787(), this.f11742.m11785(), null);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private y m12392(int i5, int i6, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + t4.c.m12074(sVar, true) + " HTTP/1.1";
        while (true) {
            x4.a aVar = new x4.a(null, null, this.f11748, this.f11749);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f11748.mo5868().mo5944(i5, timeUnit);
            this.f11749.mo5866().mo5944(i6, timeUnit);
            aVar.m12830(yVar.m12007(), str);
            aVar.mo12588();
            a0 m11746 = aVar.mo12591(false).m11757(yVar).m11746();
            long m12596 = w4.e.m12596(m11746);
            if (m12596 == -1) {
                m12596 = 0;
            }
            c5.s m12827 = aVar.m12827(m12596);
            t4.c.m12050(m12827, Integer.MAX_VALUE, timeUnit);
            m12827.close();
            int m11738 = m11746.m11738();
            if (m11738 == 200) {
                if (this.f11748.mo5872().mo5890() && this.f11749.mo5872().mo5890()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (m11738 != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + m11746.m11738());
            }
            y mo11759 = this.f11742.m11784().m11724().mo11759(this.f11742, m11746);
            if (mo11759 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(m11746.m11740("Connection"))) {
                return mo11759;
            }
            yVar = mo11759;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private y m12393() throws IOException {
        y m12012 = new y.a().m12020(this.f11742.m11784().m11728()).m12016("CONNECT", null).m12014("Host", t4.c.m12074(this.f11742.m11784().m11728(), true)).m12014("Proxy-Connection", "Keep-Alive").m12014("User-Agent", t4.d.m12085()).m12012();
        y mo11759 = this.f11742.m11784().m11724().mo11759(this.f11742, new a0.a().m11757(m12012).m11755(w.HTTP_1_1).m11748(407).m11752("Preemptive Authenticate").m11745(t4.c.f11325).m11758(-1L).m11756(-1L).m11750("Proxy-Authenticate", "OkHttp-Preemptive").m11746());
        return mo11759 != null ? mo11759 : m12012;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m12394(b bVar, int i5, s4.d dVar, o oVar) throws IOException {
        if (this.f11742.m11784().m11727() != null) {
            oVar.m11864(dVar);
            m12390(bVar);
            oVar.m11863(dVar, this.f11745);
            if (this.f11746 == w.HTTP_2) {
                m12395(i5);
                return;
            }
            return;
        }
        List<w> m11722 = this.f11742.m11784().m11722();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        if (!m11722.contains(wVar)) {
            this.f11744 = this.f11743;
            this.f11746 = w.HTTP_1_1;
        } else {
            this.f11744 = this.f11743;
            this.f11746 = wVar;
            m12395(i5);
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m12395(int i5) throws IOException {
        this.f11744.setSoTimeout(0);
        y4.g m13009 = new g.h(true).m13012(this.f11744, this.f11742.m11784().m11728().m11912(), this.f11748, this.f11749).m13010(this).m13011(i5).m13009();
        this.f11747 = m13009;
        m13009.m13007();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f11742.m11784().m11728().m11912());
        sb.append(":");
        sb.append(this.f11742.m11784().m11728().m11918());
        sb.append(", proxy=");
        sb.append(this.f11742.m11785());
        sb.append(" hostAddress=");
        sb.append(this.f11742.m11787());
        sb.append(" cipherSuite=");
        q qVar = this.f11745;
        sb.append(qVar != null ? qVar.m11873() : "none");
        sb.append(" protocol=");
        sb.append(this.f11746);
        sb.append('}');
        return sb.toString();
    }

    @Override // y4.g.j
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo12396(y4.g gVar) {
        synchronized (this.f11741) {
            this.f11752 = gVar.m12995();
        }
    }

    @Override // y4.g.j
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo12397(y4.i iVar) throws IOException {
        iVar.m13046(y4.b.REFUSED_STREAM);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m12398() {
        t4.c.m12061(this.f11743);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* renamed from: ʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12399(int r17, int r18, int r19, int r20, boolean r21, s4.d r22, s4.o r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.m12399(int, int, int, int, boolean, s4.d, s4.o):void");
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public q m12400() {
        return this.f11745;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m12401(s4.a aVar, @Nullable c0 c0Var) {
        if (this.f11753.size() >= this.f11752 || this.f11750 || !t4.a.f11321.mo11983(this.f11742.m11784(), aVar)) {
            return false;
        }
        if (aVar.m11728().m11912().equals(m12405().m11784().m11728().m11912())) {
            return true;
        }
        if (this.f11747 == null || c0Var == null || c0Var.m11785().type() != Proxy.Type.DIRECT || this.f11742.m11785().type() != Proxy.Type.DIRECT || !this.f11742.m11787().equals(c0Var.m11787()) || c0Var.m11784().m11721() != b5.d.f4876 || !m12407(aVar.m11728())) {
            return false;
        }
        try {
            aVar.m11717().m11795(aVar.m11728().m11912(), m12400().m11874());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m12402(boolean z5) {
        if (this.f11744.isClosed() || this.f11744.isInputShutdown() || this.f11744.isOutputShutdown()) {
            return false;
        }
        y4.g gVar = this.f11747;
        if (gVar != null) {
            return gVar.m12994(System.nanoTime());
        }
        if (z5) {
            try {
                int soTimeout = this.f11744.getSoTimeout();
                try {
                    this.f11744.setSoTimeout(1);
                    return !this.f11748.mo5890();
                } finally {
                    this.f11744.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m12403() {
        return this.f11747 != null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public w4.c m12404(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.f11747 != null) {
            return new y4.f(vVar, aVar, gVar, this.f11747);
        }
        this.f11744.setSoTimeout(aVar.mo11942());
        c5.t mo5868 = this.f11748.mo5868();
        long mo11942 = aVar.mo11942();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo5868.mo5944(mo11942, timeUnit);
        this.f11749.mo5866().mo5944(aVar.mo11943(), timeUnit);
        return new x4.a(vVar, gVar, this.f11748, this.f11749);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public c0 m12405() {
        return this.f11742;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public Socket m12406() {
        return this.f11744;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public boolean m12407(s sVar) {
        if (sVar.m11918() != this.f11742.m11784().m11728().m11918()) {
            return false;
        }
        if (sVar.m11912().equals(this.f11742.m11784().m11728().m11912())) {
            return true;
        }
        return this.f11745 != null && b5.d.f4876.m5718(sVar.m11912(), (X509Certificate) this.f11745.m11874().get(0));
    }
}
