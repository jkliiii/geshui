package n3;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: IAlibc.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface w {

    /* compiled from: IAlibc.java */
    public static class a implements Serializable {
    }

    /* compiled from: IAlibc.java */
    public static class b implements Serializable {
    }

    /* compiled from: IAlibc.java */
    public enum c {
        Auto,
        Native,
        H5
    }

    /* compiled from: IAlibc.java */
    public enum d {
        Detail,
        Shop,
        Url,
        AddCart,
        Cart,
        Order
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m10853(Activity activity, c cVar, d dVar, String str, a aVar, b bVar, HashMap<String, String> hashMap, e<Integer, String> eVar);
}
