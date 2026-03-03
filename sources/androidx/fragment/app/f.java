package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.b;
import androidx.lifecycle.l;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import n0.d;

/* compiled from: FragmentActivity.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends androidx.activity.h implements b.d, b.e {

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    boolean f3529;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    boolean f3533;

    /* renamed from: ﹶ, reason: contains not printable characters */
    final i f3531 = i.m4090(new c());

    /* renamed from: ﾞ, reason: contains not printable characters */
    final androidx.lifecycle.q f3532 = new androidx.lifecycle.q(this);

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    boolean f3530 = true;

    /* compiled from: FragmentActivity.java */
    class a implements d.c {
        a() {
        }

        @Override // n0.d.c
        /* renamed from: ʻ */
        public Bundle mo369() {
            Bundle bundle = new Bundle();
            f.this.m4039();
            f.this.f3532.m4485(l.a.ON_STOP);
            Parcelable m4113 = f.this.f3531.m4113();
            if (m4113 != null) {
                bundle.putParcelable("android:support:fragments", m4113);
            }
            return bundle;
        }
    }

    /* compiled from: FragmentActivity.java */
    class b implements b.b {
        b() {
        }

        @Override // b.b
        /* renamed from: ʻ */
        public void mo370(Context context) {
            f.this.f3531.m4091(null);
            Bundle m10403 = f.this.getSavedStateRegistry().m10403("android:support:fragments");
            if (m10403 != null) {
                f.this.f3531.m4112(m10403.getParcelable("android:support:fragments"));
            }
        }
    }

    /* compiled from: FragmentActivity.java */
    class c extends k<f> implements s0, androidx.activity.s, c.e, r {
        public c() {
            super(f.this);
        }

        @Override // androidx.lifecycle.p
        public androidx.lifecycle.l getLifecycle() {
            return f.this.f3532;
        }

        @Override // androidx.activity.s
        public androidx.activity.q getOnBackPressedDispatcher() {
            return f.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.s0
        public r0 getViewModelStore() {
            return f.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.r
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4044(n nVar, e eVar) {
            f.this.m4041(eVar);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.h
        /* renamed from: ʽ */
        public View mo4007(int i5) {
            return f.this.findViewById(i5);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.h
        /* renamed from: ʾ */
        public boolean mo4008() {
            Window window = f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.k
        /* renamed from: ˊ, reason: contains not printable characters */
        public LayoutInflater mo4046() {
            return f.this.getLayoutInflater().cloneInContext(f.this);
        }

        @Override // androidx.fragment.app.k
        /* renamed from: ˎ, reason: contains not printable characters */
        public boolean mo4047(e eVar) {
            return !f.this.isFinishing();
        }

        @Override // androidx.fragment.app.k
        /* renamed from: ˏ, reason: contains not printable characters */
        public boolean mo4048(String str) {
            return androidx.core.app.b.m1933(f.this, str);
        }

        @Override // c.e
        /* renamed from: י */
        public c.d mo383() {
            return f.this.mo383();
        }

        @Override // androidx.fragment.app.k
        /* renamed from: ٴ, reason: contains not printable characters */
        public void mo4049() {
            f.this.mo515();
        }

        @Override // androidx.fragment.app.k
        /* renamed from: ᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public f mo4045() {
            return f.this;
        }
    }

    public f() {
        m4036();
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m4036() {
        getSavedStateRegistry().m10408("android:support:fragments", new a());
        m384(new b());
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private static boolean m4037(n nVar, l.b bVar) {
        boolean z5 = false;
        for (e eVar : nVar.m4182()) {
            if (eVar != null) {
                if (eVar.getHost() != null) {
                    z5 |= m4037(eVar.getChildFragmentManager(), bVar);
                }
                e0 e0Var = eVar.mViewLifecycleOwner;
                if (e0Var != null && e0Var.getLifecycle().mo4445().m4455(l.b.STARTED)) {
                    eVar.mViewLifecycleOwner.m4035(bVar);
                    z5 = true;
                }
                if (eVar.mLifecycleRegistry.mo4445().m4455(l.b.STARTED)) {
                    eVar.mLifecycleRegistry.m4487(bVar);
                    z5 = true;
                }
            }
        }
        return z5;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3533);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3529);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3530);
        if (getApplication() != null) {
            androidx.loader.app.a.m4518(this).mo4519(str2, fileDescriptor, printWriter, strArr);
        }
        this.f3531.m4109().m4252(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.h, android.app.Activity
    protected void onActivityResult(int i5, int i6, Intent intent) {
        this.f3531.m4110();
        super.onActivityResult(i5, i6, intent);
    }

    @Override // androidx.activity.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f3531.m4110();
        super.onConfigurationChanged(configuration);
        this.f3531.m4093(configuration);
    }

    @Override // androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3532.m4485(l.a.ON_CREATE);
        this.f3531.m4095();
    }

    @Override // androidx.activity.h, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, Menu menu) {
        return i5 == 0 ? super.onCreatePanelMenu(i5, menu) | this.f3531.m4096(menu, getMenuInflater()) : super.onCreatePanelMenu(i5, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m4038 = m4038(view, str, context, attributeSet);
        return m4038 == null ? super.onCreateView(view, str, context, attributeSet) : m4038;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f3531.m4097();
        this.f3532.m4485(l.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f3531.m4098();
    }

    @Override // androidx.activity.h, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 0) {
            return this.f3531.m4100(menuItem);
        }
        if (i5 != 6) {
            return false;
        }
        return this.f3531.m4094(menuItem);
    }

    @Override // androidx.activity.h, android.app.Activity
    public void onMultiWindowModeChanged(boolean z5) {
        this.f3531.m4099(z5);
    }

    @Override // androidx.activity.h, android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f3531.m4110();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.h, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        if (i5 == 0) {
            this.f3531.m4101(menu);
        }
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f3529 = false;
        this.f3531.m4102();
        this.f3532.m4485(l.a.ON_PAUSE);
    }

    @Override // androidx.activity.h, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5) {
        this.f3531.m4103(z5);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m4042();
    }

    @Override // androidx.activity.h, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, View view, Menu menu) {
        return i5 == 0 ? m4040(view, menu) | this.f3531.m4104(menu) : super.onPreparePanel(i5, view, menu);
    }

    @Override // androidx.activity.h, android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        this.f3531.m4110();
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f3531.m4110();
        super.onResume();
        this.f3529 = true;
        this.f3531.m4108();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f3531.m4110();
        super.onStart();
        this.f3530 = false;
        if (!this.f3533) {
            this.f3533 = true;
            this.f3531.m4092();
        }
        this.f3531.m4108();
        this.f3532.m4485(l.a.ON_START);
        this.f3531.m4106();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f3531.m4110();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f3530 = true;
        m4039();
        this.f3531.m4107();
        this.f3532.m4485(l.a.ON_STOP);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    final View m4038(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3531.m4111(view, str, context, attributeSet);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    void m4039() {
        while (m4037(m4043(), l.b.CREATED)) {
        }
    }

    @Deprecated
    /* renamed from: ˊˊ, reason: contains not printable characters */
    protected boolean m4040(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Deprecated
    /* renamed from: ˎˎ */
    public void mo515() {
        invalidateOptionsMenu();
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    protected void m4042() {
        this.f3532.m4485(l.a.ON_RESUME);
        this.f3531.m4105();
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public n m4043() {
        return this.f3531.m4109();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m4038 = m4038(null, str, context, attributeSet);
        return m4038 == null ? super.onCreateView(str, context, attributeSet) : m4038;
    }

    @Override // androidx.core.app.b.e
    @Deprecated
    /* renamed from: ʼ */
    public final void mo1942(int i5) {
    }

    @Deprecated
    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void m4041(e eVar) {
    }
}
