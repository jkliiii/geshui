package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.f;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class s0 extends o1 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Class<?> f2718;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Constructor<?> f2719;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final Method f2720;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Method f2721;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi24Impl", e5.getClass().getName(), e5);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2719 = constructor;
        f2718 = cls;
        f2720 = method2;
        f2721 = method;
    }

    s0() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static boolean m2372(Object obj, ByteBuffer byteBuffer, int i5, int i6, boolean z5) {
        try {
            return ((Boolean) f2720.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i6), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static Typeface m2373(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2718, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2721.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public static boolean m2374() {
        Method method = f2720;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static Object m2375() {
        try {
            return f2719.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʼ */
    public Typeface mo2333(Context context, f.c cVar, Resources resources, int i5) {
        Object m2375 = m2375();
        if (m2375 == null) {
            return null;
        }
        for (f.d dVar : cVar.m2088()) {
            ByteBuffer m2355 = p1.m2355(context, resources, dVar.m2090());
            if (m2355 == null || !m2372(m2375, m2355, dVar.m2091(), dVar.m2093(), dVar.m2094())) {
                return null;
            }
        }
        return m2373(m2375);
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʽ */
    public Typeface mo2334(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i5) {
        Object m2375 = m2375();
        if (m2375 == null) {
            return null;
        }
        m.g gVar = new m.g();
        for (g.b bVar : bVarArr) {
            Uri m2486 = bVar.m2486();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(m2486);
            if (byteBuffer == null) {
                byteBuffer = p1.m2359(context, cancellationSignal, m2486);
                gVar.put(m2486, byteBuffer);
            }
            if (byteBuffer == null || !m2372(m2375, byteBuffer, bVar.m2485(), bVar.m2487(), bVar.m2488())) {
                return null;
            }
        }
        Typeface m2373 = m2373(m2375);
        if (m2373 == null) {
            return null;
        }
        return Typeface.create(m2373, i5);
    }
}
