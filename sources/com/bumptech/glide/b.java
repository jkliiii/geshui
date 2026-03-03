package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r1.o;

/* compiled from: Glide.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: י, reason: contains not printable characters */
    private static volatile b f5097;

    /* renamed from: ـ, reason: contains not printable characters */
    private static volatile boolean f5098;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final e1.k f5099;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final f1.d f5100;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final g1.h f5101;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final d f5102;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final f1.b f5103;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final o f5104;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final r1.c f5105;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final a f5107;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final List<l> f5106 = new ArrayList();

    /* renamed from: ˑ, reason: contains not printable characters */
    private f f5108 = f.NORMAL;

    /* compiled from: Glide.java */
    public interface a {
        u1.g build();
    }

    b(Context context, e1.k kVar, g1.h hVar, f1.d dVar, f1.b bVar, o oVar, r1.c cVar, int i5, a aVar, Map<Class<?>, m<?, ?>> map, List<u1.f<Object>> list, List<s1.b> list2, s1.a aVar2, e eVar) {
        this.f5099 = kVar;
        this.f5100 = dVar;
        this.f5103 = bVar;
        this.f5101 = hVar;
        this.f5104 = oVar;
        this.f5105 = cVar;
        this.f5107 = aVar;
        this.f5102 = new d(context, bVar, j.m6068(this, list2, aVar2), new v1.f(), aVar, map, list, kVar, eVar, i5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m6010(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f5098) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f5098 = true;
        try {
            m6014(context, generatedAppGlideModule);
        } finally {
            f5098 = false;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static b m6011(Context context) {
        if (f5097 == null) {
            GeneratedAppGlideModule m6012 = m6012(context.getApplicationContext());
            synchronized (b.class) {
                if (f5097 == null) {
                    m6010(context, m6012);
                }
            }
        }
        return f5097;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static GeneratedAppGlideModule m6012(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e5) {
            m6016(e5);
            return null;
        } catch (InstantiationException e6) {
            m6016(e6);
            return null;
        } catch (NoSuchMethodException e7) {
            m6016(e7);
            return null;
        } catch (InvocationTargetException e8) {
            m6016(e8);
            return null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static o m6013(Context context) {
        y1.k.m12894(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m6011(context).m6026();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static void m6014(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m6015(context, new c(), generatedAppGlideModule);
    }

    /* renamed from: י, reason: contains not printable characters */
    private static void m6015(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<s1.b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.m11704()) {
            emptyList = new s1.d(applicationContext).m11711();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m6008().isEmpty()) {
            Set<Class<?>> m6008 = generatedAppGlideModule.m6008();
            Iterator<s1.b> it = emptyList.iterator();
            while (it.hasNext()) {
                s1.b next = it.next();
                if (m6008.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<s1.b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        cVar.m6032(generatedAppGlideModule != null ? generatedAppGlideModule.m6009() : null);
        Iterator<s1.b> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().m11705(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m11703(applicationContext, cVar);
        }
        b m6031 = cVar.m6031(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(m6031);
        f5097 = m6031;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static void m6016(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static l m6017(Context context) {
        return m6013(context).m11648(context);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static l m6018(View view) {
        return m6013(view.getContext()).m11649(view);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m6019();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        m6029(i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m6019() {
        y1.l.m12895();
        this.f5101.m8677();
        this.f5100.mo8527();
        this.f5103.mo8520();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public f1.b m6020() {
        return this.f5103;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public f1.d m6021() {
        return this.f5100;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    r1.c m6022() {
        return this.f5105;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public Context m6023() {
        return this.f5102.getBaseContext();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    d m6024() {
        return this.f5102;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public i m6025() {
        return this.f5102.m6041();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public o m6026() {
        return this.f5104;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m6027(l lVar) {
        synchronized (this.f5106) {
            if (this.f5106.contains(lVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f5106.add(lVar);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    boolean m6028(v1.h<?> hVar) {
        synchronized (this.f5106) {
            Iterator<l> it = this.f5106.iterator();
            while (it.hasNext()) {
                if (it.next().m6099(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m6029(int i5) {
        y1.l.m12895();
        synchronized (this.f5106) {
            Iterator<l> it = this.f5106.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i5);
            }
        }
        this.f5101.mo8669(i5);
        this.f5100.mo8526(i5);
        this.f5103.mo8519(i5);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m6030(l lVar) {
        synchronized (this.f5106) {
            if (!this.f5106.contains(lVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f5106.remove(lVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
