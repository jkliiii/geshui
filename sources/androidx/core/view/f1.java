package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f5;
import androidx.core.view.w4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class f1 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static WeakHashMap<View, String> f2931;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Field f2933;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static ThreadLocal<Rect> f2935;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final AtomicInteger f2930 = new AtomicInteger(1);

    /* renamed from: ʽ, reason: contains not printable characters */
    private static WeakHashMap<View, q4> f2932 = null;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static boolean f2934 = false;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final int[] f2936 = {u.b.f11349, u.b.f11351, u.b.f11373, u.b.f11391, u.b.f11381, u.b.f11348, u.b.f11352, u.b.f11350, u.b.f11356, u.b.f11354, u.b.f11353, u.b.f11355, u.b.f11357, u.b.f11359, u.b.f11361, u.b.f11363, u.b.f11365, u.b.f11367, u.b.f11369, u.b.f11371, u.b.f11375, u.b.f11377, u.b.f11378, u.b.f11380, u.b.f11382, u.b.f11384, u.b.f11386, u.b.f11388, u.b.f11389, u.b.f11390, u.b.f11392, u.b.f11379};

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final w0 f2937 = new w0() { // from class: androidx.core.view.e1
        @Override // androidx.core.view.w0
        public final c onReceiveContent(c cVar) {
            return f1.m2812(cVar);
        }
    };

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final e f2938 = new e();

    /* compiled from: ViewCompat.java */
    class a extends f<Boolean> {
        a(int i5, Class cls, int i6) {
            super(i5, cls, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˊ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Boolean mo2906(View view) {
            return Boolean.valueOf(q.m3029(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˋ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo2907(View view, Boolean bool) {
            q.m3034(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo2908(Boolean bool, Boolean bool2) {
            return !m2928(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    class b extends f<CharSequence> {
        b(int i5, Class cls, int i6, int i7) {
            super(i5, cls, i6, i7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˊ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CharSequence mo2906(View view) {
            return q.m3027(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˋ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo2907(View view, CharSequence charSequence) {
            q.m3033(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo2908(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    class c extends f<CharSequence> {
        c(int i5, Class cls, int i6, int i7) {
            super(i5, cls, i6, i7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˊ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CharSequence mo2906(View view) {
            return s.m3039(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˋ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo2907(View view, CharSequence charSequence) {
            s.m3041(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo2908(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    class d extends f<Boolean> {
        d(int i5, Class cls, int i6) {
            super(i5, cls, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˊ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Boolean mo2906(View view) {
            return Boolean.valueOf(q.m3028(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˋ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo2907(View view, Boolean bool) {
            q.m3032(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f1.f
        /* renamed from: ˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo2908(Boolean bool, Boolean bool2) {
            return !m2928(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    static abstract class f<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int f2940;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Class<T> f2941;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f2942;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int f2943;

        f(int i5, Class<T> cls, int i6) {
            this(i5, cls, 0, i6);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private boolean m2926() {
            return true;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean m2927() {
            return Build.VERSION.SDK_INT >= this.f2942;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m2928(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: ʾ */
        abstract T mo2906(View view);

        /* renamed from: ʿ */
        abstract void mo2907(View view, T t5);

        /* renamed from: ˆ, reason: contains not printable characters */
        T m2929(View view) {
            if (m2927()) {
                return mo2906(view);
            }
            if (!m2926()) {
                return null;
            }
            T t5 = (T) view.getTag(this.f2940);
            if (this.f2941.isInstance(t5)) {
                return t5;
            }
            return null;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        void m2930(View view, T t5) {
            if (m2927()) {
                mo2907(view, t5);
            } else if (m2926() && mo2908(m2929(view), t5)) {
                f1.m2878(view);
                view.setTag(this.f2940, t5);
                f1.m2813(view, this.f2943);
            }
        }

        /* renamed from: ˉ */
        abstract boolean mo2908(T t5, T t6);

        f(int i5, Class<T> cls, int i6, int i7) {
            this.f2940 = i5;
            this.f2941 = cls;
            this.f2943 = i6;
            this.f2942 = i7;
        }
    }

    /* compiled from: ViewCompat.java */
    static class g {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m2931(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    static class h {
        /* renamed from: ʻ, reason: contains not printable characters */
        static AccessibilityNodeProvider m2932(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2933(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m2934(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static int m2935(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static int m2936(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static ViewParent m2937(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static int m2938(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static boolean m2939(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static boolean m2940(View view) {
            return view.hasTransientState();
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        static boolean m2941(View view, int i5, Bundle bundle) {
            return view.performAccessibilityAction(i5, bundle);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        static void m2942(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        static void m2943(View view, int i5, int i6, int i7, int i8) {
            view.postInvalidateOnAnimation(i5, i6, i7, i8);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        static void m2944(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: י, reason: contains not printable characters */
        static void m2945(View view, Runnable runnable, long j5) {
            view.postOnAnimationDelayed(runnable, j5);
        }

        /* renamed from: ـ, reason: contains not printable characters */
        static void m2946(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        static void m2947(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        static void m2948(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        static void m2949(View view, boolean z5) {
            view.setHasTransientState(z5);
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        static void m2950(View view, int i5) {
            view.setImportantForAccessibility(i5);
        }
    }

    /* compiled from: ViewCompat.java */
    static class i {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2951() {
            return View.generateViewId();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static Display m2952(View view) {
            return view.getDisplay();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m2953(View view) {
            return view.getLabelFor();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static int m2954(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static int m2955(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static int m2956(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static boolean m2957(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static void m2958(View view, int i5) {
            view.setLabelFor(i5);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static void m2959(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        static void m2960(View view, int i5) {
            view.setLayoutDirection(i5);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        static void m2961(View view, int i5, int i6, int i7, int i8) {
            view.setPaddingRelative(i5, i6, i7, i8);
        }
    }

    /* compiled from: ViewCompat.java */
    static class j {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Rect m2962(View view) {
            return view.getClipBounds();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2963(View view) {
            return view.isInLayout();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m2964(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat.java */
    static class k {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2965(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2966(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static boolean m2967(View view) {
            return view.isLaidOut();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static boolean m2968(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m2969(ViewParent viewParent, View view, View view2, int i5) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i5);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static void m2970(View view, int i5) {
            view.setAccessibilityLiveRegion(i5);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static void m2971(AccessibilityEvent accessibilityEvent, int i5) {
            accessibilityEvent.setContentChangeTypes(i5);
        }
    }

    /* compiled from: ViewCompat.java */
    static class l {
        /* renamed from: ʻ, reason: contains not printable characters */
        static WindowInsets m2972(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static WindowInsets m2973(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m2974(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    private static class m {

        /* compiled from: ViewCompat.java */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: ʻ, reason: contains not printable characters */
            f5 f2944 = null;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ View f2945;

            /* renamed from: ʽ, reason: contains not printable characters */
            final /* synthetic */ u0 f2946;

            a(View view, u0 u0Var) {
                this.f2945 = view;
                this.f2946 = u0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                f5 m3064 = f5.m3064(windowInsets, view);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    m.m2975(windowInsets, this.f2945);
                    if (m3064.equals(this.f2944)) {
                        return this.f2946.mo691(view, m3064).m3087();
                    }
                }
                this.f2944 = m3064;
                f5 mo691 = this.f2946.mo691(view, m3064);
                if (i5 >= 30) {
                    return mo691.m3087();
                }
                f1.m2827(view);
                return mo691.m3087();
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static void m2975(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(u.b.f11387);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static f5 m2976(View view, f5 f5Var, Rect rect) {
            WindowInsets m3087 = f5Var.m3087();
            if (m3087 != null) {
                return f5.m3064(view.computeSystemWindowInsets(m3087, rect), view);
            }
            rect.setEmpty();
            return f5Var;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static boolean m2977(View view, float f5, float f6, boolean z5) {
            return view.dispatchNestedFling(f5, f6, z5);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static boolean m2978(View view, float f5, float f6) {
            return view.dispatchNestedPreFling(f5, f6);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static boolean m2979(View view, int i5, int i6, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i5, i6, iArr, iArr2);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static boolean m2980(View view, int i5, int i6, int i7, int i8, int[] iArr) {
            return view.dispatchNestedScroll(i5, i6, i7, i8, iArr);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static ColorStateList m2981(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static PorterDuff.Mode m2982(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static float m2983(View view) {
            return view.getElevation();
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public static f5 m2984(View view) {
            return f5.a.m3088(view);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        static String m2985(View view) {
            return view.getTransitionName();
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        static float m2986(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        static float m2987(View view) {
            return view.getZ();
        }

        /* renamed from: י, reason: contains not printable characters */
        static boolean m2988(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: ـ, reason: contains not printable characters */
        static boolean m2989(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        static boolean m2990(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        static void m2991(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        static void m2992(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        static void m2993(View view, float f5) {
            view.setElevation(f5);
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        static void m2994(View view, boolean z5) {
            view.setNestedScrollingEnabled(z5);
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        static void m2995(View view, u0 u0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(u.b.f11366, u0Var);
            }
            if (u0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(u.b.f11387));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, u0Var));
            }
        }

        /* renamed from: ⁱ, reason: contains not printable characters */
        static void m2996(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: ﹳ, reason: contains not printable characters */
        static void m2997(View view, float f5) {
            view.setTranslationZ(f5);
        }

        /* renamed from: ﹶ, reason: contains not printable characters */
        static void m2998(View view, float f5) {
            view.setZ(f5);
        }

        /* renamed from: ﾞ, reason: contains not printable characters */
        static boolean m2999(View view, int i5) {
            return view.startNestedScroll(i5);
        }

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        static void m3000(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    private static class n {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static f5 m3001(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            f5 m3063 = f5.m3063(rootWindowInsets);
            m3063.m3085(m3063);
            m3063.m3068(view.getRootView());
            return m3063;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3002(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3003(View view, int i5) {
            view.setScrollIndicators(i5);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3004(View view, int i5, int i6) {
            view.setScrollIndicators(i5, i6);
        }
    }

    /* compiled from: ViewCompat.java */
    static class o {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3005(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m3006(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3007(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3008(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static boolean m3009(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i5) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i5);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static void m3010(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    static class p {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3011(View view, Collection<View> collection, int i5) {
            view.addKeyboardNavigationClusters(collection, i5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3012(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m3013(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static boolean m3014(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static boolean m3015(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static boolean m3016(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static boolean m3017(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static View m3018(View view, View view2, int i5) {
            return view.keyboardNavigationClusterSearch(view2, i5);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static boolean m3019(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        static void m3020(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        static void m3021(View view, boolean z5) {
            view.setFocusedByDefault(z5);
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        static void m3022(View view, int i5) {
            view.setImportantForAutofill(i5);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        static void m3023(View view, boolean z5) {
            view.setKeyboardNavigationCluster(z5);
        }

        /* renamed from: י, reason: contains not printable characters */
        static void m3024(View view, int i5) {
            view.setNextClusterForwardId(i5);
        }

        /* renamed from: ـ, reason: contains not printable characters */
        static void m3025(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    static class q {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3026(View view, final v vVar) {
            int i5 = u.b.f11383;
            m.g gVar = (m.g) view.getTag(i5);
            if (gVar == null) {
                gVar = new m.g();
                view.setTag(i5, gVar);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.l3
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return vVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(vVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static CharSequence m3027(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static boolean m3028(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static boolean m3029(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m3030(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            m.g gVar = (m.g) view.getTag(u.b.f11383);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(vVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static <T> T m3031(View view, int i5) {
            return (T) view.requireViewById(i5);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static void m3032(View view, boolean z5) {
            view.setAccessibilityHeading(z5);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static void m3033(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static void m3034(View view, boolean z5) {
            view.setScreenReaderFocusable(z5);
        }
    }

    /* compiled from: ViewCompat.java */
    private static class r {
        /* renamed from: ʻ, reason: contains not printable characters */
        static View.AccessibilityDelegate m3035(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static List<Rect> m3036(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3037(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i5, int i6) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i5, i6);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3038(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    private static class s {
        /* renamed from: ʻ, reason: contains not printable characters */
        static CharSequence m3039(View view) {
            return view.getStateDescription();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static t6 m3040(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return t6.m3328(windowInsetsController);
            }
            return null;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3041(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    private static final class t {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static String[] m3042(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static androidx.core.view.c m3043(View view, androidx.core.view.c cVar) {
            ContentInfo m2769 = cVar.m2769();
            ContentInfo performReceiveContent = view.performReceiveContent(m2769);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == m2769 ? cVar : androidx.core.view.c.m2765(performReceiveContent);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static void m3044(View view, String[] strArr, v0 v0Var) {
            if (v0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(v0Var));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    private static final class u implements OnReceiveContentListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final v0 f2947;

        u(v0 v0Var) {
            this.f2947 = v0Var;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.c m2765 = androidx.core.view.c.m2765(contentInfo);
            androidx.core.view.c mo3374 = this.f2947.mo3374(view, m2765);
            if (mo3374 == null) {
                return null;
            }
            return mo3374 == m2765 ? contentInfo : mo3374.m2769();
        }
    }

    /* compiled from: ViewCompat.java */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    static class w {

        /* renamed from: ʾ, reason: contains not printable characters */
        private static final ArrayList<WeakReference<View>> f2948 = new ArrayList<>();

        /* renamed from: ʻ, reason: contains not printable characters */
        private WeakHashMap<View, Boolean> f2949 = null;

        /* renamed from: ʼ, reason: contains not printable characters */
        private SparseArray<WeakReference<View>> f2950 = null;

        /* renamed from: ʽ, reason: contains not printable characters */
        private WeakReference<KeyEvent> f2951 = null;

        w() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static w m3045(View view) {
            int i5 = u.b.f11374;
            w wVar = (w) view.getTag(i5);
            if (wVar != null) {
                return wVar;
            }
            w wVar2 = new w();
            view.setTag(i5, wVar2);
            return wVar2;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private View m3046(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2949;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m3046 = m3046(viewGroup.getChildAt(childCount), keyEvent);
                        if (m3046 != null) {
                            return m3046;
                        }
                    }
                }
                if (m3048(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private SparseArray<WeakReference<View>> m3047() {
            if (this.f2950 == null) {
                this.f2950 = new SparseArray<>();
            }
            return this.f2950;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean m3048(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(u.b.f11383);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private void m3049() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2949;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2948;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2949 == null) {
                    this.f2949 = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f2948;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2949.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2949.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean m3050(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3049();
            }
            View m3046 = m3046(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m3046 != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3047().put(keyCode, new WeakReference<>(m3046));
                }
            }
            return m3046 != null;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean m3051(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f2951;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f2951 = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> m3047 = m3047();
            if (keyEvent.getAction() != 1 || (indexOfKey = m3047.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = m3047.valueAt(indexOfKey);
                m3047.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = m3047.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && f1.m2903(view)) {
                m3048(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static int m2807(View view) {
        return h.m2934(view);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static boolean m2808(View view) {
        return k.m2967(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static boolean m2809(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2990(view);
        }
        if (view instanceof o0) {
            return ((o0) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public static boolean m2810(View view) {
        return i.m2957(view);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static boolean m2811(View view) {
        Boolean m2929 = m2829().m2929(view);
        return m2929 != null && m2929.booleanValue();
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    static void m2813(View view, int i5) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = m2890(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (m2888(view) != 0 || z5) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z5 ? 32 : 2048);
                k.m2971(obtain, i5);
                if (z5) {
                    obtain.getText().add(m2890(view));
                    m2854(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i5 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.m2971(obtain2, i5);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m2890(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.m2969(view.getParent(), view, view, i5);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e5);
                }
            }
        }
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public static void m2814(View view, int i5) {
        boolean z5;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23) {
            view.offsetLeftAndRight(i5);
            return;
        }
        if (i6 < 21) {
            m2866(view, i5);
            return;
        }
        Rect m2905 = m2905();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2905.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z5 = !m2905.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z5 = false;
        }
        m2866(view, i5);
        if (z5 && m2905.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2905);
        }
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    public static void m2815(View view, int i5) {
        boolean z5;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23) {
            view.offsetTopAndBottom(i5);
            return;
        }
        if (i6 < 21) {
            m2868(view, i5);
            return;
        }
        Rect m2905 = m2905();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2905.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z5 = !m2905.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z5 = false;
        }
        m2868(view, i5);
        if (z5 && m2905.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2905);
        }
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    public static f5 m2816(View view, f5 f5Var) {
        WindowInsets m3087;
        if (Build.VERSION.SDK_INT >= 21 && (m3087 = f5Var.m3087()) != null) {
            WindowInsets m2973 = l.m2973(view, m3087);
            if (!m2973.equals(m3087)) {
                return f5.m3064(m2973, view);
            }
        }
        return f5Var;
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    public static void m2817(View view, androidx.core.view.accessibility.j0 j0Var) {
        view.onInitializeAccessibilityNodeInfo(j0Var.m2673());
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private static f<CharSequence> m2818() {
        return new b(u.b.f11360, CharSequence.class, 8, 28);
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    public static boolean m2819(View view, int i5, Bundle bundle) {
        return h.m2941(view, i5, bundle);
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    public static androidx.core.view.c m2820(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.m3043(view, cVar);
        }
        v0 v0Var = (v0) view.getTag(u.b.f11364);
        if (v0Var == null) {
            return m2889(view).onReceiveContent(cVar);
        }
        androidx.core.view.c mo3374 = v0Var.mo3374(view, cVar);
        if (mo3374 == null) {
            return null;
        }
        return m2889(view).onReceiveContent(mo3374);
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public static void m2821(View view) {
        h.m2942(view);
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public static void m2822(View view, Runnable runnable) {
        h.m2944(view, runnable);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public static void m2823(View view, Runnable runnable, long j5) {
        h.m2945(view, runnable, j5);
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    public static void m2824(View view, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2825(i5, view);
            m2813(view, 0);
        }
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    private static void m2825(int i5, View view) {
        List<j0.a> m2892 = m2892(view);
        for (int i6 = 0; i6 < m2892.size(); i6++) {
            if (m2892.get(i6).m2706() == i5) {
                m2892.remove(i6);
                return;
            }
        }
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    public static void m2826(View view, j0.a aVar, CharSequence charSequence, androidx.core.view.accessibility.o0 o0Var) {
        if (o0Var == null && charSequence == null) {
            m2824(view, aVar.m2706());
        } else {
            m2862(view, aVar.m2705(charSequence, o0Var));
        }
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    public static void m2827(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            l.m2974(view);
        } else {
            h.m2947(view);
        }
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    public static void m2828(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.m3037(view, context, iArr, attributeSet, typedArray, i5, i6);
        }
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    private static f<Boolean> m2829() {
        return new a(u.b.f11368, Boolean.class, 28);
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public static void m2830(View view, androidx.core.view.a aVar) {
        if (aVar == null && (m2884(view) instanceof a.C0032a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    public static void m2831(View view, boolean z5) {
        m2832().m2930(view, Boolean.valueOf(z5));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static f<Boolean> m2832() {
        return new d(u.b.f11362, Boolean.class, 28);
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    public static void m2833(View view, int i5) {
        k.m2970(view, i5);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static int m2834(View view) {
        return i.m2954(view);
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    public static void m2835(View view, CharSequence charSequence) {
        m2818().m2930(view, charSequence);
        if (charSequence != null) {
            f2938.m2924(view);
        } else {
            f2938.m2925(view);
        }
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public static void m2836(View view, Drawable drawable) {
        h.m2948(view, drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼʿ, reason: contains not printable characters */
    public static void m2837(View view, ColorStateList colorStateList) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21) {
            if (view instanceof c1) {
                ((c1) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        m.m2991(view, colorStateList);
        if (i5 == 21) {
            Drawable background = view.getBackground();
            boolean z5 = (m.m2981(view) == null && m.m2982(view) == null) ? false : true;
            if (background == null || !z5) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.m2948(view, background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼˆ, reason: contains not printable characters */
    public static void m2838(View view, PorterDuff.Mode mode) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21) {
            if (view instanceof c1) {
                ((c1) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        m.m2992(view, mode);
        if (i5 == 21) {
            Drawable background = view.getBackground();
            boolean z5 = (m.m2981(view) == null && m.m2982(view) == null) ? false : true;
            if (background == null || !z5) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.m2948(view, background);
        }
    }

    /* renamed from: ʼˈ, reason: contains not printable characters */
    public static void m2839(View view, Rect rect) {
        j.m2964(view, rect);
    }

    /* renamed from: ʼˉ, reason: contains not printable characters */
    public static void m2840(View view, float f5) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2993(view, f5);
        }
    }

    @Deprecated
    /* renamed from: ʼˊ, reason: contains not printable characters */
    public static void m2841(View view, boolean z5) {
        view.setFitsSystemWindows(z5);
    }

    /* renamed from: ʼˋ, reason: contains not printable characters */
    public static void m2842(View view, boolean z5) {
        h.m2949(view, z5);
    }

    /* renamed from: ʼˎ, reason: contains not printable characters */
    public static void m2843(View view, int i5) {
        h.m2950(view, i5);
    }

    /* renamed from: ʼˏ, reason: contains not printable characters */
    public static void m2844(View view, int i5) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m3022(view, i5);
        }
    }

    /* renamed from: ʼˑ, reason: contains not printable characters */
    public static void m2845(View view, int i5) {
        i.m2958(view, i5);
    }

    /* renamed from: ʼי, reason: contains not printable characters */
    public static void m2846(View view, u0 u0Var) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2995(view, u0Var);
        }
    }

    /* renamed from: ʼـ, reason: contains not printable characters */
    public static void m2847(View view, int i5, int i6, int i7, int i8) {
        i.m2961(view, i5, i6, i7, i8);
    }

    /* renamed from: ʼٴ, reason: contains not printable characters */
    public static void m2848(View view, b1 b1Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.m3008(view, (PointerIcon) (b1Var != null ? b1Var.m2754() : null));
        }
    }

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    public static void m2849(View view, boolean z5) {
        m2829().m2930(view, Boolean.valueOf(z5));
    }

    /* renamed from: ʼᴵ, reason: contains not printable characters */
    public static void m2850(View view, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.m3004(view, i5, i6);
        }
    }

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public static void m2851(View view, CharSequence charSequence) {
        m2857().m2930(view, charSequence);
    }

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    public static void m2852(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2996(view, str);
            return;
        }
        if (f2931 == null) {
            f2931 = new WeakHashMap<>();
        }
        f2931.put(view, str);
    }

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    public static void m2853(View view, float f5) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2997(view, f5);
        }
    }

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    private static void m2854(View view) {
        if (m2807(view) == 0) {
            m2843(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m2807((View) parent) == 4) {
                m2843(view, 2);
                return;
            }
        }
    }

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    public static void m2855(View view, w4.b bVar) {
        w4.m3384(view, bVar);
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public static void m2856(View view, float f5) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2998(view, f5);
        }
    }

    /* renamed from: ʼﾞ, reason: contains not printable characters */
    private static f<CharSequence> m2857() {
        return new c(u.b.f11372, CharSequence.class, 64, 30);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m2858(View view, CharSequence charSequence, androidx.core.view.accessibility.o0 o0Var) {
        int m2894 = m2894(view, charSequence);
        if (m2894 != -1) {
            m2862(view, new j0.a(m2894, charSequence, o0Var));
        }
        return m2894;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽʻ, reason: contains not printable characters */
    public static void m2859(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m3000(view);
        } else if (view instanceof o0) {
            ((o0) view).stopNestedScroll();
        }
    }

    /* renamed from: ʽʼ, reason: contains not printable characters */
    private static void m2860(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static int m2861(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.m3012(view);
        }
        return 0;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m2862(View view, j0.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2878(view);
            m2825(aVar.m2706(), view);
            m2892(view).add(aVar);
            m2813(view, 0);
        }
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static int m2863(View view) {
        return h.m2936(view);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static q4 m2864(View view) {
        if (f2932 == null) {
            f2932 = new WeakHashMap<>();
        }
        q4 q4Var = f2932.get(view);
        if (q4Var != null) {
            return q4Var;
        }
        q4 q4Var2 = new q4(view);
        f2932.put(view, q4Var2);
        return q4Var2;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static int m2865(View view) {
        return h.m2935(view);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m2866(View view, int i5) {
        view.offsetLeftAndRight(i5);
        if (view.getVisibility() == 0) {
            m2860(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2860((View) parent);
            }
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public static int m2867(View view) {
        return i.m2955(view);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static void m2868(View view, int i5) {
        view.offsetTopAndBottom(i5);
        if (view.getVisibility() == 0) {
            m2860(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2860((View) parent);
            }
        }
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static ViewParent m2869(View view) {
        return h.m2937(view);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static f5 m2870(View view, f5 f5Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.m2976(view, f5Var, rect) : f5Var;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public static int m2871(View view) {
        return i.m2956(view);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static f5 m2872(View view, f5 f5Var) {
        WindowInsets m3087;
        if (Build.VERSION.SDK_INT >= 21 && (m3087 = f5Var.m3087()) != null) {
            WindowInsets m2972 = l.m2972(view, m3087);
            if (!m2972.equals(m3087)) {
                return f5.m3064(m2972, view);
            }
        }
        return f5Var;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static CharSequence m2873(View view) {
        return m2857().m2929(view);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static boolean m2874(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.m3045(view).m3050(view, keyEvent);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public static f5 m2875(View view) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            return n.m3001(view);
        }
        if (i5 >= 21) {
            return m.m2984(view);
        }
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static boolean m2876(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.m3045(view).m3051(keyEvent);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static float m2877(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2986(view);
        }
        return 0.0f;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m2878(View view) {
        androidx.core.view.a m2882 = m2882(view);
        if (m2882 == null) {
            m2882 = new androidx.core.view.a();
        }
        m2830(view, m2882);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public static String m2879(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2985(view);
        }
        WeakHashMap<View, String> weakHashMap = f2931;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static int m2880() {
        return i.m2951();
    }

    @Deprecated
    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static t6 m2881(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.m3040(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return u4.m3368(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: י, reason: contains not printable characters */
    public static androidx.core.view.a m2882(View view) {
        View.AccessibilityDelegate m2884 = m2884(view);
        if (m2884 == null) {
            return null;
        }
        return m2884 instanceof a.C0032a ? ((a.C0032a) m2884).f2848 : new androidx.core.view.a(m2884);
    }

    /* renamed from: יי, reason: contains not printable characters */
    public static float m2883(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2987(view);
        }
        return 0.0f;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static View.AccessibilityDelegate m2884(View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.m3035(view) : m2886(view);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public static String[] m2885(View view) {
        return Build.VERSION.SDK_INT >= 31 ? t.m3042(view) : (String[]) view.getTag(u.b.f11370);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static View.AccessibilityDelegate m2886(View view) {
        if (f2934) {
            return null;
        }
        if (f2933 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2933 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2934 = true;
                return null;
            }
        }
        try {
            Object obj = f2933.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2934 = true;
            return null;
        }
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public static boolean m2887(View view) {
        Boolean m2929 = m2832().m2929(view);
        return m2929 != null && m2929.booleanValue();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static int m2888(View view) {
        return k.m2965(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private static w0 m2889(View view) {
        return view instanceof w0 ? (w0) view : f2937;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static CharSequence m2890(View view) {
        return m2818().m2929(view);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static boolean m2891(View view) {
        return h.m2933(view);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static List<j0.a> m2892(View view) {
        int i5 = u.b.f11376;
        ArrayList arrayList = (ArrayList) view.getTag(i5);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i5, arrayList2);
        return arrayList2;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public static boolean m2893(View view) {
        return m2884(view) != null;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private static int m2894(View view, CharSequence charSequence) {
        List<j0.a> m2892 = m2892(view);
        for (int i5 = 0; i5 < m2892.size(); i5++) {
            if (TextUtils.equals(charSequence, m2892.get(i5).m2707())) {
                return m2892.get(i5).m2706();
            }
        }
        int i6 = 0;
        int i7 = -1;
        while (true) {
            int[] iArr = f2936;
            if (i6 >= iArr.length || i7 != -1) {
                break;
            }
            int i8 = iArr[i6];
            boolean z5 = true;
            for (int i9 = 0; i9 < m2892.size(); i9++) {
                z5 &= m2892.get(i9).m2706() != i8;
            }
            if (z5) {
                i7 = i8;
            }
            i6++;
        }
        return i7;
    }

    @Deprecated
    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public static int m2895(View view) {
        return h.m2938(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public static ColorStateList m2896(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2981(view);
        }
        if (view instanceof c1) {
            return ((c1) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static boolean m2897(View view) {
        return g.m2931(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public static PorterDuff.Mode m2898(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2982(view);
        }
        if (view instanceof c1) {
            return ((c1) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static boolean m2899(View view) {
        return h.m2939(view);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static Rect m2900(View view) {
        return j.m2962(view);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m2901(View view) {
        return h.m2940(view);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static Display m2902(View view) {
        return i.m2952(view);
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public static boolean m2903(View view) {
        return k.m2966(view);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static float m2904(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2983(view);
        }
        return 0.0f;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static Rect m2905() {
        if (f2935 == null) {
            f2935 = new ThreadLocal<>();
        }
        Rect rect = f2935.get();
        if (rect == null) {
            rect = new Rect();
            f2935.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* compiled from: ViewCompat.java */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final WeakHashMap<View, Boolean> f2939 = new WeakHashMap<>();

        e() {
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m2921(View view, boolean z5) {
            boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
            if (z5 != z6) {
                f1.m2813(view, z6 ? 16 : 32);
                this.f2939.put(view, Boolean.valueOf(z6));
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m2922(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private void m2923(View view) {
            h.m2946(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2939.entrySet()) {
                    m2921(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m2922(view);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m2924(View view) {
            this.f2939.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.m2966(view)) {
                m2922(view);
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m2925(View view) {
            this.f2939.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m2923(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻˆ, reason: contains not printable characters */
    public static /* synthetic */ androidx.core.view.c m2812(androidx.core.view.c cVar) {
        return cVar;
    }
}
