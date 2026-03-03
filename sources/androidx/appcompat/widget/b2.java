package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DrawableUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b2 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final int[] f1162 = {R.attr.state_checked};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final int[] f1163 = new int[0];

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final Rect f1164 = new Rect();

    /* compiled from: DrawableUtils.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final boolean f1165;

        /* renamed from: ʼ, reason: contains not printable characters */
        private static final Method f1166;

        /* renamed from: ʽ, reason: contains not printable characters */
        private static final Field f1167;

        /* renamed from: ʾ, reason: contains not printable characters */
        private static final Field f1168;

        /* renamed from: ʿ, reason: contains not printable characters */
        private static final Field f1169;

        /* renamed from: ˆ, reason: contains not printable characters */
        private static final Field f1170;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3e java.lang.NoSuchMethodException -> L41
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.ClassNotFoundException -> L35 java.lang.NoSuchMethodException -> L38
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2d
                r8 = 1
                goto L55
            L2d:
                goto L53
            L2f:
                r7 = r1
                goto L53
            L32:
                r6 = r1
                goto L52
            L35:
                r6 = r1
                goto L52
            L38:
                r6 = r1
                goto L52
            L3b:
                r5 = r1
                goto L47
            L3e:
                r5 = r1
                goto L4c
            L41:
                r5 = r1
                goto L51
            L44:
                r4 = r1
                r5 = r4
            L47:
                r6 = r5
                goto L52
            L49:
                r4 = r1
                r5 = r4
            L4c:
                r6 = r5
                goto L52
            L4e:
                r4 = r1
                r5 = r4
            L51:
                r6 = r5
            L52:
                r7 = r6
            L53:
                r3 = r1
                r8 = 0
            L55:
                if (r8 == 0) goto L64
                androidx.appcompat.widget.b2.a.f1166 = r4
                androidx.appcompat.widget.b2.a.f1167 = r5
                androidx.appcompat.widget.b2.a.f1168 = r6
                androidx.appcompat.widget.b2.a.f1169 = r7
                androidx.appcompat.widget.b2.a.f1170 = r3
                androidx.appcompat.widget.b2.a.f1165 = r0
                goto L70
            L64:
                androidx.appcompat.widget.b2.a.f1166 = r1
                androidx.appcompat.widget.b2.a.f1167 = r1
                androidx.appcompat.widget.b2.a.f1168 = r1
                androidx.appcompat.widget.b2.a.f1169 = r1
                androidx.appcompat.widget.b2.a.f1170 = r1
                androidx.appcompat.widget.b2.a.f1165 = r2
            L70:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b2.a.<clinit>():void");
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static Rect m1147(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1165) {
                try {
                    Object invoke = f1166.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f1167.getInt(invoke), f1168.getInt(invoke), f1169.getInt(invoke), f1170.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return b2.f1164;
        }
    }

    /* compiled from: DrawableUtils.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Insets m1148(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m1142(Drawable drawable) {
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m1143(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            m1144(drawable);
        } else {
            if (i5 < 29 || i5 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                return;
            }
            m1144(drawable);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m1144(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1162);
        } else {
            drawable.setState(f1163);
        }
        drawable.setState(state);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static Rect m1145(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.m1147(androidx.core.graphics.drawable.a.m2212(drawable));
        }
        Insets m1148 = b.m1148(drawable);
        return new Rect(m1148.left, m1148.top, m1148.right, m1148.bottom);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static PorterDuff.Mode m1146(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
