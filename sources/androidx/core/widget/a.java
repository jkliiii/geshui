package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.f1;

/* compiled from: AutoScrollHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static final int f3105 = ViewConfiguration.getTapTimeout();

    /* renamed from: ˆ, reason: contains not printable characters */
    final View f3108;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Runnable f3109;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f3112;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f3113;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f3117;

    /* renamed from: ٴ, reason: contains not printable characters */
    boolean f3118;

    /* renamed from: ᐧ, reason: contains not printable characters */
    boolean f3119;

    /* renamed from: ᴵ, reason: contains not printable characters */
    boolean f3120;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean f3121;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f3122;

    /* renamed from: ʾ, reason: contains not printable characters */
    final C0038a f3106 = new C0038a();

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Interpolator f3107 = new AccelerateInterpolator();

    /* renamed from: ˉ, reason: contains not printable characters */
    private float[] f3110 = {0.0f, 0.0f};

    /* renamed from: ˊ, reason: contains not printable characters */
    private float[] f3111 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: ˏ, reason: contains not printable characters */
    private float[] f3114 = {0.0f, 0.0f};

    /* renamed from: ˑ, reason: contains not printable characters */
    private float[] f3115 = {0.0f, 0.0f};

    /* renamed from: י, reason: contains not printable characters */
    private float[] f3116 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0038a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f3123;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f3124;

        /* renamed from: ʽ, reason: contains not printable characters */
        private float f3125;

        /* renamed from: ʾ, reason: contains not printable characters */
        private float f3126;

        /* renamed from: ˋ, reason: contains not printable characters */
        private float f3132;

        /* renamed from: ˎ, reason: contains not printable characters */
        private int f3133;

        /* renamed from: ʿ, reason: contains not printable characters */
        private long f3127 = Long.MIN_VALUE;

        /* renamed from: ˊ, reason: contains not printable characters */
        private long f3131 = -1;

        /* renamed from: ˆ, reason: contains not printable characters */
        private long f3128 = 0;

        /* renamed from: ˈ, reason: contains not printable characters */
        private int f3129 = 0;

        /* renamed from: ˉ, reason: contains not printable characters */
        private int f3130 = 0;

        C0038a() {
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private float m3534(long j5) {
            if (j5 < this.f3127) {
                return 0.0f;
            }
            long j6 = this.f3131;
            if (j6 < 0 || j5 < j6) {
                return a.m3513((j5 - r0) / this.f3123, 0.0f, 1.0f) * 0.5f;
            }
            float f5 = this.f3132;
            return (1.0f - f5) + (f5 * a.m3513((j5 - j6) / this.f3133, 0.0f, 1.0f));
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private float m3535(float f5) {
            return ((-4.0f) * f5 * f5) + (f5 * 4.0f);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m3536() {
            if (this.f3128 == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m3535 = m3535(m3534(currentAnimationTimeMillis));
            long j5 = currentAnimationTimeMillis - this.f3128;
            this.f3128 = currentAnimationTimeMillis;
            float f5 = j5 * m3535;
            this.f3129 = (int) (this.f3125 * f5);
            this.f3130 = (int) (f5 * this.f3126);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m3537() {
            return this.f3129;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m3538() {
            return this.f3130;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public int m3539() {
            float f5 = this.f3125;
            return (int) (f5 / Math.abs(f5));
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public int m3540() {
            float f5 = this.f3126;
            return (int) (f5 / Math.abs(f5));
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public boolean m3541() {
            return this.f3131 > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3131 + ((long) this.f3133);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public void m3542() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3133 = a.m3514((int) (currentAnimationTimeMillis - this.f3127), 0, this.f3124);
            this.f3132 = m3534(currentAnimationTimeMillis);
            this.f3131 = currentAnimationTimeMillis;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public void m3543(int i5) {
            this.f3124 = i5;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public void m3544(int i5) {
            this.f3123 = i5;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public void m3545(float f5, float f6) {
            this.f3125 = f5;
            this.f3126 = f6;
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public void m3546() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3127 = currentAnimationTimeMillis;
            this.f3131 = -1L;
            this.f3128 = currentAnimationTimeMillis;
            this.f3132 = 0.5f;
            this.f3129 = 0;
            this.f3130 = 0;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f3120) {
                if (aVar.f3118) {
                    aVar.f3118 = false;
                    aVar.f3106.m3546();
                }
                C0038a c0038a = a.this.f3106;
                if (c0038a.m3541() || !a.this.m3533()) {
                    a.this.f3120 = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f3119) {
                    aVar2.f3119 = false;
                    aVar2.m3521();
                }
                c0038a.m3536();
                a.this.mo3522(c0038a.m3537(), c0038a.m3538());
                f1.m2822(a.this.f3108, this);
            }
        }
    }

    public a(View view) {
        this.f3108 = view;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float f6 = (int) ((1575.0f * f5) + 0.5f);
        m3527(f6, f6);
        float f7 = (int) ((f5 * 315.0f) + 0.5f);
        m3528(f7, f7);
        m3524(1);
        m3526(Float.MAX_VALUE, Float.MAX_VALUE);
        m3531(0.2f, 0.2f);
        m3532(1.0f, 1.0f);
        m3523(f3105);
        m3530(500);
        m3529(500);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private float m3512(int i5, float f5, float f6, float f7) {
        float m3516 = m3516(this.f3110[i5], f6, this.f3111[i5], f5);
        if (m3516 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f3114[i5];
        float f9 = this.f3115[i5];
        float f10 = this.f3116[i5];
        float f11 = f8 * f7;
        return m3516 > 0.0f ? m3513(m3516 * f11, f9, f10) : -m3513((-m3516) * f11, f9, f10);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static float m3513(float f5, float f6, float f7) {
        return f5 > f7 ? f7 : f5 < f6 ? f6 : f5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static int m3514(int i5, int i6, int i7) {
        return i5 > i7 ? i7 : i5 < i6 ? i6 : i5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private float m3515(float f5, float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        int i5 = this.f3112;
        if (i5 == 0 || i5 == 1) {
            if (f5 < f6) {
                if (f5 >= 0.0f) {
                    return 1.0f - (f5 / f6);
                }
                if (this.f3120 && i5 == 1) {
                    return 1.0f;
                }
            }
        } else if (i5 == 2 && f5 < 0.0f) {
            return f5 / (-f6);
        }
        return 0.0f;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private float m3516(float f5, float f6, float f7, float f8) {
        float interpolation;
        float m3513 = m3513(f5 * f6, 0.0f, f7);
        float m3515 = m3515(f6 - f8, m3513) - m3515(f8, m3513);
        if (m3515 < 0.0f) {
            interpolation = -this.f3107.getInterpolation(-m3515);
        } else {
            if (m3515 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f3107.getInterpolation(m3515);
        }
        return m3513(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m3517() {
        if (this.f3118) {
            this.f3120 = false;
        } else {
            this.f3106.m3542();
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m3518() {
        int i5;
        if (this.f3109 == null) {
            this.f3109 = new b();
        }
        this.f3120 = true;
        this.f3118 = true;
        if (this.f3117 || (i5 = this.f3113) <= 0) {
            this.f3109.run();
        } else {
            f1.m2823(this.f3108, this.f3109, i5);
        }
        this.f3117 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3121
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m3517()
            goto L58
        L1a:
            r5.f3119 = r2
            r5.f3117 = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3108
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3512(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3108
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3512(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3106
            r7.m3545(r0, r6)
            boolean r6 = r5.f3120
            if (r6 != 0) goto L58
            boolean r6 = r5.m3533()
            if (r6 == 0) goto L58
            r5.m3518()
        L58:
            boolean r6 = r5.f3122
            if (r6 == 0) goto L61
            boolean r6 = r5.f3120
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract boolean mo3519(int i5);

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract boolean mo3520(int i5);

    /* renamed from: ʽ, reason: contains not printable characters */
    void m3521() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3108.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public abstract void mo3522(int i5, int i6);

    /* renamed from: ˎ, reason: contains not printable characters */
    public a m3523(int i5) {
        this.f3113 = i5;
        return this;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public a m3524(int i5) {
        this.f3112 = i5;
        return this;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public a m3525(boolean z5) {
        if (this.f3121 && !z5) {
            m3517();
        }
        this.f3121 = z5;
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    public a m3526(float f5, float f6) {
        float[] fArr = this.f3111;
        fArr[0] = f5;
        fArr[1] = f6;
        return this;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public a m3527(float f5, float f6) {
        float[] fArr = this.f3116;
        fArr[0] = f5 / 1000.0f;
        fArr[1] = f6 / 1000.0f;
        return this;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public a m3528(float f5, float f6) {
        float[] fArr = this.f3115;
        fArr[0] = f5 / 1000.0f;
        fArr[1] = f6 / 1000.0f;
        return this;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public a m3529(int i5) {
        this.f3106.m3543(i5);
        return this;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public a m3530(int i5) {
        this.f3106.m3544(i5);
        return this;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public a m3531(float f5, float f6) {
        float[] fArr = this.f3110;
        fArr[0] = f5;
        fArr[1] = f6;
        return this;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public a m3532(float f5, float f6) {
        float[] fArr = this.f3114;
        fArr[0] = f5 / 1000.0f;
        fArr[1] = f6 / 1000.0f;
        return this;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    boolean m3533() {
        C0038a c0038a = this.f3106;
        int m3540 = c0038a.m3540();
        int m3539 = c0038a.m3539();
        return (m3540 != 0 && mo3520(m3540)) || (m3539 != 0 && mo3519(m3539));
    }
}
