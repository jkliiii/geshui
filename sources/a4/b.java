package a4;

import f4.k;

/* compiled from: PlatformImplementations.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final a f121;

    static {
        a aVar;
        Object newInstance;
        try {
            newInstance = c4.a.class.newInstance();
            k.m8622(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                } catch (ClassCastException e5) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (k.m8619(classLoader, classLoader2)) {
                        throw e5;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e5);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = b4.a.class.newInstance();
                k.m8622(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        if (newInstance2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) newInstance2;
                    } catch (ClassNotFoundException unused2) {
                        aVar = new a();
                    }
                } catch (ClassCastException e6) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = a.class.getClassLoader();
                    if (k.m8619(classLoader3, classLoader4)) {
                        throw e6;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e6);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            k.m8622(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    k.m8622(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) newInstance4;
                    } catch (ClassCastException e7) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (k.m8619(classLoader5, classLoader6)) {
                            throw e7;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e7);
                    }
                }
            } catch (ClassCastException e8) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = a.class.getClassLoader();
                if (k.m8619(classLoader7, classLoader8)) {
                    throw e8;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e8);
            }
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        aVar = (a) newInstance;
        f121 = aVar;
    }
}
