package s4;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: Handshake.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class q {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final d0 f11125;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final g f11126;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final List<Certificate> f11127;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final List<Certificate> f11128;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f11125 = d0Var;
        this.f11126 = gVar;
        this.f11127 = list;
        this.f11128 = list2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static q m11872(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g m11800 = g.m11800(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 m11790 = d0.m11790(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List m12077 = certificateArr != null ? t4.c.m12077(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(m11790, m11800, m12077, localCertificates != null ? t4.c.m12077(localCertificates) : Collections.emptyList());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f11125.equals(qVar.f11125) && this.f11126.equals(qVar.f11126) && this.f11127.equals(qVar.f11127) && this.f11128.equals(qVar.f11128);
    }

    public int hashCode() {
        return ((((((527 + this.f11125.hashCode()) * 31) + this.f11126.hashCode()) * 31) + this.f11127.hashCode()) * 31) + this.f11128.hashCode();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public g m11873() {
        return this.f11126;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public List<Certificate> m11874() {
        return this.f11127;
    }
}
