package z4;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import s4.w;

/* compiled from: Android10Platform.java */
@SuppressLint({"NewApi"})
/* loaded from: E:\78999\cookie_5123796.dex */
class e extends f {
    e(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    @Nullable
    /* renamed from: ﹳ, reason: contains not printable characters */
    public static k m13201() {
        if (!k.m13240()) {
            return null;
        }
        try {
            if (f.m13208() >= 29) {
                return new e(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m13202(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Override // z4.f, z4.k
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* renamed from: ˈ, reason: contains not printable characters */
    public void mo13203(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
        try {
            m13202(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) k.m13234(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e5) {
            throw new IOException("Android internal error", e5);
        }
    }

    @Override // z4.f, z4.k
    @Nullable
    @IgnoreJRERequirement
    /* renamed from: י, reason: contains not printable characters */
    public String mo13204(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
