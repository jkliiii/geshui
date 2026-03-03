package s2;

import java.util.Hashtable;
import java.util.jar.Manifest;
import m2.f;

/* compiled from: AsyncHttpServerRouter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    static Hashtable<String, String> f10863 = new Hashtable<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    static Hashtable<String, f<Manifest>> f10864 = new Hashtable<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m11712(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return null;
        }
        String str2 = f10863.get(str.substring(lastIndexOf + 1));
        if (str2 != null) {
            return str2;
        }
        return null;
    }
}
