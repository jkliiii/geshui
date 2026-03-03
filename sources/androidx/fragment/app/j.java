package androidx.fragment.app;

import androidx.fragment.app.e;

/* compiled from: FragmentFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final m.g<ClassLoader, m.g<String, Class<?>>> f3587 = new m.g<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    static boolean m4114(ClassLoader classLoader, String str) {
        try {
            return e.class.isAssignableFrom(m4115(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Class<?> m4115(ClassLoader classLoader, String str) throws ClassNotFoundException {
        m.g<ClassLoader, m.g<String, Class<?>>> gVar = f3587;
        m.g<String, Class<?>> gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new m.g<>();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static Class<? extends e> m4116(ClassLoader classLoader, String str) {
        try {
            return m4115(classLoader, str);
        } catch (ClassCastException e5) {
            throw new e.k("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e5);
        } catch (ClassNotFoundException e6) {
            throw new e.k("Unable to instantiate fragment " + str + ": make sure class name exists", e6);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public e mo4117(ClassLoader classLoader, String str) {
        throw null;
    }
}
