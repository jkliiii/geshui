package b5;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import z4.k;

/* compiled from: CertificateChainCleaner.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c {
    /* renamed from: ʼ, reason: contains not printable characters */
    public static c m5713(X509TrustManager x509TrustManager) {
        return k.m13239().mo13210(x509TrustManager);
    }

    /* renamed from: ʻ */
    public abstract List<Certificate> mo5711(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
