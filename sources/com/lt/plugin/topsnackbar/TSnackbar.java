package com.lt.plugin.topsnackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.f1;
import androidx.core.view.s4;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.lt.plugin.topsnackbar.b;
import n3.e1;
import n3.j1;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class TSnackbar {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final Handler f6741 = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ViewGroup f6742;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Context f6743;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final SnackbarLayout f6744;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f6745;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final b.InterfaceC0096b f6746 = new b();

    public static class SnackbarLayout extends LinearLayout {

        /* renamed from: ʾ, reason: contains not printable characters */
        private TextView f6747;

        /* renamed from: ʿ, reason: contains not printable characters */
        private Button f6748;

        /* renamed from: ˆ, reason: contains not printable characters */
        private int f6749;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final int f6750;

        /* renamed from: ˉ, reason: contains not printable characters */
        private b f6751;

        /* renamed from: ˊ, reason: contains not printable characters */
        private a f6752;

        interface a {
            void onViewAttachedToWindow(View view);

            void onViewDetachedFromWindow(View view);
        }

        interface b {
            /* renamed from: ʻ, reason: contains not printable characters */
            void mo8070(View view, int i5, int i6, int i7, int i8);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f9859);
            this.f6749 = obtainStyledAttributes.getDimensionPixelSize(j1.f9860, -1);
            this.f6750 = obtainStyledAttributes.getDimensionPixelSize(j1.f9862, -1);
            if (obtainStyledAttributes.hasValue(j1.f9861)) {
                f1.m2840(this, obtainStyledAttributes.getDimensionPixelSize(r0, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(n3.f1.f9735, this);
            f1.m2833(this, 1);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private static void m8066(View view, int i5, int i6) {
            if (f1.m2810(view)) {
                f1.m2847(view, f1.m2871(view), i5, f1.m2867(view), i6);
            } else {
                view.setPadding(view.getPaddingLeft(), i5, view.getPaddingRight(), i6);
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean m8067(int i5, int i6, int i7) {
            boolean z5;
            if (i5 != getOrientation()) {
                setOrientation(i5);
                z5 = true;
            } else {
                z5 = false;
            }
            if (this.f6747.getPaddingTop() == i6 && this.f6747.getPaddingBottom() == i7) {
                return z5;
            }
            m8066(this.f6747, i6, i7);
            return true;
        }

        Button getActionView() {
            return this.f6748;
        }

        TextView getMessageView() {
            return this.f6747;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            a aVar = this.f6752;
            if (aVar != null) {
                aVar.onViewAttachedToWindow(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            a aVar = this.f6752;
            if (aVar != null) {
                aVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.f6747 = (TextView) findViewById(e1.f9731);
            this.f6748 = (Button) findViewById(e1.f9730);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
            super.onLayout(z5, i5, i6, i7, i8);
            b bVar = this.f6751;
            if (bVar != null) {
                bVar.mo8070(this, i5, i6, i7, i8);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                super.onMeasure(r8, r9)
                int r0 = r7.f6749
                if (r0 <= 0) goto L18
                int r0 = r7.getMeasuredWidth()
                int r1 = r7.f6749
                if (r0 <= r1) goto L18
                r8 = 1073741824(0x40000000, float:2.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
                super.onMeasure(r8, r9)
            L18:
                android.content.res.Resources r0 = r7.getResources()
                int r1 = n3.c1.f9718
                int r0 = r0.getDimensionPixelSize(r1)
                android.content.res.Resources r1 = r7.getResources()
                int r2 = n3.c1.f9717
                int r1 = r1.getDimensionPixelSize(r2)
                android.widget.TextView r2 = r7.f6747
                android.text.Layout r2 = r2.getLayout()
                int r2 = r2.getLineCount()
                r3 = 0
                r4 = 1
                if (r2 <= r4) goto L3c
                r2 = 1
                goto L3d
            L3c:
                r2 = 0
            L3d:
                if (r2 == 0) goto L56
                int r5 = r7.f6750
                if (r5 <= 0) goto L56
                android.widget.Button r5 = r7.f6748
                int r5 = r5.getMeasuredWidth()
                int r6 = r7.f6750
                if (r5 <= r6) goto L56
                int r1 = r0 - r1
                boolean r0 = r7.m8067(r4, r0, r1)
                if (r0 == 0) goto L61
                goto L60
            L56:
                if (r2 == 0) goto L59
                goto L5a
            L59:
                r0 = r1
            L5a:
                boolean r0 = r7.m8067(r3, r0, r0)
                if (r0 == 0) goto L61
            L60:
                r3 = 1
            L61:
                if (r3 == 0) goto L66
                super.onMeasure(r8, r9)
            L66:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lt.plugin.topsnackbar.TSnackbar.SnackbarLayout.onMeasure(int, int):void");
        }

        void setOnAttachStateChangeListener(a aVar) {
            this.f6752 = aVar;
        }

        void setOnLayoutChangeListener(b bVar) {
            this.f6751 = bVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m8068(int i5, int i6) {
            this.f6747.setAlpha(0.0f);
            long j5 = i6;
            long j6 = i5;
            f1.m2864(this.f6747).m3284(1.0f).m3287(j5).m3290(j6).m3292();
            if (this.f6748.getVisibility() == 0) {
                this.f6748.setAlpha(0.0f);
                f1.m2864(this.f6748).m3284(1.0f).m3287(j5).m3290(j6).m3292();
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m8069(int i5, int i6) {
            this.f6747.setAlpha(1.0f);
            long j5 = i6;
            long j6 = i5;
            f1.m2864(this.f6747).m3284(0.0f).m3287(j5).m3290(j6).m3292();
            if (this.f6748.getVisibility() == 0) {
                this.f6748.setAlpha(1.0f);
                f1.m2864(this.f6748).m3284(0.0f).m3287(j5).m3290(j6).m3292();
            }
        }
    }

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 0) {
                ((TSnackbar) message.obj).m8065();
                return true;
            }
            if (i5 != 1) {
                return false;
            }
            ((TSnackbar) message.obj).m8056(message.arg1);
            return true;
        }
    }

    class b implements b.InterfaceC0096b {
        b() {
        }

        @Override // com.lt.plugin.topsnackbar.b.InterfaceC0096b
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo8071() {
            TSnackbar.f6741.sendMessage(TSnackbar.f6741.obtainMessage(0, TSnackbar.this));
        }

        @Override // com.lt.plugin.topsnackbar.b.InterfaceC0096b
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo8072(int i5) {
            TSnackbar.f6741.sendMessage(TSnackbar.f6741.obtainMessage(1, i5, 0, TSnackbar.this));
        }
    }

    class c implements SwipeDismissBehavior.OnDismissListener {
        c() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDismiss(View view) {
            TSnackbar.this.m8050(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDragStateChanged(int i5) {
            if (i5 == 0) {
                com.lt.plugin.topsnackbar.b.m8076().m8088(TSnackbar.this.f6746);
            } else if (i5 == 1 || i5 == 2) {
                com.lt.plugin.topsnackbar.b.m8076().m8082(TSnackbar.this.f6746);
            }
        }
    }

    class e implements SnackbarLayout.b {
        e() {
        }

        @Override // com.lt.plugin.topsnackbar.TSnackbar.SnackbarLayout.b
        /* renamed from: ʻ */
        public void mo8070(View view, int i5, int i6, int i7, int i8) {
            TSnackbar.this.m8048();
            TSnackbar.this.f6744.setOnLayoutChangeListener(null);
        }
    }

    class f extends s4 {
        f() {
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ */
        public void mo561(View view) {
            TSnackbar.m8047(TSnackbar.this);
            com.lt.plugin.topsnackbar.b.m8076().m8087(TSnackbar.this.f6746);
        }

        @Override // androidx.core.view.s4, androidx.core.view.r4
        /* renamed from: ʽ */
        public void mo694(View view) {
            TSnackbar.this.f6744.m8068(70, 180);
        }
    }

    class g extends s4 {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ int f6759;

        g(int i5) {
            this.f6759 = i5;
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ */
        public void mo561(View view) {
            TSnackbar.this.m8054(this.f6759);
        }

        @Override // androidx.core.view.s4, androidx.core.view.r4
        /* renamed from: ʽ */
        public void mo694(View view) {
            TSnackbar.this.f6744.m8069(0, 180);
        }
    }

    final class h extends SwipeDismissBehavior<SnackbarLayout> {
        h() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return view instanceof SnackbarLayout;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
            if (coordinatorLayout.isPointInChildBounds(snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    com.lt.plugin.topsnackbar.b.m8076().m8082(TSnackbar.this.f6746);
                } else if (actionMasked == 1 || actionMasked == 3) {
                    com.lt.plugin.topsnackbar.b.m8076().m8088(TSnackbar.this.f6746);
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, snackbarLayout, motionEvent);
        }
    }

    public static abstract class i {
    }

    private TSnackbar(ViewGroup viewGroup) {
        this.f6742 = viewGroup;
        Context context = viewGroup.getContext();
        this.f6743 = context;
        this.f6744 = (SnackbarLayout) LayoutInflater.from(context).inflate(n3.f1.f9734, viewGroup, false);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static /* synthetic */ i m8047(TSnackbar tSnackbar) {
        tSnackbar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public void m8048() {
        this.f6744.setTranslationY(-r0.getHeight());
        f1.m2864(this.f6744).m3293(0.0f).m3288(com.lt.plugin.topsnackbar.a.f6763).m3287(250L).m3289(new f()).m3292();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m8049(int i5) {
        f1.m2864(this.f6744).m3293(-this.f6744.getHeight()).m3288(com.lt.plugin.topsnackbar.a.f6763).m3287(250L).m3289(new g(i5)).m3292();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m8050(int i5) {
        com.lt.plugin.topsnackbar.b.m8076().m8083(this.f6746, i5);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static ViewGroup m8051(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: י, reason: contains not printable characters */
    private boolean m8052() {
        ViewGroup.LayoutParams layoutParams = this.f6744.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            return false;
        }
        CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) layoutParams).m1896();
        return (m1896 instanceof SwipeDismissBehavior) && ((SwipeDismissBehavior) m1896).getDragState() != 0;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static TSnackbar m8053(View view, CharSequence charSequence, int i5) {
        TSnackbar tSnackbar = new TSnackbar(m8051(view));
        tSnackbar.m8061(charSequence);
        tSnackbar.m8060(i5);
        return tSnackbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m8054(int i5) {
        com.lt.plugin.topsnackbar.b.m8076().m8086(this.f6746);
        ViewParent parent = this.f6744.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f6744);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m8055() {
        m8050(3);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    final void m8056(int i5) {
        if (this.f6744.getVisibility() != 0 || m8052()) {
            m8054(i5);
        } else {
            m8049(i5);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m8057() {
        return com.lt.plugin.topsnackbar.b.m8076().m8084(this.f6746);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m8058() {
        return com.lt.plugin.topsnackbar.b.m8076().m8085(this.f6746);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public TSnackbar m8059(int i5) {
        this.f6744.setBackgroundTintList(ColorStateList.valueOf(i5));
        return this;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public TSnackbar m8060(int i5) {
        this.f6745 = i5;
        return this;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public TSnackbar m8061(CharSequence charSequence) {
        this.f6744.getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public TSnackbar m8062(int i5) {
        this.f6744.getMessageView().setTextColor(i5);
        return this;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public TSnackbar m8063(int i5) {
        this.f6744.getMessageView().setMaxLines(i5);
        return this;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m8064() {
        com.lt.plugin.topsnackbar.b.m8076().m8089(this.f6745, this.f6746);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    final void m8065() {
        if (this.f6744.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f6744.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                h hVar = new h();
                hVar.setStartAlphaSwipeDistance(0.1f);
                hVar.setEndAlphaSwipeDistance(0.6f);
                hVar.setSwipeDirection(0);
                hVar.setListener(new c());
                ((CoordinatorLayout.f) layoutParams).m1904(hVar);
            }
            this.f6742.addView(this.f6744);
        }
        this.f6744.setOnAttachStateChangeListener(new d());
        if (f1.m2808(this.f6744)) {
            m8048();
        } else {
            this.f6744.setOnLayoutChangeListener(new e());
        }
    }

    class d implements SnackbarLayout.a {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TSnackbar.this.m8054(3);
            }
        }

        d() {
        }

        @Override // com.lt.plugin.topsnackbar.TSnackbar.SnackbarLayout.a
        public void onViewDetachedFromWindow(View view) {
            if (TSnackbar.this.m8058()) {
                TSnackbar.f6741.post(new a());
            }
        }

        @Override // com.lt.plugin.topsnackbar.TSnackbar.SnackbarLayout.a
        public void onViewAttachedToWindow(View view) {
        }
    }
}
