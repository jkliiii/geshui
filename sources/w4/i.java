package w4;

import java.net.Proxy;
import s4.s;
import s4.y;

/* compiled from: RequestLine.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m12613(y yVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.m12009());
        sb.append(' ');
        if (m12614(yVar, type)) {
            sb.append(yVar.m12011());
        } else {
            sb.append(m12615(yVar.m12011()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m12614(y yVar, Proxy.Type type) {
        return !yVar.m12008() && type == Proxy.Type.HTTP;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m12615(s sVar) {
        String m11908 = sVar.m11908();
        String m11910 = sVar.m11910();
        if (m11910 == null) {
            return m11908;
        }
        return m11908 + '?' + m11910;
    }
}
