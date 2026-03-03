package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.q4;
import androidx.core.view.s4;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h3 implements w1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    Toolbar f1315;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f1316;

    /* renamed from: ʽ, reason: contains not printable characters */
    private View f1317;

    /* renamed from: ʾ, reason: contains not printable characters */
    private View f1318;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Drawable f1319;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Drawable f1320;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Drawable f1321;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f1322;

    /* renamed from: ˊ, reason: contains not printable characters */
    CharSequence f1323;

    /* renamed from: ˋ, reason: contains not printable characters */
    private CharSequence f1324;

    /* renamed from: ˎ, reason: contains not printable characters */
    private CharSequence f1325;

    /* renamed from: ˏ, reason: contains not printable characters */
    Window.Callback f1326;

    /* renamed from: ˑ, reason: contains not printable characters */
    boolean f1327;

    /* renamed from: י, reason: contains not printable characters */
    private c f1328;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f1329;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f1330;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private Drawable f1331;

    /* compiled from: ToolbarWidgetWrapper.java */
    class a implements View.OnClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final androidx.appcompat.view.menu.a f1332;

        a() {
            this.f1332 = new androidx.appcompat.view.menu.a(h3.this.f1315.getContext(), 0, R.id.home, 0, 0, h3.this.f1323);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h3 h3Var = h3.this;
            Window.Callback callback = h3Var.f1326;
            if (callback == null || !h3Var.f1327) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1332);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    class b extends s4 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f1334 = false;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ int f1335;

        b(int i5) {
            this.f1335 = i5;
        }

        @Override // androidx.core.view.s4, androidx.core.view.r4
        /* renamed from: ʻ */
        public void mo1132(View view) {
            this.f1334 = true;
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ */
        public void mo561(View view) {
            if (this.f1334) {
                return;
            }
            h3.this.f1315.setVisibility(this.f1335);
        }

        @Override // androidx.core.view.s4, androidx.core.view.r4
        /* renamed from: ʽ */
        public void mo694(View view) {
            h3.this.f1315.setVisibility(0);
        }
    }

    public h3(Toolbar toolbar, boolean z5) {
        this(toolbar, z5, e.h.f7059, e.e.f6978);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m1326(CharSequence charSequence) {
        this.f1323 = charSequence;
        if ((this.f1316 & 8) != 0) {
            this.f1315.setTitle(charSequence);
            if (this.f1322) {
                androidx.core.view.f1.m2835(this.f1315.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m1327() {
        if ((this.f1316 & 4) == 0) {
            this.f1315.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1315;
        Drawable drawable = this.f1321;
        if (drawable == null) {
            drawable = this.f1331;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m1328() {
        Drawable drawable;
        int i5 = this.f1316;
        if ((i5 & 2) == 0) {
            drawable = null;
        } else if ((i5 & 1) != 0) {
            drawable = this.f1320;
            if (drawable == null) {
                drawable = this.f1319;
            }
        } else {
            drawable = this.f1319;
        }
        this.f1315.setLogo(drawable);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private void m1329() {
        if ((this.f1316 & 4) != 0) {
            if (TextUtils.isEmpty(this.f1325)) {
                this.f1315.setNavigationContentDescription(this.f1330);
            } else {
                this.f1315.setNavigationContentDescription(this.f1325);
            }
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int m1330() {
        if (this.f1315.getNavigationIcon() == null) {
            return 11;
        }
        this.f1331 = this.f1315.getNavigationIcon();
        return 15;
    }

    @Override // androidx.appcompat.widget.w1
    public void collapseActionView() {
        this.f1315.collapseActionView();
    }

    @Override // androidx.appcompat.widget.w1
    public Context getContext() {
        return this.f1315.getContext();
    }

    @Override // androidx.appcompat.widget.w1
    public CharSequence getTitle() {
        return this.f1315.getTitle();
    }

    @Override // androidx.appcompat.widget.w1
    public void setIcon(int i5) {
        setIcon(i5 != 0 ? f.a.m8475(getContext(), i5) : null);
    }

    @Override // androidx.appcompat.widget.w1
    public void setWindowCallback(Window.Callback callback) {
        this.f1326 = callback;
    }

    @Override // androidx.appcompat.widget.w1
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1322) {
            return;
        }
        m1326(charSequence);
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo1331(Menu menu, m.a aVar) {
        if (this.f1328 == null) {
            c cVar = new c(this.f1315.getContext());
            this.f1328 = cVar;
            cVar.m905(e.f.f7009);
        }
        this.f1328.setCallback(aVar);
        this.f1315.setMenu((androidx.appcompat.view.menu.g) menu, this.f1328);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public void m1332(int i5) {
        m1336(i5 == 0 ? null : getContext().getString(i5));
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean mo1333() {
        return this.f1315.isOverflowMenuShowing();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public void m1334(CharSequence charSequence) {
        this.f1324 = charSequence;
        if ((this.f1316 & 8) != 0) {
            this.f1315.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo1335() {
        this.f1327 = true;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m1336(CharSequence charSequence) {
        this.f1325 = charSequence;
        m1329();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean mo1337() {
        return this.f1315.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean mo1338() {
        return this.f1315.hideOverflowMenu();
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m1339(CharSequence charSequence) {
        this.f1322 = true;
        m1326(charSequence);
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean mo1340() {
        return this.f1315.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean mo1341() {
        return this.f1315.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo1342() {
        this.f1315.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo1343(m.a aVar, g.a aVar2) {
        this.f1315.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo1344(int i5) {
        this.f1315.setVisibility(i5);
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo1345(u2 u2Var) {
        View view = this.f1317;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1315;
            if (parent == toolbar) {
                toolbar.removeView(this.f1317);
            }
        }
        this.f1317 = u2Var;
        if (u2Var == null || this.f1329 != 2) {
            return;
        }
        this.f1315.addView(u2Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1317.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f402 = 8388691;
        u2Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˏ, reason: contains not printable characters */
    public ViewGroup mo1346() {
        return this.f1315;
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: י, reason: contains not printable characters */
    public boolean mo1348() {
        return this.f1315.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ـ, reason: contains not printable characters */
    public void mo1349(int i5) {
        View view;
        int i6 = this.f1316 ^ i5;
        this.f1316 = i5;
        if (i6 != 0) {
            if ((i6 & 4) != 0) {
                if ((i5 & 4) != 0) {
                    m1329();
                }
                m1327();
            }
            if ((i6 & 3) != 0) {
                m1328();
            }
            if ((i6 & 8) != 0) {
                if ((i5 & 8) != 0) {
                    this.f1315.setTitle(this.f1323);
                    this.f1315.setSubtitle(this.f1324);
                } else {
                    this.f1315.setTitle((CharSequence) null);
                    this.f1315.setSubtitle((CharSequence) null);
                }
            }
            if ((i6 & 16) == 0 || (view = this.f1318) == null) {
                return;
            }
            if ((i5 & 16) != 0) {
                this.f1315.addView(view);
            } else {
                this.f1315.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ٴ, reason: contains not printable characters */
    public int mo1350() {
        return this.f1316;
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ᐧ, reason: contains not printable characters */
    public Menu mo1351() {
        return this.f1315.getMenu();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m1352(int i5) {
        if (i5 == this.f1330) {
            return;
        }
        this.f1330 = i5;
        if (TextUtils.isEmpty(this.f1315.getNavigationContentDescription())) {
            m1332(this.f1330);
        }
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ᴵ, reason: contains not printable characters */
    public void mo1353(int i5) {
        m1354(i5 != 0 ? f.a.m8475(getContext(), i5) : null);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m1354(Drawable drawable) {
        this.f1320 = drawable;
        m1328();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ᵎ, reason: contains not printable characters */
    public int mo1355() {
        return this.f1329;
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ᵔ, reason: contains not printable characters */
    public q4 mo1356(int i5, long j5) {
        return androidx.core.view.f1.m2864(this.f1315).m3284(i5 == 0 ? 1.0f : 0.0f).m3287(j5).m3289(new b(i5));
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ᵢ, reason: contains not printable characters */
    public void mo1357() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ⁱ, reason: contains not printable characters */
    public void mo1358() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ﹳ, reason: contains not printable characters */
    public void mo1359(Drawable drawable) {
        this.f1321 = drawable;
        m1327();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ﹶ, reason: contains not printable characters */
    public void mo1360(boolean z5) {
        this.f1315.setCollapsible(z5);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m1361(View view) {
        View view2 = this.f1318;
        if (view2 != null && (this.f1316 & 16) != 0) {
            this.f1315.removeView(view2);
        }
        this.f1318 = view;
        if (view == null || (this.f1316 & 16) == 0) {
            return;
        }
        this.f1315.addView(view);
    }

    public h3(Toolbar toolbar, boolean z5, int i5, int i6) {
        Drawable drawable;
        this.f1329 = 0;
        this.f1330 = 0;
        this.f1315 = toolbar;
        this.f1323 = toolbar.getTitle();
        this.f1324 = toolbar.getSubtitle();
        this.f1322 = this.f1323 != null;
        this.f1321 = toolbar.getNavigationIcon();
        d3 m1181 = d3.m1181(toolbar.getContext(), null, e.j.f7079, e.a.f6888, 0);
        this.f1331 = m1181.m1188(e.j.f7313);
        if (z5) {
            CharSequence m1197 = m1181.m1197(e.j.f7325);
            if (!TextUtils.isEmpty(m1197)) {
                m1339(m1197);
            }
            CharSequence m11972 = m1181.m1197(e.j.f7321);
            if (!TextUtils.isEmpty(m11972)) {
                m1334(m11972);
            }
            Drawable m1188 = m1181.m1188(e.j.f7317);
            if (m1188 != null) {
                m1354(m1188);
            }
            Drawable m11882 = m1181.m1188(e.j.f7315);
            if (m11882 != null) {
                setIcon(m11882);
            }
            if (this.f1321 == null && (drawable = this.f1331) != null) {
                mo1359(drawable);
            }
            mo1349(m1181.m1192(e.j.f7261, 0));
            int m1195 = m1181.m1195(e.j.f7235, 0);
            if (m1195 != 0) {
                m1361(LayoutInflater.from(this.f1315.getContext()).inflate(m1195, (ViewGroup) this.f1315, false));
                mo1349(this.f1316 | 16);
            }
            int m1194 = m1181.m1194(e.j.f7309, 0);
            if (m1194 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1315.getLayoutParams();
                layoutParams.height = m1194;
                this.f1315.setLayoutParams(layoutParams);
            }
            int m1186 = m1181.m1186(e.j.f7209, -1);
            int m11862 = m1181.m1186(e.j.f7183, -1);
            if (m1186 >= 0 || m11862 >= 0) {
                this.f1315.setContentInsetsRelative(Math.max(m1186, 0), Math.max(m11862, 0));
            }
            int m11952 = m1181.m1195(e.j.f7327, 0);
            if (m11952 != 0) {
                Toolbar toolbar2 = this.f1315;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), m11952);
            }
            int m11953 = m1181.m1195(e.j.f7323, 0);
            if (m11953 != 0) {
                Toolbar toolbar3 = this.f1315;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), m11953);
            }
            int m11954 = m1181.m1195(e.j.f7319, 0);
            if (m11954 != 0) {
                this.f1315.setPopupTheme(m11954);
            }
        } else {
            this.f1316 = m1330();
        }
        m1181.m1201();
        m1352(i5);
        this.f1325 = this.f1315.getNavigationContentDescription();
        this.f1315.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.w1
    public void setIcon(Drawable drawable) {
        this.f1319 = drawable;
        m1328();
    }

    @Override // androidx.appcompat.widget.w1
    /* renamed from: ˑ, reason: contains not printable characters */
    public void mo1347(boolean z5) {
    }
}
