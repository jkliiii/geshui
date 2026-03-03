package z4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import s4.w;

/* compiled from: Jdk9Platform.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class h extends k {

    /* renamed from: ʽ, reason: contains not printable characters */
    final Method f12818;

    /* renamed from: ʾ, reason: contains not printable characters */
    final Method f12819;

    h(Method method, Method method2) {
        this.f12818 = method;
        this.f12819 = method2;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static h m13224() {
        try {
            return new h(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // z4.k
    /* renamed from: ˈ */
    public void mo13203(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> m13234 = k.m13234(list);
            this.f12818.invoke(sSLParameters, m13234.toArray(new String[m13234.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw t4.c.m12051("unable to set ssl parameters", e5);
        }
    }

    @Override // z4.k
    @Nullable
    /* renamed from: י */
    public String mo13204(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f12819.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals(BuildConfig.FLAVOR)) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e5) {
            throw t4.c.m12051("failed to get ALPN selected protocol", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw t4.c.m12051("failed to get ALPN selected protocol", e6);
        }
    }
}
