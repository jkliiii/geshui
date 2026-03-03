package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.f;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class r0 extends o1 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Class<?> f2713 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Constructor<?> f2714 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Method f2715 = null;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static Method f2716 = null;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static boolean f2717 = false;

    r0() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static boolean m2366(Object obj, String str, int i5, boolean z5) {
        m2369();
        try {
            return ((Boolean) f2715.invoke(obj, str, Integer.valueOf(i5), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static Typeface m2367(Object obj) {
        m2369();
        try {
            Object newInstance = Array.newInstance(f2713, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2716.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private File m2368(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static void m2369() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f2717) {
            return;
        }
        f2717 = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi21Impl", e5.getClass().getName(), e5);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2714 = constructor;
        f2713 = cls;
        f2715 = method2;
        f2716 = method;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static Object m2370() {
        m2369();
        try {
            return f2714.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʼ */
    public Typeface mo2333(Context context, f.c cVar, Resources resources, int i5) {
        Object m2370 = m2370();
        for (f.d dVar : cVar.m2088()) {
            File m2358 = p1.m2358(context);
            if (m2358 == null) {
                return null;
            }
            try {
                if (!p1.m2356(m2358, resources, dVar.m2090())) {
                    return null;
                }
                if (!m2366(m2370, m2358.getPath(), dVar.m2093(), dVar.m2094())) {
                    return null;
                }
                m2358.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m2358.delete();
            }
        }
        return m2367(m2370);
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʽ */
    public Typeface mo2334(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i5) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m2368 = m2368(openFileDescriptor);
                if (m2368 != null && m2368.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m2368);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface mo2335 = super.mo2335(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo2335;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
