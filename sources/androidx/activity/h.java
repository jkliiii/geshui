package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.view.x;
import androidx.lifecycle.c0;
import androidx.lifecycle.h0;
import androidx.lifecycle.l;
import androidx.lifecycle.o0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import d.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import n0.d;

/* compiled from: ComponentActivity.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends androidx.core.app.n implements s0, androidx.lifecycle.j, n0.f, s, c.e, n {

    /* renamed from: ˆ, reason: contains not printable characters */
    final b.a f204 = new b.a();

    /* renamed from: ˈ, reason: contains not printable characters */
    private final x f205 = new x(new Runnable() { // from class: androidx.activity.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f200.m387();
        }
    });

    /* renamed from: ˉ, reason: contains not printable characters */
    private final androidx.lifecycle.q f206 = new androidx.lifecycle.q(this);

    /* renamed from: ˊ, reason: contains not printable characters */
    final n0.e f207;

    /* renamed from: ˋ, reason: contains not printable characters */
    private r0 f208;

    /* renamed from: ˎ, reason: contains not printable characters */
    private q f209;

    /* renamed from: ˏ, reason: contains not printable characters */
    final j f210;

    /* renamed from: ˑ, reason: contains not printable characters */
    final m f211;

    /* renamed from: י, reason: contains not printable characters */
    private int f212;

    /* renamed from: ـ, reason: contains not printable characters */
    private final AtomicInteger f213;

    /* renamed from: ٴ, reason: contains not printable characters */
    private final c.d f214;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<androidx.core.util.a<Configuration>> f215;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<androidx.core.util.a<Integer>> f216;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<androidx.core.util.a<Intent>> f217;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<androidx.core.util.a<androidx.core.app.o>> f218;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<androidx.core.util.a<androidx.core.app.s>> f219;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f220;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean f221;

    /* compiled from: ComponentActivity.java */
    class a extends c.d {

        /* compiled from: ComponentActivity.java */
        /* renamed from: androidx.activity.h$a$a, reason: collision with other inner class name */
        class RunnableC0010a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ int f223;

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ a.C0098a f224;

            RunnableC0010a(int i5, a.C0098a c0098a) {
                this.f223 = i5;
                this.f224 = c0098a;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.m5731(this.f223, this.f224.m8148());
            }
        }

        /* compiled from: ComponentActivity.java */
        class b implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ int f226;

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ IntentSender.SendIntentException f227;

            b(int i5, IntentSender.SendIntentException sendIntentException) {
                this.f226 = i5;
                this.f227 = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.m5730(this.f226, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f227));
            }
        }

        a() {
        }

        @Override // c.d
        /* renamed from: ˆ, reason: contains not printable characters */
        public <I, O> void mo388(int i5, d.a<I, O> aVar, I i6, androidx.core.app.f fVar) {
            Bundle bundle;
            h hVar = h.this;
            a.C0098a<O> mo8147 = aVar.mo8147(hVar, i6);
            if (mo8147 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0010a(i5, mo8147));
                return;
            }
            Intent mo4263 = aVar.mo4263(hVar, i6);
            if (mo4263.getExtras() != null && mo4263.getExtras().getClassLoader() == null) {
                mo4263.setExtrasClassLoader(hVar.getClassLoader());
            }
            if (mo4263.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = mo4263.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo4263.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo4263.getAction())) {
                String[] stringArrayExtra = mo4263.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.m1932(hVar, stringArrayExtra, i5);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo4263.getAction())) {
                androidx.core.app.b.m1934(hVar, mo4263, i5, bundle);
                return;
            }
            c.f fVar2 = (c.f) mo4263.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.b.m1935(hVar, fVar2.m5742(), i5, fVar2.m5739(), fVar2.m5740(), fVar2.m5741(), 0, bundle);
            } catch (IntentSender.SendIntentException e5) {
                new Handler(Looper.getMainLooper()).post(new b(i5, e5));
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    class b implements androidx.lifecycle.n {
        b() {
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo389(androidx.lifecycle.p pVar, l.a aVar) {
            if (aVar == l.a.ON_STOP) {
                Window window = h.this.getWindow();
                View peekDecorView = window != null ? window.peekDecorView() : null;
                if (peekDecorView != null) {
                    g.m390(peekDecorView);
                }
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    class c implements androidx.lifecycle.n {
        c() {
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ */
        public void mo389(androidx.lifecycle.p pVar, l.a aVar) {
            if (aVar == l.a.ON_DESTROY) {
                h.this.f204.m5632();
                if (!h.this.isChangingConfigurations()) {
                    h.this.getViewModelStore().m4492();
                }
                h.this.f210.mo392();
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    class d implements androidx.lifecycle.n {
        d() {
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ */
        public void mo389(androidx.lifecycle.p pVar, l.a aVar) {
            h.this.m385();
            h.this.getLifecycle().mo4446(this);
        }
    }

    /* compiled from: ComponentActivity.java */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h.super.onBackPressed();
            } catch (IllegalStateException e5) {
                if (!TextUtils.equals(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e5;
                }
            } catch (NullPointerException e6) {
                if (!TextUtils.equals(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e6;
                }
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    class f implements androidx.lifecycle.n {
        f() {
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ */
        public void mo389(androidx.lifecycle.p pVar, l.a aVar) {
            if (aVar != l.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            h.this.f209.m428(C0011h.m391((h) pVar));
        }
    }

    /* compiled from: ComponentActivity.java */
    static class g {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m390(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* compiled from: ComponentActivity.java */
    /* renamed from: androidx.activity.h$h, reason: collision with other inner class name */
    static class C0011h {
        /* renamed from: ʻ, reason: contains not printable characters */
        static OnBackInvokedDispatcher m391(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* compiled from: ComponentActivity.java */
    static final class i {

        /* renamed from: ʻ, reason: contains not printable characters */
        Object f234;

        /* renamed from: ʼ, reason: contains not printable characters */
        r0 f235;

        i() {
        }
    }

    /* compiled from: ComponentActivity.java */
    private interface j extends Executor {
        /* renamed from: ʽ, reason: contains not printable characters */
        void mo392();

        /* renamed from: ˉ, reason: contains not printable characters */
        void mo393(View view);
    }

    /* compiled from: ComponentActivity.java */
    class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: ʿ, reason: contains not printable characters */
        Runnable f237;

        /* renamed from: ʾ, reason: contains not printable characters */
        final long f236 = SystemClock.uptimeMillis() + 10000;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f238 = false;

        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʼ, reason: contains not printable characters */
        public /* synthetic */ void m395() {
            Runnable runnable = this.f237;
            if (runnable != null) {
                runnable.run();
                this.f237 = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f237 = runnable;
            View decorView = h.this.getWindow().getDecorView();
            if (!this.f238) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f240.m395();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f237;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f236) {
                    this.f238 = false;
                    h.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f237 = null;
            if (h.this.f211.m400()) {
                this.f238 = false;
                h.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.h.j
        /* renamed from: ʽ */
        public void mo392() {
            h.this.getWindow().getDecorView().removeCallbacks(this);
            h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.h.j
        /* renamed from: ˉ */
        public void mo393(View view) {
            if (this.f238) {
                return;
            }
            this.f238 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public h() {
        n0.e m10410 = n0.e.m10410(this);
        this.f207 = m10410;
        this.f209 = null;
        j m379 = m379();
        this.f210 = m379;
        this.f211 = new m(m379, new e4.a() { // from class: androidx.activity.e
            @Override // e4.a
            /* renamed from: ʼ, reason: contains not printable characters */
            public final Object mo368() {
                return this.f201.m373();
            }
        });
        this.f213 = new AtomicInteger();
        this.f214 = new a();
        this.f215 = new CopyOnWriteArrayList<>();
        this.f216 = new CopyOnWriteArrayList<>();
        this.f217 = new CopyOnWriteArrayList<>();
        this.f218 = new CopyOnWriteArrayList<>();
        this.f219 = new CopyOnWriteArrayList<>();
        this.f220 = false;
        this.f221 = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i5 = Build.VERSION.SDK_INT;
        getLifecycle().mo4444(new b());
        getLifecycle().mo4444(new c());
        getLifecycle().mo4444(new d());
        m10410.m10412();
        h0.m4429(this);
        if (i5 <= 23) {
            getLifecycle().mo4444(new o(this));
        }
        getSavedStateRegistry().m10408("android:support:activity-result", new d.c() { // from class: androidx.activity.f
            @Override // n0.d.c
            /* renamed from: ʻ, reason: contains not printable characters */
            public final Bundle mo369() {
                return this.f202.m375();
            }
        });
        m384(new b.b() { // from class: androidx.activity.g
            @Override // b.b
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo370(Context context) {
                this.f203.m371(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public /* synthetic */ void m371(Context context) {
        Bundle m10403 = getSavedStateRegistry().m10403("android:support:activity-result");
        if (m10403 != null) {
            this.f214.m5732(m10403);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public /* synthetic */ v3.p m373() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public /* synthetic */ Bundle m375() {
        Bundle bundle = new Bundle();
        this.f214.m5733(bundle);
        return bundle;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private j m379() {
        return new k();
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m386();
        this.f210.mo393(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.j
    public j0.a getDefaultViewModelCreationExtras() {
        j0.b bVar = new j0.b();
        if (getApplication() != null) {
            bVar.m9277(o0.a.f3852, getApplication());
        }
        bVar.m9277(h0.f3813, this);
        bVar.m9277(h0.f3814, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            bVar.m9277(h0.f3815, getIntent().getExtras());
        }
        return bVar;
    }

    @Override // androidx.core.app.n, androidx.lifecycle.p
    public androidx.lifecycle.l getLifecycle() {
        return this.f206;
    }

    @Override // androidx.activity.s
    public final q getOnBackPressedDispatcher() {
        if (this.f209 == null) {
            this.f209 = new q(new e());
            getLifecycle().mo4444(new f());
        }
        return this.f209;
    }

    @Override // n0.f
    public final n0.d getSavedStateRegistry() {
        return this.f207.m10411();
    }

    @Override // androidx.lifecycle.s0
    public r0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m385();
        return this.f208;
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i5, int i6, Intent intent) {
        if (this.f214.m5730(i5, i6, intent)) {
            return;
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m427();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a<Configuration>> it = this.f215.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f207.m10413(bundle);
        this.f204.m5633(this);
        super.onCreate(bundle);
        c0.m4405(this);
        int i5 = this.f212;
        if (i5 != 0) {
            setContentView(i5);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        this.f205.m3428(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 0) {
            return this.f205.m3430(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5) {
        if (this.f220) {
            return;
        }
        Iterator<androidx.core.util.a<androidx.core.app.o>> it = this.f218.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.o(z5));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a<Intent>> it = this.f217.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        this.f205.m3429(menu);
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5) {
        if (this.f221) {
            return;
        }
        Iterator<androidx.core.util.a<androidx.core.app.s>> it = this.f219.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.s(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, View view, Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        this.f205.m3431(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        if (this.f214.m5730(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object m381 = m381();
        r0 r0Var = this.f208;
        if (r0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            r0Var = iVar.f235;
        }
        if (r0Var == null && m381 == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f234 = m381;
        iVar2.f235 = r0Var;
        return iVar2;
    }

    @Override // androidx.core.app.n, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.l lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.q) {
            ((androidx.lifecycle.q) lifecycle).m4487(l.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f207.m10414(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator<androidx.core.util.a<Integer>> it = this.f216.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i5));
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (q0.b.m11463()) {
                q0.b.m11460("reportFullyDrawn() for ComponentActivity");
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 > 19) {
                super.reportFullyDrawn();
            } else if (i5 == 19 && androidx.core.content.a.m1990(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
            this.f211.m399();
        } finally {
            q0.b.m11461();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i5) {
        m386();
        this.f210.mo393(getWindow().getDecorView());
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i5) {
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final <I, O> c.c<I> m380(d.a<I, O> aVar, c.b<O> bVar) {
        return m382(aVar, this.f214, bVar);
    }

    @Deprecated
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public Object m381() {
        return null;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public final <I, O> c.c<I> m382(d.a<I, O> aVar, c.d dVar, c.b<O> bVar) {
        return dVar.m5734("activity_rq#" + this.f213.getAndIncrement(), this, aVar, bVar);
    }

    @Override // c.e
    /* renamed from: י, reason: contains not printable characters */
    public final c.d mo383() {
        return this.f214;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public final void m384(b.b bVar) {
        this.f204.m5631(bVar);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m385() {
        if (this.f208 == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f208 = iVar.f235;
            }
            if (this.f208 == null) {
                this.f208 = new r0();
            }
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public void m386() {
        t0.m4515(getWindow().getDecorView(), this);
        u0.m4516(getWindow().getDecorView(), this);
        n0.g.m10416(getWindow().getDecorView(), this);
        v.m444(getWindow().getDecorView(), this);
        u.m443(getWindow().getDecorView(), this);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m387() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        this.f220 = true;
        try {
            super.onMultiWindowModeChanged(z5, configuration);
            this.f220 = false;
            Iterator<androidx.core.util.a<androidx.core.app.o>> it = this.f218.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.o(z5, configuration));
            }
        } catch (Throwable th) {
            this.f220 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        this.f221 = true;
        try {
            super.onPictureInPictureModeChanged(z5, configuration);
            this.f221 = false;
            Iterator<androidx.core.util.a<androidx.core.app.s>> it = this.f219.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.s(z5, configuration));
            }
        } catch (Throwable th) {
            this.f221 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m386();
        this.f210.mo393(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m386();
        this.f210.mo393(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
