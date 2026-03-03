package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.y;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class g {

    /* renamed from: ʾ, reason: contains not printable characters */
    static y.a f482 = new y.a(new y.b());

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int f483 = -100;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static androidx.core.os.i f484 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static androidx.core.os.i f485 = null;

    /* renamed from: ˉ, reason: contains not printable characters */
    private static Boolean f486 = null;

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean f487 = false;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final m.b<WeakReference<g>> f488 = new m.b<>();

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Object f489 = new Object();

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Object f490 = new Object();

    /* compiled from: AppCompatDelegate.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static LocaleList m620(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static LocaleList m621(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m622(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    g() {
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static void m579(g gVar) {
        synchronized (f489) {
            m588(gVar);
            f488.add(new WeakReference<>(gVar));
        }
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    static void m580(g gVar) {
        synchronized (f489) {
            m588(gVar);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static void m581() {
        synchronized (f489) {
            Iterator<WeakReference<g>> it = f488.iterator();
            while (it.hasNext()) {
                g gVar = it.next().get();
                if (gVar != null) {
                    gVar.mo598();
                }
            }
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static void m582(int i5) {
        if (i5 != -1 && i5 != 0 && i5 != 1 && i5 != 2 && i5 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f483 != i5) {
            f483 = i5;
            m581();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static g m583(Activity activity, d dVar) {
        return new h(activity, dVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static g m584(Dialog dialog, d dVar) {
        return new h(dialog, dVar);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static androidx.core.os.i m585() {
        if (androidx.core.os.a.m2404()) {
            Object m589 = m589();
            if (m589 != null) {
                return androidx.core.os.i.m2422(b.m621(m589));
            }
        } else {
            androidx.core.os.i iVar = f484;
            if (iVar != null) {
                return iVar;
            }
        }
        return androidx.core.os.i.m2421();
    }

    /* renamed from: יי, reason: contains not printable characters */
    static void m586(final Context context) {
        if (m591(context)) {
            if (androidx.core.os.a.m2404()) {
                if (f487) {
                    return;
                }
                f482.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.m592(context);
                    }
                });
                return;
            }
            synchronized (f490) {
                androidx.core.os.i iVar = f484;
                if (iVar == null) {
                    if (f485 == null) {
                        f485 = androidx.core.os.i.m2420(y.m743(context));
                    }
                    if (f485.m2424()) {
                    } else {
                        f484 = f485;
                    }
                } else if (!iVar.equals(f485)) {
                    androidx.core.os.i iVar2 = f484;
                    f485 = iVar2;
                    y.m742(context, iVar2.m2426());
                }
            }
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static int m587() {
        return f483;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private static void m588(g gVar) {
        synchronized (f489) {
            Iterator<WeakReference<g>> it = f488.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    static Object m589() {
        Context mo609;
        Iterator<WeakReference<g>> it = f488.iterator();
        while (it.hasNext()) {
            g gVar = it.next().get();
            if (gVar != null && (mo609 = gVar.mo609()) != null) {
                return mo609.getSystemService("locale");
            }
        }
        return null;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    static androidx.core.os.i m590() {
        return f484;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static boolean m591(Context context) {
        if (f486 == null) {
            try {
                Bundle bundle = w.m740(context).metaData;
                if (bundle != null) {
                    f486 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f486 = Boolean.FALSE;
            }
        }
        return f486.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹶ, reason: contains not printable characters */
    public static /* synthetic */ void m592(Context context) {
        y.m744(context);
        f487 = true;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public abstract void mo593();

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public abstract void mo594();

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public abstract void mo595(Bundle bundle);

    /* renamed from: ʿ, reason: contains not printable characters */
    public abstract void mo596(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public abstract void mo597();

    /* renamed from: ˆ, reason: contains not printable characters */
    public abstract boolean mo598();

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public abstract boolean mo599(int i5);

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public abstract void mo600(View view);

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public abstract void mo602(int i5);

    /* renamed from: ˊ, reason: contains not printable characters */
    public Context mo603(Context context) {
        m601(context);
        return context;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public abstract void mo604(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public abstract void mo605(Toolbar toolbar);

    /* renamed from: ˏ, reason: contains not printable characters */
    public abstract <T extends View> T mo606(int i5);

    /* renamed from: י, reason: contains not printable characters */
    public Context mo609() {
        return null;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public int mo610() {
        return -100;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public abstract void mo611();

    /* renamed from: ᴵ, reason: contains not printable characters */
    public abstract MenuInflater mo612();

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public abstract void mo613(Bundle bundle);

    /* renamed from: ᵔ, reason: contains not printable characters */
    public abstract androidx.appcompat.app.a mo614();

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public abstract void mo615(CharSequence charSequence);

    /* renamed from: ᵢ, reason: contains not printable characters */
    public abstract void mo616();

    /* renamed from: ⁱ, reason: contains not printable characters */
    public abstract void mo617();

    /* renamed from: ﾞ, reason: contains not printable characters */
    public abstract void mo618(Configuration configuration);

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public abstract void mo619(Bundle bundle);

    @Deprecated
    /* renamed from: ˉ, reason: contains not printable characters */
    public void m601(Context context) {
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public void mo607(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public void mo608(int i5) {
    }
}
