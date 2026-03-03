package s4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: TlsVersion.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public enum d0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: ʾ, reason: contains not printable characters */
    final String f10942;

    d0(String str) {
        this.f10942 = str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static d0 m11790(String str) {
        str.hashCode();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static List<d0> m11791(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m11790(str));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
