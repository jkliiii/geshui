package z4;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import s4.v;
import s4.w;

/* compiled from: Platform.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final k f12831 = m13238();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Logger f12832 = Logger.getLogger(v.class.getName());

    /* renamed from: ʼ, reason: contains not printable characters */
    public static List<String> m13234(List<w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = list.get(i5);
            if (wVar != w.HTTP_1_0) {
                arrayList.add(wVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static byte[] m13235(List<w> list) {
        c5.c cVar = new c5.c();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = list.get(i5);
            if (wVar != w.HTTP_1_0) {
                cVar.writeByte(wVar.toString().length());
                cVar.mo5901(wVar.toString());
            }
        }
        return cVar.mo5886();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static k m13236() {
        k m13201 = e.m13201();
        if (m13201 != null) {
            return m13201;
        }
        k m13207 = f.m13207();
        if (m13207 != null) {
            return m13207;
        }
        throw new NullPointerException("No platform found on Android");
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static k m13237() {
        g m13221;
        if (m13241() && (m13221 = g.m13221()) != null) {
            return m13221;
        }
        h m13224 = h.m13224();
        if (m13224 != null) {
            return m13224;
        }
        k m13225 = i.m13225();
        return m13225 != null ? m13225 : new k();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static k m13238() {
        return m13240() ? m13236() : m13237();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static k m13239() {
        return f12831;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static boolean m13240() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static boolean m13241() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: ʽ */
    public b5.c mo13210(X509TrustManager x509TrustManager) {
        return new b5.a(mo13211(x509TrustManager));
    }

    /* renamed from: ʾ */
    public b5.e mo13211(X509TrustManager x509TrustManager) {
        return new b5.b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: ˉ */
    public void mo13212(Socket socket, InetSocketAddress inetSocketAddress, int i5) throws IOException {
        socket.connect(inetSocketAddress, i5);
    }

    /* renamed from: ˑ */
    public SSLContext mo13213() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e5) {
            throw new IllegalStateException("No TLS provider", e5);
        }
    }

    @Nullable
    /* renamed from: י */
    public String mo13204(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: ـ */
    public Object mo13214(String str) {
        if (f12832.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: ᐧ */
    public boolean mo13215(String str) {
        return true;
    }

    /* renamed from: ᵎ */
    public void mo13216(int i5, String str, @Nullable Throwable th) {
        f12832.log(i5 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: ᵔ */
    public void mo13217(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo13216(5, str, (Throwable) obj);
    }

    /* renamed from: ʻ */
    public void mo13226(SSLSocket sSLSocket) {
    }

    /* renamed from: ˆ */
    public void mo13223(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: ˈ */
    public void mo13203(SSLSocket sSLSocket, @Nullable String str, List<w> list) throws IOException {
    }
}
