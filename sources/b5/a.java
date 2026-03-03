package b5;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: BasicCertificateChainCleaner.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a extends c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e f4874;

    public a(e eVar) {
        this.f4874 = eVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m5710(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && ((a) obj).f4874.equals(this.f4874);
    }

    public int hashCode() {
        return this.f4874.hashCode();
    }

    @Override // b5.c
    /* renamed from: ʻ, reason: contains not printable characters */
    public List<Certificate> mo5711(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z5 = false;
        for (int i5 = 0; i5 < 9; i5++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate mo5712 = this.f4874.mo5712(x509Certificate);
            if (mo5712 == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (m5710(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z5) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(mo5712)) {
                arrayList.add(mo5712);
            }
            if (m5710(mo5712, mo5712)) {
                return arrayList;
            }
            z5 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
