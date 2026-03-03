package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class g2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final float f1255;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f1256;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f1257;

    /* renamed from: ˈ, reason: contains not printable characters */
    final View f1258;

    /* renamed from: ˉ, reason: contains not printable characters */
    private Runnable f1259;

    /* renamed from: ˊ, reason: contains not printable characters */
    private Runnable f1260;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f1261;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f1262;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final int[] f1263 = new int[2];

    /* compiled from: ForwardingListener.java */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = g2.this.f1258.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g2.this.m1279();
        }
    }

    public g2(View view) {
        this.f1258 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1255 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1256 = tapTimeout;
        this.f1257 = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1273() {
        Runnable runnable = this.f1260;
        if (runnable != null) {
            this.f1258.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1259;
        if (runnable2 != null) {
            this.f1258.removeCallbacks(runnable2);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m1274(MotionEvent motionEvent) {
        e2 e2Var;
        View view = this.f1258;
        androidx.appcompat.view.menu.p mo882 = mo882();
        if (mo882 == null || !mo882.mo920() || (e2Var = (e2) mo882.mo923()) == null || !e2Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1277(view, obtainNoHistory);
        m1278(e2Var, obtainNoHistory);
        boolean mo1227 = e2Var.mo1227(obtainNoHistory, this.f1262);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return mo1227 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* renamed from: ˈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1275(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1258
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1262
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1255
            boolean r6 = m1276(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m1273()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m1273()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1262 = r6
            java.lang.Runnable r6 = r5.f1259
            if (r6 != 0) goto L52
            androidx.appcompat.widget.g2$a r6 = new androidx.appcompat.widget.g2$a
            r6.<init>()
            r5.f1259 = r6
        L52:
            java.lang.Runnable r6 = r5.f1259
            int r1 = r5.f1256
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1260
            if (r6 != 0) goto L65
            androidx.appcompat.widget.g2$b r6 = new androidx.appcompat.widget.g2$b
            r6.<init>()
            r5.f1260 = r6
        L65:
            java.lang.Runnable r6 = r5.f1260
            int r1 = r5.f1257
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g2.m1275(android.view.MotionEvent):boolean");
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean m1276(View view, float f5, float f6, float f7) {
        float f8 = -f7;
        return f5 >= f8 && f6 >= f8 && f5 < ((float) (view.getRight() - view.getLeft())) + f7 && f6 < ((float) (view.getBottom() - view.getTop())) + f7;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean m1277(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1263);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean m1278(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1263);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5;
        boolean z6 = this.f1261;
        if (z6) {
            z5 = m1274(motionEvent) || !mo1170();
        } else {
            z5 = m1275(motionEvent) && mo883();
            if (z5) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1258.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1261 = z5;
        return z5 || z6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1261 = false;
        this.f1262 = -1;
        Runnable runnable = this.f1259;
        if (runnable != null) {
            this.f1258.removeCallbacks(runnable);
        }
    }

    /* renamed from: ʼ */
    public abstract androidx.appcompat.view.menu.p mo882();

    /* renamed from: ʽ */
    protected abstract boolean mo883();

    /* renamed from: ʾ */
    protected boolean mo1170() {
        androidx.appcompat.view.menu.p mo882 = mo882();
        if (mo882 == null || !mo882.mo920()) {
            return true;
        }
        mo882.dismiss();
        return true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m1279() {
        m1273();
        View view = this.f1258;
        if (view.isEnabled() && !view.isLongClickable() && mo883()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1261 = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
