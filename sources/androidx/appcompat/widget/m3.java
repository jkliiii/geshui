package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.y3;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class m3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: י, reason: contains not printable characters */
    private static m3 f1363;

    /* renamed from: ـ, reason: contains not printable characters */
    private static m3 f1364;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final View f1365;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final CharSequence f1366;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f1367;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Runnable f1368 = new Runnable() { // from class: androidx.appcompat.widget.k3
        @Override // java.lang.Runnable
        public final void run() {
            this.f1353.m1430();
        }
    };

    /* renamed from: ˉ, reason: contains not printable characters */
    private final Runnable f1369 = new Runnable() { // from class: androidx.appcompat.widget.l3
        @Override // java.lang.Runnable
        public final void run() {
            this.f1359.m1435();
        }
    };

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f1370;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f1371;

    /* renamed from: ˎ, reason: contains not printable characters */
    private n3 f1372;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f1373;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f1374;

    private m3(View view, CharSequence charSequence) {
        this.f1365 = view;
        this.f1366 = charSequence;
        this.f1367 = y3.m3448(ViewConfiguration.get(view.getContext()));
        m1429();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m1428() {
        this.f1365.removeCallbacks(this.f1368);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m1429() {
        this.f1374 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿ, reason: contains not printable characters */
    public /* synthetic */ void m1430() {
        m1436(false);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m1431() {
        this.f1365.postDelayed(this.f1368, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static void m1432(m3 m3Var) {
        m3 m3Var2 = f1363;
        if (m3Var2 != null) {
            m3Var2.m1428();
        }
        f1363 = m3Var;
        if (m3Var != null) {
            m3Var.m1431();
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m1433(View view, CharSequence charSequence) {
        m3 m3Var = f1363;
        if (m3Var != null && m3Var.f1365 == view) {
            m1432(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m3(view, charSequence);
            return;
        }
        m3 m3Var2 = f1364;
        if (m3Var2 != null && m3Var2.f1365 == view) {
            m3Var2.m1435();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean m1434(MotionEvent motionEvent) {
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        if (!this.f1374 && Math.abs(x5 - this.f1370) <= this.f1367 && Math.abs(y5 - this.f1371) <= this.f1367) {
            return false;
        }
        this.f1370 = x5;
        this.f1371 = y5;
        this.f1374 = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1372 != null && this.f1373) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1365.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1429();
                m1435();
            }
        } else if (this.f1365.isEnabled() && this.f1372 == null && m1434(motionEvent)) {
            m1432(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1370 = view.getWidth() / 2;
        this.f1371 = view.getHeight() / 2;
        m1436(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1435();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m1435() {
        if (f1364 == this) {
            f1364 = null;
            n3 n3Var = this.f1372;
            if (n3Var != null) {
                n3Var.m1443();
                this.f1372 = null;
                m1429();
                this.f1365.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1363 == this) {
            m1432(null);
        }
        this.f1365.removeCallbacks(this.f1369);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m1436(boolean z5) {
        long longPressTimeout;
        long j5;
        long j6;
        if (androidx.core.view.f1.m2903(this.f1365)) {
            m1432(null);
            m3 m3Var = f1364;
            if (m3Var != null) {
                m3Var.m1435();
            }
            f1364 = this;
            this.f1373 = z5;
            n3 n3Var = new n3(this.f1365.getContext());
            this.f1372 = n3Var;
            n3Var.m1445(this.f1365, this.f1370, this.f1371, this.f1373, this.f1366);
            this.f1365.addOnAttachStateChangeListener(this);
            if (this.f1373) {
                j6 = 2500;
            } else {
                if ((androidx.core.view.f1.m2895(this.f1365) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 15000;
                }
                j6 = j5 - longPressTimeout;
            }
            this.f1365.removeCallbacks(this.f1369);
            this.f1365.postDelayed(this.f1369, j6);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
