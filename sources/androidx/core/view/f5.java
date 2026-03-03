package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f5 {

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final f5 f2962;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final l f2963;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static Field f2964;

        /* renamed from: ʼ, reason: contains not printable characters */
        private static Field f2965;

        /* renamed from: ʽ, reason: contains not printable characters */
        private static Field f2966;

        /* renamed from: ʾ, reason: contains not printable characters */
        private static boolean f2967;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2964 = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2965 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2966 = declaredField3;
                declaredField3.setAccessible(true);
                f2967 = true;
            } catch (ReflectiveOperationException e5) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e5.getMessage(), e5);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static f5 m3088(View view) {
            if (f2967 && view.isAttachedToWindow()) {
                try {
                    Object obj = f2964.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2965.get(obj);
                        Rect rect2 = (Rect) f2966.get(obj);
                        if (rect != null && rect2 != null) {
                            f5 m3089 = new b().m3091(androidx.core.graphics.i0.m2287(rect)).m3092(androidx.core.graphics.i0.m2287(rect2)).m3089();
                            m3089.m3085(m3089);
                            m3089.m3068(view.getRootView());
                            return m3089;
                        }
                    }
                } catch (IllegalAccessException e5) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e5.getMessage(), e5);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ʽ, reason: contains not printable characters */
        void mo3100(int i5, androidx.core.graphics.i0 i0Var) {
            this.f2975.setInsets(n.m3134(i5), i0Var.m2289());
        }

        e(f5 f5Var) {
            super(f5Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final f5 f2976;

        /* renamed from: ʼ, reason: contains not printable characters */
        androidx.core.graphics.i0[] f2977;

        f() {
            this(new f5((f5) null));
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        protected final void m3101() {
            androidx.core.graphics.i0[] i0VarArr = this.f2977;
            if (i0VarArr != null) {
                androidx.core.graphics.i0 i0Var = i0VarArr[m.m3129(1)];
                androidx.core.graphics.i0 i0Var2 = this.f2977[m.m3129(2)];
                if (i0Var2 == null) {
                    i0Var2 = this.f2976.m3070(2);
                }
                if (i0Var == null) {
                    i0Var = this.f2976.m3070(1);
                }
                mo3096(androidx.core.graphics.i0.m2285(i0Var, i0Var2));
                androidx.core.graphics.i0 i0Var3 = this.f2977[m.m3129(16)];
                if (i0Var3 != null) {
                    mo3098(i0Var3);
                }
                androidx.core.graphics.i0 i0Var4 = this.f2977[m.m3129(32)];
                if (i0Var4 != null) {
                    mo3097(i0Var4);
                }
                androidx.core.graphics.i0 i0Var5 = this.f2977[m.m3129(64)];
                if (i0Var5 != null) {
                    mo3099(i0Var5);
                }
            }
        }

        /* renamed from: ʼ */
        f5 mo3094() {
            m3101();
            return this.f2976;
        }

        /* renamed from: ʽ */
        void mo3100(int i5, androidx.core.graphics.i0 i0Var) {
            if (this.f2977 == null) {
                this.f2977 = new androidx.core.graphics.i0[9];
            }
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    this.f2977[m.m3129(i6)] = i0Var;
                }
            }
        }

        f(f5 f5Var) {
            this.f2976 = f5Var;
        }

        /* renamed from: ʾ */
        void mo3097(androidx.core.graphics.i0 i0Var) {
        }

        /* renamed from: ʿ */
        void mo3095(androidx.core.graphics.i0 i0Var) {
        }

        /* renamed from: ˆ */
        void mo3098(androidx.core.graphics.i0 i0Var) {
        }

        /* renamed from: ˈ */
        void mo3096(androidx.core.graphics.i0 i0Var) {
        }

        /* renamed from: ˉ */
        void mo3099(androidx.core.graphics.i0 i0Var) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class i extends h {
        i(f5 f5Var, WindowInsets windowInsets) {
            super(f5Var, windowInsets);
        }

        @Override // androidx.core.view.f5.g, androidx.core.view.f5.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2983, iVar.f2983) && Objects.equals(this.f2987, iVar.f2987);
        }

        @Override // androidx.core.view.f5.l
        public int hashCode() {
            return this.f2983.hashCode();
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ʻ, reason: contains not printable characters */
        f5 mo3123() {
            return f5.m3063(this.f2983.consumeDisplayCutout());
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˆ, reason: contains not printable characters */
        q mo3124() {
            return q.m3267(this.f2983.getDisplayCutout());
        }

        i(f5 f5Var, i iVar) {
            super(f5Var, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class k extends j {

        /* renamed from: ᐧ, reason: contains not printable characters */
        static final f5 f2992 = f5.m3063(WindowInsets.CONSUMED);

        k(f5 f5Var, WindowInsets windowInsets) {
            super(f5Var, windowInsets);
        }

        @Override // androidx.core.view.f5.g, androidx.core.view.f5.l
        /* renamed from: ˈ */
        public androidx.core.graphics.i0 mo3108(int i5) {
            return androidx.core.graphics.i0.m2288(this.f2983.getInsets(n.m3134(i5)));
        }

        @Override // androidx.core.view.f5.g, androidx.core.view.f5.l
        /* renamed from: ٴ */
        public boolean mo3112(int i5) {
            return this.f2983.isVisible(n.m3134(i5));
        }

        k(f5 f5Var, k kVar) {
            super(f5Var, kVar);
        }

        @Override // androidx.core.view.f5.g, androidx.core.view.f5.l
        /* renamed from: ʾ */
        final void mo3106(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class m {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static int m3128() {
            return 8;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3129(int i5) {
            if (i5 == 1) {
                return 0;
            }
            if (i5 == 2) {
                return 1;
            }
            if (i5 == 4) {
                return 2;
            }
            if (i5 == 8) {
                return 3;
            }
            if (i5 == 16) {
                return 4;
            }
            if (i5 == 32) {
                return 5;
            }
            if (i5 == 64) {
                return 6;
            }
            if (i5 == 128) {
                return 7;
            }
            if (i5 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static int m3130() {
            return 32;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public static int m3131() {
            return 2;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static int m3132() {
            return 1;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static int m3133() {
            return 7;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static final class n {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m3134(int i5) {
            int statusBars;
            int i6 = 0;
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i5 & i7) != 0) {
                    if (i7 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i7 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i7 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i7 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i7 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i7 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i7 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i7 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i6 |= statusBars;
                }
            }
            return i6;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2962 = k.f2992;
        } else {
            f2962 = l.f2993;
        }
    }

    private f5(WindowInsets windowInsets) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            this.f2963 = new k(this, windowInsets);
            return;
        }
        if (i5 >= 29) {
            this.f2963 = new j(this, windowInsets);
            return;
        }
        if (i5 >= 28) {
            this.f2963 = new i(this, windowInsets);
            return;
        }
        if (i5 >= 21) {
            this.f2963 = new h(this, windowInsets);
        } else if (i5 >= 20) {
            this.f2963 = new g(this, windowInsets);
        } else {
            this.f2963 = new l(this);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    static androidx.core.graphics.i0 m3062(androidx.core.graphics.i0 i0Var, int i5, int i6, int i7, int i8) {
        int max = Math.max(0, i0Var.f2698 - i5);
        int max2 = Math.max(0, i0Var.f2699 - i6);
        int max3 = Math.max(0, i0Var.f2700 - i7);
        int max4 = Math.max(0, i0Var.f2701 - i8);
        return (max == i5 && max2 == i6 && max3 == i7 && max4 == i8) ? i0Var : androidx.core.graphics.i0.m2286(max, max2, max3, max4);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static f5 m3063(WindowInsets windowInsets) {
        return m3064(windowInsets, null);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static f5 m3064(WindowInsets windowInsets, View view) {
        f5 f5Var = new f5((WindowInsets) androidx.core.util.h.m2583(windowInsets));
        if (view != null && f1.m2903(view)) {
            f5Var.m3085(f1.m2875(view));
            f5Var.m3068(view.getRootView());
        }
        return f5Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f5) {
            return androidx.core.util.c.m2568(this.f2963, ((f5) obj).f2963);
        }
        return false;
    }

    public int hashCode() {
        l lVar = this.f2963;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: ʻ, reason: contains not printable characters */
    public f5 m3065() {
        return this.f2963.mo3123();
    }

    @Deprecated
    /* renamed from: ʼ, reason: contains not printable characters */
    public f5 m3066() {
        return this.f2963.mo3118();
    }

    @Deprecated
    /* renamed from: ʽ, reason: contains not printable characters */
    public f5 m3067() {
        return this.f2963.mo3119();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m3068(View view) {
        this.f2963.mo3106(view);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public q m3069() {
        return this.f2963.mo3124();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public androidx.core.graphics.i0 m3070(int i5) {
        return this.f2963.mo3108(i5);
    }

    @Deprecated
    /* renamed from: ˈ, reason: contains not printable characters */
    public androidx.core.graphics.i0 m3071() {
        return this.f2963.mo3120();
    }

    @Deprecated
    /* renamed from: ˉ, reason: contains not printable characters */
    public androidx.core.graphics.i0 m3072() {
        return this.f2963.mo3126();
    }

    @Deprecated
    /* renamed from: ˊ, reason: contains not printable characters */
    public int m3073() {
        return this.f2963.mo3109().f2701;
    }

    @Deprecated
    /* renamed from: ˋ, reason: contains not printable characters */
    public int m3074() {
        return this.f2963.mo3109().f2698;
    }

    @Deprecated
    /* renamed from: ˎ, reason: contains not printable characters */
    public int m3075() {
        return this.f2963.mo3109().f2700;
    }

    @Deprecated
    /* renamed from: ˏ, reason: contains not printable characters */
    public int m3076() {
        return this.f2963.mo3109().f2699;
    }

    @Deprecated
    /* renamed from: ˑ, reason: contains not printable characters */
    public androidx.core.graphics.i0 m3077() {
        return this.f2963.mo3109();
    }

    @Deprecated
    /* renamed from: י, reason: contains not printable characters */
    public boolean m3078() {
        return !this.f2963.mo3109().equals(androidx.core.graphics.i0.f2697);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public f5 m3079(int i5, int i6, int i7, int i8) {
        return this.f2963.mo3110(i5, i6, i7, i8);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m3080() {
        return this.f2963.mo3121();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public boolean m3081(int i5) {
        return this.f2963.mo3112(i5);
    }

    @Deprecated
    /* renamed from: ᵎ, reason: contains not printable characters */
    public f5 m3082(int i5, int i6, int i7, int i8) {
        return new b(this).m3092(androidx.core.graphics.i0.m2286(i5, i6, i7, i8)).m3089();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m3083(androidx.core.graphics.i0[] i0VarArr) {
        this.f2963.mo3113(i0VarArr);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m3084(androidx.core.graphics.i0 i0Var) {
        this.f2963.mo3114(i0Var);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m3085(f5 f5Var) {
        this.f2963.mo3115(f5Var);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    void m3086(androidx.core.graphics.i0 i0Var) {
        this.f2963.mo3122(i0Var);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public WindowInsets m3087() {
        l lVar = this.f2963;
        if (lVar instanceof g) {
            return ((g) lVar).f2983;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class c extends f {

        /* renamed from: ʿ, reason: contains not printable characters */
        private static Field f2969 = null;

        /* renamed from: ˆ, reason: contains not printable characters */
        private static boolean f2970 = false;

        /* renamed from: ˈ, reason: contains not printable characters */
        private static Constructor<WindowInsets> f2971 = null;

        /* renamed from: ˉ, reason: contains not printable characters */
        private static boolean f2972 = false;

        /* renamed from: ʽ, reason: contains not printable characters */
        private WindowInsets f2973;

        /* renamed from: ʾ, reason: contains not printable characters */
        private androidx.core.graphics.i0 f2974;

        c() {
            this.f2973 = m3093();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private static WindowInsets m3093() {
            if (!f2970) {
                try {
                    f2969 = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
                }
                f2970 = true;
            }
            Field field = f2969;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e6);
                }
            }
            if (!f2972) {
                try {
                    f2971 = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e7);
                }
                f2972 = true;
            }
            Constructor<WindowInsets> constructor = f2971;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e8);
                }
            }
            return null;
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ʼ, reason: contains not printable characters */
        f5 mo3094() {
            m3101();
            f5 m3063 = f5.m3063(this.f2973);
            m3063.m3083(this.f2977);
            m3063.m3086(this.f2974);
            return m3063;
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ʿ, reason: contains not printable characters */
        void mo3095(androidx.core.graphics.i0 i0Var) {
            this.f2974 = i0Var;
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ˈ, reason: contains not printable characters */
        void mo3096(androidx.core.graphics.i0 i0Var) {
            WindowInsets windowInsets = this.f2973;
            if (windowInsets != null) {
                this.f2973 = windowInsets.replaceSystemWindowInsets(i0Var.f2698, i0Var.f2699, i0Var.f2700, i0Var.f2701);
            }
        }

        c(f5 f5Var) {
            super(f5Var);
            this.f2973 = f5Var.m3087();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class d extends f {

        /* renamed from: ʽ, reason: contains not printable characters */
        final WindowInsets.Builder f2975;

        d() {
            this.f2975 = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ʼ */
        f5 mo3094() {
            m3101();
            f5 m3063 = f5.m3063(this.f2975.build());
            m3063.m3083(this.f2977);
            return m3063;
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ʾ, reason: contains not printable characters */
        void mo3097(androidx.core.graphics.i0 i0Var) {
            this.f2975.setMandatorySystemGestureInsets(i0Var.m2289());
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ʿ */
        void mo3095(androidx.core.graphics.i0 i0Var) {
            this.f2975.setStableInsets(i0Var.m2289());
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ˆ, reason: contains not printable characters */
        void mo3098(androidx.core.graphics.i0 i0Var) {
            this.f2975.setSystemGestureInsets(i0Var.m2289());
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ˈ */
        void mo3096(androidx.core.graphics.i0 i0Var) {
            this.f2975.setSystemWindowInsets(i0Var.m2289());
        }

        @Override // androidx.core.view.f5.f
        /* renamed from: ˉ, reason: contains not printable characters */
        void mo3099(androidx.core.graphics.i0 i0Var) {
            this.f2975.setTappableElementInsets(i0Var.m2289());
        }

        d(f5 f5Var) {
            WindowInsets.Builder builder;
            super(f5Var);
            WindowInsets m3087 = f5Var.m3087();
            if (m3087 != null) {
                builder = new WindowInsets.Builder(m3087);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2975 = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class h extends g {

        /* renamed from: ˑ, reason: contains not printable characters */
        private androidx.core.graphics.i0 f2988;

        h(f5 f5Var, WindowInsets windowInsets) {
            super(f5Var, windowInsets);
            this.f2988 = null;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ʼ, reason: contains not printable characters */
        f5 mo3118() {
            return f5.m3063(this.f2983.consumeStableInsets());
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ʽ, reason: contains not printable characters */
        f5 mo3119() {
            return f5.m3063(this.f2983.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˊ, reason: contains not printable characters */
        final androidx.core.graphics.i0 mo3120() {
            if (this.f2988 == null) {
                this.f2988 = androidx.core.graphics.i0.m2286(this.f2983.getStableInsetLeft(), this.f2983.getStableInsetTop(), this.f2983.getStableInsetRight(), this.f2983.getStableInsetBottom());
            }
            return this.f2988;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: י, reason: contains not printable characters */
        boolean mo3121() {
            return this.f2983.isConsumed();
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ᵔ, reason: contains not printable characters */
        public void mo3122(androidx.core.graphics.i0 i0Var) {
            this.f2988 = i0Var;
        }

        h(f5 f5Var, h hVar) {
            super(f5Var, hVar);
            this.f2988 = null;
            this.f2988 = hVar.f2988;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class g extends l {

        /* renamed from: ˉ, reason: contains not printable characters */
        private static boolean f2978 = false;

        /* renamed from: ˊ, reason: contains not printable characters */
        private static Method f2979;

        /* renamed from: ˋ, reason: contains not printable characters */
        private static Class<?> f2980;

        /* renamed from: ˎ, reason: contains not printable characters */
        private static Field f2981;

        /* renamed from: ˏ, reason: contains not printable characters */
        private static Field f2982;

        /* renamed from: ʽ, reason: contains not printable characters */
        final WindowInsets f2983;

        /* renamed from: ʾ, reason: contains not printable characters */
        private androidx.core.graphics.i0[] f2984;

        /* renamed from: ʿ, reason: contains not printable characters */
        private androidx.core.graphics.i0 f2985;

        /* renamed from: ˆ, reason: contains not printable characters */
        private f5 f2986;

        /* renamed from: ˈ, reason: contains not printable characters */
        androidx.core.graphics.i0 f2987;

        g(f5 f5Var, WindowInsets windowInsets) {
            super(f5Var);
            this.f2985 = null;
            this.f2983 = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: ᵢ, reason: contains not printable characters */
        private androidx.core.graphics.i0 m3102(int i5, boolean z5) {
            androidx.core.graphics.i0 i0Var = androidx.core.graphics.i0.f2697;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    i0Var = androidx.core.graphics.i0.m2285(i0Var, m3116(i6, z5));
                }
            }
            return i0Var;
        }

        /* renamed from: ﹳ, reason: contains not printable characters */
        private androidx.core.graphics.i0 m3103() {
            f5 f5Var = this.f2986;
            return f5Var != null ? f5Var.m3071() : androidx.core.graphics.i0.f2697;
        }

        /* renamed from: ﹶ, reason: contains not printable characters */
        private androidx.core.graphics.i0 m3104(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2978) {
                m3105();
            }
            Method method = f2979;
            if (method != null && f2980 != null && f2981 != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2981.get(f2982.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.i0.m2287(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e5) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        private static void m3105() {
            try {
                f2979 = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2980 = cls;
                f2981 = cls.getDeclaredField("mVisibleInsets");
                f2982 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2981.setAccessible(true);
                f2982.setAccessible(true);
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
            f2978 = true;
        }

        @Override // androidx.core.view.f5.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2987, ((g) obj).f2987);
            }
            return false;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ʾ, reason: contains not printable characters */
        void mo3106(View view) {
            androidx.core.graphics.i0 m3104 = m3104(view);
            if (m3104 == null) {
                m3104 = androidx.core.graphics.i0.f2697;
            }
            mo3114(m3104);
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ʿ, reason: contains not printable characters */
        void mo3107(f5 f5Var) {
            f5Var.m3085(this.f2986);
            f5Var.m3084(this.f2987);
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˈ, reason: contains not printable characters */
        public androidx.core.graphics.i0 mo3108(int i5) {
            return m3102(i5, false);
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˎ, reason: contains not printable characters */
        final androidx.core.graphics.i0 mo3109() {
            if (this.f2985 == null) {
                this.f2985 = androidx.core.graphics.i0.m2286(this.f2983.getSystemWindowInsetLeft(), this.f2983.getSystemWindowInsetTop(), this.f2983.getSystemWindowInsetRight(), this.f2983.getSystemWindowInsetBottom());
            }
            return this.f2985;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˑ, reason: contains not printable characters */
        f5 mo3110(int i5, int i6, int i7, int i8) {
            b bVar = new b(f5.m3063(this.f2983));
            bVar.m3092(f5.m3062(mo3109(), i5, i6, i7, i8));
            bVar.m3091(f5.m3062(mo3120(), i5, i6, i7, i8));
            return bVar.m3089();
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ـ, reason: contains not printable characters */
        boolean mo3111() {
            return this.f2983.isRound();
        }

        @Override // androidx.core.view.f5.l
        @SuppressLint({"WrongConstant"})
        /* renamed from: ٴ, reason: contains not printable characters */
        boolean mo3112(int i5) {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0 && !m3117(i6)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ᐧ, reason: contains not printable characters */
        public void mo3113(androidx.core.graphics.i0[] i0VarArr) {
            this.f2984 = i0VarArr;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ᴵ, reason: contains not printable characters */
        void mo3114(androidx.core.graphics.i0 i0Var) {
            this.f2987 = i0Var;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ᵎ, reason: contains not printable characters */
        void mo3115(f5 f5Var) {
            this.f2986 = f5Var;
        }

        /* renamed from: ⁱ, reason: contains not printable characters */
        protected androidx.core.graphics.i0 m3116(int i5, boolean z5) {
            androidx.core.graphics.i0 m3071;
            int i6;
            if (i5 == 1) {
                return z5 ? androidx.core.graphics.i0.m2286(0, Math.max(m3103().f2699, mo3109().f2699), 0, 0) : androidx.core.graphics.i0.m2286(0, mo3109().f2699, 0, 0);
            }
            if (i5 == 2) {
                if (z5) {
                    androidx.core.graphics.i0 m3103 = m3103();
                    androidx.core.graphics.i0 mo3120 = mo3120();
                    return androidx.core.graphics.i0.m2286(Math.max(m3103.f2698, mo3120.f2698), 0, Math.max(m3103.f2700, mo3120.f2700), Math.max(m3103.f2701, mo3120.f2701));
                }
                androidx.core.graphics.i0 mo3109 = mo3109();
                f5 f5Var = this.f2986;
                m3071 = f5Var != null ? f5Var.m3071() : null;
                int i7 = mo3109.f2701;
                if (m3071 != null) {
                    i7 = Math.min(i7, m3071.f2701);
                }
                return androidx.core.graphics.i0.m2286(mo3109.f2698, 0, mo3109.f2700, i7);
            }
            if (i5 != 8) {
                if (i5 == 16) {
                    return mo3126();
                }
                if (i5 == 32) {
                    return mo3125();
                }
                if (i5 == 64) {
                    return mo3127();
                }
                if (i5 != 128) {
                    return androidx.core.graphics.i0.f2697;
                }
                f5 f5Var2 = this.f2986;
                q m3069 = f5Var2 != null ? f5Var2.m3069() : mo3124();
                return m3069 != null ? androidx.core.graphics.i0.m2286(m3069.m3269(), m3069.m3271(), m3069.m3270(), m3069.m3268()) : androidx.core.graphics.i0.f2697;
            }
            androidx.core.graphics.i0[] i0VarArr = this.f2984;
            m3071 = i0VarArr != null ? i0VarArr[m.m3129(8)] : null;
            if (m3071 != null) {
                return m3071;
            }
            androidx.core.graphics.i0 mo31092 = mo3109();
            androidx.core.graphics.i0 m31032 = m3103();
            int i8 = mo31092.f2701;
            if (i8 > m31032.f2701) {
                return androidx.core.graphics.i0.m2286(0, 0, 0, i8);
            }
            androidx.core.graphics.i0 i0Var = this.f2987;
            return (i0Var == null || i0Var.equals(androidx.core.graphics.i0.f2697) || (i6 = this.f2987.f2701) <= m31032.f2701) ? androidx.core.graphics.i0.f2697 : androidx.core.graphics.i0.m2286(0, 0, 0, i6);
        }

        /* renamed from: ﾞ, reason: contains not printable characters */
        protected boolean m3117(int i5) {
            if (i5 != 1 && i5 != 2) {
                if (i5 == 4) {
                    return false;
                }
                if (i5 != 8 && i5 != 128) {
                    return true;
                }
            }
            return !m3116(i5, false).equals(androidx.core.graphics.i0.f2697);
        }

        g(f5 f5Var, g gVar) {
            this(f5Var, new WindowInsets(gVar.f2983));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class j extends i {

        /* renamed from: י, reason: contains not printable characters */
        private androidx.core.graphics.i0 f2989;

        /* renamed from: ـ, reason: contains not printable characters */
        private androidx.core.graphics.i0 f2990;

        /* renamed from: ٴ, reason: contains not printable characters */
        private androidx.core.graphics.i0 f2991;

        j(f5 f5Var, WindowInsets windowInsets) {
            super(f5Var, windowInsets);
            this.f2989 = null;
            this.f2990 = null;
            this.f2991 = null;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˉ, reason: contains not printable characters */
        androidx.core.graphics.i0 mo3125() {
            if (this.f2990 == null) {
                this.f2990 = androidx.core.graphics.i0.m2288(this.f2983.getMandatorySystemGestureInsets());
            }
            return this.f2990;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˋ, reason: contains not printable characters */
        androidx.core.graphics.i0 mo3126() {
            if (this.f2989 == null) {
                this.f2989 = androidx.core.graphics.i0.m2288(this.f2983.getSystemGestureInsets());
            }
            return this.f2989;
        }

        @Override // androidx.core.view.f5.l
        /* renamed from: ˏ, reason: contains not printable characters */
        androidx.core.graphics.i0 mo3127() {
            if (this.f2991 == null) {
                this.f2991 = androidx.core.graphics.i0.m2288(this.f2983.getTappableElementInsets());
            }
            return this.f2991;
        }

        @Override // androidx.core.view.f5.g, androidx.core.view.f5.l
        /* renamed from: ˑ */
        f5 mo3110(int i5, int i6, int i7, int i8) {
            return f5.m3063(this.f2983.inset(i5, i6, i7, i8));
        }

        j(f5 f5Var, j jVar) {
            super(f5Var, jVar);
            this.f2989 = null;
            this.f2990 = null;
            this.f2991 = null;
        }

        @Override // androidx.core.view.f5.h, androidx.core.view.f5.l
        /* renamed from: ᵔ */
        public void mo3122(androidx.core.graphics.i0 i0Var) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final f f2968;

        public b() {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                this.f2968 = new e();
                return;
            }
            if (i5 >= 29) {
                this.f2968 = new d();
            } else if (i5 >= 20) {
                this.f2968 = new c();
            } else {
                this.f2968 = new f();
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public f5 m3089() {
            return this.f2968.mo3094();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public b m3090(int i5, androidx.core.graphics.i0 i0Var) {
            this.f2968.mo3100(i5, i0Var);
            return this;
        }

        @Deprecated
        /* renamed from: ʽ, reason: contains not printable characters */
        public b m3091(androidx.core.graphics.i0 i0Var) {
            this.f2968.mo3095(i0Var);
            return this;
        }

        @Deprecated
        /* renamed from: ʾ, reason: contains not printable characters */
        public b m3092(androidx.core.graphics.i0 i0Var) {
            this.f2968.mo3096(i0Var);
            return this;
        }

        public b(f5 f5Var) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                this.f2968 = new e(f5Var);
                return;
            }
            if (i5 >= 29) {
                this.f2968 = new d(f5Var);
            } else if (i5 >= 20) {
                this.f2968 = new c(f5Var);
            } else {
                this.f2968 = new f(f5Var);
            }
        }
    }

    public f5(f5 f5Var) {
        if (f5Var != null) {
            l lVar = f5Var.f2963;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && (lVar instanceof k)) {
                this.f2963 = new k(this, (k) lVar);
            } else if (i5 >= 29 && (lVar instanceof j)) {
                this.f2963 = new j(this, (j) lVar);
            } else if (i5 >= 28 && (lVar instanceof i)) {
                this.f2963 = new i(this, (i) lVar);
            } else if (i5 >= 21 && (lVar instanceof h)) {
                this.f2963 = new h(this, (h) lVar);
            } else if (i5 >= 20 && (lVar instanceof g)) {
                this.f2963 = new g(this, (g) lVar);
            } else {
                this.f2963 = new l(this);
            }
            lVar.mo3107(this);
            return;
        }
        this.f2963 = new l(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class l {

        /* renamed from: ʼ, reason: contains not printable characters */
        static final f5 f2993 = new b().m3089().m3065().m3066().m3067();

        /* renamed from: ʻ, reason: contains not printable characters */
        final f5 f2994;

        l(f5 f5Var) {
            this.f2994 = f5Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return mo3111() == lVar.mo3111() && mo3121() == lVar.mo3121() && androidx.core.util.c.m2568(mo3109(), lVar.mo3109()) && androidx.core.util.c.m2568(mo3120(), lVar.mo3120()) && androidx.core.util.c.m2568(mo3124(), lVar.mo3124());
        }

        public int hashCode() {
            return androidx.core.util.c.m2569(Boolean.valueOf(mo3111()), Boolean.valueOf(mo3121()), mo3109(), mo3120(), mo3124());
        }

        /* renamed from: ʻ */
        f5 mo3123() {
            return this.f2994;
        }

        /* renamed from: ʼ */
        f5 mo3118() {
            return this.f2994;
        }

        /* renamed from: ʽ */
        f5 mo3119() {
            return this.f2994;
        }

        /* renamed from: ˆ */
        q mo3124() {
            return null;
        }

        /* renamed from: ˈ */
        androidx.core.graphics.i0 mo3108(int i5) {
            return androidx.core.graphics.i0.f2697;
        }

        /* renamed from: ˉ */
        androidx.core.graphics.i0 mo3125() {
            return mo3109();
        }

        /* renamed from: ˊ */
        androidx.core.graphics.i0 mo3120() {
            return androidx.core.graphics.i0.f2697;
        }

        /* renamed from: ˋ */
        androidx.core.graphics.i0 mo3126() {
            return mo3109();
        }

        /* renamed from: ˎ */
        androidx.core.graphics.i0 mo3109() {
            return androidx.core.graphics.i0.f2697;
        }

        /* renamed from: ˏ */
        androidx.core.graphics.i0 mo3127() {
            return mo3109();
        }

        /* renamed from: ˑ */
        f5 mo3110(int i5, int i6, int i7, int i8) {
            return f2993;
        }

        /* renamed from: י */
        boolean mo3121() {
            return false;
        }

        /* renamed from: ـ */
        boolean mo3111() {
            return false;
        }

        /* renamed from: ٴ */
        boolean mo3112(int i5) {
            return true;
        }

        /* renamed from: ʾ */
        void mo3106(View view) {
        }

        /* renamed from: ʿ */
        void mo3107(f5 f5Var) {
        }

        /* renamed from: ᐧ */
        public void mo3113(androidx.core.graphics.i0[] i0VarArr) {
        }

        /* renamed from: ᴵ */
        void mo3114(androidx.core.graphics.i0 i0Var) {
        }

        /* renamed from: ᵎ */
        void mo3115(f5 f5Var) {
        }

        /* renamed from: ᵔ */
        public void mo3122(androidx.core.graphics.i0 i0Var) {
        }
    }
}
