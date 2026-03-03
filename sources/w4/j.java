package w4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import s4.a0;
import s4.c0;
import s4.o;
import s4.s;
import s4.t;
import s4.v;
import s4.y;

/* compiled from: RetryAndFollowUpInterceptor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class j implements t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final v f12079;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean f12080;

    /* renamed from: ʽ, reason: contains not printable characters */
    private volatile v4.g f12081;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Object f12082;

    /* renamed from: ʿ, reason: contains not printable characters */
    private volatile boolean f12083;

    public j(v vVar, boolean z5) {
        this.f12079 = vVar;
        this.f12080 = z5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private s4.a m12616(s sVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        s4.f fVar;
        if (sVar.m11913()) {
            sSLSocketFactory = this.f12079.m11951();
            hostnameVerifier = this.f12079.m11964();
            fVar = this.f12079.m11954();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new s4.a(sVar.m11912(), sVar.m11918(), this.f12079.m11960(), this.f12079.m11969(), sSLSocketFactory, hostnameVerifier, fVar, this.f12079.m11974(), this.f12079.m11973(), this.f12079.m11972(), this.f12079.m11957(), this.f12079.m11975());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private y m12617(a0 a0Var, c0 c0Var) throws IOException {
        String m11740;
        s m11917;
        if (a0Var == null) {
            throw new IllegalStateException();
        }
        int m11738 = a0Var.m11738();
        String m12009 = a0Var.m11734().m12009();
        if (m11738 == 307 || m11738 == 308) {
            if (!m12009.equals("GET") && !m12009.equals("HEAD")) {
                return null;
            }
        } else {
            if (m11738 == 401) {
                return this.f12079.m11950().mo11759(c0Var, a0Var);
            }
            if (m11738 == 503) {
                if ((a0Var.m11732() == null || a0Var.m11732().m11738() != 503) && m12621(a0Var, Integer.MAX_VALUE) == 0) {
                    return a0Var.m11734();
                }
                return null;
            }
            if (m11738 == 407) {
                if (c0Var.m11785().type() == Proxy.Type.HTTP) {
                    return this.f12079.m11974().mo11759(c0Var, a0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (m11738 == 408) {
                if (!this.f12079.m11967()) {
                    return null;
                }
                a0Var.m11734().m12004();
                if ((a0Var.m11732() == null || a0Var.m11732().m11738() != 408) && m12621(a0Var, 0) <= 0) {
                    return a0Var.m11734();
                }
                return null;
            }
            switch (m11738) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f12079.m11962() || (m11740 = a0Var.m11740("Location")) == null || (m11917 = a0Var.m11734().m12011().m11917(m11740)) == null) {
            return null;
        }
        if (!m11917.m11904().equals(a0Var.m11734().m12011().m11904()) && !this.f12079.m11963()) {
            return null;
        }
        y.a m12010 = a0Var.m11734().m12010();
        if (f.m12603(m12009)) {
            boolean m12605 = f.m12605(m12009);
            if (f.m12604(m12009)) {
                m12010.m12016("GET", null);
            } else {
                m12010.m12016(m12009, m12605 ? a0Var.m11734().m12004() : null);
            }
            if (!m12605) {
                m12010.m12018("Transfer-Encoding");
                m12010.m12018("Content-Length");
                m12010.m12018("Content-Type");
            }
        }
        if (!m12622(a0Var, m11917)) {
            m12010.m12018("Authorization");
        }
        return m12010.m12020(m11917).m12012();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m12618(IOException iOException, boolean z5) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z5 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean m12619(IOException iOException, v4.g gVar, boolean z5, y yVar) {
        gVar.m12441(iOException);
        if (this.f12079.m11967()) {
            return !(z5 && m12620(iOException, yVar)) && m12618(iOException, z5) && gVar.m12435();
        }
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean m12620(IOException iOException, y yVar) {
        yVar.m12004();
        return iOException instanceof FileNotFoundException;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int m12621(a0 a0Var, int i5) {
        String m11740 = a0Var.m11740("Retry-After");
        if (m11740 == null) {
            return i5;
        }
        if (m11740.matches("\\d+")) {
            return Integer.valueOf(m11740).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean m12622(a0 a0Var, s sVar) {
        s m12011 = a0Var.m11734().m12011();
        return m12011.m11912().equals(sVar.m11912()) && m12011.m11918() == sVar.m11918() && m12011.m11904().equals(sVar.m11904());
    }

    @Override // s4.t
    /* renamed from: ʻ */
    public a0 mo11940(t.a aVar) throws IOException {
        a0 m12611;
        y mo11945 = aVar.mo11945();
        g gVar = (g) aVar;
        s4.d m12607 = gVar.m12607();
        o m12609 = gVar.m12609();
        v4.g gVar2 = new v4.g(this.f12079.m11956(), m12616(mo11945.m12011()), m12607, m12609, this.f12082);
        this.f12081 = gVar2;
        a0 a0Var = null;
        int i5 = 0;
        while (!this.f12083) {
            try {
                try {
                    try {
                        m12611 = gVar.m12611(mo11945, gVar2, null, null);
                        if (a0Var != null) {
                            m12611 = m12611.m11729().m11754(a0Var.m11729().m11745(null).m11746()).m11746();
                        }
                    } catch (IOException e5) {
                        if (!m12619(e5, gVar2, !(e5 instanceof y4.a), mo11945)) {
                            throw e5;
                        }
                    }
                } catch (v4.e e6) {
                    if (!m12619(e6.m12413(), gVar2, false, mo11945)) {
                        throw e6.m12412();
                    }
                }
                try {
                    y m12617 = m12617(m12611, gVar2.m12440());
                    if (m12617 == null) {
                        gVar2.m12438();
                        return m12611;
                    }
                    t4.c.m12059(m12611.m11731());
                    int i6 = i5 + 1;
                    if (i6 > 20) {
                        gVar2.m12438();
                        throw new ProtocolException("Too many follow-up requests: " + i6);
                    }
                    m12617.m12004();
                    if (!m12622(m12611, m12617.m12011())) {
                        gVar2.m12438();
                        gVar2 = new v4.g(this.f12079.m11956(), m12616(m12617.m12011()), m12607, m12609, this.f12082);
                        this.f12081 = gVar2;
                    } else if (gVar2.m12433() != null) {
                        throw new IllegalStateException("Closing the body of " + m12611 + " didn't close its backing stream. Bad interceptor?");
                    }
                    a0Var = m12611;
                    mo11945 = m12617;
                    i5 = i6;
                } catch (IOException e7) {
                    gVar2.m12438();
                    throw e7;
                }
            } catch (Throwable th) {
                gVar2.m12441(null);
                gVar2.m12438();
                throw th;
            }
        }
        gVar2.m12438();
        throw new IOException("Canceled");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m12623() {
        this.f12083 = true;
        v4.g gVar = this.f12081;
        if (gVar != null) {
            gVar.m12432();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m12624() {
        return this.f12083;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m12625(Object obj) {
        this.f12082 = obj;
    }
}
