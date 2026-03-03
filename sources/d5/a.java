package d5;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* compiled from: BoundaryInterfaceReflectionUtil.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static <T> T m8257(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m8258(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m8259()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m8259() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
