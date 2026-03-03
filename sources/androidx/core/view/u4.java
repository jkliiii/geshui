package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: WindowCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class u4 {

    /* compiled from: WindowCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3370(Window window, boolean z5) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* compiled from: WindowCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3371(Window window, boolean z5) {
            window.setDecorFitsSystemWindows(z5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static t6 m3368(Window window, View view) {
        return new t6(window, view);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m3369(Window window, boolean z5) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.m3371(window, z5);
        } else {
            a.m3370(window, z5);
        }
    }
}
