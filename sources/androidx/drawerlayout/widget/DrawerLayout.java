package androidx.drawerlayout.widget;

import a0.c;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.g3;
import androidx.core.graphics.i0;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.r;
import androidx.core.view.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: E:\78999\cookie_5123796.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    static final boolean f3149;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private static final boolean f3151;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private static final boolean f3152;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private Drawable f3153;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private CharSequence f3154;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private Drawable f3155;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final c f3156;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private f5 f3157;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f3158;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private CharSequence f3159;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f3160;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private Drawable f3161;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f3162;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private Drawable f3163;

    /* renamed from: ˉ, reason: contains not printable characters */
    private float f3164;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private Drawable f3165;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final Paint f3166;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private final ArrayList<View> f3167;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final a0.c f3168;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private Drawable f3169;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final a0.c f3170;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private Matrix f3171;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final h f3172;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private Rect f3173;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final h f3174;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private final o0 f3175;

    /* renamed from: י, reason: contains not printable characters */
    private int f3176;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f3177;

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean f3178;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f3179;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private OnBackInvokedCallback f3180;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private float f3181;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private OnBackInvokedDispatcher f3182;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private Drawable f3183;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f3184;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f3185;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f3186;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int f3187;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean f3188;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private d f3189;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private List<d> f3190;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private float f3191;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private static final int[] f3150 = {R.attr.colorPrimaryDark};

    /* renamed from: יי, reason: contains not printable characters */
    static final int[] f3148 = {R.attr.layout_gravity};

    class a extends androidx.core.view.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Rect f3192 = new Rect();

        a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m3730(j0 j0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (DrawerLayout.m3677(childAt)) {
                    j0Var.m2674(childAt);
                }
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m3731(j0 j0Var, j0 j0Var2) {
            Rect rect = this.f3192;
            j0Var2.m2689(rect);
            j0Var.m2638(rect);
            j0Var.m2672(j0Var2.m2687());
            j0Var.m2655(j0Var2.m2698());
            j0Var.m2641(j0Var2.m2693());
            j0Var.m2645(j0Var2.m2694());
            j0Var.m2647(j0Var2.m2678());
            j0Var.m2650(j0Var2.m2692());
            j0Var.m2701(j0Var2.m2695());
            j0Var.m2665(j0Var2.m2685());
            j0Var.m2636(j0Var2.m2686());
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View m3721 = DrawerLayout.this.m3721();
            if (m3721 == null) {
                return true;
            }
            CharSequence m3725 = DrawerLayout.this.m3725(DrawerLayout.this.m3726(m3721));
            if (m3725 == null) {
                return true;
            }
            text.add(m3725);
            return true;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            if (DrawerLayout.f3149) {
                super.onInitializeAccessibilityNodeInfo(view, j0Var);
            } else {
                j0 m2632 = j0.m2632(j0Var);
                super.onInitializeAccessibilityNodeInfo(view, m2632);
                j0Var.m2667(view);
                Object m2869 = f1.m2869(view);
                if (m2869 instanceof View) {
                    j0Var.m2657((View) m2869);
                }
                m3731(j0Var, m2632);
                m2632.m2697();
                m3730(j0Var, (ViewGroup) view);
            }
            j0Var.m2641("androidx.drawerlayout.widget.DrawerLayout");
            j0Var.m2649(false);
            j0Var.m2650(false);
            j0Var.m2699(j0.a.f2861);
            j0Var.m2699(j0.a.f2863);
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3149 || DrawerLayout.m3677(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static OnBackInvokedDispatcher m3732(DrawerLayout drawerLayout) {
            return drawerLayout.findOnBackInvokedDispatcher();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static OnBackInvokedCallback m3733(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new g3(runnable);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3734(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3735(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    static final class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            if (DrawerLayout.m3677(view)) {
                return;
            }
            j0Var.m2657(null);
        }
    }

    public interface d {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo3736(int i5);

        /* renamed from: ʼ, reason: contains not printable characters */
        void mo3737(View view, float f5);

        /* renamed from: ʽ, reason: contains not printable characters */
        void mo3738(View view);

        /* renamed from: ʾ, reason: contains not printable characters */
        void mo3739(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends c.AbstractC0005c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int f3203;

        /* renamed from: ʼ, reason: contains not printable characters */
        private a0.c f3204;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Runnable f3205 = new Runnable() { // from class: androidx.drawerlayout.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f3209.m3744();
            }
        };

        h(int i5) {
            this.f3203 = i5;
        }

        /* renamed from: י, reason: contains not printable characters */
        private void m3743() {
            View m3718 = DrawerLayout.this.m3718(this.f3203 == 3 ? 5 : 3);
            if (m3718 != null) {
                DrawerLayout.this.m3705(m3718);
            }
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʻ */
        public int mo112(View view, int i5, int i6) {
            if (DrawerLayout.this.m3701(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i5, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i5, width));
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʼ */
        public int mo113(View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʾ */
        public int mo115(View view) {
            if (DrawerLayout.this.m3700(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˆ */
        public void mo117(int i5, int i6) {
            View m3718 = (i5 & 1) == 1 ? DrawerLayout.this.m3718(3) : DrawerLayout.this.m3718(5);
            if (m3718 == null || DrawerLayout.this.m3723(m3718) != 0) {
                return;
            }
            this.f3204.m91(m3718, i6);
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˈ */
        public boolean mo118(int i5) {
            return false;
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˉ */
        public void mo119(int i5, int i6) {
            DrawerLayout.this.postDelayed(this.f3205, 160L);
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˊ */
        public void mo120(View view, int i5) {
            ((e) view.getLayoutParams()).f3196 = false;
            m3743();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˋ */
        public void mo121(int i5) {
            DrawerLayout.this.m3695(i5, this.f3204.m108());
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˎ */
        public void mo122(View view, int i5, int i6, int i7, int i8) {
            float width = (DrawerLayout.this.m3701(view, 3) ? i5 + r3 : DrawerLayout.this.getWidth() - i5) / view.getWidth();
            DrawerLayout.this.m3729(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˏ */
        public void mo123(View view, float f5, float f6) {
            int i5;
            float m3727 = DrawerLayout.this.m3727(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m3701(view, 3)) {
                i5 = (f5 > 0.0f || (f5 == 0.0f && m3727 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f5 < 0.0f || (f5 == 0.0f && m3727 > 0.5f)) {
                    width2 -= width;
                }
                i5 = width2;
            }
            this.f3204.m99(i5, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˑ */
        public boolean mo124(View view, int i5) {
            return DrawerLayout.this.m3700(view) && DrawerLayout.this.m3701(view, this.f3203) && DrawerLayout.this.m3723(view) == 0;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        void m3744() {
            View m3718;
            int width;
            int m110 = this.f3204.m110();
            boolean z5 = this.f3203 == 3;
            if (z5) {
                m3718 = DrawerLayout.this.m3718(3);
                width = (m3718 != null ? -m3718.getWidth() : 0) + m110;
            } else {
                m3718 = DrawerLayout.this.m3718(5);
                width = DrawerLayout.this.getWidth() - m110;
            }
            if (m3718 != null) {
                if (((!z5 || m3718.getLeft() >= width) && (z5 || m3718.getLeft() <= width)) || DrawerLayout.this.m3723(m3718) != 0) {
                    return;
                }
                e eVar = (e) m3718.getLayoutParams();
                this.f3204.m107(m3718, width, m3718.getTop());
                eVar.f3196 = true;
                DrawerLayout.this.invalidate();
                m3743();
                DrawerLayout.this.m3699();
            }
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        public void m3745() {
            DrawerLayout.this.removeCallbacks(this.f3205);
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        public void m3746(a0.c cVar) {
            this.f3204 = cVar;
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        f3149 = true;
        f3151 = i5 >= 21;
        f3152 = i5 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b0.a.f4800);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    static boolean m3677(View view) {
        return (f1.m2807(view) == 4 || f1.m2807(view) == 2) ? false : true;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private void m3678(View view) {
        j0.a aVar = j0.a.f2898;
        f1.m2824(view, aVar.m2706());
        if (!m3702(view) || m3723(view) == 2) {
            return;
        }
        f1.m2826(view, aVar, null, this.f3175);
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private void m3679(View view, boolean z5) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((z5 || m3700(childAt)) && !(z5 && childAt == view)) {
                f1.m2843(childAt, 4);
            } else {
                f1.m2843(childAt, 1);
            }
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private boolean m3681(float f5, float f6, View view) {
        if (this.f3173 == null) {
            this.f3173 = new Rect();
        }
        view.getHitRect(this.f3173);
        return this.f3173.contains((int) f5, (int) f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static /* synthetic */ f5 m3682(View view, f5 f5Var) {
        ((DrawerLayout) view).m3728(f5Var, f5Var.m3077().f2699 > 0);
        return f5Var.m3067();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉˉ, reason: contains not printable characters */
    public /* synthetic */ boolean m3683(View view, o0.a aVar) {
        if (!m3702(view) || m3723(view) == 2) {
            return false;
        }
        m3705(view);
        return true;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private void m3684(Drawable drawable, int i5) {
        if (drawable == null || !androidx.core.graphics.drawable.a.m2203(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.a.m2208(drawable, i5);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean m3685(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent m3691 = m3691(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(m3691);
            m3691.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private boolean m3686() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((e) getChildAt(i5).getLayoutParams()).f3196) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private boolean m3687() {
        return m3721() != null;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private Drawable m3688() {
        int m2834 = f1.m2834(this);
        if (m2834 == 0) {
            Drawable drawable = this.f3161;
            if (drawable != null) {
                m3684(drawable, m2834);
                return this.f3161;
            }
        } else {
            Drawable drawable2 = this.f3165;
            if (drawable2 != null) {
                m3684(drawable2, m2834);
                return this.f3165;
            }
        }
        return this.f3163;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private Drawable m3689() {
        int m2834 = f1.m2834(this);
        if (m2834 == 0) {
            Drawable drawable = this.f3165;
            if (drawable != null) {
                m3684(drawable, m2834);
                return this.f3165;
            }
        } else {
            Drawable drawable2 = this.f3161;
            if (drawable2 != null) {
                m3684(drawable2, m2834);
                return this.f3161;
            }
        }
        return this.f3169;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private void m3690() {
        if (f3151) {
            return;
        }
        this.f3153 = m3688();
        this.f3155 = m3689();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private MotionEvent m3691(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f3171 == null) {
                this.f3171 = new Matrix();
            }
            matrix.invert(this.f3171);
            obtain.transform(this.f3171);
        }
        return obtain;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    static String m3692(int i5) {
        return (i5 & 3) == 3 ? "LEFT" : (i5 & 5) == 5 ? "RIGHT" : Integer.toHexString(i5);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static boolean m3693(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i6) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!m3700(childAt)) {
                this.f3167.add(childAt);
            } else if (m3702(childAt)) {
                childAt.addFocusables(arrayList, i5, i6);
                z5 = true;
            }
        }
        if (!z5) {
            int size = this.f3167.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = this.f3167.get(i8);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i5, i6);
                }
            }
        }
        this.f3167.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        if (m3720() != null || m3700(view)) {
            f1.m2843(view, 4);
        } else {
            f1.m2843(view, 1);
        }
        if (f3149) {
            return;
        }
        f1.m2830(view, this.f3156);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f5 = 0.0f;
        for (int i5 = 0; i5 < childCount; i5++) {
            f5 = Math.max(f5, ((e) getChildAt(i5).getLayoutParams()).f3195);
        }
        this.f3164 = f5;
        boolean m101 = this.f3168.m101(true);
        boolean m1012 = this.f3170.m101(true);
        if (m101 || m1012) {
            f1.m2821(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3164 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt = getChildAt(i5);
            if (m3681(x5, y5, childAt) && !m3698(childAt) && m3685(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        int height = getHeight();
        boolean m3698 = m3698(view);
        int width = getWidth();
        int save = canvas.save();
        int i5 = 0;
        if (m3698) {
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt != view && childAt.getVisibility() == 0 && m3693(childAt) && m3700(childAt) && childAt.getHeight() >= height) {
                    if (m3701(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i6) {
                            i6 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i6, 0, width, getHeight());
            i5 = i6;
        }
        boolean drawChild = super.drawChild(canvas, view, j5);
        canvas.restoreToCount(save);
        float f5 = this.f3164;
        if (f5 > 0.0f && m3698) {
            this.f3166.setColor((this.f3162 & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f5)) << 24));
            canvas.drawRect(i5, 0.0f, width, getHeight(), this.f3166);
        } else if (this.f3153 != null && m3701(view, 3)) {
            int intrinsicWidth = this.f3153.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f3168.m110(), 1.0f));
            this.f3153.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f3153.setAlpha((int) (max * 255.0f));
            this.f3153.draw(canvas);
        } else if (this.f3155 != null && m3701(view, 5)) {
            int intrinsicWidth2 = this.f3155.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f3170.m110(), 1.0f));
            this.f3155.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f3155.setAlpha((int) (max2 * 255.0f));
            this.f3155.draw(canvas);
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f3151) {
            return this.f3158;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3183;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3179 = true;
        m3694();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3179 = true;
        m3694();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        f5 f5Var;
        super.onDraw(canvas);
        if (!this.f3178 || this.f3183 == null) {
            return;
        }
        int m3076 = (Build.VERSION.SDK_INT < 21 || (f5Var = this.f3157) == null) ? 0 : f5Var.m3076();
        if (m3076 > 0) {
            this.f3183.setBounds(0, 0, getWidth(), m3076);
            this.f3183.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            a0.c r1 = r6.f3168
            boolean r1 = r1.m102(r7)
            a0.c r2 = r6.f3170
            boolean r2 = r2.m102(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            a0.c r7 = r6.f3168
            boolean r7 = r7.m93(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f3172
            r7.m3745()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f3174
            r7.m3745()
            goto L36
        L31:
            r6.m3709(r2)
            r6.f3188 = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3191 = r0
            r6.f3181 = r7
            float r4 = r6.f3164
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            a0.c r4 = r6.f3168
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m106(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.m3698(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.f3188 = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.m3686()
            if (r7 != 0) goto L70
            boolean r7 = r6.f3188
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (i5 != 4 || !m3687()) {
            return super.onKeyDown(i5, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (i5 != 4) {
            return super.onKeyUp(i5, keyEvent);
        }
        View m3721 = m3721();
        if (m3721 != null && m3723(m3721) == 0) {
            m3708();
        }
        return m3721 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        f5 m2875;
        float f5;
        int i9;
        this.f3177 = true;
        int i10 = i7 - i5;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (m3698(childAt)) {
                    int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i12, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i12, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m3701(childAt, 3)) {
                        float f6 = measuredWidth;
                        i9 = (-measuredWidth) + ((int) (eVar.f3195 * f6));
                        f5 = (measuredWidth + i9) / f6;
                    } else {
                        float f7 = measuredWidth;
                        f5 = (i10 - r11) / f7;
                        i9 = i10 - ((int) (eVar.f3195 * f7));
                    }
                    boolean z6 = f5 != eVar.f3195;
                    int i13 = eVar.f3194 & 112;
                    if (i13 == 16) {
                        int i14 = i8 - i6;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight;
                            }
                        }
                        childAt.layout(i9, i15, measuredWidth + i9, measuredHeight + i15);
                    } else if (i13 != 80) {
                        int i19 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i9, i19, measuredWidth + i9, measuredHeight + i19);
                    } else {
                        int i20 = i8 - i6;
                        childAt.layout(i9, (i20 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i9, i20 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z6) {
                        m3729(childAt, f5);
                    }
                    int i21 = eVar.f3195 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i21) {
                        childAt.setVisibility(i21);
                    }
                }
            }
        }
        if (f3152 && (m2875 = f1.m2875(this)) != null) {
            i0 m3072 = m2875.m3072();
            a0.c cVar = this.f3168;
            cVar.m98(Math.max(cVar.m109(), m3072.f2698));
            a0.c cVar2 = this.f3170;
            cVar2.m98(Math.max(cVar2.m109(), m3072.f2700));
        }
        this.f3177 = false;
        this.f3179 = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z5 = this.f3157 != null && f1.m2891(this);
        int m2834 = f1.m2834(this);
        int childCount = getChildCount();
        boolean z6 = false;
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z5) {
                    int m3298 = r.m3298(eVar.f3194, m2834);
                    if (f1.m2891(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f5 f5Var = this.f3157;
                            if (m3298 == 3) {
                                f5Var = f5Var.m3082(f5Var.m3074(), f5Var.m3076(), 0, f5Var.m3073());
                            } else if (m3298 == 5) {
                                f5Var = f5Var.m3082(0, f5Var.m3076(), f5Var.m3075(), f5Var.m3073());
                            }
                            f1.m2872(childAt, f5Var);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        f5 f5Var2 = this.f3157;
                        if (m3298 == 3) {
                            f5Var2 = f5Var2.m3082(f5Var2.m3074(), f5Var2.m3076(), 0, f5Var2.m3073());
                        } else if (m3298 == 5) {
                            f5Var2 = f5Var2.m3082(0, f5Var2.m3076(), f5Var2.m3075(), f5Var2.m3073());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = f5Var2.m3074();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = f5Var2.m3076();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = f5Var2.m3075();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = f5Var2.m3073();
                    }
                }
                if (m3698(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else {
                    if (!m3700(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i7 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f3151) {
                        float m2904 = f1.m2904(childAt);
                        float f5 = this.f3158;
                        if (m2904 != f5) {
                            f1.m2840(childAt, f5);
                        }
                    }
                    int m3726 = m3726(childAt) & 7;
                    boolean z8 = m3726 == 3;
                    if ((z8 && z6) || (!z8 && z7)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m3692(m3726) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z8) {
                        z6 = true;
                    } else {
                        z7 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i5, this.f3160 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i6, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View m3718;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        int i5 = fVar.f3198;
        if (i5 != 0 && (m3718 = m3718(i5)) != null) {
            m3714(m3718);
        }
        int i6 = fVar.f3199;
        if (i6 != 3) {
            m3719(i6, 3);
        }
        int i7 = fVar.f3200;
        if (i7 != 3) {
            m3719(i7, 5);
        }
        int i8 = fVar.f3201;
        if (i8 != 3) {
            m3719(i8, 8388611);
        }
        int i9 = fVar.f3202;
        if (i9 != 3) {
            m3719(i9, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        m3690();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            e eVar = (e) getChildAt(i5).getLayoutParams();
            int i6 = eVar.f3197;
            boolean z5 = i6 == 1;
            boolean z6 = i6 == 2;
            if (z5 || z6) {
                fVar.f3198 = eVar.f3194;
                break;
            }
        }
        fVar.f3199 = this.f3184;
        fVar.f3200 = this.f3185;
        fVar.f3201 = this.f3186;
        fVar.f3202 = this.f3187;
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            a0.c r0 = r6.f3168
            r0.m95(r7)
            a0.c r0 = r6.f3170
            r0.m95(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.m3709(r2)
            r6.f3188 = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            a0.c r3 = r6.f3168
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m106(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.m3698(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.f3191
            float r0 = r0 - r3
            float r3 = r6.f3181
            float r7 = r7 - r3
            a0.c r3 = r6.f3168
            int r3 = r3.m111()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.m3720()
            if (r7 == 0) goto L5d
            int r7 = r6.m3723(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.m3709(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3191 = r0
            r6.f3181 = r7
            r6.f3188 = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (z5) {
            m3709(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3177) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f5) {
        this.f3158 = f5;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (m3700(childAt)) {
                f1.m2840(childAt, this.f3158);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.f3189;
        if (dVar2 != null) {
            m3716(dVar2);
        }
        if (dVar != null) {
            m3697(dVar);
        }
        this.f3189 = dVar;
    }

    public void setDrawerLockMode(int i5) {
        m3719(i5, 3);
        m3719(i5, 5);
    }

    public void setScrimColor(int i5) {
        this.f3162 = i5;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3183 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i5) {
        this.f3183 = new ColorDrawable(i5);
        invalidate();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    void m3694() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View m3721 = m3721();
            OnBackInvokedDispatcher m3732 = b.m3732(this);
            boolean z5 = m3721 != null && m3732 != null && m3723(m3721) == 0 && f1.m2903(this);
            if (z5 && this.f3182 == null) {
                if (this.f3180 == null) {
                    this.f3180 = b.m3733(new Runnable() { // from class: androidx.drawerlayout.widget.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3207.m3708();
                        }
                    });
                }
                b.m3734(m3732, this.f3180);
                this.f3182 = m3732;
                return;
            }
            if (z5 || (onBackInvokedDispatcher = this.f3182) == null) {
                return;
            }
            b.m3735(onBackInvokedDispatcher, this.f3180);
            this.f3182 = null;
        }
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    void m3695(int i5, View view) {
        int i6;
        int m104 = this.f3168.m104();
        int m1042 = this.f3170.m104();
        if (m104 == 1 || m1042 == 1) {
            i6 = 1;
        } else {
            i6 = 2;
            if (m104 != 2 && m1042 != 2) {
                i6 = 0;
            }
        }
        if (view != null && i5 == 0) {
            float f5 = ((e) view.getLayoutParams()).f3195;
            if (f5 == 0.0f) {
                m3711(view);
            } else if (f5 == 1.0f) {
                m3713(view);
            }
        }
        if (i6 != this.f3176) {
            this.f3176 = i6;
            List<d> list = this.f3190;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3190.get(size).mo3736(i6);
                }
            }
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public boolean m3696(int i5) {
        View m3718 = m3718(i5);
        if (m3718 != null) {
            return m3702(m3718);
        }
        return false;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m3697(d dVar) {
        if (this.f3190 == null) {
            this.f3190 = new ArrayList();
        }
        this.f3190.add(dVar);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    boolean m3698(View view) {
        return ((e) view.getLayoutParams()).f3194 == 0;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m3699() {
        if (this.f3188) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f3188 = true;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    boolean m3700(View view) {
        int m3298 = r.m3298(((e) view.getLayoutParams()).f3194, f1.m2834(view));
        return ((m3298 & 3) == 0 && (m3298 & 5) == 0) ? false : true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    boolean m3701(View view, int i5) {
        return (m3726(view) & i5) == i5;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public boolean m3702(View view) {
        if (m3700(view)) {
            return (((e) view.getLayoutParams()).f3197 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m3703(int i5) {
        m3704(i5, true);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m3704(int i5, boolean z5) {
        View m3718 = m3718(i5);
        if (m3718 != null) {
            m3706(m3718, z5);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m3692(i5));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m3705(View view) {
        m3706(view, true);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m3706(View view, boolean z5) {
        if (!m3700(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f3179) {
            eVar.f3195 = 0.0f;
            eVar.f3197 = 0;
        } else if (z5) {
            eVar.f3197 |= 4;
            if (m3701(view, 3)) {
                this.f3168.m107(view, -view.getWidth(), view.getTop());
            } else {
                this.f3170.m107(view, getWidth(), view.getTop());
            }
        } else {
            m3707(view, 0.0f);
            m3695(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m3707(View view, float f5) {
        float m3727 = m3727(view);
        float width = view.getWidth();
        int i5 = ((int) (width * f5)) - ((int) (m3727 * width));
        if (!m3701(view, 3)) {
            i5 = -i5;
        }
        view.offsetLeftAndRight(i5);
        m3729(view, f5);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m3708() {
        m3709(false);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void m3709(boolean z5) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (m3700(childAt) && (!z5 || eVar.f3196)) {
                z6 |= m3701(childAt, 3) ? this.f3168.m107(childAt, -childAt.getWidth(), childAt.getTop()) : this.f3170.m107(childAt, getWidth(), childAt.getTop());
                eVar.f3196 = false;
            }
        }
        this.f3172.m3745();
        this.f3174.m3745();
        if (z6) {
            invalidate();
        }
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public void m3710(int i5, boolean z5) {
        View m3718 = m3718(i5);
        if (m3718 != null) {
            m3724(m3718, z5);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m3692(i5));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    void m3711(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f3197 & 1) == 1) {
            eVar.f3197 = 0;
            List<d> list = this.f3190;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3190.get(size).mo3739(view);
                }
            }
            m3679(view, false);
            m3678(view);
            m3694();
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public void m3712(int i5) {
        m3710(i5, true);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m3713(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f3197 & 1) == 0) {
            eVar.f3197 = 1;
            List<d> list = this.f3190;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3190.get(size).mo3738(view);
                }
            }
            m3679(view, true);
            m3678(view);
            m3694();
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public void m3714(View view) {
        m3724(view, true);
    }

    /* renamed from: י, reason: contains not printable characters */
    void m3715(View view, float f5) {
        List<d> list = this.f3190;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3190.get(size).mo3737(view, f5);
            }
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    public void m3716(d dVar) {
        List<d> list = this.f3190;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public boolean m3717(View view) {
        if (m3700(view)) {
            return ((e) view.getLayoutParams()).f3195 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    View m3718(int i5) {
        int m3298 = r.m3298(i5, f1.m2834(this)) & 7;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if ((m3726(childAt) & 7) == m3298) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public void m3719(int i5, int i6) {
        View m3718;
        int m3298 = r.m3298(i6, f1.m2834(this));
        if (i6 == 3) {
            this.f3184 = i5;
        } else if (i6 == 5) {
            this.f3185 = i5;
        } else if (i6 == 8388611) {
            this.f3186 = i5;
        } else if (i6 == 8388613) {
            this.f3187 = i5;
        }
        if (i5 != 0) {
            (m3298 == 3 ? this.f3168 : this.f3170).m89();
        }
        if (i5 != 1) {
            if (i5 == 2 && (m3718 = m3718(m3298)) != null) {
                m3714(m3718);
                return;
            }
            return;
        }
        View m37182 = m3718(m3298);
        if (m37182 != null) {
            m3705(m37182);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    View m3720() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((((e) childAt.getLayoutParams()).f3197 & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    View m3721() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (m3700(childAt) && m3717(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public int m3722(int i5) {
        int m2834 = f1.m2834(this);
        if (i5 == 3) {
            int i6 = this.f3184;
            if (i6 != 3) {
                return i6;
            }
            int i7 = m2834 == 0 ? this.f3186 : this.f3187;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i5 == 5) {
            int i8 = this.f3185;
            if (i8 != 3) {
                return i8;
            }
            int i9 = m2834 == 0 ? this.f3187 : this.f3186;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i5 == 8388611) {
            int i10 = this.f3186;
            if (i10 != 3) {
                return i10;
            }
            int i11 = m2834 == 0 ? this.f3184 : this.f3185;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i5 != 8388613) {
            return 0;
        }
        int i12 = this.f3187;
        if (i12 != 3) {
            return i12;
        }
        int i13 = m2834 == 0 ? this.f3185 : this.f3184;
        if (i13 != 3) {
            return i13;
        }
        return 0;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int m3723(View view) {
        if (m3700(view)) {
            return m3722(((e) view.getLayoutParams()).f3194);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public void m3724(View view, boolean z5) {
        if (!m3700(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f3179) {
            eVar.f3195 = 1.0f;
            eVar.f3197 = 1;
            m3679(view, true);
            m3678(view);
            m3694();
        } else if (z5) {
            eVar.f3197 |= 2;
            if (m3701(view, 3)) {
                this.f3168.m107(view, 0, view.getTop());
            } else {
                this.f3170.m107(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m3707(view, 1.0f);
            m3695(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public CharSequence m3725(int i5) {
        int m3298 = r.m3298(i5, f1.m2834(this));
        if (m3298 == 3) {
            return this.f3154;
        }
        if (m3298 == 5) {
            return this.f3159;
        }
        return null;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    int m3726(View view) {
        return r.m3298(((e) view.getLayoutParams()).f3194, f1.m2834(this));
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    float m3727(View view) {
        return ((e) view.getLayoutParams()).f3195;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m3728(f5 f5Var, boolean z5) {
        this.f3157 = f5Var;
        this.f3178 = z5;
        setWillNotDraw(!z5 && getBackground() == null);
        requestLayout();
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    void m3729(View view, float f5) {
        e eVar = (e) view.getLayoutParams();
        if (f5 == eVar.f3195) {
            return;
        }
        eVar.f3195 = f5;
        m3715(view, f5);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f3156 = new c();
        this.f3162 = -1728053248;
        this.f3166 = new Paint();
        this.f3179 = true;
        this.f3184 = 3;
        this.f3185 = 3;
        this.f3186 = 3;
        this.f3187 = 3;
        this.f3161 = null;
        this.f3165 = null;
        this.f3163 = null;
        this.f3169 = null;
        this.f3175 = new o0() { // from class: androidx.drawerlayout.widget.b
            @Override // androidx.core.view.accessibility.o0
            /* renamed from: ʻ */
            public final boolean mo2731(View view, o0.a aVar) {
                return this.f3208.m3683(view, aVar);
            }
        };
        setDescendantFocusability(262144);
        float f5 = getResources().getDisplayMetrics().density;
        this.f3160 = (int) ((64.0f * f5) + 0.5f);
        float f6 = f5 * 400.0f;
        h hVar = new h(3);
        this.f3172 = hVar;
        h hVar2 = new h(5);
        this.f3174 = hVar2;
        a0.c m80 = a0.c.m80(this, 1.0f, hVar);
        this.f3168 = m80;
        m80.m97(1);
        m80.m100(f6);
        hVar.m3746(m80);
        a0.c m802 = a0.c.m80(this, 1.0f, hVar2);
        this.f3170 = m802;
        m802.m97(2);
        m802.m100(f6);
        hVar2.m3746(m802);
        setFocusableInTouchMode(true);
        f1.m2843(this, 1);
        f1.m2830(this, new a());
        setMotionEventSplittingEnabled(false);
        if (f1.m2891(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                f1.m2846(this, new u0() { // from class: androidx.drawerlayout.widget.c
                    @Override // androidx.core.view.u0
                    /* renamed from: ʻ */
                    public final f5 mo691(View view, f5 f5Var) {
                        return DrawerLayout.m3682(view, f5Var);
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3150);
                try {
                    this.f3183 = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f3183 = null;
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b0.c.f4802, i5, 0);
        try {
            int i6 = b0.c.f4803;
            if (obtainStyledAttributes2.hasValue(i6)) {
                this.f3158 = obtainStyledAttributes2.getDimension(i6, 0.0f);
            } else {
                this.f3158 = getResources().getDimension(b0.b.f4801);
            }
            obtainStyledAttributes2.recycle();
            this.f3167 = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i5) {
        this.f3183 = i5 != 0 ? androidx.core.content.a.m1993(getContext(), i5) : null;
        invalidate();
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f3194;

        /* renamed from: ʼ, reason: contains not printable characters */
        float f3195;

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f3196;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f3197;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3194 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3148);
            this.f3194 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(int i5, int i6) {
            super(i5, i6);
            this.f3194 = 0;
        }

        public e(int i5, int i6, int i7) {
            this(i5, i6);
            this.f3194 = i7;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f3194 = 0;
            this.f3194 = eVar.f3194;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3194 = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3194 = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    protected static class f extends androidx.customview.view.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        int f3198;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f3199;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f3200;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f3201;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f3202;

        class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public f[] newArray(int i5) {
                return new f[i5];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3198 = 0;
            this.f3198 = parcel.readInt();
            this.f3199 = parcel.readInt();
            this.f3200 = parcel.readInt();
            this.f3201 = parcel.readInt();
            this.f3202 = parcel.readInt();
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f3198);
            parcel.writeInt(this.f3199);
            parcel.writeInt(this.f3200);
            parcel.writeInt(this.f3201);
            parcel.writeInt(this.f3202);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f3198 = 0;
        }
    }

    public static abstract class g implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        /* renamed from: ʻ */
        public void mo3736(int i5) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        /* renamed from: ʼ */
        public void mo3737(View view, float f5) {
        }
    }
}
