package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.q;

/* compiled from: Visibility.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class s0 extends q {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* compiled from: Visibility.java */
    class a extends r {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f4552;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f4553;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f4554;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f4552 = viewGroup;
            this.f4553 = view;
            this.f4554 = view2;
        }

        @Override // androidx.transition.r, androidx.transition.q.g
        /* renamed from: ʽ */
        public void mo5335(q qVar) {
            c0.m5341(this.f4552).mo5318(this.f4553);
        }

        @Override // androidx.transition.r, androidx.transition.q.g
        /* renamed from: ʾ */
        public void mo5336(q qVar) {
            if (this.f4553.getParent() == null) {
                c0.m5341(this.f4552).mo5317(this.f4553);
            } else {
                s0.this.cancel();
            }
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            this.f4554.setTag(m.f4515, null);
            c0.m5341(this.f4552).mo5318(this.f4553);
            qVar.removeListener(this);
        }
    }

    /* compiled from: Visibility.java */
    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f4562;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f4563;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f4564;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4565;

        /* renamed from: ʿ, reason: contains not printable characters */
        ViewGroup f4566;

        /* renamed from: ˆ, reason: contains not printable characters */
        ViewGroup f4567;

        c() {
        }
    }

    public s0() {
        this.mMode = 3;
    }

    private void captureValues(x xVar) {
        xVar.f4580.put(PROPNAME_VISIBILITY, Integer.valueOf(xVar.f4581.getVisibility()));
        xVar.f4580.put(PROPNAME_PARENT, xVar.f4581.getParent());
        int[] iArr = new int[2];
        xVar.f4581.getLocationOnScreen(iArr);
        xVar.f4580.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    private c getVisibilityChangeInfo(x xVar, x xVar2) {
        c cVar = new c();
        cVar.f4562 = false;
        cVar.f4563 = false;
        if (xVar == null || !xVar.f4580.containsKey(PROPNAME_VISIBILITY)) {
            cVar.f4564 = -1;
            cVar.f4566 = null;
        } else {
            cVar.f4564 = ((Integer) xVar.f4580.get(PROPNAME_VISIBILITY)).intValue();
            cVar.f4566 = (ViewGroup) xVar.f4580.get(PROPNAME_PARENT);
        }
        if (xVar2 == null || !xVar2.f4580.containsKey(PROPNAME_VISIBILITY)) {
            cVar.f4565 = -1;
            cVar.f4567 = null;
        } else {
            cVar.f4565 = ((Integer) xVar2.f4580.get(PROPNAME_VISIBILITY)).intValue();
            cVar.f4567 = (ViewGroup) xVar2.f4580.get(PROPNAME_PARENT);
        }
        if (xVar != null && xVar2 != null) {
            int i5 = cVar.f4564;
            int i6 = cVar.f4565;
            if (i5 == i6 && cVar.f4566 == cVar.f4567) {
                return cVar;
            }
            if (i5 != i6) {
                if (i5 == 0) {
                    cVar.f4563 = false;
                    cVar.f4562 = true;
                } else if (i6 == 0) {
                    cVar.f4563 = true;
                    cVar.f4562 = true;
                }
            } else if (cVar.f4567 == null) {
                cVar.f4563 = false;
                cVar.f4562 = true;
            } else if (cVar.f4566 == null) {
                cVar.f4563 = true;
                cVar.f4562 = true;
            }
        } else if (xVar == null && cVar.f4565 == 0) {
            cVar.f4563 = true;
            cVar.f4562 = true;
        } else if (xVar2 == null && cVar.f4564 == 0) {
            cVar.f4563 = false;
            cVar.f4562 = true;
        }
        return cVar;
    }

    @Override // androidx.transition.q
    public void captureEndValues(x xVar) {
        captureValues(xVar);
    }

    @Override // androidx.transition.q
    public void captureStartValues(x xVar) {
        captureValues(xVar);
    }

    @Override // androidx.transition.q
    public Animator createAnimator(ViewGroup viewGroup, x xVar, x xVar2) {
        c visibilityChangeInfo = getVisibilityChangeInfo(xVar, xVar2);
        if (!visibilityChangeInfo.f4562) {
            return null;
        }
        if (visibilityChangeInfo.f4566 == null && visibilityChangeInfo.f4567 == null) {
            return null;
        }
        return visibilityChangeInfo.f4563 ? onAppear(viewGroup, xVar, visibilityChangeInfo.f4564, xVar2, visibilityChangeInfo.f4565) : onDisappear(viewGroup, xVar, visibilityChangeInfo.f4564, xVar2, visibilityChangeInfo.f4565);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.q
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.q
    public boolean isTransitionRequired(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f4580.containsKey(PROPNAME_VISIBILITY) != xVar.f4580.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        c visibilityChangeInfo = getVisibilityChangeInfo(xVar, xVar2);
        if (visibilityChangeInfo.f4562) {
            return visibilityChangeInfo.f4564 == 0 || visibilityChangeInfo.f4565 == 0;
        }
        return false;
    }

    public boolean isVisible(x xVar) {
        if (xVar == null) {
            return false;
        }
        return ((Integer) xVar.f4580.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) xVar.f4580.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    public void setMode(int i5) {
        if ((i5 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i5;
    }

    public Animator onAppear(ViewGroup viewGroup, x xVar, int i5, x xVar2, int i6) {
        if ((this.mMode & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.f4581.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f4562) {
                return null;
            }
        }
        return onAppear(viewGroup, xVar2.f4581, xVar, xVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f A[PHI: r8
  0x008f: PHI (r8v3 android.view.View) = 
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v6 android.view.View)
 binds: [B:36:0x0048, B:40:0x0057, B:45:0x007c, B:47:0x007f, B:49:0x0085, B:51:0x0089, B:43:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r18, androidx.transition.x r19, int r20, androidx.transition.x r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.s0.onDisappear(android.view.ViewGroup, androidx.transition.x, int, androidx.transition.x, int):android.animation.Animator");
    }

    @SuppressLint({"RestrictedApi"})
    public s0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f4525);
        int m2146 = androidx.core.content.res.q.m2146(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (m2146 != 0) {
            setMode(m2146);
        }
    }

    /* compiled from: Visibility.java */
    private static class b extends AnimatorListenerAdapter implements q.g {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final View f4556;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int f4557;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final ViewGroup f4558;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final boolean f4559;

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f4560;

        /* renamed from: ˊ, reason: contains not printable characters */
        boolean f4561 = false;

        b(View view, int i5, boolean z5) {
            this.f4556 = view;
            this.f4557 = i5;
            this.f4558 = (ViewGroup) view.getParent();
            this.f4559 = z5;
            m5399(true);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private void m5398() {
            if (!this.f4561) {
                f0.m5357(this.f4556, this.f4557);
                ViewGroup viewGroup = this.f4558;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m5399(false);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private void m5399(boolean z5) {
            ViewGroup viewGroup;
            if (!this.f4559 || this.f4560 == z5 || (viewGroup = this.f4558) == null) {
                return;
            }
            this.f4560 = z5;
            c0.m5343(viewGroup, z5);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4561 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m5398();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f4561) {
                return;
            }
            f0.m5357(this.f4556, this.f4557);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f4561) {
                return;
            }
            f0.m5357(this.f4556, 0);
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʽ */
        public void mo5335(q qVar) {
            m5399(false);
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʾ */
        public void mo5336(q qVar) {
            m5399(true);
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            m5398();
            qVar.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʻ */
        public void mo5348(q qVar) {
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʼ */
        public void mo5334(q qVar) {
        }
    }
}
