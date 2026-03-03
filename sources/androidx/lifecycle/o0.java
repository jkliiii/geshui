package androidx.lifecycle;

import android.app.Application;
import j0.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final r0 f3847;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final b f3848;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final j0.a f3849;

    /* compiled from: ViewModelProvider.kt */
    public interface b {
        /* renamed from: ʻ */
        <T extends n0> T mo4286(Class<T> cls);

        /* renamed from: ʼ */
        <T extends n0> T mo4287(Class<T> cls, j0.a aVar);
    }

    /* compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* renamed from: ʼ, reason: contains not printable characters */
        private static c f3856;

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final a f3855 = new a(null);

        /* renamed from: ʽ, reason: contains not printable characters */
        public static final a.b<String> f3857 = a.C0054a.f3858;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* compiled from: ViewModelProvider.kt */
            /* renamed from: androidx.lifecycle.o0$c$a$a, reason: collision with other inner class name */
            private static final class C0054a implements a.b<String> {

                /* renamed from: ʻ, reason: contains not printable characters */
                public static final C0054a f3858 = new C0054a();

                private C0054a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(f4.g gVar) {
                this();
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            public final c m4473() {
                if (c.f3856 == null) {
                    c.f3856 = new c();
                }
                c cVar = c.f3856;
                f4.k.m8620(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.o0.b
        /* renamed from: ʻ */
        public <T extends n0> T mo4286(Class<T> cls) {
            f4.k.m8623(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                f4.k.m8622(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (InstantiationException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            }
        }

        @Override // androidx.lifecycle.o0.b
        /* renamed from: ʼ */
        public /* synthetic */ n0 mo4287(Class cls, j0.a aVar) {
            return p0.m4475(this, cls, aVar);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public static class d {
        /* renamed from: ʽ */
        public void mo4442(n0 n0Var) {
            f4.k.m8623(n0Var, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, b bVar) {
        this(r0Var, bVar, null, 4, null);
        f4.k.m8623(r0Var, "store");
        f4.k.m8623(bVar, "factory");
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public <T extends n0> T m4465(Class<T> cls) {
        f4.k.m8623(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m4466("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public <T extends n0> T m4466(String str, Class<T> cls) {
        T t5;
        f4.k.m8623(str, "key");
        f4.k.m8623(cls, "modelClass");
        T t6 = (T) this.f3847.m4493(str);
        if (!cls.isInstance(t6)) {
            j0.b bVar = new j0.b(this.f3849);
            bVar.m9277(c.f3857, str);
            try {
                t5 = (T) this.f3848.mo4287(cls, bVar);
            } catch (AbstractMethodError unused) {
                t5 = (T) this.f3848.mo4286(cls);
            }
            this.f3847.m4495(str, t5);
            return t5;
        }
        Object obj = this.f3848;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            f4.k.m8620(t6);
            dVar.mo4442(t6);
        }
        f4.k.m8621(t6, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t6;
    }

    /* compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* renamed from: ˆ, reason: contains not printable characters */
        private static a f3851;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Application f3853;

        /* renamed from: ʿ, reason: contains not printable characters */
        public static final C0052a f3850 = new C0052a(null);

        /* renamed from: ˈ, reason: contains not printable characters */
        public static final a.b<Application> f3852 = C0052a.C0053a.f3854;

        /* compiled from: ViewModelProvider.kt */
        /* renamed from: androidx.lifecycle.o0$a$a, reason: collision with other inner class name */
        public static final class C0052a {

            /* compiled from: ViewModelProvider.kt */
            /* renamed from: androidx.lifecycle.o0$a$a$a, reason: collision with other inner class name */
            private static final class C0053a implements a.b<Application> {

                /* renamed from: ʻ, reason: contains not printable characters */
                public static final C0053a f3854 = new C0053a();

                private C0053a() {
                }
            }

            private C0052a() {
            }

            public /* synthetic */ C0052a(f4.g gVar) {
                this();
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            public final a m4470(Application application) {
                f4.k.m8623(application, "application");
                if (a.f3851 == null) {
                    a.f3851 = new a(application);
                }
                a aVar = a.f3851;
                f4.k.m8620(aVar);
                return aVar;
            }
        }

        private a(Application application, int i5) {
            this.f3853 = application;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private final <T extends n0> T m4469(Class<T> cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) super.mo4286(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                f4.k.m8622(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (InstantiationException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            }
        }

        @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
        /* renamed from: ʻ */
        public <T extends n0> T mo4286(Class<T> cls) {
            f4.k.m8623(cls, "modelClass");
            Application application = this.f3853;
            if (application != null) {
                return (T) m4469(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
        /* renamed from: ʼ */
        public <T extends n0> T mo4287(Class<T> cls, j0.a aVar) {
            f4.k.m8623(cls, "modelClass");
            f4.k.m8623(aVar, "extras");
            if (this.f3853 != null) {
                return (T) mo4286(cls);
            }
            Application application = (Application) aVar.mo9275(f3852);
            if (application != null) {
                return (T) m4469(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.mo4286(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            f4.k.m8623(application, "application");
        }
    }

    public o0(r0 r0Var, b bVar, j0.a aVar) {
        f4.k.m8623(r0Var, "store");
        f4.k.m8623(bVar, "factory");
        f4.k.m8623(aVar, "defaultCreationExtras");
        this.f3847 = r0Var;
        this.f3848 = bVar;
        this.f3849 = aVar;
    }

    public /* synthetic */ o0(r0 r0Var, b bVar, j0.a aVar, int i5, f4.g gVar) {
        this(r0Var, bVar, (i5 & 4) != 0 ? a.C0121a.f8610 : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, b bVar) {
        this(s0Var.getViewModelStore(), bVar, q0.m4491(s0Var));
        f4.k.m8623(s0Var, "owner");
        f4.k.m8623(bVar, "factory");
    }
}
