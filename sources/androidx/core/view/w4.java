package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.f5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class w4 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private e f3035;

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        WindowInsets f3038;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f3039;

        public b(int i5) {
            this.f3039 = i5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int m3394() {
            return this.f3039;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public abstract void mo3395(w4 w4Var);

        /* renamed from: ʽ, reason: contains not printable characters */
        public abstract void mo3396(w4 w4Var);

        /* renamed from: ʾ, reason: contains not printable characters */
        public abstract f5 mo3397(f5 f5Var, List<w4> list);

        /* renamed from: ʿ, reason: contains not printable characters */
        public abstract a mo3398(w4 w4Var, a aVar);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    private static class c extends e {

        /* compiled from: WindowInsetsAnimationCompat.java */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: ʻ, reason: contains not printable characters */
            final b f3040;

            /* renamed from: ʼ, reason: contains not printable characters */
            private f5 f3041;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.w4$c$a$a, reason: collision with other inner class name */
            class C0036a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: ʾ, reason: contains not printable characters */
                final /* synthetic */ w4 f3042;

                /* renamed from: ʿ, reason: contains not printable characters */
                final /* synthetic */ f5 f3043;

                /* renamed from: ˆ, reason: contains not printable characters */
                final /* synthetic */ f5 f3044;

                /* renamed from: ˈ, reason: contains not printable characters */
                final /* synthetic */ int f3045;

                /* renamed from: ˉ, reason: contains not printable characters */
                final /* synthetic */ View f3046;

                C0036a(w4 w4Var, f5 f5Var, f5 f5Var2, int i5, View view) {
                    this.f3042 = w4Var;
                    this.f3043 = f5Var;
                    this.f3044 = f5Var2;
                    this.f3045 = i5;
                    this.f3046 = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f3042.m3389(valueAnimator.getAnimatedFraction());
                    c.m3404(this.f3046, c.m3408(this.f3043, this.f3044, this.f3042.m3387(), this.f3045), Collections.singletonList(this.f3042));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            class b extends AnimatorListenerAdapter {

                /* renamed from: ʾ, reason: contains not printable characters */
                final /* synthetic */ w4 f3048;

                /* renamed from: ʿ, reason: contains not printable characters */
                final /* synthetic */ View f3049;

                b(w4 w4Var, View view) {
                    this.f3048 = w4Var;
                    this.f3049 = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f3048.m3389(1.0f);
                    c.m3402(this.f3049, this.f3048);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.w4$c$a$c, reason: collision with other inner class name */
            class RunnableC0037c implements Runnable {

                /* renamed from: ʾ, reason: contains not printable characters */
                final /* synthetic */ View f3051;

                /* renamed from: ʿ, reason: contains not printable characters */
                final /* synthetic */ w4 f3052;

                /* renamed from: ˆ, reason: contains not printable characters */
                final /* synthetic */ a f3053;

                /* renamed from: ˈ, reason: contains not printable characters */
                final /* synthetic */ ValueAnimator f3054;

                RunnableC0037c(View view, w4 w4Var, a aVar, ValueAnimator valueAnimator) {
                    this.f3051 = view;
                    this.f3052 = w4Var;
                    this.f3053 = aVar;
                    this.f3054 = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m3405(this.f3051, this.f3052, this.f3053);
                    this.f3054.start();
                }
            }

            a(View view, b bVar) {
                this.f3040 = bVar;
                f5 m2875 = f1.m2875(view);
                this.f3041 = m2875 != null ? new f5.b(m2875).m3089() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f3041 = f5.m3064(windowInsets, view);
                    return c.m3406(view, windowInsets);
                }
                f5 m3064 = f5.m3064(windowInsets, view);
                if (this.f3041 == null) {
                    this.f3041 = f1.m2875(view);
                }
                if (this.f3041 == null) {
                    this.f3041 = m3064;
                    return c.m3406(view, windowInsets);
                }
                b m3407 = c.m3407(view);
                if (m3407 != null && Objects.equals(m3407.f3038, windowInsets)) {
                    return c.m3406(view, windowInsets);
                }
                int m3399 = c.m3399(m3064, this.f3041);
                if (m3399 == 0) {
                    return c.m3406(view, windowInsets);
                }
                f5 f5Var = this.f3041;
                w4 w4Var = new w4(m3399, new DecelerateInterpolator(), 160L);
                w4Var.m3389(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w4Var.m3386());
                a m3400 = c.m3400(m3064, f5Var, m3399);
                c.m3403(view, w4Var, windowInsets, false);
                duration.addUpdateListener(new C0036a(w4Var, m3064, f5Var, m3399, view));
                duration.addListener(new b(w4Var, view));
                x0.m3434(view, new RunnableC0037c(view, w4Var, m3400, duration));
                this.f3041 = m3064;
                return c.m3406(view, windowInsets);
            }
        }

        c(int i5, Interpolator interpolator, long j5) {
            super(i5, interpolator, j5);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: ʿ, reason: contains not printable characters */
        static int m3399(f5 f5Var, f5 f5Var2) {
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if (!f5Var.m3070(i6).equals(f5Var2.m3070(i6))) {
                    i5 |= i6;
                }
            }
            return i5;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static a m3400(f5 f5Var, f5 f5Var2, int i5) {
            androidx.core.graphics.i0 m3070 = f5Var.m3070(i5);
            androidx.core.graphics.i0 m30702 = f5Var2.m3070(i5);
            return new a(androidx.core.graphics.i0.m2286(Math.min(m3070.f2698, m30702.f2698), Math.min(m3070.f2699, m30702.f2699), Math.min(m3070.f2700, m30702.f2700), Math.min(m3070.f2701, m30702.f2701)), androidx.core.graphics.i0.m2286(Math.max(m3070.f2698, m30702.f2698), Math.max(m3070.f2699, m30702.f2699), Math.max(m3070.f2700, m30702.f2700), Math.max(m3070.f2701, m30702.f2701)));
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private static View.OnApplyWindowInsetsListener m3401(View view, b bVar) {
            return new a(view, bVar);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static void m3402(View view, w4 w4Var) {
            b m3407 = m3407(view);
            if (m3407 != null) {
                m3407.mo3395(w4Var);
                if (m3407.m3394() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    m3402(viewGroup.getChildAt(i5), w4Var);
                }
            }
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static void m3403(View view, w4 w4Var, WindowInsets windowInsets, boolean z5) {
            b m3407 = m3407(view);
            if (m3407 != null) {
                m3407.f3038 = windowInsets;
                if (!z5) {
                    m3407.mo3396(w4Var);
                    z5 = m3407.m3394() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    m3403(viewGroup.getChildAt(i5), w4Var, windowInsets, z5);
                }
            }
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        static void m3404(View view, f5 f5Var, List<w4> list) {
            b m3407 = m3407(view);
            if (m3407 != null) {
                f5Var = m3407.mo3397(f5Var, list);
                if (m3407.m3394() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    m3404(viewGroup.getChildAt(i5), f5Var, list);
                }
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        static void m3405(View view, w4 w4Var, a aVar) {
            b m3407 = m3407(view);
            if (m3407 != null) {
                m3407.mo3398(w4Var, aVar);
                if (m3407.m3394() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    m3405(viewGroup.getChildAt(i5), w4Var, aVar);
                }
            }
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        static WindowInsets m3406(View view, WindowInsets windowInsets) {
            return view.getTag(u.b.f11366) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        static b m3407(View view) {
            Object tag = view.getTag(u.b.f11387);
            if (tag instanceof a) {
                return ((a) tag).f3040;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: י, reason: contains not printable characters */
        static f5 m3408(f5 f5Var, f5 f5Var2, float f5, int i5) {
            f5.b bVar = new f5.b(f5Var);
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) == 0) {
                    bVar.m3090(i6, f5Var.m3070(i6));
                } else {
                    androidx.core.graphics.i0 m3070 = f5Var.m3070(i6);
                    androidx.core.graphics.i0 m30702 = f5Var2.m3070(i6);
                    float f6 = 1.0f - f5;
                    double d6 = (m3070.f2698 - m30702.f2698) * f6;
                    Double.isNaN(d6);
                    int i7 = (int) (d6 + 0.5d);
                    double d7 = (m3070.f2699 - m30702.f2699) * f6;
                    Double.isNaN(d7);
                    double d8 = (m3070.f2700 - m30702.f2700) * f6;
                    Double.isNaN(d8);
                    int i8 = (int) (d8 + 0.5d);
                    double d9 = (m3070.f2701 - m30702.f2701) * f6;
                    Double.isNaN(d9);
                    bVar.m3090(i6, f5.m3062(m3070, i7, (int) (d7 + 0.5d), i8, (int) (d9 + 0.5d)));
                }
            }
            return bVar.m3089();
        }

        /* renamed from: ـ, reason: contains not printable characters */
        static void m3409(View view, b bVar) {
            Object tag = view.getTag(u.b.f11366);
            if (bVar == null) {
                view.setTag(u.b.f11387, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener m3401 = m3401(view, bVar);
            view.setTag(u.b.f11387, m3401);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(m3401);
            }
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    private static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int f3061;

        /* renamed from: ʼ, reason: contains not printable characters */
        private float f3062;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Interpolator f3063;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final long f3064;

        e(int i5, Interpolator interpolator, long j5) {
            this.f3061 = i5;
            this.f3063 = interpolator;
            this.f3064 = j5;
        }

        /* renamed from: ʻ */
        public long mo3414() {
            return this.f3064;
        }

        /* renamed from: ʼ */
        public float mo3415() {
            Interpolator interpolator = this.f3063;
            return interpolator != null ? interpolator.getInterpolation(this.f3062) : this.f3062;
        }

        /* renamed from: ʽ */
        public int mo3416() {
            return this.f3061;
        }

        /* renamed from: ʾ */
        public void mo3417(float f5) {
            this.f3062 = f5;
        }
    }

    public w4(int i5, Interpolator interpolator, long j5) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            this.f3035 = new d(i5, interpolator, j5);
        } else if (i6 >= 21) {
            this.f3035 = new c(i5, interpolator, j5);
        } else {
            this.f3035 = new e(0, interpolator, j5);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static void m3384(View view, b bVar) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            d.m3413(view, bVar);
        } else if (i5 >= 21) {
            c.m3409(view, bVar);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static w4 m3385(WindowInsetsAnimation windowInsetsAnimation) {
        return new w4(windowInsetsAnimation);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public long m3386() {
        return this.f3035.mo3414();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public float m3387() {
        return this.f3035.mo3415();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m3388() {
        return this.f3035.mo3416();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m3389(float f5) {
        this.f3035.mo3417(f5);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    private static class d extends e {

        /* renamed from: ʿ, reason: contains not printable characters */
        private final WindowInsetsAnimation f3056;

        /* compiled from: WindowInsetsAnimationCompat.java */
        private static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: ʻ, reason: contains not printable characters */
            private final b f3057;

            /* renamed from: ʼ, reason: contains not printable characters */
            private List<w4> f3058;

            /* renamed from: ʽ, reason: contains not printable characters */
            private ArrayList<w4> f3059;

            /* renamed from: ʾ, reason: contains not printable characters */
            private final HashMap<WindowInsetsAnimation, w4> f3060;

            a(b bVar) {
                super(bVar.m3394());
                this.f3060 = new HashMap<>();
                this.f3057 = bVar;
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            private w4 m3418(WindowInsetsAnimation windowInsetsAnimation) {
                w4 w4Var = this.f3060.get(windowInsetsAnimation);
                if (w4Var != null) {
                    return w4Var;
                }
                w4 m3385 = w4.m3385(windowInsetsAnimation);
                this.f3060.put(windowInsetsAnimation, m3385);
                return m3385;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3057.mo3395(m3418(windowInsetsAnimation));
                this.f3060.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3057.mo3396(m3418(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<w4> arrayList = this.f3059;
                if (arrayList == null) {
                    ArrayList<w4> arrayList2 = new ArrayList<>(list.size());
                    this.f3059 = arrayList2;
                    this.f3058 = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    w4 m3418 = m3418(windowInsetsAnimation);
                    m3418.m3389(windowInsetsAnimation.getFraction());
                    this.f3059.add(m3418);
                }
                return this.f3057.mo3397(f5.m3063(windowInsets), this.f3058).m3087();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f3057.mo3398(m3418(windowInsetsAnimation), a.m3390(bounds)).m3393();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f3056 = windowInsetsAnimation;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static WindowInsetsAnimation.Bounds m3410(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.m3391().m2289(), aVar.m3392().m2289());
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static androidx.core.graphics.i0 m3411(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.i0.m2288(bounds.getUpperBound());
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public static androidx.core.graphics.i0 m3412(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.i0.m2288(bounds.getLowerBound());
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public static void m3413(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.w4.e
        /* renamed from: ʻ, reason: contains not printable characters */
        public long mo3414() {
            return this.f3056.getDurationMillis();
        }

        @Override // androidx.core.view.w4.e
        /* renamed from: ʼ, reason: contains not printable characters */
        public float mo3415() {
            return this.f3056.getInterpolatedFraction();
        }

        @Override // androidx.core.view.w4.e
        /* renamed from: ʽ, reason: contains not printable characters */
        public int mo3416() {
            return this.f3056.getTypeMask();
        }

        @Override // androidx.core.view.w4.e
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo3417(float f5) {
            this.f3056.setFraction(f5);
        }

        d(int i5, Interpolator interpolator, long j5) {
            this(new WindowInsetsAnimation(i5, interpolator, j5));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final androidx.core.graphics.i0 f3036;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final androidx.core.graphics.i0 f3037;

        public a(androidx.core.graphics.i0 i0Var, androidx.core.graphics.i0 i0Var2) {
            this.f3036 = i0Var;
            this.f3037 = i0Var2;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public static a m3390(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public String toString() {
            return "Bounds{lower=" + this.f3036 + " upper=" + this.f3037 + "}";
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public androidx.core.graphics.i0 m3391() {
            return this.f3036;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public androidx.core.graphics.i0 m3392() {
            return this.f3037;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public WindowInsetsAnimation.Bounds m3393() {
            return d.m3410(this);
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f3036 = d.m3412(bounds);
            this.f3037 = d.m3411(bounds);
        }
    }

    private w4(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3035 = new d(windowInsetsAnimation);
        }
    }
}
