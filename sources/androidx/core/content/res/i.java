package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f2612 = new ThreadLocal<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final WeakHashMap<e, SparseArray<d>> f2613 = new WeakHashMap<>(0);

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Object f2614 = new Object();

    /* compiled from: ResourcesCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Drawable m2120(Resources resources, int i5, int i6) {
            return resources.getDrawableForDensity(i5, i6);
        }
    }

    /* compiled from: ResourcesCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Drawable m2121(Resources resources, int i5, Resources.Theme theme) {
            return resources.getDrawable(i5, theme);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static Drawable m2122(Resources resources, int i5, int i6, Resources.Theme theme) {
            return resources.getDrawableForDensity(i5, i6, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2123(Resources resources, int i5, Resources.Theme theme) {
            return resources.getColor(i5, theme);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static ColorStateList m2124(Resources resources, int i5, Resources.Theme theme) {
            return resources.getColorStateList(i5, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    private static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final ColorStateList f2615;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Configuration f2616;

        /* renamed from: ʽ, reason: contains not printable characters */
        final int f2617;

        d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f2615 = colorStateList;
            this.f2616 = configuration;
            this.f2617 = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    private static final class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Resources f2618;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Resources.Theme f2619;

        e(Resources resources, Resources.Theme theme) {
            this.f2618 = resources;
            this.f2619 = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f2618.equals(eVar.f2618) && androidx.core.util.c.m2568(this.f2619, eVar.f2619);
        }

        public int hashCode() {
            return androidx.core.util.c.m2569(this.f2618, this.f2619);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static abstract class f {
        /* renamed from: ʿ, reason: contains not printable characters */
        public static Handler m2127(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final void m2130(final int i5, Handler handler) {
            m2127(handler).post(new Runnable() { // from class: androidx.core.content.res.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2625.m2128(i5);
                }
            });
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public final void m2131(final Typeface typeface, Handler handler) {
            m2127(handler).post(new Runnable() { // from class: androidx.core.content.res.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2623.m2129(typeface);
                }
            });
        }

        /* renamed from: ˉ, reason: merged with bridge method [inline-methods] */
        public abstract void m2128(int i5);

        /* renamed from: ˊ, reason: merged with bridge method [inline-methods] */
        public abstract void m2129(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    public static final class g {

        /* compiled from: ResourcesCompat.java */
        static class a {

            /* renamed from: ʻ, reason: contains not printable characters */
            private static final Object f2620 = new Object();

            /* renamed from: ʼ, reason: contains not printable characters */
            private static Method f2621;

            /* renamed from: ʽ, reason: contains not printable characters */
            private static boolean f2622;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /* renamed from: ʻ, reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            static void m2133(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = androidx.core.content.res.i.g.a.f2620
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.i.g.a.f2622     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.res.i.g.a.f2621 = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.res.i.g.a.f2622 = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.res.i.g.a.f2621     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.res.i.g.a.f2621 = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.i.g.a.m2133(android.content.res.Resources$Theme):void");
            }
        }

        /* compiled from: ResourcesCompat.java */
        static class b {
            /* renamed from: ʻ, reason: contains not printable characters */
            static void m2134(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static void m2132(Resources.Theme theme) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 29) {
                b.m2134(theme);
            } else if (i5 >= 23) {
                a.m2133(theme);
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m2106(e eVar, int i5, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2614) {
            WeakHashMap<e, SparseArray<d>> weakHashMap = f2613;
            SparseArray<d> sparseArray = weakHashMap.get(eVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(eVar, sparseArray);
            }
            sparseArray.append(i5, new d(colorStateList, eVar.f2618.getConfiguration(), theme));
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static ColorStateList m2107(e eVar, int i5) {
        d dVar;
        Resources.Theme theme;
        synchronized (f2614) {
            SparseArray<d> sparseArray = f2613.get(eVar);
            if (sparseArray != null && sparseArray.size() > 0 && (dVar = sparseArray.get(i5)) != null) {
                if (dVar.f2616.equals(eVar.f2618.getConfiguration()) && (((theme = eVar.f2619) == null && dVar.f2617 == 0) || (theme != null && dVar.f2617 == theme.hashCode()))) {
                    return dVar.f2615;
                }
                sparseArray.remove(i5);
            }
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Typeface m2108(Context context, int i5) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2118(context, i5, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static ColorStateList m2109(Resources resources, int i5, Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList m2107 = m2107(eVar, i5);
        if (m2107 != null) {
            return m2107;
        }
        ColorStateList m2116 = m2116(resources, i5, theme);
        if (m2116 == null) {
            return Build.VERSION.SDK_INT >= 23 ? c.m2124(resources, i5, theme) : resources.getColorStateList(i5);
        }
        m2106(eVar, i5, m2116, theme);
        return m2116;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Drawable m2110(Resources resources, int i5, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? b.m2121(resources, i5, theme) : resources.getDrawable(i5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static Drawable m2111(Resources resources, int i5, int i6, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? b.m2122(resources, i5, i6, theme) : a.m2120(resources, i5, i6);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static Typeface m2112(Context context, int i5) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2118(context, i5, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static Typeface m2113(Context context, int i5, TypedValue typedValue, int i6, f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2118(context, i5, typedValue, i6, fVar, null, true, false);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m2114(Context context, int i5, f fVar, Handler handler) throws Resources.NotFoundException {
        androidx.core.util.h.m2583(fVar);
        if (context.isRestricted()) {
            fVar.m2130(-4, handler);
        } else {
            m2118(context, i5, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static TypedValue m2115() {
        ThreadLocal<TypedValue> threadLocal = f2612;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static ColorStateList m2116(Resources resources, int i5, Resources.Theme theme) {
        if (m2117(resources, i5)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.m2058(resources, resources.getXml(i5), theme);
        } catch (Exception e5) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e5);
            return null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static boolean m2117(Resources resources, int i5) {
        TypedValue m2115 = m2115();
        resources.getValue(i5, m2115, true);
        int i6 = m2115.type;
        return i6 >= 28 && i6 <= 31;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static Typeface m2118(Context context, int i5, TypedValue typedValue, int i6, f fVar, Handler handler, boolean z5, boolean z6) {
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        Typeface m2119 = m2119(context, resources, typedValue, i5, i6, fVar, handler, z5, z6);
        if (m2119 != null || fVar != null || z6) {
            return m2119;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i5) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* renamed from: י, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m2119(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.i.f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lbb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.m2130(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.m0.m2323(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.m2131(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            androidx.core.content.res.f$b r2 = androidx.core.content.res.f.m2080(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L58
            r11.m2130(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.m0.m2320(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.m0.m2321(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.m2131(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            goto L89
        L86:
            r11.m2130(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb5
        La0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb5:
            if (r11 == 0) goto Lba
            r11.m2130(r15, r12)
        Lba:
            return r16
        Lbb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.i.m2119(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.i$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
