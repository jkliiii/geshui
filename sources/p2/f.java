package p2;

import android.net.Uri;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import n2.t;
import p2.a;

/* compiled from: ResponseHeaders.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Uri f10286;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final c f10287;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Date f10288;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Date f10289;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Date f10290;

    /* renamed from: ˆ, reason: contains not printable characters */
    private long f10291;

    /* renamed from: ˈ, reason: contains not printable characters */
    private long f10292;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f10293;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f10294;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f10295 = -1;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f10296 = -1;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f10297;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f10298;

    /* renamed from: י, reason: contains not printable characters */
    private String f10299;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f10300;

    /* renamed from: ٴ, reason: contains not printable characters */
    private Set<String> f10301;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private String f10302;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private String f10303;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private long f10304;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private String f10305;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private String f10306;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private String f10307;

    /* compiled from: ResponseHeaders.java */
    class a implements a.InterfaceC0148a {
        a() {
        }

        @Override // p2.a.InterfaceC0148a
        /* renamed from: ʻ */
        public void mo11069(String str, String str2) {
            if (str.equalsIgnoreCase("no-cache")) {
                f.this.f10293 = true;
                return;
            }
            if (str.equalsIgnoreCase("no-store")) {
                f.this.f10294 = true;
                return;
            }
            if (str.equalsIgnoreCase("max-age")) {
                f.this.f10295 = p2.a.m11066(str2);
            } else if (str.equalsIgnoreCase("s-maxage")) {
                f.this.f10296 = p2.a.m11066(str2);
            } else if (str.equalsIgnoreCase("public")) {
                f.this.f10297 = true;
            } else if (str.equalsIgnoreCase("must-revalidate")) {
                f.this.f10298 = true;
            }
        }
    }

    public f(Uri uri, c cVar) {
        this.f10300 = -1;
        this.f10301 = Collections.emptySet();
        this.f10304 = -1L;
        this.f10286 = uri;
        this.f10287 = cVar;
        a aVar = new a();
        for (int i5 = 0; i5 < cVar.m11082(); i5++) {
            String m11077 = cVar.m11077(i5);
            String m11081 = cVar.m11081(i5);
            if ("Cache-Control".equalsIgnoreCase(m11077)) {
                p2.a.m11065(m11081, aVar);
            } else if ("Date".equalsIgnoreCase(m11077)) {
                this.f10288 = t.m10562(m11081);
            } else if ("Expires".equalsIgnoreCase(m11077)) {
                this.f10290 = t.m10562(m11081);
            } else if ("Last-Modified".equalsIgnoreCase(m11077)) {
                this.f10289 = t.m10562(m11081);
            } else if ("ETag".equalsIgnoreCase(m11077)) {
                this.f10299 = m11081;
            } else if ("Pragma".equalsIgnoreCase(m11077)) {
                if (m11081.equalsIgnoreCase("no-cache")) {
                    this.f10293 = true;
                }
            } else if ("Age".equalsIgnoreCase(m11077)) {
                this.f10300 = p2.a.m11066(m11081);
            } else if ("Vary".equalsIgnoreCase(m11077)) {
                if (this.f10301.isEmpty()) {
                    this.f10301 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : m11081.split(",")) {
                    this.f10301.add(str.trim().toLowerCase(Locale.US));
                }
            } else if ("Content-Encoding".equalsIgnoreCase(m11077)) {
                this.f10302 = m11081;
            } else if ("Transfer-Encoding".equalsIgnoreCase(m11077)) {
                this.f10303 = m11081;
            } else if ("Content-Length".equalsIgnoreCase(m11077)) {
                try {
                    this.f10304 = Long.parseLong(m11081);
                } catch (NumberFormatException unused) {
                }
            } else if ("Connection".equalsIgnoreCase(m11077)) {
                this.f10305 = m11081;
            } else if ("Proxy-Authenticate".equalsIgnoreCase(m11077)) {
                this.f10306 = m11081;
            } else if ("WWW-Authenticate".equalsIgnoreCase(m11077)) {
                this.f10307 = m11081;
            } else if ("X-Android-Sent-Millis".equalsIgnoreCase(m11077)) {
                this.f10291 = Long.parseLong(m11081);
            } else if ("X-Android-Received-Millis".equalsIgnoreCase(m11077)) {
                this.f10292 = Long.parseLong(m11081);
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private long m11129(long j5) {
        Date date = this.f10288;
        long max = date != null ? Math.max(0L, this.f10292 - date.getTime()) : 0L;
        int i5 = this.f10300;
        if (i5 != -1) {
            max = Math.max(max, TimeUnit.SECONDS.toMillis(i5));
        }
        long j6 = this.f10292;
        return max + (j6 - this.f10291) + (j5 - j6);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private long m11130() {
        int i5 = this.f10295;
        if (i5 != -1) {
            return TimeUnit.SECONDS.toMillis(i5);
        }
        if (this.f10290 != null) {
            Date date = this.f10288;
            long time = this.f10290.getTime() - (date != null ? date.getTime() : this.f10292);
            if (time > 0) {
                return time;
            }
            return 0L;
        }
        if (this.f10289 == null || this.f10286.getEncodedQuery() != null) {
            return 0L;
        }
        Date date2 = this.f10288;
        long time2 = (date2 != null ? date2.getTime() : this.f10291) - this.f10289.getTime();
        if (time2 > 0) {
            return time2 / 10;
        }
        return 0L;
    }

    /* renamed from: י, reason: contains not printable characters */
    private static boolean m11131(String str) {
        return (str.equalsIgnoreCase("Connection") || str.equalsIgnoreCase("Keep-Alive") || str.equalsIgnoreCase("Proxy-Authenticate") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("TE") || str.equalsIgnoreCase("Trailers") || str.equalsIgnoreCase("Transfer-Encoding") || str.equalsIgnoreCase("Upgrade")) ? false : true;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean m11132() {
        return this.f10295 == -1 && this.f10290 == null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public g m11133(long j5, d dVar) {
        if (!m11137(dVar)) {
            return g.NETWORK;
        }
        if (dVar.m11100() || dVar.m11099()) {
            return g.NETWORK;
        }
        long m11129 = m11129(j5);
        long m11130 = m11130();
        if (dVar.m11095() != -1) {
            m11130 = Math.min(m11130, TimeUnit.SECONDS.toMillis(dVar.m11095()));
        }
        long j6 = 0;
        long millis = dVar.m11097() != -1 ? TimeUnit.SECONDS.toMillis(dVar.m11097()) : 0L;
        if (!this.f10298 && dVar.m11096() != -1) {
            j6 = TimeUnit.SECONDS.toMillis(dVar.m11096());
        }
        if (!this.f10293) {
            long j7 = millis + m11129;
            if (j7 < j6 + m11130) {
                if (j7 >= m11130) {
                    this.f10287.m11072("Warning", "110 HttpURLConnection \"Response is stale\"");
                }
                if (m11129 > 86400000 && m11132()) {
                    this.f10287.m11072("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                }
                return g.CACHE;
            }
        }
        String str = this.f10299;
        if (str != null) {
            dVar.m11102(str);
        } else {
            Date date = this.f10289;
            if (date != null) {
                dVar.m11101(date);
            } else {
                Date date2 = this.f10288;
                if (date2 != null) {
                    dVar.m11101(date2);
                }
            }
        }
        return dVar.m11099() ? g.CONDITIONAL_CACHE : g.NETWORK;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public f m11134(f fVar) {
        c cVar = new c();
        for (int i5 = 0; i5 < this.f10287.m11082(); i5++) {
            String m11077 = this.f10287.m11077(i5);
            String m11081 = this.f10287.m11081(i5);
            if ((!m11077.equals("Warning") || !m11081.startsWith("1")) && (!m11131(m11077) || fVar.f10287.m11075(m11077) == null)) {
                cVar.m11072(m11077, m11081);
            }
        }
        for (int i6 = 0; i6 < fVar.f10287.m11082(); i6++) {
            String m110772 = fVar.f10287.m11077(i6);
            if (m11131(m110772)) {
                cVar.m11072(m110772, fVar.f10287.m11081(i6));
            }
        }
        return new f(this.f10286, cVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public c m11135() {
        return this.f10287;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public Set<String> m11136() {
        return this.f10301;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m11137(d dVar) {
        int m11078 = this.f10287.m11078();
        if (m11078 == 200 || m11078 == 203 || m11078 == 300 || m11078 == 301 || m11078 == 410) {
            return (!dVar.m11098() || this.f10297 || this.f10298 || this.f10296 != -1) && !this.f10294;
        }
        return false;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public void m11138(long j5, long j6) {
        this.f10291 = j5;
        this.f10287.m11072("X-Android-Sent-Millis", Long.toString(j5));
        this.f10292 = j6;
        this.f10287.m11072("X-Android-Received-Millis", Long.toString(j6));
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m11139(f fVar) {
        Date date;
        if (fVar.f10287.m11078() == 304) {
            return true;
        }
        return (this.f10289 == null || (date = fVar.f10289) == null || date.getTime() >= this.f10289.getTime()) ? false : true;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public boolean m11140(Map<String, List<String>> map, Map<String, List<String>> map2) {
        for (String str : this.f10301) {
            if (!b.m11070(map.get(str), map2.get(str))) {
                return false;
            }
        }
        return true;
    }
}
