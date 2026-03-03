package y2;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* compiled from: AbstractVerifier.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a implements X509HostnameVerifier {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Pattern f12466 = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final String[] f12467;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f12467 = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m12918(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i5 = length - 3;
        if (str.charAt(i5) == '.') {
            return Arrays.binarySearch(f12467, str.substring(2, i5)) < 0;
        }
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m12919(String str) {
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (str.charAt(i6) == '.') {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String[] m12920(X509Certificate x509Certificate) {
        List<String> m12931 = new b(x509Certificate.getSubjectX500Principal()).m12931("cn");
        if (m12931.isEmpty()) {
            return null;
        }
        String[] strArr = new String[m12931.size()];
        m12931.toArray(strArr);
        return strArr;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static String[] m12921(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e5) {
            Logger.getLogger(a.class.getName()).log(Level.FINE, "Error parsing certificate.", (Throwable) e5);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static boolean m12922(String str) {
        return f12466.matcher(str).matches();
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, SSLSocket sSLSocket) throws IOException {
        if (str == null) {
            throw new NullPointerException("host to verify is null");
        }
        verify(str, (X509Certificate) sSLSocket.getSession().getPeerCertificates()[0]);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final void m12923(String str, String[] strArr, String[] strArr2, boolean z5) throws SSLException {
        String str2;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append('>');
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(46, 2) != -1 && m12918(lowerCase2) && !m12922(str)) {
                boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                z6 = (endsWith && z5) ? m12919(lowerCase) == m12919(lowerCase2) : endsWith;
            } else {
                z6 = lowerCase.equals(lowerCase2);
            }
            if (z6) {
                break;
            }
        }
        if (z6) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier, javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, X509Certificate x509Certificate) throws SSLException {
        verify(str, m12920(x509Certificate), m12921(x509Certificate));
    }
}
