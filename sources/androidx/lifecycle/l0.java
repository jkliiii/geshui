package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class l0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final List<Class<?>> f3839 = w3.n.m12564(Application.class, e0.class);

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final List<Class<?>> f3840 = w3.m.m12560(e0.class);

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final <T> Constructor<T> m4458(Class<T> cls, List<? extends Class<?>> list) {
        f4.k.m8623(cls, "modelClass");
        f4.k.m8623(list, "signature");
        Object[] constructors = cls.getConstructors();
        f4.k.m8622(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            f4.k.m8622(parameterTypes, "constructor.parameterTypes");
            List m12548 = w3.j.m12548(parameterTypes);
            if (f4.k.m8619(list, m12548)) {
                f4.k.m8621(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == m12548.size() && m12548.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final <T extends n0> T m4459(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        f4.k.m8623(cls, "modelClass");
        f4.k.m8623(constructor, "constructor");
        f4.k.m8623(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e7.getCause());
        }
    }
}
