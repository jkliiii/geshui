package n2;

import android.net.Uri;
import android.util.Log;
import java.util.Locale;

/* compiled from: AsyncHttpRequest.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f9586;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f9587;

    /* renamed from: ʽ, reason: contains not printable characters */
    Uri f9588;

    /* renamed from: ʾ, reason: contains not printable characters */
    private s f9589;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f9590;

    /* renamed from: ˆ, reason: contains not printable characters */
    private o2.a f9591;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f9592;

    /* renamed from: ˉ, reason: contains not printable characters */
    String f9593;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f9594;

    /* renamed from: ˋ, reason: contains not printable characters */
    String f9595;

    /* renamed from: ˎ, reason: contains not printable characters */
    int f9596;

    /* renamed from: ˏ, reason: contains not printable characters */
    long f9597;

    /* compiled from: AsyncHttpRequest.java */
    class a implements a0 {
        a() {
        }

        public String toString() {
            e eVar = e.this;
            if (eVar.f9593 != null) {
                return String.format(Locale.ENGLISH, "%s %s %s", eVar.f9587, e.this.m10509(), e.this.f9586);
            }
            String m10504 = eVar.m10504();
            if (m10504 == null || m10504.length() == 0) {
                m10504 = "/";
            }
            String encodedQuery = e.this.m10509().getEncodedQuery();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                m10504 = m10504 + "?" + encodedQuery;
            }
            return String.format(Locale.ENGLISH, "%s %s %s", e.this.f9587, m10504, e.this.f9586);
        }
    }

    public e(Uri uri, String str) {
        this(uri, str, null);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    protected static String m10496() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return property;
        }
        return "Java" + System.getProperty("java.version");
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private String m10497(String str) {
        return String.format(Locale.ENGLISH, "(%d ms) %s: %s", Long.valueOf(this.f9597 != 0 ? System.currentTimeMillis() - this.f9597 : 0L), m10509(), str);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static void m10498(s sVar, Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (uri.getPort() != -1) {
                host = host + ":" + uri.getPort();
            }
            if (host != null) {
                sVar.m10557("Host", host);
            }
        }
        sVar.m10557("User-Agent", m10496());
        sVar.m10557("Accept-Encoding", "gzip, deflate");
        sVar.m10557("Connection", "keep-alive");
        sVar.m10557("Accept", "*/*");
    }

    public String toString() {
        s sVar = this.f9589;
        return sVar == null ? super.toString() : sVar.m10558(this.f9588.toString());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m10499(String str, int i5) {
        this.f9593 = str;
        this.f9594 = i5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public o2.a m10500() {
        return this.f9591;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m10501() {
        return this.f9590;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public s m10502() {
        return this.f9589;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public String m10503() {
        return this.f9587;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public String m10504() {
        return m10509().getEncodedPath();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public String m10505() {
        return this.f9593;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m10506() {
        return this.f9594;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public a0 m10507() {
        return new a();
    }

    /* renamed from: י, reason: contains not printable characters */
    public int m10508() {
        return this.f9592;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public Uri m10509() {
        return this.f9588;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m10510() {
        return true;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m10511(String str) {
        String str2 = this.f9595;
        if (str2 != null && this.f9596 <= 3) {
            Log.d(str2, m10497(str));
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m10512(String str, Exception exc) {
        String str2 = this.f9595;
        if (str2 != null && this.f9596 <= 6) {
            Log.e(str2, m10497(str));
            Log.e(this.f9595, exc.getMessage(), exc);
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m10513(String str) {
        String str2 = this.f9595;
        if (str2 != null && this.f9596 <= 4) {
            Log.i(str2, m10497(str));
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m10514(String str) {
        String str2 = this.f9595;
        if (str2 != null && this.f9596 <= 2) {
            Log.v(str2, m10497(str));
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public void m10516(o2.a aVar) {
        this.f9591 = aVar;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public e m10517(boolean z5) {
        this.f9590 = z5;
        return this;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public void m10518(String str, int i5) {
        this.f9595 = str;
        this.f9596 = i5;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public e m10519(int i5) {
        this.f9592 = i5;
        return this;
    }

    public e(Uri uri, String str, s sVar) {
        this.f9586 = "HTTP/1.1";
        this.f9589 = new s();
        this.f9590 = true;
        this.f9592 = 30000;
        this.f9594 = -1;
        this.f9587 = str;
        this.f9588 = uri;
        if (sVar == null) {
            this.f9589 = new s();
        } else {
            this.f9589 = sVar;
        }
        if (sVar == null) {
            m10498(this.f9589, uri);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m10515(k2.b bVar) {
    }
}
