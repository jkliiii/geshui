package n0;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import f4.k;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import n0.d;

/* compiled from: Recreator.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b implements n {

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final a f9499 = new a(null);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f f9500;

    /* compiled from: Recreator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }
    }

    /* compiled from: Recreator.kt */
    /* renamed from: n0.b$b, reason: collision with other inner class name */
    public static final class C0135b implements d.c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Set<String> f9501;

        public C0135b(d dVar) {
            k.m8623(dVar, "registry");
            this.f9501 = new LinkedHashSet();
            dVar.m10408("androidx.savedstate.Restarter", this);
        }

        @Override // n0.d.c
        /* renamed from: ʻ */
        public Bundle mo369() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f9501));
            return bundle;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final void m10400(String str) {
            k.m8623(str, "className");
            this.f9501.add(str);
        }
    }

    public b(f fVar) {
        k.m8623(fVar, "owner");
        this.f9500 = fVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final void m10399(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(d.a.class);
            k.m8622(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    k.m8622(newInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) newInstance).mo4441(this.f9500);
                } catch (Exception e5) {
                    throw new RuntimeException("Failed to instantiate " + str, e5);
                }
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
            }
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("Class " + str + " wasn't found", e7);
        }
    }

    @Override // androidx.lifecycle.n
    /* renamed from: ʿ */
    public void mo389(p pVar, l.a aVar) {
        k.m8623(pVar, "source");
        k.m8623(aVar, "event");
        if (aVar != l.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        pVar.getLifecycle().mo4446(this);
        Bundle m10403 = this.f9500.getSavedStateRegistry().m10403("androidx.savedstate.Restarter");
        if (m10403 == null) {
            return;
        }
        ArrayList<String> stringArrayList = m10403.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m10399(it.next());
        }
    }
}
