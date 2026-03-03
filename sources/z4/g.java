package z4;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import s4.w;

/* compiled from: ConscryptPlatform.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends k {
    private g() {
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static g m13221() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new g();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Provider m13222() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // z4.k
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo13223(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // z4.k
    /* renamed from: ˈ */
    public void mo13203(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo13203(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) k.m13234(list).toArray(new String[0]));
    }

    @Override // z4.k
    /* renamed from: ˑ */
    public SSLContext mo13213() {
        try {
            return SSLContext.getInstance("TLSv1.3", m13222());
        } catch (NoSuchAlgorithmException e5) {
            try {
                return SSLContext.getInstance("TLS", m13222());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e5);
            }
        }
    }

    @Override // z4.k
    @Nullable
    /* renamed from: י */
    public String mo13204(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo13204(sSLSocket);
    }
}
