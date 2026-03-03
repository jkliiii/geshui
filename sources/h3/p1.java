package h3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.f5;
import androidx.core.view.t6;
import androidx.core.view.u4;
import androidx.recyclerview.widget.RecyclerView;
import com.lt.app.App;
import com.lt.plugin.IPluginModel;
import java.util.Iterator;
import java.util.List;

/* compiled from: LTOption.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p1 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final n3.d f8342;

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f8341 = false;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f8344 = -1;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f8345 = true;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final b f8343 = b.m9015();

    /* compiled from: LTOption.java */
    public static class a implements IPluginModel {
        public String backgroundColor;
        private int mBackgroundColor;
        public Boolean overlays;
        public Boolean visible;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean m9013(a aVar) {
            boolean z5 = false;
            if (aVar == null) {
                return false;
            }
            Boolean bool = aVar.visible;
            if (bool != null && !bool.equals(this.visible)) {
                this.visible = aVar.visible;
                z5 = true;
            }
            String str = aVar.backgroundColor;
            if (str != null && !str.equals(this.backgroundColor)) {
                int m10881 = n3.z1.m10881(aVar.backgroundColor, -16777216);
                this.mBackgroundColor = m10881;
                this.backgroundColor = n3.z1.m10940(m10881);
                z5 = true;
            }
            Boolean bool2 = aVar.overlays;
            if (bool2 == null || bool2.equals(this.overlays)) {
                return z5;
            }
            this.overlays = aVar.overlays;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʾ, reason: contains not printable characters */
        public int m9014() {
            return this.mBackgroundColor;
        }
    }

    /* compiled from: LTOption.java */
    public static class b implements IPluginModel {
        public a navigationBar;
        public c screenOrientation;
        public d statusBar;
        public e theme;
        public f titleBar;

        /* renamed from: ʻ, reason: contains not printable characters */
        public static b m9015() {
            b bVar = new b();
            e eVar = new e();
            eVar.theme = "default";
            e eVar2 = new e();
            bVar.theme = eVar2;
            eVar2.m9023(eVar);
            d dVar = new d();
            dVar.visible = Boolean.TRUE;
            dVar.contentStyle = "default";
            dVar.backgroundColor = "#000";
            Boolean bool = Boolean.FALSE;
            dVar.overlays = bool;
            f fVar = new f();
            fVar.visible = bool;
            fVar.contentColor = "#FFF";
            fVar.backgroundColor = dVar.backgroundColor;
            d dVar2 = new d();
            bVar.statusBar = dVar2;
            dVar2.m9020(dVar, fVar);
            f fVar2 = new f();
            bVar.titleBar = fVar2;
            fVar2.m9027(fVar, dVar);
            c cVar = new c();
            cVar.screenOrientation = "default";
            c cVar2 = new c();
            bVar.screenOrientation = cVar2;
            cVar2.m9017(cVar);
            a aVar = new a();
            aVar.visible = dVar.visible;
            aVar.backgroundColor = dVar.backgroundColor;
            aVar.overlays = dVar.overlays;
            a aVar2 = new a();
            bVar.navigationBar = aVar2;
            aVar2.m9013(aVar);
            return bVar;
        }
    }

    /* compiled from: LTOption.java */
    public static class c implements IPluginModel {
        public String screenOrientation;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m9017(c cVar) {
            String str;
            if (cVar == null || (str = cVar.screenOrientation) == null || str.equals(this.screenOrientation)) {
                return false;
            }
            this.screenOrientation = ("landscape".equals(cVar.screenOrientation) || "portrait".equals(cVar.screenOrientation)) ? cVar.screenOrientation : "auto";
            return true;
        }
    }

    /* compiled from: LTOption.java */
    public static class d implements IPluginModel {
        public String backgroundColor;
        public String contentStyle;
        public int height;
        private int mBackgroundColor;
        public Boolean overlays;
        public Boolean visible;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean m9020(d dVar, f fVar) {
            boolean z5 = false;
            if (dVar == null) {
                return false;
            }
            Boolean bool = dVar.visible;
            if (bool != null && !bool.equals(this.visible)) {
                this.visible = dVar.visible;
                z5 = true;
            }
            String str = dVar.contentStyle;
            if (str != null && !str.equals(this.contentStyle)) {
                this.contentStyle = p1.m8992(dVar.contentStyle);
                z5 = true;
            }
            String str2 = dVar.backgroundColor;
            if (str2 != null && !str2.equals(this.backgroundColor)) {
                int m10881 = n3.z1.m10881(dVar.backgroundColor, -16777216);
                this.mBackgroundColor = m10881;
                this.backgroundColor = n3.z1.m10940(m10881);
                z5 = true;
            }
            Boolean bool2 = dVar.overlays;
            if (bool2 != null && !bool2.equals(this.overlays)) {
                this.overlays = dVar.overlays;
                z5 = true;
            }
            if (!this.overlays.booleanValue() || !this.visible.booleanValue() || !fVar.visible.booleanValue()) {
                return z5;
            }
            this.overlays = Boolean.FALSE;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʾ, reason: contains not printable characters */
        public int m9021() {
            return this.mBackgroundColor;
        }
    }

    /* compiled from: LTOption.java */
    public static class e implements IPluginModel {
        public String theme;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m9023(e eVar) {
            String str;
            if (eVar == null || (str = eVar.theme) == null || str.equals(this.theme)) {
                return false;
            }
            this.theme = p1.m8992(eVar.theme);
            return true;
        }
    }

    /* compiled from: LTOption.java */
    public static class f implements IPluginModel {
        public String backgroundColor;
        public String contentColor;
        private int mBackgroundColor;
        private int mContentColor;
        public Boolean visible;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean m9027(f fVar, d dVar) {
            boolean z5 = false;
            if (fVar == null) {
                return false;
            }
            Boolean bool = fVar.visible;
            if (bool != null && !bool.equals(this.visible)) {
                this.visible = fVar.visible;
                z5 = true;
            }
            String str = fVar.contentColor;
            if (str != null && !str.equals(this.contentColor)) {
                int m10881 = n3.z1.m10881(fVar.contentColor, -1);
                this.mContentColor = m10881;
                this.contentColor = n3.z1.m10940(m10881);
                z5 = true;
            }
            String str2 = fVar.backgroundColor;
            if (str2 != null && !str2.equals(this.backgroundColor)) {
                int m108812 = n3.z1.m10881(fVar.backgroundColor, -16777216);
                this.mBackgroundColor = m108812;
                this.backgroundColor = n3.z1.m10940(m108812);
                z5 = true;
            }
            if (!this.visible.booleanValue() || !dVar.visible.booleanValue() || !dVar.overlays.booleanValue()) {
                return z5;
            }
            dVar.overlays = Boolean.FALSE;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʿ, reason: contains not printable characters */
        public int m9028() {
            return this.mBackgroundColor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˆ, reason: contains not printable characters */
        public int m9029() {
            return this.mContentColor;
        }
    }

    public p1(n3.d dVar) {
        this.f8342 = dVar;
        Window window = dVar.getWindow();
        if (window != null) {
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            androidx.core.view.f1.m2846(window.getDecorView(), new androidx.core.view.u0() { // from class: h3.o1
                @Override // androidx.core.view.u0
                /* renamed from: ʻ */
                public final f5 mo691(View view, f5 f5Var) {
                    return this.f8322.m8996(view, f5Var);
                }
            });
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m8985() {
        Window window = this.f8342.getWindow();
        t6 m3368 = u4.m3368(window, window.getDecorView());
        if (this.f8343.navigationBar.visible.booleanValue()) {
            m3368.m3335(f5.m.m3131());
        } else {
            m3368.m3330(f5.m.m3131());
            if (m3368.m3329() != 2) {
                m3368.m3334(2);
            }
        }
        if (!this.f8343.navigationBar.visible.booleanValue() || this.f8343.navigationBar.overlays.booleanValue()) {
            window.addFlags(134217728);
            m8990();
        } else {
            window.clearFlags(134217728);
            if (Build.VERSION.SDK_INT >= 21) {
                window.setNavigationBarColor(this.f8343.navigationBar.m9014());
            }
            if (m8995(this.f8342)) {
                window.setBackgroundDrawable(new ColorDrawable(this.f8343.navigationBar.m9014()));
            }
        }
        m8991();
        if (this.f8344 != -1) {
            this.f8344 = -1;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m8986() {
        int i5 = "landscape".equals(this.f8343.screenOrientation.screenOrientation) ? 0 : "portrait".equals(this.f8343.screenOrientation.screenOrientation) ? 1 : -1;
        if (this.f8342.getRequestedOrientation() != i5) {
            this.f8342.setRequestedOrientation(i5);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m8987() {
        Window window = this.f8342.getWindow();
        View decorView = window.getDecorView();
        t6 m3368 = u4.m3368(window, decorView);
        if (this.f8343.statusBar.visible.booleanValue()) {
            m3368.m3335(f5.m.m3132());
        } else {
            m3368.m3330(f5.m.m3132());
            if (m3368.m3329() != 2) {
                m3368.m3334(2);
            }
        }
        if (this.f8343.statusBar.overlays.booleanValue()) {
            if (!this.f8343.statusBar.visible.booleanValue()) {
                window.addFlags(1024);
                if (Build.VERSION.SDK_INT >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (attributes.layoutInDisplayCutoutMode != 1) {
                        attributes.layoutInDisplayCutoutMode = 1;
                        window.setAttributes(attributes);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1280);
                window.clearFlags(67108864);
                window.addFlags(RecyclerView.UNDEFINED_DURATION);
                window.setStatusBarColor(0);
            } else {
                window.addFlags(67108864);
            }
            m8990();
        } else if (m8995(this.f8342)) {
            window.setBackgroundDrawable(new ColorDrawable(this.f8343.statusBar.m9021()));
        } else {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                if (attributes2.layoutInDisplayCutoutMode != 0) {
                    attributes2.layoutInDisplayCutoutMode = 0;
                    window.setAttributes(attributes2);
                }
            }
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-1281));
            window.clearFlags(67109888);
            if (i5 >= 21) {
                window.setStatusBarColor(this.f8343.statusBar.m9021());
            }
        }
        m8991();
        m3368.m3333(!"light".equalsIgnoreCase(this.f8343.statusBar.contentStyle));
        if (this.f8344 != -1) {
            this.f8344 = -1;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m8988() {
        Boolean bool;
        int i5;
        if ("dark".equalsIgnoreCase(this.f8343.theme.theme)) {
            bool = Boolean.TRUE;
            i5 = 2;
        } else if ("light".equalsIgnoreCase(this.f8343.theme.theme)) {
            bool = Boolean.FALSE;
            i5 = 1;
        } else {
            bool = null;
            i5 = -1;
        }
        if (androidx.appcompat.app.g.m587() != i5) {
            androidx.appcompat.app.g.m582(i5);
            if (this.f8342.mo7924() instanceof j2.f) {
                ((j2.f) this.f8342.mo7924()).setForceDark(bool);
            }
            if (this.f8344 != -1) {
                this.f8344 = -1;
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m8989() {
        n3.d dVar = this.f8342;
        x mo7927 = dVar instanceof com.lt.app.b ? ((com.lt.app.b) dVar).mo7927() : null;
        if (mo7927 == null) {
            return;
        }
        mo7927.setVisible(this.f8343.titleBar.visible.booleanValue());
        if (this.f8343.titleBar.visible.booleanValue()) {
            mo7927.mo7951(this.f8343.titleBar.m9029());
            mo7927.mo7950(this.f8343.titleBar.m9028());
        }
        if (this.f8344 != -1) {
            this.f8344 = -1;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m8990() {
        if (this.f8341) {
            return;
        }
        this.f8341 = true;
        o2.m8964(this.f8342.getWindow(), this.f8342.mo7926());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m8991() {
        /*
            r6 = this;
            n3.d r0 = r6.f8342
            android.view.View r0 = r0.mo7925()
            if (r0 == 0) goto L13
            n3.d r0 = r6.f8342
            android.view.View r0 = r0.mo7925()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L14
        L13:
            r0 = 0
        L14:
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 != 0) goto L19
            return
        L19:
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            n3.d r2 = r6.f8342
            boolean r2 = m8995(r2)
            r3 = 0
            if (r2 == 0) goto L6f
            h3.p1$b r2 = r6.f8343
            h3.p1$d r2 = r2.statusBar
            java.lang.Boolean r2 = r2.overlays
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L36
            int r2 = r6.m8993()
            goto L37
        L36:
            r2 = 0
        L37:
            h3.p1$b r4 = r6.f8343
            h3.p1$a r4 = r4.navigationBar
            java.lang.Boolean r4 = r4.visible
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6d
            h3.p1$b r4 = r6.f8343
            h3.p1$a r4 = r4.navigationBar
            java.lang.Boolean r4 = r4.overlays
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L6d
            n3.d r3 = r6.f8342
            android.view.WindowManager r3 = r3.getWindowManager()
            android.view.WindowMetrics r3 = com.google.android.material.internal.n.m6960(r3)
            android.view.WindowInsets r3 = h3.l1.m8957(r3)
            int r4 = androidx.core.view.l6.m3202()
            android.graphics.Insets r3 = androidx.core.view.i6.m3160(r3, r4)
            int r3 = androidx.appcompat.widget.a2.m1136(r3)
            r5 = r3
            r3 = r2
            r2 = r5
            goto L99
        L6d:
            r3 = r2
            goto L98
        L6f:
            h3.p1$b r2 = r6.f8343
            h3.p1$d r2 = r2.statusBar
            java.lang.Boolean r2 = r2.overlays
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L98
            h3.p1$b r2 = r6.f8343
            h3.p1$a r2 = r2.navigationBar
            java.lang.Boolean r2 = r2.visible
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L93
            h3.p1$b r2 = r6.f8343
            h3.p1$a r2 = r2.navigationBar
            java.lang.Boolean r2 = r2.overlays
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L98
        L93:
            int r2 = r6.m8993()
            goto L6d
        L98:
            r2 = 0
        L99:
            int r4 = r1.topMargin
            if (r4 != r3) goto La1
            int r4 = r1.bottomMargin
            if (r4 == r2) goto Lae
        La1:
            r1.topMargin = r3
            r1.bottomMargin = r2
            n3.d r1 = r6.f8342
            android.view.View r1 = r1.mo7925()
            r1.setLayoutParams(r0)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.p1.m8991():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public static String m8992(String str) {
        return ("dark".equals(str) || "light".equals(str)) ? str : "default";
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private int m8993() {
        WindowInsets rootWindowInsets;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            return this.f8342.getWindowManager().getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars()).top;
        }
        if (i5 >= 23 && (rootWindowInsets = this.f8342.getWindow().getDecorView().getRootWindowInsets()) != null) {
            return rootWindowInsets.getSystemWindowInsetTop();
        }
        int identifier = this.f8342.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? this.f8342.getResources().getDimensionPixelSize(identifier) : n3.z1.m10946(this.f8342, 24.0f);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int m8994() {
        return (int) (m8993() / this.f8342.getResources().getDisplayMetrics().density);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static boolean m8995(Context context) {
        return Build.VERSION.SDK_INT >= 35 && context.getApplicationInfo().targetSdkVersion >= 35;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public /* synthetic */ f5 m8996(View view, f5 f5Var) {
        if (!this.f8343.statusBar.visible.booleanValue() && f5Var.m3081(f5.m.m3132())) {
            m8987();
        }
        if (!this.f8343.navigationBar.visible.booleanValue() && f5Var.m3081(f5.m.m3131())) {
            m8985();
        }
        return androidx.core.view.f1.m2816(view, f5Var);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public synchronized void m8997(String str) {
        List<l3.h> list;
        b bVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l3.a m7827 = App.m7827();
        if (m7827 != null && (list = m7827.uis) != null) {
            Iterator<l3.h> it = list.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                l3.h next = it.next();
                if (g3.a0.m8709(next.pattern, str)) {
                    bVar = next.ui;
                    break;
                }
                i5++;
            }
            if (this.f8345 || (i5 != this.f8344 && bVar != null)) {
                m9008(bVar);
                if (this.f8345) {
                    this.f8345 = false;
                }
                this.f8344 = i5;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public a m8998() {
        return this.f8343.navigationBar;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public b m8999() {
        return this.f8343;
    }

    /* renamed from: י, reason: contains not printable characters */
    public c m9000() {
        return this.f8343.screenOrientation;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public d m9001() {
        d dVar = this.f8343.statusBar;
        if (dVar != null) {
            dVar.height = m8994();
        }
        return dVar;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m9002(e eVar) {
        if (this.f8343.theme.m9023(eVar) || this.f8345) {
            m8988();
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public e m9003() {
        return this.f8343.theme;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m9004(f fVar) {
        b bVar = this.f8343;
        if (bVar.titleBar.m9027(fVar, bVar.statusBar) || this.f8345) {
            m8987();
            m8989();
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public f m9005() {
        return this.f8343.titleBar;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean m9006() {
        return "default".equals(this.f8343.theme.theme);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m9007(a aVar) {
        if (this.f8343.navigationBar.m9013(aVar) || this.f8345) {
            m8985();
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m9008(b bVar) {
        if (bVar == null) {
            return;
        }
        m9002(bVar.theme);
        m9007(bVar.navigationBar);
        m9004(bVar.titleBar);
        m9010(bVar.statusBar);
        m9009(bVar.screenOrientation);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public void m9009(c cVar) {
        if (this.f8343.screenOrientation.m9017(cVar) || this.f8345) {
            m8986();
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m9010(d dVar) {
        b bVar = this.f8343;
        if (bVar.statusBar.m9020(dVar, bVar.titleBar) || this.f8345) {
            m8987();
        }
    }
}
