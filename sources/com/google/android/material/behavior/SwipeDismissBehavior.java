package com.google.android.material.behavior;

import a0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.f1;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    a0.c viewDragHelper;
    private float sensitivity = DEFAULT_ALPHA_START_DISTANCE;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = DEFAULT_ALPHA_START_DISTANCE;
    float alphaEndSwipeDistance = 0.5f;
    private final c.AbstractC0005c dragCallback = new a();

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i5);
    }

    class a extends c.AbstractC0005c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f5289;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f5290 = -1;

        a() {
        }

        /* renamed from: י, reason: contains not printable characters */
        private boolean m6214(View view, float f5) {
            if (f5 == SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                return Math.abs(view.getLeft() - this.f5289) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z5 = f1.m2834(view) == 1;
            int i5 = SwipeDismissBehavior.this.swipeDirection;
            if (i5 == 2) {
                return true;
            }
            if (i5 == 0) {
                if (z5) {
                    if (f5 >= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                        return false;
                    }
                } else if (f5 <= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                    return false;
                }
                return true;
            }
            if (i5 != 1) {
                return false;
            }
            if (z5) {
                if (f5 <= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                    return false;
                }
            } else if (f5 >= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                return false;
            }
            return true;
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʻ */
        public int mo112(View view, int i5, int i6) {
            int width;
            int width2;
            int width3;
            boolean z5 = f1.m2834(view) == 1;
            int i7 = SwipeDismissBehavior.this.swipeDirection;
            if (i7 == 0) {
                if (z5) {
                    width = this.f5289 - view.getWidth();
                    width2 = this.f5289;
                } else {
                    width = this.f5289;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i7 != 1) {
                width = this.f5289 - view.getWidth();
                width2 = view.getWidth() + this.f5289;
            } else if (z5) {
                width = this.f5289;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f5289 - view.getWidth();
                width2 = this.f5289;
            }
            return SwipeDismissBehavior.clamp(width, i5, width2);
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʼ */
        public int mo113(View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ʾ */
        public int mo115(View view) {
            return view.getWidth();
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˊ */
        public void mo120(View view, int i5) {
            this.f5290 = i5;
            this.f5289 = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˋ */
        public void mo121(int i5) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i5);
            }
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˎ */
        public void mo122(View view, int i5, int i6, int i7, int i8) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float abs = Math.abs(i5 - this.f5289);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE, 1.0f - SwipeDismissBehavior.fraction(width, width2, abs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x001d  */
        @Override // a0.c.AbstractC0005c
        /* renamed from: ˏ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo123(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f5290 = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.m6214(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f5289
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f5289
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f5289
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                a0.c r5 = r5.viewDragHelper
                int r1 = r3.getTop()
                boolean r5 = r5.m99(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$c r5 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                androidx.core.view.f1.m2822(r3, r5)
                goto L4a
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener r4 = r4.listener
                if (r4 == 0) goto L4a
                r4.onDismiss(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.mo123(android.view.View, float, float):void");
        }

        @Override // a0.c.AbstractC0005c
        /* renamed from: ˑ */
        public boolean mo124(View view, int i5) {
            int i6 = this.f5290;
            return (i6 == -1 || i6 == i5) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    }

    class b implements o0 {
        b() {
        }

        @Override // androidx.core.view.accessibility.o0
        /* renamed from: ʻ */
        public boolean mo2731(View view, o0.a aVar) {
            boolean z5 = false;
            if (!SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                return false;
            }
            boolean z6 = f1.m2834(view) == 1;
            int i5 = SwipeDismissBehavior.this.swipeDirection;
            if ((i5 == 0 && z6) || (i5 == 1 && !z6)) {
                z5 = true;
            }
            int width = view.getWidth();
            if (z5) {
                width = -width;
            }
            f1.m2814(view, width);
            view.setAlpha(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE);
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(view);
            }
            return true;
        }
    }

    private class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final View f5293;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final boolean f5294;

        c(View view, boolean z5) {
            this.f5293 = view;
            this.f5294 = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            a0.c cVar = SwipeDismissBehavior.this.viewDragHelper;
            if (cVar != null && cVar.m101(true)) {
                f1.m2822(this.f5293, this);
            } else {
                if (!this.f5294 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.f5293);
            }
        }
    }

    static float clamp(float f5, float f6, float f7) {
        return Math.min(Math.max(f5, f6), f7);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? a0.c.m80(viewGroup, this.sensitivity, this.dragCallback) : a0.c.m81(viewGroup, this.dragCallback);
        }
    }

    static float fraction(float f5, float f6, float f7) {
        return (f7 - f5) / (f6 - f5);
    }

    private void updateAccessibilityActions(View view) {
        f1.m2824(view, 1048576);
        if (canSwipeDismissView(view)) {
            f1.m2826(view, j0.a.f2898, null, new b());
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public int getDragState() {
        a0.c cVar = this.viewDragHelper;
        if (cVar != null) {
            return cVar.m104();
        }
        return 0;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        boolean z5 = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z5 = coordinatorLayout.isPointInChildBounds(v5, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z5;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!z5) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return !this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.m102(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v5, i5);
        if (f1.m2807(v5) == 0) {
            f1.m2843(v5, 1);
            updateAccessibilityActions(v5);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.m95(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f5) {
        this.dragDismissThreshold = clamp(DEFAULT_ALPHA_START_DISTANCE, f5, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f5) {
        this.alphaEndSwipeDistance = clamp(DEFAULT_ALPHA_START_DISTANCE, f5, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f5) {
        this.sensitivity = f5;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f5) {
        this.alphaStartSwipeDistance = clamp(DEFAULT_ALPHA_START_DISTANCE, f5, 1.0f);
    }

    public void setSwipeDirection(int i5) {
        this.swipeDirection = i5;
    }

    static int clamp(int i5, int i6, int i7) {
        return Math.min(Math.max(i5, i6), i7);
    }
}
