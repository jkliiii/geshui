package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Field f404;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f405;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Class<?> f406;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static boolean f407;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static Field f408;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static boolean f409;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static Field f410;

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean f411;

    /* compiled from: ResourcesFlusher.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m507(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m502(Resources resources) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            return;
        }
        if (i5 >= 24) {
            m505(resources);
        } else if (i5 >= 23) {
            m504(resources);
        } else if (i5 >= 21) {
            m503(resources);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m503(Resources resources) {
        Map map;
        if (!f405) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f404 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e5);
            }
            f405 = true;
        }
        Field field = f404;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e6);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m504(Resources resources) {
        Object obj;
        if (!f405) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f404 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e5);
            }
            f405 = true;
        }
        Field field = f404;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e6);
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        m506(obj);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m505(Resources resources) {
        Object obj;
        if (!f411) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f410 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e5);
            }
            f411 = true;
        }
        Field field = f410;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e6) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e6);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f405) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f404 = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e7);
            }
            f405 = true;
        }
        Field field2 = f404;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e8);
            }
        }
        if (obj2 != null) {
            m506(obj2);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static void m506(Object obj) {
        LongSparseArray longSparseArray;
        if (!f407) {
            try {
                f406 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e5) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
            }
            f407 = true;
        }
        Class<?> cls = f406;
        if (cls == null) {
            return;
        }
        if (!f409) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f408 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
            }
            f409 = true;
        }
        Field field = f408;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e7) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.m507(longSparseArray);
        }
    }
}
