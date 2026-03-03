package l3;

import android.text.TextUtils;
import g3.a0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: LT.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {
    public long __t = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public long f12856b;

    /* renamed from: c, reason: collision with root package name */
    public long f12857c;
    public String cbg;
    public String cft;
    public String csb;
    public String css;
    public e guide;
    public String igs;
    public boolean isOk;
    public List<String> jss;
    public int jsy;
    public String key;
    public Map<String, Object> kv;
    public int ls;
    public int ltid;
    public int m26h;
    public int m26w;
    public String m27c;
    public int m27h;
    public String m27i;
    public int m27w;
    public String m40tb;
    public j m52;
    public String m53bg;
    public String msg;
    public String navLogo;

    /* renamed from: p, reason: collision with root package name */
    public long f12858p;
    public d page;
    public List<c> pages;
    public int pd;
    public int ruleFs;
    public List<w> rules;
    public int sd;
    public String shareImg;
    public g sp_skip;
    public f splash;
    public String tab;
    public int tabh;
    public String tb;
    public String title;
    public String ua;
    public String uaExt;
    public List<h> uis;
    public String url;
    public i ver;

    /* renamed from: x, reason: collision with root package name */
    public long f12859x;

    /* renamed from: x2, reason: collision with root package name */
    public long f12860x2;

    /* renamed from: x3, reason: collision with root package name */
    public long f12861x3;

    /* renamed from: x4, reason: collision with root package name */
    public long f12862x4;
    public long x5;
    public long x6;

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m9727() {
        if (TextUtils.isEmpty(this.csb)) {
            this.csb = "#333333";
        }
        if (TextUtils.isEmpty(this.cbg)) {
            this.cbg = "#333333";
        }
        if (TextUtils.isEmpty(this.cft)) {
            this.cft = "#FFFFFF";
        }
        String str = this.url;
        if (str != null && str.startsWith("local:")) {
            this.url = "file:///android_asset/" + this.url.substring(6);
        }
        if (this.page == null) {
            this.page = new d();
        }
        this.page.m9736();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m9728(int i5) {
        long j5 = 1 << i5;
        return (this.f12856b & j5) == j5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m9729(int i5) {
        long j5 = 1 << i5;
        return (this.f12857c & j5) == j5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m9730(String str) {
        return !TextUtils.isEmpty(this.m40tb) && a0.m8709(this.m40tb, str);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public String m9731(String str) {
        List<w> list = this.rules;
        if (list != null && list.size() != 0) {
            Iterator<w> it = this.rules.iterator();
            while (it.hasNext()) {
                String m9744 = it.next().m9744(str);
                if (m9744 != null) {
                    return m9744;
                }
            }
        }
        return str;
    }
}
