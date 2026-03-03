package w4;

/* compiled from: HttpMethod.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m12603(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m12604(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m12605(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m12606(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
