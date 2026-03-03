package c3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;
import java.util.Map;
import n2.c0;
import n2.d;
import n2.s;
import x2.l;

/* compiled from: CookieMiddleware.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends c0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    CookieManager f4992;

    /* renamed from: ʼ, reason: contains not printable characters */
    SharedPreferences f4993;

    /* renamed from: ʽ, reason: contains not printable characters */
    l f4994;

    public a(l lVar) {
        this.f4994 = lVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m5847(Map<String, List<String>> map, s sVar) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                sVar.m10552(key, entry.getValue());
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m5848() {
        if (this.f4992 == null) {
            m5852();
        }
    }

    @Override // n2.c0, n2.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo5849(d.e eVar) {
        m5848();
        try {
            m5847(this.f4992.get(URI.create(eVar.f9584.m10509().toString()), eVar.f9584.m10502().m10555()), eVar.f9584.m10502());
        } catch (Exception unused) {
        }
    }

    @Override // n2.c0, n2.d
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo5850(d.C0137d c0137d) {
        m5848();
        try {
            m5851(URI.create(c0137d.f9584.m10509().toString()), c0137d.f9580.mo10484());
        } catch (Exception unused) {
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m5851(URI uri, s sVar) {
        m5848();
        try {
            this.f4992.put(uri, sVar.m10555());
            if (sVar.m10554("Set-Cookie") == null) {
                return;
            }
            List<HttpCookie> list = this.f4992.getCookieStore().get(uri);
            s sVar2 = new s();
            for (HttpCookie httpCookie : list) {
                sVar2.m10551("Set-Cookie", httpCookie.getName() + "=" + httpCookie.getValue() + "; path=" + httpCookie.getPath());
            }
            this.f4993.edit().putString(uri.getScheme() + "://" + uri.getAuthority(), sVar2.m10558("HTTP/1.1 200 OK")).commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m5852() {
        this.f4992 = new CookieManager(null, null);
        SharedPreferences sharedPreferences = this.f4994.m12720().getSharedPreferences(this.f4994.m12722() + "-cookies", 0);
        this.f4993 = sharedPreferences;
        for (String str : sharedPreferences.getAll().keySet()) {
            try {
                String string = this.f4993.getString(str, null);
                s sVar = new s();
                boolean z5 = true;
                for (String str2 : string.split("\n")) {
                    if (z5) {
                        z5 = false;
                    } else if (!TextUtils.isEmpty(str2)) {
                        sVar.m10553(str2);
                    }
                }
                this.f4992.put(URI.create(str), sVar.m10555());
            } catch (Exception e5) {
                Log.e("Ion", "unable to load cookies", e5);
            }
        }
    }
}
