package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.f;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x0 extends r0 {

    /* renamed from: ˈ, reason: contains not printable characters */
    protected final Class<?> f2722;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected final Constructor<?> f2723;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final Method f2724;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final Method f2725;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final Method f2726;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final Method f2727;

    /* renamed from: ˑ, reason: contains not printable characters */
    protected final Method f2728;

    public x0() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = m2398();
            constructor = m2392(cls);
            method = m2395(cls);
            method2 = m2396(cls);
            method3 = m2393(cls);
            method4 = m2394(cls);
            method5 = mo2397(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e5.getClass().getName(), e5);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2722 = cls;
        this.f2723 = constructor;
        this.f2724 = method;
        this.f2725 = method2;
        this.f2726 = method3;
        this.f2727 = method4;
        this.f2728 = method5;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private Object m2385() {
        try {
            return this.f2723.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m2386(Object obj) {
        try {
            this.f2727.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean m2387(Context context, Object obj, String str, int i5, int i6, int i7, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2724.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean m2388(Object obj, ByteBuffer byteBuffer, int i5, int i6, int i7) {
        try {
            return ((Boolean) this.f2725.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i6), Integer.valueOf(i7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean m2389(Object obj) {
        try {
            return ((Boolean) this.f2726.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean m2390() {
        if (this.f2724 == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2724 != null;
    }

    @Override // androidx.core.graphics.r0, androidx.core.graphics.o1
    /* renamed from: ʼ */
    public Typeface mo2333(Context context, f.c cVar, Resources resources, int i5) {
        if (!m2390()) {
            return super.mo2333(context, cVar, resources, i5);
        }
        Object m2385 = m2385();
        if (m2385 == null) {
            return null;
        }
        for (f.d dVar : cVar.m2088()) {
            if (!m2387(context, m2385, dVar.m2089(), dVar.m2091(), dVar.m2093(), dVar.m2094() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m2092()))) {
                m2386(m2385);
                return null;
            }
        }
        if (m2389(m2385)) {
            return mo2391(m2385);
        }
        return null;
    }

    @Override // androidx.core.graphics.r0, androidx.core.graphics.o1
    /* renamed from: ʽ */
    public Typeface mo2334(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i5) {
        Typeface mo2391;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m2390()) {
            g.b mo2337 = mo2337(bVarArr, i5);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo2337.m2486(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo2337.m2487()).setItalic(mo2337.m2488()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m2361 = p1.m2361(context, bVarArr, cancellationSignal);
        Object m2385 = m2385();
        if (m2385 == null) {
            return null;
        }
        boolean z5 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = m2361.get(bVar.m2486());
            if (byteBuffer != null) {
                if (!m2388(m2385, byteBuffer, bVar.m2485(), bVar.m2487(), bVar.m2488() ? 1 : 0)) {
                    m2386(m2385);
                    return null;
                }
                z5 = true;
            }
        }
        if (!z5) {
            m2386(m2385);
            return null;
        }
        if (m2389(m2385) && (mo2391 = mo2391(m2385)) != null) {
            return Typeface.create(mo2391, i5);
        }
        return null;
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʿ */
    public Typeface mo2336(Context context, Resources resources, int i5, String str, int i6) {
        if (!m2390()) {
            return super.mo2336(context, resources, i5, str, i6);
        }
        Object m2385 = m2385();
        if (m2385 == null) {
            return null;
        }
        if (!m2387(context, m2385, str, 0, -1, -1, null)) {
            m2386(m2385);
            return null;
        }
        if (m2389(m2385)) {
            return mo2391(m2385);
        }
        return null;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    protected Typeface mo2391(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2722, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2728.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected Constructor<?> m2392(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    protected Method m2393(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    protected Method m2394(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    protected Method m2395(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    protected Method m2396(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    protected Method mo2397(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    protected Class<?> m2398() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }
}
