package v0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ApiFeature.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a implements w {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Set<a> f11597 = new HashSet();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String f11598;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f11599;

    /* compiled from: ApiFeature.java */
    /* renamed from: v0.a$a, reason: collision with other inner class name */
    private static class C0165a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final Set<String> f11600 = new HashSet(Arrays.asList(c0.m12241().mo12247()));
    }

    /* compiled from: ApiFeature.java */
    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʽ */
        public final boolean mo12229() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f11598 = str;
        this.f11599 = str2;
        f11597.add(this);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Set<a> m12226() {
        return Collections.unmodifiableSet(f11597);
    }

    @Override // v0.w
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo12227() {
        return mo12229() || mo12230();
    }

    @Override // v0.w
    /* renamed from: ʼ, reason: contains not printable characters */
    public String mo12228() {
        return this.f11598;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public abstract boolean mo12229();

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean mo12230() {
        return d5.a.m8258(C0165a.f11600, this.f11599);
    }
}
