package androidx.lifecycle;

import androidx.lifecycle.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: E:\78999\cookie_5123796.dex */
final class b {

    /* renamed from: ʽ, reason: contains not printable characters */
    static b f3786 = new b();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<Class<?>, a> f3787 = new HashMap();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Map<Class<?>, Boolean> f3788 = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Map<l.a, List<C0049b>> f3789 = new HashMap();

        /* renamed from: ʼ, reason: contains not printable characters */
        final Map<C0049b, l.a> f3790;

        a(Map<C0049b, l.a> map) {
            this.f3790 = map;
            for (Map.Entry<C0049b, l.a> entry : map.entrySet()) {
                l.a value = entry.getValue();
                List<C0049b> list = this.f3789.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3789.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private static void m4398(List<C0049b> list, p pVar, l.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m4400(pVar, aVar, obj);
                }
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4399(p pVar, l.a aVar, Object obj) {
            m4398(this.f3789.get(aVar), pVar, aVar, obj);
            m4398(this.f3789.get(l.a.ON_ANY), pVar, aVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0049b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final int f3791;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Method f3792;

        C0049b(int i5, Method method) {
            this.f3791 = i5;
            this.f3792 = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0049b)) {
                return false;
            }
            C0049b c0049b = (C0049b) obj;
            return this.f3791 == c0049b.f3791 && this.f3792.getName().equals(c0049b.f3792.getName());
        }

        public int hashCode() {
            return (this.f3791 * 31) + this.f3792.getName().hashCode();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4400(p pVar, l.a aVar, Object obj) {
            try {
                int i5 = this.f3791;
                if (i5 == 0) {
                    this.f3792.invoke(obj, new Object[0]);
                } else if (i5 == 1) {
                    this.f3792.invoke(obj, pVar);
                } else {
                    if (i5 != 2) {
                        return;
                    }
                    this.f3792.invoke(obj, pVar, aVar);
                }
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Failed to call observer method", e6.getCause());
            }
        }
    }

    b() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private a m4393(Class<?> cls, Method[] methodArr) {
        int i5;
        a m4396;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m4396 = m4396(superclass)) != null) {
            hashMap.putAll(m4396.f3790);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0049b, l.a> entry : m4396(cls2).f3790.entrySet()) {
                m4395(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4394(cls);
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            x xVar = (x) method.getAnnotation(x.class);
            if (xVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i5 = 0;
                } else {
                    if (!p.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i5 = 1;
                }
                l.a value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!l.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != l.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i5 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m4395(hashMap, new C0049b(i5, method), value, cls);
                z5 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f3787.put(cls, aVar);
        this.f3788.put(cls, Boolean.valueOf(z5));
        return aVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private Method[] m4394(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e5) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m4395(Map<C0049b, l.a> map, C0049b c0049b, l.a aVar, Class<?> cls) {
        l.a aVar2 = map.get(c0049b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0049b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0049b.f3792.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    a m4396(Class<?> cls) {
        a aVar = this.f3787.get(cls);
        return aVar != null ? aVar : m4393(cls, null);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m4397(Class<?> cls) {
        Boolean bool = this.f3788.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m4394 = m4394(cls);
        for (Method method : m4394) {
            if (((x) method.getAnnotation(x.class)) != null) {
                m4393(cls, m4394);
                return true;
            }
        }
        this.f3788.put(cls, Boolean.FALSE);
        return false;
    }
}
