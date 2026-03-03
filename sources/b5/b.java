package b5;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: BasicTrustRootIndex.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b implements e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<X500Principal, Set<X509Certificate>> f4875 = new LinkedHashMap();

    public b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f4875.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f4875.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b) && ((b) obj).f4875.equals(this.f4875);
    }

    public int hashCode() {
        return this.f4875.hashCode();
    }

    @Override // b5.e
    /* renamed from: ʻ, reason: contains not printable characters */
    public X509Certificate mo5712(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f4875.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
