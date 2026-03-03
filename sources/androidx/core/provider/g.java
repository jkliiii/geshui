package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.m0;

/* compiled from: FontsContractCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g {

    /* compiled from: FontsContractCompat.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int f2782;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final b[] f2783;

        @Deprecated
        public a(int i5, b[] bVarArr) {
            this.f2782 = i5;
            this.f2783 = bVarArr;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static a m2480(int i5, b[] bVarArr) {
            return new a(i5, bVarArr);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public b[] m2481() {
            return this.f2783;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m2482() {
            return this.f2782;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Uri f2784;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f2785;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f2786;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final boolean f2787;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int f2788;

        @Deprecated
        public b(Uri uri, int i5, int i6, boolean z5, int i7) {
            this.f2784 = (Uri) androidx.core.util.h.m2583(uri);
            this.f2785 = i5;
            this.f2786 = i6;
            this.f2787 = z5;
            this.f2788 = i7;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static b m2483(Uri uri, int i5, int i6, boolean z5, int i7) {
            return new b(uri, i5, i6, z5, i7);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m2484() {
            return this.f2788;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m2485() {
            return this.f2785;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public Uri m2486() {
            return this.f2784;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public int m2487() {
            return this.f2786;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public boolean m2488() {
            return this.f2787;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class c {
        /* renamed from: ʻ */
        public void mo2326(int i5) {
            throw null;
        }

        /* renamed from: ʼ */
        public void mo2327(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Typeface m2477(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return m0.m2319(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static a m2478(Context context, CancellationSignal cancellationSignal, e eVar) throws PackageManager.NameNotFoundException {
        return d.m2455(context, eVar, cancellationSignal);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Typeface m2479(Context context, e eVar, int i5, boolean z5, int i6, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z5 ? f.m2471(context, eVar, aVar, i5, i6) : f.m2470(context, eVar, i5, null, aVar);
    }
}
