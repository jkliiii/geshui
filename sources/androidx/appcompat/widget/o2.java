package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o2 extends h2 implements l2 {

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private static Method f1382;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private l2 f1383;

    /* compiled from: MenuPopupWindow.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1456(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1457(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1458(PopupWindow popupWindow, boolean z5) {
            popupWindow.setTouchModal(z5);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    public static class c extends e2 {

        /* renamed from: ᐧ, reason: contains not printable characters */
        final int f1384;

        /* renamed from: ᴵ, reason: contains not printable characters */
        final int f1385;

        /* renamed from: ᵎ, reason: contains not printable characters */
        private l2 f1386;

        /* renamed from: ᵔ, reason: contains not printable characters */
        private MenuItem f1387;

        /* compiled from: MenuPopupWindow.java */
        static class a {
            /* renamed from: ʻ, reason: contains not printable characters */
            static int m1459(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z5) {
            super(context, z5);
            if (1 == a.m1459(context.getResources().getConfiguration())) {
                this.f1384 = 21;
                this.f1385 = 22;
            } else {
                this.f1384 = 22;
                this.f1385 = 21;
            }
        }

        @Override // androidx.appcompat.widget.e2, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.e2, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.e2, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.e2, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.e2, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int i5;
            int pointToPosition;
            int i6;
            if (this.f1386 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    i5 = 0;
                }
                androidx.appcompat.view.menu.i item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i6 = pointToPosition - i5) < 0 || i6 >= fVar.getCount()) ? null : fVar.getItem(i6);
                MenuItem menuItem = this.f1387;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g m941 = fVar.m941();
                    if (menuItem != null) {
                        this.f1386.mo932(m941, menuItem);
                    }
                    this.f1387 = item;
                    if (item != null) {
                        this.f1386.mo931(m941, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i5, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i5 == this.f1384) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i5 != this.f1385) {
                return super.onKeyDown(i5, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) adapter).m941().close(false);
            return true;
        }

        @Override // androidx.appcompat.widget.e2, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(l2 l2Var) {
            this.f1386 = l2Var;
        }

        @Override // androidx.appcompat.widget.e2, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // androidx.appcompat.widget.e2
        /* renamed from: ʾ */
        public /* bridge */ /* synthetic */ int mo1226(int i5, int i6, int i7, int i8, int i9) {
            return super.mo1226(i5, i6, i7, i8, i9);
        }

        @Override // androidx.appcompat.widget.e2
        /* renamed from: ʿ */
        public /* bridge */ /* synthetic */ boolean mo1227(MotionEvent motionEvent, int i5) {
            return super.mo1227(motionEvent, i5);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1382 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public o2(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
    }

    @Override // androidx.appcompat.widget.l2
    /* renamed from: ʾ */
    public void mo931(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        l2 l2Var = this.f1383;
        if (l2Var != null) {
            l2Var.mo931(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.l2
    /* renamed from: ʿ */
    public void mo932(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        l2 l2Var = this.f1383;
        if (l2Var != null) {
            l2Var.mo932(gVar, menuItem);
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    public void m1452(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.m1456(this.f1284, (Transition) obj);
        }
    }

    @Override // androidx.appcompat.widget.h2
    /* renamed from: ᴵ */
    e2 mo1314(Context context, boolean z5) {
        c cVar = new c(context, z5);
        cVar.setHoverListener(this);
        return cVar;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public void m1453(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.m1457(this.f1284, (Transition) obj);
        }
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public void m1454(l2 l2Var) {
        this.f1383 = l2Var;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public void m1455(boolean z5) {
        if (Build.VERSION.SDK_INT > 28) {
            b.m1458(this.f1284, z5);
            return;
        }
        Method method = f1382;
        if (method != null) {
            try {
                method.invoke(this.f1284, Boolean.valueOf(z5));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
