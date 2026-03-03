package androidx.core.widget;

import android.widget.ListView;

/* compiled from: ListViewCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class u {

    /* compiled from: ListViewCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m3659(ListView listView, int i5) {
            return listView.canScrollList(i5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m3660(ListView listView, int i5) {
            listView.scrollListBy(i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m3657(ListView listView, int i5) {
        return a.m3659(listView, i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m3658(ListView listView, int i5) {
        a.m3660(listView, i5);
    }
}
