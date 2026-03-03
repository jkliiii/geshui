package p2;

import android.net.Uri;
import java.util.Date;
import n2.t;
import p2.a;

/* compiled from: RequestHeaders.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Uri f10222;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final c f10223;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f10224;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f10225 = -1;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f10226 = -1;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f10227 = -1;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f10228;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f10229;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f10230;

    /* renamed from: ˋ, reason: contains not printable characters */
    private String f10231;

    /* renamed from: ˎ, reason: contains not printable characters */
    private String f10232;

    /* renamed from: ˏ, reason: contains not printable characters */
    private String f10233;

    /* renamed from: ˑ, reason: contains not printable characters */
    private String f10234;

    /* renamed from: י, reason: contains not printable characters */
    private String f10235;

    /* renamed from: ـ, reason: contains not printable characters */
    private String f10236;

    /* renamed from: ٴ, reason: contains not printable characters */
    private String f10237;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private String f10238;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private String f10239;

    /* compiled from: RequestHeaders.java */
    class a implements a.InterfaceC0148a {
        a() {
        }

        @Override // p2.a.InterfaceC0148a
        /* renamed from: ʻ */
        public void mo11069(String str, String str2) {
            if (str.equalsIgnoreCase("no-cache")) {
                d.this.f10224 = true;
                return;
            }
            if (str.equalsIgnoreCase("max-age")) {
                d.this.f10225 = p2.a.m11066(str2);
                return;
            }
            if (str.equalsIgnoreCase("max-stale")) {
                d.this.f10226 = p2.a.m11066(str2);
            } else if (str.equalsIgnoreCase("min-fresh")) {
                d.this.f10227 = p2.a.m11066(str2);
            } else if (str.equalsIgnoreCase("only-if-cached")) {
                d.this.f10228 = true;
            }
        }
    }

    public d(Uri uri, c cVar) {
        this.f10230 = -1;
        this.f10222 = uri;
        this.f10223 = cVar;
        a aVar = new a();
        for (int i5 = 0; i5 < cVar.m11082(); i5++) {
            String m11077 = cVar.m11077(i5);
            String m11081 = cVar.m11081(i5);
            if ("Cache-Control".equalsIgnoreCase(m11077)) {
                p2.a.m11065(m11081, aVar);
            } else if ("Pragma".equalsIgnoreCase(m11077)) {
                if (m11081.equalsIgnoreCase("no-cache")) {
                    this.f10224 = true;
                }
            } else if ("If-None-Match".equalsIgnoreCase(m11077)) {
                this.f10238 = m11081;
            } else if ("If-Modified-Since".equalsIgnoreCase(m11077)) {
                this.f10237 = m11081;
            } else if ("Authorization".equalsIgnoreCase(m11077)) {
                this.f10229 = true;
            } else if ("Content-Length".equalsIgnoreCase(m11077)) {
                try {
                    this.f10230 = Integer.parseInt(m11081);
                } catch (NumberFormatException unused) {
                }
            } else if ("Transfer-Encoding".equalsIgnoreCase(m11077)) {
                this.f10231 = m11081;
            } else if ("User-Agent".equalsIgnoreCase(m11077)) {
                this.f10232 = m11081;
            } else if ("Host".equalsIgnoreCase(m11077)) {
                this.f10233 = m11081;
            } else if ("Connection".equalsIgnoreCase(m11077)) {
                this.f10234 = m11081;
            } else if ("Accept-Encoding".equalsIgnoreCase(m11077)) {
                this.f10235 = m11081;
            } else if ("Content-Type".equalsIgnoreCase(m11077)) {
                this.f10236 = m11081;
            } else if ("Proxy-Authorization".equalsIgnoreCase(m11077)) {
                this.f10239 = m11081;
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public c m11094() {
        return this.f10223;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m11095() {
        return this.f10225;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public int m11096() {
        return this.f10226;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m11097() {
        return this.f10227;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m11098() {
        return this.f10229;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m11099() {
        return (this.f10237 == null && this.f10238 == null) ? false : true;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m11100() {
        return this.f10224;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m11101(Date date) {
        if (this.f10237 != null) {
            this.f10223.m11083("If-Modified-Since");
        }
        String m10561 = t.m10561(date);
        this.f10223.m11072("If-Modified-Since", m10561);
        this.f10237 = m10561;
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m11102(String str) {
        if (this.f10238 != null) {
            this.f10223.m11083("If-None-Match");
        }
        this.f10223.m11072("If-None-Match", str);
        this.f10238 = str;
    }
}
