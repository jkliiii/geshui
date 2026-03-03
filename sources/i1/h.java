package i1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h implements c1.f {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final i f8483;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final URL f8484;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f8485;

    /* renamed from: ʿ, reason: contains not printable characters */
    private String f8486;

    /* renamed from: ˆ, reason: contains not printable characters */
    private URL f8487;

    /* renamed from: ˈ, reason: contains not printable characters */
    private volatile byte[] f8488;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f8489;

    public h(URL url) {
        this(url, i.f8491);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private byte[] m9156() {
        if (this.f8488 == null) {
            this.f8488 = m9159().getBytes(c1.f.f4978);
        }
        return this.f8488;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private String m9157() {
        if (TextUtils.isEmpty(this.f8486)) {
            String str = this.f8485;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) y1.k.m12893(this.f8484)).toString();
            }
            this.f8486 = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f8486;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private URL m9158() throws MalformedURLException {
        if (this.f8487 == null) {
            this.f8487 = new URL(m9157());
        }
        return this.f8487;
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m9159().equals(hVar.m9159()) && this.f8483.equals(hVar.f8483);
    }

    @Override // c1.f
    public int hashCode() {
        if (this.f8489 == 0) {
            int hashCode = m9159().hashCode();
            this.f8489 = hashCode;
            this.f8489 = (hashCode * 31) + this.f8483.hashCode();
        }
        return this.f8489;
    }

    public String toString() {
        return m9159();
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        messageDigest.update(m9156());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public String m9159() {
        String str = this.f8485;
        return str != null ? str : ((URL) y1.k.m12893(this.f8484)).toString();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Map<String, String> m9160() {
        return this.f8483.mo9162();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public URL m9161() throws MalformedURLException {
        return m9158();
    }

    public h(String str) {
        this(str, i.f8491);
    }

    public h(URL url, i iVar) {
        this.f8484 = (URL) y1.k.m12893(url);
        this.f8485 = null;
        this.f8483 = (i) y1.k.m12893(iVar);
    }

    public h(String str, i iVar) {
        this.f8484 = null;
        this.f8485 = y1.k.m12891(str);
        this.f8483 = (i) y1.k.m12893(iVar);
    }
}
