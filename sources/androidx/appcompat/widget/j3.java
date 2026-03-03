package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* compiled from: TooltipCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j3 {

    /* compiled from: TooltipCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1400(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m1399(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.m1400(view, charSequence);
        } else {
            m3.m1433(view, charSequence);
        }
    }
}
