package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String f2760;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f2761;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final String f2762;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final List<List<byte[]>> f2763;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f2764 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final String f2765;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2760 = (String) androidx.core.util.h.m2583(str);
        this.f2761 = (String) androidx.core.util.h.m2583(str2);
        this.f2762 = (String) androidx.core.util.h.m2583(str3);
        this.f2763 = (List) androidx.core.util.h.m2583(list);
        this.f2765 = m2460(str, str2, str3);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private String m2460(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2760 + ", mProviderPackage: " + this.f2761 + ", mQuery: " + this.f2762 + ", mCertificates:");
        for (int i5 = 0; i5 < this.f2763.size(); i5++) {
            sb.append(" [");
            List<byte[]> list = this.f2763.get(i5);
            for (int i6 = 0; i6 < list.size(); i6++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i6), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2764);
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public List<List<byte[]>> m2461() {
        return this.f2763;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m2462() {
        return this.f2764;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    String m2463() {
        return this.f2765;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public String m2464() {
        return this.f2760;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public String m2465() {
        return this.f2761;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public String m2466() {
        return this.f2762;
    }
}
