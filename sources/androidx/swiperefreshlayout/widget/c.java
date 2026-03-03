package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.view.f1;
import androidx.core.view.o0;
import androidx.core.view.p0;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.t0;
import androidx.core.widget.u;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends ViewGroup implements r0, q0, o0, s0 {

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private static final String f4389 = "c";

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private static final int[] f4390 = {R.attr.enabled};

    /* renamed from: ʻʻ, reason: contains not printable characters */
    protected int f4391;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    int f4392;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    int f4393;

    /* renamed from: ʾ, reason: contains not printable characters */
    private View f4394;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private Animation f4395;

    /* renamed from: ʿ, reason: contains not printable characters */
    j f4396;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    androidx.swiperefreshlayout.widget.b f4397;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f4398;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private Animation f4399;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f4400;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private Animation f4401;

    /* renamed from: ˉ, reason: contains not printable characters */
    private float f4402;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private Animation f4403;

    /* renamed from: ˊ, reason: contains not printable characters */
    private float f4404;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private int f4405;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final t0 f4406;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    boolean f4407;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final p0 f4408;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private boolean f4409;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final int[] f4410;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    boolean f4411;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final int[] f4412;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private Animation.AnimationListener f4413;

    /* renamed from: י, reason: contains not printable characters */
    private final int[] f4414;

    /* renamed from: יי, reason: contains not printable characters */
    private final Animation f4415;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f4416;

    /* renamed from: ــ, reason: contains not printable characters */
    private Animation f4417;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f4418;

    /* renamed from: ᐧ, reason: contains not printable characters */
    int f4419;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected int f4420;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private float f4421;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    float f4422;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private float f4423;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f4424;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private final Animation f4425;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f4426;

    /* renamed from: ⁱ, reason: contains not printable characters */
    boolean f4427;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean f4428;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private final DecelerateInterpolator f4429;

    /* renamed from: ﾞ, reason: contains not printable characters */
    androidx.swiperefreshlayout.widget.a f4430;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int f4431;

    /* compiled from: SwipeRefreshLayout.java */
    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            c.this.setAnimationProgress(f5);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    class C0064c extends Animation {
        C0064c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f5);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    class d extends Animation {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f4435;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f4436;

        d(int i5, int i6) {
            this.f4435 = i5;
            this.f4436 = i6;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            c.this.f4397.setAlpha((int) (this.f4435 + ((this.f4436 - r0) * f5)));
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            c cVar = c.this;
            int abs = !cVar.f4411 ? cVar.f4393 - Math.abs(cVar.f4391) : cVar.f4393;
            c cVar2 = c.this;
            c.this.setTargetOffsetTopAndBottom((cVar2.f4420 + ((int) ((abs - r1) * f5))) - cVar2.f4430.getTop());
            c.this.f4397.m5257(1.0f - f5);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            c.this.m5308(f5);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            c cVar = c.this;
            float f6 = cVar.f4422;
            cVar.setAnimationProgress(f6 + ((-f6) * f5));
            c.this.m5308(f5);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    public interface i {
    }

    /* compiled from: SwipeRefreshLayout.java */
    public interface j {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo5311();
    }

    public c(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i5) {
        this.f4430.getBackground().setAlpha(i5);
        this.f4397.setAlpha(i5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m5291(int i5, Animation.AnimationListener animationListener) {
        this.f4420 = i5;
        this.f4425.reset();
        this.f4425.setDuration(200L);
        this.f4425.setInterpolator(this.f4429);
        if (animationListener != null) {
            this.f4430.m5248(animationListener);
        }
        this.f4430.clearAnimation();
        this.f4430.startAnimation(this.f4425);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m5292(int i5, Animation.AnimationListener animationListener) {
        if (this.f4427) {
            m5304(i5, animationListener);
            return;
        }
        this.f4420 = i5;
        this.f4415.reset();
        this.f4415.setDuration(200L);
        this.f4415.setInterpolator(this.f4429);
        if (animationListener != null) {
            this.f4430.m5248(animationListener);
        }
        this.f4430.clearAnimation();
        this.f4430.startAnimation(this.f4415);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m5293() {
        this.f4430 = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f4397 = bVar;
        bVar.m5262(1);
        this.f4430.setImageDrawable(this.f4397);
        this.f4430.setVisibility(8);
        addView(this.f4430);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m5294() {
        if (this.f4394 == null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.equals(this.f4430)) {
                    this.f4394 = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m5295(float f5) {
        if (f5 > this.f4402) {
            m5299(true, true);
            return;
        }
        this.f4398 = false;
        this.f4397.m5260(0.0f, 0.0f);
        m5292(this.f4419, !this.f4427 ? new e() : null);
        this.f4397.m5256(false);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean m5296(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m5297(float f5) {
        this.f4397.m5256(true);
        float min = Math.min(1.0f, Math.abs(f5 / this.f4402));
        double d6 = min;
        Double.isNaN(d6);
        float max = (((float) Math.max(d6 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f5) - this.f4402;
        int i5 = this.f4392;
        if (i5 <= 0) {
            i5 = this.f4411 ? this.f4393 - this.f4391 : this.f4393;
        }
        float f6 = i5;
        double max2 = Math.max(0.0f, Math.min(abs, f6 * 2.0f) / f6) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f7 = ((float) (max2 - pow)) * 2.0f;
        int i6 = this.f4391 + ((int) ((f6 * min) + (f6 * f7 * 2.0f)));
        if (this.f4430.getVisibility() != 0) {
            this.f4430.setVisibility(0);
        }
        if (!this.f4427) {
            this.f4430.setScaleX(1.0f);
            this.f4430.setScaleY(1.0f);
        }
        if (this.f4427) {
            setAnimationProgress(Math.min(1.0f, f5 / this.f4402));
        }
        if (f5 < this.f4402) {
            if (this.f4397.getAlpha() > 76 && !m5296(this.f4399)) {
                m5303();
            }
        } else if (this.f4397.getAlpha() < 255 && !m5296(this.f4403)) {
            m5302();
        }
        this.f4397.m5260(0.0f, Math.min(0.8f, max * 0.8f));
        this.f4397.m5257(Math.min(1.0f, max));
        this.f4397.m5259((((max * 0.4f) - 0.25f) + (f7 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i6 - this.f4419);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m5298(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4426) {
            this.f4426 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m5299(boolean z5, boolean z6) {
        if (this.f4398 != z5) {
            this.f4407 = z6;
            m5294();
            this.f4398 = z5;
            if (z5) {
                m5291(this.f4419, this.f4413);
            } else {
                m5310(this.f4413);
            }
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private Animation m5300(int i5, int i6) {
        d dVar = new d(i5, i6);
        dVar.setDuration(300L);
        this.f4430.m5248(null);
        this.f4430.clearAnimation();
        this.f4430.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m5301(float f5) {
        float f6 = this.f4423;
        float f7 = f5 - f6;
        int i5 = this.f4400;
        if (f7 <= i5 || this.f4424) {
            return;
        }
        this.f4421 = f6 + i5;
        this.f4424 = true;
        this.f4397.setAlpha(76);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m5302() {
        this.f4403 = m5300(this.f4397.getAlpha(), 255);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m5303() {
        this.f4399 = m5300(this.f4397.getAlpha(), 76);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m5304(int i5, Animation.AnimationListener animationListener) {
        this.f4420 = i5;
        this.f4422 = this.f4430.getScaleX();
        h hVar = new h();
        this.f4401 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f4430.m5248(animationListener);
        }
        this.f4430.clearAnimation();
        this.f4430.startAnimation(this.f4401);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m5305(Animation.AnimationListener animationListener) {
        this.f4430.setVisibility(0);
        this.f4397.setAlpha(255);
        b bVar = new b();
        this.f4395 = bVar;
        bVar.setDuration(this.f4418);
        if (animationListener != null) {
            this.f4430.m5248(animationListener);
        }
        this.f4430.clearAnimation();
        this.f4430.startAnimation(this.f4395);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f6, boolean z5) {
        return this.f4408.m3247(f5, f6, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f4408.m3248(f5, f6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return this.f4408.m3249(i5, i6, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return this.f4408.m3252(i5, i6, i7, i8, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        int i7 = this.f4431;
        return i7 < 0 ? i6 : i6 == i5 + (-1) ? i7 : i6 >= i7 ? i6 + 1 : i6;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4406.m3319();
    }

    public int getProgressCircleDiameter() {
        return this.f4405;
    }

    public int getProgressViewEndOffset() {
        return this.f4393;
    }

    public int getProgressViewStartOffset() {
        return this.f4391;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f4408.m3254();
    }

    @Override // android.view.View, androidx.core.view.o0
    public boolean isNestedScrollingEnabled() {
        return this.f4408.m3256();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5309();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.m5294()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f4428
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.f4428 = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.f4428
            if (r1 != 0) goto L81
            boolean r1 = r4.m5306()
            if (r1 != 0) goto L81
            boolean r1 = r4.f4398
            if (r1 != 0) goto L81
            boolean r1 = r4.f4416
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.m5298(r5)
            goto L7e
        L3d:
            int r0 = r4.f4426
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.c.f4389
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.m5301(r5)
            goto L7e
        L58:
            r4.f4424 = r2
            r4.f4426 = r3
            goto L7e
        L5d:
            int r0 = r4.f4391
            androidx.swiperefreshlayout.widget.a r1 = r4.f4430
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.f4426 = r0
            r4.f4424 = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.f4423 = r5
        L7e:
            boolean r5 = r4.f4424
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.c.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4394 == null) {
            m5294();
        }
        View view = this.f4394;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4430.getMeasuredWidth();
        int measuredHeight2 = this.f4430.getMeasuredHeight();
        int i9 = measuredWidth / 2;
        int i10 = measuredWidth2 / 2;
        int i11 = this.f4419;
        this.f4430.layout(i9 - i10, i11, i9 + i10, measuredHeight2 + i11);
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f4394 == null) {
            m5294();
        }
        View view = this.f4394;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4430.measure(View.MeasureSpec.makeMeasureSpec(this.f4405, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4405, 1073741824));
        this.f4431 = -1;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) == this.f4430) {
                this.f4431 = i7;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedFling(View view, float f5, float f6, boolean z5) {
        return dispatchNestedFling(f5, f6, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedPreFling(View view, float f5, float f6) {
        return dispatchNestedPreFling(f5, f6);
    }

    @Override // androidx.core.view.q0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr, int i7) {
        if (i7 == 0) {
            onNestedPreScroll(view, i5, i6, iArr);
        }
    }

    @Override // androidx.core.view.r0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        if (i9 != 0) {
            return;
        }
        int i10 = iArr[1];
        m5307(i5, i6, i7, i8, this.f4412, i9, iArr);
        int i11 = i8 - (iArr[1] - i10);
        if ((i11 == 0 ? i8 + this.f4412[1] : i11) >= 0 || m5306()) {
            return;
        }
        float abs = this.f4404 + Math.abs(r1);
        this.f4404 = abs;
        m5297(abs);
        iArr[1] = iArr[1] + i11;
    }

    @Override // androidx.core.view.q0
    public void onNestedScrollAccepted(View view, View view2, int i5, int i6) {
        if (i6 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f4442);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f4398);
    }

    @Override // androidx.core.view.q0
    public boolean onStartNestedScroll(View view, View view2, int i5, int i6) {
        if (i6 == 0) {
            return onStartNestedScroll(view, view2, i5);
        }
        return false;
    }

    @Override // androidx.core.view.q0
    public void onStopNestedScroll(View view, int i5) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4428 && actionMasked == 0) {
            this.f4428 = false;
        }
        if (!isEnabled() || this.f4428 || m5306() || this.f4398 || this.f4416) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4426 = motionEvent.getPointerId(0);
            this.f4424 = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4426);
                if (findPointerIndex < 0) {
                    Log.e(f4389, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f4424) {
                    float y5 = (motionEvent.getY(findPointerIndex) - this.f4421) * 0.5f;
                    this.f4424 = false;
                    m5295(y5);
                }
                this.f4426 = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f4426);
                if (findPointerIndex2 < 0) {
                    Log.e(f4389, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y6 = motionEvent.getY(findPointerIndex2);
                m5301(y6);
                if (this.f4424) {
                    float f5 = (y6 - this.f4421) * 0.5f;
                    if (f5 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m5297(f5);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f4389, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f4426 = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m5298(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        View view;
        ViewParent parent;
        if ((Build.VERSION.SDK_INT >= 21 || !(this.f4394 instanceof AbsListView)) && ((view = this.f4394) == null || f1.m2809(view))) {
            super.requestDisallowInterceptTouchEvent(z5);
        } else {
            if (this.f4409 || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z5);
        }
    }

    void setAnimationProgress(float f5) {
        this.f4430.setScaleX(f5);
        this.f4430.setScaleY(f5);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m5294();
        this.f4397.m5258(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr2[i5] = androidx.core.content.a.m1991(context, iArr[i5]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i5) {
        this.f4402 = i5;
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        if (z5) {
            return;
        }
        m5309();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z5) {
        this.f4409 = z5;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        this.f4408.m3257(z5);
    }

    public void setOnRefreshListener(j jVar) {
        this.f4396 = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i5) {
        setProgressBackgroundColorSchemeResource(i5);
    }

    public void setProgressBackgroundColorSchemeColor(int i5) {
        this.f4430.setBackgroundColor(i5);
    }

    public void setProgressBackgroundColorSchemeResource(int i5) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.m1991(getContext(), i5));
    }

    public void setRefreshing(boolean z5) {
        if (!z5 || this.f4398 == z5) {
            m5299(z5, false);
            return;
        }
        this.f4398 = z5;
        setTargetOffsetTopAndBottom((!this.f4411 ? this.f4393 + this.f4391 : this.f4393) - this.f4419);
        this.f4407 = false;
        m5305(this.f4413);
    }

    public void setSize(int i5) {
        if (i5 == 0 || i5 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i5 == 0) {
                this.f4405 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4405 = (int) (displayMetrics.density * 40.0f);
            }
            this.f4430.setImageDrawable(null);
            this.f4397.m5262(i5);
            this.f4430.setImageDrawable(this.f4397);
        }
    }

    public void setSlingshotDistance(int i5) {
        this.f4392 = i5;
    }

    void setTargetOffsetTopAndBottom(int i5) {
        this.f4430.bringToFront();
        f1.m2815(this.f4430, i5);
        this.f4419 = this.f4430.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i5) {
        return this.f4408.m3258(i5);
    }

    @Override // android.view.View, androidx.core.view.o0
    public void stopNestedScroll() {
        this.f4408.m3260();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m5306() {
        View view = this.f4394;
        return view instanceof ListView ? u.m3657((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m5307(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        if (i9 == 0) {
            this.f4408.m3251(i5, i6, i7, i8, iArr, i9, iArr2);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m5308(float f5) {
        setTargetOffsetTopAndBottom((this.f4420 + ((int) ((this.f4391 - r0) * f5))) - this.f4430.getTop());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    void m5309() {
        this.f4430.clearAnimation();
        this.f4397.stop();
        this.f4430.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4427) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4391 - this.f4419);
        }
        this.f4419 = this.f4430.getTop();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m5310(Animation.AnimationListener animationListener) {
        C0064c c0064c = new C0064c();
        this.f4417 = c0064c;
        c0064c.setDuration(150L);
        this.f4430.m5248(animationListener);
        this.f4430.clearAnimation();
        this.f4430.startAnimation(this.f4417);
    }

    /* compiled from: SwipeRefreshLayout.java */
    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        final boolean f4442;

        /* compiled from: SwipeRefreshLayout.java */
        class a implements Parcelable.Creator<k> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public k[] newArray(int i5) {
                return new k[i5];
            }
        }

        k(Parcelable parcelable, boolean z5) {
            super(parcelable);
            this.f4442 = z5;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeByte(this.f4442 ? (byte) 1 : (byte) 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f4442 = parcel.readByte() != 0;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4398 = false;
        this.f4402 = -1.0f;
        this.f4410 = new int[2];
        this.f4412 = new int[2];
        this.f4414 = new int[2];
        this.f4426 = -1;
        this.f4431 = -1;
        this.f4413 = new a();
        this.f4425 = new f();
        this.f4415 = new g();
        this.f4400 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4418 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f4429 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4405 = (int) (displayMetrics.density * 40.0f);
        m5293();
        setChildrenDrawingOrderEnabled(true);
        int i5 = (int) (displayMetrics.density * 64.0f);
        this.f4393 = i5;
        this.f4402 = i5;
        this.f4406 = new t0(this);
        this.f4408 = new p0(this);
        setNestedScrollingEnabled(true);
        int i6 = -this.f4405;
        this.f4419 = i6;
        this.f4391 = i6;
        m5308(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4390);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        if (i6 > 0) {
            float f5 = this.f4404;
            if (f5 > 0.0f) {
                float f6 = i6;
                if (f6 > f5) {
                    iArr[1] = (int) f5;
                    this.f4404 = 0.0f;
                } else {
                    this.f4404 = f5 - f6;
                    iArr[1] = i6;
                }
                m5297(this.f4404);
            }
        }
        if (this.f4411 && i6 > 0 && this.f4404 == 0.0f && Math.abs(i6 - iArr[1]) > 0) {
            this.f4430.setVisibility(8);
        }
        int[] iArr2 = this.f4410;
        if (dispatchNestedPreScroll(i5 - iArr[0], i6 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        this.f4406.m3320(view, view2, i5);
        startNestedScroll(i5 & 2);
        this.f4404 = 0.0f;
        this.f4416 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        return (!isEnabled() || this.f4428 || this.f4398 || (i5 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onStopNestedScroll(View view) {
        this.f4406.m3322(view);
        this.f4416 = false;
        float f5 = this.f4404;
        if (f5 > 0.0f) {
            m5295(f5);
            this.f4404 = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9) {
        onNestedScroll(view, i5, i6, i7, i8, i9, this.f4414);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        onNestedScroll(view, i5, i6, i7, i8, 0, this.f4414);
    }

    /* compiled from: SwipeRefreshLayout.java */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f4398) {
                cVar.m5309();
                return;
            }
            cVar.f4397.setAlpha(255);
            c.this.f4397.start();
            c cVar2 = c.this;
            if (cVar2.f4407 && (jVar = cVar2.f4396) != null) {
                jVar.mo5311();
            }
            c cVar3 = c.this;
            cVar3.f4419 = cVar3.f4430.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f4427) {
                return;
            }
            cVar.m5310(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
