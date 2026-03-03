package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.f5;
import androidx.recyclerview.widget.RecyclerView;

@SuppressLint({"UnknownNullness"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class ActionBarOverlayLayout extends ViewGroup implements v1, androidx.core.view.s0, androidx.core.view.q0, androidx.core.view.r0 {

    /* renamed from: ˆˆ, reason: contains not printable characters */
    static final int[] f989 = {e.a.f6886, R.attr.windowContentOverlay};

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private OverScroller f990;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    final AnimatorListenerAdapter f991;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    ViewPropertyAnimator f992;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f993;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private final Runnable f994;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f995;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private final Runnable f996;

    /* renamed from: ˆ, reason: contains not printable characters */
    private ContentFrameLayout f997;

    /* renamed from: ˈ, reason: contains not printable characters */
    ActionBarContainer f998;

    /* renamed from: ˉ, reason: contains not printable characters */
    private w1 f999;

    /* renamed from: ˊ, reason: contains not printable characters */
    private Drawable f1000;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f1001;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f1002;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f1003;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f1004;

    /* renamed from: י, reason: contains not printable characters */
    boolean f1005;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f1006;

    /* renamed from: ــ, reason: contains not printable characters */
    private final androidx.core.view.t0 f1007;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f1008;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final Rect f1009;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private f5 f1010;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final Rect f1011;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private d f1012;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private final Rect f1013;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private final Rect f1014;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private final Rect f1015;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final Rect f1016;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private final Rect f1017;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private f5 f1018;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private f5 f1019;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private f5 f1020;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f992 = null;
            actionBarOverlayLayout.f1005 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f992 = null;
            actionBarOverlayLayout.f1005 = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1032();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f992 = actionBarOverlayLayout.f998.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f991);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1032();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f992 = actionBarOverlayLayout.f998.animate().translationY(-ActionBarOverlayLayout.this.f998.getHeight()).setListener(ActionBarOverlayLayout.this.f991);
        }
    }

    public interface d {
        void onWindowVisibilityChanged(int i5);

        /* renamed from: ʻ */
        void mo548();

        /* renamed from: ʼ */
        void mo549();

        /* renamed from: ʽ */
        void mo550();

        /* renamed from: ʾ */
        void mo552(boolean z5);

        /* renamed from: ʿ */
        void mo554();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i5, int i6) {
            super(i5, i6);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f995 = 0;
        this.f1009 = new Rect();
        this.f1011 = new Rect();
        this.f1013 = new Rect();
        this.f1014 = new Rect();
        this.f1015 = new Rect();
        this.f1016 = new Rect();
        this.f1017 = new Rect();
        f5 f5Var = f5.f2962;
        this.f1018 = f5Var;
        this.f1019 = f5Var;
        this.f1020 = f5Var;
        this.f1010 = f5Var;
        this.f991 = new a();
        this.f996 = new b();
        this.f994 = new c();
        m1016(context);
        this.f1007 = new androidx.core.view.t0(this);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m1013() {
        m1032();
        this.f994.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1014(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m1014(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: י, reason: contains not printable characters */
    private w1 m1015(View view) {
        if (view instanceof w1) {
            return (w1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m1016(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f989);
        this.f993 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1000 = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1001 = context.getApplicationInfo().targetSdkVersion < 19;
        this.f990 = new OverScroller(context);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m1017() {
        m1032();
        postDelayed(this.f994, 600L);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m1018() {
        m1032();
        postDelayed(this.f996, 600L);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m1019() {
        m1032();
        this.f996.run();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean m1020(float f5) {
        this.f990.fling(0, 0, 0, (int) f5, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.f990.getFinalY() > this.f998.getHeight();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1000 == null || this.f1001) {
            return;
        }
        int bottom = this.f998.getVisibility() == 0 ? (int) (this.f998.getBottom() + this.f998.getTranslationY() + 0.5f) : 0;
        this.f1000.setBounds(0, bottom, getWidth(), this.f1000.getIntrinsicHeight() + bottom);
        this.f1000.draw(canvas);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m1034();
        boolean m1014 = m1014(this.f998, rect, true, true, false, true);
        this.f1014.set(rect);
        p3.m1476(this, this.f1014, this.f1009);
        if (!this.f1015.equals(this.f1014)) {
            this.f1015.set(this.f1014);
            m1014 = true;
        }
        if (!this.f1011.equals(this.f1009)) {
            this.f1011.set(this.f1009);
            m1014 = true;
        }
        if (m1014) {
            requestLayout();
        }
        return true;
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f998;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1007.m3319();
    }

    public CharSequence getTitle() {
        m1034();
        return this.f999.getTitle();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1034();
        f5 m3064 = f5.m3064(windowInsets, this);
        boolean m1014 = m1014(this.f998, new Rect(m3064.m3074(), m3064.m3076(), m3064.m3075(), m3064.m3073()), true, true, false, true);
        androidx.core.view.f1.m2870(this, m3064, this.f1009);
        Rect rect = this.f1009;
        f5 m3079 = m3064.m3079(rect.left, rect.top, rect.right, rect.bottom);
        this.f1018 = m3079;
        boolean z5 = true;
        if (!this.f1019.equals(m3079)) {
            this.f1019 = this.f1018;
            m1014 = true;
        }
        if (this.f1011.equals(this.f1009)) {
            z5 = m1014;
        } else {
            this.f1011.set(this.f1009);
        }
        if (z5) {
            requestLayout();
        }
        return m3064.m3065().m3067().m3066().m3087();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1016(getContext());
        androidx.core.view.f1.m2827(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1032();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int measuredHeight;
        m1034();
        measureChildWithMargins(this.f998, i5, 0, i6, 0);
        e eVar = (e) this.f998.getLayoutParams();
        int max = Math.max(0, this.f998.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f998.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f998.getMeasuredState());
        boolean z5 = (androidx.core.view.f1.m2895(this) & 256) != 0;
        if (z5) {
            measuredHeight = this.f993;
            if (this.f1003 && this.f998.getTabContainer() != null) {
                measuredHeight += this.f993;
            }
        } else {
            measuredHeight = this.f998.getVisibility() != 8 ? this.f998.getMeasuredHeight() : 0;
        }
        this.f1013.set(this.f1009);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 21) {
            this.f1020 = this.f1018;
        } else {
            this.f1016.set(this.f1014);
        }
        if (!this.f1002 && !z5) {
            Rect rect = this.f1013;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i7 >= 21) {
                this.f1020 = this.f1020.m3079(0, measuredHeight, 0, 0);
            }
        } else if (i7 >= 21) {
            this.f1020 = new f5.b(this.f1020).m3092(androidx.core.graphics.i0.m2286(this.f1020.m3074(), this.f1020.m3076() + measuredHeight, this.f1020.m3075(), this.f1020.m3073() + 0)).m3089();
        } else {
            Rect rect2 = this.f1016;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m1014(this.f997, this.f1013, true, true, true, true);
        if (i7 >= 21 && !this.f1010.equals(this.f1020)) {
            f5 f5Var = this.f1020;
            this.f1010 = f5Var;
            androidx.core.view.f1.m2872(this.f997, f5Var);
        } else if (i7 < 21 && !this.f1017.equals(this.f1016)) {
            this.f1017.set(this.f1016);
            this.f997.m1066(this.f1016);
        }
        measureChildWithMargins(this.f997, i5, 0, i6, 0);
        e eVar2 = (e) this.f997.getLayoutParams();
        int max3 = Math.max(max, this.f997.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f997.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f997.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i5, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i6, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedFling(View view, float f5, float f6, boolean z5) {
        if (!this.f1004 || !z5) {
            return false;
        }
        if (m1020(f6)) {
            m1013();
        } else {
            m1019();
        }
        this.f1005 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedPreFling(View view, float f5, float f6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.core.view.r0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        onNestedScroll(view, i5, i6, i7, i8, i9);
    }

    @Override // androidx.core.view.q0
    public void onNestedScrollAccepted(View view, View view2, int i5, int i6) {
        if (i6 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // androidx.core.view.q0
    public boolean onStartNestedScroll(View view, View view2, int i5, int i6) {
        return i6 == 0 && onStartNestedScroll(view, view2, i5);
    }

    @Override // androidx.core.view.q0
    public void onStopNestedScroll(View view, int i5) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i5) {
        super.onWindowSystemUiVisibilityChanged(i5);
        m1034();
        int i6 = this.f1008 ^ i5;
        this.f1008 = i5;
        boolean z5 = (i5 & 4) == 0;
        boolean z6 = (i5 & 256) != 0;
        d dVar = this.f1012;
        if (dVar != null) {
            dVar.mo552(!z6);
            if (z5 || !z6) {
                this.f1012.mo548();
            } else {
                this.f1012.mo554();
            }
        }
        if ((i6 & 256) == 0 || this.f1012 == null) {
            return;
        }
        androidx.core.view.f1.m2827(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        this.f995 = i5;
        d dVar = this.f1012;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i5);
        }
    }

    public void setActionBarHideOffset(int i5) {
        m1032();
        this.f998.setTranslationY(-Math.max(0, Math.min(i5, this.f998.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1012 = dVar;
        if (getWindowToken() != null) {
            this.f1012.onWindowVisibilityChanged(this.f995);
            int i5 = this.f1008;
            if (i5 != 0) {
                onWindowSystemUiVisibilityChanged(i5);
                androidx.core.view.f1.m2827(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f1003 = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f1004) {
            this.f1004 = z5;
            if (z5) {
                return;
            }
            m1032();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i5) {
        m1034();
        this.f999.setIcon(i5);
    }

    public void setLogo(int i5) {
        m1034();
        this.f999.mo1353(i5);
    }

    public void setOverlayMode(boolean z5) {
        this.f1002 = z5;
        this.f1001 = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // androidx.appcompat.widget.v1
    public void setWindowCallback(Window.Callback callback) {
        m1034();
        this.f999.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.v1
    public void setWindowTitle(CharSequence charSequence) {
        m1034();
        this.f999.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo1021(Menu menu, m.a aVar) {
        m1034();
        this.f999.mo1331(menu, aVar);
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean mo1022() {
        m1034();
        return this.f999.mo1333();
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo1023() {
        m1034();
        this.f999.mo1335();
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean mo1024() {
        m1034();
        return this.f999.mo1337();
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean mo1025() {
        m1034();
        return this.f999.mo1338();
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean mo1026() {
        m1034();
        return this.f999.mo1340();
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean mo1027() {
        m1034();
        return this.f999.mo1341();
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo1028(int i5) {
        m1034();
        if (i5 == 2) {
            this.f999.mo1357();
        } else if (i5 == 5) {
            this.f999.mo1358();
        } else {
            if (i5 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.v1
    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo1029() {
        m1034();
        this.f999.mo1342();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: ˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: ˑ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m1032() {
        removeCallbacks(this.f996);
        removeCallbacks(this.f994);
        ViewPropertyAnimator viewPropertyAnimator = this.f992;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m1033() {
        return this.f1002;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m1034() {
        if (this.f997 == null) {
            this.f997 = (ContentFrameLayout) findViewById(e.f.f6999);
            this.f998 = (ActionBarContainer) findViewById(e.f.f7001);
            this.f999 = m1015(findViewById(e.f.f6997));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.q0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr, int i7) {
        if (i7 == 0) {
            onNestedPreScroll(view, i5, i6, iArr);
        }
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            onNestedScroll(view, i5, i6, i7, i8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        this.f1007.m3320(view, view2, i5);
        this.f1006 = getActionBarHideOffset();
        m1032();
        d dVar = this.f1012;
        if (dVar != null) {
            dVar.mo549();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        if ((i5 & 2) == 0 || this.f998.getVisibility() != 0) {
            return false;
        }
        return this.f1004;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onStopNestedScroll(View view) {
        if (this.f1004 && !this.f1005) {
            if (this.f1006 <= this.f998.getHeight()) {
                m1018();
            } else {
                m1017();
            }
        }
        d dVar = this.f1012;
        if (dVar != null) {
            dVar.mo550();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        int i9 = this.f1006 + i6;
        this.f1006 = i9;
        setActionBarHideOffset(i9);
    }

    public void setIcon(Drawable drawable) {
        m1034();
        this.f999.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i5) {
    }
}
