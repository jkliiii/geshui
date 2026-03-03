package y0;

import android.content.Context;
import android.graphics.Typeface;
import m.g;

/* compiled from: TypefaceHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final g<String, Typeface> f12434 = new g<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Typeface m12861(Context context, String str) {
        g<String, Typeface> gVar = f12434;
        synchronized (gVar) {
            if (gVar.containsKey(str)) {
                return gVar.get(str);
            }
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", str));
                gVar.put(str, createFromAsset);
                return createFromAsset;
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }
}
