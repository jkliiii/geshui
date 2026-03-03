package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;

/* compiled from: PopupMenu.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class q2 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f1404;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final androidx.appcompat.view.menu.g f1405;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final View f1406;

    /* renamed from: ʾ, reason: contains not printable characters */
    final androidx.appcompat.view.menu.l f1407;

    /* renamed from: ʿ, reason: contains not printable characters */
    c f1408;

    /* compiled from: PopupMenu.java */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            q2.this.getClass();
        }
    }

    /* compiled from: PopupMenu.java */
    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public q2(Context context, View view) {
        this(context, view, 0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public Menu m1485() {
        return this.f1405;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m1486(c cVar) {
        this.f1408 = cVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m1487() {
        this.f1407.m998();
    }

    public q2(Context context, View view, int i5) {
        this(context, view, i5, e.a.f6895, 0);
    }

    public q2(Context context, View view, int i5, int i6, int i7) {
        this.f1404 = context;
        this.f1406 = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f1405 = gVar;
        gVar.setCallback(new a());
        androidx.appcompat.view.menu.l lVar = new androidx.appcompat.view.menu.l(context, gVar, view, false, i6, i7);
        this.f1407 = lVar;
        lVar.m995(i5);
        lVar.m996(new b());
    }

    /* compiled from: PopupMenu.java */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʻ */
        public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            c cVar = q2.this.f1408;
            if (cVar != null) {
                return cVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʼ */
        public void mo529(androidx.appcompat.view.menu.g gVar) {
        }
    }
}
