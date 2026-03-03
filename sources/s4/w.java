package s4;

import java.io.IOException;

/* compiled from: Protocol.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f11216;

    w(String str) {
        this.f11216 = str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static w m11991(String str) throws IOException {
        w wVar = HTTP_1_0;
        if (str.equals(wVar.f11216)) {
            return wVar;
        }
        w wVar2 = HTTP_1_1;
        if (str.equals(wVar2.f11216)) {
            return wVar2;
        }
        w wVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(wVar3.f11216)) {
            return wVar3;
        }
        w wVar4 = HTTP_2;
        if (str.equals(wVar4.f11216)) {
            return wVar4;
        }
        w wVar5 = SPDY_3;
        if (str.equals(wVar5.f11216)) {
            return wVar5;
        }
        w wVar6 = QUIC;
        if (str.equals(wVar6.f11216)) {
            return wVar6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11216;
    }
}
