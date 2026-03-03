package b3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import k2.e;
import n2.c0;
import n2.d;
import n2.i;

/* compiled from: ConscryptMiddleware.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends c0 {

    /* renamed from: ʿ, reason: contains not printable characters */
    static final Object f4865 = new Object();

    /* renamed from: ˆ, reason: contains not printable characters */
    static boolean f4866;

    /* renamed from: ˈ, reason: contains not printable characters */
    static boolean f4867;

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean f4868;

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean f4869 = true;

    /* renamed from: ʽ, reason: contains not printable characters */
    i f4870;

    /* renamed from: ʾ, reason: contains not printable characters */
    Context f4871;

    public a(Context context, i iVar) {
        this.f4870 = iVar;
        this.f4871 = context.getApplicationContext();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m5706(Context context) {
        try {
            synchronized (f4865) {
                if (f4866) {
                    return;
                }
                f4866 = true;
                if (Security.getProvider("GmsCore_OpenSSL") != null) {
                    f4867 = true;
                    return;
                }
                SSLContext sSLContext = SSLContext.getDefault();
                SSLSocketFactory defaultSSLSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
                ProviderInstaller.installIfNeeded(context);
                Provider[] providers = Security.getProviders();
                Provider provider = Security.getProvider("GmsCore_OpenSSL");
                Security.removeProvider("GmsCore_OpenSSL");
                Security.insertProviderAt(provider, providers.length);
                SSLContext.setDefault(sSLContext);
                HttpsURLConnection.setDefaultSSLSocketFactory(defaultSSLSocketFactory);
                f4867 = true;
            }
        } catch (Throwable th) {
            Log.w("IonConscrypt", "Conscrypt initialization failed.", th);
        }
    }

    @Override // n2.c0, n2.d
    /* renamed from: ˉ, reason: contains not printable characters */
    public m2.a mo5707(d.a aVar) {
        if (!this.f4869) {
            return null;
        }
        m5708();
        return super.mo5707(aVar);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m5708() {
        m5706(this.f4871);
        if (f4867 && !this.f4868 && this.f4869) {
            this.f4868 = true;
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", "GmsCore_OpenSSL");
                sSLContext.init(null, null, null);
                if (this.f4870.m10526() == e.m9403()) {
                    this.f4870.m10528(sSLContext);
                }
            } catch (Exception unused) {
            }
        }
    }
}
