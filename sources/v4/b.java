package v4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import s4.j;

/* compiled from: ConnectionSpecSelector.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<j> f11737;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f11738 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f11739;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f11740;

    public b(List<j> list) {
        this.f11737 = list;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m12386(SSLSocket sSLSocket) {
        for (int i5 = this.f11738; i5 < this.f11737.size(); i5++) {
            if (this.f11737.get(i5).m11814(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public j m12387(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i5 = this.f11738;
        int size = this.f11737.size();
        while (true) {
            if (i5 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f11737.get(i5);
            if (jVar.m11814(sSLSocket)) {
                this.f11738 = i5 + 1;
                break;
            }
            i5++;
        }
        if (jVar != null) {
            this.f11739 = m12386(sSLSocket);
            t4.a.f11321.mo11979(jVar, sSLSocket, this.f11740);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f11740 + ", modes=" + this.f11737 + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m12388(IOException iOException) {
        this.f11740 = true;
        if (!this.f11739 || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z5 = iOException instanceof SSLHandshakeException;
        if ((z5 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z5 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
