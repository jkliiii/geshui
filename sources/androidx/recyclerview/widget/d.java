package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FastScroller.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f4250;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private final RecyclerView.u f4251;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f4252;

    /* renamed from: ʽ, reason: contains not printable characters */
    final StateListDrawable f4253;

    /* renamed from: ʾ, reason: contains not printable characters */
    final Drawable f4254;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f4255;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f4256;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final StateListDrawable f4257;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final Drawable f4258;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int f4259;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final int f4260;

    /* renamed from: ˎ, reason: contains not printable characters */
    int f4261;

    /* renamed from: ˏ, reason: contains not printable characters */
    int f4262;

    /* renamed from: ˑ, reason: contains not printable characters */
    float f4263;

    /* renamed from: י, reason: contains not printable characters */
    int f4264;

    /* renamed from: ـ, reason: contains not printable characters */
    int f4265;

    /* renamed from: ٴ, reason: contains not printable characters */
    float f4266;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    int f4268;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final Runnable f4270;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private RecyclerView f4271;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    final ValueAnimator f4278;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static final int[] f4249 = {R.attr.state_pressed};

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static final int[] f4248 = new int[0];

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f4267 = 0;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f4269 = 0;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f4272 = false;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean f4273 = false;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int f4274 = 0;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f4275 = 0;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private final int[] f4276 = new int[2];

    /* renamed from: ﾞ, reason: contains not printable characters */
    private final int[] f4277 = new int[2];

    /* compiled from: FastScroller.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.m5124(500);
        }
    }

    /* compiled from: FastScroller.java */
    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        /* renamed from: ʼ */
        public void mo4875(RecyclerView recyclerView, int i5, int i6) {
            d.this.m5130(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f4281 = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4281 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4281) {
                this.f4281 = false;
                return;
            }
            if (((Float) d.this.f4278.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f4268 = 0;
                dVar.m5128(0);
            } else {
                d dVar2 = d.this;
                dVar2.f4268 = 2;
                dVar2.m5127();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0061d implements ValueAnimator.AnimatorUpdateListener {
        C0061d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f4253.setAlpha(floatValue);
            d.this.f4254.setAlpha(floatValue);
            d.this.m5127();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i5, int i6, int i7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4278 = ofFloat;
        this.f4268 = 0;
        this.f4270 = new a();
        this.f4251 = new b();
        this.f4253 = stateListDrawable;
        this.f4254 = drawable;
        this.f4257 = stateListDrawable2;
        this.f4258 = drawable2;
        this.f4255 = Math.max(i5, stateListDrawable.getIntrinsicWidth());
        this.f4256 = Math.max(i5, drawable.getIntrinsicWidth());
        this.f4259 = Math.max(i5, stateListDrawable2.getIntrinsicWidth());
        this.f4260 = Math.max(i5, drawable2.getIntrinsicWidth());
        this.f4250 = i6;
        this.f4252 = i7;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0061d());
        m5123(recyclerView);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m5111() {
        this.f4271.removeCallbacks(this.f4270);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m5112() {
        this.f4271.removeItemDecoration(this);
        this.f4271.removeOnItemTouchListener(this);
        this.f4271.removeOnScrollListener(this.f4251);
        m5111();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m5113(Canvas canvas) {
        int i5 = this.f4269;
        int i6 = this.f4259;
        int i7 = this.f4265;
        int i8 = this.f4264;
        this.f4257.setBounds(0, 0, i8, i6);
        this.f4258.setBounds(0, 0, this.f4267, this.f4260);
        canvas.translate(0.0f, i5 - i6);
        this.f4258.draw(canvas);
        canvas.translate(i7 - (i8 / 2), 0.0f);
        this.f4257.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m5114(Canvas canvas) {
        int i5 = this.f4267;
        int i6 = this.f4255;
        int i7 = i5 - i6;
        int i8 = this.f4262;
        int i9 = this.f4261;
        int i10 = i8 - (i9 / 2);
        this.f4253.setBounds(0, 0, i6, i9);
        this.f4254.setBounds(0, 0, this.f4256, this.f4269);
        if (!m5118()) {
            canvas.translate(i7, 0.0f);
            this.f4254.draw(canvas);
            canvas.translate(0.0f, i10);
            this.f4253.draw(canvas);
            canvas.translate(-i7, -i10);
            return;
        }
        this.f4254.draw(canvas);
        canvas.translate(this.f4255, i10);
        canvas.scale(-1.0f, 1.0f);
        this.f4253.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f4255, -i10);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int[] m5115() {
        int[] iArr = this.f4277;
        int i5 = this.f4252;
        iArr[0] = i5;
        iArr[1] = this.f4267 - i5;
        return iArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int[] m5116() {
        int[] iArr = this.f4276;
        int i5 = this.f4252;
        iArr[0] = i5;
        iArr[1] = this.f4269 - i5;
        return iArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m5117(float f5) {
        int[] m5115 = m5115();
        float max = Math.max(m5115[0], Math.min(m5115[1], f5));
        if (Math.abs(this.f4265 - max) < 2.0f) {
            return;
        }
        int m5120 = m5120(this.f4266, max, m5115, this.f4271.computeHorizontalScrollRange(), this.f4271.computeHorizontalScrollOffset(), this.f4267);
        if (m5120 != 0) {
            this.f4271.scrollBy(m5120, 0);
        }
        this.f4266 = max;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean m5118() {
        return f1.m2834(this.f4271) == 1;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m5119(int i5) {
        m5111();
        this.f4271.postDelayed(this.f4270, i5);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int m5120(float f5, float f6, int[] iArr, int i5, int i6, int i7) {
        int i8 = iArr[1] - iArr[0];
        if (i8 == 0) {
            return 0;
        }
        int i9 = i5 - i7;
        int i10 = (int) (((f6 - f5) / i8) * i9);
        int i11 = i6 + i10;
        if (i11 >= i9 || i11 < 0) {
            return 0;
        }
        return i10;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m5121() {
        this.f4271.addItemDecoration(this);
        this.f4271.addOnItemTouchListener(this);
        this.f4271.addOnScrollListener(this.f4251);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m5122(float f5) {
        int[] m5116 = m5116();
        float max = Math.max(m5116[0], Math.min(m5116[1], f5));
        if (Math.abs(this.f4262 - max) < 2.0f) {
            return;
        }
        int m5120 = m5120(this.f4263, max, m5116, this.f4271.computeVerticalScrollRange(), this.f4271.computeVerticalScrollOffset(), this.f4269);
        if (m5120 != 0) {
            this.f4271.scrollBy(0, m5120);
        }
        this.f4263 = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f4267 != this.f4271.getWidth() || this.f4269 != this.f4271.getHeight()) {
            this.f4267 = this.f4271.getWidth();
            this.f4269 = this.f4271.getHeight();
            m5128(0);
        } else if (this.f4268 != 0) {
            if (this.f4272) {
                m5114(canvas);
            }
            if (this.f4273) {
                m5113(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    /* renamed from: ʻ */
    public boolean mo4871(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i5 = this.f4274;
        if (i5 == 1) {
            boolean m5126 = m5126(motionEvent.getX(), motionEvent.getY());
            boolean m5125 = m5125(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m5126 && !m5125) {
                return false;
            }
            if (m5125) {
                this.f4275 = 1;
                this.f4266 = (int) motionEvent.getX();
            } else if (m5126) {
                this.f4275 = 2;
                this.f4263 = (int) motionEvent.getY();
            }
            m5128(2);
        } else if (i5 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    /* renamed from: ʼ */
    public void mo4872(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4274 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m5126 = m5126(motionEvent.getX(), motionEvent.getY());
            boolean m5125 = m5125(motionEvent.getX(), motionEvent.getY());
            if (m5126 || m5125) {
                if (m5125) {
                    this.f4275 = 1;
                    this.f4266 = (int) motionEvent.getX();
                } else if (m5126) {
                    this.f4275 = 2;
                    this.f4263 = (int) motionEvent.getY();
                }
                m5128(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4274 == 2) {
            this.f4263 = 0.0f;
            this.f4266 = 0.0f;
            m5128(1);
            this.f4275 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4274 == 2) {
            m5129();
            if (this.f4275 == 1) {
                m5117(motionEvent.getX());
            }
            if (this.f4275 == 2) {
                m5122(motionEvent.getY());
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m5123(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4271;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m5112();
        }
        this.f4271 = recyclerView;
        if (recyclerView != null) {
            m5121();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void m5124(int i5) {
        int i6 = this.f4268;
        if (i6 == 1) {
            this.f4278.cancel();
        } else if (i6 != 2) {
            return;
        }
        this.f4268 = 3;
        ValueAnimator valueAnimator = this.f4278;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4278.setDuration(i5);
        this.f4278.start();
    }

    /* renamed from: י, reason: contains not printable characters */
    boolean m5125(float f5, float f6) {
        if (f6 >= this.f4269 - this.f4259) {
            int i5 = this.f4265;
            int i6 = this.f4264;
            if (f5 >= i5 - (i6 / 2) && f5 <= i5 + (i6 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    boolean m5126(float f5, float f6) {
        if (!m5118() ? f5 >= this.f4267 - this.f4255 : f5 <= this.f4255) {
            int i5 = this.f4262;
            int i6 = this.f4261;
            if (f6 >= i5 - (i6 / 2) && f6 <= i5 + (i6 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m5127() {
        this.f4271.invalidate();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m5128(int i5) {
        if (i5 == 2 && this.f4274 != 2) {
            this.f4253.setState(f4249);
            m5111();
        }
        if (i5 == 0) {
            m5127();
        } else {
            m5129();
        }
        if (this.f4274 == 2 && i5 != 2) {
            this.f4253.setState(f4248);
            m5119(1200);
        } else if (i5 == 1) {
            m5119(1500);
        }
        this.f4274 = i5;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m5129() {
        int i5 = this.f4268;
        if (i5 != 0) {
            if (i5 != 3) {
                return;
            } else {
                this.f4278.cancel();
            }
        }
        this.f4268 = 1;
        ValueAnimator valueAnimator = this.f4278;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4278.setDuration(500L);
        this.f4278.setStartDelay(0L);
        this.f4278.start();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m5130(int i5, int i6) {
        int computeVerticalScrollRange = this.f4271.computeVerticalScrollRange();
        int i7 = this.f4269;
        this.f4272 = computeVerticalScrollRange - i7 > 0 && i7 >= this.f4250;
        int computeHorizontalScrollRange = this.f4271.computeHorizontalScrollRange();
        int i8 = this.f4267;
        boolean z5 = computeHorizontalScrollRange - i8 > 0 && i8 >= this.f4250;
        this.f4273 = z5;
        boolean z6 = this.f4272;
        if (!z6 && !z5) {
            if (this.f4274 != 0) {
                m5128(0);
                return;
            }
            return;
        }
        if (z6) {
            float f5 = i7;
            this.f4262 = (int) ((f5 * (i6 + (f5 / 2.0f))) / computeVerticalScrollRange);
            this.f4261 = Math.min(i7, (i7 * i7) / computeVerticalScrollRange);
        }
        if (this.f4273) {
            float f6 = i8;
            this.f4265 = (int) ((f6 * (i5 + (f6 / 2.0f))) / computeHorizontalScrollRange);
            this.f4264 = Math.min(i8, (i8 * i8) / computeHorizontalScrollRange);
        }
        int i9 = this.f4274;
        if (i9 == 0 || i9 == 1) {
            m5128(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    /* renamed from: ʽ */
    public void mo4873(boolean z5) {
    }
}
