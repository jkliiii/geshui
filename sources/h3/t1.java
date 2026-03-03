package h3;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PageSetting.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t1 {

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean f8379;

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean f8381;

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean f8383;

    /* renamed from: ˈ, reason: contains not printable characters */
    public String f8384;

    /* renamed from: ˉ, reason: contains not printable characters */
    public String f8385;

    /* renamed from: ˊ, reason: contains not printable characters */
    public String f8386;

    /* renamed from: ˋ, reason: contains not printable characters */
    public String f8387;

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean f8378 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean f8382 = false;

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean f8380 = false;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static t1 m9049(String str) {
        t1 t1Var = new t1();
        if (TextUtils.isEmpty(str)) {
            return t1Var;
        }
        Uri parse = Uri.parse(str);
        if (str.indexOf("xapp-navigation=1") > 0) {
            t1Var.f8378 = true;
            t1Var.f8379 = true;
        } else if (str.indexOf("xapp-navigation=0") > 0) {
            t1Var.f8378 = true;
            t1Var.f8379 = false;
        } else {
            t1Var.f8378 = false;
        }
        boolean z5 = "http".equals(parse.getScheme()) || "https".equals(parse.getScheme());
        String queryParameter = z5 ? parse.getQueryParameter("xapp-refresh") : null;
        boolean z6 = !TextUtils.isEmpty(queryParameter);
        t1Var.f8380 = z6;
        if (z6) {
            t1Var.f8381 = m9050(queryParameter);
        }
        String queryParameter2 = z5 ? parse.getQueryParameter("xapp-share") : null;
        boolean isEmpty = true ^ TextUtils.isEmpty(queryParameter2);
        t1Var.f8382 = isEmpty;
        if (isEmpty) {
            t1Var.f8383 = m9050(queryParameter2);
        }
        t1Var.f8384 = z5 ? parse.getQueryParameter("xapp-share-title") : null;
        t1Var.f8385 = z5 ? parse.getQueryParameter("xapp-share-url") : null;
        t1Var.f8386 = z5 ? parse.getQueryParameter("xapp-share-image") : null;
        t1Var.f8387 = z5 ? parse.getQueryParameter("xapp-share-description") : null;
        return t1Var;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m9050(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "1".equals(str.trim()) || Boolean.parseBoolean(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final String m9051(String str) {
        if (TextUtils.isEmpty(str) || str.indexOf("xapp-target") < 1) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("xapp-target");
    }
}
