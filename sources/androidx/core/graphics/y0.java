package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class y0 extends x0 {
    @Override // androidx.core.graphics.x0
    /* renamed from: ˑ */
    protected Typeface mo2391(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2722, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2728.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // androidx.core.graphics.x0
    /* renamed from: ﾞ */
    protected Method mo2397(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
