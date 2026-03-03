package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.d3;
import androidx.appcompat.widget.f2;
import androidx.appcompat.widget.o3;
import androidx.appcompat.widget.p3;
import androidx.appcompat.widget.v1;
import androidx.core.content.res.i;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.q4;
import androidx.core.view.s;
import androidx.core.view.s4;
import androidx.core.view.u0;
import androidx.lifecycle.l;
import com.google.android.material.internal.ViewUtils;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {

    /* renamed from: ʻٴ, reason: contains not printable characters */
    private static final m.g<String, Integer> f491 = new m.g<>();

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    private static final boolean f492;

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    private static final int[] f493;

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    private static final boolean f494;

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    private static final boolean f495;

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    private static boolean f496;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private boolean f497;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f498;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private boolean f499;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private r f500;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private r f501;

    /* renamed from: ʻˆ, reason: contains not printable characters */
    boolean f502;

    /* renamed from: ʻˈ, reason: contains not printable characters */
    int f503;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private final Runnable f504;

    /* renamed from: ʻˊ, reason: contains not printable characters */
    private boolean f505;

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private Rect f506;

    /* renamed from: ʻˎ, reason: contains not printable characters */
    private Rect f507;

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private androidx.appcompat.app.v f508;

    /* renamed from: ʻˑ, reason: contains not printable characters */
    private z f509;

    /* renamed from: ʻי, reason: contains not printable characters */
    private OnBackInvokedDispatcher f510;

    /* renamed from: ʻـ, reason: contains not printable characters */
    private OnBackInvokedCallback f511;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    ViewGroup f512;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private boolean f513;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private View f514;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private TextView f515;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private boolean f516;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    boolean f517;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    boolean f518;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    boolean f519;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    boolean f520;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private boolean f521;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    boolean f522;

    /* renamed from: ˑ, reason: contains not printable characters */
    final Object f523;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private v[] f524;

    /* renamed from: י, reason: contains not printable characters */
    final Context f525;

    /* renamed from: יי, reason: contains not printable characters */
    private boolean f526;

    /* renamed from: ـ, reason: contains not printable characters */
    Window f527;

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean f528;

    /* renamed from: ٴ, reason: contains not printable characters */
    private p f529;

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private int f530;

    /* renamed from: ᐧ, reason: contains not printable characters */
    final androidx.appcompat.app.d f531;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    Runnable f532;

    /* renamed from: ᴵ, reason: contains not printable characters */
    androidx.appcompat.app.a f533;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    q4 f534;

    /* renamed from: ᵎ, reason: contains not printable characters */
    MenuInflater f535;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private boolean f536;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private CharSequence f537;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private v f538;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private v1 f539;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private boolean f540;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private i f541;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    boolean f542;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private w f543;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private Configuration f544;

    /* renamed from: ﹶ, reason: contains not printable characters */
    androidx.appcompat.view.b f545;

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private int f546;

    /* renamed from: ﾞ, reason: contains not printable characters */
    ActionBarContextView f547;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    PopupWindow f548;

    /* compiled from: AppCompatDelegateImpl.java */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Thread.UncaughtExceptionHandler f549;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f549 = uncaughtExceptionHandler;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean m690(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!m690(th)) {
                this.f549.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f549.uncaughtException(thread, notFoundException);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f503 & 1) != 0) {
                hVar.m663(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f503 & 4096) != 0) {
                hVar2.m663(108);
            }
            h hVar3 = h.this;
            hVar3.f502 = false;
            hVar3.f503 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class c implements u0 {
        c() {
        }

        @Override // androidx.core.view.u0
        /* renamed from: ʻ, reason: contains not printable characters */
        public f5 mo691(View view, f5 f5Var) {
            int m3076 = f5Var.m3076();
            int m688 = h.this.m688(f5Var, null);
            if (m3076 != m688) {
                f5Var = f5Var.m3082(f5Var.m3074(), m688, f5Var.m3075(), f5Var.m3073());
            }
            return f1.m2816(view, f5Var);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class d implements f2.a {
        d() {
        }

        @Override // androidx.appcompat.widget.f2.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo692(Rect rect) {
            rect.top = h.this.m688(null, rect);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        class a extends s4 {
            a() {
            }

            @Override // androidx.core.view.r4
            /* renamed from: ʼ */
            public void mo561(View view) {
                h.this.f547.setAlpha(1.0f);
                h.this.f534.m3289(null);
                h.this.f534 = null;
            }

            @Override // androidx.core.view.s4, androidx.core.view.r4
            /* renamed from: ʽ, reason: contains not printable characters */
            public void mo694(View view) {
                h.this.f547.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f548.showAtLocation(hVar.f547, 55, 0, 0);
            h.this.m664();
            if (!h.this.m683()) {
                h.this.f547.setAlpha(1.0f);
                h.this.f547.setVisibility(0);
            } else {
                h.this.f547.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f534 = f1.m2864(hVar2.f547).m3284(1.0f);
                h.this.f534.m3289(new a());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class g extends s4 {
        g() {
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ */
        public void mo561(View view) {
            h.this.f547.setAlpha(1.0f);
            h.this.f534.m3289(null);
            h.this.f534 = null;
        }

        @Override // androidx.core.view.s4, androidx.core.view.r4
        /* renamed from: ʽ */
        public void mo694(View view) {
            h.this.f547.setVisibility(0);
            if (h.this.f547.getParent() instanceof View) {
                f1.m2827((View) h.this.f547.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    interface InterfaceC0013h {
        View onCreatePanelView(int i5);

        /* renamed from: ʻ */
        boolean mo530(int i5);
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private final class i implements m.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z5) {
            h.this.m657(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        /* renamed from: ʻ */
        public boolean mo527(androidx.appcompat.view.menu.g gVar) {
            Window.Callback m670 = h.this.m670();
            if (m670 == null) {
                return true;
            }
            m670.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class j implements b.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private b.a f558;

        /* compiled from: AppCompatDelegateImpl.java */
        class a extends s4 {
            a() {
            }

            @Override // androidx.core.view.r4
            /* renamed from: ʼ */
            public void mo561(View view) {
                h.this.f547.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f548;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f547.getParent() instanceof View) {
                    f1.m2827((View) h.this.f547.getParent());
                }
                h.this.f547.m1011();
                h.this.f534.m3289(null);
                h hVar2 = h.this;
                hVar2.f534 = null;
                f1.m2827(hVar2.f512);
            }
        }

        public j(b.a aVar) {
            this.f558 = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo695(androidx.appcompat.view.b bVar, Menu menu) {
            f1.m2827(h.this.f512);
            return this.f558.mo695(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo696(androidx.appcompat.view.b bVar) {
            this.f558.mo696(bVar);
            h hVar = h.this;
            if (hVar.f548 != null) {
                hVar.f527.getDecorView().removeCallbacks(h.this.f532);
            }
            h hVar2 = h.this;
            if (hVar2.f547 != null) {
                hVar2.m664();
                h hVar3 = h.this;
                hVar3.f534 = f1.m2864(hVar3.f547).m3284(0.0f);
                h.this.f534.m3289(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.d dVar = hVar4.f531;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(hVar4.f545);
            }
            h hVar5 = h.this;
            hVar5.f545 = null;
            f1.m2827(hVar5.f512);
            h.this.m687();
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean mo697(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f558.mo697(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean mo698(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f558.mo698(bVar, menu);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class k {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Context m699(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m700(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i5 = configuration.densityDpi;
            int i6 = configuration2.densityDpi;
            if (i5 != i6) {
                configuration3.densityDpi = i6;
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m701(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m702(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class l {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m703(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static String m704(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class m {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m705(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static androidx.core.os.i m706(Configuration configuration) {
            return androidx.core.os.i.m2420(configuration.getLocales().toLanguageTags());
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static void m707(androidx.core.os.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.m2426()));
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m708(Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.m2426()));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class n {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m709(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class o {
        /* renamed from: ʻ, reason: contains not printable characters */
        static OnBackInvokedDispatcher m710(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static OnBackInvokedCallback m711(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.r
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    hVar.m673();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m712(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class q extends r {

        /* renamed from: ʽ, reason: contains not printable characters */
        private final PowerManager f566;

        q(Context context) {
            super();
            this.f566 = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.r
        /* renamed from: ʼ, reason: contains not printable characters */
        IntentFilter mo718() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.r
        /* renamed from: ʽ, reason: contains not printable characters */
        public int mo719() {
            return (Build.VERSION.SDK_INT < 21 || !l.m703(this.f566)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.h.r
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo720() {
            h.this.mo598();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    abstract class r {

        /* renamed from: ʻ, reason: contains not printable characters */
        private BroadcastReceiver f568;

        /* compiled from: AppCompatDelegateImpl.java */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                r.this.mo720();
            }
        }

        r() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m721() {
            BroadcastReceiver broadcastReceiver = this.f568;
            if (broadcastReceiver != null) {
                try {
                    h.this.f525.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f568 = null;
            }
        }

        /* renamed from: ʼ */
        abstract IntentFilter mo718();

        /* renamed from: ʽ */
        abstract int mo719();

        /* renamed from: ʾ */
        abstract void mo720();

        /* renamed from: ʿ, reason: contains not printable characters */
        void m722() {
            m721();
            IntentFilter mo718 = mo718();
            if (mo718 == null || mo718.countActions() == 0) {
                return;
            }
            if (this.f568 == null) {
                this.f568 = new a();
            }
            h.this.f525.registerReceiver(this.f568, mo718);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class s extends r {

        /* renamed from: ʽ, reason: contains not printable characters */
        private final e0 f571;

        s(e0 e0Var) {
            super();
            this.f571 = e0Var;
        }

        @Override // androidx.appcompat.app.h.r
        /* renamed from: ʼ */
        IntentFilter mo718() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.r
        /* renamed from: ʽ */
        public int mo719() {
            return this.f571.m538() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.r
        /* renamed from: ʾ */
        public void mo720() {
            h.this.mo598();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private static class t {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m723(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class u extends ContentFrameLayout {
        public u(Context context) {
            super(context);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean m724(int i5, int i6) {
            return i5 < -5 || i6 < -5 || i5 > getWidth() + 5 || i6 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.m662(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m724((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.m658(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i5) {
            setBackgroundDrawable(f.a.m8475(getContext(), i5));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    protected static final class v {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f574;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f575;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f576;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f577;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f578;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f579;

        /* renamed from: ˈ, reason: contains not printable characters */
        ViewGroup f580;

        /* renamed from: ˉ, reason: contains not printable characters */
        View f581;

        /* renamed from: ˊ, reason: contains not printable characters */
        View f582;

        /* renamed from: ˋ, reason: contains not printable characters */
        androidx.appcompat.view.menu.g f583;

        /* renamed from: ˎ, reason: contains not printable characters */
        androidx.appcompat.view.menu.e f584;

        /* renamed from: ˏ, reason: contains not printable characters */
        Context f585;

        /* renamed from: ˑ, reason: contains not printable characters */
        boolean f586;

        /* renamed from: י, reason: contains not printable characters */
        boolean f587;

        /* renamed from: ـ, reason: contains not printable characters */
        boolean f588;

        /* renamed from: ٴ, reason: contains not printable characters */
        public boolean f589;

        /* renamed from: ᐧ, reason: contains not printable characters */
        boolean f590 = false;

        /* renamed from: ᴵ, reason: contains not printable characters */
        boolean f591;

        /* renamed from: ᵎ, reason: contains not printable characters */
        Bundle f592;

        v(int i5) {
            this.f574 = i5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        androidx.appcompat.view.menu.n m725(m.a aVar) {
            if (this.f583 == null) {
                return null;
            }
            if (this.f584 == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f585, e.g.f7048);
                this.f584 = eVar;
                eVar.setCallback(aVar);
                this.f583.addMenuPresenter(this.f584);
            }
            return this.f584.m935(this.f580);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m726() {
            if (this.f581 == null) {
                return false;
            }
            return this.f582 != null || this.f584.m934().getCount() > 0;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m727(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f583;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.removeMenuPresenter(this.f584);
            }
            this.f583 = gVar;
            if (gVar == null || (eVar = this.f584) == null) {
                return;
            }
            gVar.addMenuPresenter(eVar);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m728(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(e.a.f6884, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                newTheme.applyStyle(i5, true);
            }
            newTheme.resolveAttribute(e.a.f6913, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                newTheme.applyStyle(i6, true);
            } else {
                newTheme.applyStyle(e.i.f7076, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f585 = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(e.j.f7109);
            this.f575 = obtainStyledAttributes.getResourceId(e.j.f7112, 0);
            this.f579 = obtainStyledAttributes.getResourceId(e.j.f7111, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private final class w implements m.a {
        w() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z5) {
            androidx.appcompat.view.menu.g rootMenu = gVar.getRootMenu();
            boolean z6 = rootMenu != gVar;
            h hVar = h.this;
            if (z6) {
                gVar = rootMenu;
            }
            v m665 = hVar.m665(gVar);
            if (m665 != null) {
                if (!z6) {
                    h.this.m659(m665, z5);
                } else {
                    h.this.m656(m665.f574, m665, rootMenu);
                    h.this.m659(m665, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        /* renamed from: ʻ */
        public boolean mo527(androidx.appcompat.view.menu.g gVar) {
            Window.Callback m670;
            if (gVar != gVar.getRootMenu()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.f518 || (m670 = hVar.m670()) == null || h.this.f542) {
                return true;
            }
            m670.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z5 = Build.VERSION.SDK_INT < 21;
        f492 = z5;
        f493 = new int[]{R.attr.windowBackground};
        f494 = !"robolectric".equals(Build.FINGERPRINT);
        f495 = true;
        if (!z5 || f496) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f496 = true;
    }

    h(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private void m623() {
        r rVar = this.f500;
        if (rVar != null) {
            rVar.m721();
        }
        r rVar2 = this.f501;
        if (rVar2 != null) {
            rVar2.m721();
        }
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private Configuration m624(Context context, int i5, androidx.core.os.i iVar, Configuration configuration, boolean z5) {
        int i6 = i5 != 1 ? i5 != 2 ? z5 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i6 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            m681(configuration2, iVar);
        }
        return configuration2;
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private ViewGroup m625() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f525.obtainStyledAttributes(e.j.f7109);
        int i5 = e.j.f7114;
        if (!obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(e.j.f7123, false)) {
            mo599(1);
        } else if (obtainStyledAttributes.getBoolean(i5, false)) {
            mo599(108);
        }
        if (obtainStyledAttributes.getBoolean(e.j.f7115, false)) {
            mo599(109);
        }
        if (obtainStyledAttributes.getBoolean(e.j.f7116, false)) {
            mo599(10);
        }
        this.f519 = obtainStyledAttributes.getBoolean(e.j.f7110, false);
        obtainStyledAttributes.recycle();
        m627();
        this.f527.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f525);
        if (this.f522) {
            viewGroup = this.f520 ? (ViewGroup) from.inflate(e.g.f7053, (ViewGroup) null) : (ViewGroup) from.inflate(e.g.f7052, (ViewGroup) null);
        } else if (this.f519) {
            viewGroup = (ViewGroup) from.inflate(e.g.f7044, (ViewGroup) null);
            this.f517 = false;
            this.f518 = false;
        } else if (this.f518) {
            TypedValue typedValue = new TypedValue();
            this.f525.getTheme().resolveAttribute(e.a.f6894, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f525, typedValue.resourceId) : this.f525).inflate(e.g.f7054, (ViewGroup) null);
            v1 v1Var = (v1) viewGroup.findViewById(e.f.f7026);
            this.f539 = v1Var;
            v1Var.setWindowCallback(m670());
            if (this.f517) {
                this.f539.mo1028(109);
            }
            if (this.f528) {
                this.f539.mo1028(2);
            }
            if (this.f516) {
                this.f539.mo1028(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f518 + ", windowActionBarOverlay: " + this.f517 + ", android:windowIsFloating: " + this.f519 + ", windowActionModeOverlay: " + this.f520 + ", windowNoTitle: " + this.f522 + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            f1.m2846(viewGroup, new c());
        } else if (viewGroup instanceof f2) {
            ((f2) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.f539 == null) {
            this.f515 = (TextView) viewGroup.findViewById(e.f.f7014);
        }
        p3.m1478(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.f.f6999);
        ViewGroup viewGroup2 = (ViewGroup) this.f527.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f527.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    private void m626() {
        if (this.f513) {
            return;
        }
        this.f512 = m625();
        CharSequence m669 = m669();
        if (!TextUtils.isEmpty(m669)) {
            v1 v1Var = this.f539;
            if (v1Var != null) {
                v1Var.setWindowTitle(m669);
            } else if (m680() != null) {
                m680().mo491(m669);
            } else {
                TextView textView = this.f515;
                if (textView != null) {
                    textView.setText(m669);
                }
            }
        }
        m653();
        m679(this.f512);
        this.f513 = true;
        v m668 = m668(0, false);
        if (this.f542) {
            return;
        }
        if (m668 == null || m668.f583 == null) {
            m636(108);
        }
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    private void m627() {
        if (this.f527 == null) {
            Object obj = this.f523;
            if (obj instanceof Activity) {
                m654(((Activity) obj).getWindow());
            }
        }
        if (this.f527 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    private static Configuration m628(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f5 = configuration.fontScale;
            float f6 = configuration2.fontScale;
            if (f5 != f6) {
                configuration3.fontScale = f6;
            }
            int i5 = configuration.mcc;
            int i6 = configuration2.mcc;
            if (i5 != i6) {
                configuration3.mcc = i6;
            }
            int i7 = configuration.mnc;
            int i8 = configuration2.mnc;
            if (i7 != i8) {
                configuration3.mnc = i8;
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 24) {
                m.m705(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.m2568(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i10 = configuration.touchscreen;
            int i11 = configuration2.touchscreen;
            if (i10 != i11) {
                configuration3.touchscreen = i11;
            }
            int i12 = configuration.keyboard;
            int i13 = configuration2.keyboard;
            if (i12 != i13) {
                configuration3.keyboard = i13;
            }
            int i14 = configuration.keyboardHidden;
            int i15 = configuration2.keyboardHidden;
            if (i14 != i15) {
                configuration3.keyboardHidden = i15;
            }
            int i16 = configuration.navigation;
            int i17 = configuration2.navigation;
            if (i16 != i17) {
                configuration3.navigation = i17;
            }
            int i18 = configuration.navigationHidden;
            int i19 = configuration2.navigationHidden;
            if (i18 != i19) {
                configuration3.navigationHidden = i19;
            }
            int i20 = configuration.orientation;
            int i21 = configuration2.orientation;
            if (i20 != i21) {
                configuration3.orientation = i21;
            }
            int i22 = configuration.screenLayout & 15;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 15)) {
                configuration3.screenLayout |= i23 & 15;
            }
            int i24 = configuration.screenLayout & 192;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 192)) {
                configuration3.screenLayout |= i25 & 192;
            }
            int i26 = configuration.screenLayout & 48;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 48)) {
                configuration3.screenLayout |= i27 & 48;
            }
            int i28 = configuration.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & ViewUtils.EDGE_TO_EDGE_FLAGS)) {
                configuration3.screenLayout |= i29 & ViewUtils.EDGE_TO_EDGE_FLAGS;
            }
            if (i9 >= 26) {
                n.m709(configuration, configuration2, configuration3);
            }
            int i30 = configuration.uiMode & 15;
            int i31 = configuration2.uiMode;
            if (i30 != (i31 & 15)) {
                configuration3.uiMode |= i31 & 15;
            }
            int i32 = configuration.uiMode & 48;
            int i33 = configuration2.uiMode;
            if (i32 != (i33 & 48)) {
                configuration3.uiMode |= i33 & 48;
            }
            int i34 = configuration.screenWidthDp;
            int i35 = configuration2.screenWidthDp;
            if (i34 != i35) {
                configuration3.screenWidthDp = i35;
            }
            int i36 = configuration.screenHeightDp;
            int i37 = configuration2.screenHeightDp;
            if (i36 != i37) {
                configuration3.screenHeightDp = i37;
            }
            int i38 = configuration.smallestScreenWidthDp;
            int i39 = configuration2.smallestScreenWidthDp;
            if (i38 != i39) {
                configuration3.smallestScreenWidthDp = i39;
            }
            k.m700(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    private int m629(Context context) {
        if (!this.f499 && (this.f523 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i5 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f523.getClass()), i5 >= 29 ? 269221888 : i5 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f498 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e5);
                this.f498 = 0;
            }
        }
        this.f499 = true;
        return this.f498;
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    private r m630(Context context) {
        if (this.f501 == null) {
            this.f501 = new q(context);
        }
        return this.f501;
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    private r m631(Context context) {
        if (this.f500 == null) {
            this.f500 = new s(e0.m533(context));
        }
        return this.f500;
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    private void m632() {
        m626();
        if (this.f518 && this.f533 == null) {
            Object obj = this.f523;
            if (obj instanceof Activity) {
                this.f533 = new f0((Activity) this.f523, this.f517);
            } else if (obj instanceof Dialog) {
                this.f533 = new f0((Dialog) this.f523);
            }
            androidx.appcompat.app.a aVar = this.f533;
            if (aVar != null) {
                aVar.mo486(this.f505);
            }
        }
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private boolean m633(v vVar) {
        View view = vVar.f582;
        if (view != null) {
            vVar.f581 = view;
            return true;
        }
        if (vVar.f583 == null) {
            return false;
        }
        if (this.f543 == null) {
            this.f543 = new w();
        }
        View view2 = (View) vVar.m725(this.f543);
        vVar.f581 = view2;
        return view2 != null;
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private boolean m634(v vVar) {
        vVar.m728(m666());
        vVar.f580 = new u(vVar.f585);
        vVar.f576 = 81;
        return true;
    }

    /* renamed from: ʼʿ, reason: contains not printable characters */
    private boolean m635(v vVar) {
        Resources.Theme theme;
        Context context = this.f525;
        int i5 = vVar.f574;
        if ((i5 == 0 || i5 == 108) && this.f539 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(e.a.f6894, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(e.a.f6896, typedValue, true);
            } else {
                theme2.resolveAttribute(e.a.f6896, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.setCallback(this);
        vVar.m727(gVar);
        return true;
    }

    /* renamed from: ʼˆ, reason: contains not printable characters */
    private void m636(int i5) {
        this.f503 = (1 << i5) | this.f503;
        if (this.f502) {
            return;
        }
        f1.m2822(this.f527.getDecorView(), this.f504);
        this.f502 = true;
    }

    /* renamed from: ʼˎ, reason: contains not printable characters */
    private boolean m637(int i5, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        v m668 = m668(i5, true);
        if (m668.f588) {
            return false;
        }
        return m641(m668, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* renamed from: ʼי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m638(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f545
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.h$v r2 = r4.m668(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.v1 r5 = r4.f539
            if (r5 == 0) goto L43
            boolean r5 = r5.mo1027()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f525
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.v1 r5 = r4.f539
            boolean r5 = r5.mo1022()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f542
            if (r5 != 0) goto L62
            boolean r5 = r4.m641(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.v1 r5 = r4.f539
            boolean r0 = r5.mo1026()
            goto L68
        L3c:
            androidx.appcompat.widget.v1 r5 = r4.f539
            boolean r0 = r5.mo1025()
            goto L68
        L43:
            boolean r5 = r2.f588
            if (r5 != 0) goto L64
            boolean r3 = r2.f587
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f586
            if (r5 == 0) goto L62
            boolean r5 = r2.f591
            if (r5 == 0) goto L5b
            r2.f586 = r1
            boolean r5 = r4.m641(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.m639(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.m659(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f525
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.m638(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: ʼᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m639(androidx.appcompat.app.h.v r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.m639(androidx.appcompat.app.h$v, android.view.KeyEvent):void");
    }

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    private boolean m640(v vVar, int i5, KeyEvent keyEvent, int i6) {
        androidx.appcompat.view.menu.g gVar;
        boolean z5 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.f586 || m641(vVar, keyEvent)) && (gVar = vVar.f583) != null) {
            z5 = gVar.performShortcut(i5, keyEvent, i6);
        }
        if (z5 && (i6 & 1) == 0 && this.f539 == null) {
            m659(vVar, true);
        }
        return z5;
    }

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    private boolean m641(v vVar, KeyEvent keyEvent) {
        v1 v1Var;
        v1 v1Var2;
        v1 v1Var3;
        if (this.f542) {
            return false;
        }
        if (vVar.f586) {
            return true;
        }
        v vVar2 = this.f538;
        if (vVar2 != null && vVar2 != vVar) {
            m659(vVar2, false);
        }
        Window.Callback m670 = m670();
        if (m670 != null) {
            vVar.f582 = m670.onCreatePanelView(vVar.f574);
        }
        int i5 = vVar.f574;
        boolean z5 = i5 == 0 || i5 == 108;
        if (z5 && (v1Var3 = this.f539) != null) {
            v1Var3.mo1023();
        }
        if (vVar.f582 == null && (!z5 || !(m680() instanceof c0))) {
            androidx.appcompat.view.menu.g gVar = vVar.f583;
            if (gVar == null || vVar.f591) {
                if (gVar == null && (!m635(vVar) || vVar.f583 == null)) {
                    return false;
                }
                if (z5 && this.f539 != null) {
                    if (this.f541 == null) {
                        this.f541 = new i();
                    }
                    this.f539.mo1021(vVar.f583, this.f541);
                }
                vVar.f583.stopDispatchingItemsChanged();
                if (!m670.onCreatePanelMenu(vVar.f574, vVar.f583)) {
                    vVar.m727(null);
                    if (z5 && (v1Var = this.f539) != null) {
                        v1Var.mo1021(null, this.f541);
                    }
                    return false;
                }
                vVar.f591 = false;
            }
            vVar.f583.stopDispatchingItemsChanged();
            Bundle bundle = vVar.f592;
            if (bundle != null) {
                vVar.f583.restoreActionViewStates(bundle);
                vVar.f592 = null;
            }
            if (!m670.onPreparePanel(0, vVar.f582, vVar.f583)) {
                if (z5 && (v1Var2 = this.f539) != null) {
                    v1Var2.mo1021(null, this.f541);
                }
                vVar.f583.startDispatchingItemsChanged();
                return false;
            }
            boolean z6 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            vVar.f589 = z6;
            vVar.f583.setQwertyMode(z6);
            vVar.f583.startDispatchingItemsChanged();
        }
        vVar.f586 = true;
        vVar.f587 = false;
        this.f538 = vVar;
        return true;
    }

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    private void m642(boolean z5) {
        v1 v1Var = this.f539;
        if (v1Var == null || !v1Var.mo1027() || (ViewConfiguration.get(this.f525).hasPermanentMenuKey() && !this.f539.mo1024())) {
            v m668 = m668(0, true);
            m668.f590 = true;
            m659(m668, false);
            m639(m668, null);
            return;
        }
        Window.Callback m670 = m670();
        if (this.f539.mo1022() && z5) {
            this.f539.mo1025();
            if (this.f542) {
                return;
            }
            m670.onPanelClosed(108, m668(0, true).f583);
            return;
        }
        if (m670 == null || this.f542) {
            return;
        }
        if (this.f502 && (this.f503 & 1) != 0) {
            this.f527.getDecorView().removeCallbacks(this.f504);
            this.f504.run();
        }
        v m6682 = m668(0, true);
        androidx.appcompat.view.menu.g gVar = m6682.f583;
        if (gVar == null || m6682.f591 || !m670.onPreparePanel(0, m6682.f582, gVar)) {
            return;
        }
        m670.onMenuOpened(108, m6682.f583);
        this.f539.mo1026();
    }

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    private int m643(int i5) {
        if (i5 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i5 != 9) {
            return i5;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* renamed from: ʽʼ, reason: contains not printable characters */
    private boolean m644(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f527.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || f1.m2903((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: ʽˈ, reason: contains not printable characters */
    private void m645() {
        if (this.f513) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: ʽˉ, reason: contains not printable characters */
    private androidx.appcompat.app.c m646() {
        for (Context context = this.f525; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽˊ, reason: contains not printable characters */
    private void m647(Configuration configuration) {
        Activity activity = (Activity) this.f523;
        if (activity instanceof androidx.lifecycle.p) {
            if (((androidx.lifecycle.p) activity).getLifecycle().mo4445().m4455(l.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f540 || this.f542) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0072  */
    /* renamed from: ʽˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m648(int r9, androidx.core.os.i r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f525
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.m624(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f525
            int r1 = r8.m629(r1)
            android.content.res.Configuration r2 = r8.f544
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f525
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.i r2 = r8.m667(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.i r0 = r8.m667(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L47:
            r2 = r1 ^ (-1)
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L72
            if (r11 == 0) goto L72
            boolean r11 = r8.f536
            if (r11 == 0) goto L72
            boolean r11 = androidx.appcompat.app.h.f494
            if (r11 != 0) goto L5b
            boolean r11 = r8.f540
            if (r11 == 0) goto L72
        L5b:
            java.lang.Object r11 = r8.f523
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L72
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L72
            java.lang.Object r11 = r8.f523
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.m1931(r11)
            r11 = 1
            goto L73
        L72:
            r11 = 0
        L73:
            if (r11 != 0) goto L80
            if (r3 == 0) goto L80
            r11 = r3 & r1
            if (r11 != r3) goto L7c
            r6 = 1
        L7c:
            r8.m649(r4, r0, r6, r5)
            goto L81
        L80:
            r7 = r11
        L81:
            if (r7 == 0) goto L9d
            java.lang.Object r11 = r8.f523
            boolean r1 = r11 instanceof androidx.appcompat.app.c
            if (r1 == 0) goto L9d
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L92
            androidx.appcompat.app.c r11 = (androidx.appcompat.app.c) r11
            r11.m522(r9)
        L92:
            r9 = r3 & 4
            if (r9 == 0) goto L9d
            java.lang.Object r9 = r8.f523
            androidx.appcompat.app.c r9 = (androidx.appcompat.app.c) r9
            r9.m521(r10)
        L9d:
            if (r7 == 0) goto Lb2
            if (r0 == 0) goto Lb2
            android.content.Context r9 = r8.f525
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.i r9 = r8.m667(r9)
            r8.m682(r9)
        Lb2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.m648(int, androidx.core.os.i, boolean):boolean");
    }

    /* renamed from: ʽˏ, reason: contains not printable characters */
    private void m649(int i5, androidx.core.os.i iVar, boolean z5, Configuration configuration) {
        Resources resources = this.f525.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i5 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            m681(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 26) {
            b0.m502(resources);
        }
        int i7 = this.f546;
        if (i7 != 0) {
            this.f525.setTheme(i7);
            if (i6 >= 23) {
                this.f525.getTheme().applyStyle(this.f546, true);
            }
        }
        if (z5 && (this.f523 instanceof Activity)) {
            m647(configuration2);
        }
    }

    /* renamed from: ʽי, reason: contains not printable characters */
    private void m650(View view) {
        view.setBackgroundColor((f1.m2895(view) & 8192) != 0 ? androidx.core.content.a.m1991(this.f525, e.c.f6930) : androidx.core.content.a.m1991(this.f525, e.c.f6929));
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private boolean m651(boolean z5) {
        return m652(z5, true);
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private boolean m652(boolean z5, boolean z6) {
        if (this.f542) {
            return false;
        }
        int m655 = m655();
        int m672 = m672(this.f525, m655);
        androidx.core.os.i m689 = Build.VERSION.SDK_INT < 33 ? m689(this.f525) : null;
        if (!z6 && m689 != null) {
            m689 = m667(this.f525.getResources().getConfiguration());
        }
        boolean m648 = m648(m672, m689, z5);
        if (m655 == 0) {
            m631(this.f525).m722();
        } else {
            r rVar = this.f500;
            if (rVar != null) {
                rVar.m721();
            }
        }
        if (m655 == 3) {
            m630(this.f525).m722();
        } else {
            r rVar2 = this.f501;
            if (rVar2 != null) {
                rVar2.m721();
            }
        }
        return m648;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private void m653() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f512.findViewById(R.id.content);
        View decorView = this.f527.getDecorView();
        contentFrameLayout.m1067(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f525.obtainStyledAttributes(e.j.f7109);
        obtainStyledAttributes.getValue(e.j.f7121, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(e.j.f7122, contentFrameLayout.getMinWidthMinor());
        int i5 = e.j.f7119;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedWidthMajor());
        }
        int i6 = e.j.f7120;
        if (obtainStyledAttributes.hasValue(i6)) {
            obtainStyledAttributes.getValue(i6, contentFrameLayout.getFixedWidthMinor());
        }
        int i7 = e.j.f7117;
        if (obtainStyledAttributes.hasValue(i7)) {
            obtainStyledAttributes.getValue(i7, contentFrameLayout.getFixedHeightMajor());
        }
        int i8 = e.j.f7118;
        if (obtainStyledAttributes.hasValue(i8)) {
            obtainStyledAttributes.getValue(i8, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private void m654(Window window) {
        if (this.f527 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof p) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        p pVar = new p(callback);
        this.f529 = pVar;
        window.setCallback(pVar);
        d3 m1180 = d3.m1180(this.f525, null, f493);
        Drawable m1189 = m1180.m1189(0);
        if (m1189 != null) {
            window.setBackgroundDrawable(m1189);
        }
        m1180.m1201();
        this.f527 = window;
        if (Build.VERSION.SDK_INT < 33 || this.f510 != null) {
            return;
        }
        mo607(null);
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private int m655() {
        int i5 = this.f530;
        return i5 != -100 ? i5 : androidx.appcompat.app.g.m587();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m660(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.g.a
    /* renamed from: ʻ */
    public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        v m665;
        Window.Callback m670 = m670();
        if (m670 == null || this.f542 || (m665 = m665(gVar.getRootMenu())) == null) {
            return false;
        }
        return m670.onMenuItemSelected(m665.f574, menuItem);
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ʻʻ */
    public void mo593() {
        androidx.appcompat.app.a mo614 = mo614();
        if (mo614 != null) {
            mo614.mo490(true);
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    void m656(int i5, v vVar, Menu menu) {
        if (menu == null) {
            if (vVar == null && i5 >= 0) {
                v[] vVarArr = this.f524;
                if (i5 < vVarArr.length) {
                    vVar = vVarArr[i5];
                }
            }
            if (vVar != null) {
                menu = vVar.f583;
            }
        }
        if ((vVar == null || vVar.f588) && !this.f542) {
            this.f529.m715(this.f527.getCallback(), i5, menu);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void m657(androidx.appcompat.view.menu.g gVar) {
        if (this.f521) {
            return;
        }
        this.f521 = true;
        this.f539.mo1029();
        Window.Callback m670 = m670();
        if (m670 != null && !this.f542) {
            m670.onPanelClosed(108, gVar);
        }
        this.f521 = false;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    void m658(int i5) {
        m659(m668(i5, true), true);
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    void m659(v vVar, boolean z5) {
        ViewGroup viewGroup;
        v1 v1Var;
        if (z5 && vVar.f574 == 0 && (v1Var = this.f539) != null && v1Var.mo1022()) {
            m657(vVar.f583);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f525.getSystemService("window");
        if (windowManager != null && vVar.f588 && (viewGroup = vVar.f580) != null) {
            windowManager.removeView(viewGroup);
            if (z5) {
                m656(vVar.f574, vVar, null);
            }
        }
        vVar.f586 = false;
        vVar.f587 = false;
        vVar.f588 = false;
        vVar.f581 = null;
        vVar.f590 = true;
        if (this.f538 == vVar) {
            this.f538 = null;
        }
        if (vVar.f574 == 0) {
            m687();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻˊ, reason: contains not printable characters */
    public View m660(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z5;
        boolean z6 = false;
        if (this.f508 == null) {
            String string = this.f525.obtainStyledAttributes(e.j.f7109).getString(e.j.f7113);
            if (string == null) {
                this.f508 = new androidx.appcompat.app.v();
            } else {
                try {
                    this.f508 = (androidx.appcompat.app.v) this.f525.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f508 = new androidx.appcompat.app.v();
                }
            }
        }
        boolean z7 = f492;
        if (z7) {
            if (this.f509 == null) {
                this.f509 = new z();
            }
            if (this.f509.m751(attributeSet)) {
                z5 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z6 = m644((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z6 = true;
                }
                z5 = z6;
            }
        } else {
            z5 = false;
        }
        return this.f508.createView(view, str, context, attributeSet, z5, z7, true, o3.m1461());
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    void m661() {
        androidx.appcompat.view.menu.g gVar;
        v1 v1Var = this.f539;
        if (v1Var != null) {
            v1Var.mo1029();
        }
        if (this.f548 != null) {
            this.f527.getDecorView().removeCallbacks(this.f532);
            if (this.f548.isShowing()) {
                try {
                    this.f548.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f548 = null;
        }
        m664();
        v m668 = m668(0, false);
        if (m668 == null || (gVar = m668.f583) == null) {
            return;
        }
        gVar.close();
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    boolean m662(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f523;
        if (((obj instanceof s.a) || (obj instanceof androidx.appcompat.app.t)) && (decorView = this.f527.getDecorView()) != null && androidx.core.view.s.m3310(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f529.m713(this.f527.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m674(keyCode, keyEvent) : m676(keyCode, keyEvent);
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    void m663(int i5) {
        v m668;
        v m6682 = m668(i5, true);
        if (m6682.f583 != null) {
            Bundle bundle = new Bundle();
            m6682.f583.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                m6682.f592 = bundle;
            }
            m6682.f583.stopDispatchingItemsChanged();
            m6682.f583.clear();
        }
        m6682.f591 = true;
        m6682.f590 = true;
        if ((i5 != 108 && i5 != 0) || this.f539 == null || (m668 = m668(0, false)) == null) {
            return;
        }
        m668.f586 = false;
        m641(m668, null);
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    void m664() {
        q4 q4Var = this.f534;
        if (q4Var != null) {
            q4Var.m3285();
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    v m665(Menu menu) {
        v[] vVarArr = this.f524;
        int length = vVarArr != null ? vVarArr.length : 0;
        for (int i5 = 0; i5 < length; i5++) {
            v vVar = vVarArr[i5];
            if (vVar != null && vVar.f583 == menu) {
                return vVar;
            }
        }
        return null;
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    final Context m666() {
        androidx.appcompat.app.a mo614 = mo614();
        Context mo479 = mo614 != null ? mo614.mo479() : null;
        return mo479 == null ? this.f525 : mo479;
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    androidx.core.os.i m667(Configuration configuration) {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 24 ? m.m706(configuration) : i5 >= 21 ? androidx.core.os.i.m2420(l.m704(configuration.locale)) : androidx.core.os.i.m2418(configuration.locale);
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    protected v m668(int i5, boolean z5) {
        v[] vVarArr = this.f524;
        if (vVarArr == null || vVarArr.length <= i5) {
            v[] vVarArr2 = new v[i5 + 1];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.f524 = vVarArr2;
            vVarArr = vVarArr2;
        }
        v vVar = vVarArr[i5];
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(i5);
        vVarArr[i5] = vVar2;
        return vVar2;
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    final CharSequence m669() {
        Object obj = this.f523;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f537;
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    final Window.Callback m670() {
        return this.f527.getCallback();
    }

    @Override // androidx.appcompat.view.menu.g.a
    /* renamed from: ʼ */
    public void mo529(androidx.appcompat.view.menu.g gVar) {
        m642(true);
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ʼʼ */
    public void mo594() {
        m652(true, false);
    }

    /* renamed from: ʼˈ, reason: contains not printable characters */
    public boolean m671() {
        return this.f497;
    }

    /* renamed from: ʼˉ, reason: contains not printable characters */
    int m672(Context context, int i5) {
        if (i5 == -100) {
            return -1;
        }
        if (i5 != -1) {
            if (i5 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m631(context).mo719();
                }
                return -1;
            }
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3) {
                    return m630(context).mo719();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i5;
    }

    /* renamed from: ʼˊ, reason: contains not printable characters */
    boolean m673() {
        boolean z5 = this.f526;
        this.f526 = false;
        v m668 = m668(0, false);
        if (m668 != null && m668.f588) {
            if (!z5) {
                m659(m668, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f545;
        if (bVar != null) {
            bVar.mo563();
            return true;
        }
        androidx.appcompat.app.a mo614 = mo614();
        return mo614 != null && mo614.mo476();
    }

    /* renamed from: ʼˋ, reason: contains not printable characters */
    boolean m674(int i5, KeyEvent keyEvent) {
        if (i5 == 4) {
            this.f526 = (keyEvent.getFlags() & 128) != 0;
        } else if (i5 == 82) {
            m637(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: ʼˏ, reason: contains not printable characters */
    boolean m675(int i5, KeyEvent keyEvent) {
        androidx.appcompat.app.a mo614 = mo614();
        if (mo614 != null && mo614.mo483(i5, keyEvent)) {
            return true;
        }
        v vVar = this.f538;
        if (vVar != null && m640(vVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            v vVar2 = this.f538;
            if (vVar2 != null) {
                vVar2.f587 = true;
            }
            return true;
        }
        if (this.f538 == null) {
            v m668 = m668(0, true);
            m641(m668, keyEvent);
            boolean m640 = m640(m668, keyEvent.getKeyCode(), keyEvent, 1);
            m668.f586 = false;
            if (m640) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʼˑ, reason: contains not printable characters */
    boolean m676(int i5, KeyEvent keyEvent) {
        if (i5 != 4) {
            if (i5 == 82) {
                m638(0, keyEvent);
                return true;
            }
        } else if (m673()) {
            return true;
        }
        return false;
    }

    /* renamed from: ʼـ, reason: contains not printable characters */
    void m677(int i5) {
        androidx.appcompat.app.a mo614;
        if (i5 != 108 || (mo614 = mo614()) == null) {
            return;
        }
        mo614.mo477(true);
    }

    /* renamed from: ʼٴ, reason: contains not printable characters */
    void m678(int i5) {
        if (i5 == 108) {
            androidx.appcompat.app.a mo614 = mo614();
            if (mo614 != null) {
                mo614.mo477(false);
                return;
            }
            return;
        }
        if (i5 == 0) {
            v m668 = m668(i5, true);
            if (m668.f588) {
                m659(m668, false);
            }
        }
    }

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    final androidx.appcompat.app.a m680() {
        return this.f533;
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    void m681(Configuration configuration, androidx.core.os.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            m.m708(configuration, iVar);
        } else {
            k.m702(configuration, iVar.m2423(0));
            k.m701(configuration, iVar.m2423(0));
        }
    }

    /* renamed from: ʼﾞ, reason: contains not printable characters */
    void m682(androidx.core.os.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            m.m707(iVar);
        } else {
            Locale.setDefault(iVar.m2423(0));
        }
    }

    /* renamed from: ʽʻ, reason: contains not printable characters */
    final boolean m683() {
        ViewGroup viewGroup;
        return this.f513 && (viewGroup = this.f512) != null && f1.m2808(viewGroup);
    }

    /* renamed from: ʽʾ, reason: contains not printable characters */
    boolean m684() {
        if (this.f510 == null) {
            return false;
        }
        v m668 = m668(0, false);
        return (m668 != null && m668.f588) || this.f545 != null;
    }

    /* renamed from: ʽʿ, reason: contains not printable characters */
    public androidx.appcompat.view.b m685(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f545;
        if (bVar != null) {
            bVar.mo563();
        }
        j jVar = new j(aVar);
        androidx.appcompat.app.a mo614 = mo614();
        if (mo614 != null) {
            androidx.appcompat.view.b mo492 = mo614.mo492(jVar);
            this.f545 = mo492;
            if (mo492 != null && (dVar = this.f531) != null) {
                dVar.onSupportActionModeStarted(mo492);
            }
        }
        if (this.f545 == null) {
            this.f545 = m686(jVar);
        }
        m687();
        return this.f545;
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    androidx.appcompat.view.b m686(b.a aVar) {
        androidx.appcompat.view.b bVar;
        Context context;
        androidx.appcompat.app.d dVar;
        m664();
        androidx.appcompat.view.b bVar2 = this.f545;
        if (bVar2 != null) {
            bVar2.mo563();
        }
        if (!(aVar instanceof j)) {
            aVar = new j(aVar);
        }
        androidx.appcompat.app.d dVar2 = this.f531;
        if (dVar2 == null || this.f542) {
            bVar = null;
        } else {
            try {
                bVar = dVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVar != null) {
            this.f545 = bVar;
        } else {
            if (this.f547 == null) {
                if (this.f519) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f525.getTheme();
                    theme.resolveAttribute(e.a.f6894, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.f525.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new androidx.appcompat.view.d(this.f525, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.f525;
                    }
                    this.f547 = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, e.a.f6900);
                    this.f548 = popupWindow;
                    androidx.core.widget.w.m3663(popupWindow, 2);
                    this.f548.setContentView(this.f547);
                    this.f548.setWidth(-1);
                    context.getTheme().resolveAttribute(e.a.f6886, typedValue, true);
                    this.f547.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.f548.setHeight(-2);
                    this.f532 = new f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f512.findViewById(e.f.f7011);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m666()));
                        this.f547 = (ActionBarContextView) viewStubCompat.m1126();
                    }
                }
            }
            if (this.f547 != null) {
                m664();
                this.f547.m1011();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f547.getContext(), this.f547, aVar, this.f548 == null);
                if (aVar.mo698(eVar, eVar.mo565())) {
                    eVar.mo569();
                    this.f547.m1009(eVar);
                    this.f545 = eVar;
                    if (m683()) {
                        this.f547.setAlpha(0.0f);
                        q4 m3284 = f1.m2864(this.f547).m3284(1.0f);
                        this.f534 = m3284;
                        m3284.m3289(new g());
                    } else {
                        this.f547.setAlpha(1.0f);
                        this.f547.setVisibility(0);
                        if (this.f547.getParent() instanceof View) {
                            f1.m2827((View) this.f547.getParent());
                        }
                    }
                    if (this.f548 != null) {
                        this.f527.getDecorView().post(this.f532);
                    }
                } else {
                    this.f545 = null;
                }
            }
        }
        androidx.appcompat.view.b bVar3 = this.f545;
        if (bVar3 != null && (dVar = this.f531) != null) {
            dVar.onSupportActionModeStarted(bVar3);
        }
        m687();
        return this.f545;
    }

    /* renamed from: ʽˎ, reason: contains not printable characters */
    void m687() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean m684 = m684();
            if (m684 && this.f511 == null) {
                this.f511 = o.m711(this.f510, this);
            } else {
                if (m684 || (onBackInvokedCallback = this.f511) == null) {
                    return;
                }
                o.m712(this.f510, onBackInvokedCallback);
            }
        }
    }

    /* renamed from: ʽˑ, reason: contains not printable characters */
    final int m688(f5 f5Var, Rect rect) {
        boolean z5;
        boolean z6;
        int m3076 = f5Var != null ? f5Var.m3076() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f547;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f547.getLayoutParams();
            if (this.f547.isShown()) {
                if (this.f506 == null) {
                    this.f506 = new Rect();
                    this.f507 = new Rect();
                }
                Rect rect2 = this.f506;
                Rect rect3 = this.f507;
                if (f5Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f5Var.m3074(), f5Var.m3076(), f5Var.m3075(), f5Var.m3073());
                }
                p3.m1476(this.f512, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                f5 m2875 = f1.m2875(this.f512);
                int m3074 = m2875 == null ? 0 : m2875.m3074();
                int m3075 = m2875 == null ? 0 : m2875.m3075();
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z6 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z6 = true;
                }
                if (i5 <= 0 || this.f514 != null) {
                    View view = this.f514;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != m3074 || marginLayoutParams2.rightMargin != m3075) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = m3074;
                            marginLayoutParams2.rightMargin = m3075;
                            this.f514.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f525);
                    this.f514 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m3074;
                    layoutParams.rightMargin = m3075;
                    this.f512.addView(this.f514, -1, layoutParams);
                }
                View view3 = this.f514;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    m650(this.f514);
                }
                if (!this.f520 && r5) {
                    m3076 = 0;
                }
                z5 = r5;
                r5 = z6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z5 = false;
            } else {
                z5 = false;
                r5 = false;
            }
            if (r5) {
                this.f547.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f514;
        if (view4 != null) {
            view4.setVisibility(z5 ? 0 : 8);
        }
        return m3076;
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ʿ */
    public void mo596(View view, ViewGroup.LayoutParams layoutParams) {
        m626();
        ((ViewGroup) this.f512.findViewById(R.id.content)).addView(view, layoutParams);
        this.f529.m714(this.f527.getCallback());
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ʿʿ */
    public void mo597() {
        androidx.appcompat.app.a mo614 = mo614();
        if (mo614 != null) {
            mo614.mo490(false);
        }
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˆ */
    public boolean mo598() {
        return m651(true);
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˆˆ */
    public boolean mo599(int i5) {
        int m643 = m643(i5);
        if (this.f522 && m643 == 108) {
            return false;
        }
        if (this.f518 && m643 == 1) {
            this.f518 = false;
        }
        if (m643 == 1) {
            m645();
            this.f522 = true;
            return true;
        }
        if (m643 == 2) {
            m645();
            this.f528 = true;
            return true;
        }
        if (m643 == 5) {
            m645();
            this.f516 = true;
            return true;
        }
        if (m643 == 10) {
            m645();
            this.f520 = true;
            return true;
        }
        if (m643 == 108) {
            m645();
            this.f518 = true;
            return true;
        }
        if (m643 != 109) {
            return this.f527.requestFeature(m643);
        }
        m645();
        this.f517 = true;
        return true;
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˈˈ */
    public void mo600(View view) {
        m626();
        ViewGroup viewGroup = (ViewGroup) this.f512.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f529.m714(this.f527.getCallback());
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˉˉ */
    public void mo602(int i5) {
        m626();
        ViewGroup viewGroup = (ViewGroup) this.f512.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f525).inflate(i5, viewGroup);
        this.f529.m714(this.f527.getCallback());
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˊ */
    public Context mo603(Context context) {
        this.f536 = true;
        int m672 = m672(context, m655());
        if (androidx.appcompat.app.g.m591(context)) {
            androidx.appcompat.app.g.m586(context);
        }
        androidx.core.os.i m689 = m689(context);
        if (f495 && (context instanceof ContextThemeWrapper)) {
            try {
                t.m723((ContextThemeWrapper) context, m624(context, m672, m689, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).m841(m624(context, m672, m689, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f494) {
            return super.mo603(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = k.m699(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration m624 = m624(context, m672, m689, !configuration2.equals(configuration3) ? m628(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, e.i.f7077);
        dVar.m841(m624);
        boolean z5 = false;
        try {
            z5 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z5) {
            i.g.m2132(dVar.getTheme());
        }
        return super.mo603(dVar);
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˋˋ */
    public void mo604(View view, ViewGroup.LayoutParams layoutParams) {
        m626();
        ViewGroup viewGroup = (ViewGroup) this.f512.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f529.m714(this.f527.getCallback());
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˎˎ */
    public void mo605(Toolbar toolbar) {
        if (this.f523 instanceof Activity) {
            androidx.appcompat.app.a mo614 = mo614();
            if (mo614 instanceof f0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f535 = null;
            if (mo614 != null) {
                mo614.mo482();
            }
            this.f533 = null;
            if (toolbar != null) {
                c0 c0Var = new c0(toolbar, m669(), this.f529);
                this.f533 = c0Var;
                this.f529.m716(c0Var.f418);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f529.m716(null);
            }
            mo617();
        }
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˏ */
    public <T extends View> T mo606(int i5) {
        m626();
        return (T) this.f527.findViewById(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // androidx.appcompat.app.g
    /* renamed from: ˏˏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo607(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.mo607(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f510
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f511
            if (r1 == 0) goto L11
            androidx.appcompat.app.h.o.m712(r0, r1)
            r0 = 0
            r2.f511 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f523
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f523
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.h.o.m710(r3)
            r2.f510 = r3
            goto L2e
        L2c:
            r2.f510 = r3
        L2e:
            r2.m687()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.mo607(android.window.OnBackInvokedDispatcher):void");
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ˑˑ */
    public void mo608(int i5) {
        this.f546 = i5;
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: י */
    public Context mo609() {
        return this.f525;
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ٴ */
    public int mo610() {
        return this.f530;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    androidx.core.os.i m689(Context context) {
        androidx.core.os.i m590;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 || (m590 = androidx.appcompat.app.g.m590()) == null) {
            return null;
        }
        androidx.core.os.i m667 = m667(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i m499 = i5 >= 24 ? a0.m499(m590, m667) : m590.m2424() ? androidx.core.os.i.m2421() : androidx.core.os.i.m2420(m590.m2423(0).toString());
        return m499.m2424() ? m667 : m499;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // androidx.appcompat.app.g
    /* renamed from: ᐧᐧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo611() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f523
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.m580(r3)
        L9:
            boolean r0 = r3.f502
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f527
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f504
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f542 = r0
            int r0 = r3.f530
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f523
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            m.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f491
            java.lang.Object r1 = r3.f523
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f530
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            m.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f491
            java.lang.Object r1 = r3.f523
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f533
            if (r0 == 0) goto L5b
            r0.mo482()
        L5b:
            r3.m623()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.mo611():void");
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ᴵ */
    public MenuInflater mo612() {
        if (this.f535 == null) {
            m632();
            androidx.appcompat.app.a aVar = this.f533;
            this.f535 = new androidx.appcompat.view.g(aVar != null ? aVar.mo479() : this.f525);
        }
        return this.f535;
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ᴵᴵ */
    public void mo613(Bundle bundle) {
        m626();
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ᵔ */
    public androidx.appcompat.app.a mo614() {
        m632();
        return this.f533;
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ᵔᵔ */
    public final void mo615(CharSequence charSequence) {
        this.f537 = charSequence;
        v1 v1Var = this.f539;
        if (v1Var != null) {
            v1Var.setWindowTitle(charSequence);
            return;
        }
        if (m680() != null) {
            m680().mo491(charSequence);
            return;
        }
        TextView textView = this.f515;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ᵢ */
    public void mo616() {
        LayoutInflater from = LayoutInflater.from(this.f525);
        if (from.getFactory() == null) {
            androidx.core.view.t.m3318(from, this);
        } else {
            if (from.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ⁱ */
    public void mo617() {
        if (m680() == null || mo614().mo480()) {
            return;
        }
        m636(0);
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ﾞ */
    public void mo618(Configuration configuration) {
        androidx.appcompat.app.a mo614;
        if (this.f518 && this.f513 && (mo614 = mo614()) != null) {
            mo614.mo481(configuration);
        }
        androidx.appcompat.widget.j.m1375().m1382(this.f525);
        this.f544 = new Configuration(this.f525.getResources().getConfiguration());
        m652(false, false);
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ﾞﾞ */
    public void mo619(Bundle bundle) {
        String str;
        this.f536 = true;
        m651(false);
        m627();
        Object obj = this.f523;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.p.m1974((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a m680 = m680();
                if (m680 == null) {
                    this.f505 = true;
                } else {
                    m680.mo486(true);
                }
            }
            androidx.appcompat.app.g.m579(this);
        }
        this.f544 = new Configuration(this.f525.getResources().getConfiguration());
        this.f540 = true;
    }

    h(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        m.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.c m646;
        this.f534 = null;
        this.f497 = true;
        this.f530 = -100;
        this.f504 = new b();
        this.f525 = context;
        this.f531 = dVar;
        this.f523 = obj;
        if (this.f530 == -100 && (obj instanceof Dialog) && (m646 = m646()) != null) {
            this.f530 = m646.m516().mo610();
        }
        if (this.f530 == -100 && (num = (gVar = f491).get(obj.getClass().getName())) != null) {
            this.f530 = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            m654(window);
        }
        androidx.appcompat.widget.j.m1377();
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class p extends androidx.appcompat.view.k {

        /* renamed from: ʿ, reason: contains not printable characters */
        private InterfaceC0013h f561;

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f562;

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean f563;

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f564;

        p(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f563 ? m870().dispatchKeyEvent(keyEvent) : h.this.m662(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.m675(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f562) {
                m870().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i5, Menu menu) {
            if (i5 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i5, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public View onCreatePanelView(int i5) {
            View onCreatePanelView;
            InterfaceC0013h interfaceC0013h = this.f561;
            return (interfaceC0013h == null || (onCreatePanelView = interfaceC0013h.onCreatePanelView(i5)) == null) ? super.onCreatePanelView(i5) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onMenuOpened(int i5, Menu menu) {
            super.onMenuOpened(i5, menu);
            h.this.m677(i5);
            return true;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public void onPanelClosed(int i5, Menu menu) {
            if (this.f564) {
                m870().onPanelClosed(i5, menu);
            } else {
                super.onPanelClosed(i5, menu);
                h.this.m678(i5);
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onPreparePanel(int i5, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i5 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.setOverrideVisibleItems(true);
            }
            InterfaceC0013h interfaceC0013h = this.f561;
            boolean z5 = interfaceC0013h != null && interfaceC0013h.mo530(i5);
            if (!z5) {
                z5 = super.onPreparePanel(i5, view, menu);
            }
            if (gVar != null) {
                gVar.setOverrideVisibleItems(false);
            }
            return z5;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i5) {
            androidx.appcompat.view.menu.g gVar;
            v m668 = h.this.m668(0, true);
            if (m668 == null || (gVar = m668.f583) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i5);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i5);
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return h.this.m671() ? m717(callback) : super.onWindowStartingActionMode(callback);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m713(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f563 = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f563 = false;
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m714(Window.Callback callback) {
            try {
                this.f562 = true;
                callback.onContentChanged();
            } finally {
                this.f562 = false;
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m715(Window.Callback callback, int i5, Menu menu) {
            try {
                this.f564 = true;
                callback.onPanelClosed(i5, menu);
            } finally {
                this.f564 = false;
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m716(InterfaceC0013h interfaceC0013h) {
            this.f561 = interfaceC0013h;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        final ActionMode m717(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f525, callback);
            androidx.appcompat.view.b m685 = h.this.m685(aVar);
            if (m685 != null) {
                return aVar.m846(m685);
            }
            return null;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i5) {
            if (h.this.m671() && i5 == 0) {
                return m717(callback);
            }
            return super.onWindowStartingActionMode(callback, i5);
        }
    }

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    void m679(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    /* renamed from: ʽʽ */
    public void mo595(Bundle bundle) {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.m661();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo693() {
        }
    }
}
