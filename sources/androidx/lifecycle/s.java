package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Lifecycling.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class s {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final s f3872 = new s();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Map<Class<?>, Integer> f3873 = new HashMap();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Map<Class<?>, List<Constructor<? extends h>>> f3874 = new HashMap();

    private s() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private final h m4496(Constructor<? extends h> constructor, Object obj) {
        try {
            h newInstance = constructor.newInstance(obj);
            f4.k.m8622(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Constructor<? extends h> m4497(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : BuildConfig.FLAVOR;
            f4.k.m8622(name, "fullPackage");
            if (!(name.length() == 0)) {
                f4.k.m8622(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                f4.k.m8622(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            f4.k.m8622(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String m4498 = m4498(canonicalName);
            if (!(name.length() == 0)) {
                m4498 = name + '.' + m4498;
            }
            Class<?> cls2 = Class.forName(m4498);
            f4.k.m8621(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final String m4498(String str) {
        f4.k.m8623(str, "className");
        return l4.l.m9755(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int m4499(Class<?> cls) {
        Map<Class<?>, Integer> map = f3873;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m4502 = m4502(cls);
        map.put(cls, Integer.valueOf(m4502));
        return m4502;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean m4500(Class<?> cls) {
        return cls != null && o.class.isAssignableFrom(cls);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final n m4501(Object obj) {
        f4.k.m8623(obj, "object");
        boolean z5 = obj instanceof n;
        boolean z6 = obj instanceof e;
        if (z5 && z6) {
            return new f((e) obj, (n) obj);
        }
        if (z6) {
            return new f((e) obj, null);
        }
        if (z5) {
            return (n) obj;
        }
        Class<?> cls = obj.getClass();
        s sVar = f3872;
        if (sVar.m4499(cls) != 2) {
            return new b0(obj);
        }
        List<Constructor<? extends h>> list = f3874.get(cls);
        f4.k.m8620(list);
        List<Constructor<? extends h>> list2 = list;
        if (list2.size() == 1) {
            return new m0(sVar.m4496(list2.get(0), obj));
        }
        int size = list2.size();
        h[] hVarArr = new h[size];
        for (int i5 = 0; i5 < size; i5++) {
            hVarArr[i5] = f3872.m4496(list2.get(i5), obj);
        }
        return new c(hVarArr);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int m4502(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends h> m4497 = m4497(cls);
        if (m4497 != null) {
            f3874.put(cls, w3.m.m12560(m4497));
            return 2;
        }
        if (b.f3786.m4397(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (m4500(superclass)) {
            f4.k.m8622(superclass, "superclass");
            if (m4499(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends h>> list = f3874.get(superclass);
            f4.k.m8620(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        f4.k.m8622(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (m4500(cls2)) {
                f4.k.m8622(cls2, "intrface");
                if (m4499(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends h>> list2 = f3874.get(cls2);
                f4.k.m8620(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3874.put(cls, arrayList);
        return 2;
    }
}
