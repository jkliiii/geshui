package z4;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import s4.w;

/* compiled from: AndroidPlatform.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f extends k {

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Class<?> f12805;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final j<Socket> f12806;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final j<Socket> f12807;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final j<Socket> f12808;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final j<Socket> f12809;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final c f12810 = c.m13218();

    /* compiled from: AndroidPlatform.java */
    static final class a extends b5.c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Object f12811;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Method f12812;

        a(Object obj, Method method) {
            this.f12811 = obj;
            this.f12812 = method;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        @Override // b5.c
        /* renamed from: ʻ */
        public List<Certificate> mo5711(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f12812.invoke(this.f12811, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e6) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e6.getMessage());
                sSLPeerUnverifiedException.initCause(e6);
                throw sSLPeerUnverifiedException;
            }
        }
    }

    /* compiled from: AndroidPlatform.java */
    static final class b implements b5.e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final X509TrustManager f12813;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Method f12814;

        b(X509TrustManager x509TrustManager, Method method) {
            this.f12814 = method;
            this.f12813 = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12813.equals(bVar.f12813) && this.f12814.equals(bVar.f12814);
        }

        public int hashCode() {
            return this.f12813.hashCode() + (this.f12814.hashCode() * 31);
        }

        @Override // b5.e
        /* renamed from: ʻ */
        public X509Certificate mo5712(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f12814.invoke(this.f12813, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e5) {
                throw t4.c.m12051("unable to get issues and signature", e5);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* compiled from: AndroidPlatform.java */
    static final class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Method f12815;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Method f12816;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Method f12817;

        c(Method method, Method method2, Method method3) {
            this.f12815 = method;
            this.f12816 = method2;
            this.f12817 = method3;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static c m13218() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new c(method, method3, method2);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        Object m13219(String str) {
            Method method = this.f12815;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f12816.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean m13220(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f12817.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    f(Class<?> cls, j<Socket> jVar, j<Socket> jVar2, j<Socket> jVar3, j<Socket> jVar4) {
        this.f12805 = cls;
        this.f12806 = jVar;
        this.f12807 = jVar2;
        this.f12808 = jVar3;
        this.f12809 = jVar4;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean m13205(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo13215(str);
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean m13206(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m13205(str, cls, obj);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static k m13207() {
        Class<?> cls;
        j jVar;
        j jVar2;
        if (!k.m13240()) {
            return null;
        }
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            j jVar3 = new j(null, "setUseSessionTickets", Boolean.TYPE);
            j jVar4 = new j(null, "setHostname", String.class);
            if (m13209()) {
                j jVar5 = new j(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                jVar2 = new j(null, "setAlpnProtocols", byte[].class);
                jVar = jVar5;
            } else {
                jVar = null;
                jVar2 = null;
            }
            return new f(cls2, jVar3, jVar4, jVar, jVar2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    static int m13208() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private static boolean m13209() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // z4.k
    /* renamed from: ʽ, reason: contains not printable characters */
    public b5.c mo13210(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo13210(x509TrustManager);
        }
    }

    @Override // z4.k
    /* renamed from: ʾ, reason: contains not printable characters */
    public b5.e mo13211(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo13211(x509TrustManager);
        }
    }

    @Override // z4.k
    /* renamed from: ˈ */
    public void mo13203(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
        if (str != null) {
            this.f12806.m13231(sSLSocket, Boolean.TRUE);
            this.f12807.m13231(sSLSocket, str);
        }
        j<Socket> jVar = this.f12809;
        if (jVar == null || !jVar.m13233(sSLSocket)) {
            return;
        }
        this.f12809.m13232(sSLSocket, k.m13235(list));
    }

    @Override // z4.k
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo13212(Socket socket, InetSocketAddress inetSocketAddress, int i5) throws IOException {
        try {
            socket.connect(inetSocketAddress, i5);
        } catch (AssertionError e5) {
            if (!t4.c.m12083(e5)) {
                throw e5;
            }
            throw new IOException(e5);
        } catch (ClassCastException e6) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e6;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e6);
            throw iOException;
        } catch (SecurityException e7) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e7);
            throw iOException2;
        }
    }

    @Override // z4.k
    /* renamed from: ˑ, reason: contains not printable characters */
    public SSLContext mo13213() {
        boolean z5 = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z5 = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z5) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e5) {
            throw new IllegalStateException("No TLS provider", e5);
        }
    }

    @Override // z4.k
    @Nullable
    /* renamed from: י */
    public String mo13204(SSLSocket sSLSocket) {
        byte[] bArr;
        j<Socket> jVar = this.f12808;
        if (jVar == null || !jVar.m13233(sSLSocket) || (bArr = (byte[]) this.f12808.m13232(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, t4.c.f11332);
    }

    @Override // z4.k
    /* renamed from: ـ, reason: contains not printable characters */
    public Object mo13214(String str) {
        return this.f12810.m13219(str);
    }

    @Override // z4.k
    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean mo13215(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.mo13215(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m13206(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo13215(str);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw t4.c.m12051("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e6) {
            e = e6;
            throw t4.c.m12051("unable to determine cleartext support", e);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw t4.c.m12051("unable to determine cleartext support", e);
        }
    }

    @Override // z4.k
    /* renamed from: ᵎ, reason: contains not printable characters */
    public void mo13216(int i5, String str, @Nullable Throwable th) {
        int min;
        int i6 = i5 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int indexOf = str.indexOf(10, i7);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i7 + 4000);
                Log.println(i6, "OkHttp", str.substring(i7, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i7 = min;
                }
            }
            i7 = min + 1;
        }
    }

    @Override // z4.k
    /* renamed from: ᵔ, reason: contains not printable characters */
    public void mo13217(String str, Object obj) {
        if (this.f12810.m13220(obj)) {
            return;
        }
        mo13216(5, str, null);
    }
}
