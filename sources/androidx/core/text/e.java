package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* compiled from: HtmlCompat.java */
@SuppressLint({"InlinedApi"})
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* compiled from: HtmlCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Spanned m2537(String str, int i5) {
            return Html.fromHtml(str, i5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static Spanned m2538(String str, int i5, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i5, imageGetter, tagHandler);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static String m2539(Spanned spanned, int i5) {
            return Html.toHtml(spanned, i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Spanned m2536(String str, int i5) {
        return Build.VERSION.SDK_INT >= 24 ? a.m2537(str, i5) : Html.fromHtml(str);
    }
}
