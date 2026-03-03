package h3;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;

/* compiled from: SoftHideKeyBoardUtil.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o2 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private View f8323;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f8324;

    /* renamed from: ʽ, reason: contains not printable characters */
    private FrameLayout.LayoutParams f8325;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f8326;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f8327 = true;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f8328 = 0;

    /* compiled from: SoftHideKeyBoardUtil.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f8329 = -1;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f8330;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f8331;

        a(View view, View view2) {
            this.f8330 = view;
            this.f8331 = view2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if ((this.f8330.getSystemUiVisibility() & 1024) == 0) {
                return;
            }
            Rect rect = new Rect();
            this.f8330.getWindowVisibleDisplayFrame(rect);
            int height = this.f8330.getHeight();
            int i5 = height - rect.bottom;
            if (this.f8329 != i5) {
                this.f8329 = i5;
                double d6 = i5;
                double d7 = height;
                Double.isNaN(d7);
                if (d6 > d7 * 0.15d) {
                    o2.m8962(this.f8331, true, i5);
                } else {
                    o2.m8962(this.f8331, false, 0);
                }
            }
        }
    }

    private o2(Activity activity) {
        View findViewById = activity.findViewById(R.id.content);
        if (findViewById instanceof FrameLayout) {
            View childAt = ((FrameLayout) findViewById).getChildAt(0);
            this.f8323 = childAt;
            if (childAt == null) {
                return;
            }
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: h3.n2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f8318.m8966();
                }
            });
            this.f8325 = (FrameLayout.LayoutParams) this.f8323.getLayoutParams();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m8962(View view, boolean z5, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z5) {
                marginLayoutParams.bottomMargin = i5;
            } else {
                marginLayoutParams.bottomMargin = 0;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m8963(Activity activity) {
        new o2(activity);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m8964(Window window, View view) {
        if (window == null || view == null) {
            return;
        }
        View decorView = window.getDecorView();
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new a(decorView, view));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private int m8965() {
        Rect rect = new Rect();
        this.f8323.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public /* synthetic */ void m8966() {
        if (this.f8327) {
            this.f8326 = this.f8323.getHeight();
            this.f8327 = false;
        }
        m8967();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m8967() {
        int m8965 = m8965();
        if (m8965 == this.f8324 && m8965 == this.f8326) {
            return;
        }
        if (m8965 != this.f8326) {
            this.f8326 = m8965;
        }
        int height = this.f8323.getRootView().getHeight();
        int i5 = height - m8965;
        if (i5 > height / 4) {
            this.f8325.height = (height - i5) + this.f8328;
        } else {
            this.f8325.height = this.f8326;
        }
        this.f8323.requestLayout();
        this.f8324 = m8965;
    }
}
