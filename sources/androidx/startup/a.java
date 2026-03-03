package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0.c;
import q0.b;

/* compiled from: AppInitializer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static volatile a f4344;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Object f4345 = new Object();

    /* renamed from: ʽ, reason: contains not printable characters */
    final Context f4348;

    /* renamed from: ʼ, reason: contains not printable characters */
    final Set<Class<? extends o0.a<?>>> f4347 = new HashSet();

    /* renamed from: ʻ, reason: contains not printable characters */
    final Map<Class<?>, Object> f4346 = new HashMap();

    a(Context context) {
        this.f4348 = context.getApplicationContext();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private <T> T m5240(Class<? extends o0.a<?>> cls, Set<Class<?>> set) {
        T t5;
        if (b.m11463()) {
            try {
                b.m11460(cls.getSimpleName());
            } finally {
                b.m11461();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f4346.containsKey(cls)) {
            t5 = (T) this.f4346.get(cls);
        } else {
            set.add(cls);
            try {
                o0.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends o0.a<?>>> mo3747 = newInstance.mo3747();
                if (!mo3747.isEmpty()) {
                    for (Class<? extends o0.a<?>> cls2 : mo3747) {
                        if (!this.f4346.containsKey(cls2)) {
                            m5240(cls2, set);
                        }
                    }
                }
                t5 = (T) newInstance.mo3748(this.f4348);
                set.remove(cls);
                this.f4346.put(cls, t5);
            } catch (Throwable th) {
                throw new c(th);
            }
        }
        return t5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static a m5241(Context context) {
        if (f4344 == null) {
            synchronized (f4345) {
                if (f4344 == null) {
                    f4344 = new a(context);
                }
            }
        }
        return f4344;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m5242() {
        try {
            try {
                b.m11460("Startup");
                m5243(this.f4348.getPackageManager().getProviderInfo(new ComponentName(this.f4348.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e5) {
                throw new c(e5);
            }
        } finally {
            b.m11461();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    void m5243(Bundle bundle) {
        String string = this.f4348.getString(o0.b.f10064);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (o0.a.class.isAssignableFrom(cls)) {
                            this.f4347.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends o0.a<?>>> it = this.f4347.iterator();
                while (it.hasNext()) {
                    m5240(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e5) {
                throw new c(e5);
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    <T> T m5244(Class<? extends o0.a<?>> cls) {
        T t5;
        synchronized (f4345) {
            t5 = (T) this.f4346.get(cls);
            if (t5 == null) {
                t5 = (T) m5240(cls, new HashSet());
            }
        }
        return t5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public <T> T m5245(Class<? extends o0.a<T>> cls) {
        return (T) m5244(cls);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m5246(Class<? extends o0.a<?>> cls) {
        return this.f4347.contains(cls);
    }
}
