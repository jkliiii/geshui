package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import m.h;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends androidx.loader.app.a {

    /* renamed from: ʽ, reason: contains not printable characters */
    static boolean f3894 = false;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final p f3895;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final C0055b f3896;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0055b extends n0 {

        /* renamed from: ˆ, reason: contains not printable characters */
        private static final o0.b f3900 = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        private h<a> f3901 = new h<>();

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f3902 = false;

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements o0.b {
            a() {
            }

            @Override // androidx.lifecycle.o0.b
            /* renamed from: ʻ */
            public <T extends n0> T mo4286(Class<T> cls) {
                return new C0055b();
            }

            @Override // androidx.lifecycle.o0.b
            /* renamed from: ʼ */
            public /* synthetic */ n0 mo4287(Class cls, j0.a aVar) {
                return p0.m4475(this, cls, aVar);
            }
        }

        C0055b() {
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static C0055b m4524(r0 r0Var) {
            return (C0055b) new o0(r0Var, f3900).m4465(C0055b.class);
        }

        @Override // androidx.lifecycle.n0
        /* renamed from: ʾ */
        protected void mo4275() {
            super.mo4275();
            int m9844 = this.f3901.m9844();
            for (int i5 = 0; i5 < m9844; i5++) {
                this.f3901.m9845(i5).m4521(true);
            }
            this.f3901.m9837();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public void m4525(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3901.m9844() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i5 = 0; i5 < this.f3901.m9844(); i5++) {
                    a m9845 = this.f3901.m9845(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3901.m9842(i5));
                    printWriter.print(": ");
                    printWriter.println(m9845.toString());
                    m9845.m4522(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        void m4526() {
            int m9844 = this.f3901.m9844();
            for (int i5 = 0; i5 < m9844; i5++) {
                this.f3901.m9845(i5).m4523();
            }
        }
    }

    b(p pVar, r0 r0Var) {
        this.f3895 = pVar;
        this.f3896 = C0055b.m4524(r0Var);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.m2567(this.f3895, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.a
    @Deprecated
    /* renamed from: ʻ */
    public void mo4519(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3896.m4525(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    /* renamed from: ʽ */
    public void mo4520() {
        this.f3896.m4526();
    }

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends v<D> {

        /* renamed from: ˏ, reason: contains not printable characters */
        private final int f3897;

        /* renamed from: ˑ, reason: contains not printable characters */
        private final Bundle f3898;

        /* renamed from: י, reason: contains not printable characters */
        private p f3899;

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3897);
            sb.append(" : ");
            androidx.core.util.b.m2567(null, sb);
            sb.append("}}");
            return sb.toString();
        }

        @Override // androidx.lifecycle.t
        /* renamed from: ˆ */
        protected void mo4508() {
            if (b.f3894) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.t
        /* renamed from: ˈ */
        protected void mo4509() {
            if (b.f3894) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.t
        /* renamed from: ˉ */
        public void mo4510(w<? super D> wVar) {
            super.mo4510(wVar);
            this.f3899 = null;
        }

        @Override // androidx.lifecycle.v, androidx.lifecycle.t
        /* renamed from: ˊ */
        public void mo4511(D d6) {
            super.mo4511(d6);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        k0.a<D> m4521(boolean z5) {
            if (b.f3894) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public void m4522(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3897);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3898);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        void m4523() {
        }
    }
}
