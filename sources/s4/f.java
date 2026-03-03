package s4;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: CertificatePinner.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final f f10943 = new a().m11798();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Set<b> f10944;

    /* renamed from: ʼ, reason: contains not printable characters */
    @Nullable
    private final b5.c f10945;

    /* compiled from: CertificatePinner.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final List<b> f10946 = new ArrayList();

        /* renamed from: ʻ, reason: contains not printable characters */
        public f m11798() {
            return new f(new LinkedHashSet(this.f10946), null);
        }
    }

    /* compiled from: CertificatePinner.java */
    static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final String f10947;

        /* renamed from: ʼ, reason: contains not printable characters */
        final String f10948;

        /* renamed from: ʽ, reason: contains not printable characters */
        final String f10949;

        /* renamed from: ʾ, reason: contains not printable characters */
        final c5.f f10950;

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f10947.equals(bVar.f10947) && this.f10949.equals(bVar.f10949) && this.f10950.equals(bVar.f10950)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f10947.hashCode()) * 31) + this.f10949.hashCode()) * 31) + this.f10950.hashCode();
        }

        public String toString() {
            return this.f10949 + this.f10950.mo5922();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m11799(String str) {
            if (!this.f10947.startsWith("*.")) {
                return str.equals(this.f10948);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f10948.length()) {
                String str2 = this.f10948;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }
    }

    f(Set<b> set, @Nullable b5.c cVar) {
        this.f10944 = set;
        this.f10945 = cVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m11792(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + m11794((X509Certificate) certificate).mo5922();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static c5.f m11793(X509Certificate x509Certificate) {
        return c5.f.m5921(x509Certificate.getPublicKey().getEncoded()).mo5928();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static c5.f m11794(X509Certificate x509Certificate) {
        return c5.f.m5921(x509Certificate.getPublicKey().getEncoded()).mo5929();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (t4.c.m12071(this.f10945, fVar.f10945) && this.f10944.equals(fVar.f10944)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        b5.c cVar = this.f10945;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f10944.hashCode();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m11795(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> m11796 = m11796(str);
        if (m11796.isEmpty()) {
            return;
        }
        b5.c cVar = this.f10945;
        if (cVar != null) {
            list = cVar.mo5711(list, str);
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i5);
            int size2 = m11796.size();
            c5.f fVar = null;
            c5.f fVar2 = null;
            for (int i6 = 0; i6 < size2; i6++) {
                b bVar = m11796.get(i6);
                if (bVar.f10949.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = m11794(x509Certificate);
                    }
                    if (bVar.f10950.equals(fVar)) {
                        return;
                    }
                } else {
                    if (!bVar.f10949.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f10949);
                    }
                    if (fVar2 == null) {
                        fVar2 = m11793(x509Certificate);
                    }
                    if (bVar.f10950.equals(fVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i7);
            sb.append("\n    ");
            sb.append(m11792(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = m11796.size();
        for (int i8 = 0; i8 < size4; i8++) {
            b bVar2 = m11796.get(i8);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    List<b> m11796(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.f10944) {
            if (bVar.m11799(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    f m11797(@Nullable b5.c cVar) {
        return t4.c.m12071(this.f10945, cVar) ? this : new f(this.f10944, cVar);
    }
}
