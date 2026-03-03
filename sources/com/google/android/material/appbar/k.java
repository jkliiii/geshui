package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HeaderBehavior.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class k<V extends View> extends m<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    /* compiled from: HeaderBehavior.java */
    private class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final CoordinatorLayout f5268;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final V f5269;

        a(CoordinatorLayout coordinatorLayout, V v5) {
            this.f5268 = coordinatorLayout;
            this.f5269 = v5;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f5269 == null || (overScroller = k.this.scroller) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                k.this.onFlingFinished(this.f5268, this.f5269);
                return;
            }
            k kVar = k.this;
            kVar.setHeaderTopBottomOffset(this.f5268, this.f5269, kVar.scroller.getCurrY());
            f1.m2822(this.f5269, this);
        }
    }

    public k() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    boolean canDragView(V v5) {
        return false;
    }

    final boolean fling(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, float f5) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v5.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v5.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f5), 0, 0, i5, i6);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v5);
            return false;
        }
        a aVar = new a(coordinatorLayout, v5);
        this.flingRunnable = aVar;
        f1.m2822(v5, aVar);
        return true;
    }

    int getMaxDragOffset(V v5) {
        return -v5.getHeight();
    }

    int getScrollRangeForDragFling(V v5) {
        return v5.getHeight();
    }

    int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i5 = this.activePointerId;
            if (i5 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i5)) == -1) {
                return false;
            }
            int y5 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y5 - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y5;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x5 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            boolean z5 = canDragView(v5) && coordinatorLayout.isPointInChildBounds(v5, x5, y6);
            this.isBeingDragged = z5;
            if (z5) {
                this.lastMotionY = y6;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.activePointerId = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.lastMotionY = r12
            goto L4c
        L2d:
            int r0 = r11.activePointerId
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.lastMotionY
            int r7 = r1 - r0
            r11.lastMotionY = r0
            int r8 = r11.getMaxDragOffset(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.scroll(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.velocityTracker
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.velocityTracker
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.velocityTracker
            int r4 = r11.activePointerId
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.getScrollRangeForDragFling(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.fling(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.isBeingDragged = r3
            r11.activePointerId = r1
            android.view.VelocityTracker r13 = r11.velocityTracker
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.velocityTracker = r13
        L81:
            android.view.VelocityTracker r13 = r11.velocityTracker
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.isBeingDragged
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.k.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    final int scroll(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, int i7) {
        return setHeaderTopBottomOffset(coordinatorLayout, v5, getTopBottomOffsetForScrollingSibling() - i5, i6, i7);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        return setHeaderTopBottomOffset(coordinatorLayout, v5, i5, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, int i7) {
        int m12444;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i6 == 0 || topAndBottomOffset < i6 || topAndBottomOffset > i7 || topAndBottomOffset == (m12444 = w.a.m12444(i5, i6, i7))) {
            return 0;
        }
        setTopAndBottomOffset(m12444);
        return topAndBottomOffset - m12444;
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    void onFlingFinished(CoordinatorLayout coordinatorLayout, V v5) {
    }
}
