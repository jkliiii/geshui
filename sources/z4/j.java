package z4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: OptionalMethod.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class j<T> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Class<?> f12828;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f12829;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Class[] f12830;

    j(Class<?> cls, String str, Class... clsArr) {
        this.f12828 = cls;
        this.f12829 = str;
        this.f12830 = clsArr;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Method m13227(Class<?> cls) {
        Class<?> cls2;
        String str = this.f12829;
        if (str == null) {
            return null;
        }
        Method m13228 = m13228(cls, str, this.f12830);
        if (m13228 == null || (cls2 = this.f12828) == null || cls2.isAssignableFrom(m13228.getReturnType())) {
            return m13228;
        }
        return null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Method m13228(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public Object m13229(T t5, Object... objArr) throws InvocationTargetException {
        Method m13227 = m13227(t5.getClass());
        if (m13227 == null) {
            throw new AssertionError("Method " + this.f12829 + " not supported for object " + t5);
        }
        try {
            return m13227.invoke(t5, objArr);
        } catch (IllegalAccessException e5) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m13227);
            assertionError.initCause(e5);
            throw assertionError;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public Object m13230(T t5, Object... objArr) throws InvocationTargetException {
        Method m13227 = m13227(t5.getClass());
        if (m13227 == null) {
            return null;
        }
        try {
            return m13227.invoke(t5, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Object m13231(T t5, Object... objArr) {
        try {
            return m13230(t5, objArr);
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public Object m13232(T t5, Object... objArr) {
        try {
            return m13229(t5, objArr);
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m13233(T t5) {
        return m13227(t5.getClass()) != null;
    }
}
