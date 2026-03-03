package n2;

import android.os.Build;
import java.lang.reflect.Field;
import java.util.Hashtable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import n2.d;

/* compiled from: SSLEngineSNIConfigurator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b0 implements h {

    /* renamed from: ʻ, reason: contains not printable characters */
    Hashtable<String, a> f9564 = new Hashtable<>();

    /* compiled from: SSLEngineSNIConfigurator.java */
    private static class a implements h {

        /* renamed from: ʻ, reason: contains not printable characters */
        Field f9565;

        /* renamed from: ʼ, reason: contains not printable characters */
        Field f9566;

        /* renamed from: ʽ, reason: contains not printable characters */
        Field f9567;

        /* renamed from: ʾ, reason: contains not printable characters */
        Field f9568;

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean f9569;

        public a(Class cls) {
            try {
                Field declaredField = cls.getSuperclass().getDeclaredField("peerHost");
                this.f9565 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getSuperclass().getDeclaredField("peerPort");
                this.f9566 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("sslParameters");
                this.f9567 = declaredField3;
                declaredField3.setAccessible(true);
                Field declaredField4 = this.f9567.getType().getDeclaredField("useSni");
                this.f9568 = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        @Override // n2.h
        /* renamed from: ʻ */
        public SSLEngine mo10474(SSLContext sSLContext, String str, int i5) {
            return null;
        }

        @Override // n2.h
        /* renamed from: ʼ */
        public void mo10475(SSLEngine sSLEngine, d.a aVar, String str, int i5) {
            if (this.f9568 == null || this.f9569) {
                return;
            }
            try {
                this.f9565.set(sSLEngine, str);
                this.f9566.set(sSLEngine, Integer.valueOf(i5));
                this.f9568.set(this.f9567.get(sSLEngine), Boolean.TRUE);
            } catch (IllegalAccessException unused) {
            }
        }
    }

    @Override // n2.h
    /* renamed from: ʻ, reason: contains not printable characters */
    public SSLEngine mo10474(SSLContext sSLContext, String str, int i5) {
        return "GmsCore_OpenSSL".equals(sSLContext.getProvider().getName()) || Build.VERSION.SDK_INT >= 23 ? sSLContext.createSSLEngine(str, i5) : sSLContext.createSSLEngine();
    }

    @Override // n2.h
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo10475(SSLEngine sSLEngine, d.a aVar, String str, int i5) {
        m10476(sSLEngine).mo10475(sSLEngine, aVar, str, i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    a m10476(SSLEngine sSLEngine) {
        String canonicalName = sSLEngine.getClass().getCanonicalName();
        a aVar = this.f9564.get(canonicalName);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(sSLEngine.getClass());
        this.f9564.put(canonicalName, aVar2);
        return aVar2;
    }
}
