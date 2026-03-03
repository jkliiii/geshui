package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.u2;
import androidx.appcompat.widget.w1;
import androidx.core.view.f1;
import androidx.core.view.q4;
import androidx.core.view.r4;
import androidx.core.view.s4;
import androidx.core.view.t4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f0 extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static final Interpolator f442 = new AccelerateInterpolator();

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private static final Interpolator f443 = new DecelerateInterpolator();

    /* renamed from: ʻ, reason: contains not printable characters */
    Context f444;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Context f446;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Activity f447;

    /* renamed from: ʾ, reason: contains not printable characters */
    ActionBarOverlayLayout f449;

    /* renamed from: ʿ, reason: contains not printable characters */
    ActionBarContainer f450;

    /* renamed from: ˆ, reason: contains not printable characters */
    w1 f451;

    /* renamed from: ˈ, reason: contains not printable characters */
    ActionBarContextView f452;

    /* renamed from: ˉ, reason: contains not printable characters */
    View f453;

    /* renamed from: ˊ, reason: contains not printable characters */
    u2 f454;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f457;

    /* renamed from: ˑ, reason: contains not printable characters */
    d f458;

    /* renamed from: י, reason: contains not printable characters */
    androidx.appcompat.view.b f459;

    /* renamed from: ـ, reason: contains not printable characters */
    b.a f460;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f461;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    boolean f463;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f464;

    /* renamed from: ᵢ, reason: contains not printable characters */
    boolean f468;

    /* renamed from: ⁱ, reason: contains not printable characters */
    boolean f469;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean f470;

    /* renamed from: ﾞ, reason: contains not printable characters */
    androidx.appcompat.view.h f472;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean f473;

    /* renamed from: ˋ, reason: contains not printable characters */
    private ArrayList<Object> f455 = new ArrayList<>();

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f456 = -1;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private ArrayList<a.b> f462 = new ArrayList<>();

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f466 = 0;

    /* renamed from: ᵔ, reason: contains not printable characters */
    boolean f467 = true;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f471 = true;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    final r4 f465 = new a();

    /* renamed from: ʻʻ, reason: contains not printable characters */
    final r4 f445 = new b();

    /* renamed from: ʽʽ, reason: contains not printable characters */
    final t4 f448 = new c();

    /* compiled from: WindowDecorActionBar.java */
    class a extends s4 {
        a() {
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo561(View view) {
            View view2;
            f0 f0Var = f0.this;
            if (f0Var.f467 && (view2 = f0Var.f453) != null) {
                view2.setTranslationY(0.0f);
                f0.this.f450.setTranslationY(0.0f);
            }
            f0.this.f450.setVisibility(8);
            f0.this.f450.setTransitioning(false);
            f0 f0Var2 = f0.this;
            f0Var2.f472 = null;
            f0Var2.m560();
            ActionBarOverlayLayout actionBarOverlayLayout = f0.this.f449;
            if (actionBarOverlayLayout != null) {
                f1.m2827(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class b extends s4 {
        b() {
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ */
        public void mo561(View view) {
            f0 f0Var = f0.this;
            f0Var.f472 = null;
            f0Var.f450.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class c implements t4 {
        c() {
        }

        @Override // androidx.core.view.t4
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo562(View view) {
            ((View) f0.this.f450.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: ˆ, reason: contains not printable characters */
        private final Context f477;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final androidx.appcompat.view.menu.g f478;

        /* renamed from: ˉ, reason: contains not printable characters */
        private b.a f479;

        /* renamed from: ˊ, reason: contains not printable characters */
        private WeakReference<View> f480;

        public d(Context context, b.a aVar) {
            this.f477 = context;
            this.f479 = aVar;
            androidx.appcompat.view.menu.g defaultShowAsAction = new androidx.appcompat.view.menu.g(context).setDefaultShowAsAction(1);
            this.f478 = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʻ */
        public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f479;
            if (aVar != null) {
                return aVar.mo697(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʼ */
        public void mo529(androidx.appcompat.view.menu.g gVar) {
            if (this.f479 == null) {
                return;
            }
            mo569();
            f0.this.f452.m1012();
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo563() {
            f0 f0Var = f0.this;
            if (f0Var.f458 != this) {
                return;
            }
            if (f0.m547(f0Var.f468, f0Var.f469, false)) {
                this.f479.mo696(this);
            } else {
                f0 f0Var2 = f0.this;
                f0Var2.f459 = this;
                f0Var2.f460 = this.f479;
            }
            this.f479 = null;
            f0.this.m559(false);
            f0.this.f452.m1008();
            f0 f0Var3 = f0.this;
            f0Var3.f449.setHideOnContentScrollEnabled(f0Var3.f463);
            f0.this.f458 = null;
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ʾ, reason: contains not printable characters */
        public View mo564() {
            WeakReference<View> weakReference = this.f480;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ʿ, reason: contains not printable characters */
        public Menu mo565() {
            return this.f478;
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ˆ, reason: contains not printable characters */
        public MenuInflater mo566() {
            return new androidx.appcompat.view.g(this.f477);
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ˈ, reason: contains not printable characters */
        public CharSequence mo567() {
            return f0.this.f452.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ˊ, reason: contains not printable characters */
        public CharSequence mo568() {
            return f0.this.f452.getTitle();
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ˎ, reason: contains not printable characters */
        public void mo569() {
            if (f0.this.f458 != this) {
                return;
            }
            this.f478.stopDispatchingItemsChanged();
            try {
                this.f479.mo695(this, this.f478);
            } finally {
                this.f478.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ˏ, reason: contains not printable characters */
        public boolean mo570() {
            return f0.this.f452.m1010();
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ˑ, reason: contains not printable characters */
        public void mo571(View view) {
            f0.this.f452.setCustomView(view);
            this.f480 = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: י, reason: contains not printable characters */
        public void mo572(int i5) {
            mo573(f0.this.f444.getResources().getString(i5));
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ـ, reason: contains not printable characters */
        public void mo573(CharSequence charSequence) {
            f0.this.f452.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ᐧ, reason: contains not printable characters */
        public void mo574(int i5) {
            mo575(f0.this.f444.getResources().getString(i5));
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ᴵ, reason: contains not printable characters */
        public void mo575(CharSequence charSequence) {
            f0.this.f452.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        /* renamed from: ᵎ, reason: contains not printable characters */
        public void mo576(boolean z5) {
            super.mo576(z5);
            f0.this.f452.setTitleOptional(z5);
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        public boolean m577() {
            this.f478.stopDispatchingItemsChanged();
            try {
                return this.f479.mo698(this, this.f478);
            } finally {
                this.f478.startDispatchingItemsChanged();
            }
        }
    }

    public f0(Activity activity, boolean z5) {
        this.f447 = activity;
        View decorView = activity.getWindow().getDecorView();
        m542(decorView);
        if (z5) {
            return;
        }
        this.f453 = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    private w1 m540(View view) {
        if (view instanceof w1) {
            return (w1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private void m541() {
        if (this.f470) {
            this.f470 = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f449;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m545(false);
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m542(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(e.f.f7026);
        this.f449 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f451 = m540(view.findViewById(e.f.f6997));
        this.f452 = (ActionBarContextView) view.findViewById(e.f.f7007);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(e.f.f7001);
        this.f450 = actionBarContainer;
        w1 w1Var = this.f451;
        if (w1Var == null || this.f452 == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f444 = w1Var.getContext();
        boolean z5 = (this.f451.mo1350() & 4) != 0;
        if (z5) {
            this.f457 = true;
        }
        androidx.appcompat.view.a m827 = androidx.appcompat.view.a.m827(this.f444);
        mo489(m827.m828() || z5);
        m543(m827.m833());
        TypedArray obtainStyledAttributes = this.f444.obtainStyledAttributes(null, e.j.f7079, e.a.f6888, 0);
        if (obtainStyledAttributes.getBoolean(e.j.f7311, false)) {
            m555(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.j.f7287, 0);
        if (dimensionPixelSize != 0) {
            m556(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m543(boolean z5) {
        this.f464 = z5;
        if (z5) {
            this.f450.setTabContainer(null);
            this.f451.mo1345(this.f454);
        } else {
            this.f451.mo1345(null);
            this.f450.setTabContainer(this.f454);
        }
        boolean z6 = m551() == 2;
        u2 u2Var = this.f454;
        if (u2Var != null) {
            if (z6) {
                u2Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f449;
                if (actionBarOverlayLayout != null) {
                    f1.m2827(actionBarOverlayLayout);
                }
            } else {
                u2Var.setVisibility(8);
            }
        }
        this.f451.mo1360(!this.f464 && z6);
        this.f449.setHasNonEmbeddedTabs(!this.f464 && z6);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private boolean m544() {
        return f1.m2808(this.f450);
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private void m545(boolean z5) {
        if (m547(this.f468, this.f469, this.f470)) {
            if (this.f471) {
                return;
            }
            this.f471 = true;
            m558(z5);
            return;
        }
        if (this.f471) {
            this.f471 = false;
            m557(z5);
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private void m546() {
        if (this.f470) {
            return;
        }
        this.f470 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f449;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m545(false);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    static boolean m547(boolean z5, boolean z6, boolean z7) {
        if (z7) {
            return true;
        }
        return (z5 || z6) ? false : true;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i5) {
        this.f466 = i5;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo548() {
        if (this.f469) {
            this.f469 = false;
            m545(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo549() {
        androidx.appcompat.view.h hVar = this.f472;
        if (hVar != null) {
            hVar.m859();
            this.f472 = null;
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public int m551() {
        return this.f451.mo1355();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo552(boolean z5) {
        this.f467 = z5;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m553(int i5, int i6) {
        int mo1350 = this.f451.mo1350();
        if ((i6 & 4) != 0) {
            this.f457 = true;
        }
        this.f451.mo1349((i5 & i6) | ((i6 ^ (-1)) & mo1350));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    /* renamed from: ʿ, reason: contains not printable characters */
    public void mo554() {
        if (this.f469) {
            return;
        }
        this.f469 = true;
        m545(true);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˈ */
    public boolean mo476() {
        w1 w1Var = this.f451;
        if (w1Var == null || !w1Var.mo1348()) {
            return false;
        }
        this.f451.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˉ */
    public void mo477(boolean z5) {
        if (z5 == this.f461) {
            return;
        }
        this.f461 = z5;
        int size = this.f462.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f462.get(i5).onMenuVisibilityChanged(z5);
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public void m555(boolean z5) {
        if (z5 && !this.f449.m1033()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f463 = z5;
        this.f449.setHideOnContentScrollEnabled(z5);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˊ */
    public int mo478() {
        return this.f451.mo1350();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˋ */
    public Context mo479() {
        if (this.f446 == null) {
            TypedValue typedValue = new TypedValue();
            this.f444.getTheme().resolveAttribute(e.a.f6896, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                this.f446 = new ContextThemeWrapper(this.f444, i5);
            } else {
                this.f446 = this.f444;
            }
        }
        return this.f446;
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ˏ */
    public void mo481(Configuration configuration) {
        m543(androidx.appcompat.view.a.m827(this.f444).m833());
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: י */
    public boolean mo483(int i5, KeyEvent keyEvent) {
        Menu mo565;
        d dVar = this.f458;
        if (dVar == null || (mo565 = dVar.mo565()) == null) {
            return false;
        }
        mo565.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo565.performShortcut(i5, keyEvent, 0);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public void m556(float f5) {
        f1.m2840(this.f450, f5);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᐧ */
    public void mo486(boolean z5) {
        if (this.f457) {
            return;
        }
        mo487(z5);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m557(boolean z5) {
        View view;
        androidx.appcompat.view.h hVar = this.f472;
        if (hVar != null) {
            hVar.m859();
        }
        if (this.f466 != 0 || (!this.f473 && !z5)) {
            this.f465.mo561(null);
            return;
        }
        this.f450.setAlpha(1.0f);
        this.f450.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f5 = -this.f450.getHeight();
        if (z5) {
            this.f450.getLocationInWindow(new int[]{0, 0});
            f5 -= r5[1];
        }
        q4 m3293 = f1.m2864(this.f450).m3293(f5);
        m3293.m3291(this.f448);
        hVar2.m861(m3293);
        if (this.f467 && (view = this.f453) != null) {
            hVar2.m861(f1.m2864(view).m3293(f5));
        }
        hVar2.m864(f442);
        hVar2.m863(250L);
        hVar2.m865(this.f465);
        this.f472 = hVar2;
        hVar2.m866();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᴵ */
    public void mo487(boolean z5) {
        m553(z5 ? 4 : 0, 4);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m558(boolean z5) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f472;
        if (hVar != null) {
            hVar.m859();
        }
        this.f450.setVisibility(0);
        if (this.f466 == 0 && (this.f473 || z5)) {
            this.f450.setTranslationY(0.0f);
            float f5 = -this.f450.getHeight();
            if (z5) {
                this.f450.getLocationInWindow(new int[]{0, 0});
                f5 -= r5[1];
            }
            this.f450.setTranslationY(f5);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            q4 m3293 = f1.m2864(this.f450).m3293(0.0f);
            m3293.m3291(this.f448);
            hVar2.m861(m3293);
            if (this.f467 && (view2 = this.f453) != null) {
                view2.setTranslationY(f5);
                hVar2.m861(f1.m2864(this.f453).m3293(0.0f));
            }
            hVar2.m864(f443);
            hVar2.m863(250L);
            hVar2.m865(this.f445);
            this.f472 = hVar2;
            hVar2.m866();
        } else {
            this.f450.setAlpha(1.0f);
            this.f450.setTranslationY(0.0f);
            if (this.f467 && (view = this.f453) != null) {
                view.setTranslationY(0.0f);
            }
            this.f445.mo561(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f449;
        if (actionBarOverlayLayout != null) {
            f1.m2827(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᵎ */
    public void mo488(Drawable drawable) {
        this.f451.mo1359(drawable);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᵔ */
    public void mo489(boolean z5) {
        this.f451.mo1347(z5);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ᵢ */
    public void mo490(boolean z5) {
        androidx.appcompat.view.h hVar;
        this.f473 = z5;
        if (z5 || (hVar = this.f472) == null) {
            return;
        }
        hVar.m859();
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ⁱ */
    public void mo491(CharSequence charSequence) {
        this.f451.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    /* renamed from: ﹳ */
    public androidx.appcompat.view.b mo492(b.a aVar) {
        d dVar = this.f458;
        if (dVar != null) {
            dVar.mo563();
        }
        this.f449.setHideOnContentScrollEnabled(false);
        this.f452.m1011();
        d dVar2 = new d(this.f452.getContext(), aVar);
        if (!dVar2.m577()) {
            return null;
        }
        this.f458 = dVar2;
        dVar2.mo569();
        this.f452.m1009(dVar2);
        m559(true);
        return dVar2;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m559(boolean z5) {
        q4 mo1356;
        q4 mo1007;
        if (z5) {
            m546();
        } else {
            m541();
        }
        if (!m544()) {
            if (z5) {
                this.f451.mo1344(4);
                this.f452.setVisibility(0);
                return;
            } else {
                this.f451.mo1344(0);
                this.f452.setVisibility(8);
                return;
            }
        }
        if (z5) {
            mo1007 = this.f451.mo1356(4, 100L);
            mo1356 = this.f452.mo1007(0, 200L);
        } else {
            mo1356 = this.f451.mo1356(0, 200L);
            mo1007 = this.f452.mo1007(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.m862(mo1007, mo1356);
        hVar.m866();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    void m560() {
        b.a aVar = this.f460;
        if (aVar != null) {
            aVar.mo696(this.f459);
            this.f459 = null;
            this.f460 = null;
        }
    }

    public f0(Dialog dialog) {
        m542(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo550() {
    }
}
