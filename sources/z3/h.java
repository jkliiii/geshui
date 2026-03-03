package z3;

import f4.k;
import java.lang.reflect.Method;

/* compiled from: DebugMetadata.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class h {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final h f12798 = new h();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final a f12799 = new a(null, null, null);

    /* renamed from: ʽ, reason: contains not printable characters */
    private static a f12800;

    /* compiled from: DebugMetadata.kt */
    private static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final Method f12801;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final Method f12802;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final Method f12803;

        public a(Method method, Method method2, Method method3) {
            this.f12801 = method;
            this.f12802 = method2;
            this.f12803 = method3;
        }
    }

    private h() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private final a m13195(z3.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f12800 = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f12799;
            f12800 = aVar3;
            return aVar3;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final String m13196(z3.a aVar) {
        k.m8623(aVar, "continuation");
        a aVar2 = f12800;
        if (aVar2 == null) {
            aVar2 = m13195(aVar);
        }
        if (aVar2 == f12799) {
            return null;
        }
        Method method = aVar2.f12801;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f12802;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f12803;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
