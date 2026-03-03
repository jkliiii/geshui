package y2;

import javax.net.ssl.SSLException;

/* compiled from: BrowserCompatHostnameVerifier.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends a {
    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
        m12923(str, strArr, strArr2, false);
    }
}
