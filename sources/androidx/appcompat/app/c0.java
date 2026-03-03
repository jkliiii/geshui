package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h3;
import androidx.appcompat.widget.w1;
import androidx.core.view.f1;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c0 extends androidx.appcompat.app.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    final w1 f416;

    /* renamed from: ʼ, reason: contains not printable characters */
    final Window.Callback f417;

    /* renamed from: ʽ, reason: contains not printable characters */
    final h.InterfaceC0013h f418;

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean f419;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f420;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f421;

    /* renamed from: ˈ, reason: contains not printable characters */
    private ArrayList<a.b> f422 = new ArrayList<>();

    /* renamed from: ˉ, reason: contains not printable characters */
    private final Runnable f423 = new a();

    /* renamed from: ˊ, reason: contains not printable characters */
    private final Toolbar.h f424;

    /* compiled from: ToolbarActionBar.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.m525();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return c0.this.f417.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class c implements m.a {

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f427;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z5) {
            if (this.f427) {
                return;
            }
            this.f427 = true;
            c0.this.f416.mo1342();
            c0.this.f417.onPanelClosed(108, gVar);
            this.f427 = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo527(androidx.appcompat.view.menu.g gVar) {
            c0.this.f417.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo529(androidx.appcompat.view.menu.g gVar) {
            if (c0.this.f416.mo1333()) {
                c0.this.f417.onPanelClosed(108, gVar);
            } else if (c0.this.f417.onPreparePanel(0, null, gVar)) {
                c0.this.f417.onMenuOpened(108, gVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private class e implements h.InterfaceC0013h {
        e() {
        }

        @Override // androidx.appcompat.app.h.InterfaceC0013h
        public View onCreatePanelView(int i5) {
            if (i5 == 0) {
                return new View(c0.this.f416.getContext());
            }
            return null;
        }

        @Override // androidx.appcompat.app.h.InterfaceC0013h
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo530(int i5) {
            if (i5 != 0) {
                return false;
            }
            c0 c0Var = c0.this;
            if (c0Var.f419) {
                return false;
            }
            c0Var.f416.mo1335();
            c0.this.f419 = true;
            return false;
        }
    }

    c0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f424 = bVar;
        androidx.core.util.h.m2583(toolbar);
        h3 h3Var = new h3(toolbar, false);
        this.f416 = h3Var;
        this.f417 = (Window.Callback) androidx.core.util.h.m2583(callback);
        h3Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        h3Var.setWindowTitle(charSequence);
        this.f418 = new e();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private Menu m524() {
        if (!this.f420) {
            this.f416.mo1343(new c(), new d());
            this.f420 = true;
        }
        return this.f416.mo1351();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˆ */
    public boolean mo475() {
        return this.f416.mo1338();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˈ */
    public boolean mo476() {
        if (!this.f416.mo1348()) {
            return false;
        }
        this.f416.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˉ */
    public void mo477(boolean z5) {
        if (z5 == this.f421) {
            return;
        }
        this.f421 = z5;
        int size = this.f422.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f422.get(i5).onMenuVisibilityChanged(z5);
        }
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˊ */
    public int mo478() {
        return this.f416.mo1350();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˋ */
    public Context mo479() {
        return this.f416.getContext();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˎ */
    public boolean mo480() {
        this.f416.mo1346().removeCallbacks(this.f423);
        f1.m2822(this.f416.mo1346(), this.f423);
        return true;
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˏ */
    public void mo481(Configuration configuration) {
        super.mo481(configuration);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˑ */
    void mo482() {
        this.f416.mo1346().removeCallbacks(this.f423);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: י */
    public boolean mo483(int i5, KeyEvent keyEvent) {
        Menu m524 = m524();
        if (m524 == null) {
            return false;
        }
        m524.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return m524.performShortcut(i5, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ـ */
    public boolean mo484(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo485();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ٴ */
    public boolean mo485() {
        return this.f416.mo1340();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᴵ */
    public void mo487(boolean z5) {
        m526(z5 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᵎ */
    public void mo488(Drawable drawable) {
        this.f416.mo1359(drawable);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ⁱ */
    public void mo491(CharSequence charSequence) {
        this.f416.setWindowTitle(charSequence);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m525() {
        Menu m524 = m524();
        androidx.appcompat.view.menu.g gVar = m524 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) m524 : null;
        if (gVar != null) {
            gVar.stopDispatchingItemsChanged();
        }
        try {
            m524.clear();
            if (!this.f417.onCreatePanelMenu(0, m524) || !this.f417.onPreparePanel(0, null, m524)) {
                m524.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.startDispatchingItemsChanged();
            }
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m526(int i5, int i6) {
        this.f416.mo1349((i5 & i6) | ((i6 ^ (-1)) & this.f416.mo1350()));
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᐧ */
    public void mo486(boolean z5) {
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᵔ */
    public void mo489(boolean z5) {
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᵢ */
    public void mo490(boolean z5) {
    }
}
