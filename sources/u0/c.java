package u0;

import android.webkit.WebSettings;
import v0.a;
import v0.a0;
import v0.b0;
import v0.c0;
import v0.v;

/* compiled from: WebSettingsCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {
    /* renamed from: ʻ, reason: contains not printable characters */
    private static a0 m12086(WebSettings webSettings) {
        return c0.m12240().m12254(webSettings);
    }

    @Deprecated
    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m12087(WebSettings webSettings, int i5) {
        a.h hVar = b0.f11647;
        if (hVar.mo12229()) {
            v.m12278(webSettings, i5);
        } else {
            if (!hVar.mo12230()) {
                throw b0.m12234();
            }
            m12086(webSettings).m12231(i5);
        }
    }

    @Deprecated
    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m12088(WebSettings webSettings, int i5) {
        if (!b0.f11651.mo12230()) {
            throw b0.m12234();
        }
        m12086(webSettings).m12232(i5);
    }
}
