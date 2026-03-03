package b5;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: OkHostnameVerifier.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d implements HostnameVerifier {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final d f4876 = new d();

    private d() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static List<String> m5714(X509Certificate x509Certificate) {
        List<String> m5715 = m5715(x509Certificate, 7);
        List<String> m57152 = m5715(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(m5715.size() + m57152.size());
        arrayList.addAll(m5715);
        arrayList.addAll(m57152);
        return arrayList;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static List<String> m5715(X509Certificate x509Certificate, int i5) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i5 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m5716(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m5715(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m5719(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m5717(String str, X509Certificate x509Certificate) {
        List<String> m5715 = m5715(x509Certificate, 7);
        int size = m5715.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (str.equalsIgnoreCase(m5715.get(i5))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m5718(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m5718(String str, X509Certificate x509Certificate) {
        return t4.c.m12060(str) ? m5717(str, x509Certificate) : m5716(str, x509Certificate);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m5719(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}
