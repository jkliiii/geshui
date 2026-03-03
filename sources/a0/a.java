package a0;

import a0.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.m0;
import androidx.core.view.accessibility.n0;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m.h;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Rect f8 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final b.a<j0> f9 = new C0003a();

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final b.InterfaceC0004b<h<j0>, j0> f10 = new b();

    /* renamed from: ʿ, reason: contains not printable characters */
    private final AccessibilityManager f15;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final View f16;

    /* renamed from: ˈ, reason: contains not printable characters */
    private c f17;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Rect f11 = new Rect();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Rect f12 = new Rect();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Rect f13 = new Rect();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int[] f14 = new int[2];

    /* renamed from: ˉ, reason: contains not printable characters */
    int f18 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f19 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f20 = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: a0.a$a, reason: collision with other inner class name */
    class C0003a implements b.a<j0> {
        C0003a() {
        }

        @Override // a0.b.a
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo44(j0 j0Var, Rect rect) {
            j0Var.m2688(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    class b implements b.InterfaceC0004b<h<j0>, j0> {
        b() {
        }

        @Override // a0.b.InterfaceC0004b
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public j0 mo46(h<j0> hVar, int i5) {
            return hVar.m9845(i5);
        }

        @Override // a0.b.InterfaceC0004b
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo47(h<j0> hVar) {
            return hVar.m9844();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    private class c extends m0 {
        c() {
        }

        @Override // androidx.core.view.accessibility.m0
        /* renamed from: ʼ, reason: contains not printable characters */
        public j0 mo50(int i5) {
            return j0.m2632(a.this.m40(i5));
        }

        @Override // androidx.core.view.accessibility.m0
        /* renamed from: ʾ, reason: contains not printable characters */
        public j0 mo51(int i5) {
            int i6 = i5 == 2 ? a.this.f18 : a.this.f19;
            if (i6 == Integer.MIN_VALUE) {
                return null;
            }
            return mo50(i6);
        }

        @Override // androidx.core.view.accessibility.m0
        /* renamed from: ˆ, reason: contains not printable characters */
        public boolean mo52(int i5, int i6, Bundle bundle) {
            return a.this.m26(i5, i6, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f16 = view;
        this.f15 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (f1.m2807(view) == 0) {
            f1.m2843(view, 1);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m7(int i5) {
        if (this.f18 != i5) {
            return false;
        }
        this.f18 = RecyclerView.UNDEFINED_DURATION;
        this.f16.invalidate();
        m29(i5, 65536);
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m8() {
        int i5 = this.f19;
        return i5 != Integer.MIN_VALUE && mo42(i5, 16, null);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private AccessibilityEvent m9(int i5, int i6) {
        return i5 != -1 ? m11(i5, i6) : m13(i6);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean m10(int i5, Bundle bundle) {
        return f1.m2819(this.f16, i5, bundle);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private AccessibilityEvent m11(int i5, int i6) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i6);
        j0 m40 = m40(i5);
        obtain.getText().add(m40.m2700());
        obtain.setContentDescription(m40.m2694());
        obtain.setScrollable(m40.m2681());
        obtain.setPassword(m40.m2682());
        obtain.setEnabled(m40.m2678());
        obtain.setChecked(m40.m2675());
        m36(i5, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m40.m2693());
        n0.m2724(obtain, this.f16, i5);
        obtain.setPackageName(this.f16.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private boolean m12(int i5, int i6, Bundle bundle) {
        return i6 != 1 ? i6 != 2 ? i6 != 64 ? i6 != 128 ? mo42(i5, i6, bundle) : m7(i5) : m19(i5) : m25(i5) : m28(i5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private AccessibilityEvent m13(int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        this.f16.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private j0 m14(int i5) {
        j0 m2625 = j0.m2625();
        m2625.m2647(true);
        m2625.m2649(true);
        m2625.m2641("android.view.View");
        Rect rect = f8;
        m2625.m2703(rect);
        m2625.m2638(rect);
        m2625.m2657(this.f16);
        mo24(i5, m2625);
        if (m2625.m2700() == null && m2625.m2694() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m2625.m2688(this.f12);
        if (this.f12.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int m2686 = m2625.m2686();
        if ((m2686 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((m2686 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        m2625.m2655(this.f16.getContext().getPackageName());
        m2625.m2668(this.f16, i5);
        if (this.f18 == i5) {
            m2625.m2701(true);
            m2625.m2636(128);
        } else {
            m2625.m2701(false);
            m2625.m2636(64);
        }
        boolean z5 = this.f19 == i5;
        if (z5) {
            m2625.m2636(2);
        } else if (m2625.m2677()) {
            m2625.m2636(1);
        }
        m2625.m2650(z5);
        this.f16.getLocationOnScreen(this.f14);
        m2625.m2689(this.f11);
        if (this.f11.equals(rect)) {
            m2625.m2688(this.f11);
            if (m2625.f2855 != -1) {
                j0 m26252 = j0.m2625();
                for (int i6 = m2625.f2855; i6 != -1; i6 = m26252.f2855) {
                    m26252.m2658(this.f16, -1);
                    m26252.m2703(f8);
                    mo24(i6, m26252);
                    m26252.m2688(this.f12);
                    Rect rect2 = this.f11;
                    Rect rect3 = this.f12;
                    rect2.offset(rect3.left, rect3.top);
                }
                m26252.m2697();
            }
            this.f11.offset(this.f14[0] - this.f16.getScrollX(), this.f14[1] - this.f16.getScrollY());
        }
        if (this.f16.getLocalVisibleRect(this.f13)) {
            this.f13.offset(this.f14[0] - this.f16.getScrollX(), this.f14[1] - this.f16.getScrollY());
            if (this.f11.intersect(this.f13)) {
                m2625.m2638(this.f11);
                if (m21(this.f11)) {
                    m2625.m2672(true);
                }
            }
        }
        return m2625;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private void m15(int i5) {
        int i6 = this.f20;
        if (i6 == i5) {
            return;
        }
        this.f20 = i5;
        m29(i5, 128);
        m29(i6, 256);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private j0 m16() {
        j0 m2627 = j0.m2627(this.f16);
        f1.m2817(this.f16, m2627);
        ArrayList arrayList = new ArrayList();
        mo35(arrayList);
        if (m2627.m2691() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            m2627.m2676(this.f16, ((Integer) arrayList.get(i5)).intValue());
        }
        return m2627;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private h<j0> m17() {
        ArrayList arrayList = new ArrayList();
        mo35(arrayList);
        h<j0> hVar = new h<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            hVar.m9843(arrayList.get(i5).intValue(), m14(arrayList.get(i5).intValue()));
        }
        return hVar;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m18(int i5, Rect rect) {
        m40(i5).m2688(rect);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean m19(int i5) {
        int i6;
        if (!this.f15.isEnabled() || !this.f15.isTouchExplorationEnabled() || (i6 = this.f18) == i5) {
            return false;
        }
        if (i6 != Integer.MIN_VALUE) {
            m7(i6);
        }
        this.f18 = i5;
        this.f16.invalidate();
        m29(i5, 32768);
        return true;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static Rect m20(View view, int i5, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i5 == 17) {
            rect.set(width, 0, width, height);
        } else if (i5 == 33) {
            rect.set(0, height, width, height);
        } else if (i5 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean m21(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f16.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f16.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static int m22(int i5) {
        if (i5 == 19) {
            return 33;
        }
        if (i5 != 21) {
            return i5 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean m23(int i5, Rect rect) {
        j0 j0Var;
        h<j0> m17 = m17();
        int i6 = this.f19;
        int i7 = RecyclerView.UNDEFINED_DURATION;
        j0 m9839 = i6 == Integer.MIN_VALUE ? null : m17.m9839(i6);
        if (i5 == 1 || i5 == 2) {
            j0Var = (j0) a0.b.m56(m17, f10, f9, m9839, i5, f1.m2834(this.f16) == 1, false);
        } else {
            if (i5 != 17 && i5 != 33 && i5 != 66 && i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i8 = this.f19;
            if (i8 != Integer.MIN_VALUE) {
                m18(i8, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m20(this.f16, i5, rect2);
            }
            j0Var = (j0) a0.b.m55(m17, f10, f9, m9839, rect2, i5);
        }
        if (j0Var != null) {
            i7 = m17.m9842(m17.m9841(j0Var));
        }
        return m28(i7);
    }

    @Override // androidx.core.view.a
    public m0 getAccessibilityNodeProvider(View view) {
        if (this.f17 == null) {
            this.f17 = new c();
        }
        return this.f17;
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        m43(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
        super.onInitializeAccessibilityNodeInfo(view, j0Var);
        mo38(j0Var);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    protected abstract void mo24(int i5, j0 j0Var);

    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean m25(int i5) {
        if (this.f19 != i5) {
            return false;
        }
        this.f19 = RecyclerView.UNDEFINED_DURATION;
        mo27(i5, false);
        m29(i5, 8);
        return true;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    boolean m26(int i5, int i6, Bundle bundle) {
        return i5 != -1 ? m12(i5, i6, bundle) : m10(i6, bundle);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public final boolean m28(int i5) {
        int i6;
        if ((!this.f16.isFocused() && !this.f16.requestFocus()) || (i6 = this.f19) == i5) {
            return false;
        }
        if (i6 != Integer.MIN_VALUE) {
            m25(i6);
        }
        if (i5 == Integer.MIN_VALUE) {
            return false;
        }
        this.f19 = i5;
        mo27(i5, true);
        m29(i5, 8);
        return true;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public final boolean m29(int i5, int i6) {
        ViewParent parent;
        if (i5 == Integer.MIN_VALUE || !this.f15.isEnabled() || (parent = this.f16.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f16, m9(i5, i6));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m30(MotionEvent motionEvent) {
        if (!this.f15.isEnabled() || !this.f15.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int mo34 = mo34(motionEvent.getX(), motionEvent.getY());
            m15(mo34);
            return mo34 != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f20 == Integer.MIN_VALUE) {
            return false;
        }
        m15(RecyclerView.UNDEFINED_DURATION);
        return true;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m31(KeyEvent keyEvent) {
        int i5 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return m23(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return m23(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int m22 = m22(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z5 = false;
                    while (i5 < repeatCount && m23(m22, null)) {
                        i5++;
                        z5 = true;
                    }
                    return z5;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        m8();
        return true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m32() {
        return this.f18;
    }

    /* renamed from: י, reason: contains not printable characters */
    public final int m33() {
        return this.f19;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    protected abstract int mo34(float f5, float f6);

    /* renamed from: ٴ, reason: contains not printable characters */
    protected abstract void mo35(List<Integer> list);

    /* renamed from: ᴵ, reason: contains not printable characters */
    public final void m37(int i5) {
        m39(i5, 0);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public final void m39(int i5, int i6) {
        ViewParent parent;
        if (i5 == Integer.MIN_VALUE || !this.f15.isEnabled() || (parent = this.f16.getParent()) == null) {
            return;
        }
        AccessibilityEvent m9 = m9(i5, 2048);
        androidx.core.view.accessibility.b.m2598(m9, i6);
        parent.requestSendAccessibilityEvent(this.f16, m9);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    j0 m40(int i5) {
        return i5 == -1 ? m16() : m14(i5);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public final void m41(boolean z5, int i5, Rect rect) {
        int i6 = this.f19;
        if (i6 != Integer.MIN_VALUE) {
            m25(i6);
        }
        if (z5) {
            m23(i5, rect);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    protected abstract boolean mo42(int i5, int i6, Bundle bundle);

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    protected void mo38(j0 j0Var) {
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    protected void m43(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    protected void mo27(int i5, boolean z5) {
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected void m36(int i5, AccessibilityEvent accessibilityEvent) {
    }
}
