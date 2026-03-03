package z4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import s4.w;

/* compiled from: JdkWithJettyBootPlatform.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class i extends k {

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Method f12820;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Method f12821;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Method f12822;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Class<?> f12823;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Class<?> f12824;

    /* compiled from: JdkWithJettyBootPlatform.java */
    private static class a implements InvocationHandler {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final List<String> f12825;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f12826;

        /* renamed from: ʽ, reason: contains not printable characters */
        String f12827;

        a(List<String> list) {
            this.f12825 = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = t4.c.f11324;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f12826 = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f12825;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (this.f12825.contains(list.get(i5))) {
                            String str = (String) list.get(i5);
                            this.f12827 = str;
                            return str;
                        }
                    }
                    String str2 = this.f12825.get(0);
                    this.f12827 = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f12827 = (String) objArr[0];
            return null;
        }
    }

    i(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f12820 = method;
        this.f12821 = method2;
        this.f12822 = method3;
        this.f12823 = cls;
        this.f12824 = cls2;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static k m13225() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new i(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // z4.k
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo13226(SSLSocket sSLSocket) {
        try {
            this.f12822.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw t4.c.m12051("unable to remove alpn", e5);
        }
    }

    @Override // z4.k
    /* renamed from: ˈ */
    public void mo13203(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            this.f12820.invoke(null, sSLSocket, Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{this.f12823, this.f12824}, new a(k.m13234(list))));
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw t4.c.m12051("unable to set alpn", e5);
        }
    }

    @Override // z4.k
    @Nullable
    /* renamed from: י */
    public String mo13204(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f12821.invoke(null, sSLSocket));
            boolean z5 = aVar.f12826;
            if (!z5 && aVar.f12827 == null) {
                k.m13239().mo13216(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z5) {
                return null;
            }
            return aVar.f12827;
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw t4.c.m12051("unable to get selected protocol", e5);
        }
    }
}
